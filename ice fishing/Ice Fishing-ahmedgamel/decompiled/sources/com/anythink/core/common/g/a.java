package com.anythink.core.common.g;

import com.anythink.core.api.ATSDK;
import com.anythink.core.common.d.j;
import u1.h;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    protected static final String f13240a = "api.anythinktech.com";

    /* renamed from: b, reason: collision with root package name */
    public static final String f13241b = "https://se.zxcvbnmpo.com/v2/open/ns";

    /* renamed from: c, reason: collision with root package name */
    public static final String f13242c = "https://api.anythinktech.com/v2/open/app";

    /* renamed from: d, reason: collision with root package name */
    public static final String f13243d = "https://api.anythinktech.com/v2/open/placement";

    /* renamed from: e, reason: collision with root package name */
    public static final String f13244e = "https://ssapi.anythinktech.com/sdk/realtime_waterfall";

    /* renamed from: f, reason: collision with root package name */
    public static final String f13245f = "https://api.anythinktech.com/v2/open/pl_wf";

    /* renamed from: g, reason: collision with root package name */
    public static final String f13246g = "https://da.anythinktech.com/v1/open/da";

    /* renamed from: h, reason: collision with root package name */
    public static final String f13247h = "https://tk.anythinktech.com/v1/open/tk";
    public static final String i;

    /* renamed from: j, reason: collision with root package name */
    public static final String f13248j;

    /* renamed from: k, reason: collision with root package name */
    public static final String f13249k;

    /* renamed from: l, reason: collision with root package name */
    public static final String f13250l;

    /* renamed from: m, reason: collision with root package name */
    public static final String f13251m;

    /* renamed from: n, reason: collision with root package name */
    public static final String f13252n = "";

    /* renamed from: o, reason: collision with root package name */
    public static final String f13253o;

    /* renamed from: p, reason: collision with root package name */
    public static final String f13254p;

    /* renamed from: q, reason: collision with root package name */
    public static final String f13255q;

    /* renamed from: r, reason: collision with root package name */
    public static final String f13256r;

    /* renamed from: s, reason: collision with root package name */
    public static final String f13257s = "https://img.anythinktech.com/gdpr/PrivacyPolicySetting.html";

    static {
        String d2;
        StringBuilder sb = new StringBuilder("https://");
        if (ATSDK.isCnSDK()) {
            d2 = "api.anythinktech.com";
        } else {
            c.a();
            d2 = c.d();
        }
        i = h.g(sb, d2, "/v2/open/eu");
        f13248j = "https://adx.anythinktech.com/bid";
        f13249k = "https://adx.anythinktech.com/request";
        f13250l = "https://adxtk.anythinktech.com/v1";
        f13251m = "https://adx.anythinktech.com/openapi/req";
        f13253o = "https://tk.anythinktech.com/ss/rrd";
        f13254p = "https://api.anythinktech.com/v2/open/area";
        f13255q = "https://api.anythinktech.com/v2/open/m_adapter";
        f13256r = "https://api.anythinktech.com/v2/open/dna";
    }

    public static String a() {
        return "api.anythinktech.com";
    }

    private static String b() {
        return j.g.a.f12469b;
    }

    private static String c() {
        return j.g.a.f12470c;
    }

    private static String d() {
        return j.g.a.f12471d;
    }

    private static String e() {
        if (ATSDK.isCnSDK()) {
            return "api.anythinktech.com";
        }
        c.a();
        return c.d();
    }

    private static String f() {
        return j.g.a.f12472e;
    }
}
