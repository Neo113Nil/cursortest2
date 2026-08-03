package x1;

import java.util.List;
import m0.x2;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class g0 implements m0.j, n1, j {
    public static final b0 S = new b0();
    public static final a0 T = new a0();
    public static final e3.b U = new e3.b(3);
    public v1.e0 A;
    public s2.c B;
    public s2.l C;
    public y1.o1 D;
    public m0.c0 E;
    public e0 F;
    public e0 G;
    public boolean H;
    public final c1 I;
    public final k0 J;
    public v1.a0 K;
    public f1 L;
    public boolean M;
    public y0.n N;
    public y0.n O;
    public boolean P;
    public int Q;
    public boolean R;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f8041g;

    /* renamed from: h, reason: collision with root package name */
    public int f8042h;

    /* renamed from: i, reason: collision with root package name */
    public long f8043i;

    /* renamed from: j, reason: collision with root package name */
    public long f8044j;

    /* renamed from: k, reason: collision with root package name */
    public long f8045k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f8046l;

    /* renamed from: m, reason: collision with root package name */
    public g0 f8047m;

    /* renamed from: n, reason: collision with root package name */
    public int f8048n;

    /* renamed from: o, reason: collision with root package name */
    public final x4.c f8049o;

    /* renamed from: p, reason: collision with root package name */
    public o0.e f8050p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f8051q;

    /* renamed from: r, reason: collision with root package name */
    public g0 f8052r;

    /* renamed from: s, reason: collision with root package name */
    public m1 f8053s;

    /* renamed from: t, reason: collision with root package name */
    public int f8054t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f8055u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f8056v;

    /* renamed from: w, reason: collision with root package name */
    public e2.j f8057w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f8058x;

    /* renamed from: y, reason: collision with root package name */
    public final o0.e f8059y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f8060z;

    public g0(int i10) {
        this(e2.k.f1989a.addAndGet(1), (i10 & 1) == 0);
    }

    public static void R(g0 g0Var, boolean z10, int i10) {
        g0 s10;
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        boolean z11 = (i10 & 2) != 0;
        boolean z12 = (i10 & 4) != 0;
        if (g0Var.f8047m == null) {
            u1.a.b("Lookahead measure cannot be requested on a node that is not a part of the LookaheadScope");
        }
        g0Var.f8046l = true;
        m1 m1Var = g0Var.f8053s;
        if (m1Var == null || g0Var.f8055u || g0Var.f8041g) {
            return;
        }
        ((y1.r) m1Var).y(g0Var, true, z10, z11);
        if (z12) {
            t0 t0Var = g0Var.J.f8104q;
            pc.j.b(t0Var);
            k0 k0Var = t0Var.f8166l;
            g0 s11 = k0Var.f8088a.s();
            e0 e0Var = k0Var.f8088a.F;
            if (s11 == null || e0Var == e0.f8021i) {
                return;
            }
            while (s11.F == e0Var && (s10 = s11.s()) != null) {
                s11 = s10;
            }
            int ordinal = e0Var.ordinal();
            if (ordinal == 0) {
                if (s11.f8047m != null) {
                    R(s11, z10, 6);
                    return;
                } else {
                    T(s11, z10, 6);
                    return;
                }
            }
            if (ordinal != 1) {
                throw new IllegalStateException("Intrinsics isn't used by the parent");
            }
            if (s11.f8047m != null) {
                s11.Q(z10);
            } else {
                s11.S(z10);
            }
        }
    }

    public static void T(g0 g0Var, boolean z10, int i10) {
        m1 m1Var;
        g0 s10;
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        boolean z11 = (i10 & 2) != 0;
        boolean z12 = (i10 & 4) != 0;
        g0Var.f8046l = true;
        if (g0Var.f8055u || g0Var.f8041g || (m1Var = g0Var.f8053s) == null) {
            return;
        }
        ((y1.r) m1Var).y(g0Var, false, z10, z11);
        if (z12) {
            k0 k0Var = g0Var.J.f8103p.f8201l;
            g0 s11 = k0Var.f8088a.s();
            e0 e0Var = k0Var.f8088a.F;
            if (s11 == null || e0Var == e0.f8021i) {
                return;
            }
            while (s11.F == e0Var && (s10 = s11.s()) != null) {
                s11 = s10;
            }
            int ordinal = e0Var.ordinal();
            if (ordinal == 0) {
                T(s11, z10, 6);
            } else {
                if (ordinal != 1) {
                    throw new IllegalStateException("Intrinsics isn't used by the parent");
                }
                s11.S(z10);
            }
        }
    }

    public static void U(g0 g0Var) {
        k0 k0Var = g0Var.J;
        if (f0.f8032a[k0Var.f8091d.ordinal()] != 1) {
            throw new IllegalStateException("Unexpected state " + k0Var.f8091d);
        }
        if (k0Var.f8092e) {
            R(g0Var, true, 6);
            return;
        }
        if (k0Var.f8093f) {
            g0Var.Q(true);
        }
        if (g0Var.p()) {
            T(g0Var, true, 6);
        } else if (g0Var.o()) {
            g0Var.S(true);
        }
    }

    private final String j(g0 g0Var) {
        StringBuilder sb = new StringBuilder("Cannot insert ");
        sb.append(g0Var);
        sb.append(" because it already has a parent or an owner. This tree: ");
        sb.append(g(0));
        sb.append(" Other tree: ");
        g0 g0Var2 = g0Var.f8052r;
        sb.append(g0Var2 != null ? g0Var2.g(0) : null);
        return sb.toString();
    }

    public final void A() {
        if (this.M) {
            c1 c1Var = this.I;
            f1 f1Var = c1Var.f7988c;
            f1 f1Var2 = c1Var.f7989d.f8035w;
            this.L = null;
            while (true) {
                if (pc.j.a(f1Var, f1Var2)) {
                    break;
                }
                if ((f1Var != null ? f1Var.O : null) != null) {
                    this.L = f1Var;
                    break;
                }
                f1Var = f1Var != null ? f1Var.f8035w : null;
            }
        }
        f1 f1Var3 = this.L;
        if (f1Var3 != null && f1Var3.O == null) {
            throw a4.d.e("layer was not set");
        }
        if (f1Var3 != null) {
            f1Var3.I0();
            return;
        }
        g0 s10 = s();
        if (s10 != null) {
            s10.A();
        }
    }

    public final void B() {
        c1 c1Var = this.I;
        f1 f1Var = c1Var.f7989d;
        s sVar = c1Var.f7988c;
        while (f1Var != sVar) {
            pc.j.c(f1Var, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            y yVar = (y) f1Var;
            l1 l1Var = yVar.O;
            if (l1Var != null) {
                l1Var.invalidate();
            }
            f1Var = yVar.f8034v;
        }
        l1 l1Var2 = c1Var.f7988c.O;
        if (l1Var2 != null) {
            l1Var2.invalidate();
        }
    }

    public final void C() {
        if (this.f8041g) {
            g0 s10 = s();
            if (s10 != null) {
                s10.C();
                return;
            }
            return;
        }
        if (this.f8047m != null) {
            R(this, false, 7);
        } else {
            T(this, false, 7);
        }
    }

    public final void D() {
        if (s2.i.a(this.f8043i, 9223372034707292159L)) {
            return;
        }
        this.f8043i = 9223372034707292159L;
        o0.e w3 = w();
        Object[] objArr = w3.f5134g;
        int i10 = w3.f5136i;
        for (int i11 = 0; i11 < i10; i11++) {
            ((g0) objArr[i11]).D();
        }
    }

    public final void E() {
        if (this.f8058x) {
            return;
        }
        if (this.I.f7987b.f8448l != null || this.O != null) {
            this.f8056v = true;
            return;
        }
        e2.j jVar = this.f8057w;
        this.f8058x = true;
        pc.s sVar = new pc.s();
        sVar.f5683g = new e2.j();
        o1 snapshotObserver = ((y1.r) j0.a(this)).getSnapshotObserver();
        snapshotObserver.a(this, snapshotObserver.f8133d, new c1.b(7, this, sVar));
        this.f8058x = false;
        this.f8057w = (e2.j) sVar.f5683g;
        this.f8056v = false;
        y1.r rVar = (y1.r) j0.a(this);
        rVar.getSemanticsOwner().b(this, jVar);
        rVar.A();
    }

    public final void F() {
        g0 g0Var;
        if (this.f8048n > 0) {
            this.f8051q = true;
        }
        if (!this.f8041g || (g0Var = this.f8052r) == null) {
            return;
        }
        g0Var.F();
    }

    public final boolean G() {
        return this.f8053s != null;
    }

    public final boolean H() {
        return this.J.f8103p.f8213x;
    }

    public final Boolean I() {
        t0 t0Var = this.J.f8104q;
        if (t0Var != null) {
            return Boolean.valueOf(t0Var.s());
        }
        return null;
    }

    public final void J() {
        g0 s10;
        if (this.F == e0.f8021i) {
            f();
        }
        t0 t0Var = this.J.f8104q;
        pc.j.b(t0Var);
        try {
            t0Var.f8167m = true;
            if (!t0Var.f8171q) {
                u1.a.b("replace() called on item that was not placed");
            }
            t0Var.C = false;
            boolean s11 = t0Var.s();
            t0Var.b0(t0Var.f8174t, t0Var.f8175u);
            if (s11 && !t0Var.C && (s10 = t0Var.f8166l.f8088a.s()) != null) {
                s10.Q(false);
            }
            t0Var.f8167m = false;
        } catch (Throwable th) {
            t0Var.f8167m = false;
            throw th;
        }
    }

    public final void K(int i10, int i11, int i12) {
        if (i10 == i11) {
            return;
        }
        for (int i13 = 0; i13 < i12; i13++) {
            int i14 = i10 > i11 ? i10 + i13 : i10;
            int i15 = i10 > i11 ? i11 + i13 : (i11 + i12) - 2;
            x4.c cVar = this.f8049o;
            o0.e eVar = (o0.e) cVar.f8290g;
            b0.p0 p0Var = (b0.p0) cVar.f8291h;
            Object k3 = eVar.k(i14);
            p0Var.invoke();
            ((o0.e) cVar.f8290g).a(i15, (g0) k3);
            p0Var.invoke();
        }
        M();
        F();
        C();
    }

    public final void L(g0 g0Var) {
        if (g0Var.J.f8099l > 0) {
            this.J.d(r0.f8099l - 1);
        }
        if (this.f8053s != null) {
            g0Var.h();
        }
        g0Var.f8052r = null;
        if (g0Var.Q > 0) {
            Y(this.Q - 1);
        }
        g0Var.I.f7989d.f8035w = null;
        if (g0Var.f8041g) {
            this.f8048n--;
            o0.e eVar = (o0.e) g0Var.f8049o.f8290g;
            Object[] objArr = eVar.f5134g;
            int i10 = eVar.f5136i;
            for (int i11 = 0; i11 < i10; i11++) {
                ((g0) objArr[i11]).I.f7989d.f8035w = null;
            }
        }
        F();
        M();
    }

    public final void M() {
        if (!this.f8041g) {
            this.f8060z = true;
            return;
        }
        g0 s10 = s();
        if (s10 != null) {
            s10.M();
        }
    }

    public final void N() {
        x4.c cVar = this.f8049o;
        o0.e eVar = (o0.e) cVar.f8290g;
        o0.e eVar2 = (o0.e) cVar.f8290g;
        int i10 = eVar.f5136i;
        while (true) {
            i10--;
            if (-1 >= i10) {
                eVar2.g();
                ((b0.p0) cVar.f8291h).invoke();
                return;
            }
            L((g0) eVar2.f5134g[i10]);
        }
    }

    public final void O(int i10, int i11) {
        if (i11 < 0) {
            u1.a.a("count (" + i11 + ") must be greater than 0");
        }
        int i12 = (i11 + i10) - 1;
        if (i10 > i12) {
            return;
        }
        while (true) {
            x4.c cVar = this.f8049o;
            L((g0) ((o0.e) cVar.f8290g).f5134g[i12]);
            Object k3 = ((o0.e) cVar.f8290g).k(i12);
            ((b0.p0) cVar.f8291h).invoke();
            if (i12 == i10) {
                return;
            } else {
                i12--;
            }
        }
    }

    public final void P() {
        g0 s10;
        if (this.F == e0.f8021i) {
            f();
        }
        x0 x0Var = this.J.f8103p;
        k0 k0Var = x0Var.f8201l;
        try {
            x0Var.f8202m = true;
            if (!x0Var.f8206q) {
                u1.a.b("replace called on unplaced item");
            }
            boolean z10 = x0Var.f8213x;
            x0Var.g0(x0Var.f8208s, x0Var.f8210u, x0Var.f8209t);
            if (z10 && !x0Var.K && (s10 = k0Var.f8088a.s()) != null) {
                s10.S(false);
            }
        } finally {
        }
    }

    public final void Q(boolean z10) {
        m1 m1Var;
        this.f8046l = true;
        if (this.f8041g || (m1Var = this.f8053s) == null) {
            return;
        }
        ((y1.r) m1Var).z(this, true, z10);
    }

    public final void S(boolean z10) {
        m1 m1Var;
        this.f8046l = true;
        if (this.f8041g || (m1Var = this.f8053s) == null) {
            return;
        }
        ((y1.r) m1Var).z(this, false, z10);
    }

    public final void V() {
        o0.e w3 = w();
        Object[] objArr = w3.f5134g;
        int i10 = w3.f5136i;
        for (int i11 = 0; i11 < i10; i11++) {
            g0 g0Var = (g0) objArr[i11];
            e0 e0Var = g0Var.G;
            g0Var.F = e0Var;
            if (e0Var != e0.f8021i) {
                g0Var.V();
            }
        }
    }

    public final void W(Throwable th) {
        m0.c0 c0Var = this.E;
        x2 x2Var = x0.c.f7964a;
        u0.i iVar = (u0.i) c0Var;
        iVar.getClass();
        x0.b bVar = (x0.b) m0.z.t(iVar, x2Var);
        if (bVar == null) {
            throw th;
        }
        u5.d.l(th, new m0.y1(5, bVar, this));
        throw th;
    }

    public final void X(s2.c cVar) {
        if (pc.j.a(this.B, cVar)) {
            return;
        }
        this.B = cVar;
        C();
        g0 s10 = s();
        if (s10 != null) {
            s10.A();
        }
        B();
        for (y0.m mVar = this.I.f7991f; mVar != null; mVar = mVar.f8448l) {
            mVar.a();
        }
    }

    public final void Y(int i10) {
        g0 s10;
        g0 s11;
        int i11 = this.Q;
        if (i11 != i10) {
            if (i10 > 0 && i11 == 0 && (s11 = s()) != null) {
                s11.Y(s11.Q + 1);
            }
            if (i10 == 0 && this.Q > 0 && (s10 = s()) != null) {
                s10.Y(s10.Q - 1);
            }
            this.Q = i10;
        }
    }

    public final void Z(g0 g0Var) {
        if (pc.j.a(g0Var, this.f8047m)) {
            return;
        }
        this.f8047m = g0Var;
        k0 k0Var = this.J;
        if (g0Var != null) {
            if (k0Var.f8104q == null) {
                k0Var.f8104q = new t0(k0Var);
            }
            c1 c1Var = this.I;
            f1 f1Var = c1Var.f7988c.f8034v;
            for (f1 f1Var2 = c1Var.f7989d; !pc.j.a(f1Var2, f1Var) && f1Var2 != null; f1Var2 = f1Var2.f8034v) {
                f1Var2.w0();
            }
        } else {
            k0Var.f8104q = null;
            k0Var.f8093f = false;
            k0Var.f8092e = false;
        }
        C();
    }

    @Override // m0.j
    public final void a() {
        v1.a0 a0Var = this.K;
        if (a0Var != null) {
            a0Var.a();
        }
        c1 c1Var = this.I;
        f1 f1Var = c1Var.f7988c.f8034v;
        for (f1 f1Var2 = c1Var.f7989d; !pc.j.a(f1Var2, f1Var) && f1Var2 != null; f1Var2 = f1Var2.f8034v) {
            f1Var2.f8036x = true;
            f1Var2.M.invoke();
            f1Var2.T0();
        }
    }

    public final void a0(y0.n nVar) {
        if (this.f8041g && this.N != y0.k.f8442a) {
            u1.a.a("Modifiers are not supported on virtual LayoutNodes");
        }
        if (this.R) {
            u1.a.a("modifier is updated when deactivated");
        }
        if (!G()) {
            this.O = nVar;
            return;
        }
        c(nVar);
        if (this.f8056v) {
            E();
        }
    }

    @Override // m0.j
    public final void b() {
        v1.a0 a0Var = this.K;
        if (a0Var != null) {
            a0Var.e(true);
        }
        this.R = true;
        y0.m mVar = this.I.f7990e;
        for (y0.m mVar2 = mVar; mVar2 != null; mVar2 = mVar2.f8447k) {
            if (mVar2.f8456t) {
                mVar2.m0();
            }
        }
        for (y0.m mVar3 = mVar; mVar3 != null; mVar3 = mVar3.f8447k) {
            if (mVar3.f8456t) {
                mVar3.o0();
            }
        }
        while (mVar != null) {
            if (mVar.f8456t) {
                mVar.i0();
            }
            mVar = mVar.f8447k;
        }
        if (G()) {
            this.f8057w = null;
            this.f8056v = false;
        }
        m1 m1Var = this.f8053s;
        if (m1Var != null) {
            y1.r rVar = (y1.r) m1Var;
            rVar.getRectManager().i(this);
            z0.b bVar = rVar.K;
            if (bVar == null || !bVar.f9056g.e(this.f8042h)) {
                return;
            }
            bVar.f9050a.q(bVar.f9052c, this.f8042h, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [y0.m] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [y0.m] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [o0.e] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [o0.e] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    public final void b0(y1.o1 o1Var) {
        if (pc.j.a(this.D, o1Var)) {
            return;
        }
        this.D = o1Var;
        y0.m mVar = this.I.f7991f;
        if ((mVar.f8446j & 16) != 0) {
            while (mVar != null) {
                if ((mVar.f8445i & 16) != 0) {
                    m mVar2 = mVar;
                    ?? r32 = 0;
                    while (mVar2 != 0) {
                        if (mVar2 instanceof r1) {
                            ((r1) mVar2).M();
                        } else if ((mVar2.f8445i & 16) != 0 && (mVar2 instanceof m)) {
                            y0.m mVar3 = mVar2.f8110v;
                            int i10 = 0;
                            mVar2 = mVar2;
                            r32 = r32;
                            while (mVar3 != null) {
                                if ((mVar3.f8445i & 16) != 0) {
                                    i10++;
                                    r32 = r32;
                                    if (i10 == 1) {
                                        mVar2 = mVar3;
                                    } else {
                                        if (r32 == 0) {
                                            r32 = new o0.e(new y0.m[16]);
                                        }
                                        if (mVar2 != 0) {
                                            r32.b(mVar2);
                                            mVar2 = 0;
                                        }
                                        r32.b(mVar3);
                                    }
                                }
                                mVar3 = mVar3.f8448l;
                                mVar2 = mVar2;
                                r32 = r32;
                            }
                            if (i10 == 1) {
                            }
                        }
                        mVar2 = f.f(r32);
                    }
                }
                if ((mVar.f8446j & 16) == 0) {
                    return;
                } else {
                    mVar = mVar.f8448l;
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v3, types: [x1.f1, y0.m] */
    public final void c(y0.n nVar) {
        ?? r72;
        c1 c1Var;
        b1 b1Var;
        o0.e eVar;
        boolean z10;
        boolean z11;
        boolean z12;
        o0.e eVar2;
        boolean z13;
        wc.i iVar;
        c1 c1Var2 = this.I;
        boolean d10 = c1Var2.d(16);
        y0.m mVar = c1Var2.f7990e;
        boolean d11 = c1Var2.d(1024);
        this.N = nVar;
        s sVar = c1Var2.f7988c;
        g0 g0Var = c1Var2.f7986a;
        y0.m mVar2 = c1Var2.f7991f;
        b1 b1Var2 = c1Var2.f7987b;
        if (mVar2 == b1Var2) {
            u1.a.b("padChain called on already padded chain");
        }
        y0.m mVar3 = c1Var2.f7991f;
        mVar3.f8447k = b1Var2;
        b1Var2.f8448l = mVar3;
        o0.e eVar3 = c1Var2.f7992g;
        int i10 = eVar3 != null ? eVar3.f5136i : 0;
        o0.e eVar4 = c1Var2.f7993h;
        if (eVar4 == null) {
            eVar4 = new o0.e(new y0.l[16]);
        }
        o0.e eVar5 = c1Var2.f7994i;
        eVar5.b(nVar);
        wc.i iVar2 = null;
        while (true) {
            int i11 = eVar5.f5136i;
            if (i11 == 0) {
                break;
            }
            y0.n nVar2 = (y0.n) eVar5.k(i11 - 1);
            if (nVar2 instanceof y0.h) {
                y0.h hVar = (y0.h) nVar2;
                eVar5.b(hVar.f8439b);
                eVar5.b(hVar.f8438a);
            } else if (nVar2 instanceof y0.l) {
                eVar4.b(nVar2);
            } else {
                if (iVar2 == null) {
                    iVar = new wc.i(4, eVar4);
                    iVar2 = iVar;
                } else {
                    iVar = iVar2;
                }
                nVar2.a(iVar);
            }
        }
        int i12 = eVar4.f5136i;
        if (i12 == i10) {
            y0.m mVar4 = b1Var2.f8448l;
            int i13 = 0;
            while (mVar4 != null && i13 < i10) {
                if (eVar3 == null) {
                    throw a4.d.e("expected prior modifier list to be non-empty");
                }
                y0.l lVar = (y0.l) eVar3.f5134g[i13];
                y0.l lVar2 = (y0.l) eVar4.f5134g[i13];
                if (pc.j.a(lVar, lVar2)) {
                    eVar2 = eVar3;
                    z13 = 2;
                } else {
                    eVar2 = eVar3;
                    z13 = lVar.getClass() == lVar2.getClass();
                }
                if (!z13) {
                    mVar4 = mVar4.f8447k;
                    break;
                }
                if (z13) {
                    c1.h(lVar, lVar2, mVar4);
                }
                mVar4 = mVar4.f8448l;
                i13++;
                eVar3 = eVar2;
            }
            eVar2 = eVar3;
            if (i13 >= i10) {
                c1Var2 = c1Var2;
                eVar3 = eVar2;
                z11 = false;
                c1Var = c1Var2;
                b1Var = b1Var2;
                eVar = eVar4;
                z10 = false;
                r72 = z11;
            } else {
                if (eVar2 == null) {
                    throw a4.d.e("expected prior modifier list to be non-empty");
                }
                if (mVar4 == null) {
                    throw a4.d.e("structuralUpdate requires a non-null tail");
                }
                boolean z14 = g0Var.O != null;
                y0.m mVar5 = mVar4;
                c1Var = c1Var2;
                eVar = eVar4;
                eVar3 = eVar2;
                z12 = false;
                c1Var.f(i13, eVar3, eVar, mVar5, !z14);
                b1Var = b1Var2;
                z10 = true;
                r72 = z12;
            }
        } else {
            r72 = 0;
            z12 = false;
            z11 = false;
            y0.n nVar3 = g0Var.O;
            if (nVar3 != null && i10 == 0) {
                y0.m mVar6 = b1Var2;
                for (int i14 = 0; i14 < eVar4.f5136i; i14++) {
                    mVar6 = c1.b((y0.l) eVar4.f5134g[i14], mVar6);
                }
                int i15 = 0;
                for (y0.m mVar7 = mVar.f8447k; mVar7 != null && mVar7 != b1Var2; mVar7 = mVar7.f8447k) {
                    i15 |= mVar7.f8445i;
                    mVar7.f8446j = i15;
                }
                c1Var = c1Var2;
                b1Var = b1Var2;
                eVar = eVar4;
                z10 = true;
                r72 = z12;
            } else if (i12 != 0) {
                if (eVar3 == null) {
                    eVar3 = new o0.e(new y0.l[16]);
                }
                c1Var = c1Var2;
                b1Var = b1Var2;
                eVar = eVar4;
                c1Var.f(0, eVar3, eVar, b1Var, !(nVar3 != null));
                z10 = true;
            } else {
                if (eVar3 == null) {
                    throw a4.d.e("expected prior modifier list to be non-empty");
                }
                y0.m mVar8 = b1Var2.f8448l;
                for (int i16 = 0; mVar8 != null && i16 < eVar3.f5136i; i16++) {
                    mVar8 = c1.c(mVar8).f8448l;
                }
                g0 s10 = g0Var.s();
                sVar.f8035w = s10 != null ? s10.I.f7988c : null;
                c1Var2.f7989d = sVar;
                c1Var = c1Var2;
                b1Var = b1Var2;
                eVar = eVar4;
                z10 = false;
                r72 = z11;
            }
        }
        c1Var.f7992g = eVar;
        if (eVar3 != null) {
            eVar3.g();
        } else {
            eVar3 = r72;
        }
        c1Var.f7993h = eVar3;
        y0.m mVar9 = b1Var.f8448l;
        if (mVar9 != null) {
            mVar = mVar9;
        }
        mVar.f8447k = r72;
        b1Var.f8448l = r72;
        b1Var.f8446j = -1;
        b1Var.f8450n = r72;
        if (mVar == b1Var) {
            u1.a.b("trimChain did not update the head");
        }
        c1Var.f7991f = mVar;
        if (z10) {
            c1Var.g();
        }
        boolean d12 = c1Var.d(16);
        boolean d13 = c1Var.d(1024);
        this.J.j();
        if (this.f8047m == null && c1Var.d(512)) {
            Z(this);
        }
        if (d10 == d12 && d11 == d13) {
            return;
        }
        f2.a rectManager = ((y1.r) j0.a(this)).getRectManager();
        rectManager.getClass();
        if (G()) {
            b0.q0 q0Var = rectManager.f2293a;
            int i17 = this.f8042h & 67108863;
            long[] jArr = (long[]) q0Var.f874b;
            int i18 = q0Var.f873a;
            for (int i19 = 0; i19 < jArr.length - 2 && i19 < i18; i19 += 3) {
                int i20 = i19 + 2;
                long j3 = jArr[i20];
                if ((((int) j3) & 67108863) == i17) {
                    jArr[i20] = ((d12 ? 1L : 0L) * Long.MIN_VALUE) | (4611686018427387903L & j3) | ((d13 ? 1L : 0L) * 4611686018427387904L);
                    return;
                }
            }
        }
    }

    public final void c0() {
        if (this.f8048n <= 0 || !this.f8051q) {
            return;
        }
        this.f8051q = false;
        o0.e eVar = this.f8050p;
        if (eVar == null) {
            eVar = new o0.e(new g0[16]);
            this.f8050p = eVar;
        }
        eVar.g();
        o0.e eVar2 = (o0.e) this.f8049o.f8290g;
        Object[] objArr = eVar2.f5134g;
        int i10 = eVar2.f5136i;
        for (int i11 = 0; i11 < i10; i11++) {
            g0 g0Var = (g0) objArr[i11];
            if (g0Var.f8041g) {
                eVar.d(eVar.f5136i, g0Var.w());
            } else {
                eVar.b(g0Var);
            }
        }
        k0 k0Var = this.J;
        k0Var.f8103p.E = true;
        t0 t0Var = k0Var.f8104q;
        if (t0Var != null) {
            t0Var.f8179y = true;
        }
    }

    public final void d(m1 m1Var) {
        g0 g0Var;
        e2.j u10;
        if (this.f8053s != null) {
            u1.a.b("Cannot attach " + this + " as it already is attached.  Tree: " + g(0));
        }
        g0 g0Var2 = this.f8052r;
        if (g0Var2 != null && !pc.j.a(g0Var2.f8053s, m1Var)) {
            StringBuilder sb = new StringBuilder("Attaching to a different owner(");
            sb.append(m1Var);
            sb.append(") than the parent's owner(");
            g0 s10 = s();
            sb.append(s10 != null ? s10.f8053s : null);
            sb.append("). This tree: ");
            sb.append(g(0));
            sb.append(" Parent tree: ");
            g0 g0Var3 = this.f8052r;
            sb.append(g0Var3 != null ? g0Var3.g(0) : null);
            u1.a.b(sb.toString());
        }
        g0 s11 = s();
        k0 k0Var = this.J;
        if (s11 == null) {
            k0Var.f8103p.f8213x = true;
            t0 t0Var = k0Var.f8104q;
            if (t0Var != null) {
                t0Var.f8176v = q0.f8150g;
            }
        }
        c1 c1Var = this.I;
        c1Var.f7989d.f8035w = s11 != null ? s11.I.f7988c : null;
        this.f8053s = m1Var;
        this.f8054t = (s11 != null ? s11.f8054t : -1) + 1;
        y0.n nVar = this.O;
        if (nVar != null) {
            c(nVar);
        }
        this.O = null;
        y1.r rVar = (y1.r) m1Var;
        rVar.getLayoutNodes().h(this.f8042h, this);
        g0 g0Var4 = this.f8052r;
        if (g0Var4 == null || (g0Var = g0Var4.f8047m) == null) {
            g0Var = this.f8047m;
        }
        Z(g0Var);
        if (this.f8047m == null && c1Var.d(512)) {
            Z(this);
        }
        if (!this.R) {
            for (y0.m mVar = c1Var.f7991f; mVar != null; mVar = mVar.f8448l) {
                mVar.h0();
            }
        }
        o0.e eVar = (o0.e) this.f8049o.f8290g;
        Object[] objArr = eVar.f5134g;
        int i10 = eVar.f5136i;
        for (int i11 = 0; i11 < i10; i11++) {
            ((g0) objArr[i11]).d(m1Var);
        }
        if (!this.R) {
            c1Var.e();
        }
        C();
        if (s11 != null) {
            s11.C();
        }
        k0Var.j();
        if (!this.R && c1Var.d(8)) {
            E();
        }
        z0.b bVar = rVar.K;
        if (bVar == null || (u10 = u()) == null || !u10.f1985g.b(e2.s.f2041q)) {
            return;
        }
        bVar.f9056g.a(this.f8042h);
        bVar.f9050a.q(bVar.f9052c, this.f8042h, true);
    }

    public final void e() {
        this.G = this.F;
        this.F = e0.f8021i;
        o0.e w3 = w();
        Object[] objArr = w3.f5134g;
        int i10 = w3.f5136i;
        for (int i11 = 0; i11 < i10; i11++) {
            g0 g0Var = (g0) objArr[i11];
            if (g0Var.F != e0.f8021i) {
                g0Var.e();
            }
        }
    }

    public final void f() {
        this.G = this.F;
        this.F = e0.f8021i;
        o0.e w3 = w();
        Object[] objArr = w3.f5134g;
        int i10 = w3.f5136i;
        for (int i11 = 0; i11 < i10; i11++) {
            g0 g0Var = (g0) objArr[i11];
            if (g0Var.F == e0.f8020h) {
                g0Var.f();
            }
        }
    }

    public final String g(int i10) {
        StringBuilder sb = new StringBuilder();
        for (int i11 = 0; i11 < i10; i11++) {
            sb.append("  ");
        }
        sb.append("|-");
        sb.append(toString());
        sb.append('\n');
        o0.e w3 = w();
        Object[] objArr = w3.f5134g;
        int i12 = w3.f5136i;
        for (int i13 = 0; i13 < i12; i13++) {
            sb.append(((g0) objArr[i13]).g(i10 + 1));
        }
        String sb2 = sb.toString();
        if (i10 != 0) {
            return sb2;
        }
        String substring = sb2.substring(0, sb2.length() - 1);
        pc.j.d(substring, "substring(...)");
        return substring;
    }

    public final void h() {
        h0 h0Var;
        m1 m1Var = this.f8053s;
        if (m1Var == null) {
            StringBuilder sb = new StringBuilder("Cannot detach node that is already detached!  Tree: ");
            g0 s10 = s();
            sb.append(s10 != null ? s10.g(0) : null);
            u1.a.c(sb.toString());
            throw new ac.d();
        }
        g0 s11 = s();
        k0 k0Var = this.J;
        if (s11 != null) {
            s11.A();
            s11.C();
            x0 x0Var = k0Var.f8103p;
            e0 e0Var = e0.f8021i;
            x0Var.f8207r = e0Var;
            t0 t0Var = k0Var.f8104q;
            if (t0Var != null) {
                t0Var.f8170p = e0Var;
            }
        }
        h0 h0Var2 = k0Var.f8103p.C;
        h0Var2.f8068b = true;
        h0Var2.f8069c = false;
        h0Var2.f8070d = false;
        h0Var2.f8071e = false;
        h0Var2.f8072f = null;
        t0 t0Var2 = k0Var.f8104q;
        if (t0Var2 != null && (h0Var = t0Var2.f8177w) != null) {
            h0Var.f8068b = true;
            h0Var.f8069c = false;
            h0Var.f8070d = false;
            h0Var.f8071e = false;
            h0Var.f8072f = null;
        }
        c1 c1Var = this.I;
        y0.m mVar = c1Var.f7990e;
        f1 f1Var = c1Var.f7988c.f8034v;
        for (f1 f1Var2 = c1Var.f7989d; !pc.j.a(f1Var2, f1Var) && f1Var2 != null; f1Var2 = f1Var2.f8034v) {
            f1Var2.T0();
        }
        for (y0.m mVar2 = mVar; mVar2 != null; mVar2 = mVar2.f8447k) {
            if (mVar2.f8456t) {
                mVar2.o0();
            }
        }
        this.f8055u = true;
        o0.e eVar = (o0.e) this.f8049o.f8290g;
        Object[] objArr = eVar.f5134g;
        int i10 = eVar.f5136i;
        for (int i11 = 0; i11 < i10; i11++) {
            ((g0) objArr[i11]).h();
        }
        this.f8055u = false;
        while (mVar != null) {
            if (mVar.f8456t) {
                mVar.i0();
            }
            mVar = mVar.f8447k;
        }
        y1.r rVar = (y1.r) m1Var;
        rVar.getLayoutNodes().g(this.f8042h);
        v0 v0Var = rVar.T;
        a5.c cVar = v0Var.f8190b;
        ((m7.g) cVar.f262h).u(this);
        ((m7.g) cVar.f261g).u(this);
        ((m7.g) cVar.f263i).u(this);
        ((o0.e) v0Var.f8193e.f8294g).j(this);
        rVar.L = true;
        rVar.getRectManager().i(this);
        z0.b bVar = rVar.K;
        if (bVar != null && bVar.f9056g.e(this.f8042h)) {
            bVar.f9050a.q(bVar.f9052c, this.f8042h, false);
        }
        this.f8053s = null;
        this.f8043i = 9223372034707292159L;
        Z(null);
        this.f8054t = 0;
        x0 x0Var2 = k0Var.f8103p;
        x0Var2.f8204o = Integer.MAX_VALUE;
        x0Var2.f8203n = Integer.MAX_VALUE;
        x0Var2.f8213x = false;
        t0 t0Var3 = k0Var.f8104q;
        if (t0Var3 != null) {
            t0Var3.f8169o = Integer.MAX_VALUE;
            t0Var3.f8168n = Integer.MAX_VALUE;
            t0Var3.f8176v = q0.f8152i;
        }
        if (c1Var.d(8)) {
            e2.j jVar = this.f8057w;
            this.f8057w = null;
            this.f8056v = false;
            rVar.getSemanticsOwner().b(this, jVar);
            rVar.A();
        }
    }

    public final void i(f1.o oVar, i1.b bVar) {
        try {
            this.I.f7989d.u0(oVar, bVar);
        } catch (Throwable th) {
            W(th);
            throw null;
        }
    }

    public final void k() {
        if (this.f8047m != null) {
            R(this, false, 5);
        } else {
            T(this, false, 5);
        }
        x0 x0Var = this.J.f8103p;
        s2.a aVar = x0Var.f8205p ? new s2.a(x0Var.f7088j) : null;
        if (aVar != null) {
            m1 m1Var = this.f8053s;
            if (m1Var != null) {
                ((y1.r) m1Var).u(this, aVar.f6381a);
                return;
            }
            return;
        }
        m1 m1Var2 = this.f8053s;
        if (m1Var2 != null) {
            ((y1.r) m1Var2).t(true);
        }
    }

    public final List l() {
        t0 t0Var = this.J.f8104q;
        pc.j.b(t0Var);
        o0.e eVar = t0Var.f8178x;
        k0 k0Var = t0Var.f8166l;
        k0Var.f8088a.m();
        if (!t0Var.f8179y) {
            return eVar.f();
        }
        g0 g0Var = k0Var.f8088a;
        o0.e w3 = g0Var.w();
        Object[] objArr = w3.f5134g;
        int i10 = w3.f5136i;
        for (int i11 = 0; i11 < i10; i11++) {
            g0 g0Var2 = (g0) objArr[i11];
            if (eVar.f5136i <= i11) {
                t0 t0Var2 = g0Var2.J.f8104q;
                pc.j.b(t0Var2);
                eVar.b(t0Var2);
            } else {
                t0 t0Var3 = g0Var2.J.f8104q;
                pc.j.b(t0Var3);
                Object[] objArr2 = eVar.f5134g;
                Object obj = objArr2[i11];
                objArr2[i11] = t0Var3;
            }
        }
        eVar.l(((o0.b) g0Var.m()).f5128g.f5136i, eVar.f5136i);
        t0Var.f8179y = false;
        return eVar.f();
    }

    public final List m() {
        return w().f();
    }

    public final List n() {
        return ((o0.e) this.f8049o.f8290g).f();
    }

    public final boolean o() {
        return this.J.f8103p.A;
    }

    public final boolean p() {
        return this.J.f8103p.f8215z;
    }

    public final e0 q() {
        return this.J.f8103p.f8207r;
    }

    public final e0 r() {
        e0 e0Var;
        t0 t0Var = this.J.f8104q;
        return (t0Var == null || (e0Var = t0Var.f8170p) == null) ? e0.f8021i : e0Var;
    }

    public final g0 s() {
        g0 g0Var = this.f8052r;
        while (g0Var != null && g0Var.f8041g) {
            g0Var = g0Var.f8052r;
        }
        return g0Var;
    }

    public final int t() {
        return this.J.f8103p.f8204o;
    }

    public final String toString() {
        return y1.e0.w(this) + " children: " + ((o0.b) m()).f5128g.f5136i + " measurePolicy: " + this.A + " deactivated: " + this.R;
    }

    public final e2.j u() {
        if (G() && !this.R && this.I.d(8)) {
            return this.f8057w;
        }
        return null;
    }

    public final o0.e v() {
        boolean z10 = this.f8060z;
        o0.e eVar = this.f8059y;
        if (z10) {
            eVar.g();
            eVar.d(eVar.f5136i, w());
            bc.l.b0(eVar.f5134g, U, 0, eVar.f5136i);
            this.f8060z = false;
        }
        return eVar;
    }

    public final o0.e w() {
        c0();
        if (this.f8048n == 0) {
            return (o0.e) this.f8049o.f8290g;
        }
        o0.e eVar = this.f8050p;
        pc.j.b(eVar);
        return eVar;
    }

    public final void x(long j3, q qVar, int i10, boolean z10) {
        c1 c1Var = this.I;
        f1 f1Var = c1Var.f7989d;
        f1.e0 e0Var = f1.P;
        c1Var.f7989d.G0(f1.R, f1Var.y0(j3), qVar, i10, z10);
    }

    @Override // x1.n1
    public final boolean y() {
        return G();
    }

    public final void z(int i10, g0 g0Var) {
        if (g0Var.f8052r != null && g0Var.f8053s != null) {
            u1.a.b(j(g0Var));
        }
        g0Var.f8052r = this;
        x4.c cVar = this.f8049o;
        ((o0.e) cVar.f8290g).a(i10, g0Var);
        ((b0.p0) cVar.f8291h).invoke();
        M();
        if (g0Var.f8041g) {
            this.f8048n++;
        }
        F();
        m1 m1Var = this.f8053s;
        if (m1Var != null) {
            g0Var.d(m1Var);
        }
        if (g0Var.J.f8099l > 0) {
            k0 k0Var = this.J;
            k0Var.d(k0Var.f8099l + 1);
        }
        if (g0Var.Q > 0) {
            Y(this.Q + 1);
        }
    }

    public g0(int i10, boolean z10) {
        this.f8041g = z10;
        this.f8042h = i10;
        this.f8043i = 9223372034707292159L;
        this.f8044j = 0L;
        this.f8045k = 9223372034707292159L;
        this.f8046l = true;
        this.f8049o = new x4.c(new o0.e(new g0[16]), new b0.p0(21, this));
        this.f8059y = new o0.e(new g0[16]);
        this.f8060z = true;
        this.A = S;
        this.B = j0.f8085a;
        this.C = s2.l.f6396g;
        this.D = T;
        m0.c0.f4532c.getClass();
        this.E = m0.b0.f4522b;
        e0 e0Var = e0.f8021i;
        this.F = e0Var;
        this.G = e0Var;
        this.I = new c1(this);
        this.J = new k0(this);
        this.M = true;
        this.N = y0.k.f8442a;
    }
}
