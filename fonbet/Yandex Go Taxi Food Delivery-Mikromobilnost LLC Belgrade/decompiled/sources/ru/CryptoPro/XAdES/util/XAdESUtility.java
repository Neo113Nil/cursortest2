package ru.CryptoPro.XAdES.util;

import defpackage.g8e;
import defpackage.i3;
import defpackage.jc51;
import defpackage.r0x;
import defpackage.s3;
import java.io.IOException;
import java.security.Key;
import java.security.Provider;
import java.security.Security;
import javax.security.auth.x500.X500Principal;
import ru.CryptoPro.AdES.exception.IAdESException;
import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.tools.JCPLogger;
import ru.CryptoPro.JCPxml.Consts;
import ru.CryptoPro.JCPxml.XmlInit;
import ru.CryptoPro.JCPxml.dsig.internal.dom.XMLDSigRI;
import ru.CryptoPro.XAdES.exception.XAdESException;
import ru.CryptoPro.reprov.x509.X500Name;

/* loaded from: classes4.dex */
public class XAdESUtility {
    public static X500Principal convertBcIssuerToX500Principal(r0x r0xVar) throws Exception {
        return new X500Principal(((s3) ((i3) ((i3) r0xVar.toASN1Primitive()).A(0).toASN1Primitive()).A(0).toASN1Primitive()).u().getEncoded());
    }

    public static jc51 convertStringToX500Name(String str) throws IOException {
        return jc51.m(new X500Name(str).asX500Principal().getEncoded());
    }

    public static String findDigestNameByDigestUri(String str) {
        return (str.equalsIgnoreCase(Consts.URI_GOST_DIGEST) || str.equalsIgnoreCase(Consts.URN_GOST_DIGEST)) ? JCP.GOST_DIGEST_NAME : str.equalsIgnoreCase(Consts.URN_GOST_DIGEST_2012_256) ? JCP.GOST_DIGEST_2012_256_NAME : str.equalsIgnoreCase(Consts.URN_GOST_DIGEST_2012_512) ? JCP.GOST_DIGEST_2012_512_NAME : str;
    }

    public static String findDigestNameByKey(Key key) throws XAdESException {
        return findDigestNameByKeyAlgorithm(key.getAlgorithm());
    }

    public static String findDigestNameByKeyAlgorithm(String str) throws XAdESException {
        if (str.equalsIgnoreCase(JCP.GOST_EL_DEGREE_NAME) || str.equalsIgnoreCase("GOST3410DHEL")) {
            return JCP.GOST_DIGEST_NAME;
        }
        if (str.equalsIgnoreCase(JCP.GOST_EL_2012_256_NAME) || str.equalsIgnoreCase(JCP.GOST_DH_2012_256_NAME)) {
            return JCP.GOST_DIGEST_2012_256_NAME;
        }
        if (str.equalsIgnoreCase(JCP.GOST_EL_2012_512_NAME) || str.equalsIgnoreCase(JCP.GOST_DH_2012_512_NAME)) {
            return JCP.GOST_DIGEST_2012_512_NAME;
        }
        throw new XAdESException("Digest algorithm not found for ".concat(str), IAdESException.ecNodeNotFound);
    }

    public static String findDigestNameBySignatureUri(String str) throws XAdESException {
        if (str.equalsIgnoreCase("http://www.w3.org/2001/04/xmldsig-more#gostr34102001-gostr3411") || str.equalsIgnoreCase("urn:ietf:params:xml:ns:cpxmlsec:algorithms:gostr34102001-gostr3411")) {
            return JCP.GOST_DIGEST_NAME;
        }
        if (str.equalsIgnoreCase("urn:ietf:params:xml:ns:cpxmlsec:algorithms:gostr34102012-gostr34112012-256")) {
            return JCP.GOST_DIGEST_2012_256_NAME;
        }
        if (str.equalsIgnoreCase("urn:ietf:params:xml:ns:cpxmlsec:algorithms:gostr34102012-gostr34112012-512")) {
            return JCP.GOST_DIGEST_2012_512_NAME;
        }
        throw new XAdESException("Digest algorithm not found for ".concat(str), IAdESException.ecNodeNotFound);
    }

