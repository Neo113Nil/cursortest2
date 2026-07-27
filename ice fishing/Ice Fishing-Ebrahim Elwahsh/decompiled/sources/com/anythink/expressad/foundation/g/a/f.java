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
    public static final String f19277a = "native";

    /* renamed from: b, reason: collision with root package name */
    public static final String f19278b = "reward";

    /* renamed from: c, reason: collision with root package name */
    public static final String f19279c = "interactive";

    /* renamed from: d, reason: collision with root package name */
    public static final String f19280d = "interstitial";

    /* renamed from: e, reason: collision with root package name */
    public static final String f19281e = "banner";

    /* renamed from: f, reason: collision with root package name */
    public static final String f19282f = "splash";

    /* renamed from: g, reason: collision with root package name */
    public static final String f19283g = "h5_native";

    /* renamed from: h, reason: collision with root package name */
    public static Map<String, Long> f19284h = new HashMap();
    public static Map<String, List<com.anythink.expressad.foundation.g.e.a>> i = new HashMap();

    /* renamed from: j, reason: collision with root package name */
    public static Map<String, List<com.anythink.expressad.foundation.g.e.a>> f19285j = new HashMap();

    /* renamed from: k, reason: collision with root package name */
    public static Map<String, List<com.anythink.expressad.foundation.g.e.a>> f19286k = new HashMap();

    /* renamed from: l, reason: collision with root package name */
    public static Map<String, List<com.anythink.expressad.foundation.g.e.a>> f19287l = new HashMap();

    /* renamed from: m, reason: collision with root package name */
    public static Map<String, List<com.anythink.expressad.foundation.g.e.a>> f19288m = new HashMap();

    /* renamed from: n, reason: collision with root package name */
    public static Map<String, List<com.anythink.expressad.foundation.g.e.a>> f19289n = new HashMap();

    /* renamed from: o, reason: collision with root package name */
    public static Map<String, List<com.anythink.expressad.foundation.g.e.a>> f19290o = new HashMap();

    /* renamed from: p, reason: collision with root package name */
    public static Map<String, List<com.anythink.expressad.foundation.g.e.a>> f19291p = new HashMap();

    /* renamed from: q, reason: collision with root package name */
    private static final String f19292q = "f";

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
                return f19289n;
            case "native":
                return f19285j;
            case "reward":
                return f19286k;
            case "splash":
                return f19290o;
            case "h5_native":
                return f19291p;
            case "interstitial":
                return f19288m;
            case "interactive":
                return f19287l;
            default:
                return null;
        }
    }

    private static String a(String str, String str2) {
        Map<String, List<com.anythink.expressad.foundation.g.e.a>> b9;
        List<com.anythink.expressad.foundation.g.e.a> list;
        JSONArray jSONArray = new JSONArray();
        if (TextUtils.isEmpty(str2)) {
            if (f19285j.containsKey(str)) {
                b9 = f19285j;
            } else if (f19286k.containsKey(str)) {
                b9 = f19286k;
            } else if (f19287l.containsKey(str)) {
                b9 = f19287l;
            } else if (f19288m.containsKey(str)) {
                b9 = f19288m;
            } else if (f19289n.containsKey(str)) {
                b9 = f19289n;
            } else if (f19290o.containsKey(str)) {
                b9 = f19290o;
            } else {
                b9 = f19291p.containsKey(str) ? f19291p : null;
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
            } catch (Exception e6) {
                e6.printStackTrace();
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
        if (f19285j.containsKey(str)) {
            return f19285j;
        }
        if (f19286k.containsKey(str)) {
            return f19286k;
        }
        if (f19287l.containsKey(str)) {
            return f19287l;
        }
        if (f19288m.containsKey(str)) {
            return f19288m;
        }
        if (f19289n.containsKey(str)) {
            return f19289n;
        }
        if (f19290o.containsKey(str)) {
            return f19290o;
        }
        if (f19291p.containsKey(str)) {
            return f19291p;
        }
        return null;
    }
}
