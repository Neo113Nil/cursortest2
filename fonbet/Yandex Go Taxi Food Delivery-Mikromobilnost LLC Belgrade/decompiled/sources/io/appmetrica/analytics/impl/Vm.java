package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AdRevenue;

/* loaded from: classes4.dex */
public final class Vm implements InterfaceC0591oc {
    public final /* synthetic */ AdRevenue a;
    public final /* synthetic */ boolean b;

    public Vm(AdRevenue adRevenue, boolean z) {
        this.a = adRevenue;
        this.b = z;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0591oc
    public final void a(InterfaceC0620pc interfaceC0620pc) {
        interfaceC0620pc.reportAdRevenue(this.a, this.b);
    }
}
