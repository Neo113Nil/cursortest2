package com.google.crypto.tink.aead.internal;

import com.google.crypto.tink.Aead;
import com.google.crypto.tink.subtle.Hex;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes4.dex */
public final class AesGcmSiv implements Aead {
    public static final byte[] testPlaintext = Hex.decode("7a806c");
    public static final byte[] testAad = Hex.decode("46bb91c3c5");
    public static final byte[] testKey = Hex.decode("36864200e0eaf5284d884a0e77d31646");
    public static final byte[] testNounce = Hex.decode("bae8e37fc83441b16034566b");
    public static final byte[] testResult = Hex.decode("af60eb711bd85bc1e4d3e0a462e074eea428a8");

    public static boolean isAesGcmSivCipher(Cipher cipher) {
        try {
            byte[] bArr = testNounce;
            cipher.init(2, new SecretKeySpec(testKey, "AES"), new GCMParameterSpec(128, bArr, 0, bArr.length));
            cipher.updateAAD(testAad);
            byte[] bArr2 = testResult;
            return MessageDigest.isEqual(cipher.doFinal(bArr2, 0, bArr2.length), testPlaintext);
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }
}
