package com.anythink.core.common.n.c;

/* loaded from: classes.dex */
public abstract class h implements v {

    /* renamed from: a, reason: collision with root package name */
    private final v f15866a;

    public h(v vVar) {
        if (vVar == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.f15866a = vVar;
    }

    private v b() {
        return this.f15866a;
    }

    @Override // com.anythink.core.common.n.c.v
    public void a(c cVar, long j6) {
        this.f15866a.a(cVar, j6);
    }

    @Override // com.anythink.core.common.n.c.v, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f15866a.close();
    }

    @Override // com.anythink.core.common.n.c.v, java.io.Flushable
    public void flush() {
        this.f15866a.flush();
    }

    public String toString() {
        return getClass().getSimpleName() + "(" + this.f15866a.toString() + ")";
    }

    @Override // com.anythink.core.common.n.c.v
    public final x a() {
        return this.f15866a.a();
    }
}
