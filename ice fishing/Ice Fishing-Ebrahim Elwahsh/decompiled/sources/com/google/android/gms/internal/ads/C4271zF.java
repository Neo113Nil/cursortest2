package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.android.gms.internal.ads.zF, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4271zF implements InterfaceC3569mE {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35497a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f35498b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f35499c;

    public C4271zF(int i, byte[] bArr, byte[] bArr2) {
        this.f35497a = i;
        switch (i) {
            case 3:
                this.f35499c = new C4217yF(bArr, 1);
                this.f35498b = bArr2;
                break;
            default:
                this.f35499c = new C4217yF(bArr, 0);
                this.f35498b = bArr2;
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3569mE
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        Object obj = this.f35499c;
        byte[] bArr3 = this.f35498b;
        switch (this.f35497a) {
            case 0:
                InterfaceC3569mE interfaceC3569mE = (InterfaceC3569mE) obj;
                if (bArr3.length == 0) {
                    return interfaceC3569mE.a(bArr, bArr2);
                }
                if (IG.c(bArr3, bArr)) {
                    return interfaceC3569mE.a(Arrays.copyOfRange(bArr, 5, bArr.length), bArr2);
                }
                throw new GeneralSecurityException("wrong prefix");
            case 1:
                if (bArr == null) {
                    throw new NullPointerException("ciphertext is null");
                }
                int length = bArr.length;
                int length2 = bArr3.length;
                if (length < length2 + 28) {
                    throw new GeneralSecurityException("ciphertext too short");
                }
                if (!IG.c(bArr3, bArr)) {
                    throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
                }
                H7.b bVar = AbstractC3786qF.f33675a;
                Objects.equals(System.getProperty("java.vendor"), "The Android Project");
                GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, bArr, length2, 12);
                Cipher cipher = (Cipher) AbstractC3786qF.f33675a.get();
                cipher.init(2, (SecretKeySpec) obj, gCMParameterSpec);
                if (bArr2 != null && bArr2.length != 0) {
                    cipher.updateAAD(bArr2);
                }
                return cipher.doFinal(bArr, 12 + length2, (length - length2) - 12);
            case 2:
                int length3 = bArr3.length;
                if (length3 == 0) {
                    return b(bArr, bArr2);
                }
                if (IG.c(bArr3, bArr)) {
                    return b(Arrays.copyOfRange(bArr, length3, bArr.length), bArr2);
                }
                throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
            default:
                int length4 = bArr3.length;
                if (length4 == 0) {
                    return c(bArr, bArr2);
                }
                if (IG.c(bArr3, bArr)) {
                    return c(Arrays.copyOfRange(bArr, length4, bArr.length), bArr2);
                }
                throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
    }

    public byte[] b(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        if (length < 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        return ((C4217yF) this.f35499c).o(ByteBuffer.wrap(bArr, 12, length - 12), Arrays.copyOf(bArr, 12), bArr2);
    }

    public byte[] c(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        if (length < 40) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        return ((C4217yF) this.f35499c).o(ByteBuffer.wrap(bArr, 24, length - 24), Arrays.copyOf(bArr, 24), bArr2);
    }

    public C4271zF(InterfaceC3569mE interfaceC3569mE, byte[] bArr) {
        this.f35497a = 0;
        this.f35499c = interfaceC3569mE;
        int length = bArr.length;
        if (length != 0 && length != 5) {
            throw new IllegalArgumentException("identifier has an invalid length");
        }
        this.f35498b = bArr;
    }

    public C4271zF(byte[] bArr, C3791qK c3791qK) {
        this.f35497a = 1;
        if (XC.e(2)) {
            H7.b bVar = AbstractC3786qF.f33675a;
            AbstractC3137eE.c(bArr.length);
            this.f35499c = new SecretKeySpec(bArr, "AES");
            this.f35498b = c3791qK.b();
            return;
        }
        throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
    }
}
