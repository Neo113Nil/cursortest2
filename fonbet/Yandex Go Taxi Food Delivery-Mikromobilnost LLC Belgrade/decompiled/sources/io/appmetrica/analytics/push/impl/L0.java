package io.appmetrica.analytics.push.impl;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import io.appmetrica.analytics.push.location.LocationVerifier;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes4.dex */
public final class L0 implements LocationListener {
    public final CountDownLatch a;
    public final LocationVerifier b;
    public volatile Location c = null;

    public L0(CountDownLatch countDownLatch, LocationVerifier locationVerifier) {
        this.a = countDownLatch;
        this.b = locationVerifier;
    }

    @Override // android.location.LocationListener
    public final void onLocationChanged(Location location) {
        if (this.b.verifyLocation(location).isSuccess()) {
            this.c = location;
            this.a.countDown();
        }
    }

    @Override // android.location.LocationListener
    public final void onProviderDisabled(String str) {
    }

    @Override // android.location.LocationListener
    public final void onProviderEnabled(String str) {
    }

    @Override // android.location.LocationListener
    public final void onStatusChanged(String str, int i, Bundle bundle) {
    }
}
