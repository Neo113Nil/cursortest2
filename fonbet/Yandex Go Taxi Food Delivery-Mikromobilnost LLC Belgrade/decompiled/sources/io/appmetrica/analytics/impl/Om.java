package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AdRevenue;

/* loaded from: classes4.dex */
public final class Om implements InterfaceC0591oc {
    public final /* synthetic */ AdRevenue a;

    public Om(AdRevenue adRevenue) {
        this.a = adRevenue;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0591oc
    public final void a(InterfaceC0620pc interfaceC0620pc) {
        interfaceC0620pc.reportAdRevenue(this.a);
    }
}
