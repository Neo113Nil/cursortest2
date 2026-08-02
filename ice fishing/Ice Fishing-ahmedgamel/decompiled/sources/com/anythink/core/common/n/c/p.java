package com.anythink.core.common.n.c;

/* loaded from: classes.dex */
final class p implements w {

    /* renamed from: a, reason: collision with root package name */
    private final e f16685a;

    /* renamed from: b, reason: collision with root package name */
    private final c f16686b;

    /* renamed from: c, reason: collision with root package name */
    private s f16687c;

    /* renamed from: d, reason: collision with root package name */
    private int f16688d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f16689e;

    /* renamed from: f, reason: collision with root package name */
    private long f16690f;

    public p(e eVar) {
        this.f16685a = eVar;
        c c9 = eVar.c();
        this.f16686b = c9;
        s sVar = c9.f16633b;
        this.f16687c = sVar;
        this.f16688d = sVar != null ? sVar.f16702d : -1;
    }

    @Override // com.anythink.core.common.n.c.w
    public final x a() {
        return this.f16685a.a();
    }

    @Override // com.anythink.core.common.n.c.w
    public final long a_(c cVar, long j6) {
        s sVar;
        s sVar2;
        if (this.f16689e) {
            throw new IllegalStateException("closed");
        }
        s sVar3 = this.f16687c;
        if (sVar3 != null && (sVar3 != (sVar2 = this.f16686b.f16633b) || this.f16688d != sVar2.f16702d)) {
            throw new IllegalStateException("Peek source is invalid because upstream source was used");
        }
        this.f16685a.b(this.f16690f + j6);
        if (this.f16687c == null && (sVar = this.f16686b.f16633b) != null) {
            this.f16687c = sVar;
            this.f16688d = sVar.f16702d;
        }
        long min = Math.min(j6, this.f16686b.f16634c - this.f16690f);
        if (min <= 0) {
            return -1L;
        }
        this.f16686b.a(cVar, this.f16690f, min);
        this.f16690f += min;
        return min;
    }

    @Override // com.anythink.core.common.n.c.w, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f16689e = true;
    }
}
