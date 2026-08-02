package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AdRevenue;

/* loaded from: classes5.dex */
public final class Fm implements InterfaceC0200dc {
    public final /* synthetic */ AdRevenue a;
    public final /* synthetic */ boolean b;

    public Fm(AdRevenue adRevenue, boolean z) {
        this.a = adRevenue;
        this.b = z;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0200dc
    public final void a(InterfaceC0228ec interfaceC0228ec) {
        interfaceC0228ec.reportAdRevenue(this.a, this.b);
    }
}
