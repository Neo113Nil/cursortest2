package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.rtm.internal.Constants;

/* renamed from: io.appmetrica.analytics.impl.o3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0508o3 {
    public final Jq A;
    public final C0359j a;
    public final Jq b = new Jq(new C0809yg("Config"));
    public final Jq c = new Jq(new C0809yg("Activity"));
    public final Jq d = new Jq(new C0809yg("Intent"));
    public final Jq e = new Jq(new C0809yg("Application"));
    public final Jq f = new Jq(new C0809yg("Context"));
    public final Jq g = new Jq(new C0809yg("Deeplink listener"));
    public final Jq h = new Jq(new C0809yg("Reporter Config"));
    public final Jq i = new Jq(new C0752wg("Deeplink"));
    public final Jq j = new Jq(new C0752wg("Referral url"));
    public final Jq k = new Jq(new C0418l0());
    public final Jq l = new Jq(new C0809yg("Key"));
    public final Jq m = new Jq(new C0809yg("WebView"));
    public final C0752wg n = new C0752wg(Constants.KEY_VALUE);
    public final C0752wg o = new C0752wg("name");
    public final Jq p = new Jq(new C0809yg("AppMetricaDeviceIdentifiers callback"));
    public final Jq q = new Jq(new C0809yg("ANR listener"));
    public final Jq r = new Jq(new C0809yg("External attribution"));
    public final Jq s = new Jq(new C0752wg("Event name"));
    public final Jq t = new Jq(new C0752wg("Error message"));
    public final Jq u = new Jq(new C0752wg("Error identifier"));
    public final Jq v;
    public final Jq w;
    public final Jq x;
    public final Jq y;
    public final Jq z;

    public C0508o3(D0 d0) {
        this.a = new C0359j(d0);
        new Jq(new C0809yg(Constants.DEFAULT_MESSAGE));
        this.v = new Jq(new C0809yg("Throwable"));
        this.w = new Jq(new C0809yg("User profile"));
        this.x = new Jq(new C0809yg("Revenue"));
        this.y = new Jq(new C0809yg("AdRevenue"));
        this.z = new Jq(new C0809yg("ECommerceEvent"));
        this.A = new Jq(new C0809yg("Anr all threads"));
    }
}
