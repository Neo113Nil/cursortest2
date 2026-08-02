package ru.CryptoPro.JCP.Key;

import defpackage.b64;
import defpackage.dq61;
import defpackage.dy31;
import defpackage.g8e;
import defpackage.kzo;
import defpackage.wu61;
import java.security.InvalidKeyException;
import java.security.KeyManagementException;
import java.util.Arrays;
import ru.CryptoPro.JCP.Random.RandomInterface;
import ru.CryptoPro.JCP.params.AlgIdInterface;
import ru.CryptoPro.JCP.params.CryptParamsInterface;
import ru.CryptoPro.JCP.params.CryptParamsSpec;
import ru.CryptoPro.JCP.params.ParamsInterface;
import ru.CryptoPro.JCP.tools.Array;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.reprov.array.DerValue;

/* loaded from: classes4.dex */
public class KuznechikKeySpec extends MagmaKeySpec {
    public static final long C1_kuznyechik = -4294967296L;
    public static final long C2_kuznyechik = -524288;
    public static final long C3_kuznyechik = -64;
    public static final byte[] J;
    public static final byte[] K;
    public kzo H;
    public kzo I;

    static {
        byte[] bArr = new byte[65536];
        J = bArr;
        byte[] bArr2 = new byte[65536];
        K = bArr2;
        byte[] byteArray = Array.toByteArray(CryptParamsSpec.getInstance(CryptParamsSpec.OID_tc26_cipher_gost_3412_2015_K).getCommutator());
        for (int i = 0; i < 256; i++) {
            for (int i2 = 0; i2 < 16; i2++) {
                for (int i3 = 0; i3 < 16; i3++) {
                    int b = b64.b(dq61.b[i] & 255, 16, i2 * 4096, i3);
                    int d = (15 - i3) + g8e.d(15, i2, 4096, (dq61.a[i] & 255) * 16);
                    byte b2 = (byte) i;
                    byte b3 = byteArray[(i3 * 16) + i2];
                    byte b4 = 0;
                    for (long j = 0; j < 8; j++) {
                        if ((b2 & 1) != 0) {
                            b4 = (byte) (b4 ^ b3);
                        }
                        b3 = (byte) (((b3 & DerValue.TAG_CONTEXT) != 0 ? -61 : 0) ^ (b3 << 1));
                        b2 = (byte) (b2 >>> 1);
                    }
                    bArr2[d] = b4;
                    bArr[b] = b4;
                }
            }
        }
    }

    public KuznechikKeySpec(byte[] bArr, int i, int i2, CryptParamsInterface cryptParamsInterface) throws KeyManagementException {
        super(bArr, i, i2, cryptParamsInterface, 4);
    }

    @Override // ru.CryptoPro.JCP.Key.MagmaKeySpec, ru.CryptoPro.JCP.Key.SecretKeySpec, ru.CryptoPro.JCP.Key.SecretKeyInterface
    public void changeKey(CryptParamsInterface cryptParamsInterface) throws InvalidKeyException {
        RandomInterface randomInterface = this.b;
        wu61 wu61Var = this.c;
        try {
            wu61Var.C();
            wu61Var.d(this.H, randomInterface, J);
            m();
        } finally {
            wu61Var.A(randomInterface);
        }
    }

    @Override // ru.CryptoPro.JCP.Key.MagmaKeySpec, ru.CryptoPro.JCP.Key.SecretKeySpec, ru.CryptoPro.JCP.Key.SecretKeyInterface, ru.CryptoPro.JCP.Key.KeyInterface
    public Object clone() throws CloneNotSupportedException {
        try {
            return new KuznechikKeySpec(this);
        } catch (Exception e) {
            CloneNotSupportedException cloneNotSupportedException = new CloneNotSupportedException(e.getMessage());
            cloneNotSupportedException.initCause(e);
            throw cloneNotSupportedException;
        }
    }

    @Override // ru.CryptoPro.JCP.Key.MagmaKeySpec
    public void decrypt(int i, byte[] bArr, byte[] bArr2, int i2, CryptParamsInterface cryptParamsInterface) throws InvalidKeyException {
        byte[] bArr3 = new byte[16];
        int i3 = i & 2032;
        RandomInterface randomInterface = this.b;
        byte[] bArr4 = K;
        if (i3 == 16) {
            SelfTester_JCP.check(1048576);
            this.I.m(bArr, bArr4, bArr3, randomInterface);
        } else {
            if (i3 != 32) {
                return;
            }
            SelfTester_JCP.check(SelfTester_JCP.ENCRYPT_CBC);
            this.I.m(bArr, bArr4, bArr3, randomInterface);
            kzo.d(bArr, 0, bArr2, i2, bArr, 0, this.x);
        }
    }

