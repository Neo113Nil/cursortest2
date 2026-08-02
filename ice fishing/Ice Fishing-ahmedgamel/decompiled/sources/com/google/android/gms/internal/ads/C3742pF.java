package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.android.gms.internal.ads.pF, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3742pF implements InterfaceC3417jE {

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f33836d = UC.f("7a806c");

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f33837e = UC.f("46bb91c3c5");

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f33838f = UC.f("36864200e0eaf5284d884a0e77d31646");

    /* renamed from: g, reason: collision with root package name */
    public static final byte[] f33839g = UC.f("bae8e37fc83441b16034566b");

    /* renamed from: h, reason: collision with root package name */
    public static final byte[] f33840h = UC.f("af60eb711bd85bc1e4d3e0a462e074eea428a8");

    /* renamed from: a, reason: collision with root package name */
    public final C3903sF f33841a;

    /* renamed from: b, reason: collision with root package name */
    public final SecretKeySpec f33842b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f33843c;

    public C3742pF(byte[] bArr, byte[] bArr2) {
        C3903sF c3903sF = C3903sF.f34700D;
        this.f33843c = bArr2;
        AbstractC3364iD.d(bArr.length);
        this.f33842b = new SecretKeySpec(bArr, "AES");
        this.f33841a = c3903sF;
    }

    public static boolean b(Cipher cipher) {
        try {
            byte[] bArr = f33839g;
            cipher.init(2, new SecretKeySpec(f33838f, "AES"), new GCMParameterSpec(128, bArr, 0, bArr.length));
            cipher.updateAAD(f33837e);
            byte[] bArr2 = f33840h;
            return MessageDigest.isEqual(cipher.doFinal(bArr2, 0, bArr2.length), f33836d);
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3417jE
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = this.f33843c;
        int length2 = bArr3.length;
        if (length < length2 + 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!DG.c(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        this.f33841a.getClass();
        try {
            Cipher cipher = (Cipher) FF.f25533a.get();
            if (cipher == null) {
                throw new GeneralSecurityException("AES GCM SIV cipher is invalid.");
            }
            cipher.init(2, this.f33842b, new GCMParameterSpec(128, bArr, length2, 12));
            if (bArr2 != null && bArr2.length != 0) {
                cipher.updateAAD(bArr2);
            }
            return cipher.doFinal(bArr, length2 + 12, (length - length2) - 12);
        } catch (IllegalStateException e9) {
            throw new GeneralSecurityException("AES GCM SIV cipher is not available or is invalid.", e9);
        }
    }
}
