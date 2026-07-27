package androidx.core.location;

import android.location.LocationManager;
import android.os.Build;

/* loaded from: classes.dex */
public final class LocationManagerCompat {
    public static boolean isLocationEnabled(LocationManager locationManager) {
        boolean isLocationEnabled;
        if (Build.VERSION.SDK_INT < 28) {
            return locationManager.isProviderEnabled("network") || locationManager.isProviderEnabled("gps");
        }
        isLocationEnabled = locationManager.isLocationEnabled();
        return isLocationEnabled;
    }

    private LocationManagerCompat() {
    }
}