    @Override // ru.CryptoPro.JCP.Key.MagmaKeySpec
    public int decryptCBC(byte[] bArr, int i, byte[] bArr2, int i2, int i3, byte[] bArr3, int i4, CryptParamsInterface cryptParamsInterface) throws InvalidKeyException {
        SelfTester_JCP.check(SelfTester_JCP.ENCRYPT_CBC);
        byte[] bArr4 = new byte[16];
        int i5 = i;
        int i6 = i2;
        int i7 = i4;
        for (int i8 = i3; i8 > 0; i8--) {
            int i9 = this.x;
            byte[] bArr5 = this.D;
            Array.copy(bArr2, i6, bArr5, 0, i9);
            this.I.m(bArr5, K, bArr4, this.b);
            int i10 = this.x;
            byte[] bArr6 = this.D;
            kzo.d(bArr6, 0, bArr3, i7, bArr6, 0, i10);
            Array.copy(bArr2, i6, bArr3, i7, this.x);
            Array.copy(bArr5, 0, bArr, i5, this.x);
            int i11 = this.x;
            i5 += i11;
            i6 += i11;
            i7 += i11;
            if (i7 >= bArr3.length) {
                i7 -= bArr3.length;
            }
        }
        return i7;
    }

    @Override // ru.CryptoPro.JCP.Key.MagmaKeySpec
    public void decryptCFB(byte[] bArr, int i, byte[] bArr2, int i2, int i3, byte[] bArr3, int i4, byte[] bArr4, int i5, CryptParamsInterface cryptParamsInterface) throws InvalidKeyException {
        int i6;
        int i7 = i5 != 0 ? i5 : this.x;
        SelfTester_JCP.check(SelfTester_JCP.DECRYPT_CFB);
        byte[] bArr5 = new byte[16];
        int i8 = i;
        int i9 = i2;
        int i10 = i3;
        int i11 = i4;
        while (i10 > 0) {
            int length = bArr3.length - i11;
            int i12 = this.x;
            byte[] bArr6 = this.D;
            int i13 = 0;
            if (length < i12) {
                Array.copy(bArr3, i11, bArr6, 0, bArr3.length - i11);
                Array.copy(bArr3, 0, bArr6, bArr3.length - i11, this.x - (bArr3.length - i11));
            } else {
                Array.copy(bArr3, i11, bArr6, 0, i12);
            }
            this.H.f(this.D, J, bArr5, this.b, false);
            int i14 = 0;
            while (i14 < i7 && i10 > 0) {
                bArr3[i11] = bArr2[i9];
                bArr[i8] = (byte) (bArr6[i14] ^ bArr2[i9]);
                i11++;
                if (i11 >= bArr3.length) {
                    i11 -= bArr3.length;
                }
                i14++;
                i8++;
                i9++;
                i10--;
            }
            if (i10 == 0 && (i6 = i3 % i7) != 0) {
                while (i6 < i7) {
                    bArr4[i13] = bArr6[i6];
                    i6++;
                    i13++;
                }
            }
        }
    }

    @Override // ru.CryptoPro.JCP.Key.MagmaKeySpec
    public void decryptECB(byte[] bArr, int i, byte[] bArr2, int i2, int i3, CryptParamsInterface cryptParamsInterface) throws InvalidKeyException {
        SelfTester_JCP.check(1048576);
        byte[] bArr3 = new byte[16];
        while (i3 > 0) {
            int i4 = this.x;
            byte[] bArr4 = this.D;
            Array.copy(bArr2, i2, bArr4, 0, i4);
            this.I.m(bArr4, K, bArr3, this.b);
            Array.copy(bArr4, 0, bArr, i, this.x);
            int i5 = this.x;
            i += i5;
            i2 += i5;
            i3--;
        }
    }

    @Override // ru.CryptoPro.JCP.Key.SecretKeySpec
    public final void e() {
        this.x = 16;
        this.y = 16;
    }

