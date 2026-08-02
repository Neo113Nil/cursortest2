package ru.CryptoPro.JCP.VMInspector;

import defpackage.d7g0;
import defpackage.x4e;
import java.io.ByteArrayInputStream;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.MessageDigest;
import java.security.PrivateKey;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.util.Arrays;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.Random.CertifiedRandom;
import ru.CryptoPro.JCP.Util.PaneDefaultProvider;
import ru.CryptoPro.JCP.tools.Array;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.reprov.array.DerValue;
import ru.CryptoPro.ssl.Alerts;

/* loaded from: classes4.dex */
public class Sample {
    private static final String CHARSET = "UTF-8";
    public static final String GOST28147 = "GOST28147";
    public static final String GOST3410_EL_DH = "GOST3410DHEL";
    public static final String TEST_TEXT = "This is message, length=32 bytes";
    private static final HashMap algDHMap;
    private static final HashMap algSignMap;
    public static final byte[] TEST_RESULT = {Alerts.alert_certificate_revoked, -17, -62, -9, -73, -67, -59, 20, -31, -114, -91, Byte.MAX_VALUE, -89, 79, -13, 87, -25, -6, 23, -42, 82, -57, 95, 105, -53, DerValue.tag_GeneralString, -25, -119, 62, -34, 72, -21};
    public static final byte[] TEST_RESULT_STRIBOG_256 = {Alerts.alert_certificate_unobtainable, -88, 89, Alerts.alert_unsupported_certificate, DerValue.tag_UniversalString, -46, -116, -89, Alerts.alert_certificate_expired, -121, -25, -44, 19, -40, -77, -34, 49, 7, Alerts.alert_unrecognized_name, -104, -66, -45, -127, -115, -104, -10, -9, -101, -84, 92, -58, 69};
    public static byte[] TEST_RESULT_STRIBOG_512 = {-18, -78, -61, 91, 118, 4, 87, -46, -112, 2, Alerts.alert_illegal_parameter, DerValue.TAG_PRIVATE, 96, -30, -107, 0, 18, Alerts.alert_certificate_revoked, -51, -67, 115, -72, 52, -20, 4, 4, -115, 109, -25, 94, -108, Alerts.alert_illegal_parameter, -59, Alerts.alert_certificate_expired, -8, Alerts.alert_certificate_unobtainable, -96, -35, -35, -4, -24, -126, -72, -37, -38, 87, 63, -5, -96, 35, Alerts.alert_no_certificate, 3, -60, DerValue.TAG_PRIVATE, 87, -73, 102, 36, -106, Alerts.alert_handshake_failure, 9, -63, -124, -65};
    private static final String[] keyAlgs = {"GOST3410DHEL", JCP.GOST_DH_2012_256_NAME, JCP.GOST_DH_2012_512_NAME};

    static {
        HashMap hashMap = new HashMap();
        algSignMap = hashMap;
        hashMap.put("GOST3410DHEL", "GOST3411withGOST3410EL");
        HashMap q = x4e.q(hashMap, JCP.GOST_DH_2012_256_NAME, JCP.GOST_SIGN_2012_256_NAME, JCP.GOST_DH_2012_512_NAME, JCP.GOST_SIGN_2012_512_NAME);
        algDHMap = q;
        q.put("GOST3410DHEL", "GOST3410DHEL");
        q.put(JCP.GOST_DH_2012_256_NAME, JCP.GOST_DH_2012_256_NAME);
        q.put(JCP.GOST_DH_2012_512_NAME, JCP.GOST_DH_2012_512_NAME);
    }

    private Sample() {
    }

    public static SecretKey checkAgreement(KeyPair keyPair, String str, String str2) throws Exception {
        Inspector.print("Diffy-Helman key generation verify");
        KeyAgreement keyAgreement = KeyAgreement.getInstance((String) algDHMap.get(keyPair.getPrivate().getAlgorithm()), str);
        keyAgreement.init(keyPair.getPrivate(), genIV(str2));
        keyAgreement.doPhase(keyPair.getPublic(), true);
        SecretKey generateSecret = keyAgreement.generateSecret("GOST28147");
        Inspector.print(Inspector.STR_TEST_PASSED);
        return generateSecret;
    }

