package com.anythink.expressad.foundation.h;

import android.content.Context;
import com.anythink.core.common.h.by;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class c {

    /* renamed from: A, reason: collision with root package name */
    private static final String f20379A = "landscape";

    /* renamed from: z, reason: collision with root package name */
    private static final String f20380z = "portrait";

    /* renamed from: d, reason: collision with root package name */
    public String f20384d;

    /* renamed from: e, reason: collision with root package name */
    public String f20385e;

    /* renamed from: g, reason: collision with root package name */
    public String f20387g;

    /* renamed from: h, reason: collision with root package name */
    public String f20388h;
    public String i;

    /* renamed from: j, reason: collision with root package name */
    public String f20389j;

    /* renamed from: k, reason: collision with root package name */
    public String f20390k;

    /* renamed from: l, reason: collision with root package name */
    public String f20391l;

    /* renamed from: m, reason: collision with root package name */
    public String f20392m;

    /* renamed from: n, reason: collision with root package name */
    public String f20393n;

    /* renamed from: o, reason: collision with root package name */
    public String f20394o;

    /* renamed from: p, reason: collision with root package name */
    public String f20395p;

    /* renamed from: q, reason: collision with root package name */
    public String f20396q;

    /* renamed from: r, reason: collision with root package name */
    public String f20397r;

    /* renamed from: s, reason: collision with root package name */
    public String f20398s;

    /* renamed from: t, reason: collision with root package name */
    public String f20399t;

    /* renamed from: u, reason: collision with root package name */
    public String f20400u;

    /* renamed from: v, reason: collision with root package name */
    public int f20401v;

    /* renamed from: w, reason: collision with root package name */
    public String f20402w;

    /* renamed from: x, reason: collision with root package name */
    public String f20403x;

    /* renamed from: y, reason: collision with root package name */
    public JSONObject f20404y;

    /* renamed from: c, reason: collision with root package name */
    public String f20383c = com.onesignal.core.internal.backend.impl.a.TURBINE_FEATURES_PLATFORM_ANDROID;

    /* renamed from: a, reason: collision with root package name */
    public String f20381a = n.c();

    /* renamed from: b, reason: collision with root package name */
    public String f20382b = n.d();

    /* renamed from: f, reason: collision with root package name */
    public String f20386f = com.anythink.core.common.v.m.f();

    public c(Context context) {
        this.f20384d = com.anythink.core.common.v.m.d(context);
        int b9 = n.b();
        this.f20387g = String.valueOf(b9);
        this.f20388h = n.a(context, b9);
        this.i = com.anythink.core.common.v.m.h();
        this.f20389j = com.anythink.expressad.foundation.b.a.c().g();
        this.f20390k = com.anythink.expressad.foundation.b.a.c().f();
        this.f20391l = String.valueOf(v.f(context));
        this.f20392m = String.valueOf(v.e(context));
        this.f20397r = String.valueOf(v.c(context));
        this.f20398s = com.anythink.expressad.foundation.b.a.c().j().toString();
        this.f20400u = com.anythink.core.common.v.m.b();
        this.f20401v = com.anythink.core.common.o.a().c();
        if (context.getResources().getConfiguration().orientation == 2) {
            this.f20393n = f20379A;
        } else {
            this.f20393n = f20380z;
        }
        com.anythink.core.common.d.s c9 = com.anythink.core.common.d.t.b().c();
        String[] split = (c9 != null ? c9.fillCDataParam("at_device1|||at_device2|||at_device3") : "|||").split("\\|\\|\\|");
        if (split != null) {
            this.f20385e = split.length > 0 ? split[0] : "";
            this.f20402w = split.length > 1 ? split[1] : "";
            this.f20396q = split.length > 2 ? split[2] : "";
        }
        this.f20394o = com.anythink.expressad.foundation.g.a.cs;
        this.f20395p = com.anythink.expressad.foundation.g.a.ct;
        this.f20399t = n.f();
        this.f20403x = d.a();
        this.f20404y = b();
    }

    private JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(n.j());
            jSONObject.put("cid", sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(n.g());
            jSONObject.put("dmt", sb2.toString());
            jSONObject.put("dmf", n.h());
            jSONObject.put(com.anythink.expressad.f.a.b.dy, n.i());
            jSONObject.put(com.anythink.core.common.v.k.b("aW1laQ=="), this.f20385e);
            jSONObject.put(com.anythink.core.common.v.k.b("bWFj"), this.f20402w);
            jSONObject.put("oaid", this.f20396q);
            jSONObject.put("android_id", this.f20384d);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("device", this.f20381a);
            jSONObject.put("system_version", this.f20382b);
            jSONObject.put("network_type", this.f20387g);
            jSONObject.put("network_type_str", this.f20388h);
            jSONObject.put("device_ua", this.i);
            by R8 = com.anythink.core.common.d.t.b().R();
            if (R8 != null) {
                jSONObject.put("has_wx", R8.a());
                jSONObject.put("integrated_wx", R8.b());
                StringBuilder sb = new StringBuilder();
                sb.append(R8.c());
                jSONObject.put("opensdk_ver", sb.toString());
                StringBuilder sb2 = new StringBuilder();
                sb2.append(R8.d());
                jSONObject.put("wx_api_ver", sb2.toString());
            }
            jSONObject.put("brand", this.f20400u);
            jSONObject.put("mnc", com.anythink.core.common.v.m.c(com.anythink.core.common.d.t.b().g()));
            jSONObject.put("mcc", com.anythink.core.common.v.m.b(com.anythink.core.common.d.t.b().g()));
            jSONObject.put("plantform", this.f20383c);
            jSONObject.put(com.anythink.core.common.v.k.b("ZGV2aWNlX2ltZWk="), this.f20385e);
            jSONObject.put("android_id", this.f20384d);
            jSONObject.put("google_ad_id", this.f20386f);
            jSONObject.put("oaid", this.f20396q);
            jSONObject.put("az_aid_info", this.f20403x);
            jSONObject.put("appkey", this.f20389j);
            jSONObject.put(com.anythink.expressad.videocommon.e.b.f23194u, this.f20390k);
            jSONObject.put("screen_width", this.f20391l);
            jSONObject.put("screen_height", this.f20392m);
            jSONObject.put("orientation", this.f20393n);
            jSONObject.put("scale", this.f20397r);
            jSONObject.put("b", this.f20394o);
            jSONObject.put("c", this.f20395p);
            jSONObject.put("web_env", this.f20398s);
            jSONObject.put("f", this.f20399t);
            jSONObject.put("misk_spt", this.f20401v);
            if (n.k() != 0) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(n.k());
                jSONObject.put("tun", sb3.toString());
            }
            jSONObject.put("dvi", com.anythink.core.express.a.a.a(this.f20404y.toString()));
            boolean b9 = com.anythink.core.common.v.p.b();
            jSONObject.put(com.anythink.expressad.foundation.g.f.h.b.f20143d, (com.anythink.core.d.d.a(com.anythink.core.common.d.t.b().g()).b(com.anythink.core.common.d.t.b().p()).C() == 2 && b9) ? "1" : "0");
            return jSONObject;
        } catch (JSONException e9) {
            e9.printStackTrace();
            return jSONObject;
        }
    }
}
