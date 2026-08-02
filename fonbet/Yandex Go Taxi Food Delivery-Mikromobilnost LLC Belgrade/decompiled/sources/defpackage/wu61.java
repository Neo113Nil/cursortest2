package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import java.security.InvalidKeyException;
import java.security.KeyManagementException;
import java.security.MessageDigest;
import java.util.Arrays;
import ru.CryptoPro.JCP.Cipher.InGostCipher;
import ru.CryptoPro.JCP.Digest.CheckMemory;
import ru.CryptoPro.JCP.Digest.GostDigest;
import ru.CryptoPro.JCP.Digest.GostDigest2012_256;
import ru.CryptoPro.JCP.Key.InternalGostPrivateKey;
import ru.CryptoPro.JCP.Key.PrivateKeySpec;
import ru.CryptoPro.JCP.Random.CPRandom;
import ru.CryptoPro.JCP.Random.CertifiedRandom;
import ru.CryptoPro.JCP.Random.RandomInterface;
import ru.CryptoPro.JCP.Random.RandomRefuseException;
import ru.CryptoPro.JCP.Sign.SignValue;
import ru.CryptoPro.JCP.math.BigIntr;
import ru.CryptoPro.JCP.math.EllipticPoint;
import ru.CryptoPro.JCP.params.AlgIdInterface;
import ru.CryptoPro.JCP.params.CryptParamsInterface;
import ru.CryptoPro.JCP.params.DigestParamsSpec;
import ru.CryptoPro.JCP.params.EllipticParamsInterface;
import ru.CryptoPro.JCP.params.ParamsInterface;
import ru.CryptoPro.JCP.tools.Array;
import ru.CryptoPro.JCP.tools.SelfTesterException;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.reprov.array.DerValue;
import ru.CryptoPro.ssl.Alerts;

/* loaded from: classes4.dex */
public final class wu61 {
    public static final uw61[] p = new uw61[16];
    public static final int[] q = {577896553, 587516260, -1764017523, -1003820730, -1800602088, 302509312, -1025734976, 732515567};
    public static final byte[] r = {DerValue.TAG_CONTEXT, -127, -126, -125, -124, -123, -122, -121, -120, -119, -118, -117, -116, -115, -114, -113, -112, -111, -110, -109, -108, -107, -106, -105, -104, -103, -102, -101, -100, -99, -98, -97};
    public static final int[] s = {-2088599168, -2021227132, -1953855096, -1886483060, -1819111024, -1751738988, -1684366952, -1616994916};
    public static final CPRandom t = new CPRandom();
    public int[] a;
    public int[] b;
    public int c;
    public int d;
    public final int e;
    public final int f;
    public int g;
    public int h;
    public long i;
    public final CheckMemory j;
    public boolean k;
    public final int l;
    public final BigIntr m;
    public final Object n;
    public gu61 o;

    static {
        for (int i = 0; i < 16; i++) {
            p[i] = new uw61();
        }
    }

    public wu61(AlgIdInterface algIdInterface, RandomInterface randomInterface, byte[] bArr, byte[] bArr2) {
        this.a = null;
        this.b = null;
        this.c = 0;
        this.d = 0;
        this.g = 0;
        this.h = 0;
        this.i = 0L;
        this.j = new CheckMemory();
        this.k = false;
        this.m = null;
        this.n = new Object();
        this.o = null;
        EllipticParamsInterface ellipticParamsInterface = (EllipticParamsInterface) algIdInterface.getSignParams();
        if (randomInterface == null) {
            w511.q();
            throw null;
        }
        BigIntr q2 = ellipticParamsInterface.getQ();
        int intLength = q2.getIntLength();
        this.e = intLength;
        if (intLength != 16) {
            w511.q();
            throw null;
        }
        this.m = q2;
        this.l = 3;
        int[] iArr = new int[intLength];
        try {
            randomInterface.setRandomSeed(bArr);
            if (!CertifiedRandom.getPRSGStatistics(randomInterface)) {
                throw new RandomRefuseException();
            }
            int i = intLength >>> 1;
            randomInterface.makeRandom(iArr, 0, i);
            randomInterface.setRandomSeed(bArr2);
            if (!CertifiedRandom.getPRSGStatistics(randomInterface)) {
                throw new RandomRefuseException();
            }
            randomInterface.makeRandom(iArr, i, i);
            int[] modCSP = c6a1.c(0, intLength, intLength, q2.getMagWithoutCopy(), iArr) > 0 ? iArr : BigIntr.modCSP(iArr, q2.getMagWithoutCopy());
            this.f = F();
            System.arraycopy(modCSP, 0, this.a, this.c, intLength);
            boolean z = false;
            while (!z) {
                randomInterface.makeRandom(this.b, this.d, q2.getIntLength());
                int[] magWithoutCopy = q2.getMagWithoutCopy();
                int[] iArr2 = this.b;
                int i2 = this.d;
                int i3 = this.e;
                if (c6a1.c(i2, i3, i3, magWithoutCopy, iArr2) > 0 && !BigIntr.isZero(this.b, this.d, this.e)) {
                    z = true;
                }
            }
            H();
            this.k = true;
            Arrays.fill(iArr, 0);
            if (modCSP != null) {
                Arrays.fill(modCSP, 0);
            }
        } catch (Throwable th) {
            Arrays.fill(iArr, 0);
            if (0 != 0) {
                Arrays.fill((int[]) null, 0);
            }
            throw th;
        }
    }