    public static void checkCrypt(SecretKey secretKey, String str, String str2) throws Exception {
        Inspector.print("GOST R 28147-89 encryption verify");
        IvParameterSpec genIV = genIV(str2);
        Cipher cipher = Cipher.getInstance("GOST28147", str);
        cipher.init(1, secretKey, genIV);
        byte[] doFinal = cipher.doFinal("This is message, length=32 bytes".getBytes("UTF-8"));
        if (Arrays.equals(doFinal, "This is message, length=32 bytes".getBytes("UTF-8"))) {
            d7g0.i();
            return;
        }
        Inspector.print("GOST R 28147-89 decryption verify");
        cipher.init(2, secretKey, genIV);
        if (Arrays.equals(cipher.doFinal(doFinal), "This is message, length=32 bytes".getBytes("UTF-8"))) {
            Inspector.print(Inspector.STR_TEST_PASSED);
        } else {
            d7g0.i();
        }
    }

    public static void checkDigest(String str) throws Exception {
        Inspector.print("GOST R 34.11-94 hash verify.");
        if (!Arrays.equals(MessageDigest.getInstance(JCP.GOST_DIGEST_NAME, str).digest("This is message, length=32 bytes".getBytes("UTF-8")), TEST_RESULT)) {
            d7g0.i();
            return;
        }
        Inspector.print("GOST R 34.11-2012 (256) hash verify.");
        if (!Arrays.equals(MessageDigest.getInstance(JCP.GOST_DIGEST_2012_256_NAME, str).digest("This is message, length=32 bytes".getBytes("UTF-8")), TEST_RESULT_STRIBOG_256)) {
            d7g0.i();
            return;
        }
        Inspector.print("GOST R 34.11-2012 (512) hash verify.");
        if (Arrays.equals(MessageDigest.getInstance(JCP.GOST_DIGEST_2012_512_NAME, str).digest("This is message, length=32 bytes".getBytes("UTF-8")), TEST_RESULT_STRIBOG_512)) {
            Inspector.print(Inspector.STR_TEST_PASSED);
        } else {
            d7g0.i();
        }
    }

    public static KeyPair checkGenerate(String str, String str2) throws Exception {
        Inspector.print("Key pair generation verify for " + str + Extension.DOT_CHAR);
        KeyPair generateKeyPair = KeyPairGenerator.getInstance(str, str2).generateKeyPair();
        Inspector.print(Inspector.STR_TEST_PASSED);
        return generateKeyPair;
    }

    public static void checkImito(SecretKey secretKey, String str) throws Exception {
        Inspector.print("GOST R 28147-89 MAC verify");
        Mac mac = Mac.getInstance("GOST28147", str);
        mac.init(secretKey);
        mac.doFinal("This is message, length=32 bytes".getBytes("UTF-8"));
        Inspector.print(Inspector.STR_TEST_PASSED);
    }

    public static void checkRandom(String str) throws Exception {
        Inspector.print("Random sequence generation verify.");
        byte[] bArr = new byte[1024];
        SecureRandom.getInstance(JCP.CP_RANDOM, str).nextBytes(bArr);
        int[] intArray = Array.toIntArray(bArr);
        Inspector.print("  Statistics verify.");
        if (CertifiedRandom.testStatRawBuf(intArray)) {
            Inspector.print(Inspector.STR_TEST_PASSED);
        } else {
            d7g0.i();
        }
    }

    public static void checkSign(KeyPair keyPair, String str) throws Exception {
        Inspector.print(keyPair.getPrivate().getAlgorithm() + " signature and signature verify.");
        Inspector.print("  Signature calculation.");
        Signature signature = Signature.getInstance((String) algSignMap.get(keyPair.getPrivate().getAlgorithm()), str);
        signature.initSign(keyPair.getPrivate());
        signature.update("This is message, length=32 bytes".getBytes("UTF-8"));
        byte[] sign = signature.sign();
        Inspector.print("  Signature verify.");
        signature.initVerify(keyPair.getPublic());
        signature.update("This is message, length=32 bytes".getBytes("UTF-8"));
        if (!signature.verify(sign)) {
            d7g0.i();
            return;
        }
        Inspector.print("  Signature garble.");
        sign[0] = (byte) (sign[0] + 1);
        Inspector.print("  Verify, that signature not valid.");
        signature.initVerify(keyPair.getPublic());
        signature.update("This is message, length=32 bytes".getBytes("UTF-8"));
        if (signature.verify(sign)) {
            d7g0.i();
        } else {
            Inspector.print(Inspector.STR_TEST_PASSED);
        }
    }

