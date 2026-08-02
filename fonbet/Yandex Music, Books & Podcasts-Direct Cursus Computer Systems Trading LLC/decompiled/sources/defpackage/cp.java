package defpackage;

import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes3.dex */
public final class cp implements un {
    public static final mo b = new mo(4);
    public final SecretKeySpec a;

    public cp(byte[] bArr) {
        qwt.a(bArr.length);
        this.a = new SecretKeySpec(bArr, "AES");
    }

    public static AlgorithmParameterSpec c(int i, byte[] bArr) {
        try {
            Class.forName("javax.crypto.spec.GCMParameterSpec");
            return new GCMParameterSpec(128, bArr, 0, i);
        } catch (ClassNotFoundException unused) {
            try {
                Class.forName("android.app.Application", false, null);
                return new IvParameterSpec(bArr, 0, i);
            } catch (Exception unused2) {
                b6e.m("cannot use AES-GCM: javax.crypto.spec.GCMParameterSpec not found");
                return null;
            }
        }
    }

    @Override // defpackage.un
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr.length > 2147483619) {
            b6e.m("plaintext too long");
            return null;
        }
        byte[] bArr3 = new byte[bArr.length + 28];
        byte[] a = qhn.a(12);
        System.arraycopy(a, 0, bArr3, 0, 12);
        AlgorithmParameterSpec c = c(a.length, a);
        mo moVar = b;
        ((Cipher) moVar.get()).init(1, this.a, c);
        if (bArr2 != null && bArr2.length != 0) {
            ((Cipher) moVar.get()).updateAAD(bArr2);
        }
        int doFinal = ((Cipher) moVar.get()).doFinal(bArr, 0, bArr.length, bArr3, 12);
        if (doFinal == bArr.length + 16) {
            return bArr3;
        }
        throw new GeneralSecurityException(dfi.c(doFinal - bArr.length, "encryption failed; GCM tag must be 16 bytes, but got only ", " bytes"));
    }

    @Override // defpackage.un
    public final byte[] b(byte[] bArr, byte[] bArr2) {
        if (bArr.length < 28) {
            b6e.m("ciphertext too short");
            return null;
        }
        AlgorithmParameterSpec c = c(12, bArr);
        mo moVar = b;
        ((Cipher) moVar.get()).init(2, this.a, c);
        if (bArr2 != null && bArr2.length != 0) {
            ((Cipher) moVar.get()).updateAAD(bArr2);
        }
        return ((Cipher) moVar.get()).doFinal(bArr, 12, bArr.length - 12);
    }
}
