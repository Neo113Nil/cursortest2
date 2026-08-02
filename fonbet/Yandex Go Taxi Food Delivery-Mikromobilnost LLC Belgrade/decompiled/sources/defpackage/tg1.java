package defpackage;

import com.google.crypto.tink.config.internal.TinkFipsUtil$AlgorithmFipsCompatibility;
import java.util.Arrays;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import ru.CryptoPro.JCSP.JCSP;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.CryptoPro.reprov.array.DerValue;

/* loaded from: classes11.dex */
public final class tg1 implements ve1 {
    public static final TinkFipsUtil$AlgorithmFipsCompatibility e = TinkFipsUtil$AlgorithmFipsCompatibility.ALGORITHM_NOT_FIPS;
    public static final fg1 f = new fg1(1);
    public static final fg1 g = new fg1(2);
    public final byte[] a;
    public final byte[] b;
    public final SecretKeySpec c;
    public final int d;

    public tg1(byte[] bArr, int i) {
        if (!e.a()) {
            kbs.v("Can not use AES-EAX in FIPS-mode.");
            throw null;
        }
        if (i != 12 && i != 16) {
            ny61.g("IV size should be either 12 or 16 bytes");
            throw null;
        }
        this.d = i;
        d131.a(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, JCSP.AES_NAME);
        this.c = secretKeySpec;
        Cipher cipher = (Cipher) f.get();
        cipher.init(1, secretKeySpec);
        byte[] c = c(cipher.doFinal(new byte[16]));
        this.a = c;
        this.b = c(c);
    }

    public static byte[] c(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int i = 0;
        while (i < 15) {
            int i2 = i + 1;
            bArr2[i] = (byte) (((bArr[i] << 1) ^ ((bArr[i2] & 255) >>> 7)) & 255);
            i = i2;
        }
        bArr2[15] = (byte) (((bArr[0] >> 7) & HProv.PP_CONTAINER_DEFAULT) ^ (bArr[15] << 1));
        return bArr2;
    }

    public static byte[] e(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr3[i] = (byte) (bArr[i] ^ bArr2[i]);
        }
        return bArr3;
    }

    @Override // defpackage.ve1
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i = this.d;
        if (length > 2147483631 - i) {
            kbs.v("plaintext too long");
            return null;
        }
        byte[] bArr3 = new byte[bArr.length + i + 16];
        byte[] a = i6i0.a(i);
        System.arraycopy(a, 0, bArr3, 0, i);
        Cipher cipher = (Cipher) f.get();
        SecretKeySpec secretKeySpec = this.c;
        cipher.init(1, secretKeySpec);
        byte[] d = d(cipher, 0, a, 0, a.length);
        byte[] bArr4 = bArr2 == null ? new byte[0] : bArr2;
        byte[] d2 = d(cipher, 1, bArr4, 0, bArr4.length);
        Cipher cipher2 = (Cipher) g.get();
        cipher2.init(1, secretKeySpec, new IvParameterSpec(d));
        cipher2.doFinal(bArr, 0, bArr.length, bArr3, this.d);
        byte[] d3 = d(cipher, 2, bArr3, this.d, bArr.length);
        int length2 = bArr.length + i;
        for (int i2 = 0; i2 < 16; i2++) {
            bArr3[length2 + i2] = (byte) ((d2[i2] ^ d[i2]) ^ d3[i2]);
        }
        return bArr3;
    }

    @Override // defpackage.ve1
    public final byte[] b(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i = this.d;
        int i2 = (length - i) - 16;
        if (i2 < 0) {
            kbs.v("ciphertext too short");
            return null;
        }
        Cipher cipher = (Cipher) f.get();
        SecretKeySpec secretKeySpec = this.c;
        cipher.init(1, secretKeySpec);
        byte[] d = d(cipher, 0, bArr, 0, this.d);
        byte[] bArr3 = bArr2 == null ? new byte[0] : bArr2;
        byte[] d2 = d(cipher, 1, bArr3, 0, bArr3.length);
        byte[] d3 = d(cipher, 2, bArr, this.d, i2);
        int length2 = bArr.length - 16;
        byte b = 0;
        for (int i3 = 0; i3 < 16; i3++) {
            b = (byte) (b | (((bArr[length2 + i3] ^ d2[i3]) ^ d[i3]) ^ d3[i3]));
        }
        if (b != 0) {
            throw new AEADBadTagException("tag mismatch");
        }
        Cipher cipher2 = (Cipher) g.get();
        cipher2.init(1, secretKeySpec, new IvParameterSpec(d));
        return cipher2.doFinal(bArr, i, i2);
    }

    public final byte[] d(Cipher cipher, int i, byte[] bArr, int i2, int i3) {
        byte[] copyOf;
        byte[] bArr2 = new byte[16];
        bArr2[15] = (byte) i;
        byte[] bArr3 = this.a;
        if (i3 == 0) {
            return cipher.doFinal(e(bArr2, bArr3));
        }
        byte[] doFinal = cipher.doFinal(bArr2);
        int i4 = 0;
        while (i3 - i4 > 16) {
            for (int i5 = 0; i5 < 16; i5++) {
                doFinal[i5] = (byte) (doFinal[i5] ^ bArr[(i2 + i4) + i5]);
            }
            doFinal = cipher.doFinal(doFinal);
            i4 += 16;
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i4 + i2, i2 + i3);
        if (copyOfRange.length == 16) {
            copyOf = e(copyOfRange, bArr3);
        } else {
            copyOf = Arrays.copyOf(this.b, 16);
            for (int i6 = 0; i6 < copyOfRange.length; i6++) {
                copyOf[i6] = (byte) (copyOf[i6] ^ copyOfRange[i6]);
            }
            copyOf[copyOfRange.length] = (byte) (copyOf[copyOfRange.length] ^ DerValue.TAG_CONTEXT);
        }
        return cipher.doFinal(e(doFinal, copyOf));
    }
}
