package com.anythink.basead.exoplayer;

/* loaded from: classes.dex */
public abstract class a implements y, z {

    /* renamed from: n, reason: collision with root package name */
    private final int f6280n;

    /* renamed from: o, reason: collision with root package name */
    private aa f6281o;

    /* renamed from: p, reason: collision with root package name */
    private int f6282p;

    /* renamed from: q, reason: collision with root package name */
    private int f6283q;

    /* renamed from: r, reason: collision with root package name */
    private com.anythink.basead.exoplayer.h.y f6284r;

    /* renamed from: s, reason: collision with root package name */
    private m[] f6285s;

    /* renamed from: t, reason: collision with root package name */
    private long f6286t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f6287u = true;

    /* renamed from: v, reason: collision with root package name */
    private boolean f6288v;

    public a(int i) {
        this.f6280n = i;
    }

    @Override // com.anythink.basead.exoplayer.x.b
    public void a(int i, Object obj) {
    }

    @Override // com.anythink.basead.exoplayer.y
    public final int a_() {
        return this.f6283q;
    }

    @Override // com.anythink.basead.exoplayer.y
    public final z b() {
        return this;
    }

    @Override // com.anythink.basead.exoplayer.y
    public final void b_() {
        com.anythink.basead.exoplayer.k.a.b(this.f6283q == 1);
        this.f6283q = 2;
        n();
    }

    @Override // com.anythink.basead.exoplayer.y
    public com.anythink.basead.exoplayer.k.n c() {
        return null;
    }

    @Override // com.anythink.basead.exoplayer.y
    public final com.anythink.basead.exoplayer.h.y f() {
        return this.f6284r;
    }

    @Override // com.anythink.basead.exoplayer.y
    public final boolean g() {
        return this.f6287u;
    }

    @Override // com.anythink.basead.exoplayer.y
    public final void h() {
        this.f6288v = true;
    }

    @Override // com.anythink.basead.exoplayer.y
    public final boolean i() {
        return this.f6288v;
    }

    @Override // com.anythink.basead.exoplayer.y
    public final void j() {
        this.f6284r.c();
    }

    @Override // com.anythink.basead.exoplayer.y
    public final void k() {
        com.anythink.basead.exoplayer.k.a.b(this.f6283q == 2);
        this.f6283q = 1;
        o();
    }

    @Override // com.anythink.basead.exoplayer.y
    public final void l() {
        com.anythink.basead.exoplayer.k.a.b(this.f6283q == 1);
        this.f6283q = 0;
        this.f6284r = null;
        this.f6285s = null;
        this.f6288v = false;
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
        return this.f6285s;
    }

    public final aa r() {
        return this.f6281o;
    }

    public final int s() {
        return this.f6282p;
    }

    public final boolean t() {
        return this.f6287u ? this.f6288v : this.f6284r.b();
    }

    public void a(long j6, boolean z3) {
    }

    public final int b(long j6) {
        return this.f6284r.a(j6 - this.f6286t);
    }

    public void a(boolean z3) {
    }

    public void a(m[] mVarArr, long j6) {
    }

    @Override // com.anythink.basead.exoplayer.y, com.anythink.basead.exoplayer.z
    public final int a() {
        return this.f6280n;
    }

    @Override // com.anythink.basead.exoplayer.y
    public final void a(int i) {
        this.f6282p = i;
    }

    @Override // com.anythink.basead.exoplayer.y
    public final void a(aa aaVar, m[] mVarArr, com.anythink.basead.exoplayer.h.y yVar, long j6, boolean z3, long j9) {
        com.anythink.basead.exoplayer.k.a.b(this.f6283q == 0);
        this.f6281o = aaVar;
        this.f6283q = 1;
        a(z3);
        a(mVarArr, yVar, j9);
        a(j6, z3);
    }

    @Override // com.anythink.basead.exoplayer.y
    public final void a(m[] mVarArr, com.anythink.basead.exoplayer.h.y yVar, long j6) {
        com.anythink.basead.exoplayer.k.a.b(!this.f6288v);
        this.f6284r = yVar;
        this.f6287u = false;
        this.f6285s = mVarArr;
        this.f6286t = j6;
        a(mVarArr, j6);
    }

    @Override // com.anythink.basead.exoplayer.y
    public final void a(long j6) {
        this.f6288v = false;
        this.f6287u = false;
        a(j6, false);
    }

    public final int a(n nVar, com.anythink.basead.exoplayer.c.e eVar, boolean z3) {
        int a9 = this.f6284r.a(nVar, eVar, z3);
        if (a9 == -4) {
            if (eVar.c()) {
                this.f6287u = true;
                return this.f6288v ? -4 : -3;
            }
            eVar.f6743f += this.f6286t;
            return a9;
        }
        if (a9 == -5) {
            m mVar = nVar.f8683a;
            long j6 = mVar.f8668l;
            if (j6 != Long.MAX_VALUE) {
                nVar.f8683a = mVar.a(j6 + this.f6286t);
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
