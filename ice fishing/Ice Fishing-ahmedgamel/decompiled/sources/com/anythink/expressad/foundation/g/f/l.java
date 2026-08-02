package com.anythink.expressad.foundation.g.f;

/* loaded from: classes.dex */
public final class l<T> {

    /* renamed from: a, reason: collision with root package name */
    public T f20185a;

    /* renamed from: b, reason: collision with root package name */
    public com.anythink.expressad.foundation.g.f.a.a f20186b;

    /* renamed from: c, reason: collision with root package name */
    public com.anythink.expressad.foundation.g.f.f.c f20187c;

    private l(T t6, com.anythink.expressad.foundation.g.f.f.c cVar) {
        this.f20186b = null;
        this.f20185a = t6;
        this.f20187c = cVar;
    }

    private boolean a() {
        return this.f20186b == null;
    }

    public static <T> l<T> a(T t6, com.anythink.expressad.foundation.g.f.f.c cVar) {
        return new l<>(t6, cVar);
    }

    public static <T> l<T> a(com.anythink.expressad.foundation.g.f.a.a aVar) {
        return new l<>(aVar);
    }

    private l(com.anythink.expressad.foundation.g.f.a.a aVar) {
        this.f20185a = null;
        this.f20187c = null;
        this.f20186b = aVar;
    }
}
