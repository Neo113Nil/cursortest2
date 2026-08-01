package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes2.dex */
public final class BF implements InterfaceC3394jE {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f23866a;

    /* renamed from: b, reason: collision with root package name */
    public final int f23867b;

    /* renamed from: c, reason: collision with root package name */
    public final YG f23868c;

    public BF(byte[] bArr, C3240gK c3240gK, int i) {
        this.f23868c = C2921aN.k(WG.i(XG.b(bArr.length), new C3105du(8, C3240gK.a(bArr))));
        this.f23866a = c3240gK.b();
        this.f23867b = i;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3394jE
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            throw new NullPointerException("ciphertext is null");
        }
        int length = bArr.length;
        byte[] bArr3 = this.f23866a;
        int length2 = bArr3.length;
        int i = this.f23867b + length2;
        int i6 = i + 28;
        if (length < i6) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!DG.c(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, length2, i);
        byte[] bArr4 = {0, 1, 88, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        byte[] bArr5 = {0, 2, 88, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int length3 = copyOfRange.length;
        if (length3 > 12 || length3 < 8) {
            throw new GeneralSecurityException("invalid salt size");
        }
        System.arraycopy(copyOfRange, 0, bArr4, 4, length3);
        System.arraycopy(copyOfRange, 0, bArr5, 4, length3);
        byte[] bArr6 = new byte[32];
        YG yg = this.f23868c;
        System.arraycopy(yg.d(16, bArr4), 0, bArr6, 0, 16);
        System.arraycopy(yg.d(16, bArr5), 0, bArr6, 16, 16);
        if (!WC.c(2)) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        L7.b bVar = AbstractC3611nF.f32713a;
        AbstractC3341iD.d(32);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr6, "AES");
        int i9 = i + 12;
        byte[] copyOfRange2 = Arrays.copyOfRange(bArr, i, i9);
        if (copyOfRange2.length != 12) {
            throw new GeneralSecurityException("iv is wrong size");
        }
        if (length < i6) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        Objects.equals(System.getProperty("java.vendor"), "The Android Project");
        GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, copyOfRange2, 0, 12);
        Cipher cipher = (Cipher) AbstractC3611nF.f32713a.get();
        cipher.init(2, secretKeySpec, gCMParameterSpec);
        if (bArr2 != null && bArr2.length != 0) {
            cipher.updateAAD(bArr2);
        }
        return cipher.doFinal(bArr, i9, length - i9);
    }
}
