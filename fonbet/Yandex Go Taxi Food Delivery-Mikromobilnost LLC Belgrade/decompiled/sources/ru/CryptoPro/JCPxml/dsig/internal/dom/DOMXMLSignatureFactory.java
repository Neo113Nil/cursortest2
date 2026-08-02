package ru.CryptoPro.JCPxml.dsig.internal.dom;

import defpackage.ny61;
import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.List;
import javax.xml.crypto.Data;
import javax.xml.crypto.MarshalException;
import javax.xml.crypto.URIDereferencer;
import javax.xml.crypto.XMLCryptoContext;
import javax.xml.crypto.XMLStructure;
import javax.xml.crypto.dom.DOMCryptoContext;
import javax.xml.crypto.dsig.CanonicalizationMethod;
import javax.xml.crypto.dsig.DigestMethod;
import javax.xml.crypto.dsig.Manifest;
import javax.xml.crypto.dsig.Reference;
import javax.xml.crypto.dsig.SignatureMethod;
import javax.xml.crypto.dsig.SignatureProperties;
import javax.xml.crypto.dsig.SignatureProperty;
import javax.xml.crypto.dsig.SignedInfo;
import javax.xml.crypto.dsig.Transform;
import javax.xml.crypto.dsig.TransformService;
import javax.xml.crypto.dsig.XMLObject;
import javax.xml.crypto.dsig.XMLSignature;
import javax.xml.crypto.dsig.XMLSignatureFactory;
import javax.xml.crypto.dsig.XMLValidateContext;
import javax.xml.crypto.dsig.dom.DOMValidateContext;
import javax.xml.crypto.dsig.keyinfo.KeyInfo;
import javax.xml.crypto.dsig.spec.C14NMethodParameterSpec;
import javax.xml.crypto.dsig.spec.DigestMethodParameterSpec;
import javax.xml.crypto.dsig.spec.SignatureMethodParameterSpec;
import javax.xml.crypto.dsig.spec.TransformParameterSpec;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import ru.CryptoPro.JCPxml.Consts;
import ru.CryptoPro.JCPxml.dsig.internal.dom.DOMDigestMethod;
import ru.CryptoPro.JCPxml.dsig.internal.dom.DOMHMACSignatureMethod;
import ru.CryptoPro.JCPxml.dsig.internal.dom.DOMSignatureMethod;
import ru.CryptoPro.XAdES.XAdESSignature;

/* loaded from: classes4.dex */
public final class DOMXMLSignatureFactory extends XMLSignatureFactory {

    class UnmarshalContext extends DOMCryptoContext {
    }

    private XMLSignature unmarshal(Node node, XMLCryptoContext xMLCryptoContext) throws MarshalException {
        Element element;
        node.normalize();
        if (node.getNodeType() == 9) {
            element = ((Document) node).getDocumentElement();
        } else {
            if (node.getNodeType() != 1) {
                throw new MarshalException("Signature element is not a proper Node");
            }
            element = (Element) node;
        }
        String localName = element.getLocalName();
        if (localName == null) {
            throw new MarshalException("Document implementation must support DOM Level 2 and be namespace aware");
        }
        if (localName.equals(XAdESSignature.ELEMENT_SIGNATURE)) {
            return new DOMXMLSignature(element, xMLCryptoContext, getProvider());
        }
        throw new MarshalException("invalid Signature tag: ".concat(localName));
    }

    public URIDereferencer getURIDereferencer() {
        return DOMURIDereferencer.INSTANCE;
    }

    public boolean isFeatureSupported(String str) {
        str.getClass();
        return false;
    }

    public CanonicalizationMethod newCanonicalizationMethod(String str, C14NMethodParameterSpec c14NMethodParameterSpec) throws NoSuchAlgorithmException, InvalidAlgorithmParameterException {
        TransformService transformService;
        if (getProvider() != null) {
            try {
                transformService = TransformService.getInstance(str, "DOM", getProvider());
            } catch (NoSuchAlgorithmException unused) {
            }
            transformService.init(c14NMethodParameterSpec);
            return new DOMCanonicalizationMethod(transformService);
        }
        transformService = TransformService.getInstance(str, "DOM");
        transformService.init(c14NMethodParameterSpec);
        return new DOMCanonicalizationMethod(transformService);
    }

