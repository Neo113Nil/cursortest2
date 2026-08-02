package ru.CryptoPro.JCPxml.dsig.internal.dom;

import defpackage.dy31;
import defpackage.kbs;
import defpackage.ny61;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.AlgorithmParameterSpec;
import javax.xml.crypto.MarshalException;
import javax.xml.crypto.dom.DOMCryptoContext;
import javax.xml.crypto.dsig.SignatureMethod;
import javax.xml.crypto.dsig.SignedInfo;
import javax.xml.crypto.dsig.XMLSignContext;
import javax.xml.crypto.dsig.XMLSignatureException;
import javax.xml.crypto.dsig.XMLValidateContext;
import javax.xml.crypto.dsig.spec.SignatureMethodParameterSpec;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.xml.security.algorithms.implementations.SignatureECDSA;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCPxml.Consts;
import ru.CryptoPro.JCPxml.dsig.internal.SignerOutputStream;
import ru.CryptoPro.JCPxml.dsig.internal.dom.AbstractDOMSignatureMethod;
import ru.CryptoPro.JCPxml.dsig.internal.dom.DOMHMACSignatureMethod;

/* loaded from: classes4.dex */
public abstract class DOMSignatureMethod extends AbstractDOMSignatureMethod {
    static final String ECDSA_SHA1 = "http://www.w3.org/2001/04/xmldsig-more#ecdsa-sha1";
    static final String ECDSA_SHA256 = "http://www.w3.org/2001/04/xmldsig-more#ecdsa-sha256";
    static final String ECDSA_SHA384 = "http://www.w3.org/2001/04/xmldsig-more#ecdsa-sha384";
    static final String ECDSA_SHA512 = "http://www.w3.org/2001/04/xmldsig-more#ecdsa-sha512";
    static final String GOST3411_GOST3410 = "http://www.w3.org/2001/04/xmldsig-more#gostr34102001-gostr3411";
    static final String GOST3411_GOST3410_2012_256_URN = "urn:ietf:params:xml:ns:cpxmlsec:algorithms:gostr34102012-gostr34112012-256";
    static final String GOST3411_GOST3410_2012_512_URN = "urn:ietf:params:xml:ns:cpxmlsec:algorithms:gostr34102012-gostr34112012-512";
    static final String GOST3411_GOST3410_URN = "urn:ietf:params:xml:ns:cpxmlsec:algorithms:gostr34102001-gostr3411";
    static final String RSA_SHA256 = "http://www.w3.org/2001/04/xmldsig-more#rsa-sha256";
    static final String RSA_SHA384 = "http://www.w3.org/2001/04/xmldsig-more#rsa-sha384";
    static final String RSA_SHA512 = "http://www.w3.org/2001/04/xmldsig-more#rsa-sha512";
    private static Log log = LogFactory.getLog(DOMSignatureMethod.class);
    private SignatureMethodParameterSpec params;
    private Signature signature;

