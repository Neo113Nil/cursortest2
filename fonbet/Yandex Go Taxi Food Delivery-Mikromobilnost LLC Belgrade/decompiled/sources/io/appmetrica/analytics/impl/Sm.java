package io.appmetrica.analytics.impl;

/* loaded from: classes9.dex */
public final class Sm implements InterfaceC0591oc {
    public final /* synthetic */ InterfaceC0400hn a;

    public Sm(InterfaceC0400hn interfaceC0400hn) {
        this.a = interfaceC0400hn;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0591oc
    public final void a(InterfaceC0620pc interfaceC0620pc) {
        C0371gn a = ((Ze) this.a).a();
        if (a != null) {
            interfaceC0620pc.reportEvent(a.a, a.b);
        }
    }
}
