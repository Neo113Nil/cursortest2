package io.appmetrica.analytics.impl;

/* loaded from: classes5.dex */
public final class Cm implements InterfaceC0200dc {
    public final /* synthetic */ Rm a;

    public Cm(Rm rm) {
        this.a = rm;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0200dc
    public final void a(InterfaceC0228ec interfaceC0228ec) {
        Qm a = ((Ke) this.a).a();
        if (a != null) {
            interfaceC0228ec.reportEvent(a.a, a.b);
        }
    }
}
