package com.anythink.core.common.h;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class au {

    /* renamed from: a, reason: collision with root package name */
    private final List<a> f14356a = new ArrayList();

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final String f14357a;

        /* renamed from: b, reason: collision with root package name */
        private final long f14358b;

        /* renamed from: c, reason: collision with root package name */
        private Map<String, Long> f14359c;

        public a(String str, long j6) {
            this.f14357a = str;
            this.f14358b = j6;
        }

        public final String a() {
            return this.f14357a;
        }

        public final long b() {
            return this.f14358b;
        }

        public final Map<String, Long> c() {
            return this.f14359c;
        }

        public final String toString() {
            return "{errorCode='" + this.f14357a + "', errorCodeInterval=" + this.f14358b + ", msgMap=" + this.f14359c + '}';
        }

        public final void a(Map<String, Long> map) {
            this.f14359c = map;
        }
    }

    public au(JSONObject jSONObject) {
        JSONObject optJSONObject;
        if (jSONObject != null) {
            try {
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    try {
                        String next = keys.next();
                        if (!TextUtils.isEmpty(next) && (optJSONObject = jSONObject.optJSONObject(next)) != null) {
                            a aVar = new a(next, optJSONObject.optLong("c_t", 0L));
                            try {
                                JSONObject optJSONObject2 = optJSONObject.optJSONObject(com.anythink.expressad.foundation.g.a.f19880q);
                                if (optJSONObject2 != null) {
                                    HashMap hashMap = new HashMap();
                                    Iterator<String> keys2 = optJSONObject2.keys();
                                    while (keys2.hasNext()) {
                                        try {
                                            String next2 = keys2.next();
                                            if (!TextUtils.isEmpty(next2)) {
                                                long optLong = optJSONObject2.optLong(next2, 0L);
                                                if (optLong > 0) {
                                                    hashMap.put(next2, Long.valueOf(optLong));
                                                }
                                            }
                                        } catch (Throwable unused) {
                                        }
                                    }
                                    if (!hashMap.isEmpty()) {
                                        aVar.a(hashMap);
                                    }
                                }
                            } catch (Exception e9) {
                                e9.printStackTrace();
                            }
                            this.f14356a.add(aVar);
                        }
                    } catch (Throwable unused2) {
                    }
                }
            } catch (Throwable unused3) {
            }
        }
    }

    public final List<a> a() {
        return this.f14356a;
    }
}
