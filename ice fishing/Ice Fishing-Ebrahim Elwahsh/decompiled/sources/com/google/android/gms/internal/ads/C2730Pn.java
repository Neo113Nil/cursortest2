package com.google.android.gms.internal.ads;

import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;

/* renamed from: com.google.android.gms.internal.ads.Pn, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2730Pn {

    /* renamed from: a, reason: collision with root package name */
    public final C3165eo f27049a;

    public C2730Pn(C3165eo c3165eo) {
        this.f27049a = c3165eo;
    }

    public final boolean a(C3713ox c3713ox) {
        boolean L8 = c3713ox.L();
        u2.k kVar = u2.k.f41244n;
        C3165eo c3165eo = this.f27049a;
        if (L8) {
            C2593Hm a9 = c3165eo.a();
            a9.r(NativeAdvancedJsUtils.f18064p, "aq_ad_closed");
            a9.r("gqi", c3713ox.D());
            a9.r("aq_ad_duration", String.valueOf(c3713ox.E()));
            a9.r("aq_ad_bounce_cnt", String.valueOf(c3713ox.F()));
            a9.r("aq_time_away", String.valueOf(c3713ox.I()));
            return a9.u().equals(kVar);
        }
        C2593Hm a10 = c3165eo.a();
        a10.r(NativeAdvancedJsUtils.f18064p, "aq_ad_kill");
        a10.r("gqi", c3713ox.D());
        a10.r("aq_ad_duration", String.valueOf(c3713ox.E()));
        a10.r("aq_ad_bounce_cnt", String.valueOf(c3713ox.F()));
        a10.r("aq_time_away", String.valueOf(c3713ox.I()));
        a10.r("aq_is_os_kill", String.valueOf(c3713ox.H()));
        return a10.u().equals(kVar);
    }
}
