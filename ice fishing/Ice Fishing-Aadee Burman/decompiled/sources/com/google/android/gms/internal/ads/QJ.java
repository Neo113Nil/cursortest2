package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes2.dex */
public final class QJ implements InterfaceC3394jE {

    /* renamed from: e, reason: collision with root package name */
    public static final L7.b f27015e = new L7.b(8);

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f27016a;

    /* renamed from: b, reason: collision with root package name */
    public final YG f27017b;

    /* renamed from: c, reason: collision with root package name */
    public final SecretKeySpec f27018c;

    /* renamed from: d, reason: collision with root package name */
    public final int f27019d;

    public QJ(int i, byte[] bArr, byte[] bArr2) {
        if (!WC.c(1)) {
            throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        }
        if (i != 12 && i != 16) {
            throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
        }
        this.f27019d = i;
        int length = bArr.length;
        AbstractC3341iD.d(length);
        this.f27018c = new SecretKeySpec(bArr, "AES");
        this.f27017b = C2921aN.k(WG.i(XG.b(length), new C3105du(8, C3240gK.a(bArr))));
        this.f27016a = bArr2;
    }

    public static QJ b(HE he) {
        if (!WC.c(1)) {
            throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        }
        he.getClass();
        return new QJ(he.f25244b.f25659b, ((C3240gK) he.f25245c.f29859u).b(), he.f25246d.b());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3394jE
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = this.f27016a;
        int length2 = bArr3.length;
        int i = this.f27019d;
        int i6 = ((length - length2) - i) - 16;
        if (i6 < 0) {
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
        byte[] c11 = c(2, length2 + i, i6, bArr);
        int i9 = length - 16;
        byte b9 = 0;
        for (int i10 = 0; i10 < 16; i10++) {
            b9 = (byte) (b9 | (((bArr[i9 + i10] ^ c10[i10]) ^ c9[i10]) ^ c11[i10]));
        }
        if (b9 != 0) {
            throw new AEADBadTagException("tag mismatch");
        }
        Cipher cipher = (Cipher) f27015e.get();
        cipher.init(1, this.f27018c, new IvParameterSpec(c9));
        return cipher.doFinal(bArr, bArr3.length + i, i6);
    }

    public final byte[] c(int i, int i6, int i9, byte[] bArr) {
        byte[] bArr2 = new byte[i9 + 16];
        bArr2[15] = (byte) i;
        System.arraycopy(bArr, i6, bArr2, 16, i9);
        return this.f27017b.d(16, bArr2);
    }
}
