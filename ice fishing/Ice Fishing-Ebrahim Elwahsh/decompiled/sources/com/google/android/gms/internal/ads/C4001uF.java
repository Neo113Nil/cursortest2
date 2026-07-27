package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.Provider;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.android.gms.internal.ads.uF, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4001uF implements InterfaceC3569mE {

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f34569d = AbstractC4161xD.e("808182838485868788898a8b8c8d8e8f909192939495969798999a9b9c9d9e9f");

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f34570e = AbstractC4161xD.e("070000004041424344454647");

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f34571f = AbstractC4161xD.e("a0784d7a4716f3feb4f64e7f4b39bf04");

    /* renamed from: a, reason: collision with root package name */
    public final SecretKeySpec f34572a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f34573b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider f34574c;

    public C4001uF(byte[] bArr, byte[] bArr2, Provider provider) {
        if (!XC.e(1)) {
            throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
        }
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.f34572a = new SecretKeySpec(bArr, "ChaCha20");
        this.f34573b = bArr2;
        this.f34574c = provider;
    }

    public static Cipher b() {
        Cipher cipher = (Cipher) C3253gK.f30981b.f30987a.d("ChaCha20-Poly1305");
        try {
            IvParameterSpec ivParameterSpec = new IvParameterSpec(f34570e);
            byte[] bArr = f34569d;
            cipher.init(2, new SecretKeySpec(bArr, "ChaCha20"), ivParameterSpec);
            byte[] bArr2 = f34571f;
            if (cipher.doFinal(bArr2).length == 0) {
                cipher.init(2, new SecretKeySpec(bArr, "ChaCha20"), ivParameterSpec);
                if (cipher.doFinal(bArr2).length == 0) {
                    return cipher;
                }
            }
        } catch (GeneralSecurityException unused) {
        }
        throw new GeneralSecurityException("JCE does not support algorithm: ChaCha20-Poly1305");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3569mE
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            throw new NullPointerException("ciphertext is null");
        }
        int length = bArr.length;
        byte[] bArr3 = this.f34573b;
        int length2 = bArr3.length;
        if (length < length2 + 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!IG.c(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] bArr4 = new byte[12];
        System.arraycopy(bArr, length2, bArr4, 0, 12);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr4);
        SecretKeySpec secretKeySpec = this.f34572a;
        Cipher cipher = Cipher.getInstance("ChaCha20-Poly1305", this.f34574c);
        cipher.init(2, secretKeySpec, ivParameterSpec);
        if (bArr2 != null && bArr2.length != 0) {
            cipher.updateAAD(bArr2);
        }
        return cipher.doFinal(bArr, length2 + 12, (length - length2) - 12);
    }
}
