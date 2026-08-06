package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AdRevenue;

/* loaded from: classes.dex */
public final class Xh implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdRevenue f5397a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f5398b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0437gi f5399c;

    public Xh(C0437gi c0437gi, AdRevenue adRevenue, boolean z2) {
        this.f5399c = c0437gi;
        this.f5397a = adRevenue;
        this.f5398b = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0437gi c0437gi = this.f5399c;
        C0437gi.a(c0437gi.f6082a, c0437gi.f6085d, c0437gi.f6086e).reportAdRevenue(this.f5397a, this.f5398b);
    }
}
