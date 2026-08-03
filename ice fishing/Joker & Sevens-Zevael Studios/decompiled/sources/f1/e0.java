package f1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class e0 implements s2.c {

    /* renamed from: g, reason: collision with root package name */
    public int f2225g;

    /* renamed from: h, reason: collision with root package name */
    public float f2226h;

    /* renamed from: i, reason: collision with root package name */
    public float f2227i;

    /* renamed from: j, reason: collision with root package name */
    public float f2228j;

    /* renamed from: k, reason: collision with root package name */
    public float f2229k;

    /* renamed from: l, reason: collision with root package name */
    public long f2230l;

    /* renamed from: m, reason: collision with root package name */
    public long f2231m;

    /* renamed from: n, reason: collision with root package name */
    public float f2232n;

    /* renamed from: o, reason: collision with root package name */
    public float f2233o;

    /* renamed from: p, reason: collision with root package name */
    public long f2234p;

    /* renamed from: q, reason: collision with root package name */
    public g0 f2235q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f2236r;

    /* renamed from: s, reason: collision with root package name */
    public long f2237s;

    /* renamed from: t, reason: collision with root package name */
    public s2.c f2238t;

    /* renamed from: u, reason: collision with root package name */
    public s2.l f2239u;

    /* renamed from: v, reason: collision with root package name */
    public int f2240v;

    /* renamed from: w, reason: collision with root package name */
    public b0 f2241w;

    public final void a(float f10) {
        if (this.f2228j == f10) {
            return;
        }
        this.f2225g |= 4;
        this.f2228j = f10;
    }

    public final void b(long j3) {
        if (q.c(this.f2230l, j3)) {
            return;
        }
        this.f2225g |= 64;
        this.f2230l = j3;
    }

    @Override // s2.c
    public final float c() {
        return this.f2238t.c();
    }

    public final void e(boolean z10) {
        if (this.f2236r != z10) {
            this.f2225g |= 16384;
            this.f2236r = z10;
        }
    }

    public final void f(float f10) {
        if (this.f2232n == f10) {
            return;
        }
        this.f2225g |= 1024;
        this.f2232n = f10;
    }

    public final void g(float f10) {
        if (this.f2226h == f10) {
            return;
        }
        this.f2225g |= 1;
        this.f2226h = f10;
    }

    public final void h(float f10) {
        if (this.f2227i == f10) {
            return;
        }
        this.f2225g |= 2;
        this.f2227i = f10;
    }

    public final void i(float f10) {
        if (this.f2229k == f10) {
            return;
        }
        this.f2225g |= 32;
        this.f2229k = f10;
    }

    public final void j(g0 g0Var) {
        if (pc.j.a(this.f2235q, g0Var)) {
            return;
        }
        this.f2225g |= 8192;
        this.f2235q = g0Var;
    }

    public final void k(long j3) {
        if (q.c(this.f2231m, j3)) {
            return;
        }
        this.f2225g |= 128;
        this.f2231m = j3;
    }

    @Override // s2.c
    public final float m() {
        return this.f2238t.m();
    }

    public final void n(long j3) {
        if (j0.a(this.f2234p, j3)) {
            return;
        }
        this.f2225g |= 4096;
        this.f2234p = j3;
    }
}
