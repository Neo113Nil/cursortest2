package ru.CryptoPro.JCPxml.dsig.internal.dom;

import defpackage.ny61;
import java.math.BigInteger;
import java.security.KeyException;
import java.security.PublicKey;
import java.util.List;
import javax.xml.crypto.MarshalException;
import javax.xml.crypto.URIDereferencer;
import javax.xml.crypto.XMLStructure;
import javax.xml.crypto.dom.DOMCryptoContext;
import javax.xml.crypto.dsig.keyinfo.KeyInfo;
import javax.xml.crypto.dsig.keyinfo.KeyInfoFactory;
import javax.xml.crypto.dsig.keyinfo.KeyName;
import javax.xml.crypto.dsig.keyinfo.KeyValue;
import javax.xml.crypto.dsig.keyinfo.PGPData;
import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;
import javax.xml.crypto.dsig.keyinfo.X509Data;
import javax.xml.crypto.dsig.keyinfo.X509IssuerSerial;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCPxml.dsig.internal.dom.DOMKeyValue;

/* loaded from: classes4.dex */
public final class DOMKeyInfoFactory extends KeyInfoFactory {

    class UnmarshalContext extends DOMCryptoContext {
    }

    public URIDereferencer getURIDereferencer() {
        return DOMURIDereferencer.INSTANCE;
    }

    public boolean isFeatureSupported(String str) {
        str.getClass();
        return false;
    }

    public KeyInfo newKeyInfo(List list) {
        return newKeyInfo(list, null);
    }

    public KeyName newKeyName(String str) {
        return new DOMKeyName(str);
    }

    public KeyValue newKeyValue(PublicKey publicKey) throws KeyException {
        String algorithm = publicKey.getAlgorithm();
        if (algorithm.equals("DSA")) {
            return new DOMKeyValue.DSA(publicKey);
        }
        if (algorithm.equals("RSA")) {
            return new DOMKeyValue.RSA(publicKey);
        }
        if (algorithm.equals("EC")) {
            return new DOMKeyValue.EC(publicKey);
        }
        if (algorithm.equals(JCP.GOST_EL_DEGREE_NAME) || algorithm.equals(JCP.GOST_EL_2012_256_NAME) || algorithm.equals(JCP.GOST_EL_2012_512_NAME)) {
            return new DOMKeyValue.GOST3410_XXX(publicKey);
        }
        throw new KeyException("unsupported key algorithm: ".concat(algorithm));
    }

    public PGPData newPGPData(byte[] bArr) {
        return newPGPData(bArr, null, null);
    }

    public RetrievalMethod newRetrievalMethod(String str, String str2, List list) {
        if (str != null) {
            return new DOMRetrievalMethod(str, str2, list);
        }
        ny61.t("uri must not be null");
        return null;
    }

    public X509Data newX509Data(List list) {
        return new DOMX509Data(list);
    }

    public X509IssuerSerial newX509IssuerSerial(String str, BigInteger bigInteger) {
        return new DOMX509IssuerSerial(str, bigInteger);
    }

    public KeyInfo unmarshalKeyInfo(XMLStructure xMLStructure) throws MarshalException {
        Element element;
        if (xMLStructure == null) {
            ny61.t("xmlStructure cannot be null");
            return null;
        }
        Node node = ((javax.xml.crypto.dom.DOMStructure) xMLStructure).getNode();
        node.normalize();
        if (node.getNodeType() == 9) {
            element = ((Document) node).getDocumentElement();
        } else {
            if (node.getNodeType() != 1) {
                throw new MarshalException("xmlStructure does not contain a proper Node");
            }
            element = (Element) node;
        }
        String localName = element.getLocalName();
        if (localName == null) {
            throw new MarshalException("Document implementation must support DOM Level 2 and be namespace aware");
        }
        if (localName.equals("KeyInfo")) {
            return new DOMKeyInfo(element, new UnmarshalContext(), getProvider());
        }
        throw new MarshalException("invalid KeyInfo tag: ".concat(localName));
    }

    public KeyInfo newKeyInfo(List list, String str) {
        return new DOMKeyInfo(list, str);
    }

    public PGPData newPGPData(byte[] bArr, List list) {
        return new DOMPGPData(bArr, list);
    }

    public PGPData newPGPData(byte[] bArr, byte[] bArr2, List list) {
        return new DOMPGPData(bArr, bArr2, list);
    }

    public RetrievalMethod newRetrievalMethod(String str) {
        return newRetrievalMethod(str, null, null);
    }
}
