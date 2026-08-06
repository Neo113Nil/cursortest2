package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.networktasks.internal.RetryPolicyConfig;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.jm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0518jm {

    /* renamed from: A, reason: collision with root package name */
    public final Map f6304A;

    /* renamed from: B, reason: collision with root package name */
    public final B9 f6305B;

    /* renamed from: a, reason: collision with root package name */
    public final String f6306a;

    /* renamed from: b, reason: collision with root package name */
    public final List f6307b;

    /* renamed from: c, reason: collision with root package name */
    public final String f6308c;

    /* renamed from: d, reason: collision with root package name */
    public final String f6309d;

    /* renamed from: e, reason: collision with root package name */
    public final String f6310e;

    /* renamed from: f, reason: collision with root package name */
    public final List f6311f;

    /* renamed from: g, reason: collision with root package name */
    public final List f6312g;

    /* renamed from: h, reason: collision with root package name */
    public final List f6313h;

    /* renamed from: i, reason: collision with root package name */
    public final Map f6314i;

    /* renamed from: j, reason: collision with root package name */
    public final String f6315j;

    /* renamed from: k, reason: collision with root package name */
    public final String f6316k;

    /* renamed from: l, reason: collision with root package name */
    public final String f6317l;

    /* renamed from: m, reason: collision with root package name */
    public final C0552l4 f6318m;

    /* renamed from: n, reason: collision with root package name */
    public final long f6319n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f6320o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f6321p;

    /* renamed from: q, reason: collision with root package name */
    public final String f6322q;

    /* renamed from: r, reason: collision with root package name */
    public final Gm f6323r;

    /* renamed from: s, reason: collision with root package name */
    public final C0873xe f6324s;
    public final RetryPolicyConfig t;

    /* renamed from: u, reason: collision with root package name */
    public final long f6325u;

    /* renamed from: v, reason: collision with root package name */
    public final long f6326v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f6327w;

    /* renamed from: x, reason: collision with root package name */
    public final C0345d3 f6328x;

    /* renamed from: y, reason: collision with root package name */
    public final C0576m2 f6329y;

    /* renamed from: z, reason: collision with root package name */
    public final Cm f6330z;

    public C0518jm(C0492im c0492im) {
        String str;
        long j2;
        long j3;
        Cm cm;
        Map map;
        B9 b9;
        this.f6306a = c0492im.f6203a;
        List list = c0492im.f6204b;
        this.f6307b = list == null ? null : CollectionUtils.unmodifiableListCopy(list);
        this.f6308c = c0492im.f6205c;
        this.f6309d = c0492im.f6206d;
        this.f6310e = c0492im.f6207e;
        List list2 = c0492im.f6208f;
        this.f6311f = list2 == null ? null : CollectionUtils.unmodifiableListCopy(list2);
        List list3 = c0492im.f6209g;
        this.f6312g = list3 == null ? null : CollectionUtils.unmodifiableListCopy(list3);
        List list4 = c0492im.f6210h;
        this.f6313h = list4 == null ? null : CollectionUtils.unmodifiableListCopy(list4);
        Map map2 = c0492im.f6211i;
        this.f6314i = map2 != null ? CollectionUtils.unmodifiableMapCopy(map2) : null;
        this.f6315j = c0492im.f6212j;
        this.f6316k = c0492im.f6213k;
        this.f6318m = c0492im.f6215m;
        this.f6324s = c0492im.f6216n;
        this.f6319n = c0492im.f6217o;
        this.f6320o = c0492im.f6218p;
        this.f6317l = c0492im.f6214l;
        this.f6321p = c0492im.f6219q;
        str = c0492im.f6220r;
        this.f6322q = str;
        this.f6323r = c0492im.f6221s;
        j2 = c0492im.t;
        this.f6325u = j2;
        j3 = c0492im.f6222u;
        this.f6326v = j3;
        this.f6327w = c0492im.f6223v;
        RetryPolicyConfig retryPolicyConfig = c0492im.f6224w;
        if (retryPolicyConfig == null) {
            C0855wm c0855wm = new C0855wm();
            this.t = new RetryPolicyConfig(c0855wm.f7151w, c0855wm.f7152x);
        } else {
            this.t = retryPolicyConfig;
        }
        this.f6328x = c0492im.f6225x;
        this.f6329y = c0492im.f6226y;
        cm = c0492im.f6227z;
        this.f6330z = cm == null ? new Cm(I7.f4534b.f7025a) : c0492im.f6227z;
        map = c0492im.f6201A;
        this.f6304A = map == null ? Collections.emptyMap() : c0492im.f6201A;
        b9 = c0492im.f6202B;
        this.f6305B = b9;
    }

    public final C0492im a(C0552l4 c0552l4) {
        C0492im c0492im = new C0492im(c0552l4);
        c0492im.f6203a = this.f6306a;
        c0492im.f6208f = this.f6311f;
        c0492im.f6209g = this.f6312g;
        c0492im.f6212j = this.f6315j;
        c0492im.f6204b = this.f6307b;
        c0492im.f6205c = this.f6308c;
        c0492im.f6206d = this.f6309d;
        c0492im.f6207e = this.f6310e;
        c0492im.f6210h = this.f6313h;
        c0492im.f6211i = this.f6314i;
        c0492im.f6213k = this.f6316k;
        c0492im.f6214l = this.f6317l;
        c0492im.f6219q = this.f6321p;
        c0492im.f6217o = this.f6319n;
        c0492im.f6218p = this.f6320o;
        c0492im.f6220r = this.f6322q;
        c0492im.f6216n = this.f6324s;
        c0492im.t = this.f6325u;
        c0492im.f6222u = this.f6326v;
        c0492im.f6221s = this.f6323r;
        c0492im.f6223v = this.f6327w;
        c0492im.f6224w = this.t;
        c0492im.f6225x = this.f6328x;
        c0492im.f6226y = this.f6329y;
        c0492im.f6227z = this.f6330z;
        c0492im.f6201A = this.f6304A;
        c0492im.f6202B = this.f6305B;
        return c0492im;
    }

    public final String toString() {
        return "StartupStateModel{uuid='" + this.f6306a + "', reportUrls=" + this.f6307b + ", getAdUrl='" + this.f6308c + "', reportAdUrl='" + this.f6309d + "', certificateUrl='" + this.f6310e + "', hostUrlsFromStartup=" + this.f6311f + ", hostUrlsFromClient=" + this.f6312g + ", diagnosticUrls=" + this.f6313h + ", customSdkHosts=" + this.f6314i + ", encodedClidsFromResponse='" + this.f6315j + "', lastClientClidsForStartupRequest='" + this.f6316k + "', lastChosenForRequestClids='" + this.f6317l + "', collectingFlags=" + this.f6318m + ", obtainTime=" + this.f6319n + ", hadFirstStartup=" + this.f6320o + ", startupDidNotOverrideClids=" + this.f6321p + ", countryInit='" + this.f6322q + "', statSending=" + this.f6323r + ", permissionsCollectingConfig=" + this.f6324s + ", retryPolicyConfig=" + this.t + ", obtainServerTime=" + this.f6325u + ", firstStartupServerTime=" + this.f6326v + ", outdated=" + this.f6327w + ", cacheControl=" + this.f6328x + ", attributionConfig=" + this.f6329y + ", startupUpdateConfig=" + this.f6330z + ", modulesRemoteConfigs=" + this.f6304A + ", externalAttributionConfig=" + this.f6305B + '}';
    }
}
