package ru.CryptoPro.JCPxml.dsig.internal.dom;

import defpackage.g8e;
import defpackage.ny61;
import java.security.spec.AlgorithmParameterSpec;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.xml.crypto.XMLCryptoContext;
import javax.xml.crypto.dsig.spec.ExcC14NParameterSpec;
import javax.xml.crypto.dsig.spec.XPathFilter2ParameterSpec;
import javax.xml.crypto.dsig.spec.XPathFilterParameterSpec;
import javax.xml.crypto.dsig.spec.XPathType;
import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/* loaded from: classes4.dex */
public class DOMUtils {

    class NodeSet extends AbstractSet {
        private NodeList nl;

        public NodeSet(NodeList nodeList) {
            this.nl = nodeList;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new Iterator() { // from class: ru.CryptoPro.JCPxml.dsig.internal.dom.DOMUtils.NodeSet.1
                int index = 0;

                @Override // java.util.Iterator
                public boolean hasNext() {
                    return this.index < NodeSet.this.nl.getLength();
                }

                @Override // java.util.Iterator
                public Node next() {
                    if (!hasNext()) {
                        ny61.p();
                        return null;
                    }
                    NodeList nodeList = NodeSet.this.nl;
                    int i = this.index;
                    this.index = i + 1;
                    return nodeList.item(i);
                }

                @Override // java.util.Iterator
                public void remove() {
                    throw new UnsupportedOperationException();
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.nl.getLength();
        }
    }

    private DOMUtils() {
    }

    public static void appendChild(Node node, Node node2) {
        Document ownerDocument = getOwnerDocument(node);
        if (node2.getOwnerDocument() != ownerDocument) {
            node.appendChild(ownerDocument.importNode(node2, true));
        } else {
            node.appendChild(node2);
        }
    }

    public static Element createElement(Document document, String str, String str2, String str3) {
        if (str3 != null && str3.length() != 0) {
            str = g8e.p(str3, ":", str);
        }
        return document.createElementNS(str2, str);
    }

    public static String getAttributeValue(Element element, String str) {
        Attr attributeNodeNS = element.getAttributeNodeNS(null, str);
        if (attributeNodeNS == null) {
            return null;
        }
        return attributeNodeNS.getValue();
    }

    public static Element getFirstChildElement(Node node) {
        Node firstChild = node.getFirstChild();
        while (firstChild != null && firstChild.getNodeType() != 1) {
            firstChild = firstChild.getNextSibling();
        }
        return (Element) firstChild;
    }

    public static Element getLastChildElement(Node node) {
        Node lastChild = node.getLastChild();
        while (lastChild != null && lastChild.getNodeType() != 1) {
            lastChild = lastChild.getPreviousSibling();
        }
        return (Element) lastChild;
    }

    public static String getNSPrefix(XMLCryptoContext xMLCryptoContext, String str) {
        if (xMLCryptoContext != null) {
            return xMLCryptoContext.getNamespacePrefix(str, xMLCryptoContext.getDefaultNamespacePrefix());
        }
        return null;
    }

    public static Element getNextSiblingElement(Node node) {
        do {
            node = node.getNextSibling();
            if (node == null) {
                break;
            }
        } while (node.getNodeType() != 1);
        return (Element) node;
    }

    public static Document getOwnerDocument(Node node) {
        return node.getNodeType() == 9 ? (Document) node : node.getOwnerDocument();
    }

    public static String getSignaturePrefix(XMLCryptoContext xMLCryptoContext) {
        return getNSPrefix(xMLCryptoContext, "http://www.w3.org/2000/09/xmldsig#");
    }

    public static Set nodeSet(NodeList nodeList) {
        return new NodeSet(nodeList);
    }

    public static boolean nodesEqual(Node node, Node node2) {
        return node == node2 || node.getNodeType() == node2.getNodeType();
    }

    private static boolean paramsEqual(XPathFilter2ParameterSpec xPathFilter2ParameterSpec, XPathFilter2ParameterSpec xPathFilter2ParameterSpec2) {
        List xPathList = xPathFilter2ParameterSpec.getXPathList();
        List xPathList2 = xPathFilter2ParameterSpec2.getXPathList();
        int size = xPathList.size();
        if (size != xPathList2.size()) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            XPathType xPathType = (XPathType) xPathList.get(i);
            XPathType xPathType2 = (XPathType) xPathList2.get(i);
            if (!xPathType.getExpression().equals(xPathType2.getExpression()) || !xPathType.getNamespaceMap().equals(xPathType2.getNamespaceMap()) || xPathType.getFilter() != xPathType2.getFilter()) {
                return false;
            }
        }
        return true;
    }

