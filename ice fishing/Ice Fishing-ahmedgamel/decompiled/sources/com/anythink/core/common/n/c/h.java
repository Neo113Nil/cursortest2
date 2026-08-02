package com.anythink.core.common.n.c;

/* loaded from: classes.dex */
public abstract class h implements v {

    /* renamed from: a, reason: collision with root package name */
    private final v f16653a;

    public h(v vVar) {
        if (vVar == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.f16653a = vVar;
    }

    private v b() {
        return this.f16653a;
    }

    @Override // com.anythink.core.common.n.c.v
    public void a(c cVar, long j6) {
        this.f16653a.a(cVar, j6);
    }

    @Override // com.anythink.core.common.n.c.v, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f16653a.close();
    }

    @Override // com.anythink.core.common.n.c.v, java.io.Flushable
    public void flush() {
        this.f16653a.flush();
    }

    public String toString() {
        return getClass().getSimpleName() + "(" + this.f16653a.toString() + ")";
    }

    @Override // com.anythink.core.common.n.c.v
    public final x a() {
        return this.f16653a.a();
    }
}
