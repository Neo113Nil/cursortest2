package io.appmetrica.analytics.push.impl;

import android.location.Location;
import io.appmetrica.analytics.push.location.LocationStatus;
import io.appmetrica.analytics.push.location.LocationVerifier;
import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.push.impl.f2, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1030f2 implements LocationVerifier {
    public final Long a;

    public C1030f2(Long l) {
        this.a = l != null ? Long.valueOf(TimeUnit.SECONDS.toNanos(l.longValue())) : null;
    }

    @Override // io.appmetrica.analytics.push.location.LocationVerifier
    public final LocationStatus verifyLocation(Location location) {
        long a = AbstractC1033g1.a(location);
        Long l = this.a;
        return (l == null || a <= l.longValue()) ? new LocationStatus.Success() : new LocationStatus.LocationIsNotRecent(a, this.a.longValue());
    }
}
