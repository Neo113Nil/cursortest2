package ru.CryptoPro.JCP.VMInspector;

import defpackage.d7g0;
import defpackage.w511;
import java.io.PrintStream;
import java.lang.reflect.Method;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.MessageDigest;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.cert.Certificate;
import java.util.Arrays;
import java.util.Vector;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.Random.CertifiedRandom;
import ru.CryptoPro.JCP.tools.Array;
import ru.CryptoPro.JCPRequest.CertGen;
import ru.CryptoPro.reprov.array.DerValue;
import ru.CryptoPro.ssl.Alerts;

/* loaded from: classes4.dex */
public class SilentSample {
    private static final String CHARSET = "UTF-8";
    public static final String EFEMERAL = "GOST3410DHELEPH";
    public static final String GOST28147 = "GOST28147";
    public static final String GOST3410_EL_DH = "GOST3410DHEL";
    public static final String TEST_TEXT = "This is message, length=32 bytes";
    public static final byte[] TEST_RESULT = {Alerts.alert_certificate_revoked, -17, -62, -9, -73, -67, -59, 20, -31, -114, -91, Byte.MAX_VALUE, -89, 79, -13, 87, -25, -6, 23, -42, 82, -57, 95, 105, -53, DerValue.tag_GeneralString, -25, -119, 62, -34, 72, -21};
    private static PrivateKey privateKey = null;
    private static PublicKey publicKey = null;
    private static Certificate certificate = null;

    private SilentSample() {
    }

    public static void check(PrintStream printStream) throws Exception {
        try {
            print(printStream, "SAMPLE 1:Key pair generation verify.");
            KeyPair checkGenerate = checkGenerate();
            print(printStream, "SAMPLE 2:Key pair saving.");
            saveKeyPair(checkGenerate, "GOST3410DHEL");
            print(printStream, "SAMPLE 3:Random sequence generation verify.");
            checkRandom();
            print(printStream, "SAMPLE 4:GOST R 34.11-94 hash verify.");
            checkDigest();
            print(printStream, "SAMPLE 5:Read key from store.");
            readPair("GOST3410DHEL");
            print(printStream, "SAMPLE 6:Certificate and key store procedures verify.");
            checkStore();
            print(printStream, "SAMPLE 7:GOST R 34.10-2001 signature.");
            checkSign();
            print(printStream, "SAMPLE 8:Diffy-Helman key generation verify");
            SecretKey checkAgreement = checkAgreement();
            print(printStream, "SAMPLE 9:GOST R 28147-89 encryption verify");
            checkCrypt(checkAgreement);
            print(printStream, "SAMPLE 10:GOST R 28147-89 MAC verify");
            checkImito(checkAgreement);
            print(printStream, "SAMPLE 11:End");
        } catch (Exception e) {
            print(printStream, e);
        }
    }

    public static SecretKey checkAgreement() throws Exception {
        KeyAgreement keyAgreement = KeyAgreement.getInstance("GOST3410DHEL", "Crypto");
        keyAgreement.init(privateKey, new IvParameterSpec("This is message, length=32 bytes".getBytes("UTF-8")));
        keyAgreement.doPhase(publicKey, true);
        return keyAgreement.generateSecret("GOST28147");
    }

    public static void checkCrypt(SecretKey secretKey) throws Exception {
        IvParameterSpec ivParameterSpec = new IvParameterSpec("This is message, length=32 bytes".getBytes("UTF-8"));
        Cipher cipher = Cipher.getInstance("GOST28147", "Crypto");
        cipher.init(1, secretKey, ivParameterSpec);
        byte[] doFinal = cipher.doFinal("This is message, length=32 bytes".getBytes("UTF-8"));
        if (Arrays.equals(doFinal, "This is message, length=32 bytes".getBytes("UTF-8"))) {
            d7g0.i();
            return;
        }
        cipher.init(2, secretKey, ivParameterSpec);
        if (Arrays.equals(cipher.doFinal(doFinal), "This is message, length=32 bytes".getBytes("UTF-8"))) {
            return;
        }
        d7g0.i();
    }

