package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.networktasks.internal.RetryPolicyConfig;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes9.dex */
public final class Fp {
    public final Map A;
    public final Ra B;
    public final String a;
    public final List b;
    public final String c;
    public final String d;
    public final String e;
    public final List f;
    public final List g;
    public final List h;
    public final Map i;
    public final String j;
    public final String k;
    public final String l;
    public final C0353g5 m;
    public final long n;
    public final boolean o;
    public final boolean p;
    public final String q;
    public final C0259cq r;
    public final C0480kh s;
    public final RetryPolicyConfig t;
    public final long u;
    public final long v;
    public final boolean w;
    public final V3 x;
    public final C0178a3 y;
    public final Yp z;

    public Fp(Ep ep) {
        String str;
        long j;
        long j2;
        Yp yp;
        Map map;
        Ra ra;
        this.a = ep.a;
        List list = ep.b;
        this.b = list == null ? null : CollectionUtils.unmodifiableListCopy(list);
        this.c = ep.c;
        this.d = ep.d;
        this.e = ep.e;
        List list2 = ep.f;
        this.f = list2 == null ? null : CollectionUtils.unmodifiableListCopy(list2);
        List list3 = ep.g;
        this.g = list3 == null ? null : CollectionUtils.unmodifiableListCopy(list3);
        List list4 = ep.h;
        this.h = list4 == null ? null : CollectionUtils.unmodifiableListCopy(list4);
        Map map2 = ep.i;
        this.i = map2 != null ? CollectionUtils.unmodifiableMapCopy(map2) : null;
        this.j = ep.j;
        this.k = ep.k;
        this.m = ep.m;
        this.s = ep.n;
        this.n = ep.o;
        this.o = ep.p;
        this.l = ep.l;
        this.p = ep.q;
        str = ep.r;
        this.q = str;
        this.r = ep.s;
        j = ep.t;
        this.u = j;
        j2 = ep.u;
        this.v = j2;
        this.w = ep.v;
        RetryPolicyConfig retryPolicyConfig = ep.w;
        if (retryPolicyConfig == null) {
            Sp sp = new Sp();
            this.t = new RetryPolicyConfig(sp.w, sp.x);
        } else {
            this.t = retryPolicyConfig;
        }
        this.x = ep.x;
        this.y = ep.y;
        yp = ep.z;
        this.z = yp == null ? new Yp(G8.b.a) : ep.z;
        map = ep.A;
        this.A = map == null ? Collections.EMPTY_MAP : ep.A;
        ra = ep.B;
        this.B = ra;
    }

    public final Ep a(C0353g5 c0353g5) {
        Ep ep = new Ep(c0353g5);
        ep.a = this.a;
        ep.f = this.f;
        ep.g = this.g;
        ep.j = this.j;
        ep.b = this.b;
        ep.c = this.c;
        ep.d = this.d;
        ep.e = this.e;
        ep.h = this.h;
        ep.i = this.i;
        ep.k = this.k;
        ep.l = this.l;
        ep.q = this.p;
        ep.o = this.n;
        ep.p = this.o;
        ep.r = this.q;
        ep.n = this.s;
        ep.t = this.u;
        ep.u = this.v;
        ep.s = this.r;
        ep.v = this.w;
        ep.w = this.t;
        ep.x = this.x;
        ep.y = this.y;
        ep.z = this.z;
        ep.A = this.A;
        ep.B = this.B;
        return ep;
    }

    public final String toString() {
        return "StartupStateModel{uuid='" + this.a + "', reportUrls=" + this.b + ", getAdUrl='" + this.c + "', reportAdUrl='" + this.d + "', certificateUrl='" + this.e + "', hostUrlsFromStartup=" + this.f + ", hostUrlsFromClient=" + this.g + ", diagnosticUrls=" + this.h + ", customSdkHosts=" + this.i + ", encodedClidsFromResponse='" + this.j + "', lastClientClidsForStartupRequest='" + this.k + "', lastChosenForRequestClids='" + this.l + "', collectingFlags=" + this.m + ", obtainTime=" + this.n + ", hadFirstStartup=" + this.o + ", startupDidNotOverrideClids=" + this.p + ", countryInit='" + this.q + "', statSending=" + this.r + ", permissionsCollectingConfig=" + this.s + ", retryPolicyConfig=" + this.t + ", obtainServerTime=" + this.u + ", firstStartupServerTime=" + this.v + ", outdated=" + this.w + ", cacheControl=" + this.x + ", attributionConfig=" + this.y + ", startupUpdateConfig=" + this.z + ", modulesRemoteConfigs=" + this.A + ", externalAttributionConfig=" + this.B + '}';
    }
}
