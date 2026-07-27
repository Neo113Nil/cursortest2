package com.anythink.expressad.foundation.h;

import android.content.Context;
import com.anythink.core.common.h.by;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class c {

    /* renamed from: A, reason: collision with root package name */
    private static final String f19592A = "landscape";

    /* renamed from: z, reason: collision with root package name */
    private static final String f19593z = "portrait";

    /* renamed from: d, reason: collision with root package name */
    public String f19597d;

    /* renamed from: e, reason: collision with root package name */
    public String f19598e;

    /* renamed from: g, reason: collision with root package name */
    public String f19600g;

    /* renamed from: h, reason: collision with root package name */
    public String f19601h;
    public String i;

    /* renamed from: j, reason: collision with root package name */
    public String f19602j;

    /* renamed from: k, reason: collision with root package name */
    public String f19603k;

    /* renamed from: l, reason: collision with root package name */
    public String f19604l;

    /* renamed from: m, reason: collision with root package name */
    public String f19605m;

    /* renamed from: n, reason: collision with root package name */
    public String f19606n;

    /* renamed from: o, reason: collision with root package name */
    public String f19607o;

    /* renamed from: p, reason: collision with root package name */
    public String f19608p;

    /* renamed from: q, reason: collision with root package name */
    public String f19609q;

    /* renamed from: r, reason: collision with root package name */
    public String f19610r;

    /* renamed from: s, reason: collision with root package name */
    public String f19611s;

    /* renamed from: t, reason: collision with root package name */
    public String f19612t;

    /* renamed from: u, reason: collision with root package name */
    public String f19613u;

    /* renamed from: v, reason: collision with root package name */
    public int f19614v;

    /* renamed from: w, reason: collision with root package name */
    public String f19615w;

    /* renamed from: x, reason: collision with root package name */
    public String f19616x;

    /* renamed from: y, reason: collision with root package name */
    public JSONObject f19617y;

    /* renamed from: c, reason: collision with root package name */
    public String f19596c = com.onesignal.core.internal.backend.impl.a.TURBINE_FEATURES_PLATFORM_ANDROID;

    /* renamed from: a, reason: collision with root package name */
    public String f19594a = n.c();

    /* renamed from: b, reason: collision with root package name */
    public String f19595b = n.d();

    /* renamed from: f, reason: collision with root package name */
    public String f19599f = com.anythink.core.common.v.m.f();

    public c(Context context) {
        this.f19597d = com.anythink.core.common.v.m.d(context);
        int b9 = n.b();
        this.f19600g = String.valueOf(b9);
        this.f19601h = n.a(context, b9);
        this.i = com.anythink.core.common.v.m.h();
        this.f19602j = com.anythink.expressad.foundation.b.a.c().g();
        this.f19603k = com.anythink.expressad.foundation.b.a.c().f();
        this.f19604l = String.valueOf(v.f(context));
        this.f19605m = String.valueOf(v.e(context));
        this.f19610r = String.valueOf(v.c(context));
        this.f19611s = com.anythink.expressad.foundation.b.a.c().j().toString();
        this.f19613u = com.anythink.core.common.v.m.b();
        this.f19614v = com.anythink.core.common.o.a().c();
        if (context.getResources().getConfiguration().orientation == 2) {
            this.f19606n = f19592A;
        } else {
            this.f19606n = f19593z;
        }
        com.anythink.core.common.d.s c9 = com.anythink.core.common.d.t.b().c();
        String[] split = (c9 != null ? c9.fillCDataParam("at_device1|||at_device2|||at_device3") : "|||").split("\\|\\|\\|");
        if (split != null) {
            this.f19598e = split.length > 0 ? split[0] : "";
            this.f19615w = split.length > 1 ? split[1] : "";
            this.f19609q = split.length > 2 ? split[2] : "";
        }
        this.f19607o = com.anythink.expressad.foundation.g.a.cs;
        this.f19608p = com.anythink.expressad.foundation.g.a.ct;
        this.f19612t = n.f();
        this.f19616x = d.a();
        this.f19617y = b();
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
            jSONObject.put(com.anythink.core.common.v.k.b("aW1laQ=="), this.f19598e);
            jSONObject.put(com.anythink.core.common.v.k.b("bWFj"), this.f19615w);
            jSONObject.put("oaid", this.f19609q);
            jSONObject.put("android_id", this.f19597d);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("device", this.f19594a);
            jSONObject.put("system_version", this.f19595b);
            jSONObject.put("network_type", this.f19600g);
            jSONObject.put("network_type_str", this.f19601h);
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
            jSONObject.put("brand", this.f19613u);
            jSONObject.put("mnc", com.anythink.core.common.v.m.c(com.anythink.core.common.d.t.b().g()));
            jSONObject.put("mcc", com.anythink.core.common.v.m.b(com.anythink.core.common.d.t.b().g()));
            jSONObject.put("plantform", this.f19596c);
            jSONObject.put(com.anythink.core.common.v.k.b("ZGV2aWNlX2ltZWk="), this.f19598e);
            jSONObject.put("android_id", this.f19597d);
            jSONObject.put("google_ad_id", this.f19599f);
            jSONObject.put("oaid", this.f19609q);
            jSONObject.put("az_aid_info", this.f19616x);
            jSONObject.put("appkey", this.f19602j);
            jSONObject.put(com.anythink.expressad.videocommon.e.b.f22407u, this.f19603k);
            jSONObject.put("screen_width", this.f19604l);
            jSONObject.put("screen_height", this.f19605m);
            jSONObject.put("orientation", this.f19606n);
            jSONObject.put("scale", this.f19610r);
            jSONObject.put("b", this.f19607o);
            jSONObject.put("c", this.f19608p);
            jSONObject.put("web_env", this.f19611s);
            jSONObject.put("f", this.f19612t);
            jSONObject.put("misk_spt", this.f19614v);
            if (n.k() != 0) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(n.k());
                jSONObject.put("tun", sb3.toString());
            }
            jSONObject.put("dvi", com.anythink.core.express.a.a.a(this.f19617y.toString()));
            boolean b9 = com.anythink.core.common.v.p.b();
            jSONObject.put(com.anythink.expressad.foundation.g.f.h.b.f19356d, (com.anythink.core.d.d.a(com.anythink.core.common.d.t.b().g()).b(com.anythink.core.common.d.t.b().p()).C() == 2 && b9) ? "1" : "0");
            return jSONObject;
        } catch (JSONException e9) {
            e9.printStackTrace();
            return jSONObject;
        }
    }
}
