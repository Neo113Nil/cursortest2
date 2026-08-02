package com.google.crypto.tink.prf.internal;

import androidx.camera.core.impl.utils.Exif;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import com.google.crypto.tink.prf.Prf;
import com.google.crypto.tink.subtle.Bytes;
import com.google.crypto.tink.subtle.Validators;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import kotlin.reflect.jvm.KCallablesJvm;

/* loaded from: classes4.dex */
public final class PrfAesCmac implements Prf {
    public static final Exif.AnonymousClass1 localAesCipher = new Exif.AnonymousClass1(16);
    public final SecretKeySpec keySpec;
    public final byte[] subKey1;
    public final byte[] subKey2;

    public PrfAesCmac(byte[] bArr) {
        Validators.validateAesKeySize(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.keySpec = secretKeySpec;
        if (!re$$ExternalSyntheticOutline0._isCompatible(1)) {
            a$$ExternalSyntheticBUOutline0.m$6("Can not use AES-CMAC in FIPS-mode.");
            throw null;
        }
        Cipher cipher = (Cipher) localAesCipher.get();
        cipher.init(1, secretKeySpec);
        byte[] dbl = KCallablesJvm.dbl(cipher.doFinal(new byte[16]));
        this.subKey1 = dbl;
        this.subKey2 = KCallablesJvm.dbl(dbl);
    }

    @Override // com.google.crypto.tink.prf.Prf
    public final byte[] compute(int i, byte[] bArr) {
        byte[] xor;
        if (i > 16) {
            AesGcmSiv$$ExternalSyntheticLambda0.m$1("outputLength too large, max is 16 bytes");
            return null;
        }
        if (!re$$ExternalSyntheticOutline0._isCompatible(1)) {
            a$$ExternalSyntheticBUOutline0.m$6("Can not use AES-CMAC in FIPS-mode.");
            return null;
        }
        Cipher cipher = (Cipher) localAesCipher.get();
        cipher.init(1, this.keySpec);
        int length = bArr.length;
        int m = length == 0 ? 1 : JsonLogicResult$Success$$ExternalSyntheticOutline0.m(length, 1, 16, 1);
        if (m * 16 == bArr.length) {
            xor = Bytes.xor(bArr, (m - 1) * 16, this.subKey1, 16);
        } else {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, (m - 1) * 16, bArr.length);
            if (copyOfRange.length >= 16) {
                a$$ExternalSyntheticBUOutline0.m$3("x must be smaller than a block.");
                return null;
            }
            byte[] copyOf = Arrays.copyOf(copyOfRange, 16);
            copyOf[copyOfRange.length] = Byte.MIN_VALUE;
            xor = Bytes.xor(copyOf, this.subKey2);
        }
        byte[] bArr2 = new byte[16];
        byte[] bArr3 = new byte[16];
        for (int i2 = 0; i2 < m - 1; i2++) {
            int i3 = i2 * 16;
            for (int i4 = 0; i4 < 16; i4++) {
                bArr3[i4] = (byte) (bArr2[i4] ^ bArr[i4 + i3]);
            }
            if (cipher.doFinal(bArr3, 0, 16, bArr2) != 16) {
                a$$ExternalSyntheticBUOutline0.m$1("Cipher didn't write full block");
                return null;
            }
        }
        for (int i5 = 0; i5 < 16; i5++) {
            bArr3[i5] = (byte) (bArr2[i5] ^ xor[i5]);
        }
        if (cipher.doFinal(bArr3, 0, 16, bArr2) == 16) {
            return 16 == i ? bArr2 : Arrays.copyOf(bArr2, i);
        }
        a$$ExternalSyntheticBUOutline0.m$1("Cipher didn't write full block");
        return null;
    }
}
