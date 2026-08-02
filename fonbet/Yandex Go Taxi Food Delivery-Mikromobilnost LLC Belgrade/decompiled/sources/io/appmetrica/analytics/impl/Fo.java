package io.appmetrica.analytics.impl;

/* loaded from: classes9.dex */
public final class Fo implements Vr {
    public final F0 a;

    public Fo(F0 f0) {
        this.a = f0;
    }

    @Override // io.appmetrica.analytics.impl.Vr
    public final Tr a(Void r3) {
        this.a.getClass();
        return F0.a() ? new Tr(this, true, "") : new Tr(this, false, "AppMetrica isn't initialized. Use AppMetrica#activate(android.content.Context, String) method to activate.");
    }

    public final Tr a() {
        return a((Void) null);
    }
}
