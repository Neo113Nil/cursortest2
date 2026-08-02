package io.appmetrica.analytics.push.impl;

import android.location.Location;
import defpackage.tcc;
import io.appmetrica.analytics.push.location.LocationStatus;
import io.appmetrica.analytics.push.location.LocationVerifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public final class I implements LocationVerifier {
    public final List a;

    public I(List list) {
        this.a = list;
    }

    @Override // io.appmetrica.analytics.push.location.LocationVerifier
    public final LocationStatus verifyLocation(Location location) {
        Object obj;
        List list = this.a;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((LocationVerifier) it.next()).verifyLocation(location));
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            if (!((LocationStatus) obj).isSuccess()) {
                break;
            }
        }
        LocationStatus locationStatus = (LocationStatus) obj;
        return locationStatus == null ? new LocationStatus.Success() : locationStatus;
    }
}
