package com.anythink.core.d;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: m, reason: collision with root package name */
    private static String f18098m = "ofm_logger";

    /* renamed from: n, reason: collision with root package name */
    private static String f18099n = "ofm_tk_sw";

    /* renamed from: o, reason: collision with root package name */
    private static String f18100o = "ofm_da_sw";

    /* renamed from: p, reason: collision with root package name */
    private static String f18101p = "tk_address";

    /* renamed from: q, reason: collision with root package name */
    private static String f18102q = "tk_max_amount";

    /* renamed from: r, reason: collision with root package name */
    private static String f18103r = "tk_interval";

    /* renamed from: s, reason: collision with root package name */
    private static String f18104s = "da_rt_keys_ft";

    /* renamed from: t, reason: collision with root package name */
    private static String f18105t = "tk_no_t_ft";

    /* renamed from: u, reason: collision with root package name */
    private static String f18106u = "da_not_keys_ft";

    /* renamed from: v, reason: collision with root package name */
    private static String f18107v = "ofm_system";

    /* renamed from: w, reason: collision with root package name */
    private static String f18108w = "ofm_tid";

    /* renamed from: x, reason: collision with root package name */
    private static String f18109x = "ofm_firm_info";

    /* renamed from: y, reason: collision with root package name */
    private static String f18110y = "ofm_st_vt";

    /* renamed from: a, reason: collision with root package name */
    String f18111a = String.valueOf(hashCode());

    /* renamed from: b, reason: collision with root package name */
    public Map<String, Object> f18112b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f18113c;

    /* renamed from: d, reason: collision with root package name */
    private int f18114d;

    /* renamed from: e, reason: collision with root package name */
    private int f18115e;

    /* renamed from: f, reason: collision with root package name */
    private long f18116f;

    /* renamed from: g, reason: collision with root package name */
    private int f18117g;

    /* renamed from: h, reason: collision with root package name */
    private int f18118h;
    private String i;

    /* renamed from: j, reason: collision with root package name */
    private int f18119j;

    /* renamed from: k, reason: collision with root package name */
    private long f18120k;

    /* renamed from: l, reason: collision with root package name */
    private Map<String, String> f18121l;

    private Map<String, Object> b(String str) {
        try {
            Map<String, Object> map = this.f18112b;
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
        return this.f18115e;
    }

    private int d() {
        return this.f18117g;
    }

    private int e() {
        return this.f18118h;
    }

    private String f() {
        return this.i;
    }

    private int g() {
        return this.f18119j;
    }

    private long h() {
        return this.f18120k;
    }

    private Map<String, String> i() {
        return this.f18121l;
    }

    private String j() {
        return this.f18111a;
    }

    private boolean k() {
        return this.f18113c;
    }

    public final long a() {
        return this.f18116f;
    }

    public static j a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            j jVar = new j();
            JSONObject jSONObject = new JSONObject(str);
            jVar.f18114d = jSONObject.optInt(f18107v);
            jVar.f18115e = jSONObject.optInt(f18108w);
            jVar.f18116f = jSONObject.optLong(f18110y);
            jVar.f18112b = com.anythink.core.common.v.q.c(jSONObject.optString(f18109x));
            JSONObject optJSONObject = jSONObject.optJSONObject(f18098m);
            if (optJSONObject != null) {
                jVar.f18117g = optJSONObject.optInt(f18099n);
                jVar.f18118h = optJSONObject.optInt(f18100o);
                jVar.i = optJSONObject.optString(f18101p);
                jVar.f18119j = optJSONObject.optInt(f18102q);
                jVar.f18120k = optJSONObject.optLong(f18103r);
                try {
                    JSONObject jSONObject2 = new JSONObject(optJSONObject.optString(f18105t));
                    Iterator<String> keys = jSONObject2.keys();
                    HashMap hashMap = new HashMap();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        hashMap.put(next, jSONObject2.optString(next));
                    }
                    jVar.f18121l = hashMap;
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
            jVar.f18113c = true;
            jVar.f18114d = jSONObject.optInt(f18107v);
            jVar.f18112b = com.anythink.core.common.v.q.c(jSONObject.optString(f18109x));
            jVar.f18117g = 1;
            jVar.f18118h = 1;
            return jVar;
        } catch (Throwable unused) {
            return null;
        }
    }

    private int b() {
        return this.f18114d;
    }
}
