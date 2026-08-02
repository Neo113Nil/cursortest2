package io.appmetrica.analytics.impl;

/* loaded from: classes5.dex */
public final class Pd implements Ni {
    public final /* synthetic */ Qd a;

    public Pd(Qd qd) {
        this.a = qd;
    }

    @Override // io.appmetrica.analytics.impl.Ni
    public final void a(Qi qi) {
        if (qi == null) {
            return;
        }
        H6 h6 = new H6("", "", 0);
        h6.setValueBytes(qi.a());
        EnumC0603rc enumC0603rc = EnumC0603rc.EVENT_TYPE_UNDEFINED;
        h6.d = 4097;
        this.a.a(h6);
    }
}
