package ru.CryptoPro.JCPxml.dsig.internal.dom;

import defpackage.kbs;
import java.security.InvalidAlgorithmParameterException;
import javax.xml.crypto.MarshalException;
import javax.xml.crypto.XMLCryptoContext;
import javax.xml.crypto.XMLStructure;
import javax.xml.crypto.dsig.spec.TransformParameterSpec;
import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import org.w3c.dom.Element;

/* loaded from: classes4.dex */
public final class DOMXSLTTransform extends ApacheTransform {
    private void unmarshalParams(Element element) {
        this.params = new XSLTTransformParameterSpec(new javax.xml.crypto.dom.DOMStructure(element));
    }

    public void init(TransformParameterSpec transformParameterSpec) throws InvalidAlgorithmParameterException {
        String str;
        if (transformParameterSpec == null) {
            str = "params are required";
        } else {
            if (transformParameterSpec instanceof XSLTTransformParameterSpec) {
                this.params = transformParameterSpec;
                return;
            }
            str = "unrecognized params";
        }
        kbs.t(str);
    }

    @Override // ru.CryptoPro.JCPxml.dsig.internal.dom.ApacheTransform
    public void marshalParams(XMLStructure xMLStructure, XMLCryptoContext xMLCryptoContext) throws MarshalException {
        super.marshalParams(xMLStructure, xMLCryptoContext);
        DOMUtils.appendChild(this.transformElem, getParameterSpec().getStylesheet().getNode());
    }

    @Override // ru.CryptoPro.JCPxml.dsig.internal.dom.ApacheTransform
    public void init(XMLStructure xMLStructure, XMLCryptoContext xMLCryptoContext) throws InvalidAlgorithmParameterException {
        super.init(xMLStructure, xMLCryptoContext);
        unmarshalParams(DOMUtils.getFirstChildElement(this.transformElem));
    }
}
