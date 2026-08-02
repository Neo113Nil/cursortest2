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
    public String f21253d;

    /* renamed from: e, reason: collision with root package name */
    public String f21254e;

    /* renamed from: g, reason: collision with root package name */
    public String f21256g;

    /* renamed from: h, reason: collision with root package name */
    public String f21257h;
    public String i;

    /* renamed from: j, reason: collision with root package name */
    public String f21258j;

    /* renamed from: k, reason: collision with root package name */
    public String f21259k;

    /* renamed from: l, reason: collision with root package name */
    public String f21260l;

    /* renamed from: m, reason: collision with root package name */
    public String f21261m;

    /* renamed from: n, reason: collision with root package name */
    public String f21262n;

    /* renamed from: o, reason: collision with root package name */
    public String f21263o;

    /* renamed from: p, reason: collision with root package name */
    public String f21264p;

    /* renamed from: q, reason: collision with root package name */
    public String f21265q;

    /* renamed from: r, reason: collision with root package name */
    public String f21266r;

    /* renamed from: c, reason: collision with root package name */
    public String f21252c = com.onesignal.core.internal.backend.impl.a.TURBINE_FEATURES_PLATFORM_ANDROID;

    /* renamed from: a, reason: collision with root package name */
    public String f21250a = n.c();

    /* renamed from: b, reason: collision with root package name */
    public String f21251b = n.d();

    /* renamed from: f, reason: collision with root package name */
    public String f21255f = m.f();

    public a(Context context) {
        this.f21254e = m.d(context);
        int b9 = n.b();
        this.f21257h = String.valueOf(b9);
        this.i = n.a(context, b9);
        this.f21258j = m.h();
        this.f21259k = com.anythink.expressad.foundation.b.a.c().g();
        this.f21260l = com.anythink.expressad.foundation.b.a.c().f();
        this.f21261m = String.valueOf(v.f(context));
        this.f21262n = String.valueOf(v.e(context));
        this.f21264p = String.valueOf(v.c(context));
        if (context.getResources().getConfiguration().orientation == 2) {
            this.f21263o = "landscape";
        } else {
            this.f21263o = "portrait";
        }
        s c9 = t.b().c();
        String fillCDataParam = c9 != null ? c9.fillCDataParam("at_device1|||at_device2|||at_device3") : "";
        if (TextUtils.isEmpty(fillCDataParam)) {
            this.f21253d = "";
            this.f21256g = "";
        } else {
            String[] split = fillCDataParam.split("\\|\\|\\|");
            try {
                this.f21253d = split[0];
            } catch (Throwable unused) {
            }
            try {
                this.f21256g = split[2];
            } catch (Throwable unused2) {
            }
        }
        this.f21265q = n.f();
        this.f21266r = d.a();
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("device", this.f21250a);
            jSONObject.put("system_version", this.f21251b);
            jSONObject.put("network_type", this.f21257h);
            jSONObject.put("network_type_str", this.i);
            jSONObject.put("device_ua", this.f21258j);
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
            jSONObject.put("plantform", this.f21252c);
            jSONObject.put(k.b("ZGV2aWNlX2ltZWk="), this.f21253d);
            jSONObject.put("android_id", this.f21254e);
            jSONObject.put("google_ad_id", this.f21255f);
            jSONObject.put("oaid", this.f21256g);
            jSONObject.put("az_aid_info", this.f21266r);
            jSONObject.put("appkey", this.f21259k);
            jSONObject.put(com.anythink.expressad.videocommon.e.b.f23194u, this.f21260l);
            jSONObject.put("screen_width", this.f21261m);
            jSONObject.put("screen_height", this.f21262n);
            jSONObject.put("orientation", this.f21263o);
            jSONObject.put("scale", this.f21264p);
            if (n.k() != 0) {
                jSONObject.put("tun", n.k());
            }
            jSONObject.put("f", this.f21265q);
            return jSONObject;
        } catch (JSONException e9) {
            e9.printStackTrace();
            return jSONObject;
        }
    }
}
