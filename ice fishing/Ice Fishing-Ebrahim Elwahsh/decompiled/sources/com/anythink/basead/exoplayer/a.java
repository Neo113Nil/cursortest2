package com.anythink.basead.exoplayer;

import com.anythink.basead.exoplayer.k.C0544a;

/* loaded from: classes.dex */
public abstract class a implements y, z {

    /* renamed from: n, reason: collision with root package name */
    private final int f6437n;

    /* renamed from: o, reason: collision with root package name */
    private aa f6438o;

    /* renamed from: p, reason: collision with root package name */
    private int f6439p;

    /* renamed from: q, reason: collision with root package name */
    private int f6440q;

    /* renamed from: r, reason: collision with root package name */
    private com.anythink.basead.exoplayer.h.y f6441r;

    /* renamed from: s, reason: collision with root package name */
    private m[] f6442s;

    /* renamed from: t, reason: collision with root package name */
    private long f6443t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f6444u = true;

    /* renamed from: v, reason: collision with root package name */
    private boolean f6445v;

    public a(int i) {
        this.f6437n = i;
    }

    @Override // com.anythink.basead.exoplayer.x.b
    public void a(int i, Object obj) {
    }

    @Override // com.anythink.basead.exoplayer.y
    public final int a_() {
        return this.f6440q;
    }

    @Override // com.anythink.basead.exoplayer.y
    public final z b() {
        return this;
    }

    @Override // com.anythink.basead.exoplayer.y
    public final void b_() {
        C0544a.b(this.f6440q == 1);
        this.f6440q = 2;
        n();
    }

    @Override // com.anythink.basead.exoplayer.y
    public com.anythink.basead.exoplayer.k.n c() {
        return null;
    }

    @Override // com.anythink.basead.exoplayer.y
    public final com.anythink.basead.exoplayer.h.y f() {
        return this.f6441r;
    }

    @Override // com.anythink.basead.exoplayer.y
    public final boolean g() {
        return this.f6444u;
    }

    @Override // com.anythink.basead.exoplayer.y
    public final void h() {
        this.f6445v = true;
    }

    @Override // com.anythink.basead.exoplayer.y
    public final boolean i() {
        return this.f6445v;
    }

    @Override // com.anythink.basead.exoplayer.y
    public final void j() {
        this.f6441r.c();
    }

    @Override // com.anythink.basead.exoplayer.y
    public final void k() {
        C0544a.b(this.f6440q == 2);
        this.f6440q = 1;
        o();
    }

    @Override // com.anythink.basead.exoplayer.y
    public final void l() {
        C0544a.b(this.f6440q == 1);
        this.f6440q = 0;
        this.f6441r = null;
        this.f6442s = null;
        this.f6445v = false;
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
        return this.f6442s;
    }

    public final aa r() {
        return this.f6438o;
    }

    public final int s() {
        return this.f6439p;
    }

    public final boolean t() {
        return this.f6444u ? this.f6445v : this.f6441r.b();
    }

    public void a(long j9, boolean z8) {
    }

    public final int b(long j9) {
        return this.f6441r.a(j9 - this.f6443t);
    }

    public void a(boolean z8) {
    }

    public void a(m[] mVarArr, long j9) {
    }

    @Override // com.anythink.basead.exoplayer.y, com.anythink.basead.exoplayer.z
    public final int a() {
        return this.f6437n;
    }

    @Override // com.anythink.basead.exoplayer.y
    public final void a(int i) {
        this.f6439p = i;
    }

    @Override // com.anythink.basead.exoplayer.y
    public final void a(aa aaVar, m[] mVarArr, com.anythink.basead.exoplayer.h.y yVar, long j9, boolean z8, long j10) {
        C0544a.b(this.f6440q == 0);
        this.f6438o = aaVar;
        this.f6440q = 1;
        a(z8);
        a(mVarArr, yVar, j10);
        a(j9, z8);
    }

    @Override // com.anythink.basead.exoplayer.y
    public final void a(m[] mVarArr, com.anythink.basead.exoplayer.h.y yVar, long j9) {
        C0544a.b(!this.f6445v);
        this.f6441r = yVar;
        this.f6444u = false;
        this.f6442s = mVarArr;
        this.f6443t = j9;
        a(mVarArr, j9);
    }

    @Override // com.anythink.basead.exoplayer.y
    public final void a(long j9) {
        this.f6445v = false;
        this.f6444u = false;
        a(j9, false);
    }

    public final int a(n nVar, com.anythink.basead.exoplayer.c.e eVar, boolean z8) {
        int a9 = this.f6441r.a(nVar, eVar, z8);
        if (a9 == -4) {
            if (eVar.c()) {
                this.f6444u = true;
                return this.f6445v ? -4 : -3;
            }
            eVar.f6900f += this.f6443t;
            return a9;
        }
        if (a9 == -5) {
            m mVar = nVar.f8840a;
            long j9 = mVar.f8825l;
            if (j9 != Long.MAX_VALUE) {
                nVar.f8840a = mVar.a(j9 + this.f6443t);
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
