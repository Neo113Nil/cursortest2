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
import r2.C4906k;

/* renamed from: com.google.android.gms.internal.ads.tr, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3986tr {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f35178a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f35179b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f35180c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f35181d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f35182e = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    public final RD f35183f;

    /* renamed from: g, reason: collision with root package name */
    public JSONObject f35184g;

    public C3986tr(RD rd) {
        this.f35183f = rd;
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

    public final synchronized C3793qC a(String str, String str2) {
        Map map;
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(C4906k.f40186C.f40196h.g().n().f29694e) && (map = (Map) this.f35180c.get(str)) != null) {
                List<C4040ur> list = (List) map.get(str2);
                if (list == null) {
                    String g9 = AbstractC2659Kg.g(this.f35184g, str2, str);
                    if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.oc)).booleanValue()) {
                        g9 = g9.toLowerCase(Locale.ROOT);
                    }
                    list = (List) map.get(g9);
                }
                if (list != null) {
                    HashMap hashMap = new HashMap();
                    for (C4040ur c4040ur : list) {
                        String str3 = c4040ur.f35359a;
                        if (!hashMap.containsKey(str3)) {
                            hashMap.put(str3, new ArrayList());
                        }
                        ((List) hashMap.get(str3)).add(c4040ur.f35360b);
                    }
                    return C3793qC.a(hashMap);
                }
            }
            return C3793qC.f33993z;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b(String str) {
        if (!TextUtils.isEmpty(str)) {
            HashMap hashMap = this.f35178a;
            if (!hashMap.containsKey(str)) {
                hashMap.put(str, new C4040ur(str, new Bundle()));
            }
        }
    }

    public final synchronized void c() {
        this.f35179b.clear();
        this.f35178a.clear();
        this.f35182e.clear();
        this.f35181d.clear();
        f();
        d();
        e();
    }

    public final synchronized void d() {
        JSONObject jSONObject;
        if (!((Boolean) AbstractC2840Va.f29001g.r()).booleanValue()) {
            if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f33142s2)).booleanValue() && (jSONObject = C4906k.f40186C.f40196h.g().n().f29696g) != null) {
                try {
                    JSONArray jSONArray = jSONObject.getJSONArray("signal_adapters");
                    for (int i = 0; i < jSONArray.length(); i++) {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                        Bundle j6 = j(jSONObject2.optJSONObject("data"));
                        String optString = jSONObject2.optString("adapter_class_name");
                        boolean optBoolean = jSONObject2.optBoolean("render", false);
                        boolean optBoolean2 = jSONObject2.optBoolean("collect_signals", false);
                        if (!TextUtils.isEmpty(optString)) {
                            this.f35179b.put(optString, new C4148wr(optString, optBoolean2, optBoolean, true, j6));
                        }
                    }
                } catch (JSONException e9) {
                    w2.z.l("Malformed config loading JSON.", e9);
                }
            }
        }
    }

    public final synchronized void e() {
        JSONObject jSONObject;
        try {
            if (!((Boolean) AbstractC2840Va.f28996b.r()).booleanValue()) {
                if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f33152t2)).booleanValue() && (jSONObject = C4906k.f40186C.f40196h.g().n().f29696g) != null) {
                    JSONArray jSONArray = jSONObject.getJSONArray("adapter_settings");
                    for (int i = 0; i < jSONArray.length(); i++) {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                        String optString = jSONObject2.optString("adapter_class_name");
                        JSONArray optJSONArray = jSONObject2.optJSONArray("permission_set");
                        if (!TextUtils.isEmpty(optString) && optJSONArray != null) {
                            for (int i4 = 0; i4 < optJSONArray.length(); i4++) {
                                JSONObject jSONObject3 = optJSONArray.getJSONObject(i4);
                                boolean optBoolean = jSONObject3.optBoolean("enable_rendering", false);
                                boolean optBoolean2 = jSONObject3.optBoolean("collect_secure_signals", false);
                                boolean optBoolean3 = jSONObject3.optBoolean("collect_secure_signals_on_full_app", false);
                                String optString2 = jSONObject3.optString("platform");
                                C4148wr c4148wr = new C4148wr(optString, optBoolean2, optBoolean, optBoolean3, new Bundle());
                                if (optString2.equals("ADMOB")) {
                                    this.f35181d.put(optString, c4148wr);
                                } else if (optString2.equals("AD_MANAGER")) {
                                    this.f35182e.put(optString, c4148wr);
                                }
                            }
                        }
                    }
                }
            }
        } catch (JSONException e9) {
            w2.z.l("Malformed config loading JSON.", e9);
        } finally {
        }
    }

    public final synchronized void f() {
        JSONArray optJSONArray;
        try {
            JSONObject jSONObject = C4906k.f40186C.f40196h.g().n().f29696g;
            if (jSONObject != null) {
                try {
                    JSONArray optJSONArray2 = jSONObject.optJSONArray("ad_unit_id_settings");
                    this.f35184g = jSONObject.optJSONObject("ad_unit_patterns");
                    if (optJSONArray2 != null) {
                        for (int i = 0; i < optJSONArray2.length(); i++) {
                            JSONObject jSONObject2 = optJSONArray2.getJSONObject(i);
                            String lowerCase = ((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.oc)).booleanValue() ? jSONObject2.optString("ad_unit_id", "").toLowerCase(Locale.ROOT) : jSONObject2.optString("ad_unit_id", "");
                            String optString = jSONObject2.optString("format", "");
                            ArrayList arrayList = new ArrayList();
                            JSONObject optJSONObject = jSONObject2.optJSONObject("mediation_config");
                            if (optJSONObject != null && (optJSONArray = optJSONObject.optJSONArray("ad_networks")) != null) {
                                for (int i4 = 0; i4 < optJSONArray.length(); i4++) {
                                    arrayList.addAll(g(optJSONArray.getJSONObject(i4)));
                                }
                            }
                            h(optString, lowerCase, arrayList);
                        }
                    }
                } catch (JSONException e9) {
                    w2.z.l("Malformed config loading JSON.", e9);
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
                    for (int i4 = 0; i4 < size; i4++) {
                        String str = (String) arrayList2.get(i4);
                        b(str);
                        if (((C4040ur) this.f35178a.get(str)) != null) {
                            arrayList.add(new C4040ur(str, j6));
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
            HashMap hashMap = this.f35180c;
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

    public final synchronized C3793qC i(String str) {
        HashMap hashMap;
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(C4906k.f40186C.f40196h.g().n().f29694e)) {
                C3324ha c3324ha = AbstractC3592ma.f33006d4;
                s2.r rVar = s2.r.f40506e;
                boolean matches = Pattern.matches((String) rVar.f40509c.a(c3324ha), str);
                boolean matches2 = Pattern.matches((String) rVar.f40509c.a(AbstractC3592ma.f33016e4), str);
                if (matches) {
                    hashMap = new HashMap(this.f35182e);
                } else if (matches2) {
                    hashMap = new HashMap(this.f35181d);
                }
                return C3793qC.a(hashMap);
            }
            return C3793qC.f33993z;
        } catch (Throwable th) {
            throw th;
        }
    }
}
