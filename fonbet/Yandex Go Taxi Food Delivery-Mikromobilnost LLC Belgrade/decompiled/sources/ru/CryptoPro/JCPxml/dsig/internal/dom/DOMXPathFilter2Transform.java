package ru.CryptoPro.JCPxml.dsig.internal.dom;

import defpackage.kbs;
import java.security.InvalidAlgorithmParameterException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.xml.crypto.MarshalException;
import javax.xml.crypto.XMLCryptoContext;
import javax.xml.crypto.XMLStructure;
import javax.xml.crypto.dsig.spec.TransformParameterSpec;
import javax.xml.crypto.dsig.spec.XPathFilter2ParameterSpec;
import javax.xml.crypto.dsig.spec.XPathType;
import org.w3c.dom.Attr;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;

/* loaded from: classes4.dex */
public final class DOMXPathFilter2Transform extends ApacheTransform {
    private void unmarshalParams(Element element) throws MarshalException {
        XPathType.Filter filter;
        XPathType xPathType;
        ArrayList arrayList = new ArrayList();
        while (element != null) {
            String nodeValue = element.getFirstChild().getNodeValue();
            String attributeValue = DOMUtils.getAttributeValue(element, "Filter");
            if (attributeValue == null) {
                throw new MarshalException("filter cannot be null");
            }
            if (attributeValue.equals("intersect")) {
                filter = XPathType.Filter.INTERSECT;
            } else if (attributeValue.equals("subtract")) {
                filter = XPathType.Filter.SUBTRACT;
            } else {
                if (!attributeValue.equals("union")) {
                    throw new MarshalException("Unknown XPathType filter type".concat(attributeValue));
                }
                filter = XPathType.Filter.UNION;
            }
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
                xPathType = new XPathType(nodeValue, filter, hashMap);
            } else {
                xPathType = new XPathType(nodeValue, filter);
            }
            arrayList.add(xPathType);
            element = DOMUtils.getNextSiblingElement(element);
        }
        this.params = new XPathFilter2ParameterSpec(arrayList);
    }

    @Override // ru.CryptoPro.JCPxml.dsig.internal.dom.ApacheTransform
    public void init(XMLStructure xMLStructure, XMLCryptoContext xMLCryptoContext) throws InvalidAlgorithmParameterException {
        super.init(xMLStructure, xMLCryptoContext);
        try {
            unmarshalParams(DOMUtils.getFirstChildElement(this.transformElem));
        } catch (MarshalException e) {
            throw new InvalidAlgorithmParameterException((Throwable) e);
        }
    }

    @Override // ru.CryptoPro.JCPxml.dsig.internal.dom.ApacheTransform
    public void marshalParams(XMLStructure xMLStructure, XMLCryptoContext xMLCryptoContext) throws MarshalException {
        super.marshalParams(xMLStructure, xMLCryptoContext);
        XPathFilter2ParameterSpec parameterSpec = getParameterSpec();
        String nSPrefix = DOMUtils.getNSPrefix(xMLCryptoContext, "http://www.w3.org/2002/06/xmldsig-filter2");
        String concat = (nSPrefix == null || nSPrefix.length() == 0) ? "xmlns" : "xmlns:".concat(nSPrefix);
        for (XPathType xPathType : parameterSpec.getXPathList()) {
            Element createElement = DOMUtils.createElement(this.ownerDoc, "XPath", "http://www.w3.org/2002/06/xmldsig-filter2", nSPrefix);
            createElement.appendChild(this.ownerDoc.createTextNode(xPathType.getExpression()));
            DOMUtils.setAttribute(createElement, "Filter", xPathType.getFilter().toString());
            createElement.setAttributeNS("http://www.w3.org/2000/xmlns/", concat, "http://www.w3.org/2002/06/xmldsig-filter2");
            for (Map.Entry entry : xPathType.getNamespaceMap().entrySet()) {
                createElement.setAttributeNS("http://www.w3.org/2000/xmlns/", "xmlns:" + ((String) entry.getKey()), (String) entry.getValue());
            }
            this.transformElem.appendChild(createElement);
        }
    }

    public void init(TransformParameterSpec transformParameterSpec) throws InvalidAlgorithmParameterException {
        String str;
        if (transformParameterSpec == null) {
            str = "params are required";
        } else {
            if (transformParameterSpec instanceof XPathFilter2ParameterSpec) {
                this.params = transformParameterSpec;
                return;
            }
            str = "params must be of type XPathFilter2ParameterSpec";
        }
        kbs.t(str);
    }
}
