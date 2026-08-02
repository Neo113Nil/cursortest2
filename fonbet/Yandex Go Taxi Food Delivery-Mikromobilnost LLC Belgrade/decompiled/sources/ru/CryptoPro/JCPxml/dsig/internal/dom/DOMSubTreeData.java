package ru.CryptoPro.JCPxml.dsig.internal.dom;

import defpackage.ny61;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import javax.xml.crypto.NodeSetData;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;

/* loaded from: classes4.dex */
public class DOMSubTreeData implements NodeSetData {
    private boolean excludeComments;
    private Node root;

    class DelayedNodeIterator implements Iterator {
        private ListIterator li;
        private List nodeSet;
        private Node root;
        private boolean withComments;

        public DelayedNodeIterator(Node node, boolean z) {
            this.root = node;
            this.withComments = !z;
        }

        private List dereferenceSameDocumentURI(Node node) {
            ArrayList arrayList = new ArrayList();
            if (node != null) {
                nodeSetMinusCommentNodes(node, arrayList, null);
            }
            return arrayList;
        }

        private void nodeSetMinusCommentNodes(Node node, List list, Node node2) {
            short nodeType = node.getNodeType();
            if (nodeType != 1) {
                if (nodeType == 3 || nodeType == 4) {
                    if (node2 != null && (node2.getNodeType() == 3 || node2.getNodeType() == 4)) {
                        return;
                    }
                } else if (nodeType != 7) {
                    if (nodeType == 8) {
                        if (this.withComments) {
                            list.add(node);
                            return;
                        }
                        return;
                    } else if (nodeType != 9) {
                        return;
                    }
                }
                list.add(node);
                return;
            }
            NamedNodeMap attributes = node.getAttributes();
            if (attributes != null) {
                int length = attributes.getLength();
                for (int i = 0; i < length; i++) {
                    list.add(attributes.item(i));
                }
            }
            list.add(node);
            Node node3 = null;
            for (Node firstChild = node.getFirstChild(); firstChild != null; firstChild = firstChild.getNextSibling()) {
                nodeSetMinusCommentNodes(firstChild, list, node3);
                node3 = firstChild;
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.nodeSet == null) {
                List dereferenceSameDocumentURI = dereferenceSameDocumentURI(this.root);
                this.nodeSet = dereferenceSameDocumentURI;
                this.li = dereferenceSameDocumentURI.listIterator();
            }
            return this.li.hasNext();
        }

        @Override // java.util.Iterator
        public Node next() {
            if (this.nodeSet == null) {
                List dereferenceSameDocumentURI = dereferenceSameDocumentURI(this.root);
                this.nodeSet = dereferenceSameDocumentURI;
                this.li = dereferenceSameDocumentURI.listIterator();
            }
            if (this.li.hasNext()) {
                return (Node) this.li.next();
            }
            ny61.p();
            return null;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public DOMSubTreeData(Node node, boolean z) {
        this.root = node;
        this.excludeComments = z;
    }

    public boolean excludeComments() {
        return this.excludeComments;
    }

    public Node getRoot() {
        return this.root;
    }

    public Iterator iterator() {
        return new DelayedNodeIterator(this.root, this.excludeComments);
    }
}
