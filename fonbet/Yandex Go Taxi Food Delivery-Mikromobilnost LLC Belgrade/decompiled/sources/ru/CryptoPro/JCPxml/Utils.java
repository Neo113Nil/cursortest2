package ru.CryptoPro.JCPxml;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.Key;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.apache.xml.security.encryption.EncryptedData;
import org.apache.xml.security.encryption.EncryptedKey;
import org.apache.xml.security.encryption.XMLCipher;
import org.apache.xml.security.keys.KeyInfo;
import org.apache.xml.security.keys.content.X509Data;
import org.apache.xml.security.signature.XMLSignature;
import org.apache.xml.security.transforms.Transforms;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;
import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.Key.KeyTwix;
import ru.CryptoPro.JCP.params.CryptParamsSpec;
import ru.xml.tools.DocumentBuilderFactoryHelper;
import ru.xml.tools.TransformerFactoryHelper;
import ru.xml.tools.XmlFeatureHelper;

/* loaded from: classes4.dex */
public class Utils {
    public static DocumentBuilderFactory createDocFactory() throws ParserConfigurationException {
        DocumentBuilderFactory newInstance = DocumentBuilderFactoryHelper.newInstance();
        newInstance.setIgnoringElementContentWhitespace(true);
        newInstance.setCoalescing(true);
        newInstance.setNamespaceAware(true);
        if (XmlFeatureHelper.XML_XXE_PROTECTED) {
            newInstance.setFeature("http://javax.xml.XMLConstants/feature/secure-processing", true);
            newInstance.setFeature("http://xml.org/sax/features/external-general-entities", false);
            newInstance.setFeature("http://xml.org/sax/features/external-parameter-entities", false);
        }
        return newInstance;
    }

    public static Document createEmptyDocument() throws ParserConfigurationException {
        return createDocFactory().newDocumentBuilder().newDocument();
    }

    public static Document createSampleDocument() throws ParserConfigurationException {
        Document newDocument = createDocFactory().newDocumentBuilder().newDocument();
        Element createElementNS = newDocument.createElementNS("http://www.apache.org/ns/#app1", "apache:RootElement");
        createElementNS.setAttributeNS("http://www.w3.org/2000/xmlns/", "xmlns:apache", "http://www.apache.org/ns/#app1");
        newDocument.appendChild(createElementNS);
        createElementNS.appendChild(newDocument.createTextNode("\n"));
        Element createElementNS2 = newDocument.createElementNS("http://www.apache.org/ns/#app1", "apache:foo");
        createElementNS2.appendChild(newDocument.createTextNode("Some simple text"));
        createElementNS.appendChild(createElementNS2);
        createElementNS.appendChild(newDocument.createTextNode("\n"));
        return newDocument;
    }

    public static Document decrypt(Document document, Key key, String str) throws Exception {
        XMLCipher providerInstance = XMLCipher.getProviderInstance(str);
        providerInstance.init(2, (Key) null);
        Element element = (Element) document.getElementsByTagNameNS("http://www.w3.org/2001/04/xmlenc#", "EncryptedData").item(0);
        if (key != null) {
            providerInstance.setKEK(key);
        }
        providerInstance.doFinal(document, element);
        return document;
    }

    public static Document encrypt(Document document, SecretKey secretKey, EncryptedKey encryptedKey, String str) throws Exception {
        Element documentElement = document.getDocumentElement();
        XMLCipher providerInstance = XMLCipher.getProviderInstance(Consts.URI_GOST_CIPHER, str);
        providerInstance.init(1, secretKey);
        EncryptedData encryptedData = providerInstance.getEncryptedData();
        KeyInfo keyInfo = new KeyInfo(document);
        keyInfo.add(encryptedKey);
        encryptedData.setKeyInfo(keyInfo);
        providerInstance.doFinal(document, documentElement, true);
        return document;
    }

    public static Document readDoc(File file) throws ParserConfigurationException, SAXException, IOException {
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2 = null;
        try {
            fileInputStream = new FileInputStream(file);
        } catch (Throwable th) {
            th = th;
        }
        try {
            Document readDoc = readDoc(fileInputStream);
            fileInputStream.close();
            return readDoc;
        } catch (Throwable th2) {
            th = th2;
            fileInputStream2 = fileInputStream;
            if (fileInputStream2 != null) {
                fileInputStream2.close();
            }
            throw th;
        }
    }

    public static void signDoc(Document document, PrivateKey privateKey, X509Certificate x509Certificate, String str, String str2) throws Exception {
        XMLSignature xMLSignature = new XMLSignature(document, "", str);
        document.getDocumentElement().appendChild(xMLSignature.getElement());
        Transforms transforms = new Transforms(document);
        transforms.addTransform("http://www.w3.org/2000/09/xmldsig#enveloped-signature");
        transforms.addTransform("http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments");
        xMLSignature.addDocument("", transforms, str2);
        xMLSignature.addKeyInfo(x509Certificate);
        xMLSignature.sign(privateKey);
    }

