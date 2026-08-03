package x1;

import java.util.Map;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class o0 extends v1.j0 implements v1.g0, z0 {

    /* renamed from: l, reason: collision with root package name */
    public l0 f8121l;

    /* renamed from: m, reason: collision with root package name */
    public oc.c f8122m;

    /* renamed from: n, reason: collision with root package name */
    public q1 f8123n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f8124o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f8125p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f8126q;

    /* renamed from: r, reason: collision with root package name */
    public final v1.b0 f8127r = new v1.b0(0, this);

    /* renamed from: s, reason: collision with root package name */
    public m.n f8128s;

    /* renamed from: t, reason: collision with root package name */
    public s.g0 f8129t;

    public static void n0(f1 f1Var) {
        h0 h0Var;
        f1 f1Var2 = f1Var.f8034v;
        g0 g0Var = f1Var.f8033u;
        if (!pc.j.a(f1Var2 != null ? f1Var2.f8033u : null, g0Var)) {
            g0Var.J.f8103p.C.f();
            return;
        }
        a p8 = g0Var.J.f8103p.p();
        if (p8 == null || (h0Var = ((x0) p8).C) == null) {
            return;
        }
        h0Var.f();
    }

    @Override // v1.g0
    public final v1.f0 R(int i10, int i11, Map map, oc.c cVar, oc.c cVar2) {
        if ((i10 & (-16777216)) != 0 || ((-16777216) & i11) != 0) {
            u1.a.b("Size(" + i10 + " x " + i11 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new n0(i10, i11, map, cVar, cVar2, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0175  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void T(g0 g0Var, v1.m mVar) {
        char c3;
        long j3;
        long j6;
        long j10;
        s.g0 g0Var2;
        s.g0 g0Var3;
        Object g8;
        long[] jArr;
        long[] jArr2;
        long j11;
        int i10;
        char c7;
        long j12;
        long j13;
        int i11;
        int i12;
        int i13;
        s.g0 g0Var4 = this.f8129t;
        char c10 = 7;
        long j14 = -9187201950435737472L;
        int i14 = 8;
        if (g0Var4 != null) {
            Object[] objArr = g0Var4.f6268c;
            long[] jArr3 = g0Var4.f6266a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i15 = 0;
                long j15 = 128;
                while (true) {
                    long j16 = jArr3[i15];
                    j6 = 255;
                    if ((((~j16) << c10) & j16 & j14) != j14) {
                        int i16 = 8 - ((~(i15 - length)) >>> 31);
                        int i17 = 0;
                        while (i17 < i16) {
                            if ((j16 & 255) < j15) {
                                c7 = c10;
                                s.h0 h0Var = (s.h0) objArr[(i15 << 3) + i17];
                                j12 = j14;
                                Object[] objArr2 = h0Var.f6275b;
                                long[] jArr4 = h0Var.f6274a;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    j13 = j15;
                                    int i18 = 0;
                                    int i19 = i14;
                                    while (true) {
                                        int i20 = length2;
                                        long j17 = jArr4[i18];
                                        jArr2 = jArr3;
                                        j11 = j16;
                                        if ((((~j17) << c7) & j17 & j12) != j12) {
                                            int i21 = 8 - ((~(i18 - i20)) >>> 31);
                                            int i22 = 0;
                                            while (i22 < i21) {
                                                if ((j17 & 255) < j13) {
                                                    int i23 = (i18 << 3) + i22;
                                                    g0 g0Var5 = (g0) ((a2) objArr2[i23]).get();
                                                    i12 = i22;
                                                    if (g0Var5 != null) {
                                                        boolean G = g0Var5.G();
                                                        i13 = i17;
                                                        if (G) {
                                                        }
                                                    } else {
                                                        i13 = i17;
                                                    }
                                                    h0Var.l(i23);
                                                } else {
                                                    i12 = i22;
                                                    i13 = i17;
                                                }
                                                j17 >>= i19;
                                                i22 = i12 + 1;
                                                i17 = i13;
                                            }
                                            i10 = i17;
                                            if (i21 != i19) {
                                                break;
                                            }
                                        } else {
                                            i10 = i17;
                                        }
                                        length2 = i20;
                                        if (i18 == length2) {
                                            break;
                                        }
                                        i18++;
                                        jArr3 = jArr2;
                                        j16 = j11;
                                        i17 = i10;
                                        i19 = 8;
                                    }
                                } else {
                                    jArr2 = jArr3;
                                    j11 = j16;
                                    i10 = i17;
                                    j13 = j15;
                                }
                                i11 = 8;
                            } else {
                                jArr2 = jArr3;
                                j11 = j16;
                                i10 = i17;
                                c7 = c10;
                                j12 = j14;
                                j13 = j15;
                                i11 = i14;
                            }
                            i14 = i11;
                            j16 = j11 >> i11;
                            c10 = c7;
                            j14 = j12;
                            j15 = j13;
                            i17 = i10 + 1;
                            jArr3 = jArr2;
                        }
                        jArr = jArr3;
                        c3 = c10;
                        j3 = j14;
                        j10 = j15;
                        if (i16 != i14) {
                            break;
                        }
                    } else {
                        jArr = jArr3;
                        c3 = c10;
                        j3 = j14;
                        j10 = j15;
                    }
                    if (i15 == length) {
                        break;
                    }
                    i15++;
                    c10 = c3;
                    j14 = j3;
                    j15 = j10;
                    jArr3 = jArr;
                    i14 = 8;
                }
                g0Var2 = this.f8129t;
                if (g0Var2 != null) {
                    long[] jArr5 = g0Var2.f6266a;
                    int length3 = jArr5.length - 2;
                    if (length3 >= 0) {
                        int i24 = 0;
                        while (true) {
                            long j18 = jArr5[i24];
                            if ((((~j18) << c3) & j18 & j3) != j3) {
                                int i25 = 8 - ((~(i24 - length3)) >>> 31);
                                for (int i26 = 0; i26 < i25; i26++) {
                                    if ((j18 & j6) < j10) {
                                        int i27 = (i24 << 3) + i26;
                                        if (((s.h0) g0Var2.f6268c[i27]).g()) {
                                            g0Var2.l(i27);
                                        }
                                    }
                                    j18 >>= 8;
                                }
                                if (i25 != 8) {
                                    break;
                                }
                            }
                            if (i24 == length3) {
                                break;
                            } else {
                                i24++;
                            }
                        }
                    }
                }
                g0Var3 = this.f8129t;
                if (g0Var3 == null) {
                    g0Var3 = new s.g0();
                    this.f8129t = g0Var3;
                }
                g8 = g0Var3.g(mVar);
                if (g8 == null) {
                    g8 = new s.h0();
                    g0Var3.m(mVar, g8);
                }
                ((s.h0) g8).i(new a2(g0Var));
            }
        }
        c3 = 7;
        j3 = -9187201950435737472L;
        j6 = 255;
        j10 = 128;
        g0Var2 = this.f8129t;
        if (g0Var2 != null) {
        }
        g0Var3 = this.f8129t;
        if (g0Var3 == null) {
        }
        g8 = g0Var3.g(mVar);
        if (g8 == null) {
        }
        ((s.h0) g8).i(new a2(g0Var));
    }

    public abstract int W(v1.k kVar);

    /* JADX WARN: Multi-variable type inference failed */
    public final void X(q1 q1Var, long j3, long j6) {
        char c3;
        long j10;
        long j11;
        long j12;
        g0 g0Var;
        int i10;
        char c7;
        long j13;
        o0 k02;
        o1 snapshotObserver;
        s.g0 g0Var2 = this.f8129t;
        m.n nVar = this.f8128s;
        if (nVar == null) {
            nVar = new m.n();
            this.f8128s = nVar;
        }
        m.n nVar2 = nVar;
        m1 m1Var = i0().f8053s;
        if (m1Var != null && (snapshotObserver = ((y1.r) m1Var).getSnapshotObserver()) != null) {
            snapshotObserver.a(q1Var, e.f8007i, new m0(this, j3, j6, q1Var));
        }
        boolean t3 = t();
        s.h0 h0Var = (s.h0) nVar2.f4392e;
        s.h0 h0Var2 = (s.h0) nVar2.f4393f;
        int i11 = nVar2.f4388a;
        for (int i12 = 0; i12 < i11; i12++) {
            byte b2 = ((byte[]) nVar2.f4391d)[i12];
            if (b2 == 3) {
                v1.m mVar = ((v1.m[]) nVar2.f4389b)[i12];
                pc.j.b(mVar);
                h0Var2.i(mVar);
            } else if (b2 != 0 && g0Var2 != null) {
                v1.m mVar2 = ((v1.m[]) nVar2.f4389b)[i12];
                pc.j.b(mVar2);
                s.h0 h0Var3 = (s.h0) g0Var2.k(mVar2);
                if (h0Var3 != null) {
                    h0Var.j(h0Var3);
                }
            }
        }
        int i13 = nVar2.f4388a;
        int i14 = 0;
        for (int i15 = 0; i15 < i13; i15++) {
            byte[] bArr = (byte[]) nVar2.f4391d;
            if (bArr[i15] == 2) {
                i14++;
            } else if (i14 > 0) {
                v1.m[] mVarArr = (v1.m[]) nVar2.f4389b;
                mVarArr[i15 - i14] = mVarArr[i15];
            }
            bArr[i15] = 2;
        }
        int i16 = nVar2.f4388a;
        for (int i17 = i16 - i14; i17 < i16; i17++) {
            ((v1.m[]) nVar2.f4389b)[i17] = null;
        }
        nVar2.f4388a -= i14;
        o0 k03 = k0();
        Object[] objArr = h0Var2.f6275b;
        long[] jArr = h0Var2.f6274a;
        int length = jArr.length - 2;
        char c10 = 7;
        long j14 = -9187201950435737472L;
        int i18 = 8;
        if (length >= 0) {
            j11 = 128;
            int i19 = 0;
            while (true) {
                long j15 = jArr[i19];
                j12 = 255;
                if ((((~j15) << c10) & j15 & j14) != j14) {
                    int i20 = 8 - ((~(i19 - length)) >>> 31);
                    int i21 = 0;
                    while (i21 < i20) {
                        if ((j15 & 255) < 128) {
                            c7 = c10;
                            v1.m mVar3 = (v1.m) objArr[(i19 << 3) + i21];
                            j13 = j14;
                            o0 o0Var = k03 == null ? this : k03;
                            i10 = i18;
                            o0 o0Var2 = o0Var;
                            while (true) {
                                m.n nVar3 = o0Var2.f8128s;
                                if ((nVar3 == null || bc.l.Z((v1.m[]) nVar3.f4389b, mVar3) < 0) && (k02 = o0Var2.k0()) != null) {
                                    o0Var2 = k02;
                                }
                            }
                            s.g0 g0Var3 = o0Var2.f8129t;
                            s.h0 h0Var4 = g0Var3 != null ? (s.h0) g0Var3.k(mVar3) : null;
                            if (h0Var4 != null) {
                                o0Var.o0(h0Var4);
                            }
                        } else {
                            i10 = i18;
                            c7 = c10;
                            j13 = j14;
                        }
                        j15 >>= i10;
                        i21++;
                        c10 = c7;
                        j14 = j13;
                        i18 = i10;
                    }
                    c3 = c10;
                    j10 = j14;
                    if (i20 != i18) {
                        break;
                    }
                } else {
                    c3 = c10;
                    j10 = j14;
                }
                if (i19 == length) {
                    break;
                }
                i19++;
                c10 = c3;
                j14 = j10;
                i18 = 8;
            }
        } else {
            c3 = 7;
            j10 = -9187201950435737472L;
            j11 = 128;
            j12 = 255;
        }
        h0Var2.b();
        Object[] objArr2 = h0Var.f6275b;
        long[] jArr2 = h0Var.f6274a;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i22 = 0;
            while (true) {
                long j16 = jArr2[i22];
                if ((((~j16) << c3) & j16 & j10) != j10) {
                    int i23 = 8 - ((~(i22 - length2)) >>> 31);
                    for (int i24 = 0; i24 < i23; i24++) {
                        if ((j16 & j12) < j11 && (g0Var = (g0) ((a2) objArr2[(i22 << 3) + i24]).get()) != null) {
                            if (t3) {
                                g0Var.Q(false);
                            } else {
                                g0Var.S(false);
                            }
                        }
                        j16 >>= 8;
                    }
                    if (i23 != 8) {
                        break;
                    }
                }
                if (i22 == length2) {
                    break;
                } else {
                    i22++;
                }
            }
        }
        h0Var.b();
    }

    public final void a0(v1.f0 f0Var) {
        long j3;
        long j6;
        s.g0 g0Var = this.f8129t;
        if (!this.f8126q) {
            oc.c d10 = f0Var.d();
            if (d10 != null) {
                boolean z10 = this.f8122m != d10;
                if (z10 || !m0().f8105g) {
                    j3 = 0;
                    j6 = 9223372034707292159L;
                } else {
                    v1.p g02 = g0();
                    long T = x4.f.T(g02.b(0L));
                    long E = g02.E();
                    j6 = T;
                    j3 = E;
                    z10 = (s2.i.a(T, m0().f8106h) && s2.k.a(E, m0().f8107i)) ? false : true;
                }
                if (z10) {
                    q1 q1Var = this.f8123n;
                    if (q1Var != null) {
                        q1Var.f8154g = f0Var;
                    } else {
                        q1Var = new q1(f0Var, this);
                        this.f8123n = q1Var;
                    }
                    X(q1Var, j6, j3);
                    this.f8122m = f0Var.d();
                }
            } else if (g0Var != null) {
                Object[] objArr = g0Var.f6268c;
                long[] jArr = g0Var.f6266a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i10 = 0;
                    while (true) {
                        long j10 = jArr[i10];
                        if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i11 = 8 - ((~(i10 - length)) >>> 31);
                            for (int i12 = 0; i12 < i11; i12++) {
                                if ((255 & j10) < 128) {
                                    o0((s.h0) objArr[(i10 << 3) + i12]);
                                }
                                j10 >>= 8;
                            }
                            if (i11 != 8) {
                                break;
                            }
                        }
                        if (i10 == length) {
                            break;
                        } else {
                            i10++;
                        }
                    }
                }
                g0Var.a();
            }
        }
    }

    public final int b0(v1.k kVar) {
        int W;
        if (h0() && (W = W(kVar)) != Integer.MIN_VALUE) {
            return W + ((int) (this.f7089k & 4294967295L));
        }
        return Integer.MIN_VALUE;
    }

    public abstract o0 f0();

    public abstract v1.p g0();

    public abstract boolean h0();

    public abstract g0 i0();

    @Override // x1.z0
    public final void j(boolean z10) {
        o0 k02 = k0();
        g0 i02 = k02 != null ? k02.i0() : null;
        if (pc.j.a(i02, i0())) {
            this.f8124o = z10;
            return;
        }
        if ((i02 != null ? i02.J.f8091d : null) != c0.f7982i) {
            if ((i02 != null ? i02.J.f8091d : null) != c0.f7983j) {
                return;
            }
        }
        this.f8124o = z10;
    }

    public abstract v1.f0 j0();

    public abstract o0 k0();

    public abstract long l0();

    public final l0 m0() {
        l0 l0Var = this.f8121l;
        if (l0Var != null) {
            return l0Var;
        }
        l0 l0Var2 = new l0(this);
        this.f8121l = l0Var2;
        return l0Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void o0(s.h0 h0Var) {
        g0 g0Var;
        Object[] objArr = h0Var.f6275b;
        long[] jArr = h0Var.f6274a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j3 = jArr[i10];
            if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j3) < 128 && (g0Var = (g0) ((a2) objArr[(i10 << 3) + i12]).get()) != null) {
                        if (t()) {
                            g0Var.Q(false);
                        } else {
                            g0Var.S(false);
                        }
                    }
                    j3 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    public abstract void p0();

    @Override // v1.g0
    public boolean t() {
        return false;
    }
}
