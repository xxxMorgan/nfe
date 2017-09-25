package com.fincatto.documentofiscal.cte300.classes.nota;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

import com.fincatto.documentofiscal.DFBase;
import com.fincatto.documentofiscal.cte300.validadores.StringValidador;

/**
 * @author Caio
 * @info Tomador é contribuinte do ICMS, mas não é emitente de documento fiscal eletrônico
 * */

@Root(name = "tomaICMS")
@Namespace(reference = "http://www.portalfiscal.inf.br/cte")
public class CTeNotaInfoCTeNormalInfoCTeSubstituicaoTomadorICMS extends DFBase {

	@Element(name = "refNFe", required = false)
    private String referenciaNFe;
	
	@Element(name = "refNF", required = false)
    private CTeNotaInfoCTeNormalInfoCTeSubstituicaoTomadorICMSRefernciaNF referenciaNF;
	
	@Element(name = "refCte", required = false)
    private String referenciaCte;

	public CTeNotaInfoCTeNormalInfoCTeSubstituicaoTomadorICMS() {
		this.referenciaNFe = null;
		this.referenciaNF = null;
		this.referenciaCte = null;
	}

	public String getReferenciaNFe() {
		return referenciaNFe;
	}

	/**
	 * Chave de acesso da NF-e emitida pelo Tomador
	 * */
	public void setReferenciaNFe(String referenciaNFe) {
		StringValidador.exatamente44N(referenciaNFe, "Chave de acesso da NF-e emitida pelo Tomador");
		this.referenciaNFe = referenciaNFe;
	}

	public CTeNotaInfoCTeNormalInfoCTeSubstituicaoTomadorICMSRefernciaNF getReferenciaNF() {
		return referenciaNF;
	}

	/**
	 * Informação da NF ou CT emitido pelo Tomador
	 * */
	public void setReferenciaNF(CTeNotaInfoCTeNormalInfoCTeSubstituicaoTomadorICMSRefernciaNF referenciaNF) {
		this.referenciaNF = referenciaNF;
	}

	public String getReferenciaCte() {
		return referenciaCte;
	}

	/**
	 * Chave de acesso do CT-e emitido pelo Tomador
	 * */
	public void setReferenciaCte(String referenciaCte) {
		StringValidador.exatamente44N(referenciaCte, "Chave de acesso do CT-e emitido pelo Tomador");
		this.referenciaCte = referenciaCte;
	}
}
