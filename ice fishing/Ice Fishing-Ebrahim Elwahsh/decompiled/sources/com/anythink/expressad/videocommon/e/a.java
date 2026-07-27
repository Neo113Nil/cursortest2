package com.anythink.expressad.videocommon.e;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int f22513a = 1000;

    /* renamed from: b, reason: collision with root package name */
    public static final int f22514b = 1000;

    /* renamed from: c, reason: collision with root package name */
    private Map<String, Integer> f22515c;

    /* renamed from: d, reason: collision with root package name */
    private Map<String, com.anythink.expressad.videocommon.c.c> f22516d;

    /* renamed from: e, reason: collision with root package name */
    private long f22517e;

    /* renamed from: f, reason: collision with root package name */
    private long f22518f;

    /* renamed from: g, reason: collision with root package name */
    private long f22519g;

    /* renamed from: h, reason: collision with root package name */
    private long f22520h;
    private long i;

    /* renamed from: j, reason: collision with root package name */
    private long f22521j;

    private long k() {
        return this.f22517e * 1000;
    }

    private long l() {
        return this.f22518f * 1000;
    }

    private long m() {
        return this.f22521j;
    }

    private Map<String, Integer> n() {
        if (this.f22515c == null) {
            HashMap hashMap = new HashMap();
            this.f22515c = hashMap;
            hashMap.put("1", 1000);
            this.f22515c.put(b.f22554j, 1000);
            this.f22515c.put("8", 1000);
        }
        return this.f22515c;
    }

    private static a o() {
        a aVar = new a();
        HashMap hashMap = new HashMap(5);
        hashMap.put("1", 1000);
        hashMap.put(b.f22554j, 1000);
        hashMap.put("8", 1000);
        HashMap hashMap2 = new HashMap(3);
        hashMap2.put("1", new com.anythink.expressad.videocommon.c.c("Virtual Item", 1));
        aVar.f22515c = hashMap;
        aVar.f22516d = hashMap2;
        aVar.f22517e = 43200L;
        aVar.f22518f = 5400L;
        aVar.f22519g = com.anythink.expressad.f.a.b.f18559P;
        aVar.f22520h = com.anythink.expressad.f.a.b.f18559P;
        aVar.i = 5L;
        return aVar;
    }

    public final void a() {
        this.f22517e = 43200L;
    }

    public final void b() {
        this.f22518f = 5400L;
    }

    public final long c() {
        return this.f22519g * 1000;
    }

    public final void d() {
        this.f22519g = com.anythink.expressad.f.a.b.f18559P;
    }

    public final long e() {
        return this.f22520h;
    }

    public final void f() {
        this.f22520h = com.anythink.expressad.f.a.b.f18559P;
    }

    public final long g() {
        return this.i;
    }

    public final void h() {
        this.i = 5L;
    }

    public final Map<String, com.anythink.expressad.videocommon.c.c> i() {
        return this.f22516d;
    }

    public final JSONObject j() {
        JSONObject jSONObject = new JSONObject();
        try {
            Map<String, Integer> map = this.f22515c;
            if (map != null && map.size() > 0) {
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    for (Map.Entry<String, Integer> entry : this.f22515c.entrySet()) {
                        jSONObject2.put(entry.getKey(), entry.getValue().intValue());
                    }
                    jSONObject.put(b.f22546a, jSONObject2);
                } catch (Exception e6) {
                    e6.printStackTrace();
                }
            }
            Map<String, com.anythink.expressad.videocommon.c.c> map2 = this.f22516d;
            if (map2 != null && map2.size() > 0) {
                try {
                    JSONArray jSONArray = new JSONArray();
                    for (Map.Entry<String, com.anythink.expressad.videocommon.c.c> entry2 : this.f22516d.entrySet()) {
                        JSONObject jSONObject3 = new JSONObject();
                        String key = entry2.getKey();
                        com.anythink.expressad.videocommon.c.c value = entry2.getValue();
                        if (value != null) {
                            jSONObject3.put("name", value.a());
                            jSONObject3.put("amount", value.b());
                            jSONObject3.put("id", key);
                        }
                        jSONArray.put(jSONObject3);
                    }
                    jSONObject.put("reward", jSONArray);
                } catch (Exception e9) {
                    e9.printStackTrace();
                }
            }
            jSONObject.put("getpf", this.f22517e);
            jSONObject.put(b.f22568x, this.f22518f);
            jSONObject.put("plct", this.f22519g);
            jSONObject.put("dlct", this.f22520h);
            jSONObject.put(b.f22522A, this.i);
            jSONObject.put("current_time", this.f22521j);
            return jSONObject;
        } catch (Exception e10) {
            e10.printStackTrace();
            return jSONObject;
        }
    }

    private void a(long j9) {
        this.f22521j = j9;
    }

    public final void b(Map<String, com.anythink.expressad.videocommon.c.c> map) {
        this.f22516d = map;
    }

    public final void a(Map<String, Integer> map) {
        this.f22515c = map;
    }

    private static a a(String str) {
        a aVar;
        a aVar2 = null;
        if (!TextUtils.isEmpty(str)) {
            try {
                aVar = new a();
            } catch (Exception e6) {
                e = e6;
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                JSONObject optJSONObject = jSONObject.optJSONObject(b.f22546a);
                if (optJSONObject != null && optJSONObject.length() > 0) {
                    HashMap hashMap = new HashMap();
                    Iterator<String> keys = optJSONObject.keys();
                    while (keys != null && keys.hasNext()) {
                        String next = keys.next();
                        int optInt = optJSONObject.optInt(next, 1000);
                        if (!TextUtils.isEmpty(next)) {
                            if (!TextUtils.isEmpty(next) && optInt == 0) {
                                hashMap.put(next, 1000);
                            } else {
                                hashMap.put(next, Integer.valueOf(optInt));
                            }
                        }
                    }
                    aVar.f22515c = hashMap;
                }
                aVar.f22516d = com.anythink.expressad.videocommon.c.c.a(jSONObject.optJSONArray("reward"));
                aVar.f22517e = jSONObject.optLong("getpf", 43200L);
                aVar.f22518f = jSONObject.optLong(b.f22568x, 5400L);
                aVar.f22519g = jSONObject.optLong("plct", com.anythink.expressad.f.a.b.f18559P);
                aVar.f22520h = jSONObject.optLong("dlct", com.anythink.expressad.f.a.b.f18559P);
                aVar.i = jSONObject.optLong(b.f22522A, 5L);
                aVar.f22521j = jSONObject.optLong("current_time");
                return aVar;
            } catch (Exception e9) {
                e = e9;
                aVar2 = aVar;
                e.printStackTrace();
                return aVar2;
            }
        }
        return aVar2;
    }
}
