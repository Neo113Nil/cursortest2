package com.anythink.core.common.n.c;

/* loaded from: classes.dex */
public abstract class i implements w {

    /* renamed from: a, reason: collision with root package name */
    private final w f16025a;

    public i(w wVar) {
        if (wVar == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.f16025a = wVar;
    }

    @Override // com.anythink.core.common.n.c.w
    public final x a() {
        return this.f16025a.a();
    }

    @Override // com.anythink.core.common.n.c.w
    public long a_(c cVar, long j9) {
        return this.f16025a.a_(cVar, j9);
    }

    public final w b() {
        return this.f16025a;
    }

    @Override // com.anythink.core.common.n.c.w, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f16025a.close();
    }

    public String toString() {
        return getClass().getSimpleName() + "(" + this.f16025a.toString() + ")";
    }
}
