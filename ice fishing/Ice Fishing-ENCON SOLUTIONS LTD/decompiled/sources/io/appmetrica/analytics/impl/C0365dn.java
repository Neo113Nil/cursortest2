package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.dn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0365dn implements Ln {

    /* renamed from: a, reason: collision with root package name */
    public final Ln f5845a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f5846b;

    public C0365dn(Ln ln, Object obj) {
        this.f5845a = ln;
        this.f5846b = obj;
    }

    @Override // io.appmetrica.analytics.impl.Ln
    public final Object a(Object obj) {
        return obj != this.f5845a.a(obj) ? this.f5846b : obj;
    }
}
