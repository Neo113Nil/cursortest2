package ru.CryptoPro.JCPxml.xmldsig;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.AlgorithmParameterSpec;
import org.apache.xml.security.algorithms.JCEMapper;
import org.apache.xml.security.algorithms.SignatureAlgorithmSpi;
import org.apache.xml.security.signature.XMLSignatureException;
import org.w3c.dom.Element;
import ru.CryptoPro.JCP.tools.JCPLogger;

/* loaded from: classes4.dex */
public abstract class SignatureGostR3410 extends SignatureAlgorithmSpi {
    private Signature _signatureAlgorithm;

    public class SignatureGostR34102001GostR3411 extends SignatureGostR3410 {
        public static final String _URI = "http://www.w3.org/2001/04/xmldsig-more#gostr34102001-gostr3411";

        @Override // ru.CryptoPro.JCPxml.xmldsig.SignatureGostR3410
        public String engineGetURI() {
            return "http://www.w3.org/2001/04/xmldsig-more#gostr34102001-gostr3411";
        }
    }

    public class SignatureGostR34102001GostR3411URN extends SignatureGostR3410 {
        public static final String _URI = "urn:ietf:params:xml:ns:cpxmlsec:algorithms:gostr34102001-gostr3411";

        @Override // ru.CryptoPro.JCPxml.xmldsig.SignatureGostR3410
        public String engineGetURI() {
            return "http://www.w3.org/2001/04/xmldsig-more#gostr34102001-gostr3411";
        }
    }

    public class SignatureGostR34102012_256_GostR3411_2012_256_URN extends SignatureGostR3410 {
        public static final String _URI = "urn:ietf:params:xml:ns:cpxmlsec:algorithms:gostr34102012-gostr34112012-256";

        @Override // ru.CryptoPro.JCPxml.xmldsig.SignatureGostR3410
        public String engineGetURI() {
            return "urn:ietf:params:xml:ns:cpxmlsec:algorithms:gostr34102012-gostr34112012-256";
        }
    }

    public class SignatureGostR34102012_512_GostR3411_2012_512_URN extends SignatureGostR3410 {
        public static final String _URI = "urn:ietf:params:xml:ns:cpxmlsec:algorithms:gostr34102012-gostr34112012-512";

        @Override // ru.CryptoPro.JCPxml.xmldsig.SignatureGostR3410
        public String engineGetURI() {
            return "urn:ietf:params:xml:ns:cpxmlsec:algorithms:gostr34102012-gostr34112012-512";
        }
    }

    public SignatureGostR3410() throws XMLSignatureException {
        this._signatureAlgorithm = null;
        String translateURItoJCEID = JCEMapper.translateURItoJCEID(engineGetURI());
        JCPLogger.fine("Created SignatureGostR3410 using algorithm " + translateURItoJCEID);
        String providerId = JCEMapper.getProviderId();
        if (providerId != null && !providerId.equalsIgnoreCase("JCP") && !providerId.equalsIgnoreCase("JCSP")) {
            throw new XMLSignatureException("Invalid provider: ".concat(providerId));
        }
        JCPLogger.fine("Created SignatureGostR3410 using provider " + providerId);
        try {
            this._signatureAlgorithm = providerId != null ? Signature.getInstance(translateURItoJCEID, providerId) : Signature.getInstance(translateURItoJCEID);
        } catch (NoSuchAlgorithmException e) {
            throw new XMLSignatureException("algorithms.NoSuchAlgorithm", new Object[]{translateURItoJCEID, e.getLocalizedMessage()});
        } catch (NoSuchProviderException e2) {
            throw new XMLSignatureException("algorithms.NoSuchProvider", new Object[]{providerId, e2.getLocalizedMessage()});
        }
    }

    public void engineGetContextFromElement(Element element) {
    }

    public String engineGetJCEAlgorithmString() {
        return this._signatureAlgorithm.getAlgorithm();
    }

    public String engineGetJCEProviderName() {
        return this._signatureAlgorithm.getProvider().getName();
    }

    public abstract String engineGetURI();

    public void engineInitSign(Key key) throws XMLSignatureException {
        if (!(key instanceof PrivateKey)) {
            throw new XMLSignatureException("algorithms.WrongKeyForThisOperation", new Object[]{key.getClass().getName(), PrivateKey.class.getName()});
        }
        try {
            this._signatureAlgorithm.initSign((PrivateKey) key);
        } catch (InvalidKeyException e) {
            throw new XMLSignatureException("empty", e);
        }
    }

    public void engineInitVerify(Key key) throws XMLSignatureException {
        if (!(key instanceof PublicKey)) {
            throw new XMLSignatureException("algorithms.WrongKeyForThisOperation", new Object[]{key.getClass().getName(), PublicKey.class.getName()});
        }
        try {
            this._signatureAlgorithm.initVerify((PublicKey) key);
        } catch (InvalidKeyException e) {
            throw new XMLSignatureException("empty", e);
        }
    }

    public void engineSetHMACOutputLength(int i) throws XMLSignatureException {
        throw new XMLSignatureException("algorithms.HMACOutputLengthOnlyForHMAC");
    }

    public void engineSetParameter(AlgorithmParameterSpec algorithmParameterSpec) throws XMLSignatureException {
        try {
            this._signatureAlgorithm.setParameter(algorithmParameterSpec);
        } catch (InvalidAlgorithmParameterException e) {
            throw new XMLSignatureException("empty", e);
        }
    }

    public byte[] engineSign() throws XMLSignatureException {
        try {
            return this._signatureAlgorithm.sign();
        } catch (SignatureException e) {
            throw new XMLSignatureException("empty", e);
        }
    }

    public void engineUpdate(byte b) throws XMLSignatureException {
        try {
            this._signatureAlgorithm.update(b);
        } catch (SignatureException e) {
            throw new XMLSignatureException("empty", e);
        }
    }

    public boolean engineVerify(byte[] bArr) throws XMLSignatureException {
        try {
            return this._signatureAlgorithm.verify(bArr);
        } catch (SignatureException e) {
            throw new XMLSignatureException("empty", e);
        }
    }

    public void engineUpdate(byte[] bArr) throws XMLSignatureException {
        try {
            this._signatureAlgorithm.update(bArr);
        } catch (SignatureException e) {
            throw new XMLSignatureException("empty", e);
        }
    }

    public void engineUpdate(byte[] bArr, int i, int i2) throws XMLSignatureException {
        try {
            this._signatureAlgorithm.update(bArr, i, i2);
        } catch (SignatureException e) {
            throw new XMLSignatureException("empty", e);
        }
    }

    public void engineInitSign(Key key, SecureRandom secureRandom) throws XMLSignatureException {
        if (!(key instanceof PrivateKey)) {
            throw new XMLSignatureException("algorithms.WrongKeyForThisOperation", new Object[]{key.getClass().getName(), PrivateKey.class.getName()});
        }
        try {
            this._signatureAlgorithm.initSign((PrivateKey) key, secureRandom);
        } catch (InvalidKeyException e) {
            throw new XMLSignatureException("empty", e);
        }
    }

    public void engineInitSign(Key key, AlgorithmParameterSpec algorithmParameterSpec) throws XMLSignatureException {
        throw new XMLSignatureException("algorithms.CannotUseAlgorithmParameterSpecOnSignatureGostR34102001");
    }
}
