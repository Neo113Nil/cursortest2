package ru.CryptoPro.JCPxml.dsig.internal.dom;

import defpackage.kbs;
import java.security.InvalidAlgorithmParameterException;
import java.util.ArrayList;
import java.util.List;
import javax.xml.crypto.Data;
import javax.xml.crypto.MarshalException;
import javax.xml.crypto.XMLCryptoContext;
import javax.xml.crypto.XMLStructure;
import javax.xml.crypto.dsig.TransformException;
import javax.xml.crypto.dsig.spec.C14NMethodParameterSpec;
import javax.xml.crypto.dsig.spec.ExcC14NParameterSpec;
import javax.xml.crypto.dsig.spec.TransformParameterSpec;
import org.apache.xml.security.c14n.Canonicalizer;
import org.apache.xml.security.c14n.InvalidCanonicalizerException;
import org.w3c.dom.Element;
import ru.CryptoPro.XAdES.SignatureTimeStamp;

/* loaded from: classes4.dex */
public final class DOMExcC14NMethod extends ApacheCanonicalizer {
    private void unmarshalParams(Element element) {
        String attributeNS = element.getAttributeNS(null, "PrefixList");
        this.inclusiveNamespaces = attributeNS;
        int indexOf = attributeNS.indexOf(32);
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (indexOf != -1) {
            arrayList.add(attributeNS.substring(i, indexOf));
            i = indexOf + 1;
            indexOf = attributeNS.indexOf(32, i);
        }
        if (i <= attributeNS.length()) {
            arrayList.add(attributeNS.substring(i));
        }
        this.params = new ExcC14NParameterSpec(arrayList);
    }

    public String getParamsNSURI() {
        return SignatureTimeStamp.DEFAULT_CANONICALIZATION_ALGORITHM;
    }

    @Override // ru.CryptoPro.JCPxml.dsig.internal.dom.ApacheCanonicalizer
    public void init(XMLStructure xMLStructure, XMLCryptoContext xMLCryptoContext) throws InvalidAlgorithmParameterException {
        super.init(xMLStructure, xMLCryptoContext);
        Element firstChildElement = DOMUtils.getFirstChildElement(this.transformElem);
        if (firstChildElement != null) {
            unmarshalParams(firstChildElement);
        } else {
            this.params = null;
            this.inclusiveNamespaces = null;
        }
    }

    @Override // ru.CryptoPro.JCPxml.dsig.internal.dom.ApacheCanonicalizer
    public void marshalParams(XMLStructure xMLStructure, XMLCryptoContext xMLCryptoContext) throws MarshalException {
        super.marshalParams(xMLStructure, xMLCryptoContext);
        ExcC14NParameterSpec parameterSpec = getParameterSpec();
        if (parameterSpec == null) {
            return;
        }
        String nSPrefix = DOMUtils.getNSPrefix(xMLCryptoContext, SignatureTimeStamp.DEFAULT_CANONICALIZATION_ALGORITHM);
        Element createElement = DOMUtils.createElement(this.ownerDoc, "InclusiveNamespaces", SignatureTimeStamp.DEFAULT_CANONICALIZATION_ALGORITHM, nSPrefix);
        createElement.setAttributeNS("http://www.w3.org/2000/xmlns/", (nSPrefix == null || nSPrefix.length() == 0) ? "xmlns" : "xmlns:".concat(nSPrefix), SignatureTimeStamp.DEFAULT_CANONICALIZATION_ALGORITHM);
        StringBuffer stringBuffer = new StringBuffer("");
        List prefixList = parameterSpec.getPrefixList();
        int size = prefixList.size();
        for (int i = 0; i < size; i++) {
            stringBuffer.append((String) prefixList.get(i));
            if (i < size - 1) {
                stringBuffer.append(" ");
            }
        }
        DOMUtils.setAttribute(createElement, "PrefixList", stringBuffer.toString());
        this.inclusiveNamespaces = stringBuffer.toString();
        this.transformElem.appendChild(createElement);
    }

    public Data transform(Data data, XMLCryptoContext xMLCryptoContext) throws TransformException {
        if ((data instanceof DOMSubTreeData) && ((DOMSubTreeData) data).excludeComments()) {
            try {
                this.apacheCanonicalizer = Canonicalizer.getInstance(SignatureTimeStamp.DEFAULT_CANONICALIZATION_ALGORITHM);
            } catch (InvalidCanonicalizerException e) {
                throw new TransformException("Couldn't find Canonicalizer for: http://www.w3.org/2001/10/xml-exc-c14n#: " + e.getMessage(), e);
            }
        }
        return canonicalize(data, xMLCryptoContext);
    }

    public void init(TransformParameterSpec transformParameterSpec) throws InvalidAlgorithmParameterException {
        if (transformParameterSpec != null) {
            if (transformParameterSpec instanceof ExcC14NParameterSpec) {
                this.params = (C14NMethodParameterSpec) transformParameterSpec;
            } else {
                kbs.t("params must be of type ExcC14NParameterSpec");
            }
        }
    }
}
