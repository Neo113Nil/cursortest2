package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.android.gms.internal.ads.yF, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4227yF implements InterfaceC3417jE {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35919a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f35920b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f35921c;

    public C4227yF(int i, byte[] bArr, byte[] bArr2) {
        this.f35919a = i;
        switch (i) {
            case 3:
                this.f35921c = new C4173xF(bArr, 1);
                this.f35920b = bArr2;
                break;
            default:
                this.f35921c = new C4173xF(bArr, 0);
                this.f35920b = bArr2;
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3417jE
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        Object obj = this.f35921c;
        byte[] bArr3 = this.f35920b;
        switch (this.f35919a) {
            case 0:
                InterfaceC3417jE interfaceC3417jE = (InterfaceC3417jE) obj;
                if (bArr3.length == 0) {
                    return interfaceC3417jE.a(bArr, bArr2);
                }
                if (DG.c(bArr3, bArr)) {
                    return interfaceC3417jE.a(Arrays.copyOfRange(bArr, 5, bArr.length), bArr2);
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
                if (!DG.c(bArr3, bArr)) {
                    throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
                }
                L7.b bVar = AbstractC3634nF.f33491a;
                Objects.equals(System.getProperty("java.vendor"), "The Android Project");
                GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, bArr, length2, 12);
                Cipher cipher = (Cipher) AbstractC3634nF.f33491a.get();
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
                if (DG.c(bArr3, bArr)) {
                    return b(Arrays.copyOfRange(bArr, length3, bArr.length), bArr2);
                }
                throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
            default:
                int length4 = bArr3.length;
                if (length4 == 0) {
                    return c(bArr, bArr2);
                }
                if (DG.c(bArr3, bArr)) {
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
        return ((C4173xF) this.f35921c).o(ByteBuffer.wrap(bArr, 12, length - 12), Arrays.copyOf(bArr, 12), bArr2);
    }

    public byte[] c(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        if (length < 40) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        return ((C4173xF) this.f35921c).o(ByteBuffer.wrap(bArr, 24, length - 24), Arrays.copyOf(bArr, 24), bArr2);
    }

    public C4227yF(InterfaceC3417jE interfaceC3417jE, byte[] bArr) {
        this.f35919a = 0;
        this.f35921c = interfaceC3417jE;
        int length = bArr.length;
        if (length != 0 && length != 5) {
            throw new IllegalArgumentException("identifier has an invalid length");
        }
        this.f35920b = bArr;
    }

    public C4227yF(byte[] bArr, C3263gK c3263gK) {
        this.f35919a = 1;
        if (WC.c(2)) {
            L7.b bVar = AbstractC3634nF.f33491a;
            AbstractC3364iD.d(bArr.length);
            this.f35921c = new SecretKeySpec(bArr, "AES");
            this.f35920b = c3263gK.b();
            return;
        }
        throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
    }
}
