package defpackage;

import java.security.InvalidKeyException;
import java.util.Arrays;
import java.util.List;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes3.dex */
public final class gp implements lz7 {
    public static final List c = Arrays.asList(64);
    public static final byte[] d = new byte[16];
    public static final byte[] e = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};
    public final t1f a;
    public final byte[] b;

    public gp(byte[] bArr) {
        if (!c.contains(Integer.valueOf(bArr.length))) {
            throw new InvalidKeyException(f1d.i(new StringBuilder("invalid key size: "), bArr.length, " bytes; key must have 64 bytes"));
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length / 2);
        this.b = Arrays.copyOfRange(bArr, bArr.length / 2, bArr.length);
        this.a = new t1f(copyOfRange);
    }

    @Override // defpackage.lz7
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr.length > 2147483631) {
            b6e.m("plaintext too long");
            return null;
        }
        Cipher cipher = (Cipher) t7b.e.a("AES/CTR/NoPadding");
        byte[] c2 = c(bArr2, bArr);
        byte[] bArr3 = (byte[]) c2.clone();
        bArr3[8] = (byte) (bArr3[8] & Byte.MAX_VALUE);
        bArr3[12] = (byte) (bArr3[12] & Byte.MAX_VALUE);
        cipher.init(1, new SecretKeySpec(this.b, "AES"), new IvParameterSpec(bArr3));
        return h4a.p(c2, cipher.doFinal(bArr));
    }

    @Override // defpackage.lz7
    public final byte[] b(byte[] bArr, byte[] bArr2) {
        if (bArr.length < 16) {
            b6e.m("Ciphertext too short.");
            return null;
        }
        Cipher cipher = (Cipher) t7b.e.a("AES/CTR/NoPadding");
        byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 16);
        byte[] bArr3 = (byte[]) copyOfRange.clone();
        bArr3[8] = (byte) (bArr3[8] & Byte.MAX_VALUE);
        bArr3[12] = (byte) (bArr3[12] & Byte.MAX_VALUE);
        cipher.init(2, new SecretKeySpec(this.b, "AES"), new IvParameterSpec(bArr3));
        byte[] copyOfRange2 = Arrays.copyOfRange(bArr, 16, bArr.length);
        byte[] doFinal = cipher.doFinal(copyOfRange2);
        if (copyOfRange2.length == 0 && doFinal == null) {
            try {
                Class.forName("android.app.Application", false, null);
                doFinal = new byte[0];
            } catch (Exception unused) {
            }
        }
        if (h4a.r(copyOfRange, c(bArr2, doFinal))) {
            return doFinal;
        }
        throw new AEADBadTagException("Integrity check failed.");
    }

    public final byte[] c(byte[]... bArr) {
        byte[] b0;
        int length = bArr.length;
        t1f t1fVar = this.a;
        if (length == 0) {
            return t1fVar.m(16, e);
        }
        byte[] m = t1fVar.m(16, d);
        for (int i = 0; i < bArr.length - 1; i++) {
            byte[] bArr2 = bArr[i];
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            m = h4a.b0(xv7.u(m), t1fVar.m(16, bArr2));
        }
        byte[] bArr3 = bArr[bArr.length - 1];
        if (bArr3.length >= 16) {
            if (bArr3.length < m.length) {
                xq0.x("xorEnd requires a.length >= b.length");
                return null;
            }
            int length2 = bArr3.length - m.length;
            b0 = Arrays.copyOf(bArr3, bArr3.length);
            for (int i2 = 0; i2 < m.length; i2++) {
                int i3 = length2 + i2;
                b0[i3] = (byte) (b0[i3] ^ m[i2]);
            }
        } else {
            if (bArr3.length >= 16) {
                xq0.x("x must be smaller than a block.");
                return null;
            }
            byte[] copyOf = Arrays.copyOf(bArr3, 16);
            copyOf[bArr3.length] = Byte.MIN_VALUE;
            b0 = h4a.b0(copyOf, xv7.u(m));
        }
        return t1fVar.m(16, b0);
    }
}