    @Override // ru.CryptoPro.JCP.Key.MagmaKeySpec
    public void encrypt(int i, byte[] bArr, byte[] bArr2, int i2, CryptParamsInterface cryptParamsInterface) throws InvalidKeyException {
        kzo kzoVar;
        RandomInterface randomInterface;
        boolean z;
        byte[] bArr3 = new byte[16];
        int i3 = i & 2032;
        byte[] bArr4 = J;
        if (i3 == 16) {
            SelfTester_JCP.check(1048576);
            kzoVar = this.H;
            randomInterface = this.b;
            z = false;
        } else {
            if (i3 != 32) {
                return;
            }
            SelfTester_JCP.check(SelfTester_JCP.ENCRYPT_CBC);
            z = false;
            kzo.d(bArr, 0, bArr2, i2, bArr, 0, this.x);
            kzoVar = this.H;
            randomInterface = this.b;
        }
        kzoVar.f(bArr, bArr4, bArr3, randomInterface, z);
    }

    @Override // ru.CryptoPro.JCP.Key.MagmaKeySpec
    public int encryptCBC(byte[] bArr, int i, byte[] bArr2, int i2, int i3, byte[] bArr3, int i4, CryptParamsInterface cryptParamsInterface) throws InvalidKeyException {
        SelfTester_JCP.check(SelfTester_JCP.ENCRYPT_CBC);
        byte[] bArr4 = new byte[16];
        int i5 = i2;
        int i6 = i3;
        int i7 = i4;
        while (i6 > 0) {
            kzo.d(bArr2, i5, bArr3, i7, this.D, 0, this.x);
            int i8 = i5;
            int i9 = i7;
            byte[] bArr5 = bArr4;
            this.H.f(this.D, J, bArr5, this.b, false);
            int i10 = this.x;
            byte[] bArr6 = this.D;
            Array.copy(bArr6, 0, bArr, i, i10);
            Array.copy(bArr6, 0, bArr3, i9, this.x);
            int i11 = this.x;
            i += i11;
            int i12 = i8 + i11;
            i7 = i9 + i11;
            if (i7 >= bArr3.length) {
                i7 -= bArr3.length;
            }
            i6--;
            i5 = i12;
            bArr4 = bArr5;
        }
        return i7;
    }

    @Override // ru.CryptoPro.JCP.Key.MagmaKeySpec
    public void encryptCFB(byte[] bArr, int i, byte[] bArr2, int i2, int i3, byte[] bArr3, int i4, byte[] bArr4, int i5, CryptParamsInterface cryptParamsInterface) throws InvalidKeyException {
        int i6;
        int i7 = i5 != 0 ? i5 : this.x;
        SelfTester_JCP.check(2097152);
        byte[] bArr5 = new byte[16];
        int i8 = i;
        int i9 = i2;
        int i10 = i3;
        int i11 = i4;
        while (i10 > 0) {
            int length = bArr3.length - i11;
            int i12 = this.x;
            byte[] bArr6 = this.D;
            int i13 = 0;
            if (length < i12) {
                Array.copy(bArr3, i11, bArr6, 0, bArr3.length - i11);
                Array.copy(bArr3, 0, bArr6, bArr3.length - i11, this.x - (bArr3.length - i11));
            } else {
                Array.copy(bArr3, i11, bArr6, 0, i12);
            }
            this.H.f(this.D, J, bArr5, this.b, false);
            int i14 = 0;
            while (i14 < i7 && i10 > 0) {
                byte b = (byte) (bArr6[i14] ^ bArr2[i9]);
                bArr[i8] = b;
                bArr3[i11] = b;
                i11++;
                if (i11 >= bArr3.length) {
                    i11 -= bArr3.length;
                }
                i14++;
                i8++;
                i9++;
                i10--;
            }
            if (i10 == 0 && (i6 = i3 % i7) != 0) {
                while (i6 < i7) {
                    bArr4[i13] = bArr6[i6];
                    i6++;
                    i13++;
                }
            }
        }
    }

    @Override // ru.CryptoPro.JCP.Key.MagmaKeySpec
    public void encryptECB(byte[] bArr, int i, byte[] bArr2, int i2, int i3, CryptParamsInterface cryptParamsInterface) throws InvalidKeyException {
        SelfTester_JCP.check(1048576);
        byte[] bArr3 = new byte[16];
        while (i3 > 0) {
            int i4 = this.x;
            byte[] bArr4 = this.D;
            Array.copy(bArr2, i2, bArr4, 0, i4);
            this.H.f(this.D, J, bArr3, this.b, false);
            Array.copy(bArr4, 0, bArr, i, this.x);
            int i5 = this.x;
            i += i5;
            i2 += i5;
            i3--;
        }
    }

