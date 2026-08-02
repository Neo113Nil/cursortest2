package io.appmetrica.analytics.push.impl;

import io.appmetrica.analytics.push.coreutils.internal.utils.TrackersHub;
import io.appmetrica.analytics.push.location.LocationProvider;
import io.appmetrica.analytics.push.location.LocationVerifier;
import io.appmetrica.analytics.push.logger.internal.PublicLogger;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes4.dex */
public final class L extends m2 {
    public final /* synthetic */ M b;
    public final /* synthetic */ LocationProvider c;
    public final /* synthetic */ String d;
    public final /* synthetic */ long e;
    public final /* synthetic */ LocationVerifier f;

    public L(M m, LocationProvider locationProvider, String str, long j, LocationVerifier locationVerifier) {
        this.b = m;
        this.c = locationProvider;
        this.d = str;
        this.e = j;
        this.f = locationVerifier;
    }

    @Override // io.appmetrica.analytics.push.impl.m2
    public final void a(CountDownLatch countDownLatch) {
        try {
            this.b.a = this.c.getLocation(this.d, this.e, this.f);
        } catch (Throwable th) {
            PublicLogger.INSTANCE.error(th, "Custom location provider failed to get location", new Object[0]);
            TrackersHub.getInstance().reportError("Custom location provider failed to get location", th);
        }
        countDownLatch.countDown();
    }
}
