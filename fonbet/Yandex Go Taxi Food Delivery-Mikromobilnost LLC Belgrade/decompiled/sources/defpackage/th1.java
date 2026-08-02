package defpackage;

import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import ru.CryptoPro.JCP.tools.Platform;
import ru.CryptoPro.JCSP.JCSP;

/* loaded from: classes11.dex */
public final class th1 implements ve1 {
    public static final fg1 b = new fg1(3);
    public static final boolean c;
    public final SecretKeySpec a;

    static {
        boolean z;
        try {
            Class.forName("javax.crypto.spec.GCMParameterSpec");
            z = true;
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        c = z;
    }

    public th1(byte[] bArr) {
        d131.a(bArr.length);
        this.a = new SecretKeySpec(bArr, JCSP.AES_NAME);
    }

    public static AlgorithmParameterSpec c(int i, byte[] bArr) {
        if (c) {
            return new GCMParameterSpec(128, bArr, 0, i);
        }
        if ("The Android Project".equals(System.getProperty(Platform.STR_VENDOR_PROPERTY))) {
            return new IvParameterSpec(bArr, 0, i);
        }
        kbs.v("cannot use AES-GCM: javax.crypto.spec.GCMParameterSpec not found");
        return null;
    }

    @Override // defpackage.ve1
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr.length > 2147483619) {
            kbs.v("plaintext too long");
            return null;
        }
        byte[] bArr3 = new byte[bArr.length + 28];
        byte[] a = i6i0.a(12);
        System.arraycopy(a, 0, bArr3, 0, 12);
        AlgorithmParameterSpec c2 = c(a.length, a);
        fg1 fg1Var = b;
        ((Cipher) fg1Var.get()).init(1, this.a, c2);
        if (bArr2 != null && bArr2.length != 0) {
            ((Cipher) fg1Var.get()).updateAAD(bArr2);
        }
        int doFinal = ((Cipher) fg1Var.get()).doFinal(bArr, 0, bArr.length, bArr3, 12);
        if (doFinal == bArr.length + 16) {
            return bArr3;
        }
        throw new GeneralSecurityException(oyr.j(doFinal - bArr.length, "encryption failed; GCM tag must be 16 bytes, but got only ", " bytes"));
    }

    @Override // defpackage.ve1
    public final byte[] b(byte[] bArr, byte[] bArr2) {
        if (bArr.length < 28) {
            kbs.v("ciphertext too short");
            return null;
        }
        AlgorithmParameterSpec c2 = c(12, bArr);
        fg1 fg1Var = b;
        ((Cipher) fg1Var.get()).init(2, this.a, c2);
        if (bArr2 != null && bArr2.length != 0) {
            ((Cipher) fg1Var.get()).updateAAD(bArr2);
        }
        return ((Cipher) fg1Var.get()).doFinal(bArr, 12, bArr.length - 12);
    }
}
