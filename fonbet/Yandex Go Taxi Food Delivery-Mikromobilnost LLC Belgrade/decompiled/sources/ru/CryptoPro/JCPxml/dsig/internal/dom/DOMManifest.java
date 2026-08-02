package ru.CryptoPro.JCPxml.dsig.internal.dom;

import defpackage.ly3;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.xfo;
import java.security.Provider;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import javax.xml.crypto.MarshalException;
import javax.xml.crypto.XMLCryptoContext;
import javax.xml.crypto.dom.DOMCryptoContext;
import javax.xml.crypto.dsig.Manifest;
import javax.xml.crypto.dsig.Reference;
import org.w3c.dom.Attr;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

/* loaded from: classes4.dex */
public final class DOMManifest extends DOMStructure implements Manifest {
    private final String id;
    private final List references;

    public DOMManifest(Element element, XMLCryptoContext xMLCryptoContext, Provider provider) throws MarshalException {
        Attr attributeNodeNS = element.getAttributeNodeNS(null, "Id");
        if (attributeNodeNS != null) {
            this.id = attributeNodeNS.getValue();
            element.setIdAttributeNode(attributeNodeNS, true);
        } else {
            this.id = null;
        }
        Boolean bool = (Boolean) xMLCryptoContext.getProperty("org.apache.jcp.xml.dsig.secureValidation");
        int i = 0;
        boolean z = bool != null && bool.booleanValue();
        Element firstChildElement = DOMUtils.getFirstChildElement(element);
        ArrayList arrayList = new ArrayList();
        while (firstChildElement != null) {
            arrayList.add(new DOMReference(firstChildElement, xMLCryptoContext, provider));
            firstChildElement = DOMUtils.getNextSiblingElement(firstChildElement);
            i++;
            if (z && i > 30) {
                throw new MarshalException("A maxiumum of 30 references per Manifest are allowed with secure validation");
            }
        }
        this.references = Collections.unmodifiableList(arrayList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Manifest)) {
            return false;
        }
        Manifest manifest = (Manifest) obj;
        String str = this.id;
        return (str == null ? manifest.getId() == null : str.equals(manifest.getId())) && this.references.equals(manifest.getReferences());
    }

    public String getId() {
        return this.id;
    }

    public List getReferences() {
        return this.references;
    }

    @Override // ru.CryptoPro.JCPxml.dsig.internal.dom.DOMStructure
    public void marshal(Node node, String str, DOMCryptoContext dOMCryptoContext) throws MarshalException {
        Element createElement = DOMUtils.createElement(DOMUtils.getOwnerDocument(node), "Manifest", "http://www.w3.org/2000/09/xmldsig#", str);
        DOMUtils.setAttributeID(createElement, "Id", this.id);
        Iterator it = this.references.iterator();
        while (it.hasNext()) {
            ((DOMReference) ((Reference) it.next())).marshal(createElement, str, dOMCryptoContext);
        }
        node.appendChild(createElement);
    }

    public DOMManifest(List list, String str) {
        if (list == null) {
            ny61.t("references cannot be null");
            throw null;
        }
        List w = ly3.w(list);
        this.references = w;
        if (w.isEmpty()) {
            ny61.g("list of references must contain at least one entry");
            throw null;
        }
        int size = w.size();
        for (int i = 0; i < size; i++) {
            if (!(this.references.get(i) instanceof Reference)) {
                xfo.h(oyr.j(i, "references[", "] is not a valid type"));
                throw null;
            }
        }
        this.id = str;
    }
}
