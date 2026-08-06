package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AdRevenue;

/* loaded from: classes.dex */
public final class Hj implements Qa {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdRevenue f4482a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f4483b;

    public Hj(AdRevenue adRevenue, boolean z2) {
        this.f4482a = adRevenue;
        this.f4483b = z2;
    }

    @Override // io.appmetrica.analytics.impl.Qa
    public final void a(Ra ra) {
        ra.reportAdRevenue(this.f4482a, this.f4483b);
    }
}
