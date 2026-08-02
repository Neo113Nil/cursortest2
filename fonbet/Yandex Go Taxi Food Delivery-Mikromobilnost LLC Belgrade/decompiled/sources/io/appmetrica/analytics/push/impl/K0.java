package io.appmetrica.analytics.push.impl;

import android.location.LocationManager;
import io.appmetrica.analytics.push.location.LocationVerifier;
import io.appmetrica.analytics.push.logger.internal.PublicLogger;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes4.dex */
public final class K0 extends m2 {
    public final /* synthetic */ LocationManager b;
    public final /* synthetic */ LocationVerifier c;
    public final /* synthetic */ String d;
    public final /* synthetic */ M0 e;

    public K0(M0 m0, LocationManager locationManager, LocationVerifier locationVerifier, String str) {
        this.e = m0;
        this.b = locationManager;
        this.c = locationVerifier;
        this.d = str;
    }

    @Override // io.appmetrica.analytics.push.impl.m2
    public final void a(CountDownLatch countDownLatch) {
        M0 m0 = this.e;
        LocationManager locationManager = this.b;
        L0 l0 = m0.b;
        if (l0 != null) {
            locationManager.removeUpdates(l0);
        }
        m0.b = null;
        M0 m02 = this.e;
        L0 l02 = new L0(countDownLatch, this.c);
        m02.b = l02;
        try {
            this.b.requestLocationUpdates(this.d, 0L, 0.0f, l02, this.a);
        } catch (Throwable th) {
            PublicLogger.INSTANCE.error(th, th.getMessage(), new Object[0]);
        }
    }
}