    public DigestMethod newDigestMethod(String str, DigestMethodParameterSpec digestMethodParameterSpec) throws NoSuchAlgorithmException, InvalidAlgorithmParameterException {
        str.getClass();
        if (str.equals("http://www.w3.org/2000/09/xmldsig#sha1")) {
            return new DOMDigestMethod.SHA1((AlgorithmParameterSpec) digestMethodParameterSpec);
        }
        if (str.equals("http://www.w3.org/2001/04/xmlenc#sha256")) {
            return new DOMDigestMethod.SHA256((AlgorithmParameterSpec) digestMethodParameterSpec);
        }
        if (str.equals("http://www.w3.org/2001/04/xmldsig-more#sha384")) {
            return new DOMDigestMethod.SHA384((AlgorithmParameterSpec) digestMethodParameterSpec);
        }
        if (str.equals("http://www.w3.org/2001/04/xmlenc#sha512")) {
            return new DOMDigestMethod.SHA512((AlgorithmParameterSpec) digestMethodParameterSpec);
        }
        if (str.equals(Consts.URI_GOST_DIGEST)) {
            return new DOMDigestMethod.GOST3411((AlgorithmParameterSpec) digestMethodParameterSpec);
        }
        if (str.equals(Consts.URN_GOST_DIGEST)) {
            return new DOMDigestMethod.GOST3411URN((AlgorithmParameterSpec) digestMethodParameterSpec);
        }
        if (str.equals(Consts.URN_GOST_DIGEST_2012_256)) {
            return new DOMDigestMethod.GOST3411_2012_256_URN((AlgorithmParameterSpec) digestMethodParameterSpec);
        }
        if (str.equals(Consts.URN_GOST_DIGEST_2012_512)) {
            return new DOMDigestMethod.GOST3411_2012_512_URN((AlgorithmParameterSpec) digestMethodParameterSpec);
        }
        throw new NoSuchAlgorithmException("unsupported algorithm");
    }

    public Manifest newManifest(List list) {
        return newManifest(list, null);
    }

    public Reference newReference(String str, DigestMethod digestMethod, List list, Data data, List list2, String str2, String str3) {
        String str4;
        if (list == null) {
            str4 = "appliedTransforms cannot be null";
        } else if (list.isEmpty()) {
            str4 = "appliedTransforms cannot be empty";
        } else {
            if (data != null) {
                return new DOMReference(str, str2, digestMethod, list, data, list2, str3, getProvider());
            }
            str4 = "result cannot be null";
        }
        ny61.t(str4);
        return null;
    }

