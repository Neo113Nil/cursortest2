package io.appmetrica.analytics.push.impl;

import android.content.Context;
import defpackage.j73;
import io.appmetrica.analytics.push.location.DetailedLocation;
import io.appmetrica.analytics.push.location.LocationProvider;
import io.appmetrica.analytics.push.location.LocationStatus;
import io.appmetrica.analytics.push.location.LocationVerifier;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class Y0 implements LocationProvider {
    public final Context a;

    public Y0(Context context) {
        this.a = context;
    }

    @Override // io.appmetrica.analytics.push.location.LocationProvider
    public final DetailedLocation getLocation(String str, long j, LocationVerifier locationVerifier) {
        M m = new M();
        Context context = this.a;
        Iterator it = ((ArrayList) j73.A(new LocationProvider[]{m, new X0(context), new M0(context), new X0(context)})).iterator();
        while (it.hasNext()) {
            DetailedLocation location = ((LocationProvider) it.next()).getLocation(str, j, locationVerifier);
            if (location.getLocation() != null) {
                return location;
            }
        }
        return new DetailedLocation(null, new LocationStatus.LocationProviderReturnedNull("LazyPushLocationProvider"));
    }
}
