package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Wg extends Rg {

    /* renamed from: b, reason: collision with root package name */
    public final C0883xo f5308b;

    public Wg(X4 x4) {
        this(x4, x4.u());
    }

    @Override // io.appmetrica.analytics.impl.Rg
    public final boolean a(P5 p5) {
        X4 x4 = this.f4998a;
        if (this.f5308b.c()) {
            return false;
        }
        if (!this.f5308b.d()) {
            C0531k9 c0531k9 = x4.f5359n;
            c0531k9.f6357c.b(P5.a(p5, EnumC0301bb.EVENT_TYPE_FIRST_ACTIVATION));
        }
        C0883xo c0883xo = this.f5308b;
        synchronized (c0883xo) {
            C0909yo c0909yo = c0883xo.f7214a;
            c0909yo.a(c0909yo.a().put("first_event_done", true));
        }
        return false;
    }

    public Wg(X4 x4, C0883xo c0883xo) {
        super(x4);
        this.f5308b = c0883xo;
    }
}