    public SignatureMethod newSignatureMethod(String str, SignatureMethodParameterSpec signatureMethodParameterSpec) throws NoSuchAlgorithmException, InvalidAlgorithmParameterException {
        str.getClass();
        if (str.equals("http://www.w3.org/2000/09/xmldsig#rsa-sha1")) {
            return new DOMSignatureMethod.SHA1withRSA((AlgorithmParameterSpec) signatureMethodParameterSpec);
        }
        if (str.equals("http://www.w3.org/2001/04/xmldsig-more#rsa-sha256")) {
            return new DOMSignatureMethod.SHA256withRSA((AlgorithmParameterSpec) signatureMethodParameterSpec);
        }
        if (str.equals("http://www.w3.org/2001/04/xmldsig-more#rsa-sha384")) {
            return new DOMSignatureMethod.SHA384withRSA((AlgorithmParameterSpec) signatureMethodParameterSpec);
        }
        if (str.equals("http://www.w3.org/2001/04/xmldsig-more#rsa-sha512")) {
            return new DOMSignatureMethod.SHA512withRSA((AlgorithmParameterSpec) signatureMethodParameterSpec);
        }
        if (str.equals("http://www.w3.org/2000/09/xmldsig#dsa-sha1")) {
            return new DOMSignatureMethod.SHA1withDSA((AlgorithmParameterSpec) signatureMethodParameterSpec);
        }
        if (str.equals("http://www.w3.org/2000/09/xmldsig#hmac-sha1")) {
            return new DOMHMACSignatureMethod.SHA1((AlgorithmParameterSpec) signatureMethodParameterSpec);
        }
        if (str.equals("http://www.w3.org/2001/04/xmldsig-more#hmac-sha256")) {
            return new DOMHMACSignatureMethod.SHA256((AlgorithmParameterSpec) signatureMethodParameterSpec);
        }
        if (str.equals("http://www.w3.org/2001/04/xmldsig-more#hmac-sha384")) {
            return new DOMHMACSignatureMethod.SHA384((AlgorithmParameterSpec) signatureMethodParameterSpec);
        }
        if (str.equals("http://www.w3.org/2001/04/xmldsig-more#hmac-sha512")) {
            return new DOMHMACSignatureMethod.SHA512((AlgorithmParameterSpec) signatureMethodParameterSpec);
        }
        if (str.equals("http://www.w3.org/2001/04/xmldsig-more#ecdsa-sha1")) {
            return new DOMSignatureMethod.SHA1withECDSA((AlgorithmParameterSpec) signatureMethodParameterSpec);
        }
        if (str.equals("http://www.w3.org/2001/04/xmldsig-more#ecdsa-sha256")) {
            return new DOMSignatureMethod.SHA256withECDSA((AlgorithmParameterSpec) signatureMethodParameterSpec);
        }
        if (str.equals("http://www.w3.org/2001/04/xmldsig-more#ecdsa-sha384")) {
            return new DOMSignatureMethod.SHA384withECDSA((AlgorithmParameterSpec) signatureMethodParameterSpec);
        }
        if (str.equals("http://www.w3.org/2001/04/xmldsig-more#ecdsa-sha512")) {
            return new DOMSignatureMethod.SHA512withECDSA((AlgorithmParameterSpec) signatureMethodParameterSpec);
        }
        if (str.equals("http://www.w3.org/2001/04/xmldsig-more#gostr34102001-gostr3411")) {
            return new DOMSignatureMethod.GOST3411withGOST3410((AlgorithmParameterSpec) signatureMethodParameterSpec);
        }
        if (str.equals("urn:ietf:params:xml:ns:cpxmlsec:algorithms:gostr34102001-gostr3411")) {
            return new DOMSignatureMethod.GOST3411withGOST3410URN((AlgorithmParameterSpec) signatureMethodParameterSpec);
        }
        if (str.equals("urn:ietf:params:xml:ns:cpxmlsec:algorithms:gostr34102012-gostr34112012-256")) {
            return new DOMSignatureMethod.GOST3411_2012_256withGOST3410_2012_256_URN((AlgorithmParameterSpec) signatureMethodParameterSpec);
        }
        if (str.equals("urn:ietf:params:xml:ns:cpxmlsec:algorithms:gostr34102012-gostr34112012-512")) {
            return new DOMSignatureMethod.GOST3411_2012_512withGOST3410_2012_512_URN((AlgorithmParameterSpec) signatureMethodParameterSpec);
        }
        if (str.equals(Consts.URI_GOST_HMAC_GOSTR3411)) {
            return new DOMHMACSignatureMethod.HMAC_GOSTR3411_URI((AlgorithmParameterSpec) signatureMethodParameterSpec);
        }
        if (str.equals(Consts.URN_GOST_HMAC_GOSTR3411)) {
            return new DOMHMACSignatureMethod.HMAC_GOSTR3411_URN((AlgorithmParameterSpec) signatureMethodParameterSpec);
        }
        throw new NoSuchAlgorithmException("unsupported algorithm");
    }

    public SignatureProperties newSignatureProperties(List list, String str) {
        return new DOMSignatureProperties(list, str);
    }

    public SignatureProperty newSignatureProperty(List list, String str, String str2) {
        return new DOMSignatureProperty(list, str, str2);
    }

