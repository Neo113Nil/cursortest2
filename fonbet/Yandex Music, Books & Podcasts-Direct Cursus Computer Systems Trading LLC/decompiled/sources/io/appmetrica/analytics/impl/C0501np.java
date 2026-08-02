package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.networktasks.internal.RetryPolicyConfig;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.np, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0501np {
    public final Map A;
    public final Ja B;
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
    public final C0164c5 m;
    public final long n;
    public final boolean o;
    public final boolean p;
    public final String q;
    public final Kp r;
    public final Ug s;
    public final RetryPolicyConfig t;
    public final long u;
    public final long v;
    public final boolean w;
    public final S3 x;
    public final C0104a3 y;
    public final Gp z;

    public C0501np(C0472mp c0472mp) {
        String str;
        long j;
        long j2;
        Gp gp;
        Map map;
        Ja ja;
        this.a = c0472mp.a;
        List list = c0472mp.b;
        this.b = list == null ? null : CollectionUtils.unmodifiableListCopy(list);
        this.c = c0472mp.c;
        this.d = c0472mp.d;
        this.e = c0472mp.e;
        List list2 = c0472mp.f;
        this.f = list2 == null ? null : CollectionUtils.unmodifiableListCopy(list2);
        List list3 = c0472mp.g;
        this.g = list3 == null ? null : CollectionUtils.unmodifiableListCopy(list3);
        List list4 = c0472mp.h;
        this.h = list4 == null ? null : CollectionUtils.unmodifiableListCopy(list4);
        Map map2 = c0472mp.i;
        this.i = map2 != null ? CollectionUtils.unmodifiableMapCopy(map2) : null;
        this.j = c0472mp.j;
        this.k = c0472mp.k;
        this.m = c0472mp.m;
        this.s = c0472mp.n;
        this.n = c0472mp.o;
        this.o = c0472mp.p;
        this.l = c0472mp.l;
        this.p = c0472mp.q;
        str = c0472mp.r;
        this.q = str;
        this.r = c0472mp.s;
        j = c0472mp.t;
        this.u = j;
        j2 = c0472mp.u;
        this.v = j2;
        this.w = c0472mp.v;
        RetryPolicyConfig retryPolicyConfig = c0472mp.w;
        if (retryPolicyConfig == null) {
            Ap ap = new Ap();
            this.t = new RetryPolicyConfig(ap.w, ap.x);
        } else {
            this.t = retryPolicyConfig;
        }
        this.x = c0472mp.x;
        this.y = c0472mp.y;
        gp = c0472mp.z;
        this.z = gp == null ? new Gp(B8.b.a) : c0472mp.z;
        map = c0472mp.A;
        this.A = map == null ? Collections.EMPTY_MAP : c0472mp.A;
        ja = c0472mp.B;
        this.B = ja;
    }

    public final C0472mp a(C0164c5 c0164c5) {
        C0472mp c0472mp = new C0472mp(c0164c5);
        c0472mp.a = this.a;
        c0472mp.f = this.f;
        c0472mp.g = this.g;
        c0472mp.j = this.j;
        c0472mp.b = this.b;
        c0472mp.c = this.c;
        c0472mp.d = this.d;
        c0472mp.e = this.e;
        c0472mp.h = this.h;
        c0472mp.i = this.i;
        c0472mp.k = this.k;
        c0472mp.l = this.l;
        c0472mp.q = this.p;
        c0472mp.o = this.n;
        c0472mp.p = this.o;
        c0472mp.r = this.q;
        c0472mp.n = this.s;
        c0472mp.t = this.u;
        c0472mp.u = this.v;
        c0472mp.s = this.r;
        c0472mp.v = this.w;
        c0472mp.w = this.t;
        c0472mp.x = this.x;
        c0472mp.y = this.y;
        c0472mp.z = this.z;
        c0472mp.A = this.A;
        c0472mp.B = this.B;
        return c0472mp;
    }

    public final String toString() {
        return "StartupStateModel{uuid='" + this.a + "', reportUrls=" + this.b + ", getAdUrl='" + this.c + "', reportAdUrl='" + this.d + "', certificateUrl='" + this.e + "', hostUrlsFromStartup=" + this.f + ", hostUrlsFromClient=" + this.g + ", diagnosticUrls=" + this.h + ", customSdkHosts=" + this.i + ", encodedClidsFromResponse='" + this.j + "', lastClientClidsForStartupRequest='" + this.k + "', lastChosenForRequestClids='" + this.l + "', collectingFlags=" + this.m + ", obtainTime=" + this.n + ", hadFirstStartup=" + this.o + ", startupDidNotOverrideClids=" + this.p + ", countryInit='" + this.q + "', statSending=" + this.r + ", permissionsCollectingConfig=" + this.s + ", retryPolicyConfig=" + this.t + ", obtainServerTime=" + this.u + ", firstStartupServerTime=" + this.v + ", outdated=" + this.w + ", cacheControl=" + this.x + ", attributionConfig=" + this.y + ", startupUpdateConfig=" + this.z + ", modulesRemoteConfigs=" + this.A + ", externalAttributionConfig=" + this.B + '}';
    }
}
