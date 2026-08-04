package com.gamericefishpro.space.h2;

import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n0 extends com.gamericefishpro.space.f2.u0 implements com.gamericefishpro.space.f2.n0, x0 {
    public s1 A;
    public boolean B;
    public boolean C;
    public boolean D;
    public final com.gamericefishpro.space.f2.i0 E = new com.gamericefishpro.space.f2.i0(0, this);
    public w1 F;
    public com.gamericefishpro.space.t.h0 G;
    public k0 y;
    public Function1 z;

    public static void w0(f1 f1Var) {
        g0 g0Var;
        f1 f1Var2 = f1Var.I;
        f0 f0Var = f1Var.H;
        if (!Intrinsics.a(f1Var2 != null ? f1Var2.H : null, f0Var)) {
            f0Var.a0.p.P.f();
            return;
        }
        a aVarB = f0Var.a0.p.B();
        if (aVarB == null || (g0Var = ((v0) aVarB).P) == null) {
            return;
        }
        g0Var.f();
    }

    @Override // com.gamericefishpro.space.f2.n0
    public final com.gamericefishpro.space.f2.m0 G(int i, int i2, Map map, Function1 function1, Function1 function2) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            com.gamericefishpro.space.e2.a.b("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new m0(i, i2, map, function1, function2, this);
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0108  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void e0(f0 f0Var, com.gamericefishpro.space.f2.m mVar) {
        char c;
        long j;
        long j2;
        long j3;
        long[] jArr;
        long[] jArr2;
        long j4;
        int i;
        char c2;
        long j5;
        long j6;
        int i2;
        int i3;
        int i4;
        com.gamericefishpro.space.t.h0 h0Var = this.G;
        char c3 = 7;
        long j7 = -9187201950435737472L;
        int i5 = 8;
        if (h0Var != null) {
            Object[] objArr = h0Var.c;
            long[] jArr3 = h0Var.a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i6 = 0;
                long j8 = 128;
                while (true) {
                    long j9 = jArr3[i6];
                    j2 = 255;
                    if ((((~j9) << c3) & j9 & j7) != j7) {
                        int i7 = 8 - ((~(i6 - length)) >>> 31);
                        int i8 = 0;
                        while (i8 < i7) {
                            if ((j9 & 255) < j8) {
                                c2 = c3;
                                com.gamericefishpro.space.t.i0 i0Var = (com.gamericefishpro.space.t.i0) objArr[(i6 << 3) + i8];
                                j5 = j7;
                                Object[] objArr2 = i0Var.b;
                                long[] jArr4 = i0Var.a;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    j6 = j8;
                                    int i9 = 0;
                                    int i10 = i5;
                                    while (true) {
                                        int i11 = length2;
                                        long j10 = jArr4[i9];
                                        jArr2 = jArr3;
                                        j4 = j9;
                                        if ((((~j10) << c2) & j10 & j5) != j5) {
                                            int i12 = 8 - ((~(i9 - i11)) >>> 31);
                                            int i13 = 0;
                                            while (i13 < i12) {
                                                if ((j10 & 255) < j6) {
                                                    int i14 = (i9 << 3) + i13;
                                                    f0 f0Var2 = (f0) ((e2) objArr2[i14]).get();
                                                    i3 = i13;
                                                    if (f0Var2 != null) {
                                                        boolean zH = f0Var2.H();
                                                        i4 = i8;
                                                        if (zH) {
                                                        }
                                                    } else {
                                                        i4 = i8;
                                                    }
                                                    i0Var.m(i14);
                                                } else {
                                                    i3 = i13;
                                                    i4 = i8;
                                                }
                                                j10 >>= i10;
                                                i13 = i3 + 1;
                                                i8 = i4;
                                            }
                                            i = i8;
                                            if (i12 != i10) {
                                                break;
                                            }
                                        } else {
                                            i = i8;
                                        }
                                        length2 = i11;
                                        if (i9 == length2) {
                                            break;
                                        }
                                        i9++;
                                        jArr3 = jArr2;
                                        j9 = j4;
                                        i8 = i;
                                        i10 = 8;
                                    }
                                } else {
                                    jArr2 = jArr3;
                                    j4 = j9;
                                    i = i8;
                                    j6 = j8;
                                }
                                i2 = 8;
                            } else {
                                jArr2 = jArr3;
                                j4 = j9;
                                i = i8;
                                c2 = c3;
                                j5 = j7;
                                j6 = j8;
                                i2 = i5;
                            }
                            i5 = i2;
                            j9 = j4 >> i2;
                            c3 = c2;
                            j7 = j5;
                            j8 = j6;
                            i8 = i + 1;
                            jArr3 = jArr2;
                        }
                        jArr = jArr3;
                        c = c3;
                        j = j7;
                        j3 = j8;
                        if (i7 != i5) {
                            break;
                        }
                    } else {
                        jArr = jArr3;
                        c = c3;
                        j = j7;
                        j3 = j8;
                    }
                    if (i6 == length) {
                        break;
                    }
                    i6++;
                    c3 = c;
                    j7 = j;
                    j8 = j3;
                    jArr3 = jArr;
                    i5 = 8;
                }
            } else {
                c = 7;
                j = -9187201950435737472L;
                j2 = 255;
                j3 = 128;
            }
        } else {
            c = 7;
            j = -9187201950435737472L;
            j2 = 255;
            j3 = 128;
        }
        com.gamericefishpro.space.t.h0 h0Var2 = this.G;
        if (h0Var2 != null) {
            long[] jArr5 = h0Var2.a;
            int length3 = jArr5.length - 2;
            if (length3 >= 0) {
                int i15 = 0;
                while (true) {
                    long j11 = jArr5[i15];
                    if ((((~j11) << c) & j11 & j) != j) {
                        int i16 = 8 - ((~(i15 - length3)) >>> 31);
                        for (int i17 = 0; i17 < i16; i17++) {
                            if ((j11 & j2) < j3) {
                                int i18 = (i15 << 3) + i17;
                                if (((com.gamericefishpro.space.t.i0) h0Var2.c[i18]).g()) {
                                    h0Var2.l(i18);
                                }
                            }
                            j11 >>= 8;
                        }
                        if (i16 != 8) {
                            break;
                        }
                    }
                    if (i15 == length3) {
                        break;
                    } else {
                        i15++;
                    }
                }
            }
        }
        com.gamericefishpro.space.t.h0 h0Var3 = this.G;
        if (h0Var3 == null) {
            h0Var3 = new com.gamericefishpro.space.t.h0();
            this.G = h0Var3;
        }
        Object objG = h0Var3.g(mVar);
        if (objG == null) {
            objG = new com.gamericefishpro.space.t.i0();
            h0Var3.m(mVar, objG);
        }
        ((com.gamericefishpro.space.t.i0) objG).k(new e2(f0Var));
    }

    public abstract int f0(com.gamericefishpro.space.f2.a aVar);

    /* JADX WARN: Multi-variable type inference failed */
    public final void h0(s1 s1Var, long j, long j2) {
        boolean z;
        char c;
        long j3;
        long j4;
        long j5;
        f0 f0Var;
        boolean z2;
        int i;
        char c2;
        long j6;
        q1 snapshotObserver;
        com.gamericefishpro.space.t.h0 h0Var = this.G;
        w1 w1Var = this.F;
        if (w1Var == null) {
            w1Var = new w1();
            this.F = w1Var;
        }
        w1 w1Var2 = w1Var;
        o1 o1Var = r0().H;
        if (o1Var != null && (snapshotObserver = ((com.gamericefishpro.space.i2.t) o1Var).getSnapshotObserver()) != null) {
            snapshotObserver.a.c(s1Var, d.i, new l0(this, j, j2, s1Var));
        }
        boolean zN = n();
        com.gamericefishpro.space.t.i0 i0Var = (com.gamericefishpro.space.t.i0) w1Var2.e;
        com.gamericefishpro.space.t.i0 i0Var2 = (com.gamericefishpro.space.t.i0) w1Var2.f;
        int i2 = w1Var2.a;
        for (int i3 = 0; i3 < i2; i3++) {
            byte b = ((byte[]) w1Var2.d)[i3];
            if (b == 3) {
                com.gamericefishpro.space.f2.m mVar = ((com.gamericefishpro.space.f2.m[]) w1Var2.b)[i3];
                Intrinsics.b(mVar);
                i0Var2.k(mVar);
            } else if (b != 0 && h0Var != null) {
                com.gamericefishpro.space.f2.m mVar2 = ((com.gamericefishpro.space.f2.m[]) w1Var2.b)[i3];
                Intrinsics.b(mVar2);
                com.gamericefishpro.space.t.i0 i0Var3 = (com.gamericefishpro.space.t.i0) h0Var.k(mVar2);
                if (i0Var3 != null) {
                    i0Var.j(i0Var3);
                }
            }
        }
        int i4 = w1Var2.a;
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            byte[] bArr = (byte[]) w1Var2.d;
            if (bArr[i6] == 2) {
                i5++;
            } else if (i5 > 0) {
                com.gamericefishpro.space.f2.m[] mVarArr = (com.gamericefishpro.space.f2.m[]) w1Var2.b;
                mVarArr[i6 - i5] = mVarArr[i6];
            }
            bArr[i6] = 2;
        }
        int i7 = w1Var2.a;
        for (int i8 = i7 - i5; i8 < i7; i8++) {
            ((com.gamericefishpro.space.f2.m[]) w1Var2.b)[i8] = null;
        }
        w1Var2.a -= i5;
        n0 n0VarT0 = t0();
        Object[] objArr = i0Var2.b;
        long[] jArr = i0Var2.a;
        int length = jArr.length - 2;
        char c3 = 7;
        long j7 = -9187201950435737472L;
        int i9 = 8;
        if (length >= 0) {
            j4 = 128;
            int i10 = 0;
            while (true) {
                long j8 = jArr[i10];
                j5 = 255;
                if ((((~j8) << c3) & j8 & j7) != j7) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    int i12 = 0;
                    while (i12 < i11) {
                        if ((j8 & 255) < 128) {
                            c2 = c3;
                            com.gamericefishpro.space.f2.m mVar3 = (com.gamericefishpro.space.f2.m) objArr[(i10 << 3) + i12];
                            j6 = j7;
                            n0 n0Var = n0VarT0 == null ? this : n0VarT0;
                            i = i9;
                            n0 n0Var2 = n0Var;
                            while (true) {
                                w1 w1Var3 = n0Var2.F;
                                if (w1Var3 != null) {
                                    z2 = zN;
                                    if (com.gamericefishpro.space.ph.v.n((com.gamericefishpro.space.f2.m[]) w1Var3.b, mVar3)) {
                                        break;
                                    } else {
                                        break;
                                    }
                                }
                                z2 = zN;
                                n0 n0VarT1 = n0Var2.t0();
                                if (n0VarT1 == null) {
                                    break;
                                }
                                n0Var2 = n0VarT1;
                                zN = z2;
                            }
                            com.gamericefishpro.space.t.h0 h0Var2 = n0Var2.G;
                            com.gamericefishpro.space.t.i0 i0Var4 = h0Var2 != null ? (com.gamericefishpro.space.t.i0) h0Var2.k(mVar3) : null;
                            if (i0Var4 != null) {
                                n0Var.x0(i0Var4);
                            }
                        } else {
                            z2 = zN;
                            i = i9;
                            c2 = c3;
                            j6 = j7;
                        }
                        j8 >>= i;
                        i12++;
                        c3 = c2;
                        j7 = j6;
                        i9 = i;
                        zN = z2;
                    }
                    z = zN;
                    c = c3;
                    j3 = j7;
                    if (i11 != i9) {
                        break;
                    }
                } else {
                    z = zN;
                    c = c3;
                    j3 = j7;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
                c3 = c;
                j7 = j3;
                zN = z;
                i9 = 8;
            }
        } else {
            z = zN;
            c = 7;
            j3 = -9187201950435737472L;
            j4 = 128;
            j5 = 255;
        }
        i0Var2.b();
        Object[] objArr2 = i0Var.b;
        long[] jArr2 = i0Var.a;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i13 = 0;
            while (true) {
                long j9 = jArr2[i13];
                if ((((~j9) << c) & j9 & j3) != j3) {
                    int i14 = 8 - ((~(i13 - length2)) >>> 31);
                    for (int i15 = 0; i15 < i14; i15++) {
                        if ((j9 & j5) < j4 && (f0Var = (f0) ((e2) objArr2[(i13 << 3) + i15]).get()) != null) {
                            if (z) {
                                f0Var.S(false);
                            } else {
                                f0Var.U(false);
                            }
                        }
                        j9 >>= 8;
                    }
                    if (i14 != 8) {
                        break;
                    }
                }
                if (i13 == length2) {
                    break;
                } else {
                    i13++;
                }
            }
        }
        i0Var.b();
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0051 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x0053 A[LOOP:0: B:11:0x001c->B:21:0x0053, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:48:0x0056 A[EDGE_INSN: B:48:0x0056->B:22:0x0056 BREAK  A[LOOP:0: B:11:0x001c->B:21:0x0053], SYNTHETIC] */
    public final void k0(com.gamericefishpro.space.f2.m0 m0Var) {
        long j;
        long j2;
        com.gamericefishpro.space.t.h0 h0Var = this.G;
        if (!this.D) {
            Function1 function1D = m0Var.d();
            if (function1D != null) {
                boolean z = this.z != function1D;
                if (z || !v0().d) {
                    j = 0;
                    j2 = 9223372034707292159L;
                } else {
                    com.gamericefishpro.space.f2.u uVarP0 = p0();
                    long jD = com.gamericefishpro.space.a.a.D(uVarP0.d(0L));
                    long jF = uVarP0.F();
                    j2 = jD;
                    j = jF;
                    z = (com.gamericefishpro.space.c3.i.a(jD, v0().e) && com.gamericefishpro.space.c3.k.a(jF, v0().i)) ? false : true;
                }
                if (z) {
                    s1 s1Var = this.A;
                    if (s1Var != null) {
                        s1Var.d = m0Var;
                    } else {
                        s1Var = new s1(m0Var, this);
                        this.A = s1Var;
                    }
                    h0(s1Var, j2, j);
                    this.z = m0Var.d();
                }
            } else if (h0Var != null) {
                Object[] objArr = h0Var.c;
                long[] jArr = h0Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j3 = jArr[i];
                        if ((((~j3) << 7) & j3 & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i != length) {
                                break;
                                break;
                            }
                            i++;
                        } else {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j3) < 128) {
                                    x0((com.gamericefishpro.space.t.i0) objArr[(i << 3) + i3]);
                                }
                                j3 >>= 8;
                            }
                            if (i2 != 8) {
                                break;
                            } else if (i != length) {
                                break;
                            } else {
                                i++;
                            }
                        }
                    }
                }
                h0Var.a();
            }
        }
    }

    public final int m0(com.gamericefishpro.space.f2.a aVar) {
        int iF0;
        if (q0() && (iF0 = f0(aVar)) != Integer.MIN_VALUE) {
            return iF0 + ((int) (aVar instanceof com.gamericefishpro.space.f2.k1 ? this.w >> 32 : this.w & 4294967295L));
        }
        return Integer.MIN_VALUE;
    }

    @Override // com.gamericefishpro.space.f2.p
    public boolean n() {
        return false;
    }

    public abstract n0 o0();

    @Override // com.gamericefishpro.space.h2.x0
    public final void p(boolean z) {
        n0 n0VarT0 = t0();
        f0 f0VarR0 = n0VarT0 != null ? n0VarT0.r0() : null;
        if (Intrinsics.a(f0VarR0, r0())) {
            this.B = z;
            return;
        }
        if ((f0VarR0 != null ? f0VarR0.a0.d : null) != b0.i) {
            if ((f0VarR0 != null ? f0VarR0.a0.d : null) != b0.v) {
                return;
            }
        }
        this.B = z;
    }

    public abstract com.gamericefishpro.space.f2.u p0();

    public abstract boolean q0();

    public abstract f0 r0();

    public abstract com.gamericefishpro.space.f2.m0 s0();

    public abstract n0 t0();

    public abstract long u0();

    public final k0 v0() {
        k0 k0Var = this.y;
        if (k0Var != null) {
            return k0Var;
        }
        k0 k0Var2 = new k0(this);
        this.y = k0Var2;
        return k0Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void x0(com.gamericefishpro.space.t.i0 i0Var) {
        f0 f0Var;
        Object[] objArr = i0Var.b;
        long[] jArr = i0Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128 && (f0Var = (f0) ((e2) objArr[(i << 3) + i3]).get()) != null) {
                        if (n()) {
                            f0Var.S(false);
                        } else {
                            f0Var.U(false);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public abstract void y0();
}
