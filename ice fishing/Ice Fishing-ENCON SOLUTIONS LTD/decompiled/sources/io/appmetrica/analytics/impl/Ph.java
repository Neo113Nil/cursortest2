package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AdRevenue;

/* loaded from: classes.dex */
public final class Ph implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdRevenue f4934a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0437gi f4935b;

    public Ph(C0437gi c0437gi, AdRevenue adRevenue) {
        this.f4935b = c0437gi;
        this.f4934a = adRevenue;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0437gi c0437gi = this.f4935b;
        C0437gi.a(c0437gi.f6082a, c0437gi.f6085d, c0437gi.f6086e).reportAdRevenue(this.f4934a);
    }
}