    @Override // ru.CryptoPro.JCP.Key.MagmaKeySpec, ru.CryptoPro.JCP.Key.SecretKeySpec
    public final long f() {
        return C1_kuznyechik;
    }

    @Override // ru.CryptoPro.JCP.Key.MagmaKeySpec, ru.CryptoPro.JCP.Key.SecretKeySpec
    public final long g() {
        return C2_kuznyechik;
    }

    @Override // ru.CryptoPro.JCP.Key.MagmaKeySpec
    public void gammaCTR(byte[] bArr, int i, byte[] bArr2, int i2, int i3, byte[] bArr3, byte[] bArr4, int i4, CryptParamsInterface cryptParamsInterface) throws InvalidKeyException {
        int i5;
        int i6 = i4 != 0 ? i4 : this.x;
        SelfTester_JCP.check(2097152);
        byte[] bArr5 = new byte[this.x];
        byte[] bArr6 = new byte[16];
        int i7 = i2;
        int i8 = i3;
        while (i8 > 0) {
            int i9 = 0;
            Arrays.fill(bArr5, (byte) 0);
            Array.copy(bArr3, 0, bArr5, 0, this.x);
            this.H.f(bArr5, J, bArr6, this.b, false);
            int i10 = 0;
            while (i10 < i6 && i8 > 0) {
                bArr[i] = (byte) (bArr5[i10] ^ bArr2[i7]);
                i10++;
                i++;
                i7++;
                i8--;
            }
            int i11 = this.x - 1;
            while (true) {
                if (i11 < 0) {
                    break;
                }
                byte b = bArr3[i11];
                if (b != -1) {
                    bArr3[i11] = (byte) (b + 1);
                    break;
                } else {
                    bArr3[i11] = 0;
                    i11--;
                }
            }
            if (i8 == 0 && (i5 = i3 % i6) != 0) {
                while (i5 < i6) {
                    bArr4[i9] = bArr5[i5];
                    i5++;
                    i9++;
                }
            }
        }
    }

    @Override // ru.CryptoPro.JCP.Key.MagmaKeySpec
    public void gammaOFB(byte[] bArr, int i, byte[] bArr2, int i2, int i3, byte[] bArr3, int i4, byte[] bArr4, int i5, CryptParamsInterface cryptParamsInterface) throws InvalidKeyException {
        int i6;
        int i7 = i5 != 0 ? i5 : this.x;
        SelfTester_JCP.check(2097152);
        byte[] bArr5 = new byte[16];
        int i8 = i;
        int i9 = i2;
        int i10 = i3;
        int i11 = i4;
        while (i10 > 0) {
            int i12 = this.x;
            byte[] bArr6 = this.D;
            int i13 = 0;
            Array.copy(bArr3, i11, bArr6, 0, i12);
            this.H.f(this.D, J, bArr5, this.b, false);
            Array.copy(bArr6, 0, bArr3, i11, this.x);
            int i14 = 0;
            while (i14 < i7 && i10 > 0) {
                bArr[i8] = (byte) (bArr6[i14] ^ bArr2[i9]);
                i14++;
                i8++;
                i9++;
                i10--;
            }
            i11 += this.x;
            if (i11 >= bArr3.length) {
                i11 -= bArr3.length;
            }
            if (i10 == 0 && (i6 = i3 % i7) != 0) {
                while (i6 < i7) {
                    bArr4[i13] = bArr6[i6];
                    i6++;
                    i13++;
                }
            }
        }
    }

    @Override // ru.CryptoPro.JCP.Key.MagmaKeySpec
    public void getImita(byte[] bArr, byte[] bArr2, int i, int i2) throws InvalidKeyException {
        byte[] byteArray;
        wu61 wu61Var;
        SelfTester_JCP.check(SelfTester_JCP.IMITA);
        if (i2 == 0) {
            byteArray = this.F.z().toByteArray();
            wu61Var = this.F;
        } else {
            byteArray = this.G.z().toByteArray();
            wu61Var = this.G;
        }
        byte[] E = wu61Var.E();
        for (int i3 = 0; i3 < bArr.length; i3++) {
            byte b = (byte) (bArr[i3] ^ byteArray[i3]);
            bArr[i3] = b;
            bArr[i3] = (byte) (b ^ E[i3]);
        }
        for (int i4 = 0; i4 < bArr.length; i4++) {
            bArr[i4] = (byte) (bArr[i4] ^ bArr2[i4]);
        }
        this.H.f(bArr, J, new byte[16], this.b, true);
    }

