package ru.CryptoPro.JCP.Random;

import defpackage.br61;
import defpackage.ew61;
import defpackage.fx61;
import defpackage.iq61;
import defpackage.puu0;
import defpackage.xt61;
import java.awt.GraphicsEnvironment;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.util.Arrays;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.JCP.Cipher.InGostCipher;
import ru.CryptoPro.JCP.Digest.CheckMemory;
import ru.CryptoPro.JCP.Digest.GostDigest;
import ru.CryptoPro.JCP.pref.JCPRes;
import ru.CryptoPro.JCP.tools.Control.KeyUsageControlUtility;
import ru.CryptoPro.JCP.tools.JCPLogger;
import ru.CryptoPro.JCP.tools.LocalMutex;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;

/* loaded from: classes4.dex */
public abstract class CertifiedRandom extends cl_0 {
    public static final long[] D = {_Gost_CryptoPro_PrivateKeyValues.maxDWORD, 8589934590L, 17179869180L, 34359738360L, 68719476720L, 137438953440L, 274877906880L, 549755813760L, 1099511627520L, 2199023255040L, 4398046510080L, 8796093020160L, 17592186040320L, 35184372080640L, 70368744161280L, 140737488322560L, 281474976645120L, 562949953290240L, 1125899906580480L, 2251799813160960L, 4503599626321920L, 9007199252643840L, 18014398505287680L, 36028797010575360L, 72057594021150720L, 144115188042301440L, 288230376084602880L, 576460752169205760L, 1152921504338411520L, 2305843008676823040L, 4611686017353646080L, 9223372034707292160L};
    public static final String EXCEPTION_TEXT = "PRSGcorrupted";
    public static final boolean G;
    public static boolean H = false;
    public static final int RND_SEED_LEN = 44;
    private xt61 v = new xt61(8);
    private xt61 w = new xt61(2);
    private xt61 x = new xt61(11);
    private xt61 y = new xt61(11);
    private xt61 z = new xt61(256);
    private int A = 0;
    private int B = 0;
    private int C = 0;
    private int E = 0;
    private boolean F = false;

    static {
        boolean booleanValue;
        synchronized (CertifiedRandom.class) {
            booleanValue = ((Boolean) AccessController.doPrivileged(new puu0(22))).booleanValue();
        }
        H = booleanValue;
        String property = System.getProperty("os.arch");
        G = property.equalsIgnoreCase("ppc64") || property.equalsIgnoreCase("amd64");
    }

    public CertifiedRandom(RandomInterface randomInterface) {
        c(randomInterface);
    }

    public static int aFunction(int i) {
        return ((i & 1) * (-363819843)) ^ (i >>> 1);
    }

    public static void b(int i, int[] iArr) {
        long currentTimeMillis = System.currentTimeMillis();
        int i2 = i << 1;
        iArr[i2] = (int) currentTimeMillis;
        iArr[i2 + 1] = (int) (currentTimeMillis >>> 32);
    }

    public static synchronized void f(byte[] bArr) {
        synchronized (CertifiedRandom.class) {
            AccessController.doPrivileged(new br61(1, bArr));
        }
    }

