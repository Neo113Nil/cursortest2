package com.anythink.expressad.advanced.a;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.api.ATSDK;
import com.anythink.core.common.d.s;
import com.anythink.core.common.d.t;
import com.anythink.core.common.h.by;
import com.anythink.core.common.v.k;
import com.anythink.core.common.v.m;
import com.anythink.expressad.foundation.h.n;
import com.anythink.expressad.foundation.h.v;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    protected static final String f17710a = "BaseDeviceInfo";

    /* renamed from: e, reason: collision with root package name */
    public String f17714e;

    /* renamed from: f, reason: collision with root package name */
    public String f17715f;

    /* renamed from: h, reason: collision with root package name */
    public String f17717h;
    public String i;

    /* renamed from: j, reason: collision with root package name */
    public String f17718j;

    /* renamed from: k, reason: collision with root package name */
    public String f17719k;

    /* renamed from: l, reason: collision with root package name */
    public String f17720l;

    /* renamed from: m, reason: collision with root package name */
    public String f17721m;

    /* renamed from: n, reason: collision with root package name */
    public String f17722n;

    /* renamed from: o, reason: collision with root package name */
    public String f17723o;

    /* renamed from: p, reason: collision with root package name */
    public String f17724p;

    /* renamed from: q, reason: collision with root package name */
    public String f17725q;

    /* renamed from: r, reason: collision with root package name */
    public String f17726r;

    /* renamed from: s, reason: collision with root package name */
    public String f17727s;

    /* renamed from: t, reason: collision with root package name */
    public int f17728t;

    /* renamed from: u, reason: collision with root package name */
    public int f17729u;

    /* renamed from: d, reason: collision with root package name */
    public String f17713d = com.onesignal.core.internal.backend.impl.a.TURBINE_FEATURES_PLATFORM_ANDROID;

    /* renamed from: b, reason: collision with root package name */
    public String f17711b = n.c();

    /* renamed from: c, reason: collision with root package name */
    public String f17712c = n.d();

    /* renamed from: g, reason: collision with root package name */
    public String f17716g = m.f();

    public b(Context context) {
        this.f17715f = m.d(context);
        int b9 = n.b();
        this.i = String.valueOf(b9);
        this.f17718j = n.a(context, b9);
        this.f17719k = m.h();
        this.f17720l = com.anythink.expressad.foundation.b.a.c().g();
        this.f17721m = com.anythink.expressad.foundation.b.a.c().f();
        this.f17722n = String.valueOf(v.f(context));
        this.f17723o = String.valueOf(v.e(context));
        this.f17725q = String.valueOf(v.c(context));
        if (context.getResources().getConfiguration().orientation == 2) {
            this.f17724p = "landscape";
        } else {
            this.f17724p = "portrait";
        }
        s c9 = t.b().c();
        String fillCDataParam = c9 != null ? c9.fillCDataParam("at_device1|||at_device2|||at_device3") : "";
        if (TextUtils.isEmpty(fillCDataParam)) {
            this.f17714e = "";
            this.f17717h = "";
        } else {
            String[] split = fillCDataParam.split("\\|\\|\\|");
            try {
                this.f17714e = split[0];
            } catch (Throwable unused) {
            }
            try {
                this.f17717h = split[2];
            } catch (Throwable unused2) {
            }
        }
        this.f17726r = n.f();
        this.f17727s = com.anythink.expressad.foundation.h.d.a();
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("device", this.f17711b);
            jSONObject.put("system_version", this.f17712c);
            jSONObject.put("network_type", this.i);
            jSONObject.put("network_type_str", this.f17718j);
            jSONObject.put("device_ua", this.f17719k);
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
            jSONObject.put("plantform", this.f17713d);
            jSONObject.put(k.b("ZGV2aWNlX2ltZWk="), this.f17714e);
            jSONObject.put("android_id", this.f17715f);
            jSONObject.put("google_ad_id", this.f17716g);
            jSONObject.put("oaid", this.f17717h);
            jSONObject.put("appkey", this.f17720l);
            jSONObject.put(com.anythink.expressad.videocommon.e.b.f22407u, this.f17721m);
            jSONObject.put("screen_width", this.f17722n);
            jSONObject.put("screen_height", this.f17723o);
            jSONObject.put("orientation", this.f17724p);
            jSONObject.put("scale", this.f17725q);
            if (n.k() != 0) {
                jSONObject.put("tun", n.k());
            }
            jSONObject.put("f", this.f17726r);
            if (!ATSDK.isCnSDK()) {
                jSONObject.put("re_domain", "1");
                return jSONObject;
            }
        } catch (Throwable th) {
            th.getMessage();
        }
        return jSONObject;
    }
}
