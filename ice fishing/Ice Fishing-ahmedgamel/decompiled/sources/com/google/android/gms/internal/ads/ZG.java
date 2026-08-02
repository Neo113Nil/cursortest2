package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes2.dex */
public final class ZG implements YG {

    /* renamed from: w, reason: collision with root package name */
    public static final L7.b f29642w = new L7.b(6);

    /* renamed from: n, reason: collision with root package name */
    public final SecretKeySpec f29643n;

    /* renamed from: u, reason: collision with root package name */
    public final byte[] f29644u;

    /* renamed from: v, reason: collision with root package name */
    public final byte[] f29645v;

    public ZG(byte[] bArr) {
        AbstractC3364iD.d(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.f29643n = secretKeySpec;
        if (!WC.c(1)) {
            throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
        }
        Cipher cipher = (Cipher) f29642w.get();
        cipher.init(1, secretKeySpec);
        byte[] d9 = WC.d(cipher.doFinal(new byte[16]));
        this.f29644u = d9;
        this.f29645v = WC.d(d9);
    }

    @Override // com.google.android.gms.internal.ads.YG
    public final byte[] d(int i, byte[] bArr) {
        byte[] g9;
        if (i > 16) {
            throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
        }
        SecretKeySpec secretKeySpec = this.f29643n;
        if (!WC.c(1)) {
            throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
        }
        Cipher cipher = (Cipher) f29642w.get();
        cipher.init(1, secretKeySpec);
        int length = bArr.length;
        int i4 = length != 0 ? 1 + ((length - 1) >> 4) : 1;
        int i6 = i4 - 1;
        int i9 = i6 * 16;
        if (i4 * 16 == length) {
            g9 = AbstractC4117wD.g(i9, bArr, this.f29644u);
        } else {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, i9, length);
            int length2 = copyOfRange.length;
            if (length2 >= 16) {
                throw new IllegalArgumentException("x must be smaller than a block.");
            }
            byte[] copyOf = Arrays.copyOf(copyOfRange, 16);
            copyOf[length2] = com.anythink.core.common.s.a.c.f17103a;
            if (copyOf.length != 16) {
                throw new IllegalArgumentException("The lengths of x and y should match.");
            }
            g9 = AbstractC4117wD.g(0, copyOf, this.f29645v);
        }
        byte[] bArr2 = new byte[16];
        byte[] bArr3 = new byte[16];
        for (int i10 = 0; i10 < i6; i10++) {
            int i11 = i10 * 16;
            for (int i12 = 0; i12 < 16; i12++) {
                bArr3[i12] = (byte) (bArr2[i12] ^ bArr[i12 + i11]);
            }
            if (cipher.doFinal(bArr3, 0, 16, bArr2) != 16) {
                throw new IllegalStateException("Cipher didn't write full block");
            }
        }
        for (int i13 = 0; i13 < 16; i13++) {
            bArr3[i13] = (byte) (bArr2[i13] ^ g9[i13]);
        }
        if (cipher.doFinal(bArr3, 0, 16, bArr2) == 16) {
            return i == 16 ? bArr2 : Arrays.copyOf(bArr2, i);
        }
        throw new IllegalStateException("Cipher didn't write full block");
    }
}
