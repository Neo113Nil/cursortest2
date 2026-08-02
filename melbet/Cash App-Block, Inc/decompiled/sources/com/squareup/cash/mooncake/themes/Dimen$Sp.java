package com.squareup.cash.mooncake.themes;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.crypto.tink.aead.AesEaxParameters;
import com.google.crypto.tink.aead.AesGcmParameters;
import com.google.crypto.tink.aead.internal.AesGcmJceUtil;
import com.google.crypto.tink.hybrid.internal.EciesDemHelper;
import com.google.crypto.tink.internal.Random;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class Dimen$Sp implements EciesDemHelper.Dem {
    public final int value;

    public Dimen$Sp(AesGcmParameters aesGcmParameters) {
        if (aesGcmParameters.ivSizeBytes != 12) {
            a$$ExternalSyntheticBUOutline0.m$6("invalid IV size");
            throw null;
        }
        if (aesGcmParameters.tagSizeBytes != 16) {
            a$$ExternalSyntheticBUOutline0.m$6("invalid tag size");
            throw null;
        }
        if (aesGcmParameters.variant == AesEaxParameters.Variant.NO_PREFIX$2) {
            this.value = aesGcmParameters.keySizeBytes;
        } else {
            a$$ExternalSyntheticBUOutline0.m$6("invalid variant");
            throw null;
        }
    }

    @Override // com.google.crypto.tink.hybrid.internal.EciesDemHelper.Dem
    public byte[] decrypt(byte[] bArr, byte[] bArr2, int i) {
        if (bArr2.length < i) {
            a$$ExternalSyntheticBUOutline0.m$6("ciphertext too short");
            return null;
        }
        if (bArr.length != this.value) {
            a$$ExternalSyntheticBUOutline0.m$6("invalid key size");
            return null;
        }
        SecretKeySpec secretKey = AesGcmJceUtil.getSecretKey(bArr);
        int i2 = i + 12;
        if (bArr2.length < i + 28) {
            a$$ExternalSyntheticBUOutline0.m$6("ciphertext too short");
            return null;
        }
        AlgorithmParameterSpec params = AesGcmJceUtil.getParams(i, 12, bArr2);
        Cipher threadLocalCipher = AesGcmJceUtil.getThreadLocalCipher();
        threadLocalCipher.init(2, secretKey, params);
        return threadLocalCipher.doFinal(bArr2, i2, (bArr2.length - i) - 12);
    }

    @Override // com.google.crypto.tink.hybrid.internal.EciesDemHelper.Dem
    public byte[] encrypt(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        if (bArr.length != this.value) {
            a$$ExternalSyntheticBUOutline0.m$6("invalid key size");
            return null;
        }
        SecretKeySpec secretKey = AesGcmJceUtil.getSecretKey(bArr);
        byte[] randBytes = Random.randBytes(12);
        AlgorithmParameterSpec params = AesGcmJceUtil.getParams(randBytes);
        Cipher threadLocalCipher = AesGcmJceUtil.getThreadLocalCipher();
        threadLocalCipher.init(1, secretKey, params);
        int outputSize = threadLocalCipher.getOutputSize(bArr4.length);
        int length = bArr2.length + bArr3.length;
        if (outputSize > 2147483635 - length) {
            a$$ExternalSyntheticBUOutline0.m$6("plaintext too long");
            return null;
        }
        int i = length + 12;
        byte[] copyOf = Arrays.copyOf(bArr2, i + outputSize);
        System.arraycopy(bArr3, 0, copyOf, bArr2.length, bArr3.length);
        System.arraycopy(randBytes, 0, copyOf, length, 12);
        if (threadLocalCipher.doFinal(bArr4, 0, bArr4.length, copyOf, i) == outputSize) {
            return copyOf;
        }
        a$$ExternalSyntheticBUOutline0.m$6("not enough data written");
        return null;
    }

    @Override // com.google.crypto.tink.hybrid.internal.EciesDemHelper.Dem
    public int getSymmetricKeySizeInBytes() {
        return this.value;
    }

    public Dimen$Sp(int i) {
        this.value = i;
    }
}
