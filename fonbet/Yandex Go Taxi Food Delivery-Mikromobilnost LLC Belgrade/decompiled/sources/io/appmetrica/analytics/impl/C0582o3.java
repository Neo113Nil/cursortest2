package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.rtm.internal.Constants;

/* renamed from: io.appmetrica.analytics.impl.o3, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0582o3 {
    public final C0433j a;
    public final C0260cr b = new C0260cr(new Og("Config"));
    public final C0260cr c = new C0260cr(new Og("Activity"));
    public final C0260cr d = new C0260cr(new Og("Intent"));
    public final C0260cr e = new C0260cr(new Og("Application"));
    public final C0260cr f = new C0260cr(new Og("Context"));
    public final C0260cr g = new C0260cr(new Og("Deeplink listener"));
    public final C0260cr h = new C0260cr(new Og("Reporter Config"));
    public final C0260cr i = new C0260cr(new Mg("Deeplink"));
    public final C0260cr j = new C0260cr(new C0550n0());
    public final C0260cr k = new C0260cr(new Og("Key"));
    public final C0260cr l = new C0260cr(new Og("WebView"));
    public final Mg m = new Mg("value");
    public final Mg n = new Mg("name");
    public final C0260cr o = new C0260cr(new Og("AppMetricaDeviceIdentifiers callback"));
    public final C0260cr p = new C0260cr(new Og("ANR listener"));
    public final C0260cr q = new C0260cr(new Og("External attribution"));
    public final C0260cr r = new C0260cr(new Mg("Event name"));
    public final C0260cr s = new C0260cr(new Mg("Error message"));
    public final C0260cr t = new C0260cr(new Mg("Error identifier"));
    public final C0260cr u;
    public final C0260cr v;
    public final C0260cr w;
    public final C0260cr x;
    public final C0260cr y;
    public final C0260cr z;

    public C0582o3(F0 f0) {
        this.a = new C0433j(f0);
        new C0260cr(new Og(Constants.DEFAULT_MESSAGE));
        this.u = new C0260cr(new Og("Throwable"));
        this.v = new C0260cr(new Og("User profile"));
        this.w = new C0260cr(new Og("Revenue"));
        this.x = new C0260cr(new Og("AdRevenue"));
        this.y = new C0260cr(new Og("ECommerceEvent"));
        this.z = new C0260cr(new Og("Anr all threads"));
    }
}
