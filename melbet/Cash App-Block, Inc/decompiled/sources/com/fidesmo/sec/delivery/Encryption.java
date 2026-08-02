package com.fidesmo.sec.delivery;

import android.util.Base64;
import com.fidesmo.sec.utils.Hex;
import java.io.ByteArrayInputStream;
import java.security.Key;
import java.security.PublicKey;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.spec.IvParameterSpec;
import javax.security.cert.CertificateException;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

/* loaded from: classes4.dex */
class Encryption {
    private final PublicKey publicKey;

    private Encryption(PublicKey publicKey) {
        this.publicKey = publicKey;
    }

    private byte[] encrypt(byte[] bArr, Key key) {
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding", BouncyCastleProvider.PROVIDER_NAME);
        cipher.init(1, key, new IvParameterSpec(new byte[16]));
        return cipher.doFinal(bArr);
    }

    private byte[] encryptEphemeral(Key key) {
        Cipher cipher = Cipher.getInstance("RSA/NONE/OAEPWithSHA512AndMGF1Padding", BouncyCastleProvider.PROVIDER_NAME);
        cipher.init(1, this.publicKey);
        return cipher.doFinal(key.getEncoded());
    }

    public static EncryptedUserResponse encryptUserResponse(Map<String, String> map, PublicKey publicKey) {
        if (publicKey == null) {
            throw new CertificateException("Service wasn't properly configured: Encryption was requested but no certificate was provided.");
        }
        Encryption encryption = new Encryption(publicKey);
        HashMap hashMap = new HashMap();
        Key generateEphemeralKey = encryption.generateEphemeralKey();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            hashMap.put(entry.getKey(), Hex.encodeHex(encryption.encrypt(entry.getValue().getBytes(), generateEphemeralKey)));
        }
        return new EncryptedUserResponse(hashMap, encryption.encryptEphemeral(generateEphemeralKey));
    }

    private Key generateEphemeralKey() {
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        keyGenerator.init(256);
        return keyGenerator.generateKey();
    }

    public static PublicKey stringToPublicKey(String str) {
        return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(Base64.decode(str, 0)))).getPublicKey();
    }
}
