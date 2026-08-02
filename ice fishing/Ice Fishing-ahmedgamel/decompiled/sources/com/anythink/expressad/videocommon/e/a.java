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
    public static final int f23142a = 1000;

    /* renamed from: b, reason: collision with root package name */
    public static final int f23143b = 1000;

    /* renamed from: c, reason: collision with root package name */
    private Map<String, Integer> f23144c;

    /* renamed from: d, reason: collision with root package name */
    private Map<String, com.anythink.expressad.videocommon.c.c> f23145d;

    /* renamed from: e, reason: collision with root package name */
    private long f23146e;

    /* renamed from: f, reason: collision with root package name */
    private long f23147f;

    /* renamed from: g, reason: collision with root package name */
    private long f23148g;

    /* renamed from: h, reason: collision with root package name */
    private long f23149h;
    private long i;

    /* renamed from: j, reason: collision with root package name */
    private long f23150j;

    private long k() {
        return this.f23146e * 1000;
    }

    private long l() {
        return this.f23147f * 1000;
    }

    private long m() {
        return this.f23150j;
    }

    private Map<String, Integer> n() {
        if (this.f23144c == null) {
            HashMap hashMap = new HashMap();
            this.f23144c = hashMap;
            hashMap.put("1", 1000);
            this.f23144c.put(b.f23183j, 1000);
            this.f23144c.put("8", 1000);
        }
        return this.f23144c;
    }

    private static a o() {
        a aVar = new a();
        HashMap hashMap = new HashMap(5);
        hashMap.put("1", 1000);
        hashMap.put(b.f23183j, 1000);
        hashMap.put("8", 1000);
        HashMap hashMap2 = new HashMap(3);
        hashMap2.put("1", new com.anythink.expressad.videocommon.c.c("Virtual Item", 1));
        aVar.f23144c = hashMap;
        aVar.f23145d = hashMap2;
        aVar.f23146e = 43200L;
        aVar.f23147f = 5400L;
        aVar.f23148g = com.anythink.expressad.f.a.b.f19188P;
        aVar.f23149h = com.anythink.expressad.f.a.b.f19188P;
        aVar.i = 5L;
        return aVar;
    }

    public final void a() {
        this.f23146e = 43200L;
    }

    public final void b() {
        this.f23147f = 5400L;
    }

    public final long c() {
        return this.f23148g * 1000;
    }

    public final void d() {
        this.f23148g = com.anythink.expressad.f.a.b.f19188P;
    }

    public final long e() {
        return this.f23149h;
    }

    public final void f() {
        this.f23149h = com.anythink.expressad.f.a.b.f19188P;
    }

    public final long g() {
        return this.i;
    }

    public final void h() {
        this.i = 5L;
    }

    public final Map<String, com.anythink.expressad.videocommon.c.c> i() {
        return this.f23145d;
    }

    public final JSONObject j() {
        JSONObject jSONObject = new JSONObject();
        try {
            Map<String, Integer> map = this.f23144c;
            if (map != null && map.size() > 0) {
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    for (Map.Entry<String, Integer> entry : this.f23144c.entrySet()) {
                        jSONObject2.put(entry.getKey(), entry.getValue().intValue());
                    }
                    jSONObject.put(b.f23175a, jSONObject2);
                } catch (Exception e9) {
                    e9.printStackTrace();
                }
            }
            Map<String, com.anythink.expressad.videocommon.c.c> map2 = this.f23145d;
            if (map2 != null && map2.size() > 0) {
                try {
                    JSONArray jSONArray = new JSONArray();
                    for (Map.Entry<String, com.anythink.expressad.videocommon.c.c> entry2 : this.f23145d.entrySet()) {
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
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
            jSONObject.put("getpf", this.f23146e);
            jSONObject.put(b.f23197x, this.f23147f);
            jSONObject.put("plct", this.f23148g);
            jSONObject.put("dlct", this.f23149h);
            jSONObject.put(b.f23151A, this.i);
            jSONObject.put("current_time", this.f23150j);
            return jSONObject;
        } catch (Exception e11) {
            e11.printStackTrace();
            return jSONObject;
        }
    }

    private void a(long j6) {
        this.f23150j = j6;
    }

    public final void b(Map<String, com.anythink.expressad.videocommon.c.c> map) {
        this.f23145d = map;
    }

    public final void a(Map<String, Integer> map) {
        this.f23144c = map;
    }

    private static a a(String str) {
        a aVar;
        a aVar2 = null;
        if (!TextUtils.isEmpty(str)) {
            try {
                aVar = new a();
            } catch (Exception e9) {
                e = e9;
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                JSONObject optJSONObject = jSONObject.optJSONObject(b.f23175a);
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
                    aVar.f23144c = hashMap;
                }
                aVar.f23145d = com.anythink.expressad.videocommon.c.c.a(jSONObject.optJSONArray("reward"));
                aVar.f23146e = jSONObject.optLong("getpf", 43200L);
                aVar.f23147f = jSONObject.optLong(b.f23197x, 5400L);
                aVar.f23148g = jSONObject.optLong("plct", com.anythink.expressad.f.a.b.f19188P);
                aVar.f23149h = jSONObject.optLong("dlct", com.anythink.expressad.f.a.b.f19188P);
                aVar.i = jSONObject.optLong(b.f23151A, 5L);
                aVar.f23150j = jSONObject.optLong("current_time");
                return aVar;
            } catch (Exception e10) {
                e = e10;
                aVar2 = aVar;
                e.printStackTrace();
                return aVar2;
            }
        }
        return aVar2;
    }
}
