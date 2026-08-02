package ru.CryptoPro.JCP.Random;

import defpackage.b64;
import defpackage.qv10;
import defpackage.w511;
import java.awt.GraphicsEnvironment;
import java.util.Arrays;
import java.util.Calendar;
import ru.CryptoPro.JCP.ASN.PKIXCMP.PKIBody;
import ru.CryptoPro.JCP.Digest.GostDigest2012_512;
import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.pref.JCPPref;
import ru.CryptoPro.JCP.tools.JCPLogger;
import ru.CryptoPro.reprov.array.DerValue;

/* loaded from: classes4.dex */
public abstract class AbstractBioRandom {
    public static final int CONSOLE_TYPE = 1;
    public static final int FRAME_TYPE = 0;
    public static final String STR_DEF_USED_BIO = "Used BIORandom";
    public static final String STR_THREAD_NAME = "BIOThread";
    public static int s;
    public static String[] t;
    public static final String u = BioRandomFrame.class.getName() + ";" + BioRandomConsole.class.getName();
    public long a = 0;
    public final long[] b = new long[2];
    public final long[] c = new long[2];
    public long d = 0;
    public boolean e;
    public cl_0 f;
    public cl_0 g;
    public boolean h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public boolean n;
    public int o;
    public byte[] p;
    public byte[] q;
    public final Object r;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class cl_0 {
        public static final cl_0 a;
        public static final cl_0 b;
        public static final cl_0 c;
        private static final /* synthetic */ cl_0[] d;

        static {
            cl_0 cl_0Var = new cl_0("mmUnknown", 0);
            a = cl_0Var;
            cl_0 cl_0Var2 = new cl_0("mmLeft", 1);
            b = cl_0Var2;
            cl_0 cl_0Var3 = new cl_0("mmRight", 2);
            c = cl_0Var3;
            d = new cl_0[]{cl_0Var, cl_0Var2, cl_0Var3};
        }

        public static cl_0[] values() {
            return (cl_0[]) d.clone();
        }
    }

    static {
        k();
    }

    public AbstractBioRandom() {
        cl_0 cl_0Var = cl_0.a;
        this.f = cl_0Var;
        this.g = cl_0Var;
        this.h = false;
        this.i = -1;
        this.j = -1;
        this.k = -1;
        this.l = 200;
        this.m = 0;
        this.n = false;
        this.o = 0;
        this.r = new Object();
    }

    public static void addBioRandom(String str) throws Exception {
        Class<?> cls;
        try {
            cls = Class.forName(str);
        } catch (ClassNotFoundException unused) {
            ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
            cls = contextClassLoader != null ? Class.forName(str, true, contextClassLoader) : Class.forName(str);
        }
        if (!(cls.newInstance() instanceof AbstractBioRandom)) {
            w511.s("Specified class doesn't inherit AbstractBioRandom");
            return;
        }
        String[] strArr = t;
        int length = strArr.length;
        int i = length + 1;
        String[] strArr2 = new String[i];
        System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
        strArr2[t.length] = str;
        String str2 = new String();
        for (int i2 = 0; i2 < i; i2++) {
            StringBuilder t2 = qv10.t(str2);
            t2.append(strArr2[i2]);
            str2 = t2.toString();
            if (i2 != length) {
                str2 = str2.concat(";");
            }
        }
        e("Used BIORandomList", str2);
        k();
    }

    public static void e(String str, String str2) {
        new JCPPref(AbstractBioRandom.class).put(str, str2);
    }

    public static boolean f(byte[] bArr) {
        int[] iArr = new int[16];
        Arrays.fill(iArr, 0);
        for (byte b : bArr) {
            iArr[b] = iArr[b] + 1;
        }
        double d = 0.0d;
        for (int i = 0; i < 16; i++) {
            int i2 = iArr[i];
            d += i2 * i2;
        }
        return ((d * 16.0d) / ((double) bArr.length)) - ((double) bArr.length) < 30.57d;
    }

