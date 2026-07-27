package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.android.gms.internal.ads.sF, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3893sF implements InterfaceC3569mE {

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f34216d = AbstractC4161xD.e("7a806c");

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f34217e = AbstractC4161xD.e("46bb91c3c5");

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f34218f = AbstractC4161xD.e("36864200e0eaf5284d884a0e77d31646");

    /* renamed from: g, reason: collision with root package name */
    public static final byte[] f34219g = AbstractC4161xD.e("bae8e37fc83441b16034566b");

    /* renamed from: h, reason: collision with root package name */
    public static final byte[] f34220h = AbstractC4161xD.e("af60eb711bd85bc1e4d3e0a462e074eea428a8");

    /* renamed from: a, reason: collision with root package name */
    public final DF f34221a;

    /* renamed from: b, reason: collision with root package name */
    public final SecretKeySpec f34222b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f34223c;

    public C3893sF(byte[] bArr, byte[] bArr2) {
        DF df = DF.f24384C;
        this.f34223c = bArr2;
        AbstractC3137eE.c(bArr.length);
        this.f34222b = new SecretKeySpec(bArr, "AES");
        this.f34221a = df;
    }

    public static boolean b(Cipher cipher) {
        try {
            byte[] bArr = f34219g;
            cipher.init(2, new SecretKeySpec(f34218f, "AES"), new GCMParameterSpec(128, bArr, 0, bArr.length));
            cipher.updateAAD(f34217e);
            byte[] bArr2 = f34220h;
            return MessageDigest.isEqual(cipher.doFinal(bArr2, 0, bArr2.length), f34216d);
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3569mE
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = this.f34223c;
        int length2 = bArr3.length;
        if (length < length2 + 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!IG.c(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        this.f34221a.getClass();
        try {
            Cipher cipher = (Cipher) HF.f25339a.get();
            if (cipher == null) {
                throw new GeneralSecurityException("AES GCM SIV cipher is invalid.");
            }
            cipher.init(2, this.f34222b, new GCMParameterSpec(128, bArr, length2, 12));
            if (bArr2 != null && bArr2.length != 0) {
                cipher.updateAAD(bArr2);
            }
            return cipher.doFinal(bArr, length2 + 12, (length - length2) - 12);
        } catch (IllegalStateException e6) {
            throw new GeneralSecurityException("AES GCM SIV cipher is not available or is invalid.", e6);
        }
    }
}
