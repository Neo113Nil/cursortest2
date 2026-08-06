package io.appmetrica.analytics.location.impl;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class n implements LocationListener {

    /* renamed from: a, reason: collision with root package name */
    public final p f7327a;

    public n(p pVar) {
        this.f7327a = pVar;
    }

    @Override // android.location.LocationListener
    public final void onLocationChanged(Location location) {
        if (location != null) {
            p pVar = this.f7327a;
            pVar.getClass();
            String provider = location.getProvider();
            t tVar = (t) pVar.f7333e.get(provider);
            if (tVar == null) {
                t tVar2 = new t(pVar.f7329a.f7306a);
                tVar2.f7340c.add(pVar.f7331c);
                Iterator it = pVar.f7332d.iterator();
                while (it.hasNext()) {
                    tVar2.f7340c.add((Consumer) it.next());
                }
                pVar.f7333e.put(provider, tVar2);
                tVar = tVar2;
            } else {
                tVar.f7338a = pVar.f7329a.f7306a;
            }
            if (tVar.f7341d != null) {
                boolean didTimePassMillis = tVar.f7339b.didTimePassMillis(tVar.f7342e, tVar.f7338a.getUpdateTimeInterval(), "isSavedLocationOutdated");
                boolean z2 = location.distanceTo(tVar.f7341d) > tVar.f7338a.getUpdateDistanceInterval();
                boolean z3 = tVar.f7341d == null || location.getTime() - tVar.f7341d.getTime() >= 0;
                if ((!didTimePassMillis && !z2) || !z3) {
                    return;
                }
            }
            tVar.f7341d = location;
            tVar.f7342e = System.currentTimeMillis();
            Iterator it2 = tVar.f7340c.iterator();
            while (it2.hasNext()) {
                ((Consumer) it2.next()).consume(location);
            }
        }
    }

    @Override // android.location.LocationListener
    public final void onProviderDisabled(String str) {
    }

    @Override // android.location.LocationListener
    public final void onProviderEnabled(String str) {
    }

    @Override // android.location.LocationListener
    public final void onStatusChanged(String str, int i2, Bundle bundle) {
    }
}
