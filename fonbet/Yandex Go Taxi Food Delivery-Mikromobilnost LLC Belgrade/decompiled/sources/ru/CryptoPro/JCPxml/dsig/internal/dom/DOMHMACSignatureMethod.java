package ru.CryptoPro.JCPxml.dsig.internal.dom;

import defpackage.dy31;
import defpackage.kbs;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SignatureException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.xml.crypto.MarshalException;
import javax.xml.crypto.dom.DOMCryptoContext;
import javax.xml.crypto.dsig.SignedInfo;
import javax.xml.crypto.dsig.XMLSignContext;
import javax.xml.crypto.dsig.XMLSignatureException;
import javax.xml.crypto.dsig.XMLValidateContext;
import javax.xml.crypto.dsig.spec.HMACParameterSpec;
import javax.xml.crypto.dsig.spec.SignatureMethodParameterSpec;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import ru.CryptoPro.JCPxml.dsig.internal.MacOutputStream;
import ru.CryptoPro.JCPxml.dsig.internal.dom.AbstractDOMSignatureMethod;

/* loaded from: classes4.dex */
public abstract class DOMHMACSignatureMethod extends AbstractDOMSignatureMethod {
    static final String HMAC_GOSTR3411_URI = "http://www.w3.org/2001/04/xmldsig-more#hmac-gostr3411";
    static final String HMAC_GOSTR3411_URN = "urn:ietf:params:xml:ns:cpxmlsec:algorithms:hmac-gostr3411";
    static final String HMAC_SHA256 = "http://www.w3.org/2001/04/xmldsig-more#hmac-sha256";
    static final String HMAC_SHA384 = "http://www.w3.org/2001/04/xmldsig-more#hmac-sha384";
    static final String HMAC_SHA512 = "http://www.w3.org/2001/04/xmldsig-more#hmac-sha512";
    private static Log log = LogFactory.getLog(DOMHMACSignatureMethod.class);
    private Mac hmac;
    private int outputLength;
    private boolean outputLengthSet;
    private SignatureMethodParameterSpec params;

    public DOMHMACSignatureMethod(Element element) throws MarshalException {
        Element firstChildElement = DOMUtils.getFirstChildElement(element);
        if (firstChildElement != null) {
            this.params = unmarshalParams(firstChildElement);
        }
        try {
            checkParams(this.params);
        } catch (InvalidAlgorithmParameterException e) {
            throw new MarshalException(e);
        }
    }

    @Override // ru.CryptoPro.JCPxml.dsig.internal.dom.AbstractDOMSignatureMethod
    public void checkParams(SignatureMethodParameterSpec signatureMethodParameterSpec) throws InvalidAlgorithmParameterException {
        if (signatureMethodParameterSpec != null) {
            if (!(signatureMethodParameterSpec instanceof HMACParameterSpec)) {
                kbs.t("params must be of type HMACParameterSpec");
                return;
            }
            this.outputLength = ((HMACParameterSpec) signatureMethodParameterSpec).getOutputLength();
            this.outputLengthSet = true;
            if (log.isDebugEnabled()) {
                log.debug("Setting outputLength from HMACParameterSpec to: " + this.outputLength);
            }
        }
    }

    @Override // ru.CryptoPro.JCPxml.dsig.internal.dom.AbstractDOMSignatureMethod
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // ru.CryptoPro.JCPxml.dsig.internal.dom.AbstractDOMSignatureMethod
    public AbstractDOMSignatureMethod.Type getAlgorithmType() {
        return AbstractDOMSignatureMethod.Type.HMAC;
    }

    public abstract int getDigestLength();

    public final AlgorithmParameterSpec getParameterSpec() {
        return this.params;
    }

    @Override // ru.CryptoPro.JCPxml.dsig.internal.dom.AbstractDOMSignatureMethod, ru.CryptoPro.JCPxml.dsig.internal.dom.DOMStructure
    public /* bridge */ /* synthetic */ void marshal(Node node, String str, DOMCryptoContext dOMCryptoContext) throws MarshalException {
        super.marshal(node, str, dOMCryptoContext);
    }