    public final synchronized void A(RandomInterface randomInterface) {
        if (this.i + 600000 < System.currentTimeMillis()) {
            j(randomInterface, null);
        }
    }

    public final synchronized BigIntr B() {
        BigIntr euclidInverse;
        if (this.l != 3) {
            throw new IllegalArgumentException();
        }
        BigIntr bigIntr = new BigIntr(this.b, this.d, this.e);
        euclidInverse = bigIntr.euclidInverse(this.m);
        bigIntr.clear();
        return euclidInverse;
    }

    public final synchronized void C() {
        if (!this.k) {
            throw new InvalidKeyException();
        }
        if (this.i + 600000 < System.currentTimeMillis() && this.i != 0 && !G()) {
            this.i = 0L;
            throw new InvalidKeyException();
        }
    }

    public final synchronized int[] D(RandomInterface randomInterface) {
        int[] iArr;
        try {
            if (this.l == 3) {
                throw new IllegalArgumentException();
            }
            C();
            iArr = new int[this.e];
            for (int i = 0; i < this.e; i++) {
                int i2 = this.l;
                int[] iArr2 = this.a;
                int i3 = this.c + i;
                if (i2 == 4) {
                    iArr[i] = iArr2[i3] ^ this.b[this.d + i];
                } else {
                    iArr[i] = iArr2[i3] - this.b[this.d + i];
                }
            }
            j(randomInterface, null);
        } catch (Throwable th) {
            throw th;
        }
        return iArr;
    }

    public final synchronized byte[] E() {
        return Array.toByteArray(this.b, this.d, this.e);
    }

    public final int F() {
        int a;
        int hashCode = this.n.hashCode() & 15;
        if (this.e == 0) {
            throw new KeyManagementException();
        }
        uw61[] uw61VarArr = p;
        synchronized (uw61VarArr[hashCode]) {
            try {
                a = uw61VarArr[hashCode].a(this.e);
                if (a == -1) {
                    throw new KeyManagementException();
                }
                int i = a >>> 11;
                this.a = ((kw61) uw61VarArr[hashCode].a.elementAt(i)).a;
                this.b = ((kw61) uw61VarArr[hashCode].a.elementAt(i)).a;
                this.c = ((a & 2047) + 2048) * 8;
                this.d = (((a + 2048) & 2047) + 4096) * 8;
            } catch (Throwable th) {
                throw th;
            }
        }
        return a;
    }

    public final synchronized boolean G() {
        boolean z;
        this.j.reset();
        this.j.update(this.a, this.c, this.e);
        int i = this.j.get();
        this.j.reset();
        this.j.update(this.b, this.d, this.e);
        int i2 = this.j.get();
        if (i == this.g) {
            z = i2 == this.h;
        }
        return z;
    }

    public final synchronized void H() {
        this.j.reset();
        this.j.update(this.a, this.c, this.e);
        this.g = this.j.get();
        this.j.reset();
        this.j.update(this.b, this.d, this.e);
        this.h = this.j.get();
        this.i = System.currentTimeMillis();
    }

    public final synchronized wu61 a(RandomInterface randomInterface) {
        wu61 wu61Var;
        C();
        wu61Var = new wu61(this.a, this.c, this.b, this.d, this.e, randomInterface, this.l, this.m, this.o);
        j(randomInterface, null);
        return wu61Var;
    }

    public final synchronized SignValue b(ParamsInterface paramsInterface, BigIntr bigIntr, byte[] bArr, BigIntr bigIntr2) {
        return PrivateKeySpec.createSignature(this.a, this.c, this.b, this.d, paramsInterface, bigIntr, bArr, bigIntr2);
    }