    public static boolean getPRSGStatistics(RandomInterface randomInterface) {
        return G ? getPRSGStatistics64bit(randomInterface) : getPRSGStatistics32bit(randomInterface);
    }

    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [boolean, byte] */
    /* JADX WARN: Type inference failed for: r0v3 */
    public static boolean getPRSGStatistics32bit(RandomInterface randomInterface) {
        boolean z;
        ?? r0;
        int i;
        int[] iArr = new int[32];
        int i2 = 8;
        int[] iArr2 = new int[8];
        Arrays.fill(iArr2, -1);
        byte[] bArr = new byte[19456];
        int i3 = 0;
        int i4 = 0;
        int i5 = 1;
        while (true) {
            if (i4 >= 5) {
                z = true;
                r0 = i3;
                break;
            }
            for (int i6 = i3; i6 < 19; i6++) {
                randomInterface.makeRandom(bArr, i6 * 1024, 1024);
            }
            int i7 = 73728;
            int i8 = 18432;
            byte[] bArr2 = fx61.d;
            if (i5 != 0) {
                int i9 = i3;
                int i10 = i9;
                while (true) {
                    z = true;
                    if (i9 >= 18432) {
                        break;
                    }
                    i10 += bArr2[bArr[i9] & 255];
                    i9++;
                }
                if (Math.abs(i10 - 73728) < 710) {
                    i5 = i3;
                }
            } else {
                z = true;
            }
            int i11 = i3;
            while (i11 < 32) {
                int i12 = i11 >> 2;
                if (iArr2[i12] != 0) {
                    Arrays.fill(iArr, i3);
                    i = i7;
                    int i13 = i3;
                    while (i13 < i8) {
                        int a = xt61.a(i13, bArr);
                        int i14 = i13 + i11;
                        int a2 = xt61.a(i14, bArr);
                        int a3 = xt61.a(i14 + 4, bArr);
                        int i15 = i3;
                        int i16 = i15;
                        while (i15 < 32) {
                            int i17 = a ^ (i15 < 31 ? (a2 << (i15 + 1)) | (a3 >>> (31 - i15)) : a3);
                            try {
                                int i18 = iArr[i15] + bArr2[i17 & 255];
                                iArr[i15] = i18;
                                int i19 = i18 + bArr2[(i17 >>> 8) & 255];
                                iArr[i15] = i19;
                                int i20 = i19 + bArr2[(i17 >>> 16) & 255];
                                iArr[i15] = i20;
                                iArr[i15] = i20 + bArr2[(i17 >>> 24) & 255];
                                i16++;
                                i15++;
                            } catch (ArrayIndexOutOfBoundsException e) {
                                JCPLogger.warning(e.toString());
                                JCPLogger.warning("CertifiedRandom.getPRSGStatistics ArrayIndexOutOfBoundsException");
                                JCPLogger.warning(e.toString());
                                JCPLogger.warning("j:", Integer.valueOf(i16));
                                JCPLogger.warning("s0i:", iArr);
                                JCPLogger.warning("rBit:", Integer.valueOf(i15));
                                JCPLogger.warning("lexC:", Integer.valueOf(i17));
                                JCPLogger.warning("lexC & 0xff:", Integer.valueOf(i17 & 255));
                                throw e;
                            }
                        }
                        i13 += 4;
                        i3 = 0;
                        i8 = 18432;
                    }
                    for (int i21 = 0; i21 < 32; i21++) {
                        if (Math.abs(iArr[i21] - i) < 710) {
                            iArr2[i12] = iArr2[i12] & (~(Integer.MIN_VALUE >> i21));
                        }
                    }
                } else {
                    i = i7;
                }
                i11 += 4;
                i7 = i;
                i2 = 8;
                i3 = 0;
                i8 = 18432;
            }
            int i22 = i2;
            int i23 = i5;
            for (int i24 = 0; i24 < i22; i24++) {
                int i25 = iArr2[i24];
                i23 = i23 + bArr2[i25 & 255] + bArr2[(i25 >>> 8) & 255] + bArr2[(i25 >>> 16) & 255] + bArr2[(i25 >>> 25) & 255];
            }
            if (i23 == 0) {
                r0 = 0;
                break;
            }
            i4++;
            i2 = i22;
            i3 = 0;
        }
        Arrays.fill(bArr, (byte) r0);
        return i4 < 5 ? z : r0;
    }

    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v3 */
    public static boolean getPRSGStatistics64bit(RandomInterface randomInterface) {
        int i;
        boolean z;
        ?? r0;
        int[] iArr;
        int i2;
        int i3;
        int[] iArr2 = new int[32];
        int i4 = 8;
        int[] iArr3 = new int[8];
        Arrays.fill(iArr3, -1);
        int[] iArr4 = new int[4864];
        int i5 = 0;
        int i6 = 0;
        int i7 = 1;
        while (true) {
            if (i6 >= 5) {
                i = i6;
                z = true;
                r0 = i5;
                break;
            }
            for (int i8 = i5; i8 < 19; i8++) {
                randomInterface.makeRandom(iArr4, i8 * 256, 256);
            }
            int i9 = 73728;
            int i10 = 4608;
            if (i7 != 0) {
                int i11 = i5;
                int i12 = i11;
                while (i11 < 4608) {
                    i12 = Integer.bitCount(iArr4[i11]) + i12;
                    i11++;
                }
                if (Math.abs(i12 - 73728) < 710) {
                    i7 = i5;
                }
            }
            int i13 = i5;
            while (i13 < i4) {
                if (iArr3[i13] != 0) {
                    Arrays.fill(iArr2, i5);
                    int i14 = i5;
                    while (i14 < i10) {
                        int i15 = i9;
                        long j = iArr4[i14];
                        int i16 = i14 + i13;
                        int i17 = i6;
                        int[] iArr5 = iArr3;
                        long j2 = (iArr4[i16 + 1] & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (iArr4[i16] << 32);
                        for (int i18 = 31; i18 >= 0; i18--) {
                            iArr2[i18] = Long.bitCount((j2 ^ (j << i18)) & D[i18]) + iArr2[i18];
                        }
                        i14++;
                        i9 = i15;
                        i6 = i17;
                        iArr3 = iArr5;
                        i10 = 4608;
                    }
                    iArr = iArr3;
                    i2 = i6;
                    i3 = i9;
                    for (int i19 = 0; i19 < 32; i19++) {
                        if (Math.abs(iArr2[i19] - i3) < 710) {
                            iArr[i13] = iArr[i13] & (~(1 << i19));
                        }
                    }
                } else {
                    iArr = iArr3;
                    i2 = i6;
                    i3 = i9;
                }
                i13++;
                i9 = i3;
                i6 = i2;
                iArr3 = iArr;
                i4 = 8;
                i5 = 0;
                i10 = 4608;
            }
            int[] iArr6 = iArr3;
            i = i6;
            z = true;
            int i20 = i4;
            int i21 = i7;
            for (int i22 = 0; i22 < i20; i22++) {
                i21 += Integer.bitCount(iArr6[i22]);
            }
            if (i21 == 0) {
                r0 = 0;
                break;
            }
            i6 = i + 1;
            i4 = i20;
            iArr3 = iArr6;
            i5 = 0;
        }
        Arrays.fill(iArr4, (int) r0);
        return i < 5 ? z : r0;
    }

    public static int mult32(int i, int i2) {
        int i3 = 0;
        for (int i4 = 0; i4 < 32; i4++) {
            if ((Integer.MIN_VALUE & i) != 0) {
                i3 ^= i2;
            }
            i2 = aFunction(i2);
            i <<= 1;
        }
        return i3;
    }

    public static void phi(int[] iArr, int[] iArr2, int i) {
        int[] iArr3 = new int[11];
        int[] iArr4 = {Integer.MIN_VALUE, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for (int i2 = 0; i2 < i; i2++) {
            iArr3[i2] = iArr[(11 - i) + i2] ^ iArr2[i2];
        }
        phi_1(i, iArr4, iArr3);
        polinomMult(iArr4, iArr, iArr);
        Arrays.fill(iArr4, 0, i, 0);
        Arrays.fill(iArr3, 0, i, 0);
    }

    public static void phi_1(int i, int[] iArr, int[] iArr2) {
        int i2 = i - 1;
        iArr2[i2] = iArr2[i2] | Integer.MIN_VALUE;
        if (i == 5) {
            iArr2[0] = iArr2[0] | 1;
        }
        for (int i3 = 0; i3 < i; i3++) {
            for (int i4 = 0; i4 < 32; i4++) {
                if ((iArr2[i3] & 1) == 0) {
                    polinomSqrt(iArr);
                } else {
                    polinomSqrtMultx(iArr);
                }
                iArr2[i3] = iArr2[i3] >>> 1;
            }
        }
    }

    public static void polinomMult(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[11];
        Arrays.fill(iArr4, 0);
        for (int i = 0; i < 11; i++) {
            for (int i2 = 0; i2 < 11; i2++) {
                iArr4[i2] = iArr4[i2] ^ mult32(iArr[i2], iArr2[i]);
            }
            int i3 = iArr[10];
            for (int i4 = 10; i4 >= 1; i4--) {
                iArr[i4] = iArr[i4 - 1];
            }
            iArr[0] = aFunction(i3);
            iArr[1] = iArr[1] ^ i3;
        }
        System.arraycopy(iArr4, 0, iArr3, 0, 11);
        Arrays.fill(iArr4, 0);
    }

    public static void polinomSqrt(int[] iArr) {
        int sqrt32Tab = sqrt32Tab(iArr[6]);
        int sqrt32Tab2 = sqrt32Tab(iArr[7]);
        int sqrt32Tab3 = sqrt32Tab(iArr[8]);
        int sqrt32Tab4 = sqrt32Tab(iArr[9]);
        int sqrt32Tab5 = sqrt32Tab(iArr[10]);
        iArr[10] = sqrt32Tab(iArr[5]) ^ sqrt32Tab5;
        iArr[9] = aFunction(sqrt32Tab5);
        iArr[8] = sqrt32Tab(iArr[4]) ^ sqrt32Tab4;
        iArr[7] = aFunction(sqrt32Tab4);
        iArr[6] = sqrt32Tab(iArr[3]) ^ sqrt32Tab3;
        iArr[5] = aFunction(sqrt32Tab3);
        iArr[4] = sqrt32Tab(iArr[2]) ^ sqrt32Tab2;
        iArr[3] = aFunction(sqrt32Tab2);
        iArr[2] = sqrt32Tab(iArr[1]) ^ sqrt32Tab;
        iArr[1] = aFunction(sqrt32Tab);
        iArr[0] = sqrt32Tab(iArr[0]);
    }

    public static void polinomSqrtMultx(int[] iArr) {
        int sqrt32Tab = sqrt32Tab(iArr[5]);
        int sqrt32Tab2 = sqrt32Tab(iArr[6]);
        int sqrt32Tab3 = sqrt32Tab(iArr[7]);
        int sqrt32Tab4 = sqrt32Tab(iArr[8]);
        int sqrt32Tab5 = sqrt32Tab(iArr[9]);
        int sqrt32Tab6 = sqrt32Tab(iArr[10]);
        iArr[10] = aFunction(sqrt32Tab6);
        iArr[9] = sqrt32Tab(iArr[4]) ^ sqrt32Tab5;
        iArr[8] = aFunction(sqrt32Tab5);
        iArr[7] = sqrt32Tab(iArr[3]) ^ sqrt32Tab4;
        iArr[6] = aFunction(sqrt32Tab4);
        iArr[5] = sqrt32Tab(iArr[2]) ^ sqrt32Tab3;
        iArr[4] = aFunction(sqrt32Tab3);
        iArr[3] = sqrt32Tab(iArr[1]) ^ sqrt32Tab2;
        iArr[2] = aFunction(sqrt32Tab2);
        iArr[1] = (sqrt32Tab(iArr[0]) ^ sqrt32Tab) ^ sqrt32Tab6;
        iArr[0] = aFunction(sqrt32Tab ^ sqrt32Tab6);
    }

    public static synchronized byte[] s() {
        byte[] bArr;
        synchronized (CertifiedRandom.class) {
            bArr = (byte[]) AccessController.doPrivileged(new puu0(15));
        }
        return bArr;
    }

    public static int sqrt32Tab(int i) {
        int[] iArr = fx61.a;
        return fx61.c[i & 255] ^ ((iArr[(i >> 16) & 255] | (iArr[(i >> 24) & 255] << 16)) ^ fx61.b[(i >> 8) & 255]);
    }

    public static boolean testStatRawBuf(int[] iArr) {
        int[] iArr2 = new int[256];
        int[] iArr3 = new int[16];
        Arrays.fill(iArr2, 0);
        for (int i = 0; i < 256; i++) {
            int i2 = iArr[i] & 255;
            iArr2[i2] = iArr2[i2] + 1;
            int i3 = (iArr[i] >> 8) & 255;
            iArr2[i3] = iArr2[i3] + 1;
            int i4 = (iArr[i] >> 16) & 255;
            iArr2[i4] = iArr2[i4] + 1;
            int i5 = (iArr[i] >> 24) & 255;
            iArr2[i5] = iArr2[i5] + 1;
        }
        int i6 = 0;
        for (int i7 = 0; i7 < 16; i7++) {
            iArr3[i7] = 0;
            int i8 = i7 << 4;
            int i9 = 0;
            for (int i10 = 0; i10 < 16; i10++) {
                int i11 = iArr3[i7] + iArr2[i8 + i10];
                iArr3[i7] = i11;
                iArr3[i7] = i11 + iArr2[i9 + i7];
                i9 += 16;
            }
            int i12 = iArr3[i7];
            i6 += i12 * i12;
        }
        return i6 <= 265344;
    }

    public static boolean testStatRawBuf1(int[] iArr) {
        int[] iArr2 = new int[16];
        Arrays.fill(iArr2, 0);
        for (int i = 0; i < 256; i++) {
            for (int i2 = 0; i2 < 32; i2 += 4) {
                int i3 = (iArr[i] >> i2) & 15;
                iArr2[i3] = iArr2[i3] + 1;
            }
        }
        int i4 = 0;
        for (int i5 = 0; i5 < 16; i5++) {
            int i6 = iArr2[i5];
            i4 += i6 * i6;
        }
        return i4 <= 265344;
    }

    public abstract RandomInterface a();

    public final synchronized void c(RandomInterface randomInterface) {
        if (!this.F) {
            i();
            k(randomInterface);
            this.F = true;
        }
    }

    public final void finalize() {
        i();
        super.finalize();
    }

    public final synchronized void g(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[8];
        int[] iArr5 = new int[11];
        int[] iArr6 = new int[5];
        int[] iArr7 = new int[8];
        int[] iArr8 = new int[8];
        try {
            if (iArr2 != null) {
                System.arraycopy(iArr2, 0, iArr5, 0, 11);
            } else if (this.x.g()) {
                int[] iArr9 = this.x.a;
                System.arraycopy(iArr9, 0, iArr5, 0, iArr9.length);
            } else {
                if (iArr3 != null) {
                    System.arraycopy(iArr3, 0, iArr5, 0, 11);
                } else {
                    for (int i = 0; i < 44; i++) {
                        iArr5[i] = this.x.a[i] + 1633771873;
                    }
                    b(0, iArr7);
                    iArr5[0] = iArr5[0] + iArr7[0];
                    iArr5[1] = iArr5[1] + iArr7[1];
                }
                if (iArr != null) {
                    if (equals(a())) {
                        l();
                        throw null;
                    }
                    System.arraycopy(iArr, 0, iArr8, 0, 8);
                    InGostCipher.gamm_back_modul(iArr5, 11, this.w.a, iArr8, iq61.O4);
                }
            }
            if (iArr3 != null) {
                System.arraycopy(iArr3, 0, iArr6, 0, 5);
            } else {
                Arrays.fill(iArr6, 1717986918);
                for (int i2 = 0; i2 < 5; i2++) {
                    iArr6[i2] = iArr6[i2] + iArr4[i2];
                }
                b(0, iArr7);
                iArr6[0] = iArr6[0] + iArr7[0];
                iArr6[1] = iArr6[1] + iArr7[1];
            }
            if (iArr != null) {
                if (equals(a())) {
                    l();
                    throw null;
                }
                this.v.f();
                System.arraycopy(iArr5, 0, iArr4, 0, 8);
                System.arraycopy(iArr, 0, iArr8, 0, 8);
                int[] iArr10 = this.w.a;
                int[] iArr11 = iq61.O4;
                InGostCipher.gamm_back_modul(iArr4, 8, iArr10, iArr8, iArr11);
                this.v.e(iArr4);
                xt61 xt61Var = this.w;
                if (xt61Var.a.length != 2) {
                    xt61Var.f();
                    xt61Var.a = new int[2];
                }
                int[] iArr12 = xt61Var.a;
                System.arraycopy(iArr5, 0, iArr12, 0, iArr12.length);
                int[] iArr13 = xt61Var.a;
                xt61Var.b = CheckMemory.checkMem32(iArr13, 0, iArr13.length);
                InGostCipher.gamm_back_modul(iArr6, 5, this.w.a, iArr8, iArr11);
                Arrays.fill(iArr8, 0);
            }
            int i3 = 0;
            while (true) {
                if (i3 >= 11) {
                    iArr5[0] = 15;
                    break;
                } else if (iArr5[i3] != 0) {
                    break;
                } else {
                    i3++;
                }
            }
            phi(iArr5, iArr6, 5);
            this.x.e(iArr5);
            Arrays.fill(iArr4, 0);
            Arrays.fill(iArr5, 0);
            Arrays.fill(iArr6, 0);
            Arrays.fill(iArr7, 0);
            Arrays.fill(iArr8, 0);
        } catch (Throwable th) {
            Arrays.fill(iArr4, 0);
            Arrays.fill(iArr5, 0);
            Arrays.fill(iArr6, 0);
            Arrays.fill(iArr7, 0);
            Arrays.fill(iArr8, 0);
            throw th;
        }
    }

    @Override // ru.CryptoPro.JCP.Random.cl_0, ru.CryptoPro.JCP.Random.RandomInterface
    public synchronized int getRandomState() {
        return this.E;
    }

    public final synchronized void h(int[] iArr, int[] iArr2, int[] iArr3, boolean z) {
        SelfTester_JCP.check(2105344);
        g(iArr, iArr2, iArr3);
        this.A = 101;
        this.B = 33;
        n();
        if (z && !getPRSGStatistics(this)) {
            l();
            throw null;
        }
    }

    public final synchronized void i() {
        this.F = false;
        this.E = 0;
        this.A = 0;
        this.C = 0;
        this.B = 0;
        this.x.f();
        this.y.f();
        this.z.f();
        this.w.f();
        this.v.f();
    }

    @Override // ru.CryptoPro.JCP.Random.RandomInterface
    public synchronized boolean isReady() {
        return this.F;
    }

    public final synchronized void j(int i, int[] iArr) {
        int[] iArr2 = new int[i];
        try {
            b(0, iArr2);
            Arrays.fill(iArr, 0, i, 1633771873);
            b(1, iArr2);
            for (int i2 = 0; i2 < i; i2++) {
                iArr[i2] = iArr[i2] + iArr2[i2];
            }
            if (this.v.g()) {
                InGostCipher.gamm_back_modul(iArr, i, this.w.a, this.v.a, iq61.O4);
            }
            Arrays.fill(iArr2, 0);
        } catch (Throwable th) {
            Arrays.fill(iArr2, 0);
            throw th;
        }
    }

    public final synchronized void k(RandomInterface randomInterface) {
        int[] iArr = new int[16];
        int[] iArr2 = new int[16];
        this.A = 0;
        this.C = 0;
        this.B = 0;
        try {
            try {
                SelfTester_JCP.check(2105344);
                if (randomInterface == null) {
                    LocalMutex localMutex = new LocalMutex("CertifiedRandom_class_RandomSeed");
                    try {
                        try {
                            AccessController.doPrivileged(new ew61(this, localMutex, 0));
                            b(0, iArr);
                            q();
                            b(1, iArr);
                            h(null, null, iArr, false);
                            b(3, iArr);
                            h(null, null, iArr, true);
                            p();
                        } catch (PrivilegedActionException e) {
                            throw ((IOException) e.getException());
                        }
                    } finally {
                        localMutex.unlockFinally();
                    }
                } else {
                    b(0, iArr);
                    randomInterface.makeRandom(iArr2, 0, 16);
                    b(1, iArr);
                    h(null, iArr2, null, false);
                    b(3, iArr);
                    randomInterface.makeRandom(iArr2, 0, 16);
                    for (int i = 0; i < 16; i++) {
                        iArr[i] = iArr[i] + iArr2[i];
                    }
                    h(iArr2, null, iArr, true);
                    this.E |= 8;
                }
            } finally {
                Arrays.fill(iArr, 0);
                Arrays.fill(iArr2, 0);
            }
        } catch (Exception e2) {
            RandomRefuseException randomRefuseException = new RandomRefuseException();
            randomRefuseException.initCause(e2);
            throw randomRefuseException;
        }
    }

    public final void l() {
        i();
        throw new RandomRefuseException(JCPRes.getString(EXCEPTION_TEXT, 3));
    }

    public final synchronized void m() {
        c(a());
    }

    @Override // ru.CryptoPro.JCP.Random.cl_0, ru.CryptoPro.JCP.Random.RandomInterface
    public synchronized void makeRandom(int[] iArr, int i, int i2) {
        if (iArr != null) {
            try {
                if (iArr.length >= i + i2) {
                    SelfTester_JCP.check(2105344);
                    m();
                    if (!this.z.g()) {
                        n();
                    }
                    this.C = (this.C + 3) & (-4);
                    do {
                        int max = Math.max(0, Math.min(this.z.a.length - (this.C >> 2), i2));
                        for (int i3 = 0; i3 < max; i3++) {
                            iArr[i + i3] = this.z.a[(this.C >> 2) + i3];
                        }
                        i2 -= max;
                        int i4 = this.C + (max << 2);
                        this.C = i4;
                        i += max;
                        if ((i4 >> 2) >= this.z.a.length) {
                            n();
                            this.C = 0;
                        }
                    } while (i2 > 0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        throw new IllegalArgumentException();
    }

    public final synchronized void n() {
        boolean z;
        int i = 11;
        int[] iArr = new int[11];
        int[] iArr2 = new int[11];
        int[] iArr3 = new int[5];
        try {
            this.F = false;
            int i2 = 0;
            while (true) {
                if (i2 >= 10) {
                    z = true;
                    break;
                }
                System.arraycopy(this.y.a, 0, iArr2, 0, i);
                if (this.A > 100) {
                    System.arraycopy(this.x.a, 0, iArr, 0, i);
                    j(5, iArr3);
                    phi(iArr, iArr3, 5);
                    System.arraycopy(iArr, 0, iArr2, 0, i);
                    iArr[0] = iArr[0] + 1;
                    this.x.e(iArr);
                    this.A = 0;
                }
                if (this.B > 32) {
                    j(4, iArr3);
                    phi(iArr2, iArr3, 4);
                    System.arraycopy(iArr2, 0, this.v.a, 0, 8);
                    int[] iArr4 = this.w.a;
                    iArr4[0] = iArr2[8];
                    iArr4[1] = iArr2[9];
                    this.B = 0;
                    this.z.f();
                    z = true;
                } else {
                    z = true;
                    InGostCipher.simple_decrypt_key(InGostCipher.Ccons, iArr2, 0, iArr2, 0, InGostCipher.ZERO_KEY, 0, iq61.O4);
                    this.B++;
                }
                this.y.e(iArr2);
                this.A += z ? 1 : 0;
                InGostCipher.gamm_back_modul(this.z.a, 256, this.w.a, iArr2, iq61.O4);
                xt61 xt61Var = this.z;
                int[] iArr5 = xt61Var.a;
                xt61Var.b = CheckMemory.checkMem32(iArr5, 0, iArr5.length);
                if (testStatRawBuf(this.z.a)) {
                    break;
                }
                i2++;
                i = 11;
            }
            if (i2 == 10) {
                l();
                throw null;
            }
            this.F = z;
            Arrays.fill(iArr, 0);
            Arrays.fill(iArr2, 0);
            Arrays.fill(iArr3, 0);
        } catch (Throwable th) {
            Arrays.fill(iArr, 0);
            Arrays.fill(iArr2, 0);
            Arrays.fill(iArr3, 0);
            throw th;
        }
    }

    public final synchronized void p() {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(56);
            byteArrayOutputStream.write(xt61.d(258));
            if (this.x.g()) {
                this.x.c(byteArrayOutputStream);
            }
            f(byteArrayOutputStream.toByteArray());
        } catch (IOException unused) {
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x004f, code lost:
    
        if (ru.CryptoPro.JCP.tools.Control.KeyUsageControlUtility.isStrictModeEnabled() == false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void q() {
        byte[] s;
        if (KeyUsageControlUtility.isStrictModeEnabled() && H) {
            JCPLogger.info("Need physical initialization...");
        } else {
            try {
                s = s();
            } catch (IOException unused) {
            }
            if (s == null) {
                throw new IOException();
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(s);
            byte[] bArr = new byte[4];
            if (byteArrayInputStream.read(bArr) != 4) {
                throw new IOException();
            }
            if (xt61.a(0, bArr) != 258) {
                throw new IOException();
            }
            this.x.b(byteArrayInputStream);
        }
        r();
    }

    public final void r() {
        JCPLogger.info("Initializing from BIO...");
        int[] iArr = this.x.a;
        int length = iArr.length << 2;
        this.x.e((GraphicsEnvironment.isHeadless() ? new BioRandomConsole().getBioRandom(length) : new BioRandomFrame().getBioRandom(length)).makeRandomInts(iArr.length));
        if (!this.x.g()) {
            JCPLogger.warning("RandomSeed verification failed.");
        }
        if (H) {
            synchronized (CertifiedRandom.class) {
                AccessController.doPrivileged(new puu0(11));
            }
            H = false;
        }
        JCPLogger.info("Initializing from BIO completed.");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0029 A[Catch: all -> 0x001b, LOOP:0: B:13:0x0022->B:15:0x0029, LOOP_END, TryCatch #1 {all -> 0x001b, blocks: (B:7:0x000d, B:9:0x0015, B:13:0x0022, B:15:0x0029, B:17:0x0034, B:21:0x0048, B:23:0x0052, B:28:0x0056, B:30:0x0060, B:32:0x006a, B:33:0x001d), top: B:6:0x000d, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0056 A[Catch: all -> 0x001b, TryCatch #1 {all -> 0x001b, blocks: (B:7:0x000d, B:9:0x0015, B:13:0x0022, B:15:0x0029, B:17:0x0034, B:21:0x0048, B:23:0x0052, B:28:0x0056, B:30:0x0060, B:32:0x006a, B:33:0x001d), top: B:6:0x000d, outer: #0 }] */
    @Override // ru.CryptoPro.JCP.Random.RandomInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized void setRandomSeed(byte[] bArr) {
        int i;
        if (bArr == null) {
            throw new IllegalArgumentException();
        }
        m();
        int[] iArr = new int[16];
        int[] iArr2 = new int[16];
        try {
            b(0, iArr);
            if (bArr.length <= 44) {
                if (bArr.length < 32) {
                }
                for (i = 0; i < ((bArr.length + 3) & (-4)); i += 4) {
                    iArr2[i >> 2] = xt61.a(i, bArr);
                }
                h(null, iArr2, null, false);
                b(3, iArr);
                if (equals(a())) {
                    a().makeRandom(iArr2, 0, 16);
                    for (int i2 = 0; i2 < 16; i2++) {
                        iArr[i2] = iArr[i2] + iArr2[i2];
                    }
                    h(iArr2, null, iArr, false);
                } else {
                    for (int i3 = 0; i3 < 16; i3++) {
                        iArr[i3] = iArr[i3] + iArr2[i3];
                    }
                    h(null, null, iArr, false);
                }
                Arrays.fill(iArr, 0);
                Arrays.fill(iArr2, 0);
            }
            bArr = GostDigest.digestData(bArr);
            while (i < ((bArr.length + 3) & (-4))) {
            }
            h(null, iArr2, null, false);
            b(3, iArr);
            if (equals(a())) {
            }
            Arrays.fill(iArr, 0);
            Arrays.fill(iArr2, 0);
        } catch (Throwable th) {
            Arrays.fill(iArr, 0);
            Arrays.fill(iArr2, 0);
            throw th;
        }
    }

    @Override // ru.CryptoPro.JCP.Random.RandomInterface
    public synchronized void makeRandom(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            try {
                if (bArr.length >= i + i2) {
                    SelfTester_JCP.check(2105344);
                    m();
                    if (!this.z.g()) {
                        n();
                    }
                    do {
                        int max = Math.max(0, Math.min((this.z.a.length << 2) - this.C, i2));
                        for (int i3 = 0; i3 < max; i3++) {
                            int[] iArr = this.z.a;
                            int i4 = this.C + i3;
                            bArr[i + i3] = (byte) ((iArr[i4 >> 2] >>> ((i4 & 3) << 3)) & 255);
                        }
                        i2 -= max;
                        int i5 = this.C + max;
                        this.C = i5;
                        i += max;
                        if (i5 >= (this.z.a.length << 2)) {
                            n();
                            this.C = 0;
                        }
                    } while (i2 > 0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        throw new IllegalArgumentException();
    }

    @Override // ru.CryptoPro.JCP.Random.RandomInterface
    public synchronized void setRandomSeed(RandomInterface randomInterface) {
        if (randomInterface != null) {
            if (randomInterface.isReady()) {
                m();
                byte[] bArr = new byte[44];
                try {
                    randomInterface.makeRandom(bArr, 0, 44);
                } catch (Exception unused) {
                }
                setRandomSeed(bArr);
                int randomState = randomInterface.getRandomState();
                int i = this.E;
                if (((~i) & randomState) != 0) {
                    this.E = randomState | i;
                }
                if (equals(a())) {
                    try {
                        try {
                            LocalMutex localMutex = new LocalMutex("CertifiedRandom_class_RandomSeed");
                            try {
                                AccessController.doPrivileged(new ew61(this, localMutex, 1));
                                p();
                                localMutex.unlockFinally();
                            } catch (Throwable th) {
                                localMutex.unlockFinally();
                                throw th;
                            }
                        } catch (PrivilegedActionException e) {
                            RandomRefuseException randomRefuseException = new RandomRefuseException();
                            randomRefuseException.initCause(e);
                            throw randomRefuseException;
                        }
                    } catch (Exception e2) {
                        RandomRefuseException randomRefuseException2 = new RandomRefuseException();
                        randomRefuseException2.initCause(e2);
                        throw randomRefuseException2;
                    }
                } else {
                    a().setRandomSeed(this);
                }
            }
        }
    }
}
