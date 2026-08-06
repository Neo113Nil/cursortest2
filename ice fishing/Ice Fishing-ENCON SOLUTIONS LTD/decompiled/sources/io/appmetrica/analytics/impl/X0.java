package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AdRevenue;

/* loaded from: classes.dex */
public final class X0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdRevenue f5340a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0756t1 f5341b;

    public X0(C0756t1 c0756t1, AdRevenue adRevenue) {
        this.f5341b = c0756t1;
        this.f5340a = adRevenue;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0756t1.a(this.f5341b).reportAdRevenue(this.f5340a);
    }
}
