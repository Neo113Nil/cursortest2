package io.appmetrica.analytics.impl;

/* loaded from: classes5.dex */
public final class Hd implements P2 {
    public final /* synthetic */ Id a;

    public Hd(Id id) {
        this.a = id;
    }

    @Override // io.appmetrica.analytics.impl.P2
    public final void a() {
        Id id = this.a;
        C0237el c0237el = id.h;
        c0237el.c.a(id.b.a);
    }

    @Override // io.appmetrica.analytics.impl.P2
    public final void onResume() {
        Id id = this.a;
        C0237el c0237el = id.h;
        c0237el.c.b(id.b.a);
    }
}
