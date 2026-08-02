package ru.CryptoPro.ssl.util;

import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1Exception;
import defpackage.oyr;
import java.io.IOException;
import java.security.AccessController;
import java.security.Key;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import ru.CryptoPro.JCP.ASN.PKIX1Explicit88.SubjectPublicKeyInfo;
import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.Key.KuznechikKeySpec;
import ru.CryptoPro.JCP.params.AlgIdInterface;
import ru.CryptoPro.JCP.params.AlgIdSpec;
import ru.CryptoPro.JCP.params.EllipticParamsSpec;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.ssl.SSLLogger;

/* loaded from: classes4.dex */
public class ParamUtil {
    public static boolean a(Exception exc, String str) {
        if (exc == null) {
            return false;
        }
        for (Exception exc2 = exc; exc2 != null; exc2 = exc2.getCause()) {
            String message = exc2.getMessage();
            if (message != null && message.contains(str)) {
                return true;
            }
        }
        return false;
    }

    public static PublicKey convertJCP2JCSP(PublicKey publicKey, String str) throws InvalidKeySpecException {
        SSLLogger.fine("Convert public key (JCP -> Java CSP).");
        try {
            return KeyFactory.getInstance(JCP.GOST_EL_DEGREE_NAME, str).generatePublic(new X509EncodedKeySpec(publicKey.getEncoded()));
        } catch (NoSuchAlgorithmException e) {
            InvalidKeySpecException invalidKeySpecException = new InvalidKeySpecException("Can not convert JCP public key to Java CSP");
            invalidKeySpecException.initCause(e);
            throw invalidKeySpecException;
        } catch (NoSuchProviderException e2) {
            InvalidKeySpecException invalidKeySpecException2 = new InvalidKeySpecException("Can not convert JCP public key to Java CSP");
            invalidKeySpecException2.initCause(e2);
            throw invalidKeySpecException2;
        }
    }

    public static Properties decodeJavaPluginOptions(String str) {
        String trim;
        int indexOf;
        Properties properties = new Properties();
        if (str != null) {
            for (String str2 : str.split("-D")) {
                if (str2 != null && str2.length() != 0 && (indexOf = (trim = str2.trim()).indexOf(61)) >= 1) {
                    properties.put(trim.substring(0, indexOf), trim.substring(indexOf + 1));
                }
            }
        }
        return properties;
    }

    public static HashMap extractAndConvertProperties(Properties properties) {
        HashMap hashMap = new HashMap();
        hashMap.put("javaHome", properties.getProperty("java.home"));
        hashMap.put("keyStore", properties.getProperty("javax.net.ssl.keyStore", ""));
        hashMap.put("keyStoreType", properties.getProperty("javax.net.ssl.keyStoreType", ""));
        hashMap.put("keyStoreProvider", properties.getProperty("javax.net.ssl.keyStoreProvider", ""));
        hashMap.put("keyStorePasswd", properties.getProperty("javax.net.ssl.keyStorePassword", ""));
        hashMap.put("trustStore", properties.getProperty("javax.net.ssl.trustStore", ""));
        hashMap.put("trustStoreType", properties.getProperty("javax.net.ssl.trustStoreType", ""));
        hashMap.put("trustStoreProvider", properties.getProperty("javax.net.ssl.trustStoreProvider", ""));
        hashMap.put("trustStorePasswd", properties.getProperty("javax.net.ssl.trustStorePassword", ""));
        return hashMap;
    }

    public static AlgIdInterface getKeyParameters(PublicKey publicKey) throws IOException {
        Asn1BerDecodeBuffer asn1BerDecodeBuffer = new Asn1BerDecodeBuffer(publicKey.getEncoded());
        SubjectPublicKeyInfo subjectPublicKeyInfo = new SubjectPublicKeyInfo();
        try {
            subjectPublicKeyInfo.decode(asn1BerDecodeBuffer);
            asn1BerDecodeBuffer.reset();
            return new AlgIdSpec(subjectPublicKeyInfo.algorithm);
        } catch (Asn1Exception e) {
            IOException iOException = new IOException("Not gost DH public key");
            iOException.initCause(e);
            throw iOException;
        }
    }

