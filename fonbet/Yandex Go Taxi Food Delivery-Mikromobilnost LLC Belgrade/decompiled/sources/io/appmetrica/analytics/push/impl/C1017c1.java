package io.appmetrica.analytics.push.impl;

import android.location.Location;
import defpackage.j73;
import io.appmetrica.analytics.push.location.LocationProvider;
import io.appmetrica.analytics.push.location.LocationStatus;
import io.appmetrica.analytics.push.location.LocationVerifier;
import io.appmetrica.analytics.push.model.Coordinates;
import io.appmetrica.analytics.push.model.Filters;
import io.appmetrica.analytics.push.model.PushMessage;
import io.appmetrica.analytics.push.settings.PushFilter;
import java.util.List;

/* renamed from: io.appmetrica.analytics.push.impl.c1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C1017c1 implements PushFilter {
    public static final long b = 86400;
    public final LocationProvider a;

    public C1017c1(I0 i0) {
        this.a = i0;
    }

    @Override // io.appmetrica.analytics.push.settings.PushFilter
    public final PushFilter.FilterResult filter(PushMessage pushMessage) {
        Filters filters = pushMessage.getFilters();
        Coordinates coordinates = filters == null ? null : filters.getCoordinates();
        List<Location> points = coordinates != null ? coordinates.getPoints() : null;
        if (points == null || points.isEmpty()) {
            return PushFilter.FilterResult.show();
        }
        LocationProvider locationProvider = this.a;
        Boolean passiveLocation = filters.getPassiveLocation();
        String str = "passive";
        if (passiveLocation != null && !passiveLocation.booleanValue()) {
            str = "";
        }
        C1007a c1007a = new C1007a(Long.valueOf(filters.getMinAccuracy() != null ? r5.intValue() : 500L));
        Long minRecency = filters.getMinRecency();
        LocationStatus locationStatus = locationProvider.getLocation(str, 30L, new I(j73.d0(new LocationVerifier[]{c1007a, new C1030f2(Long.valueOf(minRecency != null ? minRecency.longValue() : b)), new K1(points, coordinates.getRadius() != null ? r1.intValue() : 2000)}))).getLocationStatus();
        return locationStatus.isSuccess() ? PushFilter.FilterResult.show() : PushFilter.FilterResult.silence(locationStatus.getCategory(), locationStatus.getDetails());
    }
}
