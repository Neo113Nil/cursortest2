package ru.CryptoPro.JCPxml.dsig.internal.dom;

import defpackage.oyr;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
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
import org.w3c.dom.Element;
import org.w3c.dom.Node;

/* loaded from: classes4.dex */
abstract class AbstractDOMSignatureMethod extends DOMStructure implements SignatureMethod {

    enum Type {
        DSA,
        RSA,
        ECDSA,
        HMAC,
        GOST,
        GOST_2012_256,
        GOST_2012_512
    }

    public void checkParams(SignatureMethodParameterSpec signatureMethodParameterSpec) throws InvalidAlgorithmParameterException {
        if (signatureMethodParameterSpec != null) {
            throw new InvalidAlgorithmParameterException(oyr.t(new StringBuilder("no parameters should be specified for the "), getAlgorithm(), " SignatureMethod algorithm"));
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SignatureMethod)) {
            return false;
        }
        SignatureMethod signatureMethod = (SignatureMethod) obj;
        return getAlgorithm().equals(signatureMethod.getAlgorithm()) && paramsEqual(signatureMethod.getParameterSpec());
    }

    public abstract Type getAlgorithmType();

    public abstract String getJCAAlgorithm();

    @Override // ru.CryptoPro.JCPxml.dsig.internal.dom.DOMStructure
    public void marshal(Node node, String str, DOMCryptoContext dOMCryptoContext) throws MarshalException {
        Element createElement = DOMUtils.createElement(DOMUtils.getOwnerDocument(node), "SignatureMethod", "http://www.w3.org/2000/09/xmldsig#", str);
        DOMUtils.setAttribute(createElement, "Algorithm", getAlgorithm());
        if (getParameterSpec() != null) {
            marshalParams(createElement, str);
        }
        node.appendChild(createElement);
    }

    public void marshalParams(Element element, String str) throws MarshalException {
        throw new MarshalException(oyr.t(new StringBuilder("no parameters should be specified for the "), getAlgorithm(), " SignatureMethod algorithm"));
    }

    public boolean paramsEqual(AlgorithmParameterSpec algorithmParameterSpec) {
        return getParameterSpec() == algorithmParameterSpec;
    }

    public abstract byte[] sign(Key key, SignedInfo signedInfo, XMLSignContext xMLSignContext) throws InvalidKeyException, XMLSignatureException;

    public SignatureMethodParameterSpec unmarshalParams(Element element) throws MarshalException {
        throw new MarshalException(oyr.t(new StringBuilder("no parameters should be specified for the "), getAlgorithm(), " SignatureMethod algorithm"));
    }

    public abstract boolean verify(Key key, SignedInfo signedInfo, byte[] bArr, XMLValidateContext xMLValidateContext) throws InvalidKeyException, SignatureException, XMLSignatureException;
}