    @Override // ru.CryptoPro.JCPxml.dsig.internal.dom.AbstractDOMSignatureMethod
    public void marshalParams(Element element, String str) throws MarshalException {
        Document ownerDocument = DOMUtils.getOwnerDocument(element);
        Element createElement = DOMUtils.createElement(ownerDocument, "HMACOutputLength", "http://www.w3.org/2000/09/xmldsig#", str);
        createElement.appendChild(ownerDocument.createTextNode(String.valueOf(this.outputLength)));
        element.appendChild(createElement);
    }

    @Override // ru.CryptoPro.JCPxml.dsig.internal.dom.AbstractDOMSignatureMethod
    public boolean paramsEqual(AlgorithmParameterSpec algorithmParameterSpec) {
        if (getParameterSpec() == algorithmParameterSpec) {
            return true;
        }
        return (algorithmParameterSpec instanceof HMACParameterSpec) && this.outputLength == ((HMACParameterSpec) algorithmParameterSpec).getOutputLength();
    }

    @Override // ru.CryptoPro.JCPxml.dsig.internal.dom.AbstractDOMSignatureMethod
    public byte[] sign(Key key, SignedInfo signedInfo, XMLSignContext xMLSignContext) throws InvalidKeyException, XMLSignatureException {
        if (key == null) {
            throw null;
        }
        if (signedInfo == null) {
            throw null;
        }
        if (!(key instanceof SecretKey)) {
            dy31.v("key must be SecretKey");
            return null;
        }
        if (this.hmac == null) {
            try {
                this.hmac = Mac.getInstance(getJCAAlgorithm());
            } catch (NoSuchAlgorithmException e) {
                throw new XMLSignatureException(e);
            }
        }
        if (!this.outputLengthSet || this.outputLength >= getDigestLength()) {
            this.hmac.init((SecretKey) key);
            ((DOMSignedInfo) signedInfo).canonicalize(xMLSignContext, new MacOutputStream(this.hmac));
            return this.hmac.doFinal();
        }
        throw new XMLSignatureException("HMACOutputLength must not be less than " + getDigestLength());
    }

    @Override // ru.CryptoPro.JCPxml.dsig.internal.dom.AbstractDOMSignatureMethod
    public SignatureMethodParameterSpec unmarshalParams(Element element) throws MarshalException {
        this.outputLength = new Integer(element.getFirstChild().getNodeValue()).intValue();
        this.outputLengthSet = true;
        if (log.isDebugEnabled()) {
            log.debug("unmarshalled outputLength: " + this.outputLength);
        }
        return new HMACParameterSpec(this.outputLength);
    }

    @Override // ru.CryptoPro.JCPxml.dsig.internal.dom.AbstractDOMSignatureMethod
    public boolean verify(Key key, SignedInfo signedInfo, byte[] bArr, XMLValidateContext xMLValidateContext) throws InvalidKeyException, SignatureException, XMLSignatureException {
        if (key == null || signedInfo == null || bArr == null) {
            throw null;
        }
        if (!(key instanceof SecretKey)) {
            dy31.v("key must be SecretKey");
            return false;
        }
        if (this.hmac == null) {
            try {
                this.hmac = Mac.getInstance(getJCAAlgorithm());
            } catch (NoSuchAlgorithmException e) {
                throw new XMLSignatureException(e);
            }
        }
        if (!this.outputLengthSet || this.outputLength >= getDigestLength()) {
            this.hmac.init((SecretKey) key);
            ((DOMSignedInfo) signedInfo).canonicalize(xMLValidateContext, new MacOutputStream(this.hmac));
            return MessageDigest.isEqual(bArr, this.hmac.doFinal());
        }
        throw new XMLSignatureException("HMACOutputLength must not be less than " + getDigestLength());
    }

    final class HMAC_GOSTR3411_URI extends DOMHMACSignatureMethod {
        public HMAC_GOSTR3411_URI(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidAlgorithmParameterException {
            super(algorithmParameterSpec);
        }

        public String getAlgorithm() {
            return "http://www.w3.org/2001/04/xmldsig-more#hmac-gostr3411";
        }

        @Override // ru.CryptoPro.JCPxml.dsig.internal.dom.DOMHMACSignatureMethod
        public int getDigestLength() {
            return 256;
        }

        @Override // ru.CryptoPro.JCPxml.dsig.internal.dom.AbstractDOMSignatureMethod
        public String getJCAAlgorithm() {
            return "HMAC_GOSTR3411";
        }

        public HMAC_GOSTR3411_URI(Element element) throws MarshalException {
            super(element);
        }
    }

