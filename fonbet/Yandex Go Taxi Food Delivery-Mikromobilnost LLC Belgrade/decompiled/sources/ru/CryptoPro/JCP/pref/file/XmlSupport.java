package ru.CryptoPro.JCP.pref.file;

import defpackage.ny61;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import java.util.prefs.InvalidPreferencesFormatException;
import java.util.prefs.Preferences;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.EntityResolver;
import org.xml.sax.ErrorHandler;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import ru.CryptoPro.JCP.tools.Platform;
import ru.CryptoPro.reprov.x509.PolicyMappingsExtension;

/* loaded from: classes4.dex */
class XmlSupport {

    public static class EH implements ErrorHandler {
        @Override // org.xml.sax.ErrorHandler
        public void error(SAXParseException sAXParseException) throws SAXException {
            throw sAXParseException;
        }

        @Override // org.xml.sax.ErrorHandler
        public void fatalError(SAXParseException sAXParseException) throws SAXException {
            throw sAXParseException;
        }

        @Override // org.xml.sax.ErrorHandler
        public void warning(SAXParseException sAXParseException) throws SAXException {
            throw sAXParseException;
        }
    }

    public static class NodeListAdapter implements NodeList {
        public final List a;

        public NodeListAdapter(List list) {
            Objects.requireNonNull(list);
            this.a = list;
        }

        @Override // org.w3c.dom.NodeList
        public int getLength() {
            return this.a.size();
        }

        @Override // org.w3c.dom.NodeList
        public Node item(int i) {
            if (i < 0) {
                return null;
            }
            List list = this.a;
            if (i >= list.size()) {
                return null;
            }
            return (Node) list.get(i);
        }
    }

    public static class Resolver implements EntityResolver {
        @Override // org.xml.sax.EntityResolver
        public InputSource resolveEntity(String str, String str2) throws SAXException {
            if (!str2.equals("http://java.sun.com/dtd/preferences.dtd")) {
                throw new SAXException("Invalid system identifier: ".concat(str2));
            }
            InputSource inputSource = new InputSource(new StringReader("<?xml version=\"1.0\" encoding=\"UTF-8\"?><!-- DTD for preferences --><!ELEMENT preferences (root) ><!ATTLIST preferences EXTERNAL_XML_VERSION CDATA \"0.0\"  ><!ELEMENT root (map, node*) ><!ATTLIST root          type (system|user) #REQUIRED ><!ELEMENT node (map, node*) ><!ATTLIST node          name CDATA #REQUIRED ><!ELEMENT map (entry*) ><!ATTLIST map  MAP_XML_VERSION CDATA \"0.0\"  ><!ELEMENT entry EMPTY ><!ATTLIST entry          key CDATA #REQUIRED          value CDATA #REQUIRED >"));
            inputSource.setSystemId("http://java.sun.com/dtd/preferences.dtd");
            return inputSource;
        }
    }

    public static Document a(String str) {
        try {
            DOMImplementation dOMImplementation = DocumentBuilderFactory.newInstance().newDocumentBuilder().getDOMImplementation();
            return dOMImplementation.createDocument(null, str, dOMImplementation.createDocumentType(str, null, "http://java.sun.com/dtd/preferences.dtd"));
        } catch (ParserConfigurationException e) {
            ny61.f(e);
            return null;
        }
    }

    public static void b(FileInputStream fileInputStream, TreeMap treeMap) {
        try {
            Element documentElement = g(fileInputStream).getDocumentElement();
            String attribute = documentElement.getAttribute("MAP_XML_VERSION");
            if (attribute.compareTo("1.0") > 0) {
                throw new InvalidPreferencesFormatException("Preferences map file format version " + attribute + " is not supported. This java installation can read versions 1.0 or older. You may need to install a newer version of JDK.");
            }
            NodeList childNodes = documentElement.getChildNodes();
            int length = childNodes.getLength();
            for (int i = 0; i < length; i++) {
                if (!Platform.isAndroid || (childNodes.item(i) instanceof Element)) {
                    Element element = (Element) childNodes.item(i);
                    treeMap.put(element.getAttribute("key"), element.getAttribute("value"));
                }
            }
        } catch (SAXException e) {
            throw new InvalidPreferencesFormatException(e);
        }
    }

