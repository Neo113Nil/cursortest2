package io.appmetrica.analytics.push.impl;

import android.content.Context;
import android.location.Location;
import defpackage.j73;
import defpackage.scc;
import io.appmetrica.analytics.push.lazypush.LazyPushTransformRule;
import io.appmetrica.analytics.push.location.DetailedLocation;
import io.appmetrica.analytics.push.location.LocationStatus;
import io.appmetrica.analytics.push.location.LocationVerifier;
import io.appmetrica.analytics.push.model.LocationRequestInfo;
import java.util.List;

/* renamed from: io.appmetrica.analytics.push.impl.e1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1025e1 implements LazyPushTransformRule {
    public static final long d = 300;
    public static final Location e = new Location("");
    public final LocationRequestInfo a;
    public Location b = e;
    public final Y0 c;

    public C1025e1(Context context, LocationRequestInfo locationRequestInfo) {
        this.a = locationRequestInfo;
        this.c = new Y0(context);
    }

    @Override // io.appmetrica.analytics.push.lazypush.LazyPushTransformRule
    public final String getNewValue(String str) {
        if (this.b == e) {
            Y0 y0 = this.c;
            LocationRequestInfo locationRequestInfo = this.a;
            String provider = locationRequestInfo != null ? locationRequestInfo.getProvider() : null;
            if (provider == null) {
                provider = "network";
            }
            LocationRequestInfo locationRequestInfo2 = this.a;
            Long requestTimeoutSeconds = locationRequestInfo2 != null ? locationRequestInfo2.getRequestTimeoutSeconds() : null;
            long longValue = requestTimeoutSeconds != null ? requestTimeoutSeconds.longValue() : 30L;
            LocationRequestInfo locationRequestInfo3 = this.a;
            C1007a c1007a = new C1007a(Long.valueOf((locationRequestInfo3 != null ? locationRequestInfo3.getMinAccuracy() : null) != null ? r7.intValue() : 500L));
            LocationRequestInfo locationRequestInfo4 = this.a;
            Long minRecency = locationRequestInfo4 != null ? locationRequestInfo4.getMinRecency() : null;
            DetailedLocation location = y0.getLocation(provider, longValue, new I(j73.d0(new LocationVerifier[]{c1007a, new C1030f2(Long.valueOf(minRecency != null ? minRecency.longValue() : d))})));
            Location location2 = location.getLocation();
            LocationStatus locationStatus = location.getLocationStatus();
            if (location2 == null) {
                throw new B2(locationStatus.getCategory(), locationStatus.getDetails());
            }
            this.b = location2;
        }
        return "lat".equals(str) ? String.valueOf(this.b.getLatitude()) : "lon".equals(str) ? String.valueOf(this.b.getLongitude()) : "";
    }

    @Override // io.appmetrica.analytics.push.lazypush.LazyPushTransformRule
    public final List getPatternList() {
        return scc.g("lat", "lon");
    }
}
