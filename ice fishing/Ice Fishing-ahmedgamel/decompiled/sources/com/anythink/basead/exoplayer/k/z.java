package com.anythink.basead.exoplayer.k;

/* loaded from: classes.dex */
public final class z implements n {

    /* renamed from: a, reason: collision with root package name */
    private final c f9317a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f9318b;

    /* renamed from: c, reason: collision with root package name */
    private long f9319c;

    /* renamed from: d, reason: collision with root package name */
    private long f9320d;

    /* renamed from: e, reason: collision with root package name */
    private com.anythink.basead.exoplayer.v f9321e = com.anythink.basead.exoplayer.v.f9544a;

    public z(c cVar) {
        this.f9317a = cVar;
    }

    public final void a() {
        if (this.f9318b) {
            return;
        }
        this.f9320d = this.f9317a.a();
        this.f9318b = true;
    }

    public final void b() {
        if (this.f9318b) {
            a(d());
            this.f9318b = false;
        }
    }

    @Override // com.anythink.basead.exoplayer.k.n
    public final long d() {
        long j6 = this.f9319c;
        if (!this.f9318b) {
            return j6;
        }
        long a9 = this.f9317a.a() - this.f9320d;
        com.anythink.basead.exoplayer.v vVar = this.f9321e;
        return (vVar.f9545b == 1.0f ? com.anythink.basead.exoplayer.b.b(a9) : vVar.a(a9)) + j6;
    }

    @Override // com.anythink.basead.exoplayer.k.n
    public final com.anythink.basead.exoplayer.v e() {
        return this.f9321e;
    }

    public final void a(long j6) {
        this.f9319c = j6;
        if (this.f9318b) {
            this.f9320d = this.f9317a.a();
        }
    }

    @Override // com.anythink.basead.exoplayer.k.n
    public final com.anythink.basead.exoplayer.v a(com.anythink.basead.exoplayer.v vVar) {
        if (this.f9318b) {
            a(d());
        }
        this.f9321e = vVar;
        return vVar;
    }
}
