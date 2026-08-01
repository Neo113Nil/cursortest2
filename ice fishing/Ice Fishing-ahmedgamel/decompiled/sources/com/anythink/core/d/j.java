package com.anythink.core.d;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: m, reason: collision with root package name */
    private static String f17311m = "ofm_logger";

    /* renamed from: n, reason: collision with root package name */
    private static String f17312n = "ofm_tk_sw";

    /* renamed from: o, reason: collision with root package name */
    private static String f17313o = "ofm_da_sw";

    /* renamed from: p, reason: collision with root package name */
    private static String f17314p = "tk_address";

    /* renamed from: q, reason: collision with root package name */
    private static String f17315q = "tk_max_amount";

    /* renamed from: r, reason: collision with root package name */
    private static String f17316r = "tk_interval";

    /* renamed from: s, reason: collision with root package name */
    private static String f17317s = "da_rt_keys_ft";

    /* renamed from: t, reason: collision with root package name */
    private static String f17318t = "tk_no_t_ft";

    /* renamed from: u, reason: collision with root package name */
    private static String f17319u = "da_not_keys_ft";

    /* renamed from: v, reason: collision with root package name */
    private static String f17320v = "ofm_system";

    /* renamed from: w, reason: collision with root package name */
    private static String f17321w = "ofm_tid";

    /* renamed from: x, reason: collision with root package name */
    private static String f17322x = "ofm_firm_info";

    /* renamed from: y, reason: collision with root package name */
    private static String f17323y = "ofm_st_vt";

    /* renamed from: a, reason: collision with root package name */
    String f17324a = String.valueOf(hashCode());

    /* renamed from: b, reason: collision with root package name */
    public Map<String, Object> f17325b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f17326c;

    /* renamed from: d, reason: collision with root package name */
    private int f17327d;

    /* renamed from: e, reason: collision with root package name */
    private int f17328e;

    /* renamed from: f, reason: collision with root package name */
    private long f17329f;

    /* renamed from: g, reason: collision with root package name */
    private int f17330g;

    /* renamed from: h, reason: collision with root package name */
    private int f17331h;
    private String i;

    /* renamed from: j, reason: collision with root package name */
    private int f17332j;

    /* renamed from: k, reason: collision with root package name */
    private long f17333k;

    /* renamed from: l, reason: collision with root package name */
    private Map<String, String> f17334l;

    private Map<String, Object> b(String str) {
        try {
            Map<String, Object> map = this.f17325b;
            if (map != null) {
                return com.anythink.core.common.v.q.c(map.get(str).toString());
            }
            return null;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    private int c() {
        return this.f17328e;
    }

    private int d() {
        return this.f17330g;
    }

    private int e() {
        return this.f17331h;
    }

    private String f() {
        return this.i;
    }

    private int g() {
        return this.f17332j;
    }

    private long h() {
        return this.f17333k;
    }

    private Map<String, String> i() {
        return this.f17334l;
    }

    private String j() {
        return this.f17324a;
    }

    private boolean k() {
        return this.f17326c;
    }

    public final long a() {
        return this.f17329f;
    }

    public static j a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            j jVar = new j();
            JSONObject jSONObject = new JSONObject(str);
            jVar.f17327d = jSONObject.optInt(f17320v);
            jVar.f17328e = jSONObject.optInt(f17321w);
            jVar.f17329f = jSONObject.optLong(f17323y);
            jVar.f17325b = com.anythink.core.common.v.q.c(jSONObject.optString(f17322x));
            JSONObject optJSONObject = jSONObject.optJSONObject(f17311m);
            if (optJSONObject != null) {
                jVar.f17330g = optJSONObject.optInt(f17312n);
                jVar.f17331h = optJSONObject.optInt(f17313o);
                jVar.i = optJSONObject.optString(f17314p);
                jVar.f17332j = optJSONObject.optInt(f17315q);
                jVar.f17333k = optJSONObject.optLong(f17316r);
                try {
                    JSONObject jSONObject2 = new JSONObject(optJSONObject.optString(f17318t));
                    Iterator<String> keys = jSONObject2.keys();
                    HashMap hashMap = new HashMap();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        hashMap.put(next, jSONObject2.optString(next));
                    }
                    jVar.f17334l = hashMap;
                } catch (Throwable unused) {
                }
            }
            return jVar;
        } catch (Throwable unused2) {
            return null;
        }
    }

    private static j c(String str) {
        try {
            j jVar = new j();
            JSONObject jSONObject = new JSONObject(str);
            jVar.f17326c = true;
            jVar.f17327d = jSONObject.optInt(f17320v);
            jVar.f17325b = com.anythink.core.common.v.q.c(jSONObject.optString(f17322x));
            jVar.f17330g = 1;
            jVar.f17331h = 1;
            return jVar;
        } catch (Throwable unused) {
            return null;
        }
    }

    private int b() {
        return this.f17327d;
    }
}
