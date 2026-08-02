package com.google.crypto.tink.aead.internal;

import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.crypto.tink.Aead;
import com.google.crypto.tink.aead.ChaCha20Poly1305Key;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import com.google.crypto.tink.subtle.EngineFactory;
import com.google.crypto.tink.subtle.Hex;
import com.google.crypto.tink.util.Bytes;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes4.dex */
public final class ChaCha20Poly1305Jce implements Aead {
    public static final byte[] testKey = Hex.decode("808182838485868788898a8b8c8d8e8f909192939495969798999a9b9c9d9e9f");
    public static final byte[] testNonce = Hex.decode("070000004041424344454647");
    public static final byte[] testCiphertextOfEmpty = Hex.decode("a0784d7a4716f3feb4f64e7f4b39bf04");

    public static ChaCha20Poly1305Jce create(ChaCha20Poly1305Key chaCha20Poly1305Key) {
        Cipher validCipherInstance = getValidCipherInstance();
        byte[] byteArray = ((Bytes) chaCha20Poly1305Key.keyBytes.adapter).toByteArray();
        chaCha20Poly1305Key.outputPrefix.toByteArray();
        validCipherInstance.getProvider();
        ChaCha20Poly1305Jce chaCha20Poly1305Jce = new ChaCha20Poly1305Jce();
        if (!re$$ExternalSyntheticOutline0._isCompatible(1)) {
            a$$ExternalSyntheticBUOutline0.m$6("Can not use ChaCha20Poly1305 in FIPS-mode.");
            throw null;
        }
        if (byteArray.length == 32) {
            new SecretKeySpec(byteArray, "ChaCha20");
            return chaCha20Poly1305Jce;
        }
        AesGcmSiv$$ExternalSyntheticLambda0.m$2("The key length in bytes must be 32.");
        throw null;
    }

    public static Cipher getValidCipherInstance() {
        Cipher cipher = (Cipher) EngineFactory.CIPHER.policy.getInstance("ChaCha20-Poly1305");
        try {
            IvParameterSpec ivParameterSpec = new IvParameterSpec(testNonce);
            byte[] bArr = testKey;
            cipher.init(2, new SecretKeySpec(bArr, "ChaCha20"), ivParameterSpec);
            byte[] bArr2 = testCiphertextOfEmpty;
            if (cipher.doFinal(bArr2).length == 0) {
                cipher.init(2, new SecretKeySpec(bArr, "ChaCha20"), ivParameterSpec);
                if (cipher.doFinal(bArr2).length == 0) {
                    return cipher;
                }
            }
        } catch (GeneralSecurityException unused) {
        }
        a$$ExternalSyntheticBUOutline0.m$6("JCE does not support algorithm: ChaCha20-Poly1305");
        return null;
    }

    public static boolean isSupported() {
        try {
            getValidCipherInstance();
            return true;
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }
}