    final class HMAC_GOSTR3411_URN extends DOMHMACSignatureMethod {
        public HMAC_GOSTR3411_URN(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidAlgorithmParameterException {
            super(algorithmParameterSpec);
        }

        public String getAlgorithm() {
            return "urn:ietf:params:xml:ns:cpxmlsec:algorithms:hmac-gostr3411";
        }

        @Override // ru.CryptoPro.JCPxml.dsig.internal.dom.DOMHMACSignatureMethod
        public int getDigestLength() {
            return 256;
        }

        @Override // ru.CryptoPro.JCPxml.dsig.internal.dom.AbstractDOMSignatureMethod
        public String getJCAAlgorithm() {
            return "HMAC_GOSTR3411";
        }

        public HMAC_GOSTR3411_URN(Element element) throws MarshalException {
            super(element);
        }
    }

    final class SHA1 extends DOMHMACSignatureMethod {
        public SHA1(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidAlgorithmParameterException {
            super(algorithmParameterSpec);
        }

        public String getAlgorithm() {
            return "http://www.w3.org/2000/09/xmldsig#hmac-sha1";
        }

        @Override // ru.CryptoPro.JCPxml.dsig.internal.dom.DOMHMACSignatureMethod
        public int getDigestLength() {
            return 160;
        }

        @Override // ru.CryptoPro.JCPxml.dsig.internal.dom.AbstractDOMSignatureMethod
        public String getJCAAlgorithm() {
            return "HmacSHA1";
        }

        public SHA1(Element element) throws MarshalException {
            super(element);
        }
    }

    final class SHA256 extends DOMHMACSignatureMethod {
        public SHA256(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidAlgorithmParameterException {
            super(algorithmParameterSpec);
        }

        public String getAlgorithm() {
            return DOMHMACSignatureMethod.HMAC_SHA256;
        }

        @Override // ru.CryptoPro.JCPxml.dsig.internal.dom.DOMHMACSignatureMethod
        public int getDigestLength() {
            return 256;
        }

        @Override // ru.CryptoPro.JCPxml.dsig.internal.dom.AbstractDOMSignatureMethod
        public String getJCAAlgorithm() {
            return "HmacSHA256";
        }

        public SHA256(Element element) throws MarshalException {
            super(element);
        }
    }

    final class SHA384 extends DOMHMACSignatureMethod {
        public SHA384(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidAlgorithmParameterException {
            super(algorithmParameterSpec);
        }

        public String getAlgorithm() {
            return DOMHMACSignatureMethod.HMAC_SHA384;
        }

        @Override // ru.CryptoPro.JCPxml.dsig.internal.dom.DOMHMACSignatureMethod
        public int getDigestLength() {
            return 384;
        }

        @Override // ru.CryptoPro.JCPxml.dsig.internal.dom.AbstractDOMSignatureMethod
        public String getJCAAlgorithm() {
            return "HmacSHA384";
        }

        public SHA384(Element element) throws MarshalException {
            super(element);
        }
    }

    final class SHA512 extends DOMHMACSignatureMethod {
        public SHA512(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidAlgorithmParameterException {
            super(algorithmParameterSpec);
        }

        public String getAlgorithm() {
            return DOMHMACSignatureMethod.HMAC_SHA512;
        }

        @Override // ru.CryptoPro.JCPxml.dsig.internal.dom.DOMHMACSignatureMethod
        public int getDigestLength() {
            return 512;
        }

        @Override // ru.CryptoPro.JCPxml.dsig.internal.dom.AbstractDOMSignatureMethod
        public String getJCAAlgorithm() {
            return "HmacSHA512";
        }

        public SHA512(Element element) throws MarshalException {
            super(element);
        }
    }

    public DOMHMACSignatureMethod(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidAlgorithmParameterException {
        SignatureMethodParameterSpec signatureMethodParameterSpec = (SignatureMethodParameterSpec) algorithmParameterSpec;
        checkParams(signatureMethodParameterSpec);
        this.params = signatureMethodParameterSpec;
    }
}