    public final synchronized EllipticPoint c(EllipticPoint ellipticPoint, RandomInterface randomInterface) {
        EllipticPoint powerHEX;
        if (this.l != 3) {
            throw new IllegalArgumentException();
        }
        try {
            BigIntr z = z();
            EllipticPoint powerTAB = ellipticPoint.powerTAB(z, false);
            z.clear();
            BigIntr B = B();
            powerHEX = powerTAB.powerHEX(B, true);
            B.clear();
            j(randomInterface, null);
            SelfTester_JCP.check(4096);
        } catch (SelfTesterException e) {
            InvalidKeyException invalidKeyException = new InvalidKeyException(InternalGostPrivateKey.resource.getString("KeyCreateError"));
            invalidKeyException.initCause(e);
            throw invalidKeyException;
        }
        return powerHEX;
    }

    public final synchronized void d(kzo kzoVar, RandomInterface randomInterface, byte[] bArr) {
        int i = this.l;
        if (i == 3 || i == 1) {
            throw new InvalidKeyException("Invalid mask type");
        }
        byte[] bArr2 = new byte[16];
        int[] iArr = new int[4];
        byte[] E = E();
        try {
            SelfTester_JCP.check(1048576);
            byte[] bArr3 = new byte[16];
            int i2 = 0;
            while (true) {
                byte[] bArr4 = r;
                if (i2 < 32) {
                    Array.copy(bArr4, i2, bArr2, 0, 16);
                    kzo kzoVar2 = kzoVar;
                    RandomInterface randomInterface2 = randomInterface;
                    byte[] bArr5 = bArr;
                    kzoVar2.f(bArr2, bArr5, bArr3, randomInterface2, true);
                    for (int i3 = 0; i3 < 16; i3++) {
                        bArr2[i3] = (byte) (bArr2[i3] ^ E[i3 + i2]);
                    }
                    Array.toIntArray(iArr, bArr2);
                    Array.copy(iArr, 0, this.a, this.c + (i2 / 4), 4);
                    i2 += 16;
                    kzoVar = kzoVar2;
                    bArr = bArr5;
                    randomInterface = randomInterface2;
                } else {
                    j(randomInterface, null);
                    this.o = new gu61(this);
                    Array.clear(iArr);
                    Array.clear(bArr2);
                    Array.clear(E);
                }
            }
        } catch (Throwable th) {
            Array.clear(iArr);
            Array.clear(bArr2);
            Array.clear(E);
            throw th;
        }
    }

    public final synchronized void e(wu61 wu61Var, RandomInterface randomInterface) {
        C();
        gu61 gu61Var = this.o;
        wu61Var.o = gu61Var == null ? null : new gu61(this, gu61Var);
        System.arraycopy(this.a, this.c, wu61Var.a, wu61Var.c, this.e);
        System.arraycopy(this.b, this.d, wu61Var.b, wu61Var.d, this.e);
        wu61Var.j(randomInterface, null);
        wu61Var.k = true;
    }

    public final synchronized void f(wu61 wu61Var, CryptParamsInterface cryptParamsInterface, RandomInterface randomInterface) {
        int i = this.l;
        if (i == 3 || i == 4) {
            throw new InvalidKeyException("Invalid mask type");
        }
        int[] iArr = new int[2];
        try {
            SelfTester_JCP.check(1048576);
            int i2 = 0;
            while (true) {
                int[] iArr2 = s;
                if (i2 < 8) {
                    int i3 = iArr2[i2];
                    iArr[1] = ((i3 >>> 24) & 255) | ((i3 & 255) << 24) | (((i3 >>> 8) & 255) << 16) | (((i3 >>> 16) & 255) << 8);
                    int i4 = iArr2[i2 + 1];
                    iArr[0] = ((i4 >>> 24) & 255) | ((i4 & 255) << 24) | (((i4 >>> 8) & 255) << 16) | (((i4 >>> 16) & 255) << 8);
                    wu61Var.u(iArr, cryptParamsInterface.getCommutator(), true);
                    int[] iArr3 = this.a;
                    int i5 = this.c + i2;
                    int i6 = iArr[1];
                    iArr3[i5] = ((i6 >>> 24) & 255) | ((i6 & 255) << 24) | (((i6 >>> 8) & 255) << 16) | (((i6 >>> 16) & 255) << 8);
                    int i7 = i5 + 1;
                    int i8 = iArr[0];
                    iArr3[i7] = (((i8 >>> 16) & 255) << 8) | ((i8 & 255) << 24) | (((i8 >>> 8) & 255) << 16) | ((i8 >>> 24) & 255);
                    int i9 = iArr3[i5];
                    int[] iArr4 = this.b;
                    int i10 = this.d + i2;
                    iArr3[i5] = i9 + iArr4[i10];
                    iArr3[i7] = iArr3[i7] + iArr4[i10 + 1];
                    i2 += 2;
                } else {
                    j(randomInterface, null);
                    this.o = new gu61(this);
                    iArr[1] = 0;
                    iArr[0] = 0;
                }
            }
        } catch (Throwable th) {
            iArr[1] = 0;
            iArr[0] = 0;
            throw th;
        }
    }