    @Override // ru.CryptoPro.JCP.Key.MagmaKeySpec, ru.CryptoPro.JCP.Key.SecretKeySpec
    public final long h() {
        return -64L;
    }

    @Override // ru.CryptoPro.JCP.Key.MagmaKeySpec
    public final void i() {
        if (this.a == null) {
            this.a = CryptParamsSpec.getInstance(CryptParamsSpec.OID_tc26_cipher_gost_3412_2015_K);
        }
        wu61 wu61Var = this.c;
        byte[] bArr = J;
        RandomInterface randomInterface = this.b;
        kzo kzoVar = new kzo(wu61Var, randomInterface, bArr);
        this.H = kzoVar;
        this.I = new kzo(kzoVar, randomInterface, K);
    }

    @Override // ru.CryptoPro.JCP.Key.MagmaKeySpec
    public void imita(byte[] bArr, byte[] bArr2, int i, int i2) throws InvalidKeyException {
        SelfTester_JCP.check(SelfTester_JCP.IMITA);
        byte[] bArr3 = new byte[16];
        int i3 = 0;
        while (i3 < i2) {
            for (int i4 = 0; i4 < bArr.length; i4++) {
                bArr[i4] = (byte) (bArr[i4] ^ bArr2[i4 + i]);
            }
            byte[] bArr4 = bArr;
            this.H.f(bArr4, J, bArr3, this.b, true);
            i += this.x;
            i3++;
            bArr = bArr4;
        }
    }

    @Override // ru.CryptoPro.JCP.Key.MagmaKeySpec
    public final void j(SecretKeySpec secretKeySpec) {
        this.H = new kzo(((KuznechikKeySpec) secretKeySpec).H, secretKeySpec.b);
        this.I = new kzo(((KuznechikKeySpec) secretKeySpec).I, secretKeySpec.b);
    }

    @Override // ru.CryptoPro.JCP.Key.MagmaKeySpec
    public final void m() {
        kzo kzoVar = this.H;
        byte[] bArr = J;
        RandomInterface randomInterface = this.b;
        wu61 wu61Var = this.c;
        if (wu61Var == null) {
            kzoVar.getClass();
            dy31.v("No key material");
        } else {
            if (!kzoVar.b) {
                dy31.v("This extended key material is used for encryption");
                return;
            }
            Arrays.fill((byte[]) kzoVar.c, (byte) 0);
            try {
                kzoVar.k(wu61Var, randomInterface, bArr);
            } catch (KeyManagementException e) {
                dy31.s(e);
            }
        }
    }

    @Override // ru.CryptoPro.JCP.Key.MagmaKeySpec, ru.CryptoPro.JCP.Key.SecretKeySpec
    public void setGammaBlockLen(int i) {
        ((wu61) this.H.x).o.d = i;
    }

    public KuznechikKeySpec(CryptParamsInterface cryptParamsInterface, RandomInterface randomInterface) throws KeyManagementException {
        super(cryptParamsInterface, randomInterface, 4);
    }

    public KuznechikKeySpec(wu61 wu61Var, CryptParamsInterface cryptParamsInterface, RandomInterface randomInterface) throws KeyManagementException {
        super(wu61Var, cryptParamsInterface, randomInterface);
    }

    public KuznechikKeySpec(byte[] bArr, CryptParamsInterface cryptParamsInterface) throws KeyManagementException {
        super(bArr, cryptParamsInterface, 4);
    }

    public KuznechikKeySpec(char[] cArr, byte[] bArr, ParamsInterface paramsInterface, AlgIdInterface algIdInterface) throws KeyManagementException {
        super(cArr, bArr, paramsInterface, algIdInterface, 4);
    }

    @Override // ru.CryptoPro.JCP.Key.MagmaKeySpec, ru.CryptoPro.JCP.Key.SecretKeySpec
    public void imita(int[] iArr, CryptParamsInterface cryptParamsInterface, boolean z) throws InvalidKeyException {
        throw new UnsupportedOperationException();
    }
}