    public static void removeAllChildren(Node node) {
        NodeList childNodes = node.getChildNodes();
        int length = childNodes.getLength();
        for (int i = 0; i < length; i++) {
            node.removeChild(childNodes.item(i));
        }
    }

    public static void setAttribute(Element element, String str, String str2) {
        if (str2 == null) {
            return;
        }
        element.setAttributeNS(null, str, str2);
    }

    public static void setAttributeID(Element element, String str, String str2) {
        if (str2 == null) {
            return;
        }
        element.setAttributeNS(null, str, str2);
        element.setIdAttributeNS(null, str, true);
    }

    private static boolean paramsEqual(ExcC14NParameterSpec excC14NParameterSpec, ExcC14NParameterSpec excC14NParameterSpec2) {
        return excC14NParameterSpec.getPrefixList().equals(excC14NParameterSpec2.getPrefixList());
    }

    public static boolean paramsEqual(AlgorithmParameterSpec algorithmParameterSpec, AlgorithmParameterSpec algorithmParameterSpec2) {
        if (algorithmParameterSpec == algorithmParameterSpec2) {
            return true;
        }
        if ((algorithmParameterSpec instanceof XPathFilter2ParameterSpec) && (algorithmParameterSpec2 instanceof XPathFilter2ParameterSpec)) {
            return paramsEqual((XPathFilter2ParameterSpec) algorithmParameterSpec, (XPathFilter2ParameterSpec) algorithmParameterSpec2);
        }
        if ((algorithmParameterSpec instanceof ExcC14NParameterSpec) && (algorithmParameterSpec2 instanceof ExcC14NParameterSpec)) {
            return paramsEqual((ExcC14NParameterSpec) algorithmParameterSpec, (ExcC14NParameterSpec) algorithmParameterSpec2);
        }
        if ((algorithmParameterSpec instanceof XPathFilterParameterSpec) && (algorithmParameterSpec2 instanceof XPathFilterParameterSpec)) {
            return paramsEqual((XPathFilterParameterSpec) algorithmParameterSpec, (XPathFilterParameterSpec) algorithmParameterSpec2);
        }
        if ((algorithmParameterSpec instanceof XSLTTransformParameterSpec) && (algorithmParameterSpec2 instanceof XSLTTransformParameterSpec)) {
            return paramsEqual((XSLTTransformParameterSpec) algorithmParameterSpec, (XSLTTransformParameterSpec) algorithmParameterSpec2);
        }
        return false;
    }

    private static boolean paramsEqual(XPathFilterParameterSpec xPathFilterParameterSpec, XPathFilterParameterSpec xPathFilterParameterSpec2) {
        return xPathFilterParameterSpec.getXPath().equals(xPathFilterParameterSpec2.getXPath()) && xPathFilterParameterSpec.getNamespaceMap().equals(xPathFilterParameterSpec2.getNamespaceMap());
    }

    private static boolean paramsEqual(XSLTTransformParameterSpec xSLTTransformParameterSpec, XSLTTransformParameterSpec xSLTTransformParameterSpec2) {
        javax.xml.crypto.dom.DOMStructure stylesheet = xSLTTransformParameterSpec2.getStylesheet();
        if (!(stylesheet instanceof javax.xml.crypto.dom.DOMStructure)) {
            return false;
        }
        return nodesEqual(xSLTTransformParameterSpec.getStylesheet().getNode(), stylesheet.getNode());
    }
}
