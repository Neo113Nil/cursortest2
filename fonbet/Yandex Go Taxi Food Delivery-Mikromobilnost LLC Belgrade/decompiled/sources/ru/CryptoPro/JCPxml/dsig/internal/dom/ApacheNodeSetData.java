package ru.CryptoPro.JCPxml.dsig.internal.dom;

import defpackage.ny61;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.xml.crypto.NodeSetData;
import org.apache.xml.security.signature.NodeFilter;
import org.apache.xml.security.signature.XMLSignatureInput;
import org.apache.xml.security.utils.XMLUtils;
import org.w3c.dom.Node;

/* loaded from: classes4.dex */
public class ApacheNodeSetData implements NodeSetData, ApacheData {
    private XMLSignatureInput xi;

    public ApacheNodeSetData(XMLSignatureInput xMLSignatureInput) {
        this.xi = xMLSignatureInput;
    }

    private Set getNodeSet(List list) {
        if (this.xi.isNeedsToBeExpanded()) {
            XMLUtils.circumventBug2650(XMLUtils.getOwnerDocument(this.xi.getSubNode()));
        }
        LinkedHashSet<Node> linkedHashSet = new LinkedHashSet();
        XMLUtils.getSet(this.xi.getSubNode(), linkedHashSet, (Node) null, !this.xi.isExcludeComments());
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        for (Node node : linkedHashSet) {
            Iterator it = list.iterator();
            boolean z = false;
            while (it.hasNext() && !z) {
                if (((NodeFilter) it.next()).isNodeInclude(node) != 1) {
                    z = true;
                }
            }
            if (!z) {
                linkedHashSet2.add(node);
            }
        }
        return linkedHashSet2;
    }

    @Override // ru.CryptoPro.JCPxml.dsig.internal.dom.ApacheData
    public XMLSignatureInput getXMLSignatureInput() {
        return this.xi;
    }

    public Iterator iterator() {
        List nodeFilters = this.xi.getNodeFilters();
        XMLSignatureInput xMLSignatureInput = this.xi;
        if (nodeFilters != null) {
            return Collections.unmodifiableSet(getNodeSet(xMLSignatureInput.getNodeFilters())).iterator();
        }
        try {
            return Collections.unmodifiableSet(xMLSignatureInput.getNodeSet()).iterator();
        } catch (Exception e) {
            ny61.n("unrecoverable error retrieving nodeset", e);
            return null;
        }
    }
}
