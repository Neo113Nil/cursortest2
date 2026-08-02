package ru.yandex.taxi.locationsdk.locationprovider.android;

import android.location.Location;
import defpackage.jl40;
import defpackage.sb2;
import defpackage.wls;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes9.dex */
final /* synthetic */ class AndroidPlatformLocationProvider$requestLocationUpdatesWithPassiveIfNeeded$1 extends FunctionReferenceImpl implements wls {
    public static final AndroidPlatformLocationProvider$requestLocationUpdatesWithPassiveIfNeeded$1 b = new AndroidPlatformLocationProvider$requestLocationUpdatesWithPassiveIfNeeded$1(2, 1, sb2.class, "areLocationsEquivalentWhenIncludingPassive", "areLocationsEquivalentWhenIncludingPassive(Landroid/location/Location;Landroid/location/Location;)Z");

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        Location location = (Location) obj;
        Location location2 = (Location) obj2;
        return Boolean.valueOf(jl40.l(location.getProvider(), location2.getProvider()) && location.getElapsedRealtimeNanos() == location2.getElapsedRealtimeNanos() && location.getLatitude() == location2.getLatitude() && location.getLongitude() == location2.getLongitude() && jl40.k(location.hasAccuracy() ? Float.valueOf(location.getAccuracy()) : null, location2.hasAccuracy() ? Float.valueOf(location2.getAccuracy()) : null));
    }
}
