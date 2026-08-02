package ru.CryptoPro.JCPxml.dsig.internal.dom;

import defpackage.ny61;
import defpackage.oyr;
import defpackage.xfo;
import java.io.ByteArrayInputStream;
import java.security.cert.CRLException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509CRL;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.security.auth.x500.X500Principal;
import javax.xml.crypto.MarshalException;
import javax.xml.crypto.XMLStructure;
import javax.xml.crypto.dom.DOMCryptoContext;
import javax.xml.crypto.dsig.keyinfo.X509Data;
import javax.xml.crypto.dsig.keyinfo.X509IssuerSerial;
import org.apache.xml.security.exceptions.Base64DecodingException;
import org.apache.xml.security.utils.Base64;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import ru.CryptoPro.JCP.JCP;

/* loaded from: classes4.dex */
public final class DOMX509Data extends DOMStructure implements X509Data {
    private CertificateFactory cf;
    private final List content;

    public DOMX509Data(Element element) throws MarshalException {
        DOMX509IssuerSerial dOMStructure;
        Object unmarshalX509CRL;
        NodeList childNodes = element.getChildNodes();
        int length = childNodes.getLength();
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            Node item = childNodes.item(i);
            if (item.getNodeType() == 1) {
                Element element2 = (Element) item;
                String localName = element2.getLocalName();
                if (localName.equals("X509Certificate")) {
                    unmarshalX509CRL = unmarshalX509Certificate(element2);
                } else {
                    if (localName.equals("X509IssuerSerial")) {
                        dOMStructure = new DOMX509IssuerSerial(element2);
                    } else if (localName.equals("X509SubjectName")) {
                        unmarshalX509CRL = element2.getFirstChild().getNodeValue();
                    } else if (localName.equals("X509SKI")) {
                        try {
                            arrayList.add(Base64.decode(element2));
                        } catch (Base64DecodingException e) {
                            throw new MarshalException("cannot decode X509SKI", e);
                        }
                    } else if (localName.equals("X509CRL")) {
                        unmarshalX509CRL = unmarshalX509CRL(element2);
                    } else {
                        dOMStructure = new javax.xml.crypto.dom.DOMStructure(element2);
                    }
                    arrayList.add(dOMStructure);
                }
                arrayList.add(unmarshalX509CRL);
            }
        }
        this.content = Collections.unmodifiableList(arrayList);
    }

    private void marshalCRL(X509CRL x509crl, Node node, Document document, String str) throws MarshalException {
        Element createElement = DOMUtils.createElement(document, "X509CRL", "http://www.w3.org/2000/09/xmldsig#", str);
        try {
            createElement.appendChild(document.createTextNode(Base64.encode(x509crl.getEncoded())));
            node.appendChild(createElement);
        } catch (CRLException e) {
            throw new MarshalException("Error encoding X509CRL", e);
        }
    }

    private void marshalCert(X509Certificate x509Certificate, Node node, Document document, String str) throws MarshalException {
        Element createElement = DOMUtils.createElement(document, "X509Certificate", "http://www.w3.org/2000/09/xmldsig#", str);
        try {
            createElement.appendChild(document.createTextNode(Base64.encode(x509Certificate.getEncoded())));
            node.appendChild(createElement);
        } catch (CertificateEncodingException e) {
            throw new MarshalException("Error encoding X509Certificate", e);
        }
    }

    private void marshalSKI(byte[] bArr, Node node, Document document, String str) {
        Element createElement = DOMUtils.createElement(document, "X509SKI", "http://www.w3.org/2000/09/xmldsig#", str);
        createElement.appendChild(document.createTextNode(Base64.encode(bArr)));
        node.appendChild(createElement);
    }

    private void marshalSubjectName(String str, Node node, Document document, String str2) {
        Element createElement = DOMUtils.createElement(document, "X509SubjectName", "http://www.w3.org/2000/09/xmldsig#", str2);
        createElement.appendChild(document.createTextNode(str));
        node.appendChild(createElement);
    }

    private ByteArrayInputStream unmarshalBase64Binary(Element element) throws MarshalException {
        try {
            if (this.cf == null) {
                this.cf = CertificateFactory.getInstance(JCP.CERTIFICATE_FACTORY_NAME);
            }
            return new ByteArrayInputStream(Base64.decode(element));
        } catch (Base64DecodingException e) {
            throw new MarshalException("Cannot decode Base64-encoded val", e);
        } catch (CertificateException e2) {
            throw new MarshalException("Cannot create CertificateFactory", e2);
        }
    }

    private X509CRL unmarshalX509CRL(Element element) throws MarshalException {
        try {
            return (X509CRL) this.cf.generateCRL(unmarshalBase64Binary(element));
        } catch (CRLException e) {
            throw new MarshalException("Cannot create X509CRL", e);
        }
    }

    private X509Certificate unmarshalX509Certificate(Element element) throws MarshalException {
        try {
            return (X509Certificate) this.cf.generateCertificate(unmarshalBase64Binary(element));
        } catch (CertificateException e) {
            throw new MarshalException("Cannot create X509Certificate", e);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof X509Data)) {
            return false;
        }
        List content = ((X509Data) obj).getContent();
        int size = this.content.size();
        if (size != content.size()) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            Object obj2 = this.content.get(i);
            Object obj3 = content.get(i);
            if (obj2 instanceof byte[]) {
                if (!(obj3 instanceof byte[]) || !Arrays.equals((byte[]) obj2, (byte[]) obj3)) {
                    return false;
                }
            } else if (!obj2.equals(obj3)) {
                return false;
            }
        }
        return true;
    }

    public List getContent() {
        return this.content;
    }

    @Override // ru.CryptoPro.JCPxml.dsig.internal.dom.DOMStructure
    public void marshal(Node node, String str, DOMCryptoContext dOMCryptoContext) throws MarshalException {
        Document ownerDocument = DOMUtils.getOwnerDocument(node);
        Element createElement = DOMUtils.createElement(ownerDocument, "X509Data", "http://www.w3.org/2000/09/xmldsig#", str);
        int size = this.content.size();
        for (int i = 0; i < size; i++) {
            Object obj = this.content.get(i);
            if (obj instanceof X509Certificate) {
                marshalCert((X509Certificate) obj, createElement, ownerDocument, str);
            } else if (obj instanceof XMLStructure) {
                if (obj instanceof X509IssuerSerial) {
                    ((DOMX509IssuerSerial) obj).marshal(createElement, str, dOMCryptoContext);
                } else {
                    DOMUtils.appendChild(createElement, ((javax.xml.crypto.dom.DOMStructure) obj).getNode());
                }
            } else if (obj instanceof byte[]) {
                marshalSKI((byte[]) obj, createElement, ownerDocument, str);
            } else if (obj instanceof String) {
                marshalSubjectName((String) obj, createElement, ownerDocument, str);
            } else if (obj instanceof X509CRL) {
                marshalCRL((X509CRL) obj, createElement, ownerDocument, str);
            }
        }
        node.appendChild(createElement);
    }

    public DOMX509Data(List list) {
        if (list == null) {
            ny61.t("content cannot be null");
            throw null;
        }
        ArrayList arrayList = new ArrayList(list);
        if (arrayList.isEmpty()) {
            ny61.g("content cannot be empty");
            throw null;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Object obj = arrayList.get(i);
            if (obj instanceof String) {
                new X500Principal((String) obj);
            } else if (!(obj instanceof byte[]) && !(obj instanceof X509Certificate) && !(obj instanceof X509CRL) && !(obj instanceof XMLStructure)) {
                xfo.h(oyr.j(i, "content[", "] is not a valid X509Data type"));
                throw null;
            }
        }
        this.content = Collections.unmodifiableList(arrayList);
    }
}
