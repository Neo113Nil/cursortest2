package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p2.C4835j;

/* renamed from: com.google.android.gms.internal.ads.tr, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3963tr {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f34404a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f34405b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f34406c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f34407d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f34408e = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    public final RD f34409f;

    /* renamed from: g, reason: collision with root package name */
    public JSONObject f34410g;

    public C3963tr(RD rd) {
        this.f34409f = rd;
    }

    public static final Bundle j(JSONObject jSONObject) {
        Bundle bundle = new Bundle();
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                bundle.putString(next, jSONObject.optString(next, ""));
            }
        }
        return bundle;
    }

    public final synchronized C3770qC a(String str, String str2) {
        Map map;
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(C4835j.f39730C.f39740h.g().n().f28917e) && (map = (Map) this.f34406c.get(str)) != null) {
                List<C4017ur> list = (List) map.get(str2);
                if (list == null) {
                    String g4 = AbstractC2639Kg.g(this.f34410g, str2, str);
                    if (((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.oc)).booleanValue()) {
                        g4 = g4.toLowerCase(Locale.ROOT);
                    }
                    list = (List) map.get(g4);
                }
                if (list != null) {
                    HashMap hashMap = new HashMap();
                    for (C4017ur c4017ur : list) {
                        String str3 = c4017ur.f34596a;
                        if (!hashMap.containsKey(str3)) {
                            hashMap.put(str3, new ArrayList());
                        }
                        ((List) hashMap.get(str3)).add(c4017ur.f34597b);
                    }
                    return C3770qC.a(hashMap);
                }
            }
            return C3770qC.f33209z;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b(String str) {
        if (!TextUtils.isEmpty(str)) {
            HashMap hashMap = this.f34404a;
            if (!hashMap.containsKey(str)) {
                hashMap.put(str, new C4017ur(str, new Bundle()));
            }
        }
    }

    public final synchronized void c() {
        this.f34405b.clear();
        this.f34404a.clear();
        this.f34408e.clear();
        this.f34407d.clear();
        f();
        d();
        e();
    }

    public final synchronized void d() {
        JSONObject jSONObject;
        if (!((Boolean) AbstractC2817Va.f28204g.r()).booleanValue()) {
            if (((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.f32363s2)).booleanValue() && (jSONObject = C4835j.f39730C.f39740h.g().n().f28919g) != null) {
                try {
                    JSONArray jSONArray = jSONObject.getJSONArray("signal_adapters");
                    for (int i = 0; i < jSONArray.length(); i++) {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                        Bundle j6 = j(jSONObject2.optJSONObject("data"));
                        String optString = jSONObject2.optString("adapter_class_name");
                        boolean optBoolean = jSONObject2.optBoolean("render", false);
                        boolean optBoolean2 = jSONObject2.optBoolean("collect_signals", false);
                        if (!TextUtils.isEmpty(optString)) {
                            this.f34405b.put(optString, new C4125wr(optString, optBoolean2, optBoolean, true, j6));
                        }
                    }
                } catch (JSONException e9) {
                    u2.z.l("Malformed config loading JSON.", e9);
                }
            }
        }
    }

    public final synchronized void e() {
        JSONObject jSONObject;
        try {
            if (!((Boolean) AbstractC2817Va.f28199b.r()).booleanValue()) {
                if (((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.f32373t2)).booleanValue() && (jSONObject = C4835j.f39730C.f39740h.g().n().f28919g) != null) {
                    JSONArray jSONArray = jSONObject.getJSONArray("adapter_settings");
                    for (int i = 0; i < jSONArray.length(); i++) {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                        String optString = jSONObject2.optString("adapter_class_name");
                        JSONArray optJSONArray = jSONObject2.optJSONArray("permission_set");
                        if (!TextUtils.isEmpty(optString) && optJSONArray != null) {
                            for (int i6 = 0; i6 < optJSONArray.length(); i6++) {
                                JSONObject jSONObject3 = optJSONArray.getJSONObject(i6);
                                boolean optBoolean = jSONObject3.optBoolean("enable_rendering", false);
                                boolean optBoolean2 = jSONObject3.optBoolean("collect_secure_signals", false);
                                boolean optBoolean3 = jSONObject3.optBoolean("collect_secure_signals_on_full_app", false);
                                String optString2 = jSONObject3.optString("platform");
                                C4125wr c4125wr = new C4125wr(optString, optBoolean2, optBoolean, optBoolean3, new Bundle());
                                if (optString2.equals("ADMOB")) {
                                    this.f34407d.put(optString, c4125wr);
                                } else if (optString2.equals("AD_MANAGER")) {
                                    this.f34408e.put(optString, c4125wr);
                                }
                            }
                        }
                    }
                }
            }
        } catch (JSONException e9) {
            u2.z.l("Malformed config loading JSON.", e9);
        } finally {
        }
    }

    public final synchronized void f() {
        JSONArray optJSONArray;
        try {
            JSONObject jSONObject = C4835j.f39730C.f39740h.g().n().f28919g;
            if (jSONObject != null) {
                try {
                    JSONArray optJSONArray2 = jSONObject.optJSONArray("ad_unit_id_settings");
                    this.f34410g = jSONObject.optJSONObject("ad_unit_patterns");
                    if (optJSONArray2 != null) {
                        for (int i = 0; i < optJSONArray2.length(); i++) {
                            JSONObject jSONObject2 = optJSONArray2.getJSONObject(i);
                            String lowerCase = ((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.oc)).booleanValue() ? jSONObject2.optString("ad_unit_id", "").toLowerCase(Locale.ROOT) : jSONObject2.optString("ad_unit_id", "");
                            String optString = jSONObject2.optString("format", "");
                            ArrayList arrayList = new ArrayList();
                            JSONObject optJSONObject = jSONObject2.optJSONObject("mediation_config");
                            if (optJSONObject != null && (optJSONArray = optJSONObject.optJSONArray("ad_networks")) != null) {
                                for (int i6 = 0; i6 < optJSONArray.length(); i6++) {
                                    arrayList.addAll(g(optJSONArray.getJSONObject(i6)));
                                }
                            }
                            h(optString, lowerCase, arrayList);
                        }
                    }
                } catch (JSONException e9) {
                    u2.z.l("Malformed config loading JSON.", e9);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized ArrayList g(JSONObject jSONObject) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            if (jSONObject != null) {
                Bundle j6 = j(jSONObject.optJSONObject("data"));
                JSONArray optJSONArray = jSONObject.optJSONArray("rtb_adapters");
                if (optJSONArray != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        String optString = optJSONArray.optString(i, "");
                        if (!TextUtils.isEmpty(optString)) {
                            arrayList2.add(optString);
                        }
                    }
                    int size = arrayList2.size();
                    for (int i6 = 0; i6 < size; i6++) {
                        String str = (String) arrayList2.get(i6);
                        b(str);
                        if (((C4017ur) this.f34404a.get(str)) != null) {
                            arrayList.add(new C4017ur(str, j6));
                        }
                    }
                }
            }
        } finally {
        }
        return arrayList;
    }

    public final synchronized void h(String str, String str2, ArrayList arrayList) {
        try {
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                return;
            }
            HashMap hashMap = this.f34406c;
            Map map = (Map) hashMap.get(str);
            if (map == null) {
                map = new HashMap();
            }
            hashMap.put(str, map);
            List list = (List) map.get(str2);
            if (list == null) {
                list = new ArrayList();
            }
            list.addAll(arrayList);
            map.put(str2, list);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized C3770qC i(String str) {
        HashMap hashMap;
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(C4835j.f39730C.f39740h.g().n().f28917e)) {
                C3301ha c3301ha = AbstractC3569ma.f32226d4;
                q2.r rVar = q2.r.f40204e;
                boolean matches = Pattern.matches((String) rVar.f40207c.a(c3301ha), str);
                boolean matches2 = Pattern.matches((String) rVar.f40207c.a(AbstractC3569ma.f32236e4), str);
                if (matches) {
                    hashMap = new HashMap(this.f34408e);
                } else if (matches2) {
                    hashMap = new HashMap(this.f34407d);
                }
                return C3770qC.a(hashMap);
            }
            return C3770qC.f33209z;
        } catch (Throwable th) {
            throw th;
        }
    }
}
