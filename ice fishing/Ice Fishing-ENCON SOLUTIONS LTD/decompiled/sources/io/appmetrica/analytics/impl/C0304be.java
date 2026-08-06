package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.be, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0304be implements InterfaceC0753so {

    /* renamed from: a, reason: collision with root package name */
    public final String f5669a;

    public C0304be(String str) {
        this.f5669a = str;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0753so
    public final C0702qo a(Object obj) {
        return obj == null ? new C0702qo(this, false, C1.a.k(new StringBuilder(), this.f5669a, " is null.")) : new C0702qo(this, true, "");
    }

    public final String a() {
        return this.f5669a;
    }
}
