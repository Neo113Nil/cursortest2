package io.appmetrica.analytics.gpllibrary.internal;

import D0.b;
import android.location.Location;
import android.location.LocationListener;

/* loaded from: classes.dex */
class GplOnSuccessListener implements b {

    /* renamed from: a, reason: collision with root package name */
    private final LocationListener f3948a;

    public GplOnSuccessListener(LocationListener locationListener) {
        this.f3948a = locationListener;
    }

    @Override // D0.b
    public void onSuccess(Location location) {
        this.f3948a.onLocationChanged(location);
    }
}
