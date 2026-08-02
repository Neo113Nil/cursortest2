package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.t5, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0728t5 {
    public final C0794vd a;

    public C0728t5() {
        this(Jb.k().l());
    }

    public final Gq a(C0670r5 c0670r5, Wp wp) {
        Gq gq = new Gq(c0670r5, new C0684rj(wp));
        C0794vd c0794vd = this.a;
        synchronized (c0794vd) {
            c0794vd.c.add(gq);
        }
        return gq;
    }

    public C0728t5(C0794vd c0794vd) {
        this.a = c0794vd;
    }

    public static C0873y5 a(C0670r5 c0670r5) {
        return new C0873y5(new C0815w5(c0670r5), c0670r5);
    }
}
