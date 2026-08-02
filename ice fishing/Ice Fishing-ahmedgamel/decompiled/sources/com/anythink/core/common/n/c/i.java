package com.anythink.core.common.n.c;

/* loaded from: classes.dex */
public abstract class i implements w {

    /* renamed from: a, reason: collision with root package name */
    private final w f16654a;

    public i(w wVar) {
        if (wVar == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.f16654a = wVar;
    }

    @Override // com.anythink.core.common.n.c.w
    public final x a() {
        return this.f16654a.a();
    }

    @Override // com.anythink.core.common.n.c.w
    public long a_(c cVar, long j6) {
        return this.f16654a.a_(cVar, j6);
    }

    public final w b() {
        return this.f16654a;
    }

    @Override // com.anythink.core.common.n.c.w, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f16654a.close();
    }

    public String toString() {
        return getClass().getSimpleName() + "(" + this.f16654a.toString() + ")";
    }
}
