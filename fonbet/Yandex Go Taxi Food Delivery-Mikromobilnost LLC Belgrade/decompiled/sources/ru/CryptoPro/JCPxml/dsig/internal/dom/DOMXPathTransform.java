package ru.CryptoPro.JCPxml.dsig.internal.dom;

import defpackage.kbs;
import java.security.InvalidAlgorithmParameterException;
import java.util.HashMap;
import java.util.Map;
import javax.xml.crypto.MarshalException;
import javax.xml.crypto.XMLCryptoContext;
import javax.xml.crypto.XMLStructure;
import javax.xml.crypto.dsig.spec.TransformParameterSpec;
import javax.xml.crypto.dsig.spec.XPathFilterParameterSpec;
import org.w3c.dom.Attr;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;

/* loaded from: classes4.dex */
public final class DOMXPathTransform extends ApacheTransform {
    private void unmarshalParams(Element element) {
        XPathFilterParameterSpec xPathFilterParameterSpec;
        String nodeValue = element.getFirstChild().getNodeValue();
        NamedNodeMap attributes = element.getAttributes();
        if (attributes != null) {
            int length = attributes.getLength();
            HashMap hashMap = new HashMap(length);
            for (int i = 0; i < length; i++) {
                Attr attr = (Attr) attributes.item(i);
                String prefix = attr.getPrefix();
                if (prefix != null && prefix.equals("xmlns")) {
                    hashMap.put(attr.getLocalName(), attr.getValue());
                }
            }
            xPathFilterParameterSpec = new XPathFilterParameterSpec(nodeValue, hashMap);
        } else {
            xPathFilterParameterSpec = new XPathFilterParameterSpec(nodeValue);
        }
        this.params = xPathFilterParameterSpec;
    }

    public void init(TransformParameterSpec transformParameterSpec) throws InvalidAlgorithmParameterException {
        String str;
        if (transformParameterSpec == null) {
            str = "params are required";
        } else {
            if (transformParameterSpec instanceof XPathFilterParameterSpec) {
                this.params = transformParameterSpec;
                return;
            }
            str = "params must be of type XPathFilterParameterSpec";
        }
        kbs.t(str);
    }

    @Override // ru.CryptoPro.JCPxml.dsig.internal.dom.ApacheTransform
    public void marshalParams(XMLStructure xMLStructure, XMLCryptoContext xMLCryptoContext) throws MarshalException {
        super.marshalParams(xMLStructure, xMLCryptoContext);
        XPathFilterParameterSpec parameterSpec = getParameterSpec();
        Element createElement = DOMUtils.createElement(this.ownerDoc, "XPath", "http://www.w3.org/2000/09/xmldsig#", DOMUtils.getSignaturePrefix(xMLCryptoContext));
        createElement.appendChild(this.ownerDoc.createTextNode(parameterSpec.getXPath()));
        for (Map.Entry entry : parameterSpec.getNamespaceMap().entrySet()) {
            createElement.setAttributeNS("http://www.w3.org/2000/xmlns/", "xmlns:" + ((String) entry.getKey()), (String) entry.getValue());
        }
        this.transformElem.appendChild(createElement);
    }

    @Override // ru.CryptoPro.JCPxml.dsig.internal.dom.ApacheTransform
    public void init(XMLStructure xMLStructure, XMLCryptoContext xMLCryptoContext) throws InvalidAlgorithmParameterException {
        super.init(xMLStructure, xMLCryptoContext);
        unmarshalParams(DOMUtils.getFirstChildElement(this.transformElem));
    }
}