    public static void c(FileOutputStream fileOutputStream, TreeMap treeMap) {
        Document a = a(PolicyMappingsExtension.MAP);
        Element documentElement = a.getDocumentElement();
        documentElement.setAttribute("MAP_XML_VERSION", "1.0");
        for (Map.Entry entry : treeMap.entrySet()) {
            Element element = (Element) documentElement.appendChild(a.createElement("entry"));
            element.setAttribute("key", (String) entry.getKey());
            element.setAttribute("value", (String) entry.getValue());
        }
        e(a, fileOutputStream);
    }

    public static void d(OutputStream outputStream, Preferences preferences, boolean z) {
        if (((AbstractPreferences) preferences).isRemoved()) {
            ny61.r("Node has been removed");
            return;
        }
        Document a = a("preferences");
        Element documentElement = a.getDocumentElement();
        documentElement.setAttribute("EXTERNAL_XML_VERSION", "1.0");
        Element element = (Element) documentElement.appendChild(a.createElement("root"));
        element.setAttribute("type", preferences.isUserNode() ? "user" : "system");
        ArrayList arrayList = new ArrayList();
        Preferences preferences2 = preferences;
        for (Preferences parent = preferences.parent(); parent != null; parent = parent.parent()) {
            arrayList.add(preferences2);
            preferences2 = parent;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            element.appendChild(a.createElement(PolicyMappingsExtension.MAP));
            element = (Element) element.appendChild(a.createElement("node"));
            element.setAttribute("name", ((Preferences) arrayList.get(size)).name());
        }
        f(element, a, preferences, z);
        e(a, outputStream);
    }

    public static final void e(Document document, OutputStream outputStream) {
        try {
            TransformerFactory newInstance = TransformerFactory.newInstance();
            try {
                newInstance.setAttribute("indent-number", new Integer(2));
            } catch (IllegalArgumentException unused) {
            }
            Transformer newTransformer = newInstance.newTransformer();
            newTransformer.setOutputProperty("doctype-system", document.getDoctype().getSystemId());
            newTransformer.setOutputProperty("indent", "yes");
            newTransformer.transform(new DOMSource(document), new StreamResult(new BufferedWriter(new OutputStreamWriter(outputStream, "UTF-8"))));
        } catch (TransformerException e) {
            ny61.f(e);
        }
    }

    public static void f(Element element, Document document, Preferences preferences, boolean z) {
        Preferences[] preferencesArr;
        String[] strArr;
        synchronized (((AbstractPreferences) preferences).lock) {
            try {
                if (((AbstractPreferences) preferences).isRemoved()) {
                    element.getParentNode().removeChild(element);
                    return;
                }
                String[] keys = preferences.keys();
                Element element2 = (Element) element.appendChild(document.createElement(PolicyMappingsExtension.MAP));
                int i = 0;
                while (true) {
                    preferencesArr = null;
                    if (i >= keys.length) {
                        break;
                    }
                    Element element3 = (Element) element2.appendChild(document.createElement("entry"));
                    element3.setAttribute("key", keys[i]);
                    element3.setAttribute("value", preferences.get(keys[i], null));
                    i++;
                }
                if (z) {
                    String[] childrenNames = preferences.childrenNames();
                    Preferences[] preferencesArr2 = new Preferences[childrenNames.length];
                    for (int i2 = 0; i2 < childrenNames.length; i2++) {
                        preferencesArr2[i2] = preferences.node(childrenNames[i2]);
                    }
                    strArr = childrenNames;
                    preferencesArr = preferencesArr2;
                } else {
                    strArr = null;
                }
                if (z) {
                    for (int i3 = 0; i3 < strArr.length; i3++) {
                        Element element4 = (Element) element.appendChild(document.createElement("node"));
                        element4.setAttribute("name", strArr[i3]);
                        f(element4, document, preferencesArr[i3], z);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static Document g(FileInputStream fileInputStream) {
        DocumentBuilderFactory newInstance = DocumentBuilderFactory.newInstance();
        newInstance.setIgnoringElementContentWhitespace(true);
        if (!Platform.isAndroid) {
            newInstance.setValidating(true);
        }
        newInstance.setCoalescing(true);
        newInstance.setIgnoringComments(true);
        try {
            DocumentBuilder newDocumentBuilder = newInstance.newDocumentBuilder();
            newDocumentBuilder.setEntityResolver(new Resolver());
            newDocumentBuilder.setErrorHandler(new EH());
            return newDocumentBuilder.parse(new InputSource(fileInputStream));
        } catch (ParserConfigurationException e) {
            ny61.f(e);
            return null;
        }
    }
}
