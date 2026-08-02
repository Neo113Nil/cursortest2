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
    protected static final String f18497a = "BaseDeviceInfo";

    /* renamed from: e, reason: collision with root package name */
    public String f18501e;

    /* renamed from: f, reason: collision with root package name */
    public String f18502f;

    /* renamed from: h, reason: collision with root package name */
    public String f18504h;
    public String i;

    /* renamed from: j, reason: collision with root package name */
    public String f18505j;

    /* renamed from: k, reason: collision with root package name */
    public String f18506k;

    /* renamed from: l, reason: collision with root package name */
    public String f18507l;

    /* renamed from: m, reason: collision with root package name */
    public String f18508m;

    /* renamed from: n, reason: collision with root package name */
    public String f18509n;

    /* renamed from: o, reason: collision with root package name */
    public String f18510o;

    /* renamed from: p, reason: collision with root package name */
    public String f18511p;

    /* renamed from: q, reason: collision with root package name */
    public String f18512q;

    /* renamed from: r, reason: collision with root package name */
    public String f18513r;

    /* renamed from: s, reason: collision with root package name */
    public String f18514s;

    /* renamed from: t, reason: collision with root package name */
    public int f18515t;

    /* renamed from: u, reason: collision with root package name */
    public int f18516u;

    /* renamed from: d, reason: collision with root package name */
    public String f18500d = com.onesignal.core.internal.backend.impl.a.TURBINE_FEATURES_PLATFORM_ANDROID;

    /* renamed from: b, reason: collision with root package name */
    public String f18498b = n.c();

    /* renamed from: c, reason: collision with root package name */
    public String f18499c = n.d();

    /* renamed from: g, reason: collision with root package name */
    public String f18503g = m.f();

    public b(Context context) {
        this.f18502f = m.d(context);
        int b9 = n.b();
        this.i = String.valueOf(b9);
        this.f18505j = n.a(context, b9);
        this.f18506k = m.h();
        this.f18507l = com.anythink.expressad.foundation.b.a.c().g();
        this.f18508m = com.anythink.expressad.foundation.b.a.c().f();
        this.f18509n = String.valueOf(v.f(context));
        this.f18510o = String.valueOf(v.e(context));
        this.f18512q = String.valueOf(v.c(context));
        if (context.getResources().getConfiguration().orientation == 2) {
            this.f18511p = "landscape";
        } else {
            this.f18511p = "portrait";
        }
        s c9 = t.b().c();
        String fillCDataParam = c9 != null ? c9.fillCDataParam("at_device1|||at_device2|||at_device3") : "";
        if (TextUtils.isEmpty(fillCDataParam)) {
            this.f18501e = "";
            this.f18504h = "";
        } else {
            String[] split = fillCDataParam.split("\\|\\|\\|");
            try {
                this.f18501e = split[0];
            } catch (Throwable unused) {
            }
            try {
                this.f18504h = split[2];
            } catch (Throwable unused2) {
            }
        }
        this.f18513r = n.f();
        this.f18514s = com.anythink.expressad.foundation.h.d.a();
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("device", this.f18498b);
            jSONObject.put("system_version", this.f18499c);
            jSONObject.put("network_type", this.i);
            jSONObject.put("network_type_str", this.f18505j);
            jSONObject.put("device_ua", this.f18506k);
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
            jSONObject.put("plantform", this.f18500d);
            jSONObject.put(k.b("ZGV2aWNlX2ltZWk="), this.f18501e);
            jSONObject.put("android_id", this.f18502f);
            jSONObject.put("google_ad_id", this.f18503g);
            jSONObject.put("oaid", this.f18504h);
            jSONObject.put("appkey", this.f18507l);
            jSONObject.put(com.anythink.expressad.videocommon.e.b.f23194u, this.f18508m);
            jSONObject.put("screen_width", this.f18509n);
            jSONObject.put("screen_height", this.f18510o);
            jSONObject.put("orientation", this.f18511p);
            jSONObject.put("scale", this.f18512q);
            if (n.k() != 0) {
                jSONObject.put("tun", n.k());
            }
            jSONObject.put("f", this.f18513r);
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
