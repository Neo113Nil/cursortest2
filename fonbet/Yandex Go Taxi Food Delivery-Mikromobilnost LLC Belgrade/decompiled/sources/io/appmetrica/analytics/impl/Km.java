package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.Revenue;

/* loaded from: classes4.dex */
public final class Km implements InterfaceC0591oc {
    public final /* synthetic */ Revenue a;

    public Km(Revenue revenue) {
        this.a = revenue;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0591oc
    public final void a(InterfaceC0620pc interfaceC0620pc) {
        interfaceC0620pc.reportRevenue(this.a);
    }
}
