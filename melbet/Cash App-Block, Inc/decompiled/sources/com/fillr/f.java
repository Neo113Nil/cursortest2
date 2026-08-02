package com.fillr;

import java.util.ArrayList;
import org.w3c.dom.DocumentFragment;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/* loaded from: classes4.dex */
public final class f implements NodeList {
    public final ArrayList a = new ArrayList();
    public final DocumentFragment b;

    public f(Element element) {
        this.b = element.getOwnerDocument().createDocumentFragment();
        for (Node firstChild = element.getFirstChild(); firstChild != null; firstChild = firstChild.getNextSibling()) {
            this.a.add(this.b.appendChild(firstChild.cloneNode(true)));
        }
    }

    @Override // org.w3c.dom.NodeList
    public final int getLength() {
        return this.a.size();
    }

    @Override // org.w3c.dom.NodeList
    public final Node item(int i) {
        ArrayList arrayList = this.a;
        if (arrayList == null) {
            return null;
        }
        return (Node) arrayList.get(i);
    }
}
