package com.onesignal.location.internal.controller.impl;

import android.location.Location;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import pc.j;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a implements g {
    @Override // com.onesignal.location.internal.controller.impl.g
    public void cancelLocationUpdates(GoogleApiClient googleApiClient, LocationListener locationListener) {
        j.e(googleApiClient, "googleApiClient");
        j.e(locationListener, "locationListener");
        if (googleApiClient.d()) {
            LocationServices.FusedLocationApi.removeLocationUpdates(googleApiClient, locationListener);
        } else {
            com.onesignal.debug.internal.logging.b.warn$default("GoogleApiClient is not connected. Unable to cancel location updates.", null, 2, null);
        }
    }

    @Override // com.onesignal.location.internal.controller.impl.g
    public Location getLastLocation(GoogleApiClient googleApiClient) {
        j.e(googleApiClient, "googleApiClient");
        if (googleApiClient.d()) {
            return LocationServices.FusedLocationApi.getLastLocation(googleApiClient);
        }
        return null;
    }

    @Override // com.onesignal.location.internal.controller.impl.g
    public void requestLocationUpdates(GoogleApiClient googleApiClient, LocationRequest locationRequest, LocationListener locationListener) {
        j.e(googleApiClient, "googleApiClient");
        j.e(locationRequest, "locationRequest");
        j.e(locationListener, "locationListener");
        try {
            if (Looper.myLooper() == null) {
                Looper.prepare();
            }
            if (googleApiClient.d()) {
                LocationServices.FusedLocationApi.requestLocationUpdates(googleApiClient, locationRequest, locationListener);
            }
        } catch (Throwable th) {
            com.onesignal.debug.internal.logging.b.warn("FusedLocationApi.requestLocationUpdates failed!", th);
        }
    }
}
