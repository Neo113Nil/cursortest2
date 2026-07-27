package com.anythink.core.common.v;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.api.ATSDK;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class aa {

    /* renamed from: A, reason: collision with root package name */
    public static final String f16595A = "it_src";

    /* renamed from: a, reason: collision with root package name */
    public static final String f16596a = "platform";

    /* renamed from: b, reason: collision with root package name */
    public static final String f16597b = "os_vn";

    /* renamed from: c, reason: collision with root package name */
    public static final String f16598c = "os_vc";

    /* renamed from: d, reason: collision with root package name */
    public static final String f16599d = "package_name";

    /* renamed from: e, reason: collision with root package name */
    public static final String f16600e = "app_vn";

    /* renamed from: f, reason: collision with root package name */
    public static final String f16601f = "app_vc";

    /* renamed from: g, reason: collision with root package name */
    public static final String f16602g = "brand";

    /* renamed from: h, reason: collision with root package name */
    public static final String f16603h = "model";
    public static final String i = "screen";

    /* renamed from: j, reason: collision with root package name */
    public static final String f16604j = "network_type";

    /* renamed from: k, reason: collision with root package name */
    public static final String f16605k = "mnc";

    /* renamed from: l, reason: collision with root package name */
    public static final String f16606l = "mcc";

    /* renamed from: m, reason: collision with root package name */
    public static final String f16607m = "language";

    /* renamed from: n, reason: collision with root package name */
    public static final String f16608n = "timezone";

    /* renamed from: o, reason: collision with root package name */
    public static final String f16609o = "sdk_ver";

    /* renamed from: p, reason: collision with root package name */
    public static final String f16610p = "gp_ver";

    /* renamed from: q, reason: collision with root package name */
    public static final String f16611q = "nw_ver";

    /* renamed from: r, reason: collision with root package name */
    public static final String f16612r = "ua";

    /* renamed from: s, reason: collision with root package name */
    public static final String f16613s = "orient";

    /* renamed from: t, reason: collision with root package name */
    public static final String f16614t = "system";

    /* renamed from: u, reason: collision with root package name */
    public static final String f16615u = "android_id";

    /* renamed from: v, reason: collision with root package name */
    public static final String f16616v = "gaid";

    /* renamed from: w, reason: collision with root package name */
    public static final String f16617w = "channel";

    /* renamed from: x, reason: collision with root package name */
    public static final String f16618x = "sub_channel";

    /* renamed from: y, reason: collision with root package name */
    public static final String f16619y = "upid";

    /* renamed from: z, reason: collision with root package name */
    public static final String f16620z = "ps_id";

    public static JSONObject a() {
        JSONObject b9 = b();
        JSONObject c9 = c();
        try {
            b9.put("app_id", com.anythink.core.common.d.t.b().p());
            Iterator<String> keys = c9.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                b9.put(next, c9.opt(next));
            }
        } catch (JSONException unused) {
        }
        return b9;
    }

    private static JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        Context g4 = com.anythink.core.common.d.t.b().g();
        try {
            jSONObject.put("platform", 1);
            jSONObject.put("os_vn", m.e());
            jSONObject.put("os_vc", m.d());
            jSONObject.put("package_name", m.m(g4));
            jSONObject.put("app_vn", m.i(g4));
            jSONObject.put("app_vc", m.h(g4));
            jSONObject.put("brand", m.b());
            jSONObject.put("model", m.a());
            jSONObject.put("screen", m.l(g4));
            jSONObject.put("network_type", String.valueOf(m.o(g4)));
            jSONObject.put("mnc", m.c(g4));
            jSONObject.put("mcc", m.b(g4));
            jSONObject.put("language", m.e(g4));
            jSONObject.put("timezone", m.c());
            jSONObject.put("sdk_ver", p.a());
            jSONObject.put("gp_ver", m.p(g4));
            jSONObject.put("ua", m.h());
            jSONObject.put("orient", m.f(g4));
            jSONObject.put("system", 1);
            if (!TextUtils.isEmpty(com.anythink.core.common.d.t.b().n())) {
                jSONObject.put("channel", com.anythink.core.common.d.t.b().n());
            }
            if (!TextUtils.isEmpty(com.anythink.core.common.d.t.b().o())) {
                jSONObject.put("sub_channel", com.anythink.core.common.d.t.b().o());
            }
            jSONObject.put("upid", com.anythink.core.common.d.t.b().B());
            jSONObject.put("ps_id", com.anythink.core.common.d.t.b().r());
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    private static JSONObject c() {
        String R8;
        Context g4 = com.anythink.core.common.d.t.b().g();
        JSONObject jSONObject = new JSONObject();
        com.anythink.core.d.b g9 = D.y.g(com.anythink.core.d.d.a(g4));
        if (g9 != null) {
            try {
                R8 = g9.R();
            } catch (Exception unused) {
            }
        } else {
            R8 = "";
        }
        boolean z3 = true;
        if (!TextUtils.isEmpty(R8)) {
            try {
                JSONObject jSONObject2 = new JSONObject(R8);
                if (!jSONObject2.isNull("a")) {
                    if (jSONObject2.optInt("a") != 1) {
                        z3 = false;
                    }
                }
            } catch (Exception unused2) {
            }
        }
        jSONObject.put("android_id", z3 ? m.d(g4) : "");
        jSONObject.put("gaid", m.f());
        com.anythink.core.common.d.s c9 = com.anythink.core.common.d.t.b().c();
        if (c9 != null) {
            c9.fillRequestData(jSONObject, g9);
        }
        if (ATSDK.isCnSDK()) {
            jSONObject.put("is_cn_sdk", "1");
        } else {
            jSONObject.put("is_cn_sdk", "0");
        }
        String n9 = m.n(g4);
        jSONObject.put("it_src", TextUtils.isEmpty(n9) ? "" : n9);
        return jSONObject;
    }
}
