package com.anythink.core.common.n.c;

/* loaded from: classes.dex */
final class p implements w {

    /* renamed from: a, reason: collision with root package name */
    private final e f15898a;

    /* renamed from: b, reason: collision with root package name */
    private final c f15899b;

    /* renamed from: c, reason: collision with root package name */
    private s f15900c;

    /* renamed from: d, reason: collision with root package name */
    private int f15901d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f15902e;

    /* renamed from: f, reason: collision with root package name */
    private long f15903f;

    public p(e eVar) {
        this.f15898a = eVar;
        c c9 = eVar.c();
        this.f15899b = c9;
        s sVar = c9.f15846b;
        this.f15900c = sVar;
        this.f15901d = sVar != null ? sVar.f15915d : -1;
    }

    @Override // com.anythink.core.common.n.c.w
    public final x a() {
        return this.f15898a.a();
    }

    @Override // com.anythink.core.common.n.c.w
    public final long a_(c cVar, long j6) {
        s sVar;
        s sVar2;
        if (this.f15902e) {
            throw new IllegalStateException("closed");
        }
        s sVar3 = this.f15900c;
        if (sVar3 != null && (sVar3 != (sVar2 = this.f15899b.f15846b) || this.f15901d != sVar2.f15915d)) {
            throw new IllegalStateException("Peek source is invalid because upstream source was used");
        }
        this.f15898a.b(this.f15903f + j6);
        if (this.f15900c == null && (sVar = this.f15899b.f15846b) != null) {
            this.f15900c = sVar;
            this.f15901d = sVar.f15915d;
        }
        long min = Math.min(j6, this.f15899b.f15847c - this.f15903f);
        if (min <= 0) {
            return -1L;
        }
        this.f15899b.a(cVar, this.f15903f, min);
        this.f15903f += min;
        return min;
    }

    @Override // com.anythink.core.common.n.c.w, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f15902e = true;
    }
}
