package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes2.dex */
public final class QJ implements InterfaceC3417jE {

    /* renamed from: e, reason: collision with root package name */
    public static final L7.b f27802e = new L7.b(8);

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f27803a;

    /* renamed from: b, reason: collision with root package name */
    public final YG f27804b;

    /* renamed from: c, reason: collision with root package name */
    public final SecretKeySpec f27805c;

    /* renamed from: d, reason: collision with root package name */
    public final int f27806d;

    public QJ(int i, byte[] bArr, byte[] bArr2) {
        if (!WC.c(1)) {
            throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        }
        if (i != 12 && i != 16) {
            throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
        }
        this.f27806d = i;
        int length = bArr.length;
        AbstractC3364iD.d(length);
        this.f27805c = new SecretKeySpec(bArr, "AES");
        this.f27804b = C2944aN.k(WG.i(XG.b(length), new C3128du(8, C3263gK.a(bArr))));
        this.f27803a = bArr2;
    }

    public static QJ b(HE he) {
        if (!WC.c(1)) {
            throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        }
        he.getClass();
        return new QJ(he.f26016b.f26412b, ((C3263gK) he.f26017c.f30647u).b(), he.f26018d.b());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3417jE
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = this.f27803a;
        int length2 = bArr3.length;
        int i = this.f27806d;
        int i4 = ((length - length2) - i) - 16;
        if (i4 < 0) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!DG.c(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] c9 = c(0, length2, i, bArr);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] c10 = c(1, 0, bArr2.length, bArr2);
        byte[] c11 = c(2, length2 + i, i4, bArr);
        int i6 = length - 16;
        byte b9 = 0;
        for (int i9 = 0; i9 < 16; i9++) {
            b9 = (byte) (b9 | (((bArr[i6 + i9] ^ c10[i9]) ^ c9[i9]) ^ c11[i9]));
        }
        if (b9 != 0) {
            throw new AEADBadTagException("tag mismatch");
        }
        Cipher cipher = (Cipher) f27802e.get();
        cipher.init(1, this.f27805c, new IvParameterSpec(c9));
        return cipher.doFinal(bArr, bArr3.length + i, i4);
    }

    public final byte[] c(int i, int i4, int i6, byte[] bArr) {
        byte[] bArr2 = new byte[i6 + 16];
        bArr2[15] = (byte) i;
        System.arraycopy(bArr, i4, bArr2, 16, i6);
        return this.f27804b.d(16, bArr2);
    }
}