    public static String findDigestOidByDigestName(String str) throws XAdESException {
        if (str.equalsIgnoreCase(JCP.GOST_DIGEST_NAME)) {
            return "1.2.643.2.2.9";
        }
        if (str.equalsIgnoreCase(JCP.GOST_DIGEST_2012_256_NAME)) {
            return "1.2.643.7.1.1.2.2";
        }
        if (str.equalsIgnoreCase(JCP.GOST_DIGEST_2012_512_NAME)) {
            return "1.2.643.7.1.1.2.3";
        }
        throw new XAdESException("Digest oid not found for ".concat(str), IAdESException.ecNodeNotFound);
    }

    public static String findDigestUriByDigestName(String str) {
        if (str.equalsIgnoreCase(JCP.GOST_DIGEST_NAME)) {
            return Consts.URI_GOST_DIGEST;
        }
        if (str.equalsIgnoreCase(JCP.GOST_DIGEST_2012_256_NAME)) {
            return Consts.URN_GOST_DIGEST_2012_256;
        }
        if (str.equalsIgnoreCase(JCP.GOST_DIGEST_2012_512_NAME)) {
            return Consts.URN_GOST_DIGEST_2012_512;
        }
        return null;
    }

    public static String findDigestUriByDigestOid(String str) throws XAdESException {
        String str2 = str.equalsIgnoreCase("1.2.643.2.2.9") ? JCP.GOST_DIGEST_NAME : null;
        if (str.equalsIgnoreCase("1.2.643.7.1.1.2.2")) {
            str2 = JCP.GOST_DIGEST_2012_256_NAME;
        }
        if (str.equalsIgnoreCase("1.2.643.7.1.1.2.3")) {
            str2 = JCP.GOST_DIGEST_2012_512_NAME;
        }
        if (str2 != null) {
            return findDigestUriByDigestName(str2);
        }
        throw new XAdESException(g8e.o("Digest uri not found ", str2), IAdESException.ecNodeNotFound);
    }

    public static String findDigestUriByKey(Key key) throws XAdESException {
        return findDigestUriByDigestName(findDigestNameByKeyAlgorithm(key.getAlgorithm()));
    }

    public static String findSignatureUriByKey(Key key) throws XAdESException {
        String findDigestNameByKey = findDigestNameByKey(key);
        if (findDigestNameByKey.equalsIgnoreCase(JCP.GOST_DIGEST_NAME)) {
            return "http://www.w3.org/2001/04/xmldsig-more#gostr34102001-gostr3411";
        }
        if (findDigestNameByKey.equalsIgnoreCase(JCP.GOST_DIGEST_2012_256_NAME)) {
            return "urn:ietf:params:xml:ns:cpxmlsec:algorithms:gostr34102012-gostr34112012-256";
        }
        if (findDigestNameByKey.equalsIgnoreCase(JCP.GOST_DIGEST_2012_512_NAME)) {
            return "urn:ietf:params:xml:ns:cpxmlsec:algorithms:gostr34102012-gostr34112012-512";
        }
        throw new XAdESException("Signature uri not found for ".concat(findDigestNameByKey), IAdESException.ecNodeNotFound);
    }

    public static void initXMLAlgorithms() {
        JCPLogger.subEnter();
        if (!XmlInit.isInitialized()) {
            XmlInit.init();
        }
        Security.addProvider(new XMLDSigRI());
        Provider provider = Security.getProvider("XMLDSig");
        if (provider != null) {
            provider.put("XMLSignatureFactory.DOM", "ru.CryptoPro.JCPxml.dsig.internal.dom.DOMXMLSignatureFactory");
            provider.put("KeyInfoFactory.DOM", "ru.CryptoPro.JCPxml.dsig.internal.dom.DOMKeyInfoFactory");
        }
        JCPLogger.subExit();
    }
}
