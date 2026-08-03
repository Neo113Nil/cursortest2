package x1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    public final g0 f8088a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f8089b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f8090c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f8092e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f8093f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f8094g;

    /* renamed from: h, reason: collision with root package name */
    public int f8095h;

    /* renamed from: i, reason: collision with root package name */
    public int f8096i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f8097j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f8098k;

    /* renamed from: l, reason: collision with root package name */
    public int f8099l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f8100m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f8101n;

    /* renamed from: o, reason: collision with root package name */
    public int f8102o;

    /* renamed from: q, reason: collision with root package name */
    public t0 f8104q;

    /* renamed from: d, reason: collision with root package name */
    public c0 f8091d = c0.f7984k;

    /* renamed from: p, reason: collision with root package name */
    public final x0 f8103p = new x0(this);

    public k0(g0 g0Var) {
        this.f8088a = g0Var;
    }

    public final f1 a() {
        return this.f8088a.I.f7989d;
    }

    public final void b() {
        c0 c0Var = this.f8088a.J.f8091d;
        c0 c0Var2 = c0.f7982i;
        c0 c0Var3 = c0.f7983j;
        if (c0Var == c0Var2 || c0Var == c0Var3) {
            if (this.f8103p.F) {
                g(true);
            } else {
                f(true);
            }
        }
        if (c0Var == c0Var3) {
            t0 t0Var = this.f8104q;
            if (t0Var == null || !t0Var.f8180z) {
                h(true);
            } else {
                i(true);
            }
        }
    }

    public final void c(long j3) {
        t0 t0Var = this.f8104q;
        if (t0Var != null) {
            k0 k0Var = t0Var.f8166l;
            k0Var.f8091d = c0.f7981h;
            x0 x0Var = k0Var.f8103p;
            g0 g0Var = k0Var.f8088a;
            k0Var.f8092e = false;
            o1 snapshotObserver = ((y1.r) j0.a(g0Var)).getSnapshotObserver();
            r0 r0Var = new r0(t0Var, j3);
            snapshotObserver.getClass();
            if (g0Var.f8047m != null) {
                snapshotObserver.a(g0Var, snapshotObserver.f8131b, r0Var);
            } else {
                snapshotObserver.a(g0Var, snapshotObserver.f8132c, r0Var);
            }
            k0Var.f8093f = true;
            k0Var.f8094g = true;
            if (f.r(g0Var)) {
                x0Var.A = true;
                x0Var.B = true;
            } else {
                x0Var.f8215z = true;
            }
            k0Var.f8091d = c0.f7984k;
        }
    }

    public final void d(int i10) {
        int i11 = this.f8099l;
        this.f8099l = i10;
        if ((i11 == 0) != (i10 == 0)) {
            g0 s10 = this.f8088a.s();
            k0 k0Var = s10 != null ? s10.J : null;
            if (k0Var != null) {
                if (i10 == 0) {
                    k0Var.d(k0Var.f8099l - 1);
                } else {
                    k0Var.d(k0Var.f8099l + 1);
                }
            }
        }
    }

    public final void e(int i10) {
        int i11 = this.f8102o;
        this.f8102o = i10;
        if ((i11 == 0) != (i10 == 0)) {
            g0 s10 = this.f8088a.s();
            k0 k0Var = s10 != null ? s10.J : null;
            if (k0Var != null) {
                if (i10 == 0) {
                    k0Var.e(k0Var.f8102o - 1);
                } else {
                    k0Var.e(k0Var.f8102o + 1);
                }
            }
        }
    }

    public final void f(boolean z10) {
        if (this.f8098k != z10) {
            this.f8098k = z10;
            if (z10 && !this.f8097j) {
                d(this.f8099l + 1);
            } else {
                if (z10 || this.f8097j) {
                    return;
                }
                d(this.f8099l - 1);
            }
        }
    }

    public final void g(boolean z10) {
        if (this.f8097j != z10) {
            this.f8097j = z10;
            if (z10 && !this.f8098k) {
                d(this.f8099l + 1);
            } else {
                if (z10 || this.f8098k) {
                    return;
                }
                d(this.f8099l - 1);
            }
        }
    }

    public final void h(boolean z10) {
        if (this.f8101n != z10) {
            this.f8101n = z10;
            if (z10 && !this.f8100m) {
                e(this.f8102o + 1);
            } else {
                if (z10 || this.f8100m) {
                    return;
                }
                e(this.f8102o - 1);
            }
        }
    }

    public final void i(boolean z10) {
        if (this.f8100m != z10) {
            this.f8100m = z10;
            if (z10 && !this.f8101n) {
                e(this.f8102o + 1);
            } else {
                if (z10 || this.f8101n) {
                    return;
                }
                e(this.f8102o - 1);
            }
        }
    }

    public final void j() {
        x0 x0Var = this.f8103p;
        k0 k0Var = x0Var.f8201l;
        Object obj = x0Var.f8212w;
        g0 g0Var = this.f8088a;
        if ((obj != null || k0Var.a().g() != null) && x0Var.f8211v) {
            x0Var.f8211v = false;
            x0Var.f8212w = k0Var.a().g();
            g0 s10 = g0Var.s();
            if (s10 != null) {
                g0.T(s10, false, 7);
            }
        }
        t0 t0Var = this.f8104q;
        if (t0Var != null) {
            k0 k0Var2 = t0Var.f8166l;
            if (t0Var.B == null) {
                p0 z02 = k0Var2.a().z0();
                pc.j.b(z02);
                if (z02.f8141u.g() == null) {
                    return;
                }
            }
            if (t0Var.A) {
                t0Var.A = false;
                p0 z03 = k0Var2.a().z0();
                pc.j.b(z03);
                t0Var.B = z03.f8141u.g();
                if (f.r(g0Var)) {
                    g0 s11 = g0Var.s();
                    if (s11 != null) {
                        g0.T(s11, false, 7);
                        return;
                    }
                    return;
                }
                g0 s12 = g0Var.s();
                if (s12 != null) {
                    g0.R(s12, false, 7);
                }
            }
        }
    }
}
