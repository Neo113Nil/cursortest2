package com.onesignal.location.internal.controller.impl;

import android.location.Location;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;

/* loaded from: classes2.dex */
public final class a implements g {
    @Override // com.onesignal.location.internal.controller.impl.g
    public void cancelLocationUpdates(GoogleApiClient googleApiClient, LocationListener locationListener) {
        kotlin.jvm.internal.h.e(googleApiClient, "googleApiClient");
        kotlin.jvm.internal.h.e(locationListener, "locationListener");
        try {
            if (googleApiClient.a()) {
                LocationServices.FusedLocationApi.removeLocationUpdates(googleApiClient, locationListener);
            } else {
                com.onesignal.debug.internal.logging.b.warn$default("GoogleApiClient is not connected. Unable to cancel location updates.", null, 2, null);
            }
        } catch (Throwable th) {
            com.onesignal.debug.internal.logging.b.warn("FusedLocationApi.cancelLocationUpdates failed!", th);
        }
    }

    @Override // com.onesignal.location.internal.controller.impl.g
    public Location getLastLocation(GoogleApiClient googleApiClient) {
        kotlin.jvm.internal.h.e(googleApiClient, "googleApiClient");
        try {
            if (googleApiClient.a()) {
                return LocationServices.FusedLocationApi.getLastLocation(googleApiClient);
            }
            return null;
        } catch (Throwable th) {
            com.onesignal.debug.internal.logging.b.warn("FusedLocationApi.getLastLocation failed!", th);
            return null;
        }
    }

    @Override // com.onesignal.location.internal.controller.impl.g
    public boolean requestLocationUpdates(GoogleApiClient googleApiClient, LocationRequest locationRequest, LocationListener locationListener) {
        kotlin.jvm.internal.h.e(googleApiClient, "googleApiClient");
        kotlin.jvm.internal.h.e(locationRequest, "locationRequest");
        kotlin.jvm.internal.h.e(locationListener, "locationListener");
        try {
            if (Looper.myLooper() == null) {
                Looper.prepare();
            }
            if (!googleApiClient.a()) {
                return false;
            }
            LocationServices.FusedLocationApi.requestLocationUpdates(googleApiClient, locationRequest, locationListener);
            return true;
        } catch (Throwable th) {
            com.onesignal.debug.internal.logging.b.warn("FusedLocationApi.requestLocationUpdates failed!", th);
            return false;
        }
    }
}
