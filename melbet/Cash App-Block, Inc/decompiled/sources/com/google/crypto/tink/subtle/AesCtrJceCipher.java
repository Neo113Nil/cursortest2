package com.google.crypto.tink.subtle;

import androidx.camera.core.impl.utils.Exif;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes4.dex */
public final class AesCtrJceCipher {
    public static final Exif.AnonymousClass1 localCipher = new Exif.AnonymousClass1(17);
    public final int blockSize;
    public final int ivSize;
    public final SecretKeySpec keySpec;

    public AesCtrJceCipher(byte[] bArr, int i) {
        if (!re$$ExternalSyntheticOutline0._isCompatible$1(2)) {
            a$$ExternalSyntheticBUOutline0.m$6("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
            throw null;
        }
        Validators.validateAesKeySize(bArr.length);
        this.keySpec = new SecretKeySpec(bArr, "AES");
        int blockSize = ((Cipher) localCipher.get()).getBlockSize();
        this.blockSize = blockSize;
        if (i < 12 || i > blockSize) {
            a$$ExternalSyntheticBUOutline0.m$6("invalid IV size");
            throw null;
        }
        this.ivSize = i;
    }

    public final void doCtr(boolean z, byte[] bArr, byte[] bArr2, int i, int i2, byte[] bArr3, int i3) {
        Cipher cipher = (Cipher) localCipher.get();
        byte[] bArr4 = new byte[this.blockSize];
        System.arraycopy(bArr3, 0, bArr4, 0, this.ivSize);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr4);
        SecretKeySpec secretKeySpec = this.keySpec;
        if (z) {
            cipher.init(1, secretKeySpec, ivParameterSpec);
        } else {
            cipher.init(2, secretKeySpec, ivParameterSpec);
        }
        if (cipher.doFinal(bArr, i, i2, bArr2, i3) == i2) {
            return;
        }
        a$$ExternalSyntheticBUOutline0.m$6("stored output's length does not match input's length");
    }
}
