package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.Revenue;

/* loaded from: classes.dex */
public final class Oh implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Revenue f4866a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0437gi f4867b;

    public Oh(C0437gi c0437gi, Revenue revenue) {
        this.f4867b = c0437gi;
        this.f4866a = revenue;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0437gi c0437gi = this.f4867b;
        C0437gi.a(c0437gi.f6082a, c0437gi.f6085d, c0437gi.f6086e).reportRevenue(this.f4866a);
    }
}
