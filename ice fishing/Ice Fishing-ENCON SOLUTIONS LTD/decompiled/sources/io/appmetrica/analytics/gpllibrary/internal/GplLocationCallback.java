package io.appmetrica.analytics.gpllibrary.internal;

import android.location.LocationListener;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationResult;

/* loaded from: classes.dex */
class GplLocationCallback extends LocationCallback {

    /* renamed from: a, reason: collision with root package name */
    private final LocationListener f3947a;

    public GplLocationCallback(LocationListener locationListener) {
        this.f3947a = locationListener;
    }

    public void onLocationResult(LocationResult locationResult) {
        this.f3947a.onLocationChanged(locationResult.getLastLocation());
    }
}