    public DOMSignatureMethod(Element element) throws MarshalException {
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

    private static byte[] convertASN1toXMLDSIG(byte[] bArr) throws IOException {
        byte b = bArr[3];
        int i = b;
        while (i > 0 && bArr[(b + 4) - i] == 0) {
            i--;
        }
        byte b2 = bArr[b + 5];
        int i2 = b2;
        while (i2 > 0 && bArr[((b + 6) + b2) - i2] == 0) {
            i2--;
        }
        if (bArr[0] == 48 && bArr[1] == bArr.length - 2 && bArr[2] == 2 && i <= 20) {
            int i3 = b + 4;
            if (bArr[i3] == 2 && i2 <= 20) {
                byte[] bArr2 = new byte[40];
                System.arraycopy(bArr, i3 - i, bArr2, 20 - i, i);
                System.arraycopy(bArr, ((b + 6) + b2) - i2, bArr2, 40 - i2, i2);
                return bArr2;
            }
        }
        ny61.v("Invalid ASN.1 format of DSA signature");
        return null;
    }

    private static byte[] convertXMLDSIGtoASN1(byte[] bArr) throws IOException {
        if (bArr.length != 40) {
            ny61.v("Invalid XMLDSIG format of DSA signature");
            return null;
        }
        int i = 20;
        int i2 = 20;
        while (i2 > 0 && bArr[20 - i2] == 0) {
            i2--;
        }
        int i3 = 20 - i2;
        int i4 = bArr[i3] < 0 ? i2 + 1 : i2;
        while (i > 0 && bArr[40 - i] == 0) {
            i--;
        }
        int i5 = 40 - i;
        int i6 = bArr[i5] < 0 ? i + 1 : i;
        int i7 = i4 + 6 + i6;
        byte[] bArr2 = new byte[i7];
        bArr2[0] = 48;
        int i8 = i4 + 4;
        bArr2[1] = (byte) (i8 + i6);
        bArr2[2] = 2;
        bArr2[3] = (byte) i4;
        System.arraycopy(bArr, i3, bArr2, i8 - i2, i2);
        bArr2[i8] = 2;
        bArr2[i4 + 5] = (byte) i6;
        System.arraycopy(bArr, i5, bArr2, i7 - i, i);
        return bArr2;
    }

    public static SignatureMethod unmarshal(Element element) throws MarshalException {
        String attributeValue = DOMUtils.getAttributeValue(element, "Algorithm");
        if (attributeValue.equals("http://www.w3.org/2000/09/xmldsig#rsa-sha1")) {
            return new SHA1withRSA(element);
        }
        if (attributeValue.equals(RSA_SHA256)) {
            return new SHA256withRSA(element);
        }
        if (attributeValue.equals(RSA_SHA384)) {
            return new SHA384withRSA(element);
        }
        if (attributeValue.equals(RSA_SHA512)) {
            return new SHA512withRSA(element);
        }
        if (attributeValue.equals("http://www.w3.org/2000/09/xmldsig#dsa-sha1")) {
            return new SHA1withDSA(element);
        }
        if (attributeValue.equals(ECDSA_SHA1)) {
            return new SHA1withECDSA(element);
        }
        if (attributeValue.equals(ECDSA_SHA256)) {
            return new SHA256withECDSA(element);
        }
        if (attributeValue.equals(ECDSA_SHA384)) {
            return new SHA384withECDSA(element);
        }
        if (attributeValue.equals(ECDSA_SHA512)) {
            return new SHA512withECDSA(element);
        }
        if (attributeValue.equals("http://www.w3.org/2000/09/xmldsig#hmac-sha1")) {
            return new DOMHMACSignatureMethod.SHA1(element);
        }
        if (attributeValue.equals("http://www.w3.org/2001/04/xmldsig-more#hmac-sha256")) {
            return new DOMHMACSignatureMethod.SHA256(element);
        }
        if (attributeValue.equals("http://www.w3.org/2001/04/xmldsig-more#hmac-sha384")) {
            return new DOMHMACSignatureMethod.SHA384(element);
        }
        if (attributeValue.equals("http://www.w3.org/2001/04/xmldsig-more#hmac-sha512")) {
            return new DOMHMACSignatureMethod.SHA512(element);
        }
        if (attributeValue.equals("http://www.w3.org/2001/04/xmldsig-more#gostr34102001-gostr3411")) {
            return new GOST3411withGOST3410(element);
        }
        if (attributeValue.equals("urn:ietf:params:xml:ns:cpxmlsec:algorithms:gostr34102001-gostr3411")) {
            return new GOST3411withGOST3410URN(element);
        }
        if (attributeValue.equals("urn:ietf:params:xml:ns:cpxmlsec:algorithms:gostr34102012-gostr34112012-256")) {
            return new GOST3411_2012_256withGOST3410_2012_256_URN(element);
        }
        if (attributeValue.equals("urn:ietf:params:xml:ns:cpxmlsec:algorithms:gostr34102012-gostr34112012-512")) {
            return new GOST3411_2012_512withGOST3410_2012_512_URN(element);
        }
        if (attributeValue.equals(Consts.URI_GOST_HMAC_GOSTR3411)) {
            return new DOMHMACSignatureMethod.HMAC_GOSTR3411_URI(element);
        }
        if (attributeValue.equals(Consts.URN_GOST_HMAC_GOSTR3411)) {
            return new DOMHMACSignatureMethod.HMAC_GOSTR3411_URN(element);
        }
        throw new MarshalException("unsupported SignatureMethod algorithm: ".concat(attributeValue));
    }

    @Override // ru.CryptoPro.JCPxml.dsig.internal.dom.AbstractDOMSignatureMethod
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    public final AlgorithmParameterSpec getParameterSpec() {
        return this.params;
    }

    @Override // ru.CryptoPro.JCPxml.dsig.internal.dom.AbstractDOMSignatureMethod, ru.CryptoPro.JCPxml.dsig.internal.dom.DOMStructure
    public /* bridge */ /* synthetic */ void marshal(Node node, String str, DOMCryptoContext dOMCryptoContext) throws MarshalException {
        super.marshal(node, str, dOMCryptoContext);
    }

    @Override // ru.CryptoPro.JCPxml.dsig.internal.dom.AbstractDOMSignatureMethod
    public byte[] sign(Key key, SignedInfo signedInfo, XMLSignContext xMLSignContext) throws InvalidKeyException, XMLSignatureException {
        if (key == null) {
            throw null;
        }
        if (signedInfo == null) {
            throw null;
        }
        if (!(key instanceof PrivateKey)) {
            dy31.v("key must be PrivateKey");
            return null;
        }
        if (this.signature == null) {
            try {
                String str = (String) xMLSignContext.getProperty("org.jcp.xml.dsig.internal.dom.SignatureProvider");
                try {
                    Utils.checkProvider(str);
                    if (log.isDebugEnabled()) {
                        log.debug("Signature Provider: " + str);
                    }
                    this.signature = str == null ? Signature.getInstance(getJCAAlgorithm()) : Signature.getInstance(getJCAAlgorithm(), str);
                } catch (Exception e) {
                    throw new XMLSignatureException(e);
                }
            } catch (NoSuchAlgorithmException e2) {
                throw new XMLSignatureException(e2);
            } catch (NoSuchProviderException e3) {
                throw new XMLSignatureException(e3);
            }
        }
        this.signature.initSign((PrivateKey) key);
        if (log.isDebugEnabled()) {
            log.debug("Resolved Signature Provider: " + this.signature.getProvider());
            log.debug("Signing with key: " + key);
        }
        ((DOMSignedInfo) signedInfo).canonicalize(xMLSignContext, new SignerOutputStream(this.signature));
        try {
            AbstractDOMSignatureMethod.Type algorithmType = getAlgorithmType();
            if (algorithmType == AbstractDOMSignatureMethod.Type.DSA) {
                return convertASN1toXMLDSIG(this.signature.sign());
            }
            AbstractDOMSignatureMethod.Type type = AbstractDOMSignatureMethod.Type.ECDSA;
            Signature signature = this.signature;
            return algorithmType == type ? SignatureECDSA.convertASN1toXMLDSIG(signature.sign()) : signature.sign();
        } catch (IOException e4) {
            throw new XMLSignatureException(e4);
        } catch (SignatureException e5) {
            throw new XMLSignatureException(e5);
        }
    }

    @Override // ru.CryptoPro.JCPxml.dsig.internal.dom.AbstractDOMSignatureMethod
    public boolean verify(Key key, SignedInfo signedInfo, byte[] bArr, XMLValidateContext xMLValidateContext) throws InvalidKeyException, SignatureException, XMLSignatureException {
        if (key == null || signedInfo == null || bArr == null) {
            throw null;
        }
        if (!(key instanceof PublicKey)) {
            dy31.v("key must be PublicKey");
            return false;
        }
        if (this.signature == null) {
            try {
                String str = (String) xMLValidateContext.getProperty("org.jcp.xml.dsig.internal.dom.SignatureProvider");
                try {
                    Utils.checkProvider(str);
                    if (log.isDebugEnabled()) {
                        log.debug("Signature Provider: " + str);
                    }
                    this.signature = str == null ? Signature.getInstance(getJCAAlgorithm()) : Signature.getInstance(getJCAAlgorithm(), str);
                } catch (Exception e) {
                    throw new XMLSignatureException(e);
                }
            } catch (NoSuchAlgorithmException e2) {
                throw new XMLSignatureException(e2);
            } catch (NoSuchProviderException e3) {
                throw new XMLSignatureException(e3);
            }
        }
        this.signature.initVerify((PublicKey) key);
        if (log.isDebugEnabled()) {
            log.debug("Resolved Signature Provider: " + this.signature.getProvider());
            log.debug("verifying with key: " + key);
        }
        ((DOMSignedInfo) signedInfo).canonicalize(xMLValidateContext, new SignerOutputStream(this.signature));
        try {
            AbstractDOMSignatureMethod.Type algorithmType = getAlgorithmType();
            if (algorithmType == AbstractDOMSignatureMethod.Type.DSA) {
                return this.signature.verify(convertXMLDSIGtoASN1(bArr));
            }
            AbstractDOMSignatureMethod.Type type = AbstractDOMSignatureMethod.Type.ECDSA;
            Signature signature = this.signature;
            return algorithmType == type ? signature.verify(SignatureECDSA.convertXMLDSIGtoASN1(bArr)) : signature.verify(bArr);
        } catch (IOException e4) {
            throw new XMLSignatureException(e4);
        }
    }

    final class GOST3411_2012_256withGOST3410_2012_256_URN extends DOMSignatureMethod {
        public GOST3411_2012_256withGOST3410_2012_256_URN(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidAlgorithmParameterException {
            super(algorithmParameterSpec);
        }

        public String getAlgorithm() {
            return "urn:ietf:params:xml:ns:cpxmlsec:algorithms:gostr34102012-gostr34112012-256";
        }

        @Override // ru.CryptoPro.JCPxml.dsig.internal.dom.AbstractDOMSignatureMethod
        public AbstractDOMSignatureMethod.Type getAlgorithmType() {
            return AbstractDOMSignatureMethod.Type.GOST_2012_256;
        }

        @Override // ru.CryptoPro.JCPxml.dsig.internal.dom.AbstractDOMSignatureMethod
        public String getJCAAlgorithm() {
            return JCP.GOST_SIGN_2012_256_NAME;
        }

        public GOST3411_2012_256withGOST3410_2012_256_URN(Element element) throws MarshalException {
            super(element);
        }
    }

    final class GOST3411_2012_512withGOST3410_2012_512_URN extends DOMSignatureMethod {
        public GOST3411_2012_512withGOST3410_2012_512_URN(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidAlgorithmParameterException {
            super(algorithmParameterSpec);
        }

        public String getAlgorithm() {
            return "urn:ietf:params:xml:ns:cpxmlsec:algorithms:gostr34102012-gostr34112012-512";
        }

        @Override // ru.CryptoPro.JCPxml.dsig.internal.dom.AbstractDOMSignatureMethod
        public AbstractDOMSignatureMethod.Type getAlgorithmType() {
            return AbstractDOMSignatureMethod.Type.GOST_2012_512;
        }

        @Override // ru.CryptoPro.JCPxml.dsig.internal.dom.AbstractDOMSignatureMethod
        public String getJCAAlgorithm() {
            return JCP.GOST_SIGN_2012_512_NAME;
        }

        public GOST3411_2012_512withGOST3410_2012_512_URN(Element element) throws MarshalException {
            super(element);
        }
    }

    final class GOST3411withGOST3410 extends DOMSignatureMethod {
        public GOST3411withGOST3410(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidAlgorithmParameterException {
            super(algorithmParameterSpec);
        }

        public String getAlgorithm() {
            return "http://www.w3.org/2001/04/xmldsig-more#gostr34102001-gostr3411";
        }

        @Override // ru.CryptoPro.JCPxml.dsig.internal.dom.AbstractDOMSignatureMethod
        public AbstractDOMSignatureMethod.Type getAlgorithmType() {
            return AbstractDOMSignatureMethod.Type.GOST;
        }

        @Override // ru.CryptoPro.JCPxml.dsig.internal.dom.AbstractDOMSignatureMethod
        public String getJCAAlgorithm() {
            return "GOST3411withGOST3410EL";
        }

        public GOST3411withGOST3410(Element element) throws MarshalException {
            super(element);
        }
    }

    final class GOST3411withGOST3410URN extends DOMSignatureMethod {
        public GOST3411withGOST3410URN(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidAlgorithmParameterException {
            super(algorithmParameterSpec);
        }

        public String getAlgorithm() {
            return "urn:ietf:params:xml:ns:cpxmlsec:algorithms:gostr34102001-gostr3411";
        }

        @Override // ru.CryptoPro.JCPxml.dsig.internal.dom.AbstractDOMSignatureMethod
        public AbstractDOMSignatureMethod.Type getAlgorithmType() {
            return AbstractDOMSignatureMethod.Type.GOST;
        }

        @Override // ru.CryptoPro.JCPxml.dsig.internal.dom.AbstractDOMSignatureMethod
        public String getJCAAlgorithm() {
            return "GOST3411withGOST3410EL";
        }

        public GOST3411withGOST3410URN(Element element) throws MarshalException {
            super(element);
        }
    }

    final class SHA1withDSA extends DOMSignatureMethod {
        public SHA1withDSA(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidAlgorithmParameterException {
            super(algorithmParameterSpec);
        }

        public String getAlgorithm() {
            return "http://www.w3.org/2000/09/xmldsig#dsa-sha1";
        }

        @Override // ru.CryptoPro.JCPxml.dsig.internal.dom.AbstractDOMSignatureMethod
        public AbstractDOMSignatureMethod.Type getAlgorithmType() {
            return AbstractDOMSignatureMethod.Type.DSA;
        }

        @Override // ru.CryptoPro.JCPxml.dsig.internal.dom.AbstractDOMSignatureMethod
        public String getJCAAlgorithm() {
            return "SHA1withDSA";
        }

        public SHA1withDSA(Element element) throws MarshalException {
            super(element);
        }
    }

    final class SHA1withECDSA extends DOMSignatureMethod {
        public SHA1withECDSA(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidAlgorithmParameterException {
            super(algorithmParameterSpec);
        }

        public String getAlgorithm() {
            return DOMSignatureMethod.ECDSA_SHA1;
        }

        @Override // ru.CryptoPro.JCPxml.dsig.internal.dom.AbstractDOMSignatureMethod
        public AbstractDOMSignatureMethod.Type getAlgorithmType() {
            return AbstractDOMSignatureMethod.Type.ECDSA;
        }

        @Override // ru.CryptoPro.JCPxml.dsig.internal.dom.AbstractDOMSignatureMethod
        public String getJCAAlgorithm() {
            return JCP.SIGN_SHA1_ECDSA_NAME;
        }

        public SHA1withECDSA(Element element) throws MarshalException {
            super(element);
        }
    }

    final class SHA1withRSA extends DOMSignatureMethod {
        public SHA1withRSA(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidAlgorithmParameterException {
            super(algorithmParameterSpec);
        }

        public String getAlgorithm() {
            return "http://www.w3.org/2000/09/xmldsig#rsa-sha1";
        }

        @Override // ru.CryptoPro.JCPxml.dsig.internal.dom.AbstractDOMSignatureMethod
        public AbstractDOMSignatureMethod.Type getAlgorithmType() {
            return AbstractDOMSignatureMethod.Type.RSA;
        }

        @Override // ru.CryptoPro.JCPxml.dsig.internal.dom.AbstractDOMSignatureMethod
        public String getJCAAlgorithm() {
            return JCP.SIGN_SHA1_RSA_NAME;
        }

        public SHA1withRSA(Element element) throws MarshalException {
            super(element);
        }
    }

    final class SHA256withECDSA extends DOMSignatureMethod {
        public SHA256withECDSA(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidAlgorithmParameterException {
            super(algorithmParameterSpec);
        }

        public String getAlgorithm() {
            return DOMSignatureMethod.ECDSA_SHA256;
        }

        @Override // ru.CryptoPro.JCPxml.dsig.internal.dom.AbstractDOMSignatureMethod
        public AbstractDOMSignatureMethod.Type getAlgorithmType() {
            return AbstractDOMSignatureMethod.Type.ECDSA;
        }

        @Override // ru.CryptoPro.JCPxml.dsig.internal.dom.AbstractDOMSignatureMethod
        public String getJCAAlgorithm() {
            return JCP.SIGN_SHA256_ECDSA_NAME;
        }

        public SHA256withECDSA(Element element) throws MarshalException {
            super(element);
        }
    }

    final class SHA256withRSA extends DOMSignatureMethod {
        public SHA256withRSA(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidAlgorithmParameterException {
            super(algorithmParameterSpec);
        }

        public String getAlgorithm() {
            return DOMSignatureMethod.RSA_SHA256;
        }

        @Override // ru.CryptoPro.JCPxml.dsig.internal.dom.AbstractDOMSignatureMethod
        public AbstractDOMSignatureMethod.Type getAlgorithmType() {
            return AbstractDOMSignatureMethod.Type.RSA;
        }

        @Override // ru.CryptoPro.JCPxml.dsig.internal.dom.AbstractDOMSignatureMethod
        public String getJCAAlgorithm() {
            return JCP.SIGN_SHA256_RSA_NAME;
        }

        public SHA256withRSA(Element element) throws MarshalException {
            super(element);
        }
    }

    final class SHA384withECDSA extends DOMSignatureMethod {
        public SHA384withECDSA(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidAlgorithmParameterException {
            super(algorithmParameterSpec);
        }

        public String getAlgorithm() {
            return DOMSignatureMethod.ECDSA_SHA384;
        }

        @Override // ru.CryptoPro.JCPxml.dsig.internal.dom.AbstractDOMSignatureMethod
        public AbstractDOMSignatureMethod.Type getAlgorithmType() {
            return AbstractDOMSignatureMethod.Type.ECDSA;
        }

        @Override // ru.CryptoPro.JCPxml.dsig.internal.dom.AbstractDOMSignatureMethod
        public String getJCAAlgorithm() {
            return JCP.SIGN_SHA384_ECDSA_NAME;
        }

        public SHA384withECDSA(Element element) throws MarshalException {
            super(element);
        }
    }

    final class SHA384withRSA extends DOMSignatureMethod {
        public SHA384withRSA(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidAlgorithmParameterException {
            super(algorithmParameterSpec);
        }

        public String getAlgorithm() {
            return DOMSignatureMethod.RSA_SHA384;
        }

        @Override // ru.CryptoPro.JCPxml.dsig.internal.dom.AbstractDOMSignatureMethod
        public AbstractDOMSignatureMethod.Type getAlgorithmType() {
            return AbstractDOMSignatureMethod.Type.RSA;
        }

        @Override // ru.CryptoPro.JCPxml.dsig.internal.dom.AbstractDOMSignatureMethod
        public String getJCAAlgorithm() {
            return JCP.SIGN_SHA384_RSA_NAME;
        }

        public SHA384withRSA(Element element) throws MarshalException {
            super(element);
        }
    }

    final class SHA512withECDSA extends DOMSignatureMethod {
        public SHA512withECDSA(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidAlgorithmParameterException {
            super(algorithmParameterSpec);
        }

        public String getAlgorithm() {
            return DOMSignatureMethod.ECDSA_SHA512;
        }

        @Override // ru.CryptoPro.JCPxml.dsig.internal.dom.AbstractDOMSignatureMethod
        public AbstractDOMSignatureMethod.Type getAlgorithmType() {
            return AbstractDOMSignatureMethod.Type.ECDSA;
        }

        @Override // ru.CryptoPro.JCPxml.dsig.internal.dom.AbstractDOMSignatureMethod
        public String getJCAAlgorithm() {
            return JCP.SIGN_SHA512_ECDSA_NAME;
        }

        public SHA512withECDSA(Element element) throws MarshalException {
            super(element);
        }
    }

    final class SHA512withRSA extends DOMSignatureMethod {
        public SHA512withRSA(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidAlgorithmParameterException {
            super(algorithmParameterSpec);
        }

        public String getAlgorithm() {
            return DOMSignatureMethod.RSA_SHA512;
        }

        @Override // ru.CryptoPro.JCPxml.dsig.internal.dom.AbstractDOMSignatureMethod
        public AbstractDOMSignatureMethod.Type getAlgorithmType() {
            return AbstractDOMSignatureMethod.Type.RSA;
        }

        @Override // ru.CryptoPro.JCPxml.dsig.internal.dom.AbstractDOMSignatureMethod
        public String getJCAAlgorithm() {
            return JCP.SIGN_SHA512_RSA_NAME;
        }

        public SHA512withRSA(Element element) throws MarshalException {
            super(element);
        }
    }

    public DOMSignatureMethod(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidAlgorithmParameterException {
        if (algorithmParameterSpec != null && !(algorithmParameterSpec instanceof SignatureMethodParameterSpec)) {
            kbs.t("params must be of type SignatureMethodParameterSpec");
            throw null;
        }
        SignatureMethodParameterSpec signatureMethodParameterSpec = (SignatureMethodParameterSpec) algorithmParameterSpec;
        checkParams(signatureMethodParameterSpec);
        this.params = signatureMethodParameterSpec;
    }
}
