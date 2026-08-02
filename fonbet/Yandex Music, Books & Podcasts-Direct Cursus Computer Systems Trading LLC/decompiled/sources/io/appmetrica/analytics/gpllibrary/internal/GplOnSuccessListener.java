package io.appmetrica.analytics.gpllibrary.internal;

import android.location.Location;
import android.location.LocationListener;
import defpackage.tqj;

/* loaded from: classes5.dex */
class GplOnSuccessListener implements tqj {
    private final LocationListener a;

    public GplOnSuccessListener(LocationListener locationListener) {
        this.a = locationListener;
    }

    @Override // defpackage.tqj
    public void onSuccess(Location location) {
        this.a.onLocationChanged(location);
    }
}
