package com.anythink.basead.exoplayer.k;

/* loaded from: classes.dex */
public final class z implements n {

    /* renamed from: a, reason: collision with root package name */
    private final c f8531a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f8532b;

    /* renamed from: c, reason: collision with root package name */
    private long f8533c;

    /* renamed from: d, reason: collision with root package name */
    private long f8534d;

    /* renamed from: e, reason: collision with root package name */
    private com.anythink.basead.exoplayer.v f8535e = com.anythink.basead.exoplayer.v.f8758a;

    public z(c cVar) {
        this.f8531a = cVar;
    }

    public final void a() {
        if (this.f8532b) {
            return;
        }
        this.f8534d = this.f8531a.a();
        this.f8532b = true;
    }

    public final void b() {
        if (this.f8532b) {
            a(d());
            this.f8532b = false;
        }
    }

    @Override // com.anythink.basead.exoplayer.k.n
    public final long d() {
        long j6 = this.f8533c;
        if (!this.f8532b) {
            return j6;
        }
        long a9 = this.f8531a.a() - this.f8534d;
        com.anythink.basead.exoplayer.v vVar = this.f8535e;
        return (vVar.f8759b == 1.0f ? com.anythink.basead.exoplayer.b.b(a9) : vVar.a(a9)) + j6;
    }

    @Override // com.anythink.basead.exoplayer.k.n
    public final com.anythink.basead.exoplayer.v e() {
        return this.f8535e;
    }

    public final void a(long j6) {
        this.f8533c = j6;
        if (this.f8532b) {
            this.f8534d = this.f8531a.a();
        }
    }

    @Override // com.anythink.basead.exoplayer.k.n
    public final com.anythink.basead.exoplayer.v a(com.anythink.basead.exoplayer.v vVar) {
        if (this.f8532b) {
            a(d());
        }
        this.f8535e = vVar;
        return vVar;
    }
}
