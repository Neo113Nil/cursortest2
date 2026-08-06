package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.hl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0466hl implements InterfaceC0753so {

    /* renamed from: a, reason: collision with root package name */
    public final C0911z0 f6150a;

    public C0466hl(C0911z0 c0911z0) {
        this.f6150a = c0911z0;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0753so
    public final C0702qo a(Void r3) {
        this.f6150a.getClass();
        return C0911z0.a() ? new C0702qo(this, true, "") : new C0702qo(this, false, "AppMetrica isn't initialized. Use AppMetrica#activate(android.content.Context, String) method to activate.");
    }

    public final C0702qo a() {
        return a((Void) null);
    }
}
