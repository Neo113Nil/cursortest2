package com.anythink.basead.exoplayer;

/* loaded from: classes.dex */
public abstract class a implements y, z {

    /* renamed from: n, reason: collision with root package name */
    private final int f7066n;

    /* renamed from: o, reason: collision with root package name */
    private aa f7067o;

    /* renamed from: p, reason: collision with root package name */
    private int f7068p;

    /* renamed from: q, reason: collision with root package name */
    private int f7069q;

    /* renamed from: r, reason: collision with root package name */
    private com.anythink.basead.exoplayer.h.y f7070r;

    /* renamed from: s, reason: collision with root package name */
    private m[] f7071s;

    /* renamed from: t, reason: collision with root package name */
    private long f7072t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f7073u = true;

    /* renamed from: v, reason: collision with root package name */
    private boolean f7074v;

    public a(int i) {
        this.f7066n = i;
    }

    @Override // com.anythink.basead.exoplayer.x.b
    public void a(int i, Object obj) {
    }

    @Override // com.anythink.basead.exoplayer.y
    public final int a_() {
        return this.f7069q;
    }

    @Override // com.anythink.basead.exoplayer.y
    public final z b() {
        return this;
    }

    @Override // com.anythink.basead.exoplayer.y
    public final void b_() {
        com.anythink.basead.exoplayer.k.a.b(this.f7069q == 1);
        this.f7069q = 2;
        n();
    }

    @Override // com.anythink.basead.exoplayer.y
    public com.anythink.basead.exoplayer.k.n c() {
        return null;
    }

    @Override // com.anythink.basead.exoplayer.y
    public final com.anythink.basead.exoplayer.h.y f() {
        return this.f7070r;
    }

    @Override // com.anythink.basead.exoplayer.y
    public final boolean g() {
        return this.f7073u;
    }

    @Override // com.anythink.basead.exoplayer.y
    public final void h() {
        this.f7074v = true;
    }

    @Override // com.anythink.basead.exoplayer.y
    public final boolean i() {
        return this.f7074v;
    }

    @Override // com.anythink.basead.exoplayer.y
    public final void j() {
        this.f7070r.c();
    }

    @Override // com.anythink.basead.exoplayer.y
    public final void k() {
        com.anythink.basead.exoplayer.k.a.b(this.f7069q == 2);
        this.f7069q = 1;
        o();
    }

    @Override // com.anythink.basead.exoplayer.y
    public final void l() {
        com.anythink.basead.exoplayer.k.a.b(this.f7069q == 1);
        this.f7069q = 0;
        this.f7070r = null;
        this.f7071s = null;
        this.f7074v = false;
        p();
    }

    @Override // com.anythink.basead.exoplayer.z
    public int m() {
        return 0;
    }

    public void n() {
    }

    public void o() {
    }

    public void p() {
    }

    public final m[] q() {
        return this.f7071s;
    }

    public final aa r() {
        return this.f7067o;
    }

    public final int s() {
        return this.f7068p;
    }

    public final boolean t() {
        return this.f7073u ? this.f7074v : this.f7070r.b();
    }

    public void a(long j6, boolean z6) {
    }

    public final int b(long j6) {
        return this.f7070r.a(j6 - this.f7072t);
    }

    public void a(boolean z6) {
    }

    public void a(m[] mVarArr, long j6) {
    }

    @Override // com.anythink.basead.exoplayer.y, com.anythink.basead.exoplayer.z
    public final int a() {
        return this.f7066n;
    }

    @Override // com.anythink.basead.exoplayer.y
    public final void a(int i) {
        this.f7068p = i;
    }

    @Override // com.anythink.basead.exoplayer.y
    public final void a(aa aaVar, m[] mVarArr, com.anythink.basead.exoplayer.h.y yVar, long j6, boolean z6, long j9) {
        com.anythink.basead.exoplayer.k.a.b(this.f7069q == 0);
        this.f7067o = aaVar;
        this.f7069q = 1;
        a(z6);
        a(mVarArr, yVar, j9);
        a(j6, z6);
    }

    @Override // com.anythink.basead.exoplayer.y
    public final void a(m[] mVarArr, com.anythink.basead.exoplayer.h.y yVar, long j6) {
        com.anythink.basead.exoplayer.k.a.b(!this.f7074v);
        this.f7070r = yVar;
        this.f7073u = false;
        this.f7071s = mVarArr;
        this.f7072t = j6;
        a(mVarArr, j6);
    }

    @Override // com.anythink.basead.exoplayer.y
    public final void a(long j6) {
        this.f7074v = false;
        this.f7073u = false;
        a(j6, false);
    }

    public final int a(n nVar, com.anythink.basead.exoplayer.c.e eVar, boolean z6) {
        int a9 = this.f7070r.a(nVar, eVar, z6);
        if (a9 == -4) {
            if (eVar.c()) {
                this.f7073u = true;
                return this.f7074v ? -4 : -3;
            }
            eVar.f7529f += this.f7072t;
            return a9;
        }
        if (a9 == -5) {
            m mVar = nVar.f9469a;
            long j6 = mVar.f9454l;
            if (j6 != Long.MAX_VALUE) {
                nVar.f9469a = mVar.a(j6 + this.f7072t);
            }
        }
        return a9;
    }

    public static boolean a(com.anythink.basead.exoplayer.d.g<?> gVar, com.anythink.basead.exoplayer.d.e eVar) {
        if (eVar == null) {
            return true;
        }
        if (gVar == null) {
            return false;
        }
        return gVar.a(eVar);
    }
}
