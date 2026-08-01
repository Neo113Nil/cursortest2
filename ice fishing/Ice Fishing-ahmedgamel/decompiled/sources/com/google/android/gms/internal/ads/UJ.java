package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes2.dex */
public final class UJ implements InterfaceC3394jE {

    /* renamed from: a, reason: collision with root package name */
    public final PJ f27916a;

    /* renamed from: b, reason: collision with root package name */
    public final C2972bK f27917b;

    /* renamed from: c, reason: collision with root package name */
    public final int f27918c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f27919d;

    public UJ(PJ pj, C2972bK c2972bK, int i, byte[] bArr) {
        this.f27916a = pj;
        this.f27917b = c2972bK;
        this.f27918c = i;
        this.f27919d = bArr;
    }

    public static UJ b(BE be) {
        byte[] b9 = ((C3240gK) be.f23862c.f29859u).b();
        GE ge = be.f23861b;
        PJ pj = new PJ(b9, ge.f24956c);
        String valueOf = String.valueOf(ge.f24959f);
        R5 r52 = new R5("HMAC".concat(valueOf), new SecretKeySpec(((C3240gK) be.f23863d.f29859u).b(), "HMAC"));
        int i = ge.f24957d;
        return new UJ(pj, new C2972bK(r52, i), i, be.f23864e.b());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3394jE
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = this.f27919d;
        int length2 = bArr3.length;
        int i = this.f27918c;
        if (length < i + length2) {
            throw new GeneralSecurityException("Decryption failed (ciphertext too short).");
        }
        if (!DG.c(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        int i6 = length - i;
        byte[] copyOfRange = Arrays.copyOfRange(bArr, length2, i6);
        byte[] copyOfRange2 = Arrays.copyOfRange(bArr, i6, length);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] d2 = AbstractC4094wD.d(bArr2, copyOfRange, Arrays.copyOf(ByteBuffer.allocate(8).putLong(bArr2.length * 8).array(), 8));
        C2972bK c2972bK = this.f27917b;
        byte[] bArr4 = c2972bK.f29288d;
        int length3 = bArr4.length;
        int i9 = c2972bK.f29286b;
        YG yg = c2972bK.f29285a;
        byte[] bArr5 = c2972bK.f29287c;
        if (!MessageDigest.isEqual(length3 > 0 ? AbstractC4094wD.d(bArr5, yg.d(i9, AbstractC4094wD.d(d2, bArr4))) : AbstractC4094wD.d(bArr5, yg.d(i9, d2)), copyOfRange2)) {
            throw new GeneralSecurityException("invalid MAC");
        }
        PJ pj = this.f27916a;
        int length4 = copyOfRange.length;
        int i10 = pj.f26755b;
        if (length4 < i10) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArr6 = new byte[i10];
        System.arraycopy(copyOfRange, 0, bArr6, 0, i10);
        int i11 = length4 - i10;
        byte[] bArr7 = new byte[i11];
        Cipher cipher = (Cipher) PJ.f26753d.get();
        byte[] bArr8 = new byte[pj.f26756c];
        System.arraycopy(bArr6, 0, bArr8, 0, i10);
        cipher.init(2, pj.f26754a, new IvParameterSpec(bArr8));
        if (cipher.doFinal(copyOfRange, i10, i11, bArr7, 0) == i11) {
            return bArr7;
        }
        throw new GeneralSecurityException("stored output's length does not match input's length");
    }
}
