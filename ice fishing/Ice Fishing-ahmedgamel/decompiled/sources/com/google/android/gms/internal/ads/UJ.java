package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes2.dex */
public final class UJ implements InterfaceC3417jE {

    /* renamed from: a, reason: collision with root package name */
    public final PJ f28713a;

    /* renamed from: b, reason: collision with root package name */
    public final C2995bK f28714b;

    /* renamed from: c, reason: collision with root package name */
    public final int f28715c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f28716d;

    public UJ(PJ pj, C2995bK c2995bK, int i, byte[] bArr) {
        this.f28713a = pj;
        this.f28714b = c2995bK;
        this.f28715c = i;
        this.f28716d = bArr;
    }

    public static UJ b(BE be) {
        byte[] b9 = ((C3263gK) be.f24633c.f30647u).b();
        GE ge = be.f24632b;
        PJ pj = new PJ(b9, ge.f25746c);
        String valueOf = String.valueOf(ge.f25749f);
        R5 r52 = new R5("HMAC".concat(valueOf), new SecretKeySpec(((C3263gK) be.f24634d.f30647u).b(), "HMAC"));
        int i = ge.f25747d;
        return new UJ(pj, new C2995bK(r52, i), i, be.f24635e.b());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3417jE
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = this.f28716d;
        int length2 = bArr3.length;
        int i = this.f28715c;
        if (length < i + length2) {
            throw new GeneralSecurityException("Decryption failed (ciphertext too short).");
        }
        if (!DG.c(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        int i4 = length - i;
        byte[] copyOfRange = Arrays.copyOfRange(bArr, length2, i4);
        byte[] copyOfRange2 = Arrays.copyOfRange(bArr, i4, length);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] d9 = AbstractC4117wD.d(bArr2, copyOfRange, Arrays.copyOf(ByteBuffer.allocate(8).putLong(bArr2.length * 8).array(), 8));
        C2995bK c2995bK = this.f28714b;
        byte[] bArr4 = c2995bK.f30076d;
        int length3 = bArr4.length;
        int i6 = c2995bK.f30074b;
        YG yg = c2995bK.f30073a;
        byte[] bArr5 = c2995bK.f30075c;
        if (!MessageDigest.isEqual(length3 > 0 ? AbstractC4117wD.d(bArr5, yg.d(i6, AbstractC4117wD.d(d9, bArr4))) : AbstractC4117wD.d(bArr5, yg.d(i6, d9)), copyOfRange2)) {
            throw new GeneralSecurityException("invalid MAC");
        }
        PJ pj = this.f28713a;
        int length4 = copyOfRange.length;
        int i9 = pj.f27538b;
        if (length4 < i9) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArr6 = new byte[i9];
        System.arraycopy(copyOfRange, 0, bArr6, 0, i9);
        int i10 = length4 - i9;
        byte[] bArr7 = new byte[i10];
        Cipher cipher = (Cipher) PJ.f27536d.get();
        byte[] bArr8 = new byte[pj.f27539c];
        System.arraycopy(bArr6, 0, bArr8, 0, i9);
        cipher.init(2, pj.f27537a, new IvParameterSpec(bArr8));
        if (cipher.doFinal(copyOfRange, i9, i10, bArr7, 0) == i10) {
            return bArr7;
        }
        throw new GeneralSecurityException("stored output's length does not match input's length");
    }
}
