package io.appmetrica.analytics.push.impl;

import android.location.Location;
import io.appmetrica.analytics.push.location.LocationStatus;
import io.appmetrica.analytics.push.location.LocationVerifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public final class K1 implements LocationVerifier {
    public final List a;
    public final float b;

    public K1(List list, float f) {
        this.a = list;
        this.b = f;
    }

    @Override // io.appmetrica.analytics.push.location.LocationVerifier
    public final LocationStatus verifyLocation(Location location) {
        Iterator it = ((ArrayList) kotlin.collections.a.M(this.a)).iterator();
        while (it.hasNext()) {
            if (location.distanceTo((Location) it.next()) <= this.b) {
                return new LocationStatus.Success();
            }
        }
        return new LocationStatus.LocationIsNotNearPoints(this.a, this.b);
    }
}