    public static void checkDigest() throws Exception {
        if (Arrays.equals(MessageDigest.getInstance(JCP.GOST_DIGEST_NAME, "JCP").digest("This is message, length=32 bytes".getBytes("UTF-8")), TEST_RESULT)) {
            return;
        }
        d7g0.i();
    }

    public static KeyPair checkGenerate() throws Exception {
        return KeyPairGenerator.getInstance("GOST3410DHEL", "Crypto").generateKeyPair();
    }

    public static void checkImito(SecretKey secretKey) throws Exception {
        Mac mac = Mac.getInstance("GOST28147", "Crypto");
        mac.init(secretKey);
        mac.doFinal("This is message, length=32 bytes".getBytes("UTF-8"));
    }

    public static void checkRandom() throws Exception {
        byte[] bArr = new byte[1024];
        SecureRandom.getInstance(JCP.CP_RANDOM, "JCP").nextBytes(bArr);
        if (CertifiedRandom.testStatRawBuf(Array.toIntArray(bArr))) {
            return;
        }
        d7g0.i();
    }

    public static void checkSign() throws Exception {
        Signature signature = Signature.getInstance("GOST3411withGOST3410EL", "JCP");
        signature.initSign(privateKey);
        signature.update("This is message, length=32 bytes".getBytes("UTF-8"));
        byte[] sign = signature.sign();
        signature.initVerify(publicKey);
        signature.update("This is message, length=32 bytes".getBytes("UTF-8"));
        if (!signature.verify(sign)) {
            d7g0.i();
            return;
        }
        sign[0] = (byte) (sign[0] + 1);
        signature.initVerify(publicKey);
        signature.update("This is message, length=32 bytes".getBytes("UTF-8"));
        if (signature.verify(sign)) {
            d7g0.i();
        }
    }

    public static void checkStore() throws Exception {
        KeyStore keyStore = KeyStore.getInstance("HDImageStore", "JCP");
        keyStore.load(null, null);
        keyStore.setKeyEntry("GOST3410DHEL", privateKey, null, new Certificate[]{certificate});
        keyStore.store(null, null);
    }

    public static void main(String[] strArr) throws Exception {
        check(System.out);
    }

    public static void print(PrintStream printStream, Exception exc) {
        exc.toString();
        printStream.getClass();
        exc.printStackTrace(printStream);
    }

    public static KeyPair readPair(String str) throws Exception {
        KeyStore keyStore = KeyStore.getInstance("HDImageStore", "JCP");
        keyStore.load(null, null);
        privateKey = (PrivateKey) keyStore.getKey(str, null);
        Certificate certificate2 = keyStore.getCertificate(str);
        certificate = certificate2;
        publicKey = certificate2.getPublicKey();
        return new KeyPair(publicKey, privateKey);
    }

    public static void saveKeyPair(KeyPair keyPair, String str) throws Exception {
        KeyStore keyStore = KeyStore.getInstance("HDImageStore", "JCP");
        keyStore.load(null, null);
        Vector vector = CertGen.a;
        Method[] methods = CertGen.class.getMethods();
        Method method = null;
        for (int i = 0; i < methods.length; i++) {
            if ("Certgen".equalsIgnoreCase(methods[i].getName())) {
                method = methods[i];
            }
        }
        if (method == null) {
            w511.s("Method for generation of certificate request not found");
            return;
        }
        keyStore.setKeyEntry(str, keyPair.getPrivate(), null, (Certificate[]) method.invoke(null, "JCP", "GOST3410DHEL", "false", null, keyPair, "CN=GOST3410DHEL,C=RU", null, "self", null, null));
        keyStore.store(null, null);
    }

    public static void print(PrintStream printStream, String str) {
        printStream.getClass();
    }
}