    public static AbstractBioRandom getBioRandomObject() {
        Class<?> cls;
        String str = new JCPPref(AbstractBioRandom.class).get(STR_DEF_USED_BIO, null);
        if (str == null) {
            String[] h = h(u);
            if (GraphicsEnvironment.isHeadless()) {
                BioRandomConsole bioRandomConsole = new BioRandomConsole();
                e(STR_DEF_USED_BIO, h[1]);
                return bioRandomConsole;
            }
            BioRandomFrame bioRandomFrame = new BioRandomFrame();
            e(STR_DEF_USED_BIO, h[0]);
            return bioRandomFrame;
        }
        try {
            cls = Class.forName(str);
        } catch (ClassNotFoundException e) {
            ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
            try {
                cls = contextClassLoader != null ? Class.forName(str, true, contextClassLoader) : Class.forName(str);
            } catch (ClassNotFoundException unused) {
                throw new RandomRefuseException("Specified class doesn't inherit AbstractBioRandom", e);
            }
        }
        try {
            Object newInstance = cls.newInstance();
            if (newInstance instanceof AbstractBioRandom) {
                return (AbstractBioRandom) newInstance;
            }
            throw new RandomRefuseException("Specified class doesn't inherit AbstractBioRandom");
        } catch (IllegalAccessException e2) {
            throw new RandomRefuseException("Specified class doesn't inherit AbstractBioRandom", e2);
        } catch (InstantiationException e3) {
            throw new RandomRefuseException("Specified class doesn't inherit AbstractBioRandom", e3);
        }
    }

    public static int getRandomListSize() {
        return s;
    }

