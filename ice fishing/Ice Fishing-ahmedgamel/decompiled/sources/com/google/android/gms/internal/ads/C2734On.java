package com.google.android.gms.internal.ads;

import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;

/* renamed from: com.google.android.gms.internal.ads.On, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2734On {

    /* renamed from: a, reason: collision with root package name */
    public final C3230fo f27439a;

    public C2734On(C3230fo c3230fo) {
        this.f27439a = c3230fo;
    }

    public final boolean a(C3615mx c3615mx) {
        boolean L2 = c3615mx.L();
        x2.k kVar = x2.k.f41872n;
        C3230fo c3230fo = this.f27439a;
        if (L2) {
            S0.e a9 = c3230fo.a();
            a9.M(NativeAdvancedJsUtils.f18693p, "aq_ad_closed");
            a9.M("gqi", c3615mx.D());
            a9.M("aq_ad_duration", String.valueOf(c3615mx.E()));
            a9.M("aq_ad_bounce_cnt", String.valueOf(c3615mx.F()));
            a9.M("aq_time_away", String.valueOf(c3615mx.I()));
            return a9.O().equals(kVar);
        }
        S0.e a10 = c3230fo.a();
        a10.M(NativeAdvancedJsUtils.f18693p, "aq_ad_kill");
        a10.M("gqi", c3615mx.D());
        a10.M("aq_ad_duration", String.valueOf(c3615mx.E()));
        a10.M("aq_ad_bounce_cnt", String.valueOf(c3615mx.F()));
        a10.M("aq_time_away", String.valueOf(c3615mx.I()));
        a10.M("aq_is_os_kill", String.valueOf(c3615mx.H()));
        return a10.O().equals(kVar);
    }
}
