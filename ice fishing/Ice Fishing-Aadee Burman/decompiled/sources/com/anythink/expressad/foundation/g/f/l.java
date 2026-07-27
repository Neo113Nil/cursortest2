package com.anythink.expressad.foundation.g.f;

/* loaded from: classes.dex */
public final class l<T> {

    /* renamed from: a, reason: collision with root package name */
    public T f19398a;

    /* renamed from: b, reason: collision with root package name */
    public com.anythink.expressad.foundation.g.f.a.a f19399b;

    /* renamed from: c, reason: collision with root package name */
    public com.anythink.expressad.foundation.g.f.f.c f19400c;

    private l(T t6, com.anythink.expressad.foundation.g.f.f.c cVar) {
        this.f19399b = null;
        this.f19398a = t6;
        this.f19400c = cVar;
    }

    private boolean a() {
        return this.f19399b == null;
    }

    public static <T> l<T> a(T t6, com.anythink.expressad.foundation.g.f.f.c cVar) {
        return new l<>(t6, cVar);
    }

    public static <T> l<T> a(com.anythink.expressad.foundation.g.f.a.a aVar) {
        return new l<>(aVar);
    }

    private l(com.anythink.expressad.foundation.g.f.a.a aVar) {
        this.f19398a = null;
        this.f19400c = null;
        this.f19399b = aVar;
    }
}
