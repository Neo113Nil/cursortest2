package com.anythink.core.d;

import android.text.TextUtils;
import com.anythink.core.d.b;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private JSONObject f18054a;

    /* renamed from: b, reason: collision with root package name */
    private Map<String, String> f18055b;

    /* renamed from: c, reason: collision with root package name */
    private Map<String, String> f18056c;

    /* renamed from: d, reason: collision with root package name */
    final String f18057d = "e";

    /* renamed from: e, reason: collision with root package name */
    private Map<String, String> f18058e;

    public final void a(JSONObject jSONObject, String str) {
        String optString = jSONObject.optString("cached");
        Map<String, String> bb = bb();
        if (!TextUtils.isEmpty(optString) && this.f18054a != null) {
            try {
                JSONObject jSONObject2 = new JSONObject(optString);
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    String optString2 = jSONObject2.optString(next);
                    String str2 = bb.get(next);
                    jSONObject.put(next, this.f18054a.opt(next));
                    if (!TextUtils.equals(optString2, str2)) {
                        com.anythink.core.common.u.e.a(str, TextUtils.isEmpty(str) ? "1" : "2", next, optString2, str2);
                        jSONObject2.put(next, str2);
                    }
                }
                jSONObject.put("cached", jSONObject2.toString());
            } catch (Throwable unused) {
            }
        }
        if (this instanceof b) {
            try {
                if (!TextUtils.isEmpty(((b) this).l()) && ((b) this).o() != null && ((b) this).o().size() > 0 && !TextUtils.equals(((b) this).l(), jSONObject.optString(b.a.f18010h, ""))) {
                    Iterator<String> it = ((b) this).o().iterator();
                    while (it.hasNext()) {
                        com.anythink.core.common.res.d.a(com.anythink.core.common.d.t.b().g()).b(com.anythink.core.common.v.o.a(it.next()));
                    }
                }
                if (!TextUtils.isEmpty(((b) this).m()) && ((b) this).q() != null && ((b) this).q().size() > 0 && !TextUtils.equals(((b) this).m(), jSONObject.optString(b.a.i, ""))) {
                    Iterator<String> it2 = ((b) this).q().iterator();
                    while (it2.hasNext()) {
                        com.anythink.core.common.res.d.a(com.anythink.core.common.d.t.b().g()).b(com.anythink.core.common.v.o.a(it2.next()));
                    }
                }
                if (TextUtils.isEmpty(((b) this).n()) || ((b) this).p() == null || ((b) this).p().size() <= 0 || TextUtils.equals(((b) this).n(), jSONObject.optString(b.a.f18011j, ""))) {
                    return;
                }
                Iterator<String> it3 = ((b) this).p().iterator();
                while (it3.hasNext()) {
                    com.anythink.core.common.res.d.a(com.anythink.core.common.d.t.b().g()).b(com.anythink.core.common.v.o.a(it3.next()));
                }
            } catch (Throwable unused2) {
            }
        }
    }

    public final void b(JSONObject jSONObject) {
        this.f18054a = jSONObject;
    }

    public final boolean ba() {
        Map<String, String> map = this.f18056c;
        return map == null || map.size() == 0;
    }

    public final synchronized Map<String, String> bb() {
        try {
            if (this.f18058e == null) {
                HashMap hashMap = new HashMap();
                this.f18058e = hashMap;
                Map<String, String> map = this.f18055b;
                if (map != null) {
                    hashMap.putAll(map);
                }
                Map<String, String> map2 = this.f18056c;
                if (map2 != null) {
                    this.f18058e.putAll(map2);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f18058e;
    }

    public final void c(JSONObject jSONObject) {
        String optString = jSONObject.optString("cached");
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(optString)) {
            try {
                JSONObject jSONObject2 = new JSONObject(optString);
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    hashMap.put(next, jSONObject2.optString(next));
                }
            } catch (Throwable unused) {
            }
        }
        this.f18055b = hashMap;
    }

    public final void d(JSONObject jSONObject) {
        String optString = jSONObject.optString(com.anythink.core.common.m.e.ap);
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(optString)) {
            try {
                JSONObject jSONObject2 = new JSONObject(optString);
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    hashMap.put(next, jSONObject2.optString(next));
                }
            } catch (Throwable unused) {
            }
        }
        this.f18056c = hashMap;
    }

    private Map<String, String> b() {
        return this.f18055b;
    }

    private Map<String, String> c() {
        return this.f18056c;
    }

    private JSONObject a() {
        return this.f18054a;
    }
}
