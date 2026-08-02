package ru.CryptoPro.JCPxml.dsig.internal.dom;

import defpackage.ly3;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.xfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import javax.xml.crypto.MarshalException;
import javax.xml.crypto.XMLCryptoContext;
import javax.xml.crypto.dom.DOMCryptoContext;
import javax.xml.crypto.dsig.SignatureProperties;
import javax.xml.crypto.dsig.SignatureProperty;
import org.w3c.dom.Attr;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/* loaded from: classes4.dex */
public final class DOMSignatureProperties extends DOMStructure implements SignatureProperties {
    private final String id;
    private final List properties;

    public DOMSignatureProperties(Element element, XMLCryptoContext xMLCryptoContext) throws MarshalException {
        Attr attributeNodeNS = element.getAttributeNodeNS(null, "Id");
        if (attributeNodeNS != null) {
            this.id = attributeNodeNS.getValue();
            element.setIdAttributeNode(attributeNodeNS, true);
        } else {
            this.id = null;
        }
        NodeList childNodes = element.getChildNodes();
        int length = childNodes.getLength();
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            Node item = childNodes.item(i);
            if (item.getNodeType() == 1) {
                arrayList.add(new DOMSignatureProperty((Element) item, xMLCryptoContext));
            }
        }
        if (arrayList.isEmpty()) {
            throw new MarshalException("properties cannot be empty");
        }
        this.properties = Collections.unmodifiableList(arrayList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SignatureProperties)) {
            return false;
        }
        SignatureProperties signatureProperties = (SignatureProperties) obj;
        String str = this.id;
        return this.properties.equals(signatureProperties.getProperties()) && (str == null ? signatureProperties.getId() == null : str.equals(signatureProperties.getId()));
    }

    public String getId() {
        return this.id;
    }

    public List getProperties() {
        return this.properties;
    }

    @Override // ru.CryptoPro.JCPxml.dsig.internal.dom.DOMStructure
    public void marshal(Node node, String str, DOMCryptoContext dOMCryptoContext) throws MarshalException {
        Element createElement = DOMUtils.createElement(DOMUtils.getOwnerDocument(node), "SignatureProperties", "http://www.w3.org/2000/09/xmldsig#", str);
        DOMUtils.setAttributeID(createElement, "Id", this.id);
        Iterator it = this.properties.iterator();
        while (it.hasNext()) {
            ((DOMSignatureProperty) ((SignatureProperty) it.next())).marshal(createElement, str, dOMCryptoContext);
        }
        node.appendChild(createElement);
    }

    public DOMSignatureProperties(List list, String str) {
        if (list == null) {
            ny61.t("properties cannot be null");
            throw null;
        }
        if (list.isEmpty()) {
            ny61.g("properties cannot be empty");
            throw null;
        }
        List w = ly3.w(list);
        this.properties = w;
        int size = w.size();
        for (int i = 0; i < size; i++) {
            if (!(this.properties.get(i) instanceof SignatureProperty)) {
                xfo.h(oyr.j(i, "properties[", "] is not a valid type"));
                throw null;
            }
        }
        this.id = str;
    }
}
