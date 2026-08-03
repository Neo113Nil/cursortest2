package x1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class t0 extends v1.j0 implements v1.d0, a, z0 {
    public Object B;
    public boolean C;

    /* renamed from: l, reason: collision with root package name */
    public final k0 f8166l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f8167m;

    /* renamed from: q, reason: collision with root package name */
    public boolean f8171q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f8172r;

    /* renamed from: s, reason: collision with root package name */
    public s2.a f8173s;

    /* renamed from: u, reason: collision with root package name */
    public oc.c f8175u;

    /* renamed from: z, reason: collision with root package name */
    public boolean f8180z;

    /* renamed from: n, reason: collision with root package name */
    public int f8168n = Integer.MAX_VALUE;

    /* renamed from: o, reason: collision with root package name */
    public int f8169o = Integer.MAX_VALUE;

    /* renamed from: p, reason: collision with root package name */
    public e0 f8170p = e0.f8021i;

    /* renamed from: t, reason: collision with root package name */
    public long f8174t = 0;

    /* renamed from: v, reason: collision with root package name */
    public q0 f8176v = q0.f8152i;

    /* renamed from: w, reason: collision with root package name */
    public final h0 f8177w = new h0(this, 1);

    /* renamed from: x, reason: collision with root package name */
    public final o0.e f8178x = new o0.e(new t0[16]);

    /* renamed from: y, reason: collision with root package name */
    public boolean f8179y = true;
    public boolean A = true;

    public t0(k0 k0Var) {
        this.f8166l = k0Var;
        this.B = k0Var.f8103p.f8212w;
    }

    @Override // x1.a
    public final void F() {
        g0.R(this.f8166l.f8088a, false, 7);
    }

    @Override // v1.j0
    public final void P(long j3, float f10, oc.c cVar) {
        b0(j3, cVar);
    }

    public final void T(boolean z10) {
        k0 k0Var = this.f8166l;
        if (z10 && k0Var.f8090c) {
            return;
        }
        if (z10 || k0Var.f8090c) {
            this.f8176v = q0.f8152i;
            o0.e w3 = k0Var.f8088a.w();
            Object[] objArr = w3.f5134g;
            int i10 = w3.f5136i;
            for (int i11 = 0; i11 < i10; i11++) {
                t0 t0Var = ((g0) objArr[i11]).J.f8104q;
                pc.j.b(t0Var);
                t0Var.T(true);
            }
        }
    }

    public final void W() {
        q0 q0Var = this.f8176v;
        k0 k0Var = this.f8166l;
        boolean z10 = k0Var.f8090c;
        g0 g0Var = k0Var.f8088a;
        q0 q0Var2 = q0.f8150g;
        if (z10) {
            this.f8176v = q0.f8151h;
        } else {
            this.f8176v = q0Var2;
        }
        if (q0Var != q0Var2 && k0Var.f8092e) {
            g0.R(g0Var, true, 6);
        }
        o0.e w3 = g0Var.w();
        Object[] objArr = w3.f5134g;
        int i10 = w3.f5136i;
        for (int i11 = 0; i11 < i10; i11++) {
            g0 g0Var2 = (g0) objArr[i11];
            t0 t0Var = g0Var2.J.f8104q;
            if (t0Var == null) {
                throw new IllegalArgumentException("Error: Child node's lookahead pass delegate cannot be null when in a lookahead scope.");
            }
            if (t0Var.f8169o != Integer.MAX_VALUE) {
                t0Var.W();
                g0.U(g0Var2);
            }
        }
    }

    public final void X() {
        k0 k0Var = this.f8166l;
        if (k0Var.f8102o > 0) {
            o0.e w3 = k0Var.f8088a.w();
            Object[] objArr = w3.f5134g;
            int i10 = w3.f5136i;
            for (int i11 = 0; i11 < i10; i11++) {
                g0 g0Var = (g0) objArr[i11];
                k0 k0Var2 = g0Var.J;
                if ((k0Var2.f8100m || k0Var2.f8101n) && !k0Var2.f8093f) {
                    g0Var.Q(false);
                }
                t0 t0Var = k0Var2.f8104q;
                if (t0Var != null) {
                    t0Var.X();
                }
            }
        }
    }

    @Override // x1.a
    public final h0 a() {
        return this.f8177w;
    }

    public final void a0() {
        c0 c0Var;
        this.C = true;
        k0 k0Var = this.f8166l;
        g0 s10 = k0Var.f8088a.s();
        q0 q0Var = this.f8176v;
        if ((q0Var != q0.f8150g && !k0Var.f8090c) || (q0Var != q0.f8151h && k0Var.f8090c)) {
            W();
            if (this.f8167m && s10 != null) {
                s10.Q(false);
            }
        }
        if (s10 != null) {
            k0 k0Var2 = s10.J;
            if (!this.f8167m && ((c0Var = k0Var2.f8091d) == c0.f7982i || c0Var == c0.f7983j)) {
                if (this.f8169o != Integer.MAX_VALUE) {
                    u1.a.b("Place was called on a node which was placed already");
                }
                int i10 = k0Var2.f8095h;
                this.f8169o = i10;
                k0Var2.f8095h = i10 + 1;
            }
        } else {
            this.f8169o = 0;
        }
        r();
    }

    public final void b0(long j3, oc.c cVar) {
        k0 k0Var = this.f8166l;
        g0 g0Var = k0Var.f8088a;
        g0 g0Var2 = k0Var.f8088a;
        try {
            g0 s10 = g0Var.s();
            c0 c0Var = s10 != null ? s10.J.f8091d : null;
            c0 c0Var2 = c0.f7983j;
            if (c0Var == c0Var2) {
                k0Var.f8090c = false;
            }
            if (g0Var2.R) {
                u1.a.a("place is called on a deactivated node");
            }
            k0Var.f8091d = c0Var2;
            this.f8171q = true;
            this.C = false;
            if (!s2.i.a(j3, this.f8174t)) {
                if (k0Var.f8101n || k0Var.f8100m) {
                    k0Var.f8093f = true;
                }
                X();
            }
            m1 a6 = j0.a(g0Var2);
            if (k0Var.f8093f || !s()) {
                k0Var.h(false);
                this.f8177w.f8071e = false;
                o1 snapshotObserver = ((y1.r) a6).getSnapshotObserver();
                s0 s0Var = new s0(this, a6, j3);
                snapshotObserver.getClass();
                if (g0Var2.f8047m != null) {
                    snapshotObserver.a(g0Var2, snapshotObserver.f8136g, s0Var);
                } else {
                    snapshotObserver.a(g0Var2, snapshotObserver.f8135f, s0Var);
                }
            } else {
                p0 z02 = k0Var.a().z0();
                pc.j.b(z02);
                z02.s0(s2.i.c(j3, z02.f7089k));
                a0();
            }
            this.f8174t = j3;
            this.f8175u = cVar;
            k0Var.f8091d = c0.f7984k;
        } catch (Throwable th) {
            g0Var.W(th);
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
    
        if ((r1 != null ? r1.J.f8091d : null) == x1.c0.f7983j) goto L13;
     */
    @Override // v1.d0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final v1.j0 e(long j3) {
        e0 e0Var;
        k0 k0Var = this.f8166l;
        g0 s10 = k0Var.f8088a.s();
        if ((s10 != null ? s10.J.f8091d : null) != c0.f7981h) {
            g0 s11 = k0Var.f8088a.s();
        }
        k0Var.f8089b = false;
        g0 g0Var = k0Var.f8088a;
        g0 s12 = g0Var.s();
        if (s12 != null) {
            k0 k0Var2 = s12.J;
            if (this.f8170p != e0.f8021i && !g0Var.H) {
                u1.a.b("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int ordinal = k0Var2.f8091d.ordinal();
            if (ordinal == 0 || ordinal == 1) {
                e0Var = e0.f8019g;
            } else {
                if (ordinal != 2 && ordinal != 3) {
                    throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is " + k0Var2.f8091d);
                }
                e0Var = e0.f8020h;
            }
            this.f8170p = e0Var;
        } else {
            this.f8170p = e0.f8021i;
        }
        g0 g0Var2 = k0Var.f8088a;
        if (g0Var2.F == e0.f8021i) {
            g0Var2.e();
        }
        f0(j3);
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:6:0x0013, B:9:0x001f, B:13:0x0027, B:15:0x002f, B:20:0x003e, B:22:0x0042, B:23:0x0047, B:26:0x0035, B:27:0x004b, B:29:0x0064, B:31:0x0077, B:33:0x0082, B:34:0x008c, B:38:0x009d, B:39:0x00a2, B:41:0x00b8, B:46:0x0085), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0064 A[Catch: all -> 0x0010, LOOP:0: B:28:0x0062->B:29:0x0064, LOOP_END, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:6:0x0013, B:9:0x001f, B:13:0x0027, B:15:0x002f, B:20:0x003e, B:22:0x0042, B:23:0x0047, B:26:0x0035, B:27:0x004b, B:29:0x0064, B:31:0x0077, B:33:0x0082, B:34:0x008c, B:38:0x009d, B:39:0x00a2, B:41:0x00b8, B:46:0x0085), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0082 A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:6:0x0013, B:9:0x001f, B:13:0x0027, B:15:0x002f, B:20:0x003e, B:22:0x0042, B:23:0x0047, B:26:0x0035, B:27:0x004b, B:29:0x0064, B:31:0x0077, B:33:0x0082, B:34:0x008c, B:38:0x009d, B:39:0x00a2, B:41:0x00b8, B:46:0x0085), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009d A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:6:0x0013, B:9:0x001f, B:13:0x0027, B:15:0x002f, B:20:0x003e, B:22:0x0042, B:23:0x0047, B:26:0x0035, B:27:0x004b, B:29:0x0064, B:31:0x0077, B:33:0x0082, B:34:0x008c, B:38:0x009d, B:39:0x00a2, B:41:0x00b8, B:46:0x0085), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0085 A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:6:0x0013, B:9:0x001f, B:13:0x0027, B:15:0x002f, B:20:0x003e, B:22:0x0042, B:23:0x0047, B:26:0x0035, B:27:0x004b, B:29:0x0064, B:31:0x0077, B:33:0x0082, B:34:0x008c, B:38:0x009d, B:39:0x00a2, B:41:0x00b8, B:46:0x0085), top: B:2:0x0006 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean f0(long j3) {
        boolean z10;
        int i10;
        int i11;
        long j6;
        p0 z02;
        k0 k0Var = this.f8166l;
        g0 g0Var = k0Var.f8088a;
        g0 g0Var2 = k0Var.f8088a;
        try {
            if (g0Var.R) {
                u1.a.a("measure is called on a deactivated node");
            }
            g0 s10 = g0Var2.s();
            if (!g0Var2.H && (s10 == null || !s10.H)) {
                z10 = false;
                g0Var2.H = z10;
                if (!g0Var2.J.f8092e) {
                    s2.a aVar = this.f8173s;
                    if (aVar == null ? false : s2.a.b(aVar.f6381a, j3)) {
                        m1 m1Var = g0Var2.f8053s;
                        if (m1Var != null) {
                            ((y1.r) m1Var).l(g0Var2, true);
                        }
                        g0Var2.V();
                        return false;
                    }
                }
                this.f8173s = new s2.a(j3);
                S(j3);
                this.f8177w.f8070d = false;
                o0.e w3 = g0Var2.w();
                Object[] objArr = w3.f5134g;
                i10 = w3.f5136i;
                for (i11 = 0; i11 < i10; i11++) {
                    t0 t0Var = ((g0) objArr[i11]).J.f8104q;
                    pc.j.b(t0Var);
                    t0Var.f8177w.getClass();
                }
                if (this.f8172r) {
                    long j10 = Integer.MIN_VALUE;
                    j6 = (j10 & 4294967295L) | (j10 << 32);
                } else {
                    j6 = this.f7087i;
                }
                this.f8172r = true;
                z02 = k0Var.a().z0();
                if (!(z02 == null)) {
                    u1.a.b("Lookahead result from lookaheadRemeasure cannot be null");
                }
                k0Var.c(j3);
                Q((z02.f7086h & 4294967295L) | (z02.f7085g << 32));
                return ((int) (j6 >> 32)) == z02.f7085g || ((int) (j6 & 4294967295L)) != z02.f7086h;
            }
            z10 = true;
            g0Var2.H = z10;
            if (!g0Var2.J.f8092e) {
            }
            this.f8173s = new s2.a(j3);
            S(j3);
            this.f8177w.f8070d = false;
            o0.e w32 = g0Var2.w();
            Object[] objArr2 = w32.f5134g;
            i10 = w32.f5136i;
            while (i11 < i10) {
            }
            if (this.f8172r) {
            }
            this.f8172r = true;
            z02 = k0Var.a().z0();
            if (!(z02 == null)) {
            }
            k0Var.c(j3);
            Q((z02.f7086h & 4294967295L) | (z02.f7085g << 32));
            if (((int) (j6 >> 32)) == z02.f7085g) {
            }
        } catch (Throwable th) {
            g0Var.W(th);
            throw null;
        }
    }

    @Override // v1.j0, v1.d0
    public final Object g() {
        return this.B;
    }

    @Override // x1.z0
    public final void j(boolean z10) {
        p0 z02;
        k0 k0Var = this.f8166l;
        p0 z03 = k0Var.a().z0();
        if (Boolean.valueOf(z10).equals(z03 != null ? Boolean.valueOf(z03.f8124o) : null) || (z02 = k0Var.a().z0()) == null) {
            return;
        }
        z02.f8124o = z10;
    }

    @Override // x1.a
    public final s k() {
        return this.f8166l.f8088a.I.f7988c;
    }

    @Override // x1.a
    public final void n(wc.i iVar) {
        o0.e w3 = this.f8166l.f8088a.w();
        Object[] objArr = w3.f5134g;
        int i10 = w3.f5136i;
        for (int i11 = 0; i11 < i10; i11++) {
            t0 t0Var = ((g0) objArr[i11]).J.f8104q;
            pc.j.b(t0Var);
            iVar.invoke(t0Var);
        }
    }

    @Override // x1.a
    public final a p() {
        k0 k0Var;
        g0 s10 = this.f8166l.f8088a.s();
        if (s10 == null || (k0Var = s10.J) == null) {
            return null;
        }
        return k0Var.f8104q;
    }

    @Override // x1.a
    public final void r() {
        this.f8180z = true;
        h0 h0Var = this.f8177w;
        h0Var.h();
        k0 k0Var = this.f8166l;
        boolean z10 = k0Var.f8093f;
        g0 g0Var = k0Var.f8088a;
        if (z10) {
            o0.e w3 = g0Var.w();
            Object[] objArr = w3.f5134g;
            int i10 = w3.f5136i;
            for (int i11 = 0; i11 < i10; i11++) {
                g0 g0Var2 = (g0) objArr[i11];
                k0 k0Var2 = g0Var2.J;
                if (k0Var2.f8092e && g0Var2.r() == e0.f8019g) {
                    t0 t0Var = k0Var2.f8104q;
                    pc.j.b(t0Var);
                    t0 t0Var2 = k0Var2.f8104q;
                    s2.a aVar = t0Var2 != null ? t0Var2.f8173s : null;
                    pc.j.b(aVar);
                    if (t0Var.f0(aVar.f6381a)) {
                        g0.R(g0Var, false, 7);
                    }
                }
            }
        }
        r rVar = k().U;
        pc.j.b(rVar);
        if (k0Var.f8094g || (!rVar.f8126q && k0Var.f8093f)) {
            k0Var.f8093f = false;
            c0 c0Var = k0Var.f8091d;
            k0Var.f8091d = c0.f7983j;
            m1 a6 = j0.a(g0Var);
            k0Var.i(false);
            o1 snapshotObserver = ((y1.r) a6).getSnapshotObserver();
            c1.b bVar = new c1.b(8, this, rVar);
            snapshotObserver.getClass();
            if (g0Var.f8047m != null) {
                snapshotObserver.a(g0Var, snapshotObserver.f8137h, bVar);
            } else {
                snapshotObserver.a(g0Var, snapshotObserver.f8134e, bVar);
            }
            k0Var.f8091d = c0Var;
            if (k0Var.f8100m && rVar.f8126q) {
                requestLayout();
            }
            k0Var.f8094g = false;
        }
        if (h0Var.f8068b && h0Var.e()) {
            h0Var.g();
        }
        this.f8180z = false;
    }

    @Override // x1.a
    public final void requestLayout() {
        this.f8166l.f8088a.Q(false);
    }

    @Override // x1.a
    public final boolean s() {
        return this.f8176v != q0.f8152i;
    }
}