    public static boolean isCSPLicenseExpired(Exception exc) {
        return a(exc, "0x65b");
    }

    public static boolean isCSPNTENotSupported(Exception exc) {
        return a(exc, "0x80090029");
    }

    public static boolean isCSPUserCancelled(Exception exc) {
        return a(exc, "0x8010006e");
    }

    public static boolean isCertApproach(Certificate certificate, String str) {
        try {
            AlgIdInterface keyParameters = getKeyParameters(certificate.getPublicKey());
            String str2 = "1.2.643.2.2.19";
            if (!str.equalsIgnoreCase(JCP.GOST_EL_2012_256_NAME) && !str.equalsIgnoreCase(JCP.GOST_DH_2012_256_NAME)) {
                if (str.equalsIgnoreCase(JCP.GOST_EL_2012_512_NAME) || str.equalsIgnoreCase(JCP.GOST_DH_2012_512_NAME)) {
                    str2 = "1.2.643.7.1.1.1.2";
                }
                return keyParameters.getOID().toString().equals(str2);
            }
            str2 = "1.2.643.7.1.1.1.1";
            return keyParameters.getOID().toString().equals(str2);
        } catch (IOException unused) {
            return false;
        }
    }

    public static boolean isCertificateMatch(PublicKey publicKey, PublicKey publicKey2) {
        AlgIdInterface keyParameters;
        AlgIdInterface keyParameters2;
        try {
            keyParameters = getKeyParameters(publicKey);
            keyParameters2 = getKeyParameters(publicKey2);
        } catch (IOException unused) {
        }
        if (!keyParameters2.getSignParams().getOID().equals(keyParameters.getSignParams().getOID())) {
            return false;
        }
        if (!AlgIdSpec.isGost2012OID(keyParameters2.getOID())) {
            return keyParameters2.getDigestParams().getOID().equals(keyParameters.getDigestParams().getOID()) && keyParameters2.getCryptParams().getOID().equals(keyParameters.getCryptParams().getOID());
        }
        if (EllipticParamsSpec.isShortNewOID(keyParameters2.getSignParams().getOID())) {
            return true;
        }
        return (keyParameters2.getCryptParams() == null || keyParameters.getCryptParams() == null) ? keyParameters2.getDigestParams().getOID().equals(keyParameters.getDigestParams().getOID()) : keyParameters2.getDigestParams().getOID().equals(keyParameters.getDigestParams().getOID()) && keyParameters2.getCryptParams().getOID().equals(keyParameters.getCryptParams().getOID());
    }

    public static Map load(final String str) throws PrivilegedActionException {
        return (Map) AccessController.doPrivileged(new PrivilegedExceptionAction() { // from class: ru.CryptoPro.ssl.util.ParamUtil.1
            @Override // java.security.PrivilegedExceptionAction
            public Map run() throws Exception {
                String property;
                HashMap hashMap = new HashMap();
                Properties properties = System.getProperties();
                hashMap.putAll(ParamUtil.extractAndConvertProperties(properties));
                if (properties.getProperty("__applet_launched") != null && (property = System.getProperty("javaplugin.vm.options", "")) != null && property.length() > 0) {
                    Properties decodeJavaPluginOptions = ParamUtil.decodeJavaPluginOptions(property);
                    HashMap extractAndConvertProperties = ParamUtil.extractAndConvertProperties(decodeJavaPluginOptions);
                    for (String str2 : extractAndConvertProperties.keySet()) {
                        if (hashMap.containsKey(str2)) {
                            String str3 = (String) extractAndConvertProperties.get(str2);
                            hashMap.remove(str2);
                            hashMap.put(str2, str3);
                        }
                    }
                    ParamUtil.setInternalSystemProperty(decodeJavaPluginOptions, "com.sun.security.enableCRLDP");
                    ParamUtil.setInternalSystemProperty(decodeJavaPluginOptions, "com.ibm.security.enableCRLDP");
                    ParamUtil.setInternalSystemProperty(decodeJavaPluginOptions, str);
                }
                return hashMap;
            }
        });
    }

