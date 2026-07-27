package com.anythink.expressad.splash.a;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.common.d.s;
import com.anythink.core.common.d.t;
import com.anythink.core.common.h.by;
import com.anythink.core.common.v.k;
import com.anythink.core.common.v.m;
import com.anythink.expressad.foundation.h.d;
import com.anythink.expressad.foundation.h.n;
import com.anythink.expressad.foundation.h.v;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public String f20466d;

    /* renamed from: e, reason: collision with root package name */
    public String f20467e;

    /* renamed from: g, reason: collision with root package name */
    public String f20469g;

    /* renamed from: h, reason: collision with root package name */
    public String f20470h;
    public String i;

    /* renamed from: j, reason: collision with root package name */
    public String f20471j;

    /* renamed from: k, reason: collision with root package name */
    public String f20472k;

    /* renamed from: l, reason: collision with root package name */
    public String f20473l;

    /* renamed from: m, reason: collision with root package name */
    public String f20474m;

    /* renamed from: n, reason: collision with root package name */
    public String f20475n;

    /* renamed from: o, reason: collision with root package name */
    public String f20476o;

    /* renamed from: p, reason: collision with root package name */
    public String f20477p;

    /* renamed from: q, reason: collision with root package name */
    public String f20478q;

    /* renamed from: r, reason: collision with root package name */
    public String f20479r;

    /* renamed from: c, reason: collision with root package name */
    public String f20465c = com.onesignal.core.internal.backend.impl.a.TURBINE_FEATURES_PLATFORM_ANDROID;

    /* renamed from: a, reason: collision with root package name */
    public String f20463a = n.c();

    /* renamed from: b, reason: collision with root package name */
    public String f20464b = n.d();

    /* renamed from: f, reason: collision with root package name */
    public String f20468f = m.f();

    public a(Context context) {
        this.f20467e = m.d(context);
        int b9 = n.b();
        this.f20470h = String.valueOf(b9);
        this.i = n.a(context, b9);
        this.f20471j = m.h();
        this.f20472k = com.anythink.expressad.foundation.b.a.c().g();
        this.f20473l = com.anythink.expressad.foundation.b.a.c().f();
        this.f20474m = String.valueOf(v.f(context));
        this.f20475n = String.valueOf(v.e(context));
        this.f20477p = String.valueOf(v.c(context));
        if (context.getResources().getConfiguration().orientation == 2) {
            this.f20476o = "landscape";
        } else {
            this.f20476o = "portrait";
        }
        s c9 = t.b().c();
        String fillCDataParam = c9 != null ? c9.fillCDataParam("at_device1|||at_device2|||at_device3") : "";
        if (TextUtils.isEmpty(fillCDataParam)) {
            this.f20466d = "";
            this.f20469g = "";
        } else {
            String[] split = fillCDataParam.split("\\|\\|\\|");
            try {
                this.f20466d = split[0];
            } catch (Throwable unused) {
            }
            try {
                this.f20469g = split[2];
            } catch (Throwable unused2) {
            }
        }
        this.f20478q = n.f();
        this.f20479r = d.a();
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("device", this.f20463a);
            jSONObject.put("system_version", this.f20464b);
            jSONObject.put("network_type", this.f20470h);
            jSONObject.put("network_type_str", this.i);
            jSONObject.put("device_ua", this.f20471j);
            by R8 = t.b().R();
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
            jSONObject.put("mnc", m.c(t.b().g()));
            jSONObject.put("mcc", m.b(t.b().g()));
            jSONObject.put("plantform", this.f20465c);
            jSONObject.put(k.b("ZGV2aWNlX2ltZWk="), this.f20466d);
            jSONObject.put("android_id", this.f20467e);
            jSONObject.put("google_ad_id", this.f20468f);
            jSONObject.put("oaid", this.f20469g);
            jSONObject.put("az_aid_info", this.f20479r);
            jSONObject.put("appkey", this.f20472k);
            jSONObject.put(com.anythink.expressad.videocommon.e.b.f22407u, this.f20473l);
            jSONObject.put("screen_width", this.f20474m);
            jSONObject.put("screen_height", this.f20475n);
            jSONObject.put("orientation", this.f20476o);
            jSONObject.put("scale", this.f20477p);
            if (n.k() != 0) {
                jSONObject.put("tun", n.k());
            }
            jSONObject.put("f", this.f20478q);
            return jSONObject;
        } catch (JSONException e9) {
            e9.printStackTrace();
            return jSONObject;
        }
    }
}