    public final void finalize() {
        try {
            int hashCode = this.n.hashCode() & 15;
            uw61[] uw61VarArr = p;
            synchronized (uw61VarArr[hashCode]) {
                uw61 uw61Var = uw61VarArr[hashCode];
                int i = this.f;
                int i2 = this.e;
                kw61 kw61Var = (kw61) uw61Var.a.elementAt(i >>> 11);
                int i3 = i & 2047;
                int[] iArr = kw61Var.a;
                Arrays.fill(kw61Var.b, i3, (i2 / 8) + (i2 % 8 == 0 ? 0 : 1) + i3, (byte) 0);
                if (i3 < kw61Var.c) {
                    kw61Var.c = i3;
                }
                int i4 = (i3 + 2048) * 8;
                Arrays.fill(iArr, i4, i4 + i2, 0);
                int i5 = (i3 + 4096) * 8;
                Arrays.fill(iArr, i5, i2 + i5, 0);
            }
        } finally {
            super.finalize();
        }
    }

    public final synchronized void g(wu61 wu61Var, int[] iArr, int[] iArr2) {
        this.o.a(wu61Var.e * 4);
        InGostCipher.simple_crypt_key(wu61Var.a, wu61Var.c, wu61Var.e, iArr, this.a, this.c, this.b, this.d, iArr2);
    }

    public final synchronized void h(MessageDigest messageDigest) {
        int i;
        for (int i2 = 0; i2 < this.e; i2++) {
            try {
                int i3 = this.l;
                if (i3 == 1) {
                    i = this.a[this.c + i2] - this.b[this.d + i2];
                } else {
                    if (i3 != 4) {
                        throw new IllegalArgumentException();
                    }
                    i = this.a[this.c + i2] ^ this.b[this.d + i2];
                }
                for (int i4 = 0; i4 < 4; i4++) {
                    messageDigest.update((byte) ((i >> (i4 << 3)) & 255));
                }
            } finally {
            }
        }
    }

    public final synchronized void i(MessageDigest messageDigest, byte[] bArr) {
        int i;
        int i2 = 0;
        for (int i3 = 0; i3 < this.e; i3++) {
            try {
                int i4 = this.l;
                if (i4 == 1) {
                    i = this.a[this.c + i3] - this.b[this.d + i3];
                } else {
                    if (i4 != 4) {
                        throw new IllegalArgumentException();
                    }
                    i = this.a[this.c + i3] ^ this.b[this.d + i3];
                }
                int i5 = 0;
                while (i5 < 4) {
                    messageDigest.update((byte) (bArr[i2] ^ ((i >> (i5 << 3)) & 255)));
                    i5++;
                    i2++;
                }
            } finally {
            }
        }
        messageDigest.update(bArr, i2, bArr.length - i2);
    }

