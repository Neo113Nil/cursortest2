package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.Provider;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes2.dex */
public final class DF implements InterfaceC3417jE {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f25119a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f25120b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider f25121c;

    public DF(byte[] bArr, byte[] bArr2, Provider provider) {
        if (!WC.c(1)) {
            throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
        }
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.f25119a = bArr;
        this.f25120b = bArr2;
        this.f25121c = provider;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3417jE
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            throw new NullPointerException("ciphertext is null");
        }
        int length = bArr.length;
        byte[] bArr3 = this.f25120b;
        int length2 = bArr3.length;
        if (length < length2 + 40) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!DG.c(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] bArr4 = new byte[24];
        System.arraycopy(bArr, length2, bArr4, 0, 24);
        int[] d9 = AbstractC4011uF.d(AbstractC4011uF.c(this.f25119a), AbstractC4011uF.c(bArr4));
        ByteBuffer order = ByteBuffer.allocate(d9.length * 4).order(ByteOrder.LITTLE_ENDIAN);
        order.asIntBuffer().put(d9);
        SecretKeySpec secretKeySpec = new SecretKeySpec(order.array(), "ChaCha20");
        byte[] bArr5 = new byte[12];
        System.arraycopy(bArr4, 16, bArr5, 4, 8);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr5);
        byte[] bArr6 = C3849rF.f34312d;
        Cipher cipher = Cipher.getInstance("ChaCha20-Poly1305", this.f25121c);
        cipher.init(2, secretKeySpec, ivParameterSpec);
        if (bArr2 != null && bArr2.length != 0) {
            cipher.updateAAD(bArr2);
        }
        return cipher.doFinal(bArr, 24 + length2, (length - length2) - 24);
    }
}
