package ru.CryptoPro.JCPxml.dsig.internal.dom;

import defpackage.ly3;
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
import javax.xml.crypto.dsig.XMLObject;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import ru.CryptoPro.XAdES.cl_63;

/* loaded from: classes4.dex */
public final class DOMXMLObject extends DOMStructure implements XMLObject {
    private final List content;
    private final String encoding;
    private final String id;
    private final String mimeType;
    private Element objectElem;

    public DOMXMLObject(Element element, XMLCryptoContext xMLCryptoContext, Provider provider) throws MarshalException {
        DOMStructure dOMX509Data;
        this.encoding = DOMUtils.getAttributeValue(element, cl_63.w);
        Attr attributeNodeNS = element.getAttributeNodeNS(null, "Id");
        if (attributeNodeNS != null) {
            this.id = attributeNodeNS.getValue();
            element.setIdAttributeNode(attributeNodeNS, true);
        } else {
            this.id = null;
        }
        this.mimeType = DOMUtils.getAttributeValue(element, cl_63.v);
        NodeList childNodes = element.getChildNodes();
        int length = childNodes.getLength();
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            Node item = childNodes.item(i);
            if (item.getNodeType() == 1) {
                Element element2 = (Element) item;
                String localName = element2.getLocalName();
                if (localName.equals("Manifest")) {
                    dOMX509Data = new DOMManifest(element2, xMLCryptoContext, provider);
                } else if (localName.equals("SignatureProperties")) {
                    dOMX509Data = new DOMSignatureProperties(element2, xMLCryptoContext);
                } else if (localName.equals("X509Data")) {
                    dOMX509Data = new DOMX509Data(element2);
                }
                arrayList.add(dOMX509Data);
            }
            arrayList.add(new javax.xml.crypto.dom.DOMStructure(item));
        }
        this.content = arrayList.isEmpty() ? Collections.EMPTY_LIST : Collections.unmodifiableList(arrayList);
        this.objectElem = element;
    }

    private boolean equalsContent(List list) {
        if (this.content.size() != list.size()) {
            return false;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            javax.xml.crypto.dom.DOMStructure dOMStructure = (XMLStructure) list.get(i);
            javax.xml.crypto.dom.DOMStructure dOMStructure2 = (XMLStructure) this.content.get(i);
            if (dOMStructure instanceof javax.xml.crypto.dom.DOMStructure) {
                if (!(dOMStructure2 instanceof javax.xml.crypto.dom.DOMStructure)) {
                    return false;
                }
                if (!DOMUtils.nodesEqual(dOMStructure2.getNode(), dOMStructure.getNode())) {
                    return false;
                }
            } else if (!dOMStructure2.equals(dOMStructure)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof XMLObject)) {
            return false;
        }
        XMLObject xMLObject = (XMLObject) obj;
        String str = this.id;
        boolean equals = str == null ? xMLObject.getId() == null : str.equals(xMLObject.getId());
        String str2 = this.encoding;
        boolean equals2 = str2 == null ? xMLObject.getEncoding() == null : str2.equals(xMLObject.getEncoding());
        String str3 = this.mimeType;
        return equals && equals2 && (str3 == null ? xMLObject.getMimeType() == null : str3.equals(xMLObject.getMimeType())) && equalsContent(xMLObject.getContent());
    }

    public List getContent() {
        return this.content;
    }

    public String getEncoding() {
        return this.encoding;
    }

    public String getId() {
        return this.id;
    }

    public String getMimeType() {
        return this.mimeType;
    }

    @Override // ru.CryptoPro.JCPxml.dsig.internal.dom.DOMStructure
    public void marshal(Node node, String str, DOMCryptoContext dOMCryptoContext) throws MarshalException {
        Document ownerDocument = DOMUtils.getOwnerDocument(node);
        Element element = this.objectElem;
        if (element == null) {
            element = null;
        }
        if (element == null) {
            element = DOMUtils.createElement(ownerDocument, cl_63.e, "http://www.w3.org/2000/09/xmldsig#", str);
            DOMUtils.setAttributeID(element, "Id", this.id);
            DOMUtils.setAttribute(element, cl_63.v, this.mimeType);
            DOMUtils.setAttribute(element, cl_63.w, this.encoding);
            for (javax.xml.crypto.dom.DOMStructure dOMStructure : this.content) {
                if (dOMStructure instanceof DOMStructure) {
                    ((DOMStructure) dOMStructure).marshal(element, str, dOMCryptoContext);
                } else {
                    DOMUtils.appendChild(element, dOMStructure.getNode());
                }
            }
        }
        node.appendChild(element);
    }

    public DOMXMLObject(List list, String str, String str2, String str3) {
        if (list == null || list.isEmpty()) {
            this.content = Collections.EMPTY_LIST;
        } else {
            List w = ly3.w(list);
            this.content = w;
            int size = w.size();
            for (int i = 0; i < size; i++) {
                if (!(this.content.get(i) instanceof XMLStructure)) {
                    xfo.h(oyr.j(i, "content[", "] is not a valid type"));
                    throw null;
                }
            }
        }
        this.id = str;
        this.mimeType = str2;
        this.encoding = str3;
    }
}
