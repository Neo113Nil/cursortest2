package com.onesignal.location.internal.controller.impl;

import android.location.Location;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;

/* loaded from: classes2.dex */
public interface g {
    void cancelLocationUpdates(GoogleApiClient googleApiClient, LocationListener locationListener);

    Location getLastLocation(GoogleApiClient googleApiClient);

    boolean requestLocationUpdates(GoogleApiClient googleApiClient, LocationRequest locationRequest, LocationListener locationListener);
}
