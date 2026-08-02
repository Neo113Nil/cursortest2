package io.appmetrica.analytics.gpllibrary.internal;

import android.location.Location;
import android.location.LocationListener;
import defpackage.t070;

/* loaded from: classes9.dex */
class GplOnSuccessListener implements t070 {
    private final LocationListener a;

    public GplOnSuccessListener(LocationListener locationListener) {
        this.a = locationListener;
    }

    @Override // defpackage.t070
    public void onSuccess(Location location) {
        this.a.onLocationChanged(location);
    }
}
