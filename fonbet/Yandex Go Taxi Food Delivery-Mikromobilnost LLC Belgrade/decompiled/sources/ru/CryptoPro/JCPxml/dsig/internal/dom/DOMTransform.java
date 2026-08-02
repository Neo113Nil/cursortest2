package ru.CryptoPro.JCPxml.dsig.internal.dom;

import java.io.OutputStream;
import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.spec.AlgorithmParameterSpec;
import javax.xml.crypto.Data;
import javax.xml.crypto.MarshalException;
import javax.xml.crypto.XMLCryptoContext;
import javax.xml.crypto.dom.DOMCryptoContext;
import javax.xml.crypto.dsig.Transform;
import javax.xml.crypto.dsig.TransformException;
import javax.xml.crypto.dsig.TransformService;
import javax.xml.crypto.dsig.dom.DOMSignContext;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

/* loaded from: classes4.dex */
public class DOMTransform extends DOMStructure implements Transform {
    protected TransformService spi;

    public DOMTransform(Element element, XMLCryptoContext xMLCryptoContext, Provider provider) throws MarshalException {
        String attributeValue = DOMUtils.getAttributeValue(element, "Algorithm");
        if (provider == null) {
            try {
                this.spi = TransformService.getInstance(attributeValue, "DOM");
            } catch (NoSuchAlgorithmException e) {
                throw new MarshalException(e);
            }
        } else {
            try {
                try {
                    this.spi = TransformService.getInstance(attributeValue, "DOM", provider);
                } catch (NoSuchAlgorithmException unused) {
                    this.spi = TransformService.getInstance(attributeValue, "DOM");
                }
            } catch (NoSuchAlgorithmException e2) {
                throw new MarshalException(e2);
            }
        }
        try {
            this.spi.init(new javax.xml.crypto.dom.DOMStructure(element), xMLCryptoContext);
        } catch (InvalidAlgorithmParameterException e3) {
            throw new MarshalException(e3);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Transform)) {
            return false;
        }
        Transform transform = (Transform) obj;
        return getAlgorithm().equals(transform.getAlgorithm()) && DOMUtils.paramsEqual(getParameterSpec(), transform.getParameterSpec());
    }

    public final String getAlgorithm() {
        return this.spi.getAlgorithm();
    }

    public final AlgorithmParameterSpec getParameterSpec() {
        return this.spi.getParameterSpec();
    }

    @Override // ru.CryptoPro.JCPxml.dsig.internal.dom.DOMStructure
    public void marshal(Node node, String str, DOMCryptoContext dOMCryptoContext) throws MarshalException {
        Element createElement = DOMUtils.createElement(DOMUtils.getOwnerDocument(node), node.getLocalName().equals("Transforms") ? "Transform" : "CanonicalizationMethod", "http://www.w3.org/2000/09/xmldsig#", str);
        DOMUtils.setAttribute(createElement, "Algorithm", getAlgorithm());
        this.spi.marshalParams(new javax.xml.crypto.dom.DOMStructure(createElement), dOMCryptoContext);
        node.appendChild(createElement);
    }

    public Data transform(Data data, XMLCryptoContext xMLCryptoContext, DOMSignContext dOMSignContext) throws MarshalException, TransformException {
        marshal(dOMSignContext.getParent(), DOMUtils.getSignaturePrefix(dOMSignContext), dOMSignContext);
        return transform(data, xMLCryptoContext);
    }

    public Data transform(Data data, XMLCryptoContext xMLCryptoContext, OutputStream outputStream) throws TransformException {
        return this.spi.transform(data, xMLCryptoContext, outputStream);
    }

    public Data transform(Data data, XMLCryptoContext xMLCryptoContext) throws TransformException {
        return this.spi.transform(data, xMLCryptoContext);
    }

    public DOMTransform(TransformService transformService) {
        this.spi = transformService;
    }
}
