package com.google.crypto.tink.aead.subtle;

import androidx.camera.core.impl.utils.Exif;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.crypto.tink.Aead;
import com.google.crypto.tink.aead.AesGcmSivKey;
import com.google.crypto.tink.subtle.Validators;
import com.google.crypto.tink.util.Bytes;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes4.dex */
public abstract class AesGcmSiv implements Aead {
    public static final Exif.AnonymousClass1 localAesGcmSivCipher = new Exif.AnonymousClass1(15);

    public static com.google.crypto.tink.aead.internal.AesGcmSiv create(AesGcmSivKey aesGcmSivKey) {
        new AesGcmSiv$$ExternalSyntheticLambda0(0);
        byte[] bArr = com.google.crypto.tink.aead.internal.AesGcmSiv.testPlaintext;
        try {
            Cipher cipher = (Cipher) localAesGcmSivCipher.get();
            if (cipher == null) {
                throw new GeneralSecurityException("AES GCM SIV cipher is invalid.");
            }
            if (!com.google.crypto.tink.aead.internal.AesGcmSiv.isAesGcmSivCipher(cipher)) {
                a$$ExternalSyntheticBUOutline0.m$1("Cipher does not implement AES GCM SIV.");
                return null;
            }
            byte[] byteArray = ((Bytes) aesGcmSivKey.keyBytes.adapter).toByteArray();
            aesGcmSivKey.outputPrefix.toByteArray();
            com.google.crypto.tink.aead.internal.AesGcmSiv aesGcmSiv = new com.google.crypto.tink.aead.internal.AesGcmSiv();
            Validators.validateAesKeySize(byteArray.length);
            new SecretKeySpec(byteArray, "AES");
            return aesGcmSiv;
        } catch (IllegalStateException e) {
            throw new GeneralSecurityException("AES GCM SIV cipher is not available or is invalid.", e);
        }
    }
}
