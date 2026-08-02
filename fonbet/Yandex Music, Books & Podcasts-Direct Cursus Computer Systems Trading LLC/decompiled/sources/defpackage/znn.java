package defpackage;

import android.os.Handler;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class znn {
    public final x0 a;
    public final eud b;
    public final gpi c;
    public boolean d;
    public boolean e;
    public boolean f;
    public ti g;
    public long h;
    public final kgk i;
    public final spi j;

    public znn() {
        x0 x0Var = new x0((char) 0, 25);
        x0Var.c = new long[192];
        x0Var.d = new long[192];
        this.a = x0Var;
        this.b = new eud(1);
        this.c = new gpi();
        this.h = -1L;
        this.i = new kgk(11, this);
        this.j = new spi();
    }

    public static long g(mpf mpfVar) {
        float[] mo2getUnderlyingMatrixsQKQjiQ;
        int t;
        cr crVar = mpfVar.F;
        f8j f8jVar = (f8j) crVar.d;
        f8j f8jVar2 = (ane) crVar.c;
        long j = 0;
        while (f8jVar2 != null && f8jVar2 != f8jVar) {
            tzj tzjVar = f8jVar2.F;
            j = xv.O(j, f8jVar2.w);
            f8jVar2 = f8jVar2.n;
            if (tzjVar != null && (t = zwf.t((mo2getUnderlyingMatrixsQKQjiQ = tzjVar.mo2getUnderlyingMatrixsQKQjiQ()))) != 3) {
                if ((t & 2) == 0) {
                    return 9223372034707292159L;
                }
                j = feh.b(j, mo2getUnderlyingMatrixsQKQjiQ);
            }
        }
        return xv.Q(j);
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0138 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0139  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        char c;
        long j;
        long j2;
        long j3;
        Handler handler = ui.a;
        long currentTimeMillis = System.currentTimeMillis();
        boolean z = this.d;
        boolean z2 = z || this.e;
        x0 x0Var = this.a;
        eud eudVar = this.b;
        if (z) {
            this.d = false;
            gpi gpiVar = this.c;
            Object[] objArr = gpiVar.a;
            int i = gpiVar.b;
            for (int i2 = 0; i2 < i; i2++) {
                ((Function0) objArr[i2]).invoke();
            }
            long[] jArr = (long[]) x0Var.c;
            int i3 = x0Var.b;
            for (int i4 = 0; i4 < jArr.length - 2 && i4 < i3; i4 += 3) {
                long j4 = jArr[i4 + 2];
                if ((((int) (j4 >> 61)) & 1) != 0) {
                    long j5 = jArr[i4];
                    long j6 = jArr[i4 + 1];
                    if (((soi) eudVar.d).b(((int) j4) & 67108863) != null) {
                        l1j.f();
                        return;
                    }
                }
            }
            long[] jArr2 = (long[]) x0Var.c;
            int i5 = x0Var.b;
            for (int i6 = 0; i6 < jArr2.length - 2 && i6 < i5; i6 += 3) {
                int i7 = i6 + 2;
                jArr2[i7] = jArr2[i7] & (-2305843009213693953L);
            }
        }
        if (this.e) {
            this.e = false;
            soi soiVar = (soi) eudVar.d;
            c = 7;
            Object[] objArr2 = soiVar.c;
            long[] jArr3 = soiVar.a;
            j = 128;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i8 = 0;
                j2 = 255;
                while (true) {
                    long j7 = jArr3[i8];
                    j3 = -9187201950435737472L;
                    if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i9 = 8 - ((~(i8 - length)) >>> 31);
                        for (int i10 = 0; i10 < i9; i10++) {
                            if ((j7 & 255) < 128 && objArr2[(i8 << 3) + i10] != null) {
                                l1j.f();
                                return;
                            }
                            j7 >>= 8;
                        }
                        if (i9 != 8) {
                            break;
                        }
                    }
                    if (i8 == length) {
                        break;
                    } else {
                        i8++;
                    }
                }
                if (z2) {
                    eudVar.getClass();
                }
                if (this.f) {
                    this.f = false;
                    long[] jArr4 = (long[]) x0Var.c;
                    int i11 = x0Var.b;
                    long[] jArr5 = (long[]) x0Var.d;
                    int i12 = 0;
                    for (int i13 = 0; i13 < jArr4.length - 2 && i12 < jArr5.length - 2 && i13 < i11; i13 += 3) {
                        int i14 = i13 + 2;
                        if (jArr4[i14] != 2305843009213693951L) {
                            jArr5[i12] = jArr4[i13];
                            jArr5[i12 + 1] = jArr4[i13 + 1];
                            jArr5[i12 + 2] = jArr4[i14];
                            i12 += 3;
                        }
                    }
                    x0Var.b = i12;
                    x0Var.c = jArr5;
                    x0Var.d = jArr4;
                }
                if (eudVar.a <= currentTimeMillis) {
                    return;
                }
                soi soiVar2 = (soi) eudVar.d;
                Object[] objArr3 = soiVar2.c;
                long[] jArr6 = soiVar2.a;
                int length2 = jArr6.length - 2;
                if (length2 >= 0) {
                    int i15 = 0;
                    while (true) {
                        long j8 = jArr6[i15];
                        if ((((~j8) << c) & j8 & j3) != j3) {
                            int i16 = 8 - ((~(i15 - length2)) >>> 31);
                            for (int i17 = 0; i17 < i16; i17++) {
                                if ((j8 & j2) < j && objArr3[(i15 << 3) + i17] != null) {
                                    l1j.f();
                                    return;
                                }
                                j8 >>= 8;
                            }
                            if (i16 != 8) {
                                break;
                            }
                        }
                        if (i15 == length2) {
                            break;
                        } else {
                            i15++;
                        }
                    }
                }
                eudVar.a = -1L;
                return;
            }
        } else {
            c = 7;
            j = 128;
        }
        j2 = 255;
        j3 = -9187201950435737472L;
        if (z2) {
        }
        if (this.f) {
        }
        if (eudVar.a <= currentTimeMillis) {
        }
    }

    public final void b(mpf mpfVar, long j, boolean z) {
        boolean z2;
        f8j f8jVar = (f8j) mpfVar.F.d;
        jfh jfhVar = mpfVar.G.p;
        int i = (int) (j >> 32);
        float f = i;
        long j2 = 4294967295L;
        int i2 = (int) (j & 4294967295L);
        float a0 = i + jfhVar.a0();
        float Z = i2 + jfhVar.Z();
        spi spiVar = this.j;
        spiVar.b = f;
        spiVar.c = i2;
        spiVar.d = a0;
        spiVar.e = Z;
        while (f8jVar != null) {
            tzj tzjVar = f8jVar.F;
            long j3 = f8jVar.w;
            long floatToRawIntBits = (Float.floatToRawIntBits((int) (j3 >> 32)) << 32) | (Float.floatToRawIntBits((int) (j3 & 4294967295L)) & 4294967295L);
            float intBitsToFloat = Float.intBitsToFloat((int) (floatToRawIntBits >> 32));
            float intBitsToFloat2 = Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L));
            spiVar.b += intBitsToFloat;
            spiVar.c += intBitsToFloat2;
            spiVar.d += intBitsToFloat;
            spiVar.e += intBitsToFloat2;
            f8jVar = f8jVar.n;
            if (tzjVar != null) {
                float[] mo2getUnderlyingMatrixsQKQjiQ = tzjVar.mo2getUnderlyingMatrixsQKQjiQ();
                if (!tyf.B(mo2getUnderlyingMatrixsQKQjiQ)) {
                    feh.c(mo2getUnderlyingMatrixsQKQjiQ, spiVar);
                }
            }
        }
        int i3 = (int) spiVar.b;
        int i4 = (int) spiVar.c;
        int i5 = (int) spiVar.d;
        int i6 = (int) spiVar.e;
        int i7 = mpfVar.b;
        x0 x0Var = this.a;
        if (!z) {
            int i8 = i7 & 67108863;
            long[] jArr = (long[]) x0Var.c;
            int i9 = x0Var.b;
            int i10 = 0;
            while (i10 < jArr.length - 2 && i10 < i9) {
                int i11 = i10 + 2;
                long j4 = j2;
                long j5 = jArr[i11];
                z2 = true;
                if ((((int) j5) & 67108863) == i8) {
                    jArr[i10] = (i3 << 32) | (i4 & j4);
                    jArr[i10 + 1] = (i5 << 32) | (i6 & j4);
                    jArr[i11] = 2305843009213693952L | j5;
                    break;
                }
                i10 += 3;
                j2 = j4;
            }
        }
        z2 = true;
        mpf u = mpfVar.u();
        x0.I(x0Var, i7, i3, i4, i5, i6, u != null ? u.b : -1);
        this.d = z2;
    }

    public final void c(mpf mpfVar) {
        eqi y = mpfVar.y();
        Object[] objArr = y.a;
        int i = y.c;
        for (int i2 = 0; i2 < i; i2++) {
            mpf mpfVar2 = (mpf) objArr[i2];
            b(mpfVar2, ((f8j) mpfVar2.F.d).w, false);
            c(mpfVar2);
        }
    }

    public final void d(mpf mpfVar) {
        this.d = true;
        int i = mpfVar.b & 67108863;
        x0 x0Var = this.a;
        long[] jArr = (long[]) x0Var.c;
        int i2 = x0Var.b;
        int i3 = 0;
        while (true) {
            if (i3 >= jArr.length - 2 || i3 >= i2) {
                break;
            }
            int i4 = i3 + 2;
            long j = jArr[i4];
            if ((((int) j) & 67108863) == i) {
                jArr[i4] = 2305843009213693952L | j;
                break;
            }
            i3 += 3;
        }
        ti tiVar = this.g;
        boolean z = tiVar != null;
        long j2 = this.b.a;
        if (j2 >= 0 || !z) {
            if (this.h == j2 && z) {
                return;
            }
            if (tiVar != null) {
                Handler handler = ui.a;
                ui.a.removeCallbacks(tiVar);
            }
            Handler handler2 = ui.a;
            long currentTimeMillis = System.currentTimeMillis();
            long max = Math.max(j2, 16 + currentTimeMillis);
            this.h = max;
            ti tiVar2 = new ti(0, this.i);
            ui.a.postDelayed(tiVar2, max - currentTimeMillis);
            this.g = tiVar2;
        }
    }

    public final void e(mpf mpfVar) {
        long g = g(mpfVar);
        if (wpe.b(g, 9223372034707292159L)) {
            c(mpfVar);
            return;
        }
        mpfVar.e = g;
        mpfVar.f = false;
        eqi y = mpfVar.y();
        Object[] objArr = y.a;
        int i = y.c;
        for (int i2 = 0; i2 < i; i2++) {
            mpf mpfVar2 = (mpf) objArr[i2];
            f(mpfVar2, ((f8j) mpfVar2.F.d).w, false);
        }
        d(mpfVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r20v2 */
    /* JADX WARN: Type inference failed for: r20v6 */
    /* JADX WARN: Type inference failed for: r20v9 */
    public final void f(mpf mpfVar, long j, boolean z) {
        char c;
        long j2;
        boolean z2;
        long j3;
        boolean z3;
        ?? r20;
        char c2;
        long j4;
        char c3;
        int i;
        float[] mo2getUnderlyingMatrixsQKQjiQ;
        int t;
        jfh jfhVar = mpfVar.G.p;
        int a0 = jfhVar.a0();
        int Z = jfhVar.Z();
        mpf u = mpfVar.u();
        long j5 = mpfVar.c;
        long j6 = mpfVar.d;
        int i2 = (int) (j6 >> 32);
        int i3 = (int) (j6 & 4294967295L);
        boolean z4 = false;
        if (u != null) {
            char c4 = ' ';
            boolean z5 = u.f;
            j2 = 4294967295L;
            long j7 = u.c;
            long j8 = u.e;
            if (!wpe.b(j7, 9223372034707292159L)) {
                if (z5) {
                    j8 = g(u);
                    u.e = j8;
                    u.f = false;
                }
                z3 = wpe.b(j8, 9223372034707292159L);
                j3 = wpe.d(wpe.d(j7, j8), j);
                r20 = 0;
                c2 = c4;
                if (!z3 || wpe.b(j3, 9223372034707292159L)) {
                    b(mpfVar, j, z);
                }
                mpfVar.c = j3;
                mpfVar.d = (a0 << c2) | (Z & j2);
                int i4 = (int) (j3 >> c2);
                int i5 = (int) (j3 & j2);
                int i6 = i4 + a0;
                int i7 = i5 + Z;
                if (!z && wpe.b(j3, j5) && i2 == a0 && i3 == Z) {
                    return;
                }
                int i8 = mpfVar.b;
                x0 x0Var = this.a;
                if (!z) {
                    int i9 = 67108863;
                    int i10 = i8 & 67108863;
                    long[] jArr = (long[]) x0Var.c;
                    int i11 = x0Var.b;
                    int i12 = r20;
                    while (i12 < jArr.length - 2 && i12 < i11) {
                        int i13 = i12 + 2;
                        int i14 = i9;
                        long j9 = jArr[i13];
                        if ((((int) j9) & i14) == i10) {
                            long j10 = jArr[i12];
                            jArr[i12] = (i4 << c2) | (i5 & j2);
                            jArr[i12 + 1] = (i6 << c2) | (i7 & j2);
                            long j11 = 2305843009213693952L;
                            jArr[i13] = j9 | 2305843009213693952L;
                            if ((i4 - ((int) (j10 >> c2)) != 0 ? true : r20) | (i5 - ((int) j10) != 0 ? true : r20)) {
                                long j12 = -4503599560261633L;
                                char c5 = 26;
                                long j13 = (j9 & (-4503599560261633L)) | (((i12 + 3) & i14) << 26);
                                long[] jArr2 = (long[]) x0Var.c;
                                long[] jArr3 = (long[]) x0Var.d;
                                int i15 = x0Var.b / 3;
                                jArr3[r20] = j13;
                                int i16 = 1;
                                while (i16 > 0) {
                                    i16--;
                                    long j14 = jArr3[i16];
                                    int i17 = ((int) j14) & i14;
                                    long j15 = j12;
                                    int i18 = ((int) (j14 >> c5)) & i14;
                                    char c6 = '4';
                                    int i19 = ((int) (j14 >> 52)) & 511;
                                    int i20 = i19 == 511 ? i15 : i19 + i18;
                                    if (i18 < 0) {
                                        break;
                                    }
                                    while (i18 < jArr2.length - 2 && i18 < i20) {
                                        int i21 = i18 + 2;
                                        long j16 = jArr2[i21];
                                        char c7 = c6;
                                        int i22 = i15;
                                        if ((((int) (j16 >> c5)) & i14) == i17) {
                                            long j17 = jArr2[i18];
                                            int i23 = i18 + 1;
                                            j4 = j11;
                                            long j18 = jArr2[i23];
                                            c3 = c5;
                                            i = i20;
                                            jArr2[i18] = ((((int) j17) + r11) & j2) | ((((int) (j17 >> c2)) + r6) << c2);
                                            jArr2[i23] = ((((int) j18) + r11) & j2) | ((((int) (j18 >> c2)) + r6) << c2);
                                            jArr2[i21] = j16 | j4;
                                            if ((((int) (j16 >> c7)) & 511) > 0) {
                                                jArr3[i16] = (j16 & j15) | (((i18 + 3) & i14) << c3);
                                                i16++;
                                            }
                                        } else {
                                            j4 = j11;
                                            c3 = c5;
                                            i = i20;
                                        }
                                        i18 += 3;
                                        i15 = i22;
                                        c6 = c7;
                                        j11 = j4;
                                        c5 = c3;
                                        i20 = i;
                                    }
                                    i15 = i15;
                                    j12 = j15;
                                    j11 = j11;
                                    c5 = c5;
                                }
                            }
                            this.d = true;
                            return;
                        }
                        i12 += 3;
                        i9 = i14;
                    }
                }
                mpf u2 = mpfVar.u();
                x0.I(x0Var, i8, i4, i5, i6, i7, u2 != null ? u2.b : -1);
                this.d = true;
                return;
            }
            f8j f8jVar = (f8j) mpfVar.F.d;
            long j19 = 0;
            while (true) {
                if (f8jVar == null) {
                    z2 = z4;
                    j3 = xv.Q(j19);
                    c = c4;
                    break;
                }
                boolean z6 = z4;
                tzj tzjVar = f8jVar.F;
                j19 = xv.O(j19, f8jVar.w);
                f8jVar = f8jVar.n;
                if (tzjVar != null && (t = zwf.t((mo2getUnderlyingMatrixsQKQjiQ = tzjVar.mo2getUnderlyingMatrixsQKQjiQ()))) != 3) {
                    if ((t & 2) == 0) {
                        j3 = 9223372034707292159L;
                        c = c4;
                        z2 = z6;
                        break;
                    }
                    j19 = feh.b(j19, mo2getUnderlyingMatrixsQKQjiQ);
                }
                z4 = z6 ? 1 : 0;
            }
        } else {
            c = ' ';
            j2 = 4294967295L;
            z2 = false;
            j3 = j;
        }
        z3 = z2 ? 1 : 0;
        c2 = c;
        r20 = z2;
        if (z3) {
        }
        b(mpfVar, j, z);
    }

    public final void h(mpf mpfVar) {
        int i = mpfVar.b & 67108863;
        x0 x0Var = this.a;
        long[] jArr = (long[]) x0Var.c;
        int i2 = x0Var.b;
        int i3 = 0;
        while (true) {
            if (i3 >= jArr.length - 2 || i3 >= i2) {
                break;
            }
            int i4 = i3 + 2;
            if ((((int) jArr[i4]) & 67108863) == i) {
                jArr[i3] = -1;
                jArr[i3 + 1] = -1;
                jArr[i4] = 2305843009213693951L;
                break;
            }
            i3 += 3;
        }
        this.d = true;
        this.f = true;
    }
}
