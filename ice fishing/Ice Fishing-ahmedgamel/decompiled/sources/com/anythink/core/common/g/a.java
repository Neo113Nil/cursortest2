package com.anythink.core.common.g;

import com.anythink.core.api.ATSDK;
import com.anythink.core.common.d.j;
import com.google.android.gms.internal.ads.Wv;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    protected static final String f14026a = "api.anythinktech.com";

    /* renamed from: b, reason: collision with root package name */
    public static final String f14027b = "https://se.zxcvbnmpo.com/v2/open/ns";

    /* renamed from: c, reason: collision with root package name */
    public static final String f14028c = "https://api.anythinktech.com/v2/open/app";

    /* renamed from: d, reason: collision with root package name */
    public static final String f14029d = "https://api.anythinktech.com/v2/open/placement";

    /* renamed from: e, reason: collision with root package name */
    public static final String f14030e = "https://ssapi.anythinktech.com/sdk/realtime_waterfall";

    /* renamed from: f, reason: collision with root package name */
    public static final String f14031f = "https://api.anythinktech.com/v2/open/pl_wf";

    /* renamed from: g, reason: collision with root package name */
    public static final String f14032g = "https://da.anythinktech.com/v1/open/da";

    /* renamed from: h, reason: collision with root package name */
    public static final String f14033h = "https://tk.anythinktech.com/v1/open/tk";
    public static final String i;

    /* renamed from: j, reason: collision with root package name */
    public static final String f14034j;

    /* renamed from: k, reason: collision with root package name */
    public static final String f14035k;

    /* renamed from: l, reason: collision with root package name */
    public static final String f14036l;

    /* renamed from: m, reason: collision with root package name */
    public static final String f14037m;

    /* renamed from: n, reason: collision with root package name */
    public static final String f14038n = "";

    /* renamed from: o, reason: collision with root package name */
    public static final String f14039o;

    /* renamed from: p, reason: collision with root package name */
    public static final String f14040p;

    /* renamed from: q, reason: collision with root package name */
    public static final String f14041q;

    /* renamed from: r, reason: collision with root package name */
    public static final String f14042r;

    /* renamed from: s, reason: collision with root package name */
    public static final String f14043s = "https://img.anythinktech.com/gdpr/PrivacyPolicySetting.html";

    static {
        String d9;
        StringBuilder sb = new StringBuilder("https://");
        if (ATSDK.isCnSDK()) {
            d9 = "api.anythinktech.com";
        } else {
            c.a();
            d9 = c.d();
        }
        i = Wv.i(sb, d9, "/v2/open/eu");
        f14034j = "https://adx.anythinktech.com/bid";
        f14035k = "https://adx.anythinktech.com/request";
        f14036l = "https://adxtk.anythinktech.com/v1";
        f14037m = "https://adx.anythinktech.com/openapi/req";
        f14039o = "https://tk.anythinktech.com/ss/rrd";
        f14040p = "https://api.anythinktech.com/v2/open/area";
        f14041q = "https://api.anythinktech.com/v2/open/m_adapter";
        f14042r = "https://api.anythinktech.com/v2/open/dna";
    }

    public static String a() {
        return "api.anythinktech.com";
    }

    private static String b() {
        return j.g.a.f13255b;
    }

    private static String c() {
        return j.g.a.f13256c;
    }

    private static String d() {
        return j.g.a.f13257d;
    }

    private static String e() {
        if (ATSDK.isCnSDK()) {
            return "api.anythinktech.com";
        }
        c.a();
        return c.d();
    }

    private static String f() {
        return j.g.a.f13258e;
    }
}
