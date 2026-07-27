package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.android.gms.internal.ads.pF, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3719pF implements InterfaceC3394jE {

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f33046d = UC.f("7a806c");

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f33047e = UC.f("46bb91c3c5");

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f33048f = UC.f("36864200e0eaf5284d884a0e77d31646");

    /* renamed from: g, reason: collision with root package name */
    public static final byte[] f33049g = UC.f("bae8e37fc83441b16034566b");

    /* renamed from: h, reason: collision with root package name */
    public static final byte[] f33050h = UC.f("af60eb711bd85bc1e4d3e0a462e074eea428a8");

    /* renamed from: a, reason: collision with root package name */
    public final C3880sF f33051a;

    /* renamed from: b, reason: collision with root package name */
    public final SecretKeySpec f33052b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f33053c;

    public C3719pF(byte[] bArr, byte[] bArr2) {
        C3880sF c3880sF = C3880sF.f33932D;
        this.f33053c = bArr2;
        AbstractC3341iD.d(bArr.length);
        this.f33052b = new SecretKeySpec(bArr, "AES");
        this.f33051a = c3880sF;
    }

    public static boolean b(Cipher cipher) {
        try {
            byte[] bArr = f33049g;
            cipher.init(2, new SecretKeySpec(f33048f, "AES"), new GCMParameterSpec(128, bArr, 0, bArr.length));
            cipher.updateAAD(f33047e);
            byte[] bArr2 = f33050h;
            return MessageDigest.isEqual(cipher.doFinal(bArr2, 0, bArr2.length), f33046d);
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3394jE
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = this.f33053c;
        int length2 = bArr3.length;
        if (length < length2 + 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!DG.c(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        this.f33051a.getClass();
        try {
            Cipher cipher = (Cipher) FF.f24777a.get();
            if (cipher == null) {
                throw new GeneralSecurityException("AES GCM SIV cipher is invalid.");
            }
            cipher.init(2, this.f33052b, new GCMParameterSpec(128, bArr, length2, 12));
            if (bArr2 != null && bArr2.length != 0) {
                cipher.updateAAD(bArr2);
            }
            return cipher.doFinal(bArr, length2 + 12, (length - length2) - 12);
        } catch (IllegalStateException e9) {
            throw new GeneralSecurityException("AES GCM SIV cipher is not available or is invalid.", e9);
        }
    }
}