    public SignedInfo newSignedInfo(CanonicalizationMethod canonicalizationMethod, SignatureMethod signatureMethod, List list) {
        return newSignedInfo(canonicalizationMethod, signatureMethod, list, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Transform newTransform(String str, XMLStructure xMLStructure) throws NoSuchAlgorithmException, InvalidAlgorithmParameterException {
        TransformService transformService;
        if (getProvider() != null) {
            try {
                transformService = TransformService.getInstance(str, "DOM", getProvider());
            } catch (NoSuchAlgorithmException unused) {
            }
            if (xMLStructure != null) {
                transformService.init((TransformParameterSpec) null);
            } else {
                transformService.init(xMLStructure, (XMLCryptoContext) null);
            }
            return new DOMTransform(transformService);
        }
        transformService = TransformService.getInstance(str, "DOM");
        if (xMLStructure != null) {
        }
        return new DOMTransform(transformService);
    }

    public XMLObject newXMLObject(List list, String str, String str2, String str3) {
        return new DOMXMLObject(list, str, str2, str3);
    }

    public XMLSignature newXMLSignature(SignedInfo signedInfo, KeyInfo keyInfo) {
        return new DOMXMLSignature(signedInfo, keyInfo, null, null, null);
    }

    public XMLSignature unmarshalXMLSignature(XMLStructure xMLStructure) throws MarshalException {
        if (xMLStructure != null) {
            return unmarshal(((javax.xml.crypto.dom.DOMStructure) xMLStructure).getNode(), new UnmarshalContext());
        }
        ny61.t("xmlStructure cannot be null");
        return null;
    }

    public Manifest newManifest(List list, String str) {
        return new DOMManifest(list, str);
    }

    public SignedInfo newSignedInfo(CanonicalizationMethod canonicalizationMethod, SignatureMethod signatureMethod, List list, String str) {
        return new DOMSignedInfo(canonicalizationMethod, signatureMethod, list, str);
    }

    public XMLSignature newXMLSignature(SignedInfo signedInfo, KeyInfo keyInfo, List list, String str, String str2) {
        return new DOMXMLSignature(signedInfo, keyInfo, list, str, str2);
    }

    public XMLSignature unmarshalXMLSignature(XMLValidateContext xMLValidateContext) throws MarshalException {
        if (xMLValidateContext != null) {
            return unmarshal(((DOMValidateContext) xMLValidateContext).getNode(), xMLValidateContext);
        }
        ny61.t("context cannot be null");
        return null;
    }

    public CanonicalizationMethod newCanonicalizationMethod(String str, XMLStructure xMLStructure) throws NoSuchAlgorithmException, InvalidAlgorithmParameterException {
        TransformService transformService;
        if (getProvider() != null) {
            try {
                transformService = TransformService.getInstance(str, "DOM", getProvider());
            } catch (NoSuchAlgorithmException unused) {
            }
            return new DOMCanonicalizationMethod(transformService);
        }
        transformService = TransformService.getInstance(str, "DOM");
        return new DOMCanonicalizationMethod(transformService);
    }

    public Transform newTransform(String str, TransformParameterSpec transformParameterSpec) throws NoSuchAlgorithmException, InvalidAlgorithmParameterException {
        TransformService transformService;
        if (getProvider() != null) {
            try {
                transformService = TransformService.getInstance(str, "DOM", getProvider());
            } catch (NoSuchAlgorithmException unused) {
            }
            transformService.init(transformParameterSpec);
            return new DOMTransform(transformService);
        }
        transformService = TransformService.getInstance(str, "DOM");
        transformService.init(transformParameterSpec);
        return new DOMTransform(transformService);
    }

    public Reference newReference(String str, DigestMethod digestMethod, List list, String str2, String str3) {
        return new DOMReference(str, str2, digestMethod, list, str3, getProvider());
    }

    public Reference newReference(String str, DigestMethod digestMethod, List list, String str2, String str3, byte[] bArr) {
        if (bArr != null) {
            return new DOMReference(str, str2, digestMethod, null, null, list, str3, bArr, getProvider());
        }
        ny61.t("digestValue cannot be null");
        return null;
    }

    public Reference newReference(String str, DigestMethod digestMethod) {
        return newReference(str, digestMethod, null, null, null);
    }
}
