package io.appmetrica.analytics.impl;

import android.location.Location;

/* renamed from: io.appmetrica.analytics.impl.f1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC0320f1 implements Runnable {
    public final /* synthetic */ Location a;
    public final /* synthetic */ J1 b;

    public RunnableC0320f1(J1 j1, Location location) {
        this.b = j1;
        this.a = location;
    }

    @Override // java.lang.Runnable
    public final void run() {
        F0 f0 = this.b.a;
        Location location = this.a;
        f0.getClass();
        E0.c().a(location);
    }
}
