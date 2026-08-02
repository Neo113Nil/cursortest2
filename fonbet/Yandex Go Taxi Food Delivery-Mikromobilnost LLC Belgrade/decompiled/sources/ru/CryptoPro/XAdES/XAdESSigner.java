package ru.CryptoPro.XAdES;

import defpackage.oyr;
import java.util.List;
import java.util.Set;
import javax.xml.crypto.dsig.XMLSignatureFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import ru.CryptoPro.AdES.exception.IAdESException;
import ru.CryptoPro.AdES.external.signature.AdESSigner;
import ru.CryptoPro.JCP.tools.JCPLogger;
import ru.CryptoPro.JCPxml.dsig.internal.dom.XMLDSigRI;
import ru.CryptoPro.XAdES.exception.XAdESException;
import ru.CryptoPro.XAdES.interfaces.external.IXAdESSigner;
import ru.CryptoPro.XAdES.util.XMLUtils;

/* loaded from: classes4.dex */
public abstract class XAdESSigner extends AdESSigner implements XAdESParameters, IXAdESSigner {
    public XMLSignatureFactory a;
    public Document b;
    public Element c;
    public Element w;
    public String x;

    public final void a(String str) {
        JCPLogger.subEnter();
        JCPLogger.fine("Updating signer info id: ", str);
        List<Element> childElementsByTagNameNS = XMLUtils.getChildElementsByTagNameNS(this.c, XAdESSignature.ELEMENT_SIGNATURE, "http://www.w3.org/2000/09/xmldsig#");
        if (childElementsByTagNameNS.isEmpty()) {
            throw new XAdESException("Signature node(s) not found", IAdESException.ecNodeNotFound);
        }
        for (Element element : childElementsByTagNameNS) {
            if (element.hasAttribute("Id") && element.getAttribute("Id").equals(str)) {
                this.x = str;
                this.c = element;
                this.b = element.getOwnerDocument();
                this.w = XMLUtils.getChildElementByTagNameNS(element, "SignatureValue", "http://www.w3.org/2000/09/xmldsig#");
                JCPLogger.subExit();
                return;
            }
        }
        throw new XAdESException(oyr.p("Signature node with Id ", str, " not found"), IAdESException.ecNodeNotFound);
    }

    public final void b(Set set) {
        this.signatureCertificates.addAll(set);
    }

    public final void c(Set set) {
        this.signatureCRLs.addAll(set);
    }

    public final XMLSignatureFactory d() {
        if (this.a == null) {
            this.a = XMLSignatureFactory.getInstance("DOM", XMLDSigRI.PROVIDER_NAME);
        }
        return this.a;
    }

    @Override // ru.CryptoPro.XAdES.interfaces.external.IXAdESSigner
    public abstract /* synthetic */ XAdESSigner enhance(String str, String str2, List list, String str3, Integer num) throws XAdESException;

    @Override // ru.CryptoPro.XAdES.interfaces.external.IXAdESSigner
    public abstract /* synthetic */ XAdESSigner enhance(String str, String str2, List list, Set set, String str3, Integer num) throws XAdESException;

    @Override // ru.CryptoPro.AdES.external.signature.AdESSigner, ru.CryptoPro.AdES.external.interfaces.IAdESSigner, ru.CryptoPro.CAdES.interfaces.external.ICAdESSigner, ru.CryptoPro.CAdES.CAdESSignerBES
    public Integer getSignatureType() {
        return XAdESParameters.XML_DSIG;
    }

    @Override // ru.CryptoPro.XAdES.interfaces.external.IXAdESSigner
    public Element getSignatureValue() {
        return this.w;
    }

    @Override // ru.CryptoPro.XAdES.interfaces.external.IXAdESSigner
    public Element getSignerInfo() {
        return this.c;
    }

    @Override // ru.CryptoPro.AdES.external.signature.AdESSigner, ru.CryptoPro.AdES.external.interfaces.IAdESSigner, ru.CryptoPro.CAdES.interfaces.external.ICAdESSigner, ru.CryptoPro.CAdES.CAdESSignerBES, ru.CryptoPro.CAdES.CAdESSignerT, ru.CryptoPro.CAdES.CAdESSignerXLT1
    public abstract /* synthetic */ void verify(Set set, Set set2) throws XAdESException;

    @Override // ru.CryptoPro.AdES.external.signature.AdESSigner, ru.CryptoPro.AdES.external.interfaces.IAdESSigner
    public abstract /* synthetic */ void verify(Set set, Set set2, Integer num, boolean z) throws XAdESException;
}
