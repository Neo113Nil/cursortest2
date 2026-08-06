package io.appmetrica.analytics.impl;

import android.location.Location;

/* loaded from: classes.dex */
public final class P0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Location f4893a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0756t1 f4894b;

    public P0(C0756t1 c0756t1, Location location) {
        this.f4894b = c0756t1;
        this.f4893a = location;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0911z0 c0911z0 = this.f4894b.f6922a;
        Location location = this.f4893a;
        c0911z0.getClass();
        C0885y0.c().a(location);
    }
}
