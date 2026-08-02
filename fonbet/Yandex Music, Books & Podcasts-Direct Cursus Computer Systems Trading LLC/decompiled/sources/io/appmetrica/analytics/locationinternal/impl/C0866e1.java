package io.appmetrica.analytics.locationinternal.impl;

import android.location.Location;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeType;
import io.appmetrica.analytics.gpllibrary.internal.GplLibraryWrapper;

/* renamed from: io.appmetrica.analytics.locationinternal.impl.e1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0866e1 {
    public final L a = new L();
    public final U b = new U();
    public final Z1 c = new Z1();

    public final C0905q1 a(F1 f1) {
        int i;
        C0905q1 c0905q1 = new C0905q1();
        Location location = f1.e;
        Long l = f1.b;
        c0905q1.a = l == null ? c0905q1.a : l.longValue();
        c0905q1.c = location.getTime() / 1000;
        U u = this.b;
        int i2 = f1.a;
        u.getClass();
        c0905q1.k = U.a(i2);
        c0905q1.b = f1.c / 1000;
        c0905q1.l = f1.d / 1000;
        c0905q1.d = location.getLatitude();
        c0905q1.e = location.getLongitude();
        c0905q1.f = Math.round(location.getAccuracy());
        c0905q1.g = Math.round(location.getBearing());
        c0905q1.h = Math.round(location.getSpeed());
        c0905q1.i = (int) Math.round(location.getAltitude());
        Z1 z1 = this.c;
        String provider = location.getProvider();
        z1.getClass();
        int hashCode = provider.hashCode();
        if (hashCode == 102570) {
            if (provider.equals("gps")) {
                i = 1;
            }
            i = 0;
        } else if (hashCode != 97798435) {
            if (hashCode == 1843485230 && provider.equals("network")) {
                i = 2;
            }
            i = 0;
        } else {
            if (provider.equals(GplLibraryWrapper.FUSED_PROVIDER)) {
                i = 3;
            }
            i = 0;
        }
        c0905q1.j = i;
        L l2 = this.a;
        ChargeType chargeType = f1.f;
        l2.getClass();
        c0905q1.m = L.a(chargeType);
        return c0905q1;
    }
}