    public static String[] h(String str) {
        int i = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            if (str.charAt(i2) == ';') {
                i++;
            }
        }
        int i3 = i + 1;
        s = i3;
        String[] strArr = new String[i3];
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < str.length(); i6++) {
            if (str.charAt(i6) == ';') {
                strArr[i4] = str.substring(i5, i6);
                i4++;
                i5 = i6 + 1;
            }
            if (i6 == str.length() - 1) {
                strArr[i] = str.substring(i5, i6 + 1);
            }
        }
        return strArr;
    }

    public static boolean j(byte[] bArr) {
        byte b;
        int i;
        byte[] bArr2 = bArr;
        byte[] bArr3 = new byte[bArr2.length];
        byte[] bArr4 = new byte[bArr2.length];
        byte[] bArr5 = new byte[bArr2.length];
        byte[] bArr6 = new byte[bArr2.length];
        int i2 = 0;
        while (true) {
            b = 2;
            i = 4;
            if (i2 >= bArr2.length) {
                break;
            }
            bArr3[i2] = (byte) ((bArr2[i2] & 240) >>> 4);
            bArr4[i2] = (byte) (bArr2[i2] & PKIBody._CCP);
            byte b2 = bArr2[i2];
            bArr5[i2] = (byte) (((b2 & 12) >>> 2) | ((b2 & DerValue.TAG_PRIVATE) >>> 4));
            byte b3 = bArr2[i2];
            bArr6[i2] = (byte) ((b3 & 3) | ((b3 & 48) >>> 2));
            i2++;
        }
        if (!f(bArr3) || !f(bArr5) || !f(bArr6) || !f(bArr4)) {
            return false;
        }
        int length = bArr2.length;
        int i3 = 0;
        while (true) {
            byte b4 = 1;
            if (i3 > i) {
                return true;
            }
            int i4 = 1 << i3;
            int min = Math.min(i4, (length << 3) - i4);
            int i5 = 0;
            while (i5 < min) {
                int i6 = i5 / 8;
                int i7 = i5 % 8;
                byte b5 = (byte) (bArr2[i6] & ((-128) >>> i7));
                byte b6 = i4 == 16 ? b : b4;
                byte b7 = b4;
                int i8 = 0;
                int i9 = 0;
                int i10 = 0;
                int i11 = 0;
                while (i10 < bArr2.length - i6) {
                    int i12 = i7;
                    while (i12 < 8) {
                        if (((byte) ((128 >>> i12) & 255 & bArr2[i10 + i6] & 255)) != 0) {
                            i8++;
                            if (b5 == 0) {
                                i11++;
                                b5 = b7;
                            }
                        } else {
                            i9++;
                            if (b5 != 0) {
                                i11++;
                                b5 = 0;
                            }
                        }
                        i12 += i4;
                        bArr2 = bArr;
                    }
                    i10 += b6;
                    bArr2 = bArr;
                }
                double d = (((i8 * 2.0d) * i9) / (i8 + i9)) + 1.0d;
                if (Math.abs((i11 + 1) - d) > Math.sqrt(((d - 2.0d) * (d - 1.0d)) / (r0 - 1)) * 3.090232d) {
                    return false;
                }
                i5++;
                b4 = b7;
                b = 2;
                bArr2 = bArr;
            }
            i3++;
            b = 2;
            i = 4;
            bArr2 = bArr;
        }
    }

    public static void k() {
        String str = new JCPPref(AbstractBioRandom.class).get("Used BIORandomList", null);
        if (str != null) {
            t = h(str);
        } else {
            t = h(u);
        }
    }

    public static long l() {
        long nanoTime = System.nanoTime() / 1000;
        Calendar calendar = Calendar.getInstance();
        return ((System.nanoTime() / 1000) % 1000000) + (System.nanoTime() - JCP.startTime) + (nanoTime << 32) + calendar.get(11) + calendar.get(5) + ((calendar.get(12) + calendar.get(2)) << 16);
    }

    public static void removeBioRandom(String str) {
        int length = t.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (t[i2].equals(str)) {
                i = i2;
            }
        }
        if (i < 2) {
            JCPLogger.warning("Illegal test name to remove");
            return;
        }
        String str2 = new String();
        for (int i3 = 0; i3 < length; i3++) {
            if (i3 != i) {
                StringBuilder t2 = qv10.t(str2);
                t2.append(t[i3]);
                str2 = t2.toString();
            }
            int i4 = length - 1;
            if (i == i4 && i3 == length - 2) {
                break;
            }
            if (i3 != i - 1 && i3 != i4) {
                str2 = b64.j(str2, ";");
            }
        }
        e("Used BIORandomList", str2);
        k();
    }

    public static void setDefaultBioRandom(int i) {
        String[] strArr = t;
        if (i >= strArr.length || i < 0) {
            JCPLogger.warning("Cannot set default BioRandom");
        } else {
            e(STR_DEF_USED_BIO, strArr[i]);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x00ce, code lost:
    
        if ((r13 - r10[0]) >= 3) goto L70;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(int i, int i2, long j, long j2, boolean z) {
        byte[] bArr;
        int length;
        synchronized (this.r) {
            try {
                long j3 = this.d;
                if (j3 != 0 && j3 != 1) {
                    int i3 = 1;
                    if (!z) {
                        if (!(this instanceof BioRandomFrame)) {
                            long[] jArr = this.c;
                            long j4 = jArr[1];
                            if (j2 - j4 >= 3) {
                            }
                            d(j, j2);
                            return this.o;
                        }
                        long[] jArr2 = this.b;
                        long j5 = jArr2[1];
                        if (j - j5 >= 3 && j5 - jArr2[0] >= 3) {
                            long[] jArr3 = this.c;
                            long j6 = jArr3[1];
                            if (j2 - j6 >= 3 && j6 - jArr3[0] >= 3) {
                                d(j, j2);
                                long j7 = this.b[0];
                                if (j7 - this.a <= 100) {
                                    return this.o;
                                }
                                this.a = j7;
                            }
                        }
                        d(j, j2);
                        return this.o;
                    }
                    if (this.e) {
                        int i4 = this.i;
                        if (i == i4) {
                            this.j = i2;
                        } else {
                            cl_0 cl_0Var = this.f;
                            if (cl_0Var == cl_0.a) {
                                cl_0 cl_0Var2 = i > i4 ? cl_0.c : cl_0.b;
                                this.g = cl_0Var2;
                                this.f = cl_0Var2;
                                this.i = i;
                            } else {
                                cl_0 cl_0Var3 = cl_0.c;
                                int i5 = this.k;
                                int i6 = this.l;
                                if (cl_0Var != cl_0Var3 ? i >= i5 - i6 : i <= i5 + i6) {
                                    this.h = true;
                                } else {
                                    this.h = false;
                                }
                                cl_0 cl_0Var4 = this.g;
                                if (cl_0Var4 == cl_0Var3 && i < i4) {
                                    if (cl_0Var4 != cl_0Var || this.h) {
                                        this.g = cl_0.b;
                                        this.m++;
                                    }
                                    this.a = j;
                                } else if (cl_0Var4 != cl_0.b || i <= i4) {
                                    this.i = i;
                                    this.j = i2;
                                } else {
                                    if (cl_0Var4 == cl_0Var) {
                                        if (this.h) {
                                        }
                                        this.a = j;
                                    }
                                    this.g = cl_0Var3;
                                    this.m++;
                                }
                            }
                        }
                    } else {
                        this.e = true;
                        this.i = i;
                        this.j = i2;
                        this.k = i;
                    }
                    return this.o;
                    int i7 = -1;
                    if (this.o < this.p.length) {
                        if (z) {
                            byte l = (byte) ((65280 & l()) >>> 8);
                            byte[] bArr2 = this.p;
                            int i8 = this.o;
                            int i9 = this.i;
                            int i10 = i9 - this.k;
                            cl_0 cl_0Var5 = this.f;
                            cl_0 cl_0Var6 = cl_0.c;
                            if (cl_0Var5 != cl_0Var6) {
                                i3 = -1;
                            }
                            byte b = (byte) (((i10 * i3) - this.l) & 15);
                            bArr2[i8] = b;
                            bArr2[i8] = (byte) (b ^ ((byte) ((l & 240) >>> 4)));
                            int i11 = i8 + 1;
                            this.o = i11;
                            if (i11 < bArr2.length) {
                                byte b2 = (byte) (this.j & 15);
                                bArr2[i11] = b2;
                                bArr2[i11] = (byte) (((byte) (l & PKIBody._CCP)) ^ b2);
                                this.o = i8 + 2;
                            }
                            this.k = i9;
                            this.i = i;
                            this.j = i2;
                            this.m = 0;
                            cl_0 cl_0Var7 = cl_0.b;
                            if (cl_0Var5 != cl_0Var7) {
                                cl_0Var6 = cl_0Var7;
                            }
                            this.f = cl_0Var6;
                            this.g = cl_0Var6;
                        } else {
                            long l2 = (l() & 65535) ^ (65535 & this.a);
                            long j8 = (l2 & 255) ^ ((65280 & l2) >>> 8);
                            byte[] bArr3 = this.p;
                            int i12 = this.o;
                            bArr3[i12] = (byte) (((j8 & 15) ^ ((240 & j8) >>> 4)) & 15);
                            this.o = i12 + 1;
                        }
                        int i13 = this.o;
                        byte[] bArr4 = this.p;
                        if (i13 >= bArr4.length) {
                            if (f(bArr4)) {
                                int i14 = 0;
                                while (true) {
                                    bArr = this.q;
                                    if (i14 >= bArr.length) {
                                        break;
                                    }
                                    byte[] bArr5 = this.p;
                                    int i15 = i14 * 2;
                                    bArr[i14] = (byte) (((byte) (bArr5[i15 + 1] & PKIBody._CCP)) | ((byte) (bArr5[i15] << 4)));
                                    i14++;
                                }
                                if (j(bArr)) {
                                    this.n = false;
                                } else {
                                    length = this.q.length;
                                }
                            } else {
                                length = this.q.length;
                            }
                            c(length);
                            return 0;
                        }
                        i7 = i13;
                    }
                    return i7;
                }
                d(j, j2);
                this.d++;
                return this.o;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        synchronized (this.r) {
            Arrays.fill(this.q, (byte) 0);
            Arrays.fill(this.p, (byte) 0);
            this.o = 0;
            this.n = false;
            this.e = false;
            this.j = -1;
            this.k = -1;
            this.i = -1;
            this.h = false;
        }
    }

    public final void c(int i) {
        synchronized (this.r) {
            this.q = new byte[i];
            this.o = 0;
            this.p = new byte[i * 2];
            this.n = true;
            this.e = false;
        }
    }

    public final void d(long j, long j2) {
        long[] jArr = this.c;
        jArr[0] = jArr[1];
        jArr[1] = j2;
        long[] jArr2 = this.b;
        jArr2[0] = jArr2[1];
        jArr2[1] = j;
    }

    public final byte[] g(int i) {
        byte[] bArr = new byte[i];
        GostDigest2012_512 gostDigest2012_512 = new GostDigest2012_512();
        synchronized (this.r) {
            int i2 = 0;
            int i3 = 0;
            while (i > 0) {
                try {
                    int min = Math.min(i, 44);
                    gostDigest2012_512.update(this.q, i2, 93);
                    byte[] digest = gostDigest2012_512.digest();
                    System.arraycopy(digest, 0, bArr, i3, min);
                    Arrays.fill(digest, (byte) 0);
                    i -= min;
                    i2 += 93;
                    i3 += 44;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return bArr;
    }

    public abstract RandomInterface getBioRandom(int i);

    public final void i() {
        synchronized (this.r) {
            this.n = false;
        }
    }

    public String toString() {
        return getClass().getName();
    }
}
