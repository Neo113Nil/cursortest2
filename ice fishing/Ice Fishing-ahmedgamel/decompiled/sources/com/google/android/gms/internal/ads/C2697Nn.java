package com.google.android.gms.internal.ads;

import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;

/* renamed from: com.google.android.gms.internal.ads.Nn, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2697Nn {

    /* renamed from: a, reason: collision with root package name */
    public final C3153eo f26535a;

    public C2697Nn(C3153eo c3153eo) {
        this.f26535a = c3153eo;
    }

    public final boolean a(C3592mx c3592mx) {
        boolean L6 = c3592mx.L();
        v2.k kVar = v2.k.f41418n;
        C3153eo c3153eo = this.f26535a;
        if (L6) {
            S0.e a9 = c3153eo.a();
            a9.v(NativeAdvancedJsUtils.f17906p, "aq_ad_closed");
            a9.v("gqi", c3592mx.D());
            a9.v("aq_ad_duration", String.valueOf(c3592mx.E()));
            a9.v("aq_ad_bounce_cnt", String.valueOf(c3592mx.F()));
            a9.v("aq_time_away", String.valueOf(c3592mx.I()));
            return a9.A().equals(kVar);
        }
        S0.e a10 = c3153eo.a();
        a10.v(NativeAdvancedJsUtils.f17906p, "aq_ad_kill");
        a10.v("gqi", c3592mx.D());
        a10.v("aq_ad_duration", String.valueOf(c3592mx.E()));
        a10.v("aq_ad_bounce_cnt", String.valueOf(c3592mx.F()));
        a10.v("aq_time_away", String.valueOf(c3592mx.I()));
        a10.v("aq_is_os_kill", String.valueOf(c3592mx.H()));
        return a10.A().equals(kVar);
    }
}
