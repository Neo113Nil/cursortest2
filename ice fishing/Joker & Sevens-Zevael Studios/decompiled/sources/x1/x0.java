package x1;

import java.util.List;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class x0 extends v1.j0 implements v1.d0, a, z0 {
    public boolean A;
    public boolean B;
    public boolean F;
    public float J;
    public boolean K;
    public oc.c L;
    public float N;
    public boolean P;

    /* renamed from: l, reason: collision with root package name */
    public final k0 f8201l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f8202m;

    /* renamed from: p, reason: collision with root package name */
    public boolean f8205p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f8206q;

    /* renamed from: t, reason: collision with root package name */
    public oc.c f8209t;

    /* renamed from: u, reason: collision with root package name */
    public float f8210u;

    /* renamed from: w, reason: collision with root package name */
    public Object f8212w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f8213x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f8214y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f8215z;

    /* renamed from: n, reason: collision with root package name */
    public int f8203n = Integer.MAX_VALUE;

    /* renamed from: o, reason: collision with root package name */
    public int f8204o = Integer.MAX_VALUE;

    /* renamed from: r, reason: collision with root package name */
    public e0 f8207r = e0.f8021i;

    /* renamed from: s, reason: collision with root package name */
    public long f8208s = 0;

    /* renamed from: v, reason: collision with root package name */
    public boolean f8211v = true;
    public final h0 C = new h0(this, 0);
    public final o0.e D = new o0.e(new x0[16]);
    public boolean E = true;
    public long G = s2.b.b(0, 0, 15);
    public final w0 H = new w0(this, 1);
    public final w0 I = new w0(this, 0);
    public long M = 0;
    public final w0 O = new w0(this, 2);

    public x0(k0 k0Var) {
        this.f8201l = k0Var;
    }

    @Override // x1.a
    public final void F() {
        g0.T(this.f8201l.f8088a, false, 7);
    }

    @Override // v1.j0
    public final int I() {
        return this.f8201l.a().I();
    }

    @Override // v1.j0
    public final int K() {
        return this.f8201l.a().K();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0031 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:3:0x0007, B:5:0x0012, B:8:0x002d, B:10:0x0031, B:14:0x004d, B:16:0x0055, B:18:0x0063, B:20:0x006e, B:21:0x0072, B:22:0x0059, B:23:0x003d, B:25:0x0043, B:27:0x0047, B:28:0x0049, B:29:0x0086, B:31:0x008a, B:35:0x0092, B:36:0x0097, B:41:0x001a, B:43:0x001e, B:45:0x0022, B:47:0x002a, B:48:0x0026), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0092 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:3:0x0007, B:5:0x0012, B:8:0x002d, B:10:0x0031, B:14:0x004d, B:16:0x0055, B:18:0x0063, B:20:0x006e, B:21:0x0072, B:22:0x0059, B:23:0x003d, B:25:0x0043, B:27:0x0047, B:28:0x0049, B:29:0x0086, B:31:0x008a, B:35:0x0092, B:36:0x0097, B:41:0x001a, B:43:0x001e, B:45:0x0022, B:47:0x002a, B:48:0x0026), top: B:2:0x0007 }] */
    @Override // v1.j0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void P(long j3, float f10, oc.c cVar) {
        t0 t0Var;
        t0 t0Var2;
        boolean z10;
        v1.i0 placementScope;
        k0 k0Var = this.f8201l;
        g0 g0Var = k0Var.f8088a;
        g0 g0Var2 = k0Var.f8088a;
        boolean z11 = true;
        try {
            this.f8214y = true;
            if (s2.i.a(j3, this.f8208s)) {
                if (this.P) {
                }
                t0Var = k0Var.f8104q;
                if (t0Var != null) {
                    k0 k0Var2 = t0Var.f8166l;
                    if (f.r(k0Var2.f8088a)) {
                        z10 = true;
                    } else {
                        if (t0Var.f8176v == q0.f8152i && !k0Var2.f8089b) {
                            k0Var2.f8090c = true;
                        }
                        z10 = k0Var2.f8090c;
                    }
                    if (z10) {
                        f1 f1Var = k0Var.a().f8035w;
                        if (f1Var == null || (placementScope = f1Var.f8127r) == null) {
                            placementScope = ((y1.r) j0.a(g0Var2)).getPlacementScope();
                        }
                        t0 t0Var3 = k0Var.f8104q;
                        pc.j.b(t0Var3);
                        g0 s10 = g0Var2.s();
                        if (s10 != null) {
                            s10.J.f8095h = 0;
                        }
                        t0Var3.f8169o = Integer.MAX_VALUE;
                        v1.i0.g(placementScope, t0Var3, (int) (j3 >> 32), (int) (4294967295L & j3));
                    }
                }
                t0Var2 = k0Var.f8104q;
                if (t0Var2 != null || t0Var2.f8171q) {
                    z11 = false;
                }
                if (z11) {
                    u1.a.b("Error: Placement happened before lookahead.");
                }
                g0(j3, f10, cVar);
            }
            if (k0Var.f8098k || k0Var.f8097j || this.P) {
                this.A = true;
                this.P = false;
            }
            a0();
            t0Var = k0Var.f8104q;
            if (t0Var != null) {
            }
            t0Var2 = k0Var.f8104q;
            if (t0Var2 != null) {
            }
            z11 = false;
            if (z11) {
            }
            g0(j3, f10, cVar);
        } catch (Throwable th) {
            g0Var.W(th);
            throw null;
        }
    }

    public final List T() {
        k0 k0Var = this.f8201l;
        k0Var.f8088a.c0();
        boolean z10 = this.E;
        o0.e eVar = this.D;
        if (!z10) {
            return eVar.f();
        }
        g0 g0Var = k0Var.f8088a;
        o0.e w3 = g0Var.w();
        Object[] objArr = w3.f5134g;
        int i10 = w3.f5136i;
        for (int i11 = 0; i11 < i10; i11++) {
            g0 g0Var2 = (g0) objArr[i11];
            if (eVar.f5136i <= i11) {
                eVar.b(g0Var2.J.f8103p);
            } else {
                x0 x0Var = g0Var2.J.f8103p;
                Object[] objArr2 = eVar.f5134g;
                Object obj = objArr2[i11];
                objArr2[i11] = x0Var;
            }
        }
        eVar.l(((o0.b) g0Var.m()).f5128g.f5136i, eVar.f5136i);
        this.E = false;
        return eVar.f();
    }

    public final void W() {
        boolean z10 = this.f8213x;
        this.f8213x = true;
        g0 g0Var = this.f8201l.f8088a;
        c1 c1Var = g0Var.I;
        if (!z10) {
            c1Var.f7988c.O0();
            if (g0Var.p()) {
                g0.T(g0Var, true, 6);
            } else if (g0Var.J.f8092e) {
                g0.R(g0Var, true, 6);
            }
        }
        f1 f1Var = c1Var.f7988c.f8034v;
        for (f1 f1Var2 = c1Var.f7989d; !pc.j.a(f1Var2, f1Var) && f1Var2 != null; f1Var2 = f1Var2.f8034v) {
            if (f1Var2.N) {
                f1Var2.I0();
            }
        }
        o0.e w3 = g0Var.w();
        Object[] objArr = w3.f5134g;
        int i10 = w3.f5136i;
        for (int i11 = 0; i11 < i10; i11++) {
            g0 g0Var2 = (g0) objArr[i11];
            if (g0Var2.t() != Integer.MAX_VALUE) {
                g0Var2.J.f8103p.W();
                g0.U(g0Var2);
            }
        }
    }

    public final void X() {
        if (this.f8213x) {
            this.f8213x = false;
            k0 k0Var = this.f8201l;
            c1 c1Var = k0Var.f8088a.I;
            f1 f1Var = c1Var.f7988c.f8034v;
            for (f1 f1Var2 = c1Var.f7989d; !pc.j.a(f1Var2, f1Var) && f1Var2 != null; f1Var2 = f1Var2.f8034v) {
                y0.m D0 = f1Var2.D0(g1.g(1048576));
                if (D0 != null && (D0.f8443g.f8446j & 1048576) != 0) {
                    boolean g8 = g1.g(1048576);
                    y0.m B0 = f1Var2.B0();
                    if (g8 || (B0 = B0.f8447k) != null) {
                        for (y0.m D02 = f1Var2.D0(g8); D02 != null && (D02.f8446j & 1048576) != 0; D02 = D02.f8448l) {
                            if ((D02.f8445i & 1048576) != 0) {
                                y0.m mVar = D02;
                                o0.e eVar = null;
                                while (mVar != null) {
                                    if ((mVar.f8445i & 1048576) != 0 && (mVar instanceof m)) {
                                        int i10 = 0;
                                        for (y0.m mVar2 = ((m) mVar).f8110v; mVar2 != null; mVar2 = mVar2.f8448l) {
                                            if ((mVar2.f8445i & 1048576) != 0) {
                                                i10++;
                                                if (i10 == 1) {
                                                    mVar = mVar2;
                                                } else {
                                                    if (eVar == null) {
                                                        eVar = new o0.e(new y0.m[16]);
                                                    }
                                                    if (mVar != null) {
                                                        eVar.b(mVar);
                                                        mVar = null;
                                                    }
                                                    eVar.b(mVar2);
                                                }
                                            }
                                        }
                                        if (i10 == 1) {
                                        }
                                    }
                                    mVar = f.f(eVar);
                                }
                            }
                            if (D02 != B0) {
                            }
                        }
                    }
                }
                f1Var2.T0();
            }
            o0.e w3 = k0Var.f8088a.w();
            Object[] objArr = w3.f5134g;
            int i11 = w3.f5136i;
            for (int i12 = 0; i12 < i11; i12++) {
                ((g0) objArr[i12]).J.f8103p.X();
            }
        }
    }

    @Override // x1.a
    public final h0 a() {
        return this.C;
    }

    public final void a0() {
        k0 k0Var = this.f8201l;
        if (k0Var.f8099l > 0) {
            o0.e w3 = k0Var.f8088a.w();
            Object[] objArr = w3.f5134g;
            int i10 = w3.f5136i;
            for (int i11 = 0; i11 < i10; i11++) {
                g0 g0Var = (g0) objArr[i11];
                k0 k0Var2 = g0Var.J;
                boolean z10 = k0Var2.f8097j;
                x0 x0Var = k0Var2.f8103p;
                if ((z10 || k0Var2.f8098k) && !x0Var.A) {
                    g0Var.S(false);
                }
                x0Var.a0();
            }
        }
    }

    public final void b0() {
        this.K = true;
        k0 k0Var = this.f8201l;
        g0 s10 = k0Var.f8088a.s();
        float f10 = k().G;
        g0 g0Var = k0Var.f8088a;
        c1 c1Var = g0Var.I;
        f1 f1Var = c1Var.f7989d;
        s sVar = c1Var.f7988c;
        while (f1Var != sVar) {
            pc.j.c(f1Var, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            y yVar = (y) f1Var;
            f10 += yVar.G;
            f1Var = yVar.f8034v;
        }
        if (f10 != this.J) {
            this.J = f10;
            if (s10 != null) {
                s10.M();
            }
            if (s10 != null) {
                s10.A();
            }
        }
        if (this.f8213x) {
            g0Var.I.f7988c.O0();
        } else {
            if (s10 != null) {
                s10.A();
            }
            W();
            if (this.f8202m && s10 != null) {
                s10.S(false);
            }
        }
        if (s10 != null) {
            k0 k0Var2 = s10.J;
            if (!this.f8202m && k0Var2.f8091d == c0.f7982i) {
                if (this.f8204o != Integer.MAX_VALUE) {
                    u1.a.b("Place was called on a node which was placed already");
                }
                int i10 = k0Var2.f8096i;
                this.f8204o = i10;
                k0Var2.f8096i = i10 + 1;
            }
        } else {
            this.f8204o = 0;
        }
        r();
    }

    @Override // v1.d0
    public final v1.j0 e(long j3) {
        e0 e0Var;
        k0 k0Var = this.f8201l;
        g0 g0Var = k0Var.f8088a;
        e0 e0Var2 = g0Var.F;
        e0 e0Var3 = e0.f8021i;
        if (e0Var2 == e0Var3) {
            g0Var.e();
        }
        if (f.r(k0Var.f8088a)) {
            t0 t0Var = k0Var.f8104q;
            pc.j.b(t0Var);
            t0Var.f8170p = e0Var3;
            t0Var.e(j3);
        }
        g0 g0Var2 = k0Var.f8088a;
        g0 s10 = g0Var2.s();
        if (s10 != null) {
            k0 k0Var2 = s10.J;
            if (this.f8207r != e0Var3 && !g0Var2.H) {
                u1.a.b("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int ordinal = k0Var2.f8091d.ordinal();
            if (ordinal == 0) {
                e0Var = e0.f8019g;
            } else {
                if (ordinal != 2) {
                    throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is " + k0Var2.f8091d);
                }
                e0Var = e0.f8020h;
            }
            this.f8207r = e0Var;
        } else {
            this.f8207r = e0Var3;
        }
        h0(j3);
        return this;
    }

    public final void f0(long j3) {
        k0 k0Var = this.f8201l;
        c0 c0Var = k0Var.f8091d;
        g0 g0Var = k0Var.f8088a;
        c0 c0Var2 = c0.f7984k;
        if (c0Var != c0Var2) {
            u1.a.b("layout state is not idle before measure starts");
        }
        this.G = j3;
        c0 c0Var3 = c0.f7980g;
        k0Var.f8091d = c0Var3;
        this.f8215z = false;
        o1 snapshotObserver = ((y1.r) j0.a(g0Var)).getSnapshotObserver();
        snapshotObserver.a(g0Var, snapshotObserver.f8132c, this.H);
        if (k0Var.f8091d == c0Var3) {
            this.A = true;
            this.B = true;
            k0Var.f8091d = c0Var2;
        }
    }

    @Override // v1.j0, v1.d0
    public final Object g() {
        return this.f8212w;
    }

    public final void g0(long j3, float f10, oc.c cVar) {
        k0 k0Var = this.f8201l;
        g0 g0Var = k0Var.f8088a;
        g0 g0Var2 = k0Var.f8088a;
        if (g0Var.R) {
            u1.a.a("place is called on a deactivated node");
        }
        k0Var.f8091d = c0.f7982i;
        this.f8208s = j3;
        this.f8210u = f10;
        this.f8209t = cVar;
        this.K = false;
        m1 a6 = j0.a(g0Var2);
        if (this.A || !this.f8213x) {
            this.C.f8071e = false;
            k0Var.f(false);
            this.L = cVar;
            this.M = j3;
            this.N = f10;
            o1 snapshotObserver = ((y1.r) a6).getSnapshotObserver();
            snapshotObserver.a(g0Var2, snapshotObserver.f8135f, this.O);
        } else {
            f1 a8 = k0Var.a();
            a8.R0(s2.i.c(j3, a8.f7089k), f10, cVar);
            b0();
        }
        k0Var.f8091d = c0.f7984k;
        this.f8206q = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0054 A[Catch: all -> 0x0010, LOOP:0: B:22:0x0052->B:23:0x0054, LOOP_END, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:6:0x0013, B:9:0x0023, B:13:0x002b, B:15:0x0033, B:18:0x003c, B:21:0x0045, B:23:0x0054, B:25:0x0064, B:27:0x007e, B:29:0x0088, B:33:0x0094), top: B:2:0x0006 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h0(long j3) {
        boolean z10;
        int i10;
        int i11;
        long j6;
        k0 k0Var = this.f8201l;
        g0 g0Var = k0Var.f8088a;
        g0 g0Var2 = k0Var.f8088a;
        try {
            if (g0Var.R) {
                u1.a.a("measure is called on a deactivated node");
            }
            m1 a6 = j0.a(g0Var2);
            g0 s10 = g0Var2.s();
            boolean z11 = true;
            if (!g0Var2.H && (s10 == null || !s10.H)) {
                z10 = false;
                g0Var2.H = z10;
                if (!g0Var2.p() && s2.a.b(this.f7088j, j3)) {
                    ((y1.r) a6).l(g0Var2, false);
                    g0Var2.V();
                    return false;
                }
                this.C.f8070d = false;
                o0.e w3 = g0Var2.w();
                Object[] objArr = w3.f5134g;
                i10 = w3.f5136i;
                for (i11 = 0; i11 < i10; i11++) {
                    ((g0) objArr[i11]).J.f8103p.C.getClass();
                }
                this.f8205p = true;
                j6 = k0Var.a().f7087i;
                S(j3);
                f0(j3);
                if (s2.k.a(k0Var.a().f7087i, j6) && k0Var.a().f7085g == this.f7085g && k0Var.a().f7086h == this.f7086h) {
                    z11 = false;
                }
                Q((k0Var.a().f7086h & 4294967295L) | (k0Var.a().f7085g << 32));
                return z11;
            }
            z10 = true;
            g0Var2.H = z10;
            if (!g0Var2.p()) {
                ((y1.r) a6).l(g0Var2, false);
                g0Var2.V();
                return false;
            }
            this.C.f8070d = false;
            o0.e w32 = g0Var2.w();
            Object[] objArr2 = w32.f5134g;
            i10 = w32.f5136i;
            while (i11 < i10) {
            }
            this.f8205p = true;
            j6 = k0Var.a().f7087i;
            S(j3);
            f0(j3);
            if (s2.k.a(k0Var.a().f7087i, j6)) {
                z11 = false;
            }
            Q((k0Var.a().f7086h & 4294967295L) | (k0Var.a().f7085g << 32));
            return z11;
        } catch (Throwable th) {
            g0Var.W(th);
            throw null;
        }
    }

    @Override // x1.z0
    public final void j(boolean z10) {
        k0 k0Var = this.f8201l;
        if (z10 != k0Var.a().f8124o) {
            k0Var.a().f8124o = z10;
            this.P = true;
        }
    }

    @Override // x1.a
    public final s k() {
        return this.f8201l.f8088a.I.f7988c;
    }

    @Override // x1.a
    public final void n(wc.i iVar) {
        o0.e w3 = this.f8201l.f8088a.w();
        Object[] objArr = w3.f5134g;
        int i10 = w3.f5136i;
        for (int i11 = 0; i11 < i10; i11++) {
            iVar.invoke(((g0) objArr[i11]).J.f8103p);
        }
    }

    @Override // x1.a
    public final a p() {
        k0 k0Var;
        g0 s10 = this.f8201l.f8088a.s();
        if (s10 == null || (k0Var = s10.J) == null) {
            return null;
        }
        return k0Var.f8103p;
    }

    @Override // x1.a
    public final void r() {
        boolean z10;
        this.F = true;
        h0 h0Var = this.C;
        h0Var.h();
        boolean z11 = this.A;
        k0 k0Var = this.f8201l;
        if (z11) {
            o0.e w3 = k0Var.f8088a.w();
            Object[] objArr = w3.f5134g;
            int i10 = w3.f5136i;
            for (int i11 = 0; i11 < i10; i11++) {
                g0 g0Var = (g0) objArr[i11];
                boolean p8 = g0Var.p();
                k0 k0Var2 = g0Var.J;
                if (p8 && g0Var.q() == e0.f8019g) {
                    x0 x0Var = k0Var2.f8103p;
                    s2.a aVar = x0Var.f8205p ? new s2.a(x0Var.f7088j) : null;
                    if (aVar != null) {
                        if (g0Var.F == e0.f8021i) {
                            g0Var.e();
                        }
                        z10 = k0Var2.f8103p.h0(aVar.f6381a);
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        g0.T(k0Var.f8088a, false, 7);
                    }
                }
            }
        }
        if (this.B || (!k().f8126q && this.A)) {
            this.A = false;
            c0 c0Var = k0Var.f8091d;
            k0Var.f8091d = c0.f7982i;
            k0Var.g(false);
            g0 g0Var2 = k0Var.f8088a;
            o1 snapshotObserver = ((y1.r) j0.a(g0Var2)).getSnapshotObserver();
            snapshotObserver.a(g0Var2, snapshotObserver.f8134e, this.I);
            k0Var.f8091d = c0Var;
            if (k().f8126q && k0Var.f8097j) {
                requestLayout();
            }
            this.B = false;
        }
        if (h0Var.f8068b && h0Var.e()) {
            h0Var.g();
        }
        this.F = false;
    }

    @Override // x1.a
    public final void requestLayout() {
        this.f8201l.f8088a.S(false);
    }

    @Override // x1.a
    public final boolean s() {
        return this.f8213x;
    }
}