    public static void checkStore(KeyPair keyPair, String str) throws Exception {
        Inspector.print("Certificate and key store procedures verify.");
        String simpleStoreName = PaneDefaultProvider.getSimpleStoreName(null);
        try {
            Inspector.print("  Certificate creation.");
            Certificate generateCertificate = CertificateFactory.getInstance(JCP.CERTIFICATE_FACTORY_NAME).generateCertificate(new ByteArrayInputStream(createCertificate(keyPair, str)));
            Inspector.print("  Saving key to the store.");
            KeyStore keyStore = KeyStore.getInstance(simpleStoreName, str);
            keyStore.load(null, null);
            if (keyStore.isKeyEntry(keyPair.getPrivate().getAlgorithm())) {
                keyStore.deleteEntry(keyPair.getPrivate().getAlgorithm());
            }
            keyStore.setKeyEntry(keyPair.getPrivate().getAlgorithm(), keyPair.getPrivate(), null, new Certificate[]{generateCertificate});
            keyStore.store(null, null);
            Inspector.print("  Reading key from the store.");
            KeyStore keyStore2 = KeyStore.getInstance(simpleStoreName, str);
            keyStore2.load(null, null);
            PrivateKey privateKey = (PrivateKey) keyStore2.getKey(keyPair.getPrivate().getAlgorithm(), null);
            Inspector.print("  Verify on reading private key and initial public key.");
            checkSign(new KeyPair(keyPair.getPublic(), privateKey), str);
            Inspector.print("  Store cleaning.");
            KeyStore keyStore3 = KeyStore.getInstance(simpleStoreName, str);
            keyStore3.load(null, null);
            if (keyStore3.isKeyEntry(keyPair.getPrivate().getAlgorithm())) {
                keyStore3.deleteEntry(keyPair.getPrivate().getAlgorithm());
            }
            Inspector.print(Inspector.STR_TEST_PASSED);
        } catch (Throwable th) {
            Inspector.print("  Store cleaning.");
            KeyStore keyStore4 = KeyStore.getInstance(simpleStoreName, str);
            keyStore4.load(null, null);
            if (keyStore4.isKeyEntry(keyPair.getPrivate().getAlgorithm())) {
                keyStore4.deleteEntry(keyPair.getPrivate().getAlgorithm());
            }
            throw th;
        }
    }

    private static byte[] createCertificate(KeyPair keyPair, String str) throws Exception {
        Class<?> loadClass = ClassLoader.getSystemClassLoader().loadClass("ru.CryptoPro.JCPRequest.GostCertificateRequest");
        return (byte[]) loadClass.getMethod("getEncodedSelfCert", KeyPair.class, String.class).invoke(loadClass.getConstructor(String.class).newInstance(str), keyPair, "CN=Sample, O=CryptoPro, C=RU");
    }

    private static IvParameterSpec genIV(String str) throws Exception {
        byte[] bArr = new byte[8];
        SecureRandom.getInstance(JCP.CP_RANDOM, str).nextBytes(bArr);
        return new IvParameterSpec(bArr);
    }

    public static void main(String[] strArr) throws Exception {
        try {
            String defaultDigestSignatureProvider = PaneDefaultProvider.getDefaultDigestSignatureProvider(null);
            String defaultEncryptionProvider = PaneDefaultProvider.getDefaultEncryptionProvider(null);
            checkRandom(defaultDigestSignatureProvider);
            checkDigest(defaultDigestSignatureProvider);
            int i = 0;
            while (true) {
                String[] strArr2 = keyAlgs;
                if (i >= strArr2.length) {
                    Inspector.print(Inspector.STR_TEST_PASSED);
                    return;
                }
                KeyPair checkGenerate = checkGenerate(strArr2[i], defaultEncryptionProvider);
                checkSign(checkGenerate, defaultDigestSignatureProvider);
                checkStore(checkGenerate, defaultDigestSignatureProvider);
                checkCrypt(checkAgreement(checkGenerate, defaultEncryptionProvider, defaultDigestSignatureProvider), defaultEncryptionProvider, defaultDigestSignatureProvider);
                checkImito(KeyGenerator.getInstance("GOST28147", defaultEncryptionProvider).generateKey(), defaultEncryptionProvider);
                i++;
            }
        } catch (Exception e) {
            Inspector.print(e);
        }
    }
}