    public static void signDocURN(Document document, KeyTwix keyTwix) throws Exception {
        signDoc(document, keyTwix.getPrivate(), keyTwix.getCert(), "urn:ietf:params:xml:ns:cpxmlsec:algorithms:gostr34102001-gostr3411", Consts.URN_GOST_DIGEST);
    }

    public static EncryptedKey wrapKey(Document document, SecretKey secretKey, X509Certificate x509Certificate, String str, String str2) throws Exception {
        if (str2 == null) {
            String algorithm = x509Certificate.getPublicKey().getAlgorithm();
            str2 = (algorithm.equalsIgnoreCase(JCP.GOST_EL_2012_256_NAME) || algorithm.equalsIgnoreCase(JCP.GOST_DH_2012_256_NAME)) ? Consts.URI_GOST_TRANSPORT_GOST_2012_256 : (algorithm.equalsIgnoreCase(JCP.GOST_EL_2012_512_NAME) || algorithm.equalsIgnoreCase(JCP.GOST_DH_2012_512_NAME)) ? Consts.URI_GOST_TRANSPORT_GOST_2012_512 : Consts.URI_GOST_TRANSPORT;
        }
        XMLCipher providerInstance = XMLCipher.getProviderInstance(str2, str);
        providerInstance.init(3, x509Certificate.getPublicKey());
        KeyInfo keyInfo = new KeyInfo(document);
        X509Data x509Data = new X509Data(document);
        x509Data.addCertificate(x509Certificate);
        keyInfo.add(x509Data);
        EncryptedKey encryptKey = providerInstance.encryptKey(document, secretKey);
        encryptKey.setKeyInfo(keyInfo);
        return encryptKey;
    }

    public static void writeDoc(Document document, OutputStream outputStream) throws TransformerException {
        Transformer newTransformer = TransformerFactoryHelper.newInstance().newTransformer();
        newTransformer.setOutputProperty("omit-xml-declaration", "yes");
        newTransformer.transform(new DOMSource(document), new StreamResult(outputStream));
    }

    public static void signDocURN(Document document, PrivateKey privateKey, X509Certificate x509Certificate) throws Exception {
        signDoc(document, privateKey, x509Certificate, "urn:ietf:params:xml:ns:cpxmlsec:algorithms:gostr34102001-gostr3411", Consts.URN_GOST_DIGEST);
    }

    public static Document readDoc(InputStream inputStream) throws ParserConfigurationException, SAXException, IOException {
        return createDocFactory().newDocumentBuilder().parse(inputStream);
    }

    public static Document readDoc(String str) throws ParserConfigurationException, SAXException, IOException {
        return readDoc(new File(str));
    }

    public static void writeDoc(Document document, File file) throws IOException, TransformerException {
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2 = null;
        try {
            fileOutputStream = new FileOutputStream(file);
        } catch (Throwable th) {
            th = th;
        }
        try {
            writeDoc(document, fileOutputStream);
            fileOutputStream.close();
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            if (fileOutputStream2 != null) {
                fileOutputStream2.close();
            }
            throw th;
        }
    }

    public static void writeDoc(Document document, String str) throws IOException, TransformerException {
        writeDoc(document, new File(str));
    }

    public static Document encrypt(Document document, X509Certificate x509Certificate, String str, CryptParamsSpec cryptParamsSpec, String str2) throws Exception {
        KeyGenerator keyGenerator = KeyGenerator.getInstance("GOST28147", str);
        if (cryptParamsSpec != null) {
            keyGenerator.init(cryptParamsSpec);
        }
        SecretKey generateKey = keyGenerator.generateKey();
        return encrypt(document, generateKey, wrapKey(document, generateKey, x509Certificate, str, str2), str);
    }

    public static Document encrypt(Document document, X509Certificate x509Certificate, String str, CryptParamsSpec cryptParamsSpec) throws Exception {
        KeyGenerator keyGenerator = KeyGenerator.getInstance("GOST28147", str);
        if (cryptParamsSpec != null) {
            keyGenerator.init(cryptParamsSpec);
        }
        SecretKey generateKey = keyGenerator.generateKey();
        return encrypt(document, generateKey, wrapKey(document, generateKey, x509Certificate, str, null), str);
    }

    public static void signDoc(Document document, PrivateKey privateKey, X509Certificate x509Certificate) throws Exception {
        signDoc(document, privateKey, x509Certificate, "http://www.w3.org/2001/04/xmldsig-more#gostr34102001-gostr3411", Consts.URI_GOST_DIGEST);
    }

    public static void signDoc(Document document, KeyTwix keyTwix) throws Exception {
        signDoc(document, keyTwix.getPrivate(), keyTwix.getCert(), "http://www.w3.org/2001/04/xmldsig-more#gostr34102001-gostr3411", Consts.URI_GOST_DIGEST);
    }
}
