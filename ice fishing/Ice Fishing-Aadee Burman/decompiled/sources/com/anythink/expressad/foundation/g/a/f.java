package com.anythink.expressad.foundation.g.a;

import android.text.TextUtils;
import com.anythink.expressad.foundation.h.y;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public static final String f19119a = "native";

    /* renamed from: b, reason: collision with root package name */
    public static final String f19120b = "reward";

    /* renamed from: c, reason: collision with root package name */
    public static final String f19121c = "interactive";

    /* renamed from: d, reason: collision with root package name */
    public static final String f19122d = "interstitial";

    /* renamed from: e, reason: collision with root package name */
    public static final String f19123e = "banner";

    /* renamed from: f, reason: collision with root package name */
    public static final String f19124f = "splash";

    /* renamed from: g, reason: collision with root package name */
    public static final String f19125g = "h5_native";

    /* renamed from: h, reason: collision with root package name */
    public static Map<String, Long> f19126h = new HashMap();
    public static Map<String, List<com.anythink.expressad.foundation.g.e.a>> i = new HashMap();

    /* renamed from: j, reason: collision with root package name */
    public static Map<String, List<com.anythink.expressad.foundation.g.e.a>> f19127j = new HashMap();

    /* renamed from: k, reason: collision with root package name */
    public static Map<String, List<com.anythink.expressad.foundation.g.e.a>> f19128k = new HashMap();

    /* renamed from: l, reason: collision with root package name */
    public static Map<String, List<com.anythink.expressad.foundation.g.e.a>> f19129l = new HashMap();

    /* renamed from: m, reason: collision with root package name */
    public static Map<String, List<com.anythink.expressad.foundation.g.e.a>> f19130m = new HashMap();

    /* renamed from: n, reason: collision with root package name */
    public static Map<String, List<com.anythink.expressad.foundation.g.e.a>> f19131n = new HashMap();

    /* renamed from: o, reason: collision with root package name */
    public static Map<String, List<com.anythink.expressad.foundation.g.e.a>> f19132o = new HashMap();

    /* renamed from: p, reason: collision with root package name */
    public static Map<String, List<com.anythink.expressad.foundation.g.e.a>> f19133p = new HashMap();

    /* renamed from: q, reason: collision with root package name */
    private static final String f19134q = "f";

    public static void a(String str, com.anythink.expressad.foundation.d.d dVar, String str2) {
        Map<String, List<com.anythink.expressad.foundation.g.e.a>> b9 = b(str2);
        if (dVar == null || b9 == null) {
            return;
        }
        try {
            if (TextUtils.isEmpty(dVar.bh())) {
                return;
            }
            com.anythink.expressad.foundation.g.e.a aVar = new com.anythink.expressad.foundation.g.e.a(dVar.bh(), dVar.aa());
            if (!b9.containsKey(str)) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(aVar);
                b9.put(str, arrayList);
                return;
            }
            List<com.anythink.expressad.foundation.g.e.a> list = b9.get(str);
            if (list != null && list.size() == 20) {
                list.remove(0);
            }
            if (list != null) {
                list.add(aVar);
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    private static void b(String str, com.anythink.expressad.foundation.d.d dVar, String str2) {
        Map<String, List<com.anythink.expressad.foundation.g.e.a>> b9 = b(str2);
        if (dVar == null || b9 == null) {
            return;
        }
        try {
            if (TextUtils.isEmpty(dVar.bh())) {
                return;
            }
            com.anythink.expressad.foundation.g.e.a aVar = new com.anythink.expressad.foundation.g.e.a(dVar.bh(), dVar.aa());
            if (!b9.containsKey(str)) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(aVar);
                b9.put(str, arrayList);
            } else {
                List<com.anythink.expressad.foundation.g.e.a> list = b9.get(str);
                if (list != null) {
                    list.add(aVar);
                }
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    private static Map<String, List<com.anythink.expressad.foundation.g.e.a>> b(String str) {
        str.getClass();
        switch (str) {
            case "banner":
                return f19131n;
            case "native":
                return f19127j;
            case "reward":
                return f19128k;
            case "splash":
                return f19132o;
            case "h5_native":
                return f19133p;
            case "interstitial":
                return f19130m;
            case "interactive":
                return f19129l;
            default:
                return null;
        }
    }

    private static String a(String str, String str2) {
        Map<String, List<com.anythink.expressad.foundation.g.e.a>> b9;
        List<com.anythink.expressad.foundation.g.e.a> list;
        JSONArray jSONArray = new JSONArray();
        if (TextUtils.isEmpty(str2)) {
            if (f19127j.containsKey(str)) {
                b9 = f19127j;
            } else if (f19128k.containsKey(str)) {
                b9 = f19128k;
            } else if (f19129l.containsKey(str)) {
                b9 = f19129l;
            } else if (f19130m.containsKey(str)) {
                b9 = f19130m;
            } else if (f19131n.containsKey(str)) {
                b9 = f19131n;
            } else if (f19132o.containsKey(str)) {
                b9 = f19132o;
            } else {
                b9 = f19133p.containsKey(str) ? f19133p : null;
            }
        } else {
            b9 = b(str2);
        }
        if (b9 != null) {
            try {
                if (y.b(str) && b9.containsKey(str) && (list = b9.get(str)) != null && list.size() > 0) {
                    for (int i6 = 0; i6 < list.size(); i6++) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("cid", list.get(i6).a());
                        jSONObject.put("rid", list.get(i6).b());
                        jSONArray.put(jSONObject);
                    }
                }
            } catch (Exception e9) {
                e9.printStackTrace();
            }
        }
        return jSONArray.toString();
    }

    private static void a(Map... mapArr) {
        try {
            for (Map map : mapArr) {
                if (map != null) {
                    map.clear();
                }
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    private static Map<String, List<com.anythink.expressad.foundation.g.e.a>> a(String str) {
        if (f19127j.containsKey(str)) {
            return f19127j;
        }
        if (f19128k.containsKey(str)) {
            return f19128k;
        }
        if (f19129l.containsKey(str)) {
            return f19129l;
        }
        if (f19130m.containsKey(str)) {
            return f19130m;
        }
        if (f19131n.containsKey(str)) {
            return f19131n;
        }
        if (f19132o.containsKey(str)) {
            return f19132o;
        }
        if (f19133p.containsKey(str)) {
            return f19133p;
        }
        return null;
    }
}