    public final synchronized void j(RandomInterface randomInterface, BigIntr bigIntr) {
        int i;
        int i2;
        RandomInterface randomInterface2 = randomInterface;
        synchronized (this) {
            try {
                int i3 = this.l;
                if (i3 == 1) {
                    if (randomInterface2 == null) {
                        randomInterface2 = t;
                    }
                    int[] makeRandomInts = randomInterface2.makeRandomInts(this.e);
                    int i4 = 0;
                    while (true) {
                        i2 = this.e;
                        if (i4 >= i2) {
                            break;
                        }
                        int[] iArr = this.a;
                        int i5 = this.c + i4;
                        iArr[i5] = (makeRandomInts[i4] - this.b[this.d + i4]) + iArr[i5];
                        i4++;
                    }
                    System.arraycopy(makeRandomInts, 0, this.b, this.d, i2);
                    H();
                    Arrays.fill(makeRandomInts, 0);
                } else if (i3 == 3) {
                    int i6 = this.e;
                    int[] iArr2 = new int[i6];
                    int[] iArr3 = new int[i6];
                    int[] iArr4 = new int[i6];
                    boolean z = false;
                    while (!z) {
                        randomInterface2.makeRandom(iArr2, 0, this.e);
                        int[] magWithoutCopy = this.m.getMagWithoutCopy();
                        int i7 = this.e;
                        if (c6a1.c(0, i7, i7, magWithoutCopy, iArr2) > 0) {
                            z = true;
                        }
                    }
                    int[] iArr5 = this.a;
                    int i8 = this.c;
                    c6a1.i(iArr5, iArr5, iArr2, i8, i8, 0, this.m.getMagWithoutCopy(), this.m.getIntLength());
                    System.arraycopy(this.b, this.d, iArr3, 0, this.e);
                    if (bigIntr == null) {
                        int i9 = this.e;
                        if (i9 == 8) {
                            r5a1.r(iArr4, iArr3, this.m.getMagWithoutCopy());
                        } else {
                            if (i9 != 16) {
                                throw new IllegalArgumentException();
                            }
                            r5a1.t(iArr4, iArr3, this.m.getMagWithoutCopy());
                        }
                    } else {
                        iArr4 = bigIntr.getMag();
                    }
                    int[] iArr6 = iArr4;
                    int[] iArr7 = this.a;
                    int i10 = this.c;
                    c6a1.i(iArr7, iArr7, iArr6, i10, i10, 0, this.m.getMagWithoutCopy(), this.m.getIntLength());
                    System.arraycopy(iArr2, 0, this.b, this.d, this.e);
                    H();
                    Arrays.fill(iArr2, 0);
                    Arrays.fill(iArr3, 0);
                    Arrays.fill(iArr6, 0);
                } else {
                    if (i3 != 4) {
                        throw new IllegalArgumentException();
                    }
                    if (randomInterface2 == null) {
                        randomInterface2 = t;
                    }
                    int[] makeRandomInts2 = randomInterface2.makeRandomInts(this.e);
                    int i11 = 0;
                    while (true) {
                        i = this.e;
                        if (i11 >= i) {
                            break;
                        }
                        int[] iArr8 = this.a;
                        int i12 = this.c + i11;
                        iArr8[i12] = iArr8[i12] ^ (makeRandomInts2[i11] ^ this.b[this.d + i11]);
                        i11++;
                    }
                    System.arraycopy(makeRandomInts2, 0, this.b, this.d, i);
                    H();
                    Arrays.fill(makeRandomInts2, 0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized void k(CryptParamsInterface cryptParamsInterface, RandomInterface randomInterface) {
        if (this.l == 3) {
            throw new IllegalArgumentException();
        }
        int[] iArr = new int[this.e];
        try {
            InGostCipher.simple_decrypt_key(q, iArr, 0, this.a, this.c, this.b, this.d, cryptParamsInterface.getCommutator());
            System.arraycopy(iArr, 0, this.a, this.c, this.e);
            int[] iArr2 = this.b;
            int i = this.d;
            Arrays.fill(iArr2, i, this.e + i, 0);
            j(randomInterface, null);
            this.o = new gu61(this);
            Arrays.fill(iArr, 0);
        } catch (Throwable th) {
            Arrays.fill(iArr, 0);
            throw th;
        }
    }

    public final synchronized void l(CryptParamsInterface cryptParamsInterface, RandomInterface randomInterface, byte[] bArr) {
        try {
            if (this.l == 3) {
                throw new IllegalArgumentException();
            }
            int[] iArr = new int[this.e];
            int[] iArr2 = new int[2];
            for (int i = 0; i < 8; i++) {
                try {
                    Array.clear(iArr2);
                    for (int i2 = 0; i2 < 8; i2++) {
                        int i3 = this.a[this.c + i2] - this.b[this.d + i2];
                        if ((bArr[i] & (1 << i2)) == 0) {
                            iArr2[1] = iArr2[1] + i3;
                        } else {
                            iArr2[0] = iArr2[0] + i3;
                        }
                    }
                    for (int i4 = 0; i4 < 4; i4++) {
                        u(iArr2, cryptParamsInterface.getCommutator(), false);
                        int[] iArr3 = this.a;
                        int i5 = i4 * 2;
                        int i6 = this.c + i5;
                        int i7 = iArr3[i6];
                        int[] iArr4 = this.b;
                        int i8 = this.d + i5;
                        int i9 = (i7 - iArr4[i8]) ^ iArr2[0];
                        iArr2[0] = i9;
                        int i10 = iArr3[i6 + 1];
                        int i11 = i8 + 1;
                        iArr2[1] = (i10 - iArr4[i11]) ^ iArr2[1];
                        iArr[i5] = i9 + iArr4[i8];
                        iArr[i5 + 1] = iArr2[1] + iArr4[i11];
                    }
                    System.arraycopy(iArr, 0, this.a, this.c, this.e);
                    this.o = new gu61(this);
                    j(randomInterface, null);
                } catch (Throwable th) {
                    iArr2[1] = 0;
                    iArr2[0] = 0;
                    Arrays.fill(iArr, 0);
                    throw th;
                }
            }
            iArr2[1] = 0;
            iArr2[0] = 0;
            Arrays.fill(iArr, 0);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void m(byte[] bArr) {
        int[] iArr;
        int[] iArr2;
        try {
            if (this.l != 3) {
                throw new IllegalArgumentException();
            }
            int[] iArr3 = null;
            try {
                int[] intArray = Array.toIntArray(bArr);
                try {
                    int i = this.e;
                    iArr = new int[i];
                    try {
                        iArr2 = new int[i];
                        try {
                            int[] iArr4 = this.a;
                            int i2 = this.c;
                            c6a1.i(iArr4, iArr4, intArray, i2, i2, 0, this.m.getMagWithoutCopy(), this.m.getIntLength());
                            System.arraycopy(this.b, this.d, iArr, 0, this.e);
                            int i3 = this.e;
                            if (i3 == 8) {
                                r5a1.r(iArr2, iArr, this.m.getMagWithoutCopy());
                            } else {
                                if (i3 != 16) {
                                    throw new IllegalArgumentException();
                                }
                                r5a1.t(iArr2, iArr, this.m.getMagWithoutCopy());
                            }
                            int[] iArr5 = this.a;
                            int i4 = this.c;
                            c6a1.i(iArr5, iArr5, iArr2, i4, i4, 0, this.m.getMagWithoutCopy(), this.m.getIntLength());
                            System.arraycopy(intArray, 0, this.b, this.d, this.e);
                            H();
                            if (intArray != null) {
                                Array.clear(intArray);
                            }
                            Array.clear(iArr);
                            Array.clear(iArr2);
                        } catch (Throwable th) {
                            th = th;
                            iArr3 = intArray;
                            if (iArr3 != null) {
                                Array.clear(iArr3);
                            }
                            if (iArr != null) {
                                Array.clear(iArr);
                            }
                            if (iArr2 != null) {
                                Array.clear(iArr2);
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        iArr2 = null;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    iArr = null;
                    iArr2 = null;
                }
            } catch (Throwable th4) {
                th = th4;
                iArr = null;
                iArr2 = null;
            }
        } finally {
        }
    }

    public final synchronized void n(byte[] bArr, RandomInterface randomInterface) {
        int[] iArr;
        try {
            byte[] bArr2 = null;
            try {
                byte[] q2 = q(new byte[][]{new byte[]{1}, new byte[]{38, -67, -72, Alerts.alert_no_application_protocol}, new byte[]{0}, bArr, new byte[]{1, 0}}, 5, true);
                try {
                    iArr = Array.toIntArray(q2);
                    try {
                        System.arraycopy(iArr, 0, this.a, this.c, this.e);
                        int[] iArr2 = this.b;
                        int i = this.d;
                        Arrays.fill(iArr2, i, this.e + i, 0);
                        j(randomInterface, null);
                        this.o = new gu61(this);
                        if (q2 != null) {
                            Arrays.fill(q2, (byte) 0);
                        }
                        if (iArr != null) {
                            Arrays.fill(iArr, 0);
                        }
                    } catch (Throwable th) {
                        th = th;
                        bArr2 = q2;
                        if (bArr2 != null) {
                            Arrays.fill(bArr2, (byte) 0);
                        }
                        if (iArr != null) {
                            Arrays.fill(iArr, 0);
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    iArr = null;
                }
            } catch (Throwable th3) {
                th = th3;
                iArr = null;
            }
        } catch (Throwable th4) {
            throw th4;
        }
    }

    public final synchronized void o(int[] iArr, int[] iArr2, boolean z) {
        if (z) {
            try {
                this.o.a(iArr.length * 4);
            } catch (Throwable th) {
                throw th;
            }
        }
        InGostCipher.imita(iArr, this.a, this.c, this.b, this.d, iArr2);
    }

    public final synchronized void p(int[] iArr, int[] iArr2, int[] iArr3) {
        this.o.a(iArr2.length * 4);
        InGostCipher.cbc_encrypt(iArr, iArr2, this.a, this.c, this.b, this.d, iArr3);
    }

    public final synchronized byte[] q(byte[][] bArr, int i, boolean z) {
        MessageDigest gostDigest2012_256;
        int i2 = z ? 64 : 32;
        try {
            byte[] bArr2 = new byte[i2];
            byte[] bArr3 = new byte[i2];
            Arrays.fill(bArr2, (byte) 54);
            Arrays.fill(bArr3, (byte) 92);
            MessageDigest gostDigest2012_2562 = z ? new GostDigest2012_256() : new GostDigest(DigestParamsSpec.OID_HashVerbaO);
            i(gostDigest2012_2562, bArr2);
            for (int i3 = 0; i3 < i; i3++) {
                byte[] bArr4 = bArr[i3];
                gostDigest2012_2562.engineUpdate(bArr4, 0, bArr4.length);
            }
            byte[] engineDigest = gostDigest2012_2562.engineDigest();
            gostDigest2012_256 = z ? new GostDigest2012_256() : new GostDigest(DigestParamsSpec.OID_HashVerbaO);
            i(gostDigest2012_256, bArr3);
            gostDigest2012_256.engineUpdate(engineDigest, 0, engineDigest.length);
        } catch (Throwable th) {
            throw th;
        }
        return gostDigest2012_256.engineDigest();
    }

    public final synchronized void r(wu61 wu61Var, RandomInterface randomInterface) {
        try {
            C();
            gu61 gu61Var = this.o;
            gu61 gu61Var2 = gu61Var == null ? null : new gu61(this, gu61Var);
            wu61Var.o = gu61Var2;
            gu61Var2.e = PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED;
            gu61Var2.d = this.o.d;
            if (this.l != 1) {
                throw new IllegalArgumentException();
            }
            if (randomInterface == null) {
                randomInterface = t;
            }
            int[] makeRandomInts = randomInterface.makeRandomInts(this.e);
            int i = 0;
            while (true) {
                int i2 = this.e;
                if (i < i2) {
                    int[] iArr = wu61Var.a;
                    int i3 = wu61Var.c + i;
                    int i4 = this.a[this.c + i];
                    int i5 = this.b[this.d + i];
                    iArr[i3] = (((i4 - i5) >>> 24) | ((i4 - i5) << 24) | (((i4 - i5) & 65280) << 8) | (((i4 - i5) >>> 8) & 65280)) + makeRandomInts[i];
                    i++;
                } else {
                    System.arraycopy(makeRandomInts, 0, wu61Var.b, wu61Var.d, i2);
                    Arrays.fill(makeRandomInts, 0);
                    wu61Var.H();
                    wu61Var.k = true;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void s(byte[] bArr) {
        if (this.k) {
            throw new InvalidKeyException();
        }
        int[] intArray = Array.toIntArray(bArr);
        try {
            System.arraycopy(intArray, 0, this.b, this.d, intArray.length);
        } finally {
            Array.clear(intArray);
        }
    }

    public final synchronized void t(int[] iArr, int[] iArr2) {
        this.o.a(iArr.length * 4);
        InGostCipher.simple_decrypt(iArr, this.a, this.c, this.b, this.d, iArr2);
    }

    public final synchronized void u(int[] iArr, int[] iArr2, boolean z) {
        if (!z) {
            try {
                this.o.a(iArr.length * 4);
            } catch (Throwable th) {
                throw th;
            }
        }
        InGostCipher.simple_encrypt(iArr, this.a, this.c, this.b, this.d, iArr2);
    }

    public final synchronized void v(int[] iArr, int[] iArr2, int[] iArr3) {
        this.o.a(iArr2.length * 4);
        InGostCipher.cbc_decrypt(iArr, iArr2, this.a, this.c, this.b, this.d, iArr3);
    }

    public final synchronized void w() {
        int[] iArr = this.a;
        int i = this.c;
        Arrays.fill(iArr, i, this.e + i, 0);
        int[] iArr2 = this.b;
        int i2 = this.d;
        Arrays.fill(iArr2, i2, this.e + i2, 0);
        this.i = 0L;
        this.k = false;
    }

    public final void x(RandomInterface randomInterface) {
        if (this.l != 1) {
            w511.q();
            return;
        }
        int i = this.e;
        if (randomInterface == null) {
            randomInterface = t;
        }
        int[] makeRandomInts = randomInterface.makeRandomInts(i);
        for (int i2 = 0; i2 < i; i2++) {
            int[] iArr = this.a;
            int i3 = this.c + i2;
            int i4 = iArr[i3];
            int i5 = this.b[this.d + i2];
            iArr[i3] = (((i4 - i5) >>> 24) | ((i4 - i5) << 24) | (((i4 - i5) & 65280) << 8) | (((i4 - i5) >>> 8) & 65280)) + makeRandomInts[i2];
        }
        System.arraycopy(makeRandomInts, 0, this.b, this.d, i);
        H();
        Arrays.fill(makeRandomInts, 0);
    }

    public final synchronized void y(int[] iArr, int[] iArr2, int[] iArr3) {
        this.o.a(iArr.length * 4);
        InGostCipher.get_gamma(iArr, iArr2, this.a, this.c, this.b, this.d, iArr3);
    }

    public final synchronized BigIntr z() {
        return new BigIntr(this.a, this.c, this.e);
    }

    public wu61(BigIntr bigIntr, int i) {
        this.a = null;
        this.b = null;
        this.c = 0;
        this.d = 0;
        this.g = 0;
        this.h = 0;
        this.i = 0L;
        this.j = new CheckMemory();
        this.k = false;
        this.m = null;
        this.n = new Object();
        this.o = null;
        this.e = i;
        this.f = F();
        this.l = 3;
        this.m = bigIntr;
        H();
    }

    public wu61(wu61 wu61Var, RandomInterface randomInterface, int i) {
        this.a = null;
        this.b = null;
        this.c = 0;
        this.d = 0;
        this.g = 0;
        this.h = 0;
        this.i = 0L;
        this.j = new CheckMemory();
        this.k = false;
        this.m = null;
        this.n = new Object();
        this.o = null;
        this.e = i;
        this.f = F();
        this.l = wu61Var.l;
        System.arraycopy(wu61Var.a, wu61Var.c, this.a, this.c, wu61Var.e);
        int[] iArr = this.a;
        int i2 = this.c;
        Arrays.fill(iArr, wu61Var.e + i2, i2 + i, 0);
        System.arraycopy(wu61Var.b, wu61Var.d, this.b, this.d, wu61Var.e);
        int[] iArr2 = this.b;
        int i3 = this.d;
        Arrays.fill(iArr2, wu61Var.e + i3, i3 + i, 0);
        j(randomInterface, null);
        this.k = true;
    }

    public wu61(ParamsInterface paramsInterface, RandomInterface randomInterface, int i, int i2) {
        this.a = null;
        this.b = null;
        boolean z = false;
        this.c = 0;
        this.d = 0;
        this.g = 0;
        this.h = 0;
        this.i = 0L;
        this.j = new CheckMemory();
        this.k = false;
        this.m = null;
        this.n = new Object();
        this.o = null;
        this.l = i;
        if (i == 3) {
            EllipticParamsInterface ellipticParamsInterface = (EllipticParamsInterface) ((AlgIdInterface) paramsInterface).getSignParams();
            if (randomInterface == null || i2 != 0) {
                w511.q();
                throw null;
            }
            BigIntr q2 = ellipticParamsInterface.getQ();
            int intLength = q2.getIntLength();
            this.e = intLength;
            this.f = F();
            this.m = q2;
            int[] iArr = new int[intLength];
            randomInterface.makeRandom(iArr, 0, q2.getIntLength());
            int[] modCSP = c6a1.c(0, intLength, intLength, q2.getMagWithoutCopy(), iArr) > 0 ? BigIntr.modCSP(iArr, q2.getMagWithoutCopy()) : iArr;
            System.arraycopy(modCSP, 0, this.a, this.c, intLength);
            Arrays.fill(iArr, 0);
            Arrays.fill(modCSP, 0);
            while (!z) {
                randomInterface.makeRandom(this.b, this.d, q2.getIntLength());
                int[] magWithoutCopy = q2.getMagWithoutCopy();
                int[] iArr2 = this.b;
                int i3 = this.d;
                int i4 = this.e;
                if (c6a1.c(i3, i4, i4, magWithoutCopy, iArr2) > 0 && !BigIntr.isZero(this.b, this.d, q2.getIntLength())) {
                    z = true;
                }
            }
        } else {
            this.e = i2;
            this.f = F();
            randomInterface.makeRandom(this.a, this.c, i2);
            randomInterface.makeRandom(this.b, this.d, i2);
            this.o = new gu61(this);
        }
        H();
        this.k = true;
    }

    public wu61(int[] iArr, int i, int[] iArr2, int i2, int i3, RandomInterface randomInterface, int i4, BigIntr bigIntr, gu61 gu61Var) {
        this.a = null;
        this.b = null;
        this.c = 0;
        this.d = 0;
        this.g = 0;
        this.h = 0;
        this.i = 0L;
        this.j = new CheckMemory();
        this.k = false;
        this.m = null;
        this.n = new Object();
        this.o = null;
        if (iArr.length + i >= i3 && iArr2.length + i2 >= i3) {
            this.o = gu61Var == null ? null : new gu61(this, gu61Var);
            this.e = i3;
            this.f = F();
            this.l = i4;
            this.m = bigIntr;
            synchronized (this) {
                System.arraycopy(iArr, i, this.a, this.c, i3);
                System.arraycopy(iArr2, i2, this.b, this.d, i3);
                j(randomInterface, null);
            }
            this.k = true;
            return;
        }
        w511.q();
        throw null;
    }

    public wu61(int[] iArr, RandomInterface randomInterface, int i) {
        this.a = null;
        this.b = null;
        this.c = 0;
        this.d = 0;
        this.g = 0;
        this.h = 0;
        this.i = 0L;
        this.j = new CheckMemory();
        this.k = false;
        this.m = null;
        this.n = new Object();
        this.o = null;
        int length = iArr.length;
        this.e = length;
        this.f = F();
        this.l = i;
        synchronized (this) {
            System.arraycopy(iArr, 0, this.a, this.c, length);
            int[] iArr2 = this.b;
            int i2 = this.d;
            Arrays.fill(iArr2, i2, length + i2, 0);
            j(randomInterface, null);
        }
        this.k = true;
        this.o = new gu61(this);
    }
}
