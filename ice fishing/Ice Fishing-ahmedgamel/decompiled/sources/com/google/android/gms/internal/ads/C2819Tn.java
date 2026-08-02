package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;
import r2.C4906k;

/* renamed from: com.google.android.gms.internal.ads.Tn, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2819Tn {

    /* renamed from: b, reason: collision with root package name */
    public JSONObject f28579b;

    /* renamed from: c, reason: collision with root package name */
    public final RD f28580c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f28581d;

    /* renamed from: e, reason: collision with root package name */
    public JSONObject f28582e;

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f28578a = new ConcurrentHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f28583f = new AtomicBoolean(false);

    public C2819Tn(RD rd) {
        this.f28580c = rd;
    }

    public final synchronized void a() {
        JSONObject jSONObject;
        Map map;
        try {
            this.f28581d = true;
            C2909Zf n9 = C4906k.f40186C.f40196h.g().n();
            if (n9 != null && (jSONObject = n9.f29696g) != null) {
                this.f28579b = ((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f32942W4)).booleanValue() ? jSONObject.optJSONObject("common_settings") : null;
                this.f28582e = jSONObject.optJSONObject("ad_unit_patterns");
                JSONArray optJSONArray = jSONObject.optJSONArray("ad_unit_id_settings");
                if (optJSONArray != null) {
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                        if (optJSONObject != null) {
                            String optString = optJSONObject.optString("ad_unit_id");
                            String optString2 = optJSONObject.optString("format");
                            JSONObject optJSONObject2 = optJSONObject.optJSONObject("request_signals");
                            if (optString != null && optJSONObject2 != null && optString2 != null) {
                                ConcurrentHashMap concurrentHashMap = this.f28578a;
                                if (concurrentHashMap.containsKey(optString2)) {
                                    map = (Map) concurrentHashMap.get(optString2);
                                } else {
                                    ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
                                    concurrentHashMap.put(optString2, concurrentHashMap2);
                                    map = concurrentHashMap2;
                                }
                                map.put(optString, optJSONObject2);
                            }
                        }
                    }
                }
            }
        } finally {
        }
    }
}
