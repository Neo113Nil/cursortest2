package ru.CryptoPro.JCPxml.dsig.internal.dom;

import defpackage.ny61;
import java.math.BigInteger;
import javax.security.auth.x500.X500Principal;
import javax.xml.crypto.MarshalException;
import javax.xml.crypto.dom.DOMCryptoContext;
import javax.xml.crypto.dsig.keyinfo.X509IssuerSerial;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

/* loaded from: classes4.dex */
public final class DOMX509IssuerSerial extends DOMStructure implements X509IssuerSerial {
    private final String issuerName;
    private final BigInteger serialNumber;

    public DOMX509IssuerSerial(Element element) {
        Element firstChildElement = DOMUtils.getFirstChildElement(element);
        Element nextSiblingElement = DOMUtils.getNextSiblingElement(firstChildElement);
        this.issuerName = firstChildElement.getFirstChild().getNodeValue();
        this.serialNumber = new BigInteger(nextSiblingElement.getFirstChild().getNodeValue());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof X509IssuerSerial)) {
            return false;
        }
        X509IssuerSerial x509IssuerSerial = (X509IssuerSerial) obj;
        return this.issuerName.equals(x509IssuerSerial.getIssuerName()) && this.serialNumber.equals(x509IssuerSerial.getSerialNumber());
    }

    public String getIssuerName() {
        return this.issuerName;
    }

    public BigInteger getSerialNumber() {
        return this.serialNumber;
    }

    @Override // ru.CryptoPro.JCPxml.dsig.internal.dom.DOMStructure
    public void marshal(Node node, String str, DOMCryptoContext dOMCryptoContext) throws MarshalException {
        Document ownerDocument = DOMUtils.getOwnerDocument(node);
        Element createElement = DOMUtils.createElement(ownerDocument, "X509IssuerSerial", "http://www.w3.org/2000/09/xmldsig#", str);
        Element createElement2 = DOMUtils.createElement(ownerDocument, "X509IssuerName", "http://www.w3.org/2000/09/xmldsig#", str);
        Element createElement3 = DOMUtils.createElement(ownerDocument, "X509SerialNumber", "http://www.w3.org/2000/09/xmldsig#", str);
        createElement2.appendChild(ownerDocument.createTextNode(this.issuerName));
        createElement3.appendChild(ownerDocument.createTextNode(this.serialNumber.toString()));
        createElement.appendChild(createElement2);
        createElement.appendChild(createElement3);
        node.appendChild(createElement);
    }

    public DOMX509IssuerSerial(String str, BigInteger bigInteger) {
        if (str == null) {
            ny61.t("issuerName cannot be null");
            throw null;
        }
        if (bigInteger == null) {
            ny61.t("serialNumber cannot be null");
            throw null;
        }
        new X500Principal(str);
        this.issuerName = str;
        this.serialNumber = bigInteger;
    }
}
