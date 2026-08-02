package io.appmetrica.analytics.impl;

/* loaded from: classes9.dex */
public final class Xd implements P2 {
    public final /* synthetic */ Yd a;

    public Xd(Yd yd) {
        this.a = yd;
    }

    @Override // io.appmetrica.analytics.impl.P2
    public final void a() {
        Yd yd = this.a;
        C0600ol c0600ol = yd.h;
        c0600ol.c.a(yd.b.a);
    }

    @Override // io.appmetrica.analytics.impl.P2
    public final void onResume() {
        Yd yd = this.a;
        C0600ol c0600ol = yd.h;
        c0600ol.c.b(yd.b.a);
    }
}
