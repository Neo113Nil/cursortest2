package ru.CryptoPro.JCPxml.utility;

import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.List;
import java.util.WeakHashMap;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import ru.CryptoPro.JCP.tools.JCPLogger;

/* loaded from: classes4.dex */
public class XMLIdResolver {
    private static WeakHashMap docMap = new WeakHashMap();
    private static List names;
    private static int namesLength;

    static {
        List asList = Arrays.asList("http://www.w3.org/2000/09/xmldsig#", "http://www.w3.org/2001/04/xmlenc#", "http://schemas.xmlsoap.org/soap/security/2000-12", "http://www.w3.org/2002/03/xkms#", "urn:oasis:names:tc:SAML:1.0:assertion", "urn:oasis:names:tc:SAML:1.0:protocol");
        names = asList;
        namesLength = asList.size();
    }

    private XMLIdResolver() {
    }

    private static int getEl(Node node, String str, Element[] elementArr) {
        Node node2 = null;
        Node node3 = null;
        while (true) {
            short nodeType = node.getNodeType();
            if (nodeType != 1) {
                node = (nodeType == 9 || nodeType == 11) ? node.getFirstChild() : node3;
            } else {
                Element element = (Element) node;
                if (isElement(element, str, elementArr) == 1) {
                    return 1;
                }
                Node firstChild = node.getFirstChild();
                if (firstChild != null) {
                    node2 = element;
                } else if (node2 != null) {
                    node = node.getNextSibling();
                }
                node = firstChild;
            }
            while (node == null && node2 != null) {
                node = node2.getNextSibling();
                node2 = node2.getParentNode();
                if (!(node2 instanceof Element)) {
                    node2 = null;
                }
            }
            if (node == null) {
                return 1;
            }
            node3 = node.getNextSibling();
        }
    }

    public static Element getElementById(Document document, String str) {
        String str2;
        Element elementByIdType = getElementByIdType(document, str);
        if (elementByIdType != null) {
            str2 = "I could find an Element using the simple getElementByIdType method: ";
        } else {
            elementByIdType = getElementByIdUsingDOM(document, str);
            if (elementByIdType == null) {
                Element elementBySearching = getElementBySearching(document, str);
                if (elementBySearching == null) {
                    return null;
                }
                registerElementById(elementBySearching, str);
                return elementBySearching;
            }
            str2 = "I could find an Element using the simple getElementByIdUsingDOM method: ";
        }
        JCPLogger.finer(str2, elementByIdType.getTagName());
        return elementByIdType;
    }

    private static Element getElementByIdType(Document document, String str) {
        WeakHashMap weakHashMap;
        WeakReference weakReference;
        synchronized (docMap) {
            weakHashMap = (WeakHashMap) docMap.get(document);
        }
        if (weakHashMap == null || (weakReference = (WeakReference) weakHashMap.get(str)) == null) {
            return null;
        }
        return (Element) weakReference.get();
    }

    private static Element getElementByIdUsingDOM(Document document, String str) {
        return document.getElementById(str);
    }

    private static Element getElementBySearching(Node node, String str) {
        int i = namesLength + 1;
        Element[] elementArr = new Element[i];
        getEl(node, str, elementArr);
        for (int i2 = 0; i2 < i; i2++) {
            Element element = elementArr[i2];
            if (element != null) {
                return element;
            }
        }
        return null;
    }

    public static int isElement(Element element, String str, Element[] elementArr) {
        if (!element.hasAttributes()) {
            return 0;
        }
        NamedNodeMap attributes = element.getAttributes();
        int indexOf = names.indexOf(element.getNamespaceURI());
        if (indexOf < 0) {
            indexOf = namesLength;
        }
        int length = attributes.getLength();
        for (int i = 0; i < length; i++) {
            Attr attr = (Attr) attributes.item(i);
            int indexOf2 = attr.getNamespaceURI() == null ? indexOf : names.indexOf(attr.getNamespaceURI());
            if (indexOf2 < 0) {
                indexOf2 = namesLength;
            }
            String localName = attr.getLocalName();
            if (localName != null && localName.length() <= 2) {
                String nodeValue = attr.getNodeValue();
                if (localName.charAt(0) == 'I') {
                    char charAt = localName.charAt(1);
                    if (charAt == 'd' && nodeValue.equals(str)) {
                        elementArr[indexOf2] = element;
                        if (indexOf2 == 0) {
                            return 1;
                        }
                    } else if (charAt == 'D' && nodeValue.endsWith(str)) {
                        if (indexOf2 != 3) {
                            indexOf2 = namesLength;
                        }
                        elementArr[indexOf2] = element;
                    }
                } else if ("id".equals(localName) && nodeValue.equals(str)) {
                    if (indexOf2 != 2) {
                        indexOf2 = namesLength;
                    }
                    elementArr[indexOf2] = element;
                }
            }
        }
        if (indexOf == 3 && (element.getAttribute("OriginalRequestID").equals(str) || element.getAttribute("RequestID").equals(str) || element.getAttribute("ResponseID").equals(str))) {
            elementArr[3] = element;
        } else if (indexOf == 4 && element.getAttribute("AssertionID").equals(str)) {
            elementArr[4] = element;
        } else if (indexOf == 5 && (element.getAttribute("RequestID").equals(str) || element.getAttribute("ResponseID").equals(str))) {
            elementArr[5] = element;
        }
        return 0;
    }

    public static void registerElementById(Element element, String str) {
        WeakHashMap weakHashMap;
        Document ownerDocument = element.getOwnerDocument();
        synchronized (docMap) {
            try {
                weakHashMap = (WeakHashMap) docMap.get(ownerDocument);
                if (weakHashMap == null) {
                    weakHashMap = new WeakHashMap();
                    docMap.put(ownerDocument, weakHashMap);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        weakHashMap.put(str, new WeakReference(element));
    }

    public static void registerElementById(Element element, Attr attr) {
        registerElementById(element, attr.getNodeValue());
    }
}
