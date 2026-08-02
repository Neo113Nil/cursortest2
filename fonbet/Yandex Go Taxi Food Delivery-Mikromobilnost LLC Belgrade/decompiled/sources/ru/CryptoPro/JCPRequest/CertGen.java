package ru.CryptoPro.JCPRequest;

import java.io.ByteArrayInputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Vector;
import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.Key.KeyTwix;

/* loaded from: classes4.dex */
public class CertGen {
    public static final Vector a;

    static {
        cl_0 cl_0Var = new cl_0();
        cl_0Var.add(JCP.GOST_EL_DEGREE_NAME);
        cl_0Var.add(JCP.GOST_EL_EPH_DEGREE_NAME);
        cl_0Var.add(JCP.GOST_EL_2012_256_NAME);
        cl_0Var.add(JCP.GOST_EPH_2012_256_NAME);
        cl_0Var.add(JCP.GOST_EL_2012_512_NAME);
        cl_0Var.add(JCP.GOST_EPH_2012_512_NAME);
        cl_0Var.add("GOST3410DHEL");
        cl_0Var.add("GOST3410DHELEPH");
        cl_0Var.add(JCP.GOST_DH_2012_256_NAME);
        cl_0Var.add(JCP.GOST_EPH_DH_2012_256_NAME);
        cl_0Var.add(JCP.GOST_DH_2012_512_NAME);
        cl_0Var.add(JCP.GOST_EPH_DH_2012_512_NAME);
        a = cl_0Var;
    }

    public static Certificate[] Certgen(String str, String str2, String str3, String str4, KeyPair keyPair, String str5, String str6, String str7, OutputStream outputStream, OutputStream outputStream2) throws Exception {
        boolean equalsIgnoreCase = "true".equalsIgnoreCase(str3);
        boolean z = str4 != null && str4.equalsIgnoreCase("true");
        GostCertificateRequest gostCertificateRequest = new GostCertificateRequest(str);
        gostCertificateRequest.init(str2, equalsIgnoreCase, z);
        Certificate[] certificateArr = {CertificateFactory.getInstance("X509").generateCertificate(new ByteArrayInputStream(gostCertificateRequest.getEncodedSelfCert(keyPair, str5, a(str2))))};
        PrivateKey privateKey = keyPair.getPrivate();
        gostCertificateRequest.setPublicKeyInfo(keyPair.getPublic());
        gostCertificateRequest.setSubjectInfo(str5);
        gostCertificateRequest.encodeAndSign(privateKey, a(str2));
        if (outputStream != null) {
            PrintStream printStream = new PrintStream(outputStream);
            gostCertificateRequest.printToBASE64(printStream);
            printStream.close();
            outputStream.close();
        }
        if (outputStream2 != null) {
            PrintStream printStream2 = new PrintStream(outputStream2);
            gostCertificateRequest.printToDER(printStream2);
            printStream2.close();
            outputStream2.close();
        }
        return certificateArr;
    }

    public static String a(String str) {
        return (str.equals(JCP.GOST_EL_2012_256_NAME) || str.equals(JCP.GOST_DH_2012_256_NAME)) ? JCP.GOST_SIGN_2012_256_NAME : (str.equals(JCP.GOST_EL_2012_512_NAME) || str.equals(JCP.GOST_DH_2012_512_NAME)) ? JCP.GOST_SIGN_2012_512_NAME : (str.equals(JCP.GOST_EL_DEGREE_NAME) || str.equals("GOST3410DHEL")) ? "GOST3411withGOST3410EL" : (str.equals(JCP.ECDSA_NAME) || str.equals(JCP.ECDH_NAME) || str.equals(JCP.CP_ECDSA_NAME) || str.equals(JCP.CP_ECDH_NAME)) ? JCP.SIGN_SHA256_ECDSA_NAME : str.equals("Ed25519") ? "Ed25519" : JCP.SIGN_SHA256_RSA_NAME;
    }

    public static X509Certificate createCertificate(PublicKey publicKey, PrivateKey privateKey, String str, String str2, String str3, String str4) throws Exception {
        GostCertificateRequest gostCertificateRequest = new GostCertificateRequest(str2);
        gostCertificateRequest.init("GOST3410DHEL");
        gostCertificateRequest.setPublicKeyInfo(publicKey);
        gostCertificateRequest.setSubjectInfo(str3);
        gostCertificateRequest.encodeAndSign(privateKey, str);
        return (X509Certificate) CertificateFactory.getInstance("X509").generateCertificate(new ByteArrayInputStream(gostCertificateRequest.getEncodedCert(str4)));
    }

    public static X509Certificate createSelf(PublicKey publicKey, PrivateKey privateKey, String str, String str2, String str3) throws Exception {
        GostCertificateRequest gostCertificateRequest = new GostCertificateRequest(str2);
        String algorithm = privateKey.getAlgorithm();
        if (!a.contains(algorithm)) {
            algorithm = JCP.GOST_EL_DEGREE_NAME;
        }
        gostCertificateRequest.init(algorithm);
        gostCertificateRequest.setPublicKeyInfo(publicKey);
        gostCertificateRequest.setSubjectInfo(str3);
        gostCertificateRequest.encodeAndSign(privateKey, str);
        return (X509Certificate) CertificateFactory.getInstance("X509").generateCertificate(new ByteArrayInputStream(gostCertificateRequest.generateCert(privateKey, publicKey, str3, str3, str)));
    }

    public static KeyTwix generateTwix0(String str, String str2, String str3) throws Exception {
        return generateTwix1(str, str2, str, str2, str3);
    }

    public static KeyTwix generateTwix1(String str, String str2, String str3, String str4, String str5) throws Exception {
        KeyPair generateKeyPair = (str2 == null ? KeyPairGenerator.getInstance(str) : KeyPairGenerator.getInstance(str, str2)).generateKeyPair();
        PrivateKey privateKey = generateKeyPair.getPrivate();
        return new KeyTwix(privateKey, createSelf(generateKeyPair.getPublic(), privateKey, str3, str4, str5));
    }

    public static KeyTwix generateTwix2(String str, String str2, String str3, String str4, String str5) throws Exception {
        KeyPair generateKeyPair = (str3 == null ? KeyPairGenerator.getInstance(str) : KeyPairGenerator.getInstance(str, str3)).generateKeyPair();
        PrivateKey privateKey = generateKeyPair.getPrivate();
        return new KeyTwix(privateKey, createCertificate(generateKeyPair.getPublic(), privateKey, str2, str3, str4, str5));
    }

    public static KeyTwix generateTwixByProvider(String str, String str2, String str3, String str4, int i) throws Exception {
        KeyPairGenerator keyPairGenerator = str3 == null ? KeyPairGenerator.getInstance(str) : KeyPairGenerator.getInstance(str, str3);
        keyPairGenerator.initialize(i);
        KeyPair generateKeyPair = keyPairGenerator.generateKeyPair();
        PrivateKey privateKey = generateKeyPair.getPrivate();
        return new KeyTwix(privateKey, createSelf(generateKeyPair.getPublic(), privateKey, str2, str3, str4));
    }

    public static KeyTwix generateTwixByProvider(String str, String str2, String str3, int i) throws Exception {
        return generateTwixByProvider(str, str, str2, str3, i);
    }
}