    public static int parseUnsignedInt(String str, int i) throws NumberFormatException {
        if (str == null) {
            throw new NumberFormatException("null");
        }
        int length = str.length();
        if (length <= 0) {
            throw new NumberFormatException(oyr.p("For input string: \"", str, "\""));
        }
        if (str.charAt(0) == '-') {
            throw new NumberFormatException(oyr.p("Illegal leading minus sign on unsigned string ", str, Extension.DOT_CHAR));
        }
        if (length <= 5 || (i == 10 && length <= 9)) {
            return Integer.parseInt(str, i);
        }
        long parseLong = Long.parseLong(str, i);
        if ((KuznechikKeySpec.C1_kuznyechik & parseLong) == 0) {
            return (int) parseLong;
        }
        throw new NumberFormatException(oyr.p("String value ", str, " exceeds range of unsigned int."));
    }

    public static String resolveAgreeAlgorithmByKey(Key key) {
        String algorithm = key.getAlgorithm();
        return algorithm.equals(JCP.GOST_EL_2012_256_NAME) ? JCP.GOST_DH_2012_256_NAME : algorithm.equals(JCP.GOST_EL_2012_512_NAME) ? JCP.GOST_DH_2012_512_NAME : "GOST3410DHEL";
    }

    public static String resolveSignatureAlgorithmByKey(Key key) {
        String algorithm = key.getAlgorithm();
        return (algorithm.equals(JCP.GOST_DH_2012_256_NAME) || algorithm.equals(JCP.GOST_EL_2012_256_NAME)) ? JCP.GOST_SIGN_DH_2012_256_NAME : (algorithm.equals(JCP.GOST_DH_2012_512_NAME) || algorithm.equals(JCP.GOST_EL_2012_512_NAME)) ? JCP.GOST_SIGN_DH_2012_512_NAME : "GOST3411withGOST3410EL";
    }

    public static String resolveSignatureAlgorithmByKeyAlgorithm(String str) {
        if (str.equalsIgnoreCase(JCP.GOST_EL_2012_256_NAME) || str.equalsIgnoreCase(JCP.GOST_DH_2012_256_NAME)) {
            return JCP.GOST_SIGN_2012_256_NAME;
        }
        if (str.equalsIgnoreCase(JCP.GOST_EL_2012_512_NAME) || str.equalsIgnoreCase(JCP.GOST_DH_2012_512_NAME)) {
            return JCP.GOST_SIGN_2012_512_NAME;
        }
        if (str.equalsIgnoreCase(JCP.GOST_EL_DEGREE_NAME) || str.equalsIgnoreCase("GOST3410DHEL")) {
            return "GOST3411withGOST3410EL";
        }
        return null;
    }

    public static String resolveSignatureAlgorithmByOid(String str) {
        return str.equalsIgnoreCase("1.2.643.7.1.1.3.2") ? JCP.GOST_SIGN_2012_256_NAME : str.equalsIgnoreCase("1.2.643.7.1.1.3.3") ? JCP.GOST_SIGN_2012_512_NAME : str.equalsIgnoreCase("1.2.643.2.2.3") ? "GOST3411withGOST3410EL" : str;
    }

    public static String resolveSignatureAlgorithmOidByKeyAlgorithm(String str) {
        if (str.equalsIgnoreCase(JCP.GOST_EL_2012_256_NAME) || str.equalsIgnoreCase(JCP.GOST_DH_2012_256_NAME)) {
            return "1.2.643.7.1.1.3.2";
        }
        if (str.equalsIgnoreCase(JCP.GOST_EL_2012_512_NAME) || str.equalsIgnoreCase(JCP.GOST_DH_2012_512_NAME)) {
            return "1.2.643.7.1.1.3.3";
        }
        if (str.equalsIgnoreCase(JCP.GOST_EL_DEGREE_NAME) || str.equalsIgnoreCase("GOST3410DHEL")) {
            return "1.2.643.2.2.3";
        }
        return null;
    }

    public static void setInternalSystemProperty(Properties properties, String str) {
        if (properties.containsKey(str)) {
            System.setProperty(str, properties.getProperty(str));
        }
    }

    public static int parseUnsignedInt(String str) throws NumberFormatException {
        return parseUnsignedInt(str, 10);
    }
}
