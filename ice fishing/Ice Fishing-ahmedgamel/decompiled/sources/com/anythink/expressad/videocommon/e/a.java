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
    public static final int f22355a = 1000;

    /* renamed from: b, reason: collision with root package name */
    public static final int f22356b = 1000;

    /* renamed from: c, reason: collision with root package name */
    private Map<String, Integer> f22357c;

    /* renamed from: d, reason: collision with root package name */
    private Map<String, com.anythink.expressad.videocommon.c.c> f22358d;

    /* renamed from: e, reason: collision with root package name */
    private long f22359e;

    /* renamed from: f, reason: collision with root package name */
    private long f22360f;

    /* renamed from: g, reason: collision with root package name */
    private long f22361g;

    /* renamed from: h, reason: collision with root package name */
    private long f22362h;
    private long i;

    /* renamed from: j, reason: collision with root package name */
    private long f22363j;

    private long k() {
        return this.f22359e * 1000;
    }

    private long l() {
        return this.f22360f * 1000;
    }

    private long m() {
        return this.f22363j;
    }

    private Map<String, Integer> n() {
        if (this.f22357c == null) {
            HashMap hashMap = new HashMap();
            this.f22357c = hashMap;
            hashMap.put("1", 1000);
            this.f22357c.put(b.f22396j, 1000);
            this.f22357c.put("8", 1000);
        }
        return this.f22357c;
    }

    private static a o() {
        a aVar = new a();
        HashMap hashMap = new HashMap(5);
        hashMap.put("1", 1000);
        hashMap.put(b.f22396j, 1000);
        hashMap.put("8", 1000);
        HashMap hashMap2 = new HashMap(3);
        hashMap2.put("1", new com.anythink.expressad.videocommon.c.c("Virtual Item", 1));
        aVar.f22357c = hashMap;
        aVar.f22358d = hashMap2;
        aVar.f22359e = 43200L;
        aVar.f22360f = 5400L;
        aVar.f22361g = com.anythink.expressad.f.a.b.f18401P;
        aVar.f22362h = com.anythink.expressad.f.a.b.f18401P;
        aVar.i = 5L;
        return aVar;
    }

    public final void a() {
        this.f22359e = 43200L;
    }

    public final void b() {
        this.f22360f = 5400L;
    }

    public final long c() {
        return this.f22361g * 1000;
    }

    public final void d() {
        this.f22361g = com.anythink.expressad.f.a.b.f18401P;
    }

    public final long e() {
        return this.f22362h;
    }

    public final void f() {
        this.f22362h = com.anythink.expressad.f.a.b.f18401P;
    }

    public final long g() {
        return this.i;
    }

    public final void h() {
        this.i = 5L;
    }

    public final Map<String, com.anythink.expressad.videocommon.c.c> i() {
        return this.f22358d;
    }

    public final JSONObject j() {
        JSONObject jSONObject = new JSONObject();
        try {
            Map<String, Integer> map = this.f22357c;
            if (map != null && map.size() > 0) {
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    for (Map.Entry<String, Integer> entry : this.f22357c.entrySet()) {
                        jSONObject2.put(entry.getKey(), entry.getValue().intValue());
                    }
                    jSONObject.put(b.f22388a, jSONObject2);
                } catch (Exception e9) {
                    e9.printStackTrace();
                }
            }
            Map<String, com.anythink.expressad.videocommon.c.c> map2 = this.f22358d;
            if (map2 != null && map2.size() > 0) {
                try {
                    JSONArray jSONArray = new JSONArray();
                    for (Map.Entry<String, com.anythink.expressad.videocommon.c.c> entry2 : this.f22358d.entrySet()) {
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
            jSONObject.put("getpf", this.f22359e);
            jSONObject.put(b.f22410x, this.f22360f);
            jSONObject.put("plct", this.f22361g);
            jSONObject.put("dlct", this.f22362h);
            jSONObject.put(b.f22364A, this.i);
            jSONObject.put("current_time", this.f22363j);
            return jSONObject;
        } catch (Exception e11) {
            e11.printStackTrace();
            return jSONObject;
        }
    }

    private void a(long j6) {
        this.f22363j = j6;
    }

    public final void b(Map<String, com.anythink.expressad.videocommon.c.c> map) {
        this.f22358d = map;
    }

    public final void a(Map<String, Integer> map) {
        this.f22357c = map;
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
                JSONObject optJSONObject = jSONObject.optJSONObject(b.f22388a);
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
                    aVar.f22357c = hashMap;
                }
                aVar.f22358d = com.anythink.expressad.videocommon.c.c.a(jSONObject.optJSONArray("reward"));
                aVar.f22359e = jSONObject.optLong("getpf", 43200L);
                aVar.f22360f = jSONObject.optLong(b.f22410x, 5400L);
                aVar.f22361g = jSONObject.optLong("plct", com.anythink.expressad.f.a.b.f18401P);
                aVar.f22362h = jSONObject.optLong("dlct", com.anythink.expressad.f.a.b.f18401P);
                aVar.i = jSONObject.optLong(b.f22364A, 5L);
                aVar.f22363j = jSONObject.optLong("current_time");
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
