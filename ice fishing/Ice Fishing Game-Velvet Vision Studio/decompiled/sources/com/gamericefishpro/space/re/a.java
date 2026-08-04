package com.gamericefishpro.space.re;

import android.location.Location;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements g {
    @Override // com.gamericefishpro.space.re.g
    public void cancelLocationUpdates(GoogleApiClient googleApiClient, LocationListener locationListener) {
        Intrinsics.checkNotNullParameter(googleApiClient, "googleApiClient");
        Intrinsics.checkNotNullParameter(locationListener, "locationListener");
        if (googleApiClient.d()) {
            LocationServices.FusedLocationApi.removeLocationUpdates(googleApiClient, locationListener);
        } else {
            com.gamericefishpro.space.od.b.warn$default("GoogleApiClient is not connected. Unable to cancel location updates.", null, 2, null);
        }
    }

    @Override // com.gamericefishpro.space.re.g
    public Location getLastLocation(GoogleApiClient googleApiClient) {
        Intrinsics.checkNotNullParameter(googleApiClient, "googleApiClient");
        if (googleApiClient.d()) {
            return LocationServices.FusedLocationApi.getLastLocation(googleApiClient);
        }
        return null;
    }

    @Override // com.gamericefishpro.space.re.g
    public void requestLocationUpdates(GoogleApiClient googleApiClient, LocationRequest locationRequest, LocationListener locationListener) {
        Intrinsics.checkNotNullParameter(googleApiClient, "googleApiClient");
        Intrinsics.checkNotNullParameter(locationRequest, "locationRequest");
        Intrinsics.checkNotNullParameter(locationListener, "locationListener");
        try {
            if (Looper.myLooper() == null) {
                Looper.prepare();
            }
            if (googleApiClient.d()) {
                LocationServices.FusedLocationApi.requestLocationUpdates(googleApiClient, locationRequest, locationListener);
            }
        } catch (Throwable th) {
            com.gamericefishpro.space.od.b.warn("FusedLocationApi.requestLocationUpdates failed!", th);
        }
    }
}
