package ru.CryptoPro.XAdES.util;

import defpackage.ny61;
import defpackage.ur61;
import defpackage.w511;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.xml.transform.Transformer;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.CDATASection;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;
import org.w3c.dom.ls.DOMImplementationLS;
import org.w3c.dom.ls.LSSerializer;
import ru.CryptoPro.XAdES.XAdESSignature;
import ru.xml.tools.TransformerFactoryHelper;

/* loaded from: classes4.dex */
public class XMLUtils {
    public static final Charset a = StandardCharsets.UTF_8;

    public static Node a(Element element, short s) {
        NodeList childNodes;
        String data;
        if (element == null || (childNodes = element.getChildNodes()) == null || childNodes.getLength() < 1) {
            return null;
        }
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node item = childNodes.item(i);
            short nodeType = item.getNodeType();
            if (nodeType == s && ((nodeType != 3 && nodeType != 4) || ((data = ((Text) item).getData()) != null && data.trim().length() >= 1))) {
                return item;
            }
        }
        return null;
    }

    public static boolean checkIfElementIsSignatureElementById(Element element, String str) {
        boolean z = element.getNodeType() == 1 && element.getNodeName().equals(XAdESSignature.ELEMENT_SIGNATURE);
        String namespaceURI = element.getNamespaceURI();
        String localName = element.getLocalName();
        boolean z2 = (namespaceURI == null || localName == null) ? false : true;
        boolean z3 = z2 && element.getNodeType() == 1 && localName.equals(XAdESSignature.ELEMENT_SIGNATURE) && namespaceURI.equals("http://www.w3.org/2000/09/xmldsig#");
        if ((z2 && z3) || z) {
            if (str == null) {
                return true;
            }
            String attributeByName = getAttributeByName(element, "Id");
            if (attributeByName != null && attributeByName.equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    public static Element createLastPathComponent(Document document, String[] strArr) {
        String str;
        if (document != null) {
            Element element = (Element) document.getFirstChild();
            if (strArr != null && element != null) {
                for (int i = 0; i < strArr.length; i++) {
                    Element childElementByTagName = getChildElementByTagName(element, strArr[i]);
                    if (childElementByTagName == null) {
                        childElementByTagName = document.createElement(strArr[i]);
                        element.appendChild(childElementByTagName);
                    }
                    element = childElementByTagName;
                }
                return element;
            }
            str = "Document parent and path must not be null.";
        } else {
            str = "Document must not be null.";
        }
        ny61.g(str);
        return null;
    }

    public static Node findNodeByAttributeId(NodeList nodeList, String str, String str2) {
        Node node = null;
        for (int i = 0; i < nodeList.getLength(); i++) {
            node = nodeList.item(i);
            if (node.hasAttributes()) {
                Node namedItem = node.getAttributes().getNamedItem(str);
                if (namedItem != null && (str2 == null || namedItem.getNodeValue().equals(str2))) {
                    return node;
                }
                node = null;
            }
        }
        return node;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [org.w3c.dom.Element] */
    /* JADX WARN: Type inference failed for: r3v1, types: [org.w3c.dom.Node] */
    /* JADX WARN: Type inference failed for: r3v2, types: [org.w3c.dom.Node] */
    public static Element findParentNodeByTagNS(Element element, String str, String str2) {
        String namespaceURI;
        while (true) {
            element = element.getParentNode();
            if (element == 0) {
                return null;
            }
            short nodeType = element.getNodeType();
            String localName = element.getLocalName();
            if (nodeType == 1 && localName.equals(str) && (namespaceURI = element.getNamespaceURI()) != null && namespaceURI.equals(str2)) {
                return (Element) element;
            }
        }
    }

    public static Node findSignatureElementById(Element element, String str) {
        if (checkIfElementIsSignatureElementById(element, str)) {
            return element;
        }
        NodeList elementsByTagNameNS = element.getElementsByTagNameNS("http://www.w3.org/2000/09/xmldsig#", XAdESSignature.ELEMENT_SIGNATURE);
        if (elementsByTagNameNS == null || elementsByTagNameNS.getLength() <= 0) {
            return null;
        }
        for (int i = 0; i < elementsByTagNameNS.getLength(); i++) {
            Node item = elementsByTagNameNS.item(i);
            String attributeByName = getAttributeByName(item, "Id");
            if (str == null || (attributeByName != null && attributeByName.equalsIgnoreCase(str))) {
                return item;
            }
        }
        return null;
    }

    public static String getAttributeByName(Node node, String str) {
        Node namedItem;
        if (node == null || (namedItem = node.getAttributes().getNamedItem(str)) == null) {
            return null;
        }
        return namedItem.getNodeValue().trim();
    }

    public static Element getChildElementByChain(Element element, String[] strArr, boolean z) {
        if (strArr == null) {
            return null;
        }
        for (String str : strArr) {
            if (element == null) {
                return null;
            }
            element = getChildElementByTagName(element, str);
        }
        return element;
    }

    public static Element getChildElementByTagName(Element element, String str) {
        if (element != null && str != null) {
            NodeList childNodes = element.getChildNodes();
            int length = childNodes.getLength();
            for (int i = 0; i < length; i++) {
                Node item = childNodes.item(i);
                if (item.getNodeType() == 1 && item.getNodeName().equals(str)) {
                    return (Element) item;
                }
            }
        }
        return null;
    }

    public static Element getChildElementByTagNameNS(Element element, String str, String str2) {
        String namespaceURI;
        NodeList childNodes = element.getChildNodes();
        int length = childNodes.getLength();
        for (int i = 0; i < length; i++) {
            Node item = childNodes.item(i);
            if (item.getNodeType() == 1 && str.equals(item.getLocalName()) && (namespaceURI = item.getNamespaceURI()) != null && namespaceURI.equals(str2)) {
                return (Element) item;
            }
        }
        return null;
    }

    public static List<Element> getChildElementsByTagName(Element element, String str) {
        if (element == null || str == null) {
            return Collections.EMPTY_LIST;
        }
        NodeList childNodes = element.getChildNodes();
        int length = childNodes.getLength();
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            Node item = childNodes.item(i);
            if (item.getNodeType() == 1 && item.getNodeName().equals(str)) {
                arrayList.add((Element) item);
            }
        }
        return arrayList;
    }

    public static List<Element> getChildElementsByTagNameNS(Element element, String str, String str2) {
        String namespaceURI;
        if (element == null || str == null) {
            return Collections.EMPTY_LIST;
        }
        NodeList childNodes = element.getChildNodes();
        int length = childNodes.getLength();
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            Node item = childNodes.item(i);
            if (item.getNodeType() == 1 && str.equals(item.getLocalName()) && (namespaceURI = item.getNamespaceURI()) != null && namespaceURI.equals(str2)) {
                arrayList.add((Element) item);
            }
        }
        return arrayList;
    }

    public static CDATASection getElementCDataNode(Element element) {
        return (CDATASection) a(element, (short) 4);
    }

    public static String getElementCDataValue(Element element) {
        CDATASection elementCDataNode = getElementCDataNode(element);
        if (elementCDataNode != null) {
            return elementCDataNode.getData().trim();
        }
        return null;
    }

    public static Text getElementTextNode(Element element) {
        return (Text) a(element, (short) 3);
    }

    public static String getElementTextValueDeprecated(Element element) {
        Text elementTextNode = getElementTextNode(element);
        if (elementTextNode != null) {
            return elementTextNode.getData();
        }
        return null;
    }

    public static void printChildElements(Element element, PrintStream printStream, boolean z, String str) {
        element.getNodeName();
        printStream.getClass();
        NamedNodeMap attributes = element.getAttributes();
        for (int i = 0; i < attributes.getLength(); i++) {
            Node item = attributes.item(i);
            item.getNodeName();
            item.getNodeValue();
        }
        String nodeValue = element.getNodeValue();
        if (nodeValue != null) {
            nodeValue.trim().length();
        }
        String elementCDataValue = getElementCDataValue(element);
        if (elementCDataValue != null) {
            elementCDataValue.trim().length();
        }
        NodeList childNodes = element.getChildNodes();
        for (int i2 = 0; i2 < childNodes.getLength(); i2++) {
            Node item2 = childNodes.item(i2);
            if (item2.getNodeType() == 1) {
                if (z) {
                    printChildElements((Element) item2, printStream, z, str + "\t");
                } else {
                    item2.getNodeName();
                }
            }
        }
        element.getNodeName();
    }

    public static void saveXml2File(Document document, OutputStream outputStream, boolean z) throws Exception {
        Transformer newTransformer = TransformerFactoryHelper.newInstance().newTransformer();
        DOMSource dOMSource = new DOMSource(document);
        newTransformer.transform(dOMSource, new StreamResult(outputStream));
        if (z) {
            newTransformer.transform(dOMSource, new StreamResult(System.out));
        }
    }

    public static void setElementCDataValue(Element element, String str) {
        CDATASection elementCDataNode = getElementCDataNode(element);
        if (elementCDataNode != null) {
            elementCDataNode.setData(str);
        } else {
            element.appendChild(element.getOwnerDocument().createCDATASection(str));
        }
    }

    public static void setElementTextValue(Element element, String str) {
        Text elementTextNode = getElementTextNode(element);
        if (elementTextNode != null) {
            elementTextNode.setData(str);
        } else {
            element.appendChild(element.getOwnerDocument().createTextNode(str));
        }
    }

    public static void writeXML(Writer writer, Node node, boolean z) {
        LSSerializer createLSSerializer = ((DOMImplementationLS) (node instanceof Element ? node.getOwnerDocument() : node instanceof Document ? (Document) node : null).getImplementation()).createLSSerializer();
        createLSSerializer.getDomConfig().setParameter("namespaces", Boolean.FALSE);
        ur61 ur61Var = new ur61();
        ur61Var.a = writer;
        createLSSerializer.write(node, ur61Var);
    }

    public static void writeXMLEx(Writer writer, Node node, boolean z, boolean z2) throws Exception {
        Document ownerDocument = node instanceof Element ? node.getOwnerDocument() : node instanceof Document ? (Document) node : null;
        Transformer newTransformer = TransformerFactoryHelper.newInstance().newTransformer();
        if (z) {
            newTransformer.setOutputProperty("indent", "yes");
        }
        DOMSource dOMSource = new DOMSource(ownerDocument);
        newTransformer.transform(dOMSource, new StreamResult(writer));
        if (z2) {
            newTransformer.transform(dOMSource, new StreamResult(System.out));
        }
    }

    public static void writeXMLFormatted(OutputStream outputStream, Node node, boolean z) throws Exception {
        writeXMLEx(new BufferedWriter(new OutputStreamWriter(outputStream, a)), node, z, false);
    }

    public static void writeXMLFormatted(File file, Node node) throws Exception {
        writeXMLFormatted(new FileOutputStream(file), node, false);
    }

    public static void saveXml2File(Document document, String str, boolean z) throws Exception {
        saveXml2File(document, new FileOutputStream(str), z);
    }

    public static void writeXML(OutputStream outputStream, Node node) throws Exception {
        writeXML(outputStream, node, false);
    }

    public static void writeXML(OutputStream outputStream, Node node, boolean z) throws Exception {
        Document document;
        if (node instanceof Element) {
            document = node.getOwnerDocument();
        } else {
            if (!(node instanceof Document)) {
                w511.s("Unknown node type.");
                return;
            }
            document = (Document) node;
        }
        saveXml2File(document, outputStream, false);
    }

    public static void writeXML(Writer writer, Document document, String str, String str2) {
        LSSerializer createLSSerializer = ((DOMImplementationLS) document.getImplementation()).createLSSerializer();
        ur61 ur61Var = new ur61();
        ur61Var.a = writer;
        createLSSerializer.write(document.getDocumentElement(), ur61Var);
    }

    public static void writeXML(File file, Node node) throws Exception {
        writeXML(new FileOutputStream(file), node);
    }
}
