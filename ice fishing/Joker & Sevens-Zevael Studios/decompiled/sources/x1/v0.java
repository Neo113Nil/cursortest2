package x1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class v0 {

    /* renamed from: a, reason: collision with root package name */
    public final g0 f8189a;

    /* renamed from: c, reason: collision with root package name */
    public boolean f8191c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f8192d;

    /* renamed from: i, reason: collision with root package name */
    public s2.a f8197i;

    /* renamed from: b, reason: collision with root package name */
    public final a5.c f8190b = new a5.c(24);

    /* renamed from: e, reason: collision with root package name */
    public final x4.e f8193e = new x4.e(10);

    /* renamed from: f, reason: collision with root package name */
    public final o0.e f8194f = new o0.e(new g0[16]);

    /* renamed from: g, reason: collision with root package name */
    public final long f8195g = 1;

    /* renamed from: h, reason: collision with root package name */
    public final o0.e f8196h = new o0.e(new u0[16]);

    public v0(g0 g0Var) {
        this.f8189a = g0Var;
    }

    public static boolean b(g0 g0Var, s2.a aVar) {
        boolean f02;
        g0 g0Var2 = g0Var.f8047m;
        k0 k0Var = g0Var.J;
        if (g0Var2 == null) {
            return false;
        }
        if (aVar != null) {
            if (g0Var2 != null) {
                t0 t0Var = k0Var.f8104q;
                pc.j.b(t0Var);
                f02 = t0Var.f0(aVar.f6381a);
            }
            f02 = false;
        } else {
            t0 t0Var2 = k0Var.f8104q;
            s2.a aVar2 = t0Var2 != null ? t0Var2.f8173s : null;
            if (aVar2 != null && g0Var2 != null) {
                pc.j.b(t0Var2);
                f02 = t0Var2.f0(aVar2.f6381a);
            }
            f02 = false;
        }
        g0 s10 = g0Var.s();
        if (f02 && s10 != null) {
            if (s10.f8047m == null) {
                g0.T(s10, false, 3);
                return f02;
            }
            if (g0Var.r() == e0.f8019g) {
                g0.R(s10, false, 3);
                return f02;
            }
            if (g0Var.r() == e0.f8020h) {
                s10.Q(false);
            }
        }
        return f02;
    }

    public static boolean c(g0 g0Var, s2.a aVar) {
        boolean z10;
        if (aVar != null) {
            if (g0Var.F == e0.f8021i) {
                g0Var.e();
            }
            z10 = g0Var.J.f8103p.h0(aVar.f6381a);
        } else {
            x0 x0Var = g0Var.J.f8103p;
            s2.a aVar2 = x0Var.f8205p ? new s2.a(x0Var.f7088j) : null;
            if (aVar2 != null) {
                if (g0Var.F == e0.f8021i) {
                    g0Var.e();
                }
                z10 = g0Var.J.f8103p.h0(aVar2.f6381a);
            } else {
                g0Var.getClass();
                z10 = false;
            }
        }
        g0 s10 = g0Var.s();
        if (z10 && s10 != null) {
            if (g0Var.q() == e0.f8019g) {
                g0.T(s10, false, 3);
                return z10;
            }
            if (g0Var.q() == e0.f8020h) {
                s10.S(false);
            }
        }
        return z10;
    }

    public static boolean h(g0 g0Var) {
        t0 t0Var;
        h0 h0Var;
        if (g0Var.J.f8092e) {
            return (g0Var.r() == e0.f8021i && ((t0Var = g0Var.J.f8104q) == null || (h0Var = t0Var.f8177w) == null || !h0Var.e())) ? false : true;
        }
        return false;
    }

    public static boolean i(g0 g0Var) {
        if (!g0Var.p()) {
            return false;
        }
        do {
            if (g0Var.q() == e0.f8021i && !g0Var.J.f8103p.C.e()) {
                g0 s10 = g0Var.s();
                if ((s10 != null ? s10.J.f8091d : null) != c0.f7980g) {
                    return false;
                }
            }
            g0Var = g0Var.s();
            if (g0Var == null) {
                return false;
            }
        } while (!g0Var.H());
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
    
        if (r4 < r2) goto L13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(boolean z10) {
        Object[] objArr;
        x4.e eVar = this.f8193e;
        if (z10) {
            o0.e eVar2 = (o0.e) eVar.f8294g;
            g0 g0Var = this.f8189a;
            if (g0Var.Q > 0) {
                eVar2.g();
                eVar2.b(g0Var);
                g0Var.P = true;
            }
        }
        o0.e eVar3 = (o0.e) eVar.f8294g;
        int i10 = eVar3.f5136i;
        if (i10 != 0) {
            bc.l.b0(eVar3.f5134g, j1.f8086b, 0, i10);
            int i11 = eVar3.f5136i;
            g0[] g0VarArr = (g0[]) eVar.f8295h;
            if (g0VarArr != null) {
                int length = g0VarArr.length;
                objArr = g0VarArr;
            }
            objArr = new g0[Math.max(16, i11)];
            eVar.f8295h = null;
            for (int i12 = 0; i12 < i11; i12++) {
                objArr[i12] = eVar3.f5134g[i12];
            }
            eVar3.g();
            for (int i13 = i11 - 1; -1 < i13; i13--) {
                g0 g0Var2 = objArr[i13];
                pc.j.b(g0Var2);
                if (g0Var2.P) {
                    x4.e.a(g0Var2);
                }
                objArr[i13] = 0;
            }
            eVar.f8295h = objArr;
        }
    }

    public final void d() {
        o0.e eVar = this.f8196h;
        int i10 = eVar.f5136i;
        if (i10 != 0) {
            Object[] objArr = eVar.f5134g;
            for (int i11 = 0; i11 < i10; i11++) {
                u0 u0Var = (u0) objArr[i11];
                g0 g0Var = u0Var.f8186a;
                boolean z10 = u0Var.f8188c;
                g0 g0Var2 = u0Var.f8186a;
                if (g0Var.G()) {
                    if (u0Var.f8187b) {
                        g0.R(g0Var2, z10, 2);
                    } else {
                        g0.T(g0Var2, z10, 2);
                    }
                }
            }
            eVar.g();
        }
    }

    public final void e(g0 g0Var) {
        o0.e w3 = g0Var.w();
        Object[] objArr = w3.f5134g;
        int i10 = w3.f5136i;
        for (int i11 = 0; i11 < i10; i11++) {
            g0 g0Var2 = (g0) objArr[i11];
            if (pc.j.a(g0Var2.I(), Boolean.TRUE) && !g0Var2.R) {
                if (this.f8190b.q(g0Var2)) {
                    g0Var2.J();
                }
                e(g0Var2);
            }
        }
    }

    public final void f(g0 g0Var, boolean z10) {
        if (!this.f8191c) {
            u1.a.b("forceMeasureTheSubtree should be executed during the measureAndLayout pass");
        }
        if (z10 ? g0Var.J.f8092e : g0Var.p()) {
            u1.a.a("node not yet measured");
        }
        g(g0Var, z10);
    }

    public final void g(g0 g0Var, boolean z10) {
        t0 t0Var;
        h0 h0Var;
        o0.e w3 = g0Var.w();
        Object[] objArr = w3.f5134g;
        int i10 = w3.f5136i;
        for (int i11 = 0; i11 < i10; i11++) {
            g0 g0Var2 = (g0) objArr[i11];
            e0 e0Var = e0.f8019g;
            if ((!z10 && (g0Var2.q() == e0Var || g0Var2.J.f8103p.C.e())) || (z10 && (g0Var2.r() == e0Var || ((t0Var = g0Var2.J.f8104q) != null && (h0Var = t0Var.f8177w) != null && h0Var.e())))) {
                boolean r5 = f.r(g0Var2);
                k0 k0Var = g0Var2.J;
                if (r5 && !z10) {
                    if (k0Var.f8092e && this.f8190b.q(g0Var2)) {
                        m(g0Var2, true, false);
                    } else {
                        f(g0Var2, true);
                    }
                }
                if (z10 ? k0Var.f8092e : g0Var2.p()) {
                    m(g0Var2, z10, false);
                }
                if (!(z10 ? k0Var.f8092e : g0Var2.p())) {
                    g(g0Var2, z10);
                }
            }
        }
        if (z10 ? g0Var.J.f8092e : g0Var.p()) {
            m(g0Var, z10, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v2, types: [y0.m] */
    public final boolean j(y1.q qVar) {
        boolean z10;
        y0.m mVar;
        y0.m mVar2;
        boolean z11;
        g0 g0Var;
        boolean z12;
        a5.c cVar = this.f8190b;
        g0 g0Var2 = this.f8189a;
        if (!g0Var2.G()) {
            u1.a.a("performMeasureAndLayout called with unattached root");
        }
        if (!g0Var2.H()) {
            u1.a.a("performMeasureAndLayout called with unplaced root");
        }
        if (this.f8191c) {
            u1.a.a("performMeasureAndLayout called during measure layout");
        }
        int i10 = 0;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        boolean z16 = false;
        if (this.f8197i != null) {
            this.f8191c = true;
            this.f8192d = true;
            try {
                boolean A = cVar.A();
                m7.g gVar = (m7.g) cVar.f262h;
                if (A) {
                    z10 = false;
                    while (true) {
                        m7.g gVar2 = (m7.g) cVar.f263i;
                        m7.g gVar3 = (m7.g) cVar.f261g;
                        if (!((v1) gVar.f4957h).isEmpty()) {
                            g0Var = (g0) ((v1) gVar.f4957h).first();
                            gVar.u(g0Var);
                            z12 = g0Var.f8047m != null;
                            z11 = false;
                        } else if (!((v1) gVar3.f4957h).isEmpty()) {
                            g0Var = (g0) ((v1) gVar3.f4957h).first();
                            gVar3.u(g0Var);
                            z12 = g0Var.f8047m != null;
                            z11 = true;
                        } else {
                            if (((v1) gVar2.f4957h).isEmpty()) {
                                break;
                            }
                            g0 g0Var3 = (g0) ((v1) gVar2.f4957h).first();
                            gVar2.u(g0Var3);
                            z11 = true;
                            g0Var = g0Var3;
                            z12 = false;
                        }
                        boolean m10 = m(g0Var, z12, z11);
                        if (!z11) {
                            if (g0Var.J.f8093f) {
                                cVar.b(g0Var, t.f8162h);
                            }
                            if (g0Var.o()) {
                                cVar.b(g0Var, t.f8164j);
                            }
                        }
                        if (g0Var == g0Var2 && m10) {
                            z10 = true;
                        }
                    }
                    if (qVar != null) {
                        qVar.invoke();
                    }
                } else {
                    z10 = false;
                }
            } finally {
            }
        } else {
            z10 = false;
        }
        o0.e eVar = this.f8194f;
        Object[] objArr = eVar.f5134g;
        int i11 = eVar.f5136i;
        int i12 = 0;
        while (i12 < i11) {
            c1 c1Var = ((g0) objArr[i12]).I;
            s sVar = c1Var.f7988c;
            boolean g8 = g1.g(128);
            if (g8) {
                mVar = sVar.T;
            } else {
                mVar = sVar.T.f8447k;
                if (mVar == null) {
                    i12++;
                    i10 = 0;
                }
            }
            f1.e0 e0Var = f1.P;
            y0.m D0 = sVar.D0(g8);
            while (D0 != null && (D0.f8446j & 128) != 0) {
                if ((D0.f8445i & 128) != 0) {
                    m mVar3 = D0;
                    o0.e eVar2 = null;
                    while (mVar3 != 0) {
                        if (mVar3 instanceof v) {
                            ((v) mVar3).j(c1Var.f7988c);
                        } else if ((mVar3.f8445i & 128) != 0 && (mVar3 instanceof m)) {
                            y0.m mVar4 = mVar3.f8110v;
                            mVar2 = mVar3;
                            eVar2 = eVar2;
                            while (mVar4 != null) {
                                if ((mVar4.f8445i & 128) != 0) {
                                    i10++;
                                    eVar2 = eVar2;
                                    if (i10 == 1) {
                                        mVar2 = mVar4;
                                    } else {
                                        if (eVar2 == null) {
                                            eVar2 = new o0.e(new y0.m[16]);
                                        }
                                        if (mVar2 != null) {
                                            eVar2.b(mVar2);
                                            mVar2 = null;
                                        }
                                        eVar2.b(mVar4);
                                    }
                                }
                                mVar4 = mVar4.f8448l;
                                mVar2 = mVar2;
                                eVar2 = eVar2;
                            }
                            if (i10 == 1) {
                                i10 = 0;
                                mVar3 = mVar2;
                                eVar2 = eVar2;
                            }
                        }
                        mVar2 = f.f(eVar2);
                        i10 = 0;
                        mVar3 = mVar2;
                        eVar2 = eVar2;
                    }
                }
                if (D0 != mVar) {
                    D0 = D0.f8448l;
                    i10 = 0;
                }
            }
            i12++;
            i10 = 0;
        }
        eVar.g();
        return z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0084 A[Catch: all -> 0x006a, TryCatch #1 {all -> 0x006a, blocks: (B:21:0x0043, B:23:0x0065, B:26:0x007b, B:28:0x0084, B:29:0x0087, B:32:0x0095, B:34:0x009d, B:35:0x00a2, B:37:0x00aa, B:38:0x00ad, B:40:0x00b3, B:42:0x00b9, B:44:0x00c5, B:45:0x00ce, B:48:0x006c, B:50:0x0078), top: B:20:0x0043 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009d A[Catch: all -> 0x006a, TryCatch #1 {all -> 0x006a, blocks: (B:21:0x0043, B:23:0x0065, B:26:0x007b, B:28:0x0084, B:29:0x0087, B:32:0x0095, B:34:0x009d, B:35:0x00a2, B:37:0x00aa, B:38:0x00ad, B:40:0x00b3, B:42:0x00b9, B:44:0x00c5, B:45:0x00ce, B:48:0x006c, B:50:0x0078), top: B:20:0x0043 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a2 A[Catch: all -> 0x006a, TryCatch #1 {all -> 0x006a, blocks: (B:21:0x0043, B:23:0x0065, B:26:0x007b, B:28:0x0084, B:29:0x0087, B:32:0x0095, B:34:0x009d, B:35:0x00a2, B:37:0x00aa, B:38:0x00ad, B:40:0x00b3, B:42:0x00b9, B:44:0x00c5, B:45:0x00ce, B:48:0x006c, B:50:0x0078), top: B:20:0x0043 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c5 A[Catch: all -> 0x006a, TryCatch #1 {all -> 0x006a, blocks: (B:21:0x0043, B:23:0x0065, B:26:0x007b, B:28:0x0084, B:29:0x0087, B:32:0x0095, B:34:0x009d, B:35:0x00a2, B:37:0x00aa, B:38:0x00ad, B:40:0x00b3, B:42:0x00b9, B:44:0x00c5, B:45:0x00ce, B:48:0x006c, B:50:0x0078), top: B:20:0x0043 }] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v2, types: [y0.m] */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [int] */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3, types: [int] */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r17v0, types: [java.lang.Object, x1.g0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(g0 g0Var, long j3) {
        y0.m mVar;
        y0.m mVar2;
        boolean h0;
        boolean z10 = g0Var.R;
        k0 k0Var = g0Var.J;
        if (z10) {
            return;
        }
        g0 g0Var2 = this.f8189a;
        if (g0Var.equals(g0Var2)) {
            u1.a.a("measureAndLayout called on root");
        }
        if (!g0Var2.G()) {
            u1.a.a("performMeasureAndLayout called with unattached root");
        }
        if (!g0Var2.H()) {
            u1.a.a("performMeasureAndLayout called with unplaced root");
        }
        if (this.f8191c) {
            u1.a.a("performMeasureAndLayout called during measure layout");
        }
        boolean z11 = false;
        if (this.f8197i != null) {
            this.f8191c = true;
            this.f8192d = false;
            try {
                a5.c cVar = this.f8190b;
                ((m7.g) cVar.f262h).u(g0Var);
                ((m7.g) cVar.f261g).u(g0Var);
                ((m7.g) cVar.f263i).u(g0Var);
                if (!b(g0Var, new s2.a(j3))) {
                    if (k0Var.f8093f) {
                    }
                    e(g0Var);
                    if (g0Var.F == e0.f8021i) {
                        g0Var.e();
                    }
                    h0 = k0Var.f8103p.h0(j3);
                    g0 s10 = g0Var.s();
                    if (h0 && s10 != null) {
                        if (g0Var.q() != e0.f8019g) {
                            g0.T(s10, false, 3);
                        } else if (g0Var.q() == e0.f8020h) {
                            s10.S(false);
                        }
                    }
                    if (g0Var.o() && g0Var.H()) {
                        g0Var.P();
                        x4.e eVar = this.f8193e;
                        eVar.getClass();
                        if (g0Var.Q > 0) {
                            ((o0.e) eVar.f8294g).b(g0Var);
                            g0Var.P = true;
                        }
                    }
                    d();
                }
                if (pc.j.a(g0Var.I(), Boolean.TRUE)) {
                    g0Var.J();
                }
                e(g0Var);
                if (g0Var.F == e0.f8021i) {
                }
                h0 = k0Var.f8103p.h0(j3);
                g0 s102 = g0Var.s();
                if (h0) {
                    if (g0Var.q() != e0.f8019g) {
                    }
                }
                if (g0Var.o()) {
                    g0Var.P();
                    x4.e eVar2 = this.f8193e;
                    eVar2.getClass();
                    if (g0Var.Q > 0) {
                    }
                }
                d();
            } finally {
            }
        }
        o0.e eVar3 = this.f8194f;
        Object[] objArr = eVar3.f5134g;
        int i10 = eVar3.f5136i;
        int i11 = 0;
        while (i11 < i10) {
            c1 c1Var = ((g0) objArr[i11]).I;
            s sVar = c1Var.f7988c;
            boolean g8 = g1.g(128);
            if (g8) {
                mVar = sVar.T;
            } else {
                mVar = sVar.T.f8447k;
                if (mVar == null) {
                    i11++;
                    z11 = false;
                }
            }
            f1.e0 e0Var = f1.P;
            y0.m D0 = sVar.D0(g8);
            while (D0 != null && (D0.f8446j & 128) != 0) {
                if ((D0.f8445i & 128) != 0) {
                    m mVar3 = D0;
                    o0.e eVar4 = null;
                    while (mVar3 != 0) {
                        if (mVar3 instanceof v) {
                            ((v) mVar3).j(c1Var.f7988c);
                        } else if ((mVar3.f8445i & 128) != 0 && (mVar3 instanceof m)) {
                            y0.m mVar4 = mVar3.f8110v;
                            ?? r15 = z11;
                            mVar2 = mVar3;
                            eVar4 = eVar4;
                            while (mVar4 != null) {
                                if ((mVar4.f8445i & 128) != 0) {
                                    r15++;
                                    eVar4 = eVar4;
                                    if (r15 == 1) {
                                        mVar2 = mVar4;
                                    } else {
                                        if (eVar4 == null) {
                                            eVar4 = new o0.e(new y0.m[16]);
                                        }
                                        if (mVar2 != null) {
                                            eVar4.b(mVar2);
                                            mVar2 = null;
                                        }
                                        eVar4.b(mVar4);
                                    }
                                }
                                mVar4 = mVar4.f8448l;
                                mVar2 = mVar2;
                                eVar4 = eVar4;
                                r15 = r15;
                            }
                            if (r15 == 1) {
                                z11 = false;
                                mVar3 = mVar2;
                                eVar4 = eVar4;
                            }
                        }
                        mVar2 = f.f(eVar4);
                        z11 = false;
                        mVar3 = mVar2;
                        eVar4 = eVar4;
                    }
                }
                if (D0 != mVar) {
                    D0 = D0.f8448l;
                    z11 = false;
                }
            }
            i11++;
            z11 = false;
        }
        eVar3.g();
    }

    public final void l() {
        a5.c cVar = this.f8190b;
        if (cVar.A()) {
            g0 g0Var = this.f8189a;
            if (!g0Var.G()) {
                u1.a.a("performMeasureAndLayout called with unattached root");
            }
            if (!g0Var.H()) {
                u1.a.a("performMeasureAndLayout called with unplaced root");
            }
            if (this.f8191c) {
                u1.a.a("performMeasureAndLayout called during measure layout");
            }
            if (this.f8197i != null) {
                this.f8191c = true;
                this.f8192d = false;
                try {
                    if (!((v1) ((m7.g) cVar.f263i).f4957h).isEmpty() && !((v1) ((m7.g) cVar.f262h).f4957h).isEmpty()) {
                        if (g0Var.f8047m != null) {
                            o(g0Var, true);
                        } else {
                            n(g0Var);
                        }
                    }
                    o(g0Var, false);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } finally {
                        this.f8191c = false;
                        this.f8192d = false;
                    }
                }
            }
        }
    }

    public final boolean m(g0 g0Var, boolean z10, boolean z11) {
        s2.a aVar;
        boolean z12;
        v1.i0 placementScope;
        s sVar;
        g0 s10;
        t0 t0Var;
        h0 h0Var;
        boolean z13 = g0Var.R;
        k0 k0Var = g0Var.J;
        if (z13 || (!g0Var.H() && !k0Var.f8103p.f8214y && !i(g0Var) && !pc.j.a(g0Var.I(), Boolean.TRUE) && !h(g0Var) && !k0Var.f8103p.C.e() && ((t0Var = k0Var.f8104q) == null || (h0Var = t0Var.f8177w) == null || !h0Var.e()))) {
            return false;
        }
        g0 g0Var2 = this.f8189a;
        if (g0Var == g0Var2) {
            aVar = this.f8197i;
            pc.j.b(aVar);
        } else {
            aVar = null;
        }
        if (z10) {
            z12 = k0Var.f8092e ? b(g0Var, aVar) : false;
            if (z11 && ((z12 || k0Var.f8093f) && pc.j.a(g0Var.I(), Boolean.TRUE))) {
                g0Var.J();
            }
        } else {
            boolean c3 = g0Var.p() ? c(g0Var, aVar) : false;
            if (z11 && g0Var.o() && (g0Var == g0Var2 || ((s10 = g0Var.s()) != null && s10.H() && k0Var.f8103p.f8214y))) {
                if (g0Var == g0Var2) {
                    if (g0Var.F == e0.f8021i) {
                        g0Var.f();
                    }
                    g0 s11 = g0Var.s();
                    if (s11 == null || (sVar = s11.I.f7988c) == null || (placementScope = sVar.f8127r) == null) {
                        placementScope = ((y1.r) j0.a(g0Var)).getPlacementScope();
                    }
                    v1.i0.i(placementScope, k0Var.f8103p, 0, 0);
                } else {
                    g0Var.P();
                }
                x4.e eVar = this.f8193e;
                eVar.getClass();
                if (g0Var.Q > 0) {
                    ((o0.e) eVar.f8294g).b(g0Var);
                    g0Var.P = true;
                }
                ((y1.r) j0.a(g0Var)).getRectManager().d(g0Var);
            }
            z12 = c3;
        }
        d();
        return z12;
    }

    public final void n(g0 g0Var) {
        o0.e w3 = g0Var.w();
        Object[] objArr = w3.f5134g;
        int i10 = w3.f5136i;
        for (int i11 = 0; i11 < i10; i11++) {
            g0 g0Var2 = (g0) objArr[i11];
            if (g0Var2.q() == e0.f8019g || g0Var2.J.f8103p.C.e()) {
                if (f.r(g0Var2)) {
                    o(g0Var2, true);
                } else {
                    n(g0Var2);
                }
            }
        }
    }

    public final void o(g0 g0Var, boolean z10) {
        s2.a aVar;
        if (g0Var.R) {
            return;
        }
        if (g0Var == this.f8189a) {
            aVar = this.f8197i;
            pc.j.b(aVar);
        } else {
            aVar = null;
        }
        if (z10) {
            b(g0Var, aVar);
        } else {
            c(g0Var, aVar);
        }
    }

    public final boolean p(g0 g0Var, boolean z10) {
        int ordinal = g0Var.J.f8091d.ordinal();
        if (ordinal != 0 && ordinal != 1) {
            if (ordinal == 2 || ordinal == 3) {
                this.f8196h.b(new u0(g0Var, false, z10));
            } else {
                if (ordinal != 4) {
                    throw new ac.d();
                }
                if (!g0Var.p() || z10) {
                    g0Var.J.f8103p.f8215z = true;
                    if (!g0Var.R && (g0Var.H() || i(g0Var))) {
                        g0 s10 = g0Var.s();
                        if (s10 == null || !s10.p()) {
                            this.f8190b.b(g0Var, t.f8163i);
                        }
                        if (!this.f8192d) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final void q(long j3) {
        s2.a aVar = this.f8197i;
        if (aVar == null ? false : s2.a.b(aVar.f6381a, j3)) {
            return;
        }
        if (this.f8191c) {
            u1.a.a("updateRootConstraints called while measuring");
        }
        this.f8197i = new s2.a(j3);
        g0 g0Var = this.f8189a;
        g0 g0Var2 = g0Var.f8047m;
        k0 k0Var = g0Var.J;
        if (g0Var2 != null) {
            k0Var.f8092e = true;
        }
        k0Var.f8103p.f8215z = true;
        this.f8190b.b(g0Var, g0Var2 != null ? t.f8161g : t.f8163i);
    }
}
