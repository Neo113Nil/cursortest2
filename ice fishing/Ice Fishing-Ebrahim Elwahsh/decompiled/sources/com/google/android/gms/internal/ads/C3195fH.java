package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.android.gms.internal.ads.fH, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3195fH implements InterfaceC3140eH {

    /* renamed from: w, reason: collision with root package name */
    public static final H7.b f30681w = new H7.b(6);

    /* renamed from: n, reason: collision with root package name */
    public final SecretKeySpec f30682n;

    /* renamed from: u, reason: collision with root package name */
    public final byte[] f30683u;

    /* renamed from: v, reason: collision with root package name */
    public final byte[] f30684v;

    public C3195fH(byte[] bArr) {
        AbstractC3137eE.c(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.f30682n = secretKeySpec;
        if (!XC.e(1)) {
            throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
        }
        Cipher cipher = (Cipher) f30681w.get();
        cipher.init(1, secretKeySpec);
        byte[] e6 = AbstractC3137eE.e(cipher.doFinal(new byte[16]));
        this.f30683u = e6;
        this.f30684v = AbstractC3137eE.e(e6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3140eH
    public final byte[] n(int i, byte[] bArr) {
        byte[] h9;
        if (i > 16) {
            throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
        }
        SecretKeySpec secretKeySpec = this.f30682n;
        if (!XC.e(1)) {
            throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
        }
        Cipher cipher = (Cipher) f30681w.get();
        cipher.init(1, secretKeySpec);
        int length = bArr.length;
        int i4 = length != 0 ? 1 + ((length - 1) >> 4) : 1;
        int i9 = i4 - 1;
        int i10 = i9 * 16;
        if (i4 * 16 == length) {
            h9 = XC.h(i10, bArr, this.f30683u);
        } else {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, i10, length);
            int length2 = copyOfRange.length;
            if (length2 >= 16) {
                throw new IllegalArgumentException("x must be smaller than a block.");
            }
            byte[] copyOf = Arrays.copyOf(copyOfRange, 16);
            copyOf[length2] = com.anythink.core.common.s.a.c.f16474a;
            if (copyOf.length != 16) {
                throw new IllegalArgumentException("The lengths of x and y should match.");
            }
            h9 = XC.h(0, copyOf, this.f30684v);
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
            bArr3[i14] = (byte) (bArr2[i14] ^ h9[i14]);
        }
        if (cipher.doFinal(bArr3, 0, 16, bArr2) == 16) {
            return i == 16 ? bArr2 : Arrays.copyOf(bArr2, i);
        }
        throw new IllegalStateException("Cipher didn't write full block");
    }
}
