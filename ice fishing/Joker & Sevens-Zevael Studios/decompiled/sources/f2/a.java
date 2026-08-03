package f2;

import android.os.Handler;
import b0.p0;
import b0.q0;
import f1.d0;
import o0.e;
import s.a0;
import s.u;
import s2.i;
import x1.c1;
import x1.f1;
import x1.g0;
import x1.l1;
import x1.x0;
import x4.f;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final q0 f2293a;

    /* renamed from: b, reason: collision with root package name */
    public final b f2294b;

    /* renamed from: c, reason: collision with root package name */
    public final a0 f2295c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2296d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2297e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2298f;

    /* renamed from: g, reason: collision with root package name */
    public y0.a f2299g;

    /* renamed from: h, reason: collision with root package name */
    public long f2300h;

    /* renamed from: i, reason: collision with root package name */
    public final p0 f2301i;

    /* renamed from: j, reason: collision with root package name */
    public final e1.a f2302j;

    public a() {
        q0 q0Var = new q0();
        q0Var.f874b = new long[192];
        q0Var.f875c = new long[192];
        this.f2293a = q0Var;
        this.f2294b = new b();
        this.f2295c = new a0();
        this.f2300h = -1L;
        this.f2301i = new p0(4, this);
        this.f2302j = new e1.a();
    }

    public static long g(g0 g0Var) {
        float[] b2;
        int i10;
        c1 c1Var = g0Var.I;
        f1 f1Var = c1Var.f7989d;
        f1 f1Var2 = c1Var.f7988c;
        long j3 = 0;
        while (f1Var2 != null && f1Var2 != f1Var) {
            l1 l1Var = f1Var2.O;
            j3 = f.Q(j3, f1Var2.F);
            f1Var2 = f1Var2.f8035w;
            if (l1Var != null && (i10 = i7.b.i((b2 = ((y1.f1) l1Var).b()))) != 3) {
                if ((i10 & 2) == 0) {
                    return 9223372034707292159L;
                }
                j3 = d0.m(b2, j3);
            }
        }
        return f.T(j3);
    }

    public static void h(g0 g0Var) {
        long j3;
        long j6 = g0Var.I.f7989d.F;
        g0 s10 = g0Var.s();
        if (s10 != null) {
            if (i.a(s10.f8043i, 9223372034707292159L)) {
                h(s10);
            }
            long j10 = s10.f8043i;
            if (!i.a(j10, 9223372034707292159L)) {
                if (s10.f8046l) {
                    j3 = g(s10);
                    s10.f8045k = j3;
                    s10.f8046l = false;
                } else {
                    j3 = s10.f8045k;
                }
                if (!i.a(j3, 9223372034707292159L)) {
                    j6 = i.c(i.c(j10, j3), j6);
                }
            }
            j6 = 9223372034707292159L;
        }
        g0Var.f8043i = j6;
    }

    public final void a() {
        boolean z10;
        long j3;
        long j6;
        long j10;
        Handler handler = y0.b.f8418a;
        long currentTimeMillis = System.currentTimeMillis();
        boolean z11 = this.f2296d;
        boolean z12 = z11 || this.f2297e;
        q0 q0Var = this.f2293a;
        b bVar = this.f2294b;
        if (z11) {
            this.f2296d = false;
            a0 a0Var = this.f2295c;
            j3 = 128;
            Object[] objArr = a0Var.f6219a;
            int i10 = a0Var.f6220b;
            for (int i11 = 0; i11 < i10; i11++) {
                ((oc.a) objArr[i11]).invoke();
            }
            long[] jArr = (long[]) q0Var.f874b;
            int i12 = q0Var.f873a;
            j6 = 255;
            for (int i13 = 0; i13 < jArr.length - 2 && i13 < i12; i13 += 3) {
                long j11 = jArr[i13 + 2];
                if ((((int) (j11 >> 61)) & 1) != 0) {
                    long j12 = jArr[i13];
                    long j13 = jArr[i13 + 1];
                    if (bVar.f2303a.b(((int) j11) & 67108863) != null) {
                        throw new ClassCastException();
                    }
                }
            }
            j10 = -9187201950435737472L;
            u uVar = bVar.f2303a;
            Object[] objArr2 = uVar.f6297c;
            long[] jArr2 = uVar.f6295a;
            int length = jArr2.length - 2;
            if (length >= 0) {
                int i14 = 0;
                while (true) {
                    long j14 = jArr2[i14];
                    z10 = z12;
                    if ((((~j14) << 7) & j14 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i15 = 8 - ((~(i14 - length)) >>> 31);
                        for (int i16 = 0; i16 < i15; i16++) {
                            if ((j14 & 255) < 128 && objArr2[(i14 << 3) + i16] != null) {
                                throw new ClassCastException();
                            }
                            j14 >>= 8;
                        }
                        if (i15 != 8) {
                            break;
                        }
                    }
                    if (i14 == length) {
                        break;
                    }
                    i14++;
                    z12 = z10;
                }
            } else {
                z10 = z12;
            }
            long[] jArr3 = (long[]) q0Var.f874b;
            int i17 = q0Var.f873a;
            for (int i18 = 0; i18 < jArr3.length - 2 && i18 < i17; i18 += 3) {
                int i19 = i18 + 2;
                jArr3[i19] = jArr3[i19] & (-2305843009213693953L);
            }
        } else {
            z10 = z12;
            j3 = 128;
            j6 = 255;
            j10 = -9187201950435737472L;
        }
        if (this.f2297e) {
            this.f2297e = false;
            u uVar2 = bVar.f2303a;
            Object[] objArr3 = uVar2.f6297c;
            long[] jArr4 = uVar2.f6295a;
            int length2 = jArr4.length - 2;
            if (length2 >= 0) {
                int i20 = 0;
                while (true) {
                    long j15 = jArr4[i20];
                    if ((((~j15) << 7) & j15 & j10) != j10) {
                        int i21 = 8 - ((~(i20 - length2)) >>> 31);
                        for (int i22 = 0; i22 < i21; i22++) {
                            if ((j15 & j6) < j3 && objArr3[(i20 << 3) + i22] != null) {
                                throw new ClassCastException();
                            }
                            j15 >>= 8;
                        }
                        if (i21 != 8) {
                            break;
                        }
                    }
                    if (i20 == length2) {
                        break;
                    } else {
                        i20++;
                    }
                }
            }
        }
        if (z10) {
            bVar.getClass();
        }
        if (this.f2298f) {
            this.f2298f = false;
            long[] jArr5 = (long[]) q0Var.f874b;
            int i23 = q0Var.f873a;
            long[] jArr6 = (long[]) q0Var.f875c;
            int i24 = 0;
            for (int i25 = 0; i25 < jArr5.length - 2 && i24 < jArr6.length - 2 && i25 < i23; i25 += 3) {
                int i26 = i25 + 2;
                if (jArr5[i26] != 2305843009213693951L) {
                    jArr6[i24] = jArr5[i25];
                    jArr6[i24 + 1] = jArr5[i25 + 1];
                    jArr6[i24 + 2] = jArr5[i26];
                    i24 += 3;
                }
            }
            q0Var.f873a = i24;
            q0Var.f874b = jArr6;
            q0Var.f875c = jArr5;
        }
        if (bVar.f2304b > currentTimeMillis) {
            return;
        }
        u uVar3 = bVar.f2303a;
        Object[] objArr4 = uVar3.f6297c;
        long[] jArr7 = uVar3.f6295a;
        int length3 = jArr7.length - 2;
        if (length3 >= 0) {
            int i27 = 0;
            while (true) {
                long j16 = jArr7[i27];
                if ((((~j16) << 7) & j16 & j10) != j10) {
                    int i28 = 8 - ((~(i27 - length3)) >>> 31);
                    for (int i29 = 0; i29 < i28; i29++) {
                        if ((j16 & j6) < j3 && objArr4[(i27 << 3) + i29] != null) {
                            throw new ClassCastException();
                        }
                        j16 >>= 8;
                    }
                    if (i28 != 8) {
                        break;
                    }
                }
                if (i27 == length3) {
                    break;
                } else {
                    i27++;
                }
            }
        }
        bVar.f2304b = -1L;
    }

    public final void b(g0 g0Var, boolean z10) {
        char c3;
        boolean z11;
        c1 c1Var = g0Var.I;
        f1 f1Var = c1Var.f7989d;
        x0 x0Var = g0Var.J.f8103p;
        int K = x0Var.K();
        float I = x0Var.I();
        e1.a aVar = this.f2302j;
        aVar.f1925a = 0.0f;
        aVar.f1926b = 0.0f;
        aVar.f1927c = K;
        aVar.f1928d = I;
        while (true) {
            c3 = ' ';
            if (f1Var == null) {
                break;
            }
            l1 l1Var = f1Var.O;
            long j3 = f1Var.F;
            long floatToRawIntBits = (Float.floatToRawIntBits((int) (j3 >> 32)) << 32) | (Float.floatToRawIntBits((int) (j3 & 4294967295L)) & 4294967295L);
            float intBitsToFloat = Float.intBitsToFloat((int) (floatToRawIntBits >> 32));
            float intBitsToFloat2 = Float.intBitsToFloat((int) (4294967295L & floatToRawIntBits));
            aVar.f1925a += intBitsToFloat;
            aVar.f1926b += intBitsToFloat2;
            aVar.f1927c += intBitsToFloat;
            aVar.f1928d += intBitsToFloat2;
            f1Var = f1Var.f8035w;
            if (l1Var != null) {
                float[] b2 = ((y1.f1) l1Var).b();
                if (!d0.k(b2)) {
                    d0.n(b2, aVar);
                }
            }
        }
        int i10 = (int) aVar.f1925a;
        int i11 = (int) aVar.f1926b;
        int i12 = (int) aVar.f1927c;
        int i13 = (int) aVar.f1928d;
        int i14 = g0Var.f8042h;
        q0 q0Var = this.f2293a;
        if (!z10) {
            int i15 = i14 & 67108863;
            long[] jArr = (long[]) q0Var.f874b;
            int i16 = q0Var.f873a;
            int i17 = 0;
            while (i17 < jArr.length - 2 && i17 < i16) {
                int i18 = i17 + 2;
                char c7 = c3;
                q0 q0Var2 = q0Var;
                long j6 = jArr[i18];
                z11 = true;
                if ((((int) j6) & 67108863) == i15) {
                    jArr[i17] = (i10 << c7) | (i11 & 4294967295L);
                    jArr[i17 + 1] = (i12 << c7) | (i13 & 4294967295L);
                    jArr[i18] = 2305843009213693952L | j6;
                    break;
                } else {
                    i17 += 3;
                    c3 = c7;
                    q0Var = q0Var2;
                }
            }
        }
        q0 q0Var3 = q0Var;
        z11 = true;
        g0 s10 = g0Var.s();
        q0Var3.e(i14, i10, i11, i12, i13, s10 != null ? s10.f8042h : -1, c1Var.d(1024), c1Var.d(16));
        this.f2296d = z11;
    }

    public final void c(g0 g0Var) {
        e w3 = g0Var.w();
        Object[] objArr = w3.f5134g;
        int i10 = w3.f5136i;
        for (int i11 = 0; i11 < i10; i11++) {
            g0 g0Var2 = (g0) objArr[i11];
            b(g0Var2, false);
            c(g0Var2);
        }
    }

    public final void d(g0 g0Var) {
        this.f2296d = true;
        int i10 = g0Var.f8042h & 67108863;
        q0 q0Var = this.f2293a;
        long[] jArr = (long[]) q0Var.f874b;
        int i11 = q0Var.f873a;
        int i12 = 0;
        while (true) {
            if (i12 >= jArr.length - 2 || i12 >= i11) {
                break;
            }
            int i13 = i12 + 2;
            long j3 = jArr[i13];
            if ((((int) j3) & 67108863) == i10) {
                jArr[i13] = 2305843009213693952L | j3;
                break;
            }
            i12 += 3;
        }
        y0.a aVar = this.f2299g;
        boolean z10 = aVar != null;
        long j6 = this.f2294b.f2304b;
        if (j6 >= 0 || !z10) {
            if (this.f2300h == j6 && z10) {
                return;
            }
            if (aVar != null) {
                Handler handler = y0.b.f8418a;
                y0.b.f8418a.removeCallbacks(aVar);
            }
            Handler handler2 = y0.b.f8418a;
            long currentTimeMillis = System.currentTimeMillis();
            long max = Math.max(j6, 16 + currentTimeMillis);
            this.f2300h = max;
            y0.a aVar2 = new y0.a(this.f2301i, 0);
            y0.b.f8418a.postDelayed(aVar2, max - currentTimeMillis);
            this.f2299g = aVar2;
        }
    }

    public final void e(g0 g0Var) {
        long g8 = g(g0Var);
        if (i.a(g8, 9223372034707292159L)) {
            c(g0Var);
            return;
        }
        g0Var.f8045k = g8;
        g0Var.f8046l = false;
        e w3 = g0Var.w();
        Object[] objArr = w3.f5134g;
        int i10 = w3.f5136i;
        for (int i11 = 0; i11 < i10; i11++) {
            f((g0) objArr[i11], false);
        }
        d(g0Var);
    }

    public final void f(g0 g0Var, boolean z10) {
        long j3;
        char c3;
        x0 x0Var = g0Var.J.f8103p;
        int K = x0Var.K();
        int I = x0Var.I();
        long j6 = g0Var.f8043i;
        long j10 = g0Var.f8044j;
        int i10 = (int) (j10 >> 32);
        int i11 = (int) (j10 & 4294967295L);
        h(g0Var);
        long j11 = g0Var.f8043i;
        if (i.a(j11, 9223372034707292159L)) {
            b(g0Var, z10);
            return;
        }
        g0Var.f8044j = (I & 4294967295L) | (K << 32);
        int i12 = (int) (j11 >> 32);
        int i13 = (int) (j11 & 4294967295L);
        int i14 = i12 + K;
        int i15 = i13 + I;
        if (!z10 && i.a(j11, j6) && i10 == K && i11 == I) {
            return;
        }
        int i16 = g0Var.f8042h;
        c1 c1Var = g0Var.I;
        q0 q0Var = this.f2293a;
        if (!z10) {
            int i17 = i16 & 67108863;
            long[] jArr = (long[]) q0Var.f874b;
            int i18 = q0Var.f873a;
            int i19 = 0;
            while (i19 < jArr.length - 2 && i19 < i18) {
                int i20 = i19 + 2;
                int i21 = i19;
                long j12 = jArr[i20];
                if ((((int) j12) & 67108863) == i17) {
                    long j13 = jArr[i21];
                    jArr[i21] = (i12 << 32) | (i13 & 4294967295L);
                    jArr[i21 + 1] = (i14 << 32) | (i15 & 4294967295L);
                    long j14 = 2305843009213693952L;
                    jArr[i20] = j12 | 2305843009213693952L;
                    if ((i12 - ((int) (j13 >> 32)) != 0) | (i13 - ((int) j13) != 0)) {
                        long j15 = -4503599560261633L;
                        char c7 = 26;
                        long[] jArr2 = (long[]) q0Var.f874b;
                        long[] jArr3 = (long[]) q0Var.f875c;
                        int i22 = q0Var.f873a / 3;
                        jArr3[0] = (j12 & (-4503599560261633L)) | (((i21 + 3) & 67108863) << 26);
                        int i23 = 1;
                        while (i23 > 0) {
                            i23--;
                            long j16 = jArr3[i23];
                            int i24 = ((int) j16) & 67108863;
                            char c10 = c7;
                            long j17 = j15;
                            int i25 = ((int) (j16 >> c10)) & 67108863;
                            char c11 = '4';
                            int i26 = (int) (j16 >> 52);
                            char c12 = 511;
                            int i27 = i26 & 511;
                            int i28 = i27 == 511 ? i22 : i27 + i25;
                            if (i25 < 0) {
                                break;
                            }
                            while (i25 < jArr2.length - 2 && i25 < i28) {
                                int i29 = i25 + 2;
                                long j18 = jArr2[i29];
                                char c13 = c11;
                                int i30 = i28;
                                if ((((int) (j18 >> c10)) & 67108863) == i24) {
                                    long j19 = jArr2[i25];
                                    int i31 = i25 + 1;
                                    j3 = j14;
                                    long j20 = jArr2[i31];
                                    jArr2[i25] = ((((int) j19) + r10) & 4294967295L) | ((((int) (j19 >> 32)) + r7) << 32);
                                    jArr2[i31] = ((((int) j20) + r10) & 4294967295L) | ((((int) (j20 >> 32)) + r7) << 32);
                                    jArr2[i29] = j18 | j3;
                                    c3 = 511;
                                    if ((((int) (j18 >> c13)) & 511) > 0) {
                                        jArr3[i23] = (((i25 + 3) & 67108863) << c10) | (j18 & j17);
                                        i23++;
                                    }
                                } else {
                                    j3 = j14;
                                    c3 = c12;
                                }
                                i25 += 3;
                                c12 = c3;
                                c11 = c13;
                                i28 = i30;
                                j14 = j3;
                            }
                            c7 = c10;
                            j15 = j17;
                            j14 = j14;
                        }
                    }
                    this.f2296d = true;
                }
                i19 = i21 + 3;
            }
        }
        g0 s10 = g0Var.s();
        q0Var.e(i16, i12, i13, i14, i15, s10 != null ? s10.f8042h : -1, c1Var.d(1024), c1Var.d(16));
        this.f2296d = true;
    }

    public final void i(g0 g0Var) {
        int i10 = g0Var.f8042h & 67108863;
        q0 q0Var = this.f2293a;
        long[] jArr = (long[]) q0Var.f874b;
        int i11 = q0Var.f873a;
        int i12 = 0;
        while (true) {
            if (i12 >= jArr.length - 2 || i12 >= i11) {
                break;
            }
            int i13 = i12 + 2;
            if ((((int) jArr[i13]) & 67108863) == i10) {
                jArr[i12] = -1;
                jArr[i12 + 1] = -1;
                jArr[i13] = 2305843009213693951L;
                break;
            }
            i12 += 3;
        }
        this.f2296d = true;
        this.f2298f = true;
    }
}
