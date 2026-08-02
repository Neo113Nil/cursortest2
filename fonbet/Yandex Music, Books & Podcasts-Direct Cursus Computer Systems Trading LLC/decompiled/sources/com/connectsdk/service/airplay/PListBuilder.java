package com.connectsdk.service.airplay;

import java.io.StringWriter;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.DocumentType;
import org.w3c.dom.Element;

/* loaded from: classes.dex */
public class PListBuilder {
    Document doc;
    DocumentType dt;
    Element root;
    Element rootDict;

    public PListBuilder() {
        try {
            DOMImplementation dOMImplementation = DocumentBuilderFactory.newInstance().newDocumentBuilder().getDOMImplementation();
            DocumentType createDocumentType = dOMImplementation.createDocumentType(PListParser.TAG_PLIST, "-//Apple//DTD PLIST 1.0//EN", "http://www.apple.com/DTDs/PropertyList-1.0.dtd");
            this.dt = createDocumentType;
            Document createDocument = dOMImplementation.createDocument("", PListParser.TAG_PLIST, createDocumentType);
            this.doc = createDocument;
            createDocument.setXmlStandalone(true);
            Element documentElement = this.doc.getDocumentElement();
            this.root = documentElement;
            documentElement.setAttribute("version", "1.0");
            Element createElement = this.doc.createElement(PListParser.TAG_DICT);
            this.rootDict = createElement;
            this.root.appendChild(createElement);
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }
    }

    private void putKey(String str) {
        Element createElement = this.doc.createElement(PListParser.TAG_KEY);
        createElement.setTextContent(str);
        this.rootDict.appendChild(createElement);
    }

    public void putBoolean(String str, boolean z) {
        putKey(str);
        this.rootDict.appendChild(this.doc.createElement(z ? PListParser.TAG_TRUE : PListParser.TAG_FALSE));
    }

    public void putData(String str, String str2) {
        putKey(str);
        Element createElement = this.doc.createElement("data");
        createElement.setTextContent(str2);
        this.rootDict.appendChild(createElement);
    }

    public void putInteger(String str, long j) {
        putKey(str);
        Element createElement = this.doc.createElement(PListParser.TAG_INTEGER);
        createElement.setTextContent(String.valueOf(j));
        this.rootDict.appendChild(createElement);
    }

    public void putReal(String str, double d) {
        putKey(str);
        Element createElement = this.doc.createElement(PListParser.TAG_REAL);
        createElement.setTextContent(String.valueOf(d));
        this.rootDict.appendChild(createElement);
    }

    public void putString(String str, String str2) {
        putKey(str);
        Element createElement = this.doc.createElement(PListParser.TAG_STRING);
        createElement.setTextContent(str2);
        this.rootDict.appendChild(createElement);
    }

    public String toString() {
        DOMSource dOMSource = new DOMSource(this.doc);
        TransformerFactory newInstance = TransformerFactory.newInstance();
        StringWriter stringWriter = new StringWriter();
        try {
            Transformer newTransformer = newInstance.newTransformer();
            newTransformer.setOutputProperty("encoding", "UTF-8");
            newTransformer.setOutputProperty("doctype-public", this.dt.getPublicId());
            newTransformer.setOutputProperty("doctype-system", this.dt.getSystemId());
            newTransformer.setOutputProperty("indent", "yes");
            newTransformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
            newTransformer.transform(dOMSource, new StreamResult(stringWriter));
        } catch (TransformerConfigurationException e) {
            e.printStackTrace();
        } catch (TransformerException e2) {
            e2.printStackTrace();
        }
        return stringWriter.toString();
    }
}
