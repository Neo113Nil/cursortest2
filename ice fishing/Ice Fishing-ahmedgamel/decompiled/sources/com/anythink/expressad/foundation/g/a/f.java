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
    public static final String f19906a = "native";

    /* renamed from: b, reason: collision with root package name */
    public static final String f19907b = "reward";

    /* renamed from: c, reason: collision with root package name */
    public static final String f19908c = "interactive";

    /* renamed from: d, reason: collision with root package name */
    public static final String f19909d = "interstitial";

    /* renamed from: e, reason: collision with root package name */
    public static final String f19910e = "banner";

    /* renamed from: f, reason: collision with root package name */
    public static final String f19911f = "splash";

    /* renamed from: g, reason: collision with root package name */
    public static final String f19912g = "h5_native";

    /* renamed from: h, reason: collision with root package name */
    public static Map<String, Long> f19913h = new HashMap();
    public static Map<String, List<com.anythink.expressad.foundation.g.e.a>> i = new HashMap();

    /* renamed from: j, reason: collision with root package name */
    public static Map<String, List<com.anythink.expressad.foundation.g.e.a>> f19914j = new HashMap();

    /* renamed from: k, reason: collision with root package name */
    public static Map<String, List<com.anythink.expressad.foundation.g.e.a>> f19915k = new HashMap();

    /* renamed from: l, reason: collision with root package name */
    public static Map<String, List<com.anythink.expressad.foundation.g.e.a>> f19916l = new HashMap();

    /* renamed from: m, reason: collision with root package name */
    public static Map<String, List<com.anythink.expressad.foundation.g.e.a>> f19917m = new HashMap();

    /* renamed from: n, reason: collision with root package name */
    public static Map<String, List<com.anythink.expressad.foundation.g.e.a>> f19918n = new HashMap();

    /* renamed from: o, reason: collision with root package name */
    public static Map<String, List<com.anythink.expressad.foundation.g.e.a>> f19919o = new HashMap();

    /* renamed from: p, reason: collision with root package name */
    public static Map<String, List<com.anythink.expressad.foundation.g.e.a>> f19920p = new HashMap();

    /* renamed from: q, reason: collision with root package name */
    private static final String f19921q = "f";

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
                return f19918n;
            case "native":
                return f19914j;
            case "reward":
                return f19915k;
            case "splash":
                return f19919o;
            case "h5_native":
                return f19920p;
            case "interstitial":
                return f19917m;
            case "interactive":
                return f19916l;
            default:
                return null;
        }
    }

    private static String a(String str, String str2) {
        Map<String, List<com.anythink.expressad.foundation.g.e.a>> b9;
        List<com.anythink.expressad.foundation.g.e.a> list;
        JSONArray jSONArray = new JSONArray();
        if (TextUtils.isEmpty(str2)) {
            if (f19914j.containsKey(str)) {
                b9 = f19914j;
            } else if (f19915k.containsKey(str)) {
                b9 = f19915k;
            } else if (f19916l.containsKey(str)) {
                b9 = f19916l;
            } else if (f19917m.containsKey(str)) {
                b9 = f19917m;
            } else if (f19918n.containsKey(str)) {
                b9 = f19918n;
            } else if (f19919o.containsKey(str)) {
                b9 = f19919o;
            } else {
                b9 = f19920p.containsKey(str) ? f19920p : null;
            }
        } else {
            b9 = b(str2);
        }
        if (b9 != null) {
            try {
                if (y.b(str) && b9.containsKey(str) && (list = b9.get(str)) != null && list.size() > 0) {
                    for (int i4 = 0; i4 < list.size(); i4++) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("cid", list.get(i4).a());
                        jSONObject.put("rid", list.get(i4).b());
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
        if (f19914j.containsKey(str)) {
            return f19914j;
        }
        if (f19915k.containsKey(str)) {
            return f19915k;
        }
        if (f19916l.containsKey(str)) {
            return f19916l;
        }
        if (f19917m.containsKey(str)) {
            return f19917m;
        }
        if (f19918n.containsKey(str)) {
            return f19918n;
        }
        if (f19919o.containsKey(str)) {
            return f19919o;
        }
        if (f19920p.containsKey(str)) {
            return f19920p;
        }
        return null;
    }
}
