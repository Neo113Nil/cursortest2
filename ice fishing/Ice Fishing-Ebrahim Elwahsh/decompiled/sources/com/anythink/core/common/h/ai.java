package com.anythink.core.common.h;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ai extends ah {

    /* renamed from: a, reason: collision with root package name */
    private int f13640a;

    /* renamed from: b, reason: collision with root package name */
    private long f13641b;

    /* renamed from: c, reason: collision with root package name */
    private int f13642c;

    /* renamed from: d, reason: collision with root package name */
    private String f13643d;

    /* renamed from: e, reason: collision with root package name */
    private Map<Integer, ak> f13644e;

    /* renamed from: f, reason: collision with root package name */
    private List<aj> f13645f;

    /* renamed from: g, reason: collision with root package name */
    private List<aj> f13646g;

    private ai() {
    }

    public static ai a(JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        JSONArray optJSONArray;
        ai aiVar = new ai();
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject("e_cwf");
            if (optJSONObject != null) {
                aiVar.f13643d = optJSONObject.optString("oe_ids");
                aiVar.f13640a = optJSONObject.optInt("ss_sw");
                aiVar.f13642c = optJSONObject.optInt("sd_sw");
                aiVar.f13641b = optJSONObject.optLong("dt");
                ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                JSONObject optJSONObject2 = optJSONObject.optJSONObject("oe");
                if (optJSONObject2 != null) {
                    Iterator<String> keys = optJSONObject2.keys();
                    while (keys.hasNext()) {
                        ak akVar = new ak();
                        String next = keys.next();
                        JSONObject optJSONObject3 = optJSONObject2.optJSONObject(next);
                        if (optJSONObject3 != null) {
                            akVar.a(optJSONObject3.optLong("t"));
                            JSONArray optJSONArray2 = optJSONObject3.optJSONArray("c");
                            JSONObject optJSONObject4 = optJSONObject3.optJSONObject("c_m");
                            if (optJSONArray2 != null && optJSONArray2.length() > 0) {
                                CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
                                HashMap hashMap = new HashMap();
                                int i = 0;
                                while (i < optJSONArray2.length()) {
                                    String optString = optJSONArray2.optString(i);
                                    copyOnWriteArrayList.add(optString);
                                    if (TextUtils.isEmpty(optString) || optJSONObject4 == null || (optJSONArray = optJSONObject4.optJSONArray(optString)) == null || optJSONArray.length() <= 0) {
                                        jSONObject3 = optJSONObject2;
                                    } else {
                                        ArrayList arrayList = new ArrayList();
                                        int i4 = 0;
                                        while (i4 < optJSONArray.length()) {
                                            Object obj = optJSONArray.get(i4);
                                            JSONObject jSONObject4 = optJSONObject2;
                                            if ((obj instanceof String) && !TextUtils.isEmpty((CharSequence) obj)) {
                                                arrayList.add((String) obj);
                                            }
                                            i4++;
                                            optJSONObject2 = jSONObject4;
                                        }
                                        jSONObject3 = optJSONObject2;
                                        if (!arrayList.isEmpty()) {
                                            hashMap.put(optString, arrayList);
                                        }
                                    }
                                    i++;
                                    optJSONObject2 = jSONObject3;
                                }
                                jSONObject2 = optJSONObject2;
                                akVar.a(copyOnWriteArrayList);
                                if (!hashMap.isEmpty()) {
                                    akVar.a(hashMap);
                                }
                                int parseInt = Integer.parseInt(next);
                                akVar.a(parseInt);
                                concurrentHashMap.put(Integer.valueOf(parseInt), akVar);
                                optJSONObject2 = jSONObject2;
                            }
                        }
                        jSONObject2 = optJSONObject2;
                        int parseInt2 = Integer.parseInt(next);
                        akVar.a(parseInt2);
                        concurrentHashMap.put(Integer.valueOf(parseInt2), akVar);
                        optJSONObject2 = jSONObject2;
                    }
                }
                aiVar.f13644e = concurrentHashMap;
            }
        } catch (Throwable unused) {
        }
        return aiVar;
    }

    public final boolean b() {
        return this.f13640a == 1;
    }

    public final boolean c() {
        return this.f13642c == 1;
    }

    public final List<aj> d() {
        return this.f13645f;
    }

    public final Map<Integer, ak> e() {
        return this.f13644e;
    }

    public final List<aj> f() {
        return this.f13646g;
    }

    public final String g() {
        return this.f13643d;
    }

    public final void b(List<aj> list) {
        this.f13646g = list;
    }

    public final boolean a() {
        return TextUtils.isEmpty(this.f13643d);
    }

    public final boolean a(long j9) {
        return j9 > 0 && System.currentTimeMillis() - j9 < this.f13641b;
    }

    public final void a(List<aj> list) {
        this.f13645f = list;
    }
}
