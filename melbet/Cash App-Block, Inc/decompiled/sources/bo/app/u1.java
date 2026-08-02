package bo.app;

import com.braze.storage.GeofenceDataStoreProvider;

/* loaded from: classes3.dex */
public final class u1 {
    public final GeofenceDataStoreProvider a;

    public u1(GeofenceDataStoreProvider geofenceDataStoreProvider) {
        geofenceDataStoreProvider.getClass();
        this.a = geofenceDataStoreProvider;
        try {
            Class.forName("com.braze.location.BrazeInternalGeofenceApi").getDeclaredConstructor(null).newInstance(null).getClass();
            throw new ClassCastException();
        } catch (Exception unused) {
        }
    }
}
