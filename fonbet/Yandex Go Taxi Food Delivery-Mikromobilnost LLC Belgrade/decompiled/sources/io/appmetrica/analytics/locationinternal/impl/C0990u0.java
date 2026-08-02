package io.appmetrica.analytics.locationinternal.impl;

import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeType;
import org.json.JSONArray;

/* renamed from: io.appmetrica.analytics.locationinternal.impl.u0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0990u0 {
    public final L a = new L();
    public final U b = new U();
    public final H c = new H();
    public final C2 d = new C2();

    public final C0977p1 a(F0 f0) {
        C0977p1 c0977p1 = new C0977p1();
        Long l = f0.a;
        c0977p1.a = l == null ? c0977p1.a : l.longValue();
        c0977p1.b = f0.b / 1000;
        c0977p1.e = f0.c / 1000;
        L l2 = this.a;
        ChargeType chargeType = f0.f;
        l2.getClass();
        c0977p1.f = L.a(chargeType);
        U u = this.b;
        int i = f0.g;
        u.getClass();
        c0977p1.g = U.a(i);
        H h = this.c;
        JSONArray jSONArray = f0.e;
        h.getClass();
        c0977p1.c = H.a(jSONArray);
        C2 c2 = this.d;
        JSONArray jSONArray2 = f0.d;
        c2.getClass();
        c0977p1.d = C2.a(jSONArray2);
        return c0977p1;
    }
}
