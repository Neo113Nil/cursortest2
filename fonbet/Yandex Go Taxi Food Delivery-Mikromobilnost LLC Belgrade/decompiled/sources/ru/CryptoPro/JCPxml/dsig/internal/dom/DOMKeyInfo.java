package ru.CryptoPro.JCPxml.dsig.internal.dom;

import defpackage.ly3;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.xfo;
import java.security.Provider;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.xml.crypto.MarshalException;
import javax.xml.crypto.XMLCryptoContext;
import javax.xml.crypto.XMLStructure;
import javax.xml.crypto.dom.DOMCryptoContext;
import javax.xml.crypto.dsig.keyinfo.KeyInfo;
import org.w3c.dom.Attr;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/* loaded from: classes4.dex */
public final class DOMKeyInfo extends DOMStructure implements KeyInfo {
    private final String id;
    private final List keyInfoTypes;

    public DOMKeyInfo(Element element, XMLCryptoContext xMLCryptoContext, Provider provider) throws MarshalException {
        javax.xml.crypto.dom.DOMStructure dOMRetrievalMethod;
        Attr attributeNodeNS = element.getAttributeNodeNS(null, "Id");
        if (attributeNodeNS != null) {
            this.id = attributeNodeNS.getValue();
            element.setIdAttributeNode(attributeNodeNS, true);
        } else {
            this.id = null;
        }
        NodeList childNodes = element.getChildNodes();
        int length = childNodes.getLength();
        if (length < 1) {
            throw new MarshalException("KeyInfo must contain at least one type");
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            Node item = childNodes.item(i);
            if (item.getNodeType() == 1) {
                Element element2 = (Element) item;
                String localName = element2.getLocalName();
                if (localName.equals("X509Data")) {
                    dOMRetrievalMethod = new DOMX509Data(element2);
                } else if (localName.equals("KeyName")) {
                    dOMRetrievalMethod = new DOMKeyName(element2);
                } else if (localName.equals("KeyValue")) {
                    arrayList.add(DOMKeyValue.unmarshal(element2, xMLCryptoContext));
                } else {
                    dOMRetrievalMethod = localName.equals("RetrievalMethod") ? new DOMRetrievalMethod(element2, xMLCryptoContext, provider) : localName.equals("PGPData") ? new DOMPGPData(element2) : new javax.xml.crypto.dom.DOMStructure(element2);
                }
                arrayList.add(dOMRetrievalMethod);
            }
        }
        this.keyInfoTypes = Collections.unmodifiableList(arrayList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeyInfo)) {
            return false;
        }
        KeyInfo keyInfo = (KeyInfo) obj;
        String str = this.id;
        return this.keyInfoTypes.equals(keyInfo.getContent()) && (str == null ? keyInfo.getId() == null : str.equals(keyInfo.getId()));
    }

    public List getContent() {
        return this.keyInfoTypes;
    }

    public String getId() {
        return this.id;
    }

    public void marshal(XMLStructure xMLStructure, XMLCryptoContext xMLCryptoContext) throws MarshalException {
        if (xMLStructure == null) {
            ny61.t("parent is null");
            return;
        }
        Node node = ((javax.xml.crypto.dom.DOMStructure) xMLStructure).getNode();
        String signaturePrefix = DOMUtils.getSignaturePrefix(xMLCryptoContext);
        Element createElement = DOMUtils.createElement(DOMUtils.getOwnerDocument(node), "KeyInfo", "http://www.w3.org/2000/09/xmldsig#", signaturePrefix);
        createElement.setAttributeNS("http://www.w3.org/2000/xmlns/", (signaturePrefix == null || signaturePrefix.length() == 0) ? "xmlns" : "xmlns:".concat(signaturePrefix), "http://www.w3.org/2000/09/xmldsig#");
        marshal(node, createElement, null, signaturePrefix, (DOMCryptoContext) xMLCryptoContext);
    }

    @Override // ru.CryptoPro.JCPxml.dsig.internal.dom.DOMStructure
    public void marshal(Node node, String str, DOMCryptoContext dOMCryptoContext) throws MarshalException {
        marshal(node, null, str, dOMCryptoContext);
    }

    private void marshal(Node node, Element element, Node node2, String str, DOMCryptoContext dOMCryptoContext) throws MarshalException {
        for (javax.xml.crypto.dom.DOMStructure dOMStructure : this.keyInfoTypes) {
            if (dOMStructure instanceof DOMStructure) {
                ((DOMStructure) dOMStructure).marshal(element, str, dOMCryptoContext);
            } else {
                DOMUtils.appendChild(element, dOMStructure.getNode());
            }
        }
        DOMUtils.setAttributeID(element, "Id", this.id);
        node.insertBefore(element, node2);
    }

    public void marshal(Node node, Node node2, String str, DOMCryptoContext dOMCryptoContext) throws MarshalException {
        marshal(node, DOMUtils.createElement(DOMUtils.getOwnerDocument(node), "KeyInfo", "http://www.w3.org/2000/09/xmldsig#", str), node2, str, dOMCryptoContext);
    }

    public DOMKeyInfo(List list, String str) {
        if (list == null) {
            ny61.t("content cannot be null");
            throw null;
        }
        List w = ly3.w(list);
        this.keyInfoTypes = w;
        if (w.isEmpty()) {
            ny61.g("content cannot be empty");
            throw null;
        }
        int size = w.size();
        for (int i = 0; i < size; i++) {
            if (!(this.keyInfoTypes.get(i) instanceof XMLStructure)) {
                xfo.h(oyr.j(i, "content[", "] is not a valid KeyInfo type"));
                throw null;
            }
        }
        this.id = str;
    }
}
