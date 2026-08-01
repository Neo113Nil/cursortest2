package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes2.dex */
public final class ZG implements YG {

    /* renamed from: w, reason: collision with root package name */
    public static final L7.b f28862w = new L7.b(6);

    /* renamed from: n, reason: collision with root package name */
    public final SecretKeySpec f28863n;

    /* renamed from: u, reason: collision with root package name */
    public final byte[] f28864u;

    /* renamed from: v, reason: collision with root package name */
    public final byte[] f28865v;

    public ZG(byte[] bArr) {
        AbstractC3341iD.d(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.f28863n = secretKeySpec;
        if (!WC.c(1)) {
            throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
        }
        Cipher cipher = (Cipher) f28862w.get();
        cipher.init(1, secretKeySpec);
        byte[] d2 = WC.d(cipher.doFinal(new byte[16]));
        this.f28864u = d2;
        this.f28865v = WC.d(d2);
    }

    @Override // com.google.android.gms.internal.ads.YG
    public final byte[] d(int i, byte[] bArr) {
        byte[] g4;
        if (i > 16) {
            throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
        }
        SecretKeySpec secretKeySpec = this.f28863n;
        if (!WC.c(1)) {
            throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
        }
        Cipher cipher = (Cipher) f28862w.get();
        cipher.init(1, secretKeySpec);
        int length = bArr.length;
        int i6 = length != 0 ? 1 + ((length - 1) >> 4) : 1;
        int i9 = i6 - 1;
        int i10 = i9 * 16;
        if (i6 * 16 == length) {
            g4 = AbstractC4094wD.g(i10, bArr, this.f28864u);
        } else {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, i10, length);
            int length2 = copyOfRange.length;
            if (length2 >= 16) {
                throw new IllegalArgumentException("x must be smaller than a block.");
            }
            byte[] copyOf = Arrays.copyOf(copyOfRange, 16);
            copyOf[length2] = com.anythink.core.common.s.a.c.f16316a;
            if (copyOf.length != 16) {
                throw new IllegalArgumentException("The lengths of x and y should match.");
            }
            g4 = AbstractC4094wD.g(0, copyOf, this.f28865v);
        }
        byte[] bArr2 = new byte[16];
        byte[] bArr3 = new byte[16];
        for (int i11 = 0; i11 < i9; i11++) {
            int i12 = i11 * 16;
            for (int i13 = 0; i13 < 16; i13++) {
                bArr3[i13] = (byte) (bArr2[i13] ^ bArr[i13 + i12]);
            }
            if (cipher.doFinal(bArr3, 0, 16, bArr2) != 16) {
                throw new IllegalStateException("Cipher didn't write full block");
            }
        }
        for (int i14 = 0; i14 < 16; i14++) {
            bArr3[i14] = (byte) (bArr2[i14] ^ g4[i14]);
        }
        if (cipher.doFinal(bArr3, 0, 16, bArr2) == 16) {
            return i == 16 ? bArr2 : Arrays.copyOf(bArr2, i);
        }
        throw new IllegalStateException("Cipher didn't write full block");
    }
}
