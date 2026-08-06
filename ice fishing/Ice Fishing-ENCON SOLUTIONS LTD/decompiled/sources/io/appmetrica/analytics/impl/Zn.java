package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Zn extends A4 {

    /* renamed from: b, reason: collision with root package name */
    public final E6 f5532b;

    public Zn(C0863x4 c0863x4, E6 e6) {
        super(c0863x4);
        this.f5532b = e6;
    }

    @Override // io.appmetrica.analytics.impl.A4
    public final boolean a(P5 p5, C0785u4 c0785u4) {
        C0630o4 c0630o4 = c0785u4.f6967b.f7176d.f7280a;
        this.f5532b.a(c0630o4.f6652i);
        Kb m2 = C0610na.f6575I.m();
        if (Boolean.TRUE.equals(c0630o4.f6645b)) {
            m2.a(true);
        } else {
            if (Boolean.FALSE.equals(c0630o4.f6645b)) {
                m2.a(false);
            }
        }
        m2.a(c0630o4.f6646c);
        Boolean bool = c0630o4.f6657n;
        C0610na.f6575I.c().b(bool != null ? bool.booleanValue() : true);
        return false;
    }
}
