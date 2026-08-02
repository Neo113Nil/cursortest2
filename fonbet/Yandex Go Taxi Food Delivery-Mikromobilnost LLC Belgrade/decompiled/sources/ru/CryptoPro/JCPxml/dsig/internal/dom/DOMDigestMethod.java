package ru.CryptoPro.JCPxml.dsig.internal.dom;

import defpackage.kbs;
import java.security.InvalidAlgorithmParameterException;
import java.security.spec.AlgorithmParameterSpec;
import javax.xml.crypto.MarshalException;
import javax.xml.crypto.dom.DOMCryptoContext;
import javax.xml.crypto.dsig.DigestMethod;
import javax.xml.crypto.dsig.spec.DigestMethodParameterSpec;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCPxml.Consts;

/* loaded from: classes4.dex */
public abstract class DOMDigestMethod extends DOMStructure implements DigestMethod {
    static final String SHA384 = "http://www.w3.org/2001/04/xmldsig-more#sha384";
    private DigestMethodParameterSpec params;

    public DOMDigestMethod(Element element) throws MarshalException {
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

    public static DigestMethod unmarshal(Element element) throws MarshalException {
        String attributeValue = DOMUtils.getAttributeValue(element, "Algorithm");
        if (attributeValue.equals("http://www.w3.org/2000/09/xmldsig#sha1")) {
            return new SHA1(element);
        }
        if (attributeValue.equals("http://www.w3.org/2001/04/xmlenc#sha256")) {
            return new SHA256(element);
        }
        if (attributeValue.equals(SHA384)) {
            return new SHA384(element);
        }
        if (attributeValue.equals("http://www.w3.org/2001/04/xmlenc#sha512")) {
            return new SHA512(element);
        }
        if (attributeValue.equals(Consts.URI_GOST_DIGEST)) {
            return new GOST3411(element);
        }
        if (attributeValue.equals(Consts.URN_GOST_DIGEST)) {
            return new GOST3411URN(element);
        }
        if (attributeValue.equals(Consts.URN_GOST_DIGEST_2012_256)) {
            return new GOST3411_2012_256_URN(element);
        }
        if (attributeValue.equals(Consts.URN_GOST_DIGEST_2012_512)) {
            return new GOST3411_2012_512_URN(element);
        }
        throw new MarshalException("unsupported DigestMethod algorithm: ".concat(attributeValue));
    }

    public void checkParams(DigestMethodParameterSpec digestMethodParameterSpec) throws InvalidAlgorithmParameterException {
        if (digestMethodParameterSpec == null) {
            return;
        }
        throw new InvalidAlgorithmParameterException("no parameters should be specified for the " + getMessageDigestAlgorithm() + " DigestMethod algorithm");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DigestMethod)) {
            return false;
        }
        DigestMethod digestMethod = (DigestMethod) obj;
        DigestMethodParameterSpec digestMethodParameterSpec = this.params;
        return getAlgorithm().equals(digestMethod.getAlgorithm()) && (digestMethodParameterSpec == null ? digestMethod.getParameterSpec() == null : digestMethodParameterSpec.equals(digestMethod.getParameterSpec()));
    }

    public abstract String getMessageDigestAlgorithm();

    public final AlgorithmParameterSpec getParameterSpec() {
        return this.params;
    }

    public int hashCode() {
        DigestMethodParameterSpec digestMethodParameterSpec = this.params;
        int hashCode = digestMethodParameterSpec != null ? digestMethodParameterSpec.hashCode() + 527 : 17;
        String algorithm = getAlgorithm();
        if (algorithm != null) {
            return algorithm.hashCode() + (hashCode * 31);
        }
        return hashCode;
    }

    @Override // ru.CryptoPro.JCPxml.dsig.internal.dom.DOMStructure
    public void marshal(Node node, String str, DOMCryptoContext dOMCryptoContext) throws MarshalException {
        Element createElement = DOMUtils.createElement(DOMUtils.getOwnerDocument(node), "DigestMethod", "http://www.w3.org/2000/09/xmldsig#", str);
        DOMUtils.setAttribute(createElement, "Algorithm", getAlgorithm());
        if (this.params != null) {
            marshalParams(createElement, str);
        }
        node.appendChild(createElement);
    }

    public void marshalParams(Element element, String str) throws MarshalException {
        throw new MarshalException("no parameters should be specified for the " + getMessageDigestAlgorithm() + " DigestMethod algorithm");
    }

    public DigestMethodParameterSpec unmarshalParams(Element element) throws MarshalException {
        throw new MarshalException("no parameters should be specified for the " + getMessageDigestAlgorithm() + " DigestMethod algorithm");
    }

    final class GOST3411 extends DOMDigestMethod {
        public GOST3411(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidAlgorithmParameterException {
            super(algorithmParameterSpec);
        }

        public String getAlgorithm() {
            return Consts.URI_GOST_DIGEST;
        }

        @Override // ru.CryptoPro.JCPxml.dsig.internal.dom.DOMDigestMethod
        public String getMessageDigestAlgorithm() {
            return JCP.GOST_DIGEST_NAME;
        }

        public GOST3411(Element element) throws MarshalException {
            super(element);
        }
    }

    final class GOST3411URN extends DOMDigestMethod {
        public GOST3411URN(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidAlgorithmParameterException {
            super(algorithmParameterSpec);
        }

        public String getAlgorithm() {
            return Consts.URN_GOST_DIGEST;
        }

        @Override // ru.CryptoPro.JCPxml.dsig.internal.dom.DOMDigestMethod
        public String getMessageDigestAlgorithm() {
            return JCP.GOST_DIGEST_NAME;
        }

        public GOST3411URN(Element element) throws MarshalException {
            super(element);
        }
    }

    final class GOST3411_2012_256_URN extends DOMDigestMethod {
        public GOST3411_2012_256_URN(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidAlgorithmParameterException {
            super(algorithmParameterSpec);
        }

        public String getAlgorithm() {
            return Consts.URN_GOST_DIGEST_2012_256;
        }

        @Override // ru.CryptoPro.JCPxml.dsig.internal.dom.DOMDigestMethod
        public String getMessageDigestAlgorithm() {
            return JCP.GOST_DIGEST_2012_256_NAME;
        }

        public GOST3411_2012_256_URN(Element element) throws MarshalException {
            super(element);
        }
    }

    final class GOST3411_2012_512_URN extends DOMDigestMethod {
        public GOST3411_2012_512_URN(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidAlgorithmParameterException {
            super(algorithmParameterSpec);
        }

        public String getAlgorithm() {
            return Consts.URN_GOST_DIGEST_2012_512;
        }

        @Override // ru.CryptoPro.JCPxml.dsig.internal.dom.DOMDigestMethod
        public String getMessageDigestAlgorithm() {
            return JCP.GOST_DIGEST_2012_512_NAME;
        }

        public GOST3411_2012_512_URN(Element element) throws MarshalException {
            super(element);
        }
    }

    final class SHA1 extends DOMDigestMethod {
        public SHA1(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidAlgorithmParameterException {
            super(algorithmParameterSpec);
        }

        public String getAlgorithm() {
            return "http://www.w3.org/2000/09/xmldsig#sha1";
        }

        @Override // ru.CryptoPro.JCPxml.dsig.internal.dom.DOMDigestMethod
        public String getMessageDigestAlgorithm() {
            return "SHA-1";
        }

        public SHA1(Element element) throws MarshalException {
            super(element);
        }
    }

    final class SHA256 extends DOMDigestMethod {
        public SHA256(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidAlgorithmParameterException {
            super(algorithmParameterSpec);
        }

        public String getAlgorithm() {
            return "http://www.w3.org/2001/04/xmlenc#sha256";
        }

        @Override // ru.CryptoPro.JCPxml.dsig.internal.dom.DOMDigestMethod
        public String getMessageDigestAlgorithm() {
            return JCP.DIGEST_SHA_256;
        }

        public SHA256(Element element) throws MarshalException {
            super(element);
        }
    }

    final class SHA384 extends DOMDigestMethod {
        public SHA384(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidAlgorithmParameterException {
            super(algorithmParameterSpec);
        }

        public String getAlgorithm() {
            return DOMDigestMethod.SHA384;
        }

        @Override // ru.CryptoPro.JCPxml.dsig.internal.dom.DOMDigestMethod
        public String getMessageDigestAlgorithm() {
            return JCP.DIGEST_SHA_384;
        }

        public SHA384(Element element) throws MarshalException {
            super(element);
        }
    }

    final class SHA512 extends DOMDigestMethod {
        public SHA512(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidAlgorithmParameterException {
            super(algorithmParameterSpec);
        }

        public String getAlgorithm() {
            return "http://www.w3.org/2001/04/xmlenc#sha512";
        }

        @Override // ru.CryptoPro.JCPxml.dsig.internal.dom.DOMDigestMethod
        public String getMessageDigestAlgorithm() {
            return JCP.DIGEST_SHA_512;
        }

        public SHA512(Element element) throws MarshalException {
            super(element);
        }
    }

    public DOMDigestMethod(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidAlgorithmParameterException {
        if (algorithmParameterSpec != null && !(algorithmParameterSpec instanceof DigestMethodParameterSpec)) {
            kbs.t("params must be of type DigestMethodParameterSpec");
            throw null;
        }
        DigestMethodParameterSpec digestMethodParameterSpec = (DigestMethodParameterSpec) algorithmParameterSpec;
        checkParams(digestMethodParameterSpec);
        this.params = digestMethodParameterSpec;
    }
}
