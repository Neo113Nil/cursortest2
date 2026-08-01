package com.anythink.expressad.mbbanner.a.e;

import android.text.TextUtils;
import com.anythink.core.common.d.t;
import com.anythink.expressad.foundation.d.d;
import com.anythink.expressad.foundation.g.a.f;
import com.anythink.expressad.foundation.h.v;
import com.anythink.expressad.foundation.h.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static final String f19974a = "b";

    public static void a() {
    }

    private static String a(String str) {
        List<com.anythink.expressad.foundation.g.e.a> list;
        try {
            Map<String, List<com.anythink.expressad.foundation.g.e.a>> map = f.i;
            if (map == null || !y.b(str) || !map.containsKey(str) || (list = map.get(str)) == null || list.size() <= 0) {
                return "";
            }
            JSONArray jSONArray = new JSONArray();
            for (int i = 0; i < list.size(); i++) {
                JSONObject jSONObject = new JSONObject();
                com.anythink.expressad.foundation.g.e.a aVar = list.get(i);
                jSONObject.put("cid", aVar.a());
                jSONObject.put(com.anythink.expressad.foundation.g.g.a.b.f19443m, aVar.c());
                jSONArray.put(jSONObject);
            }
            return jSONArray.toString();
        } catch (Exception e9) {
            e9.printStackTrace();
            return "";
        }
    }

    private static void a(String str, List<d> list) {
        Map<String, List<com.anythink.expressad.foundation.g.e.a>> map = f.i;
        if (map == null || list == null || list.size() <= 0) {
            return;
        }
        if (y.b(str)) {
            if (map.containsKey(str)) {
                map.put(str, a(map.get(str), list));
            } else {
                map.put(str, a(new ArrayList(), list));
            }
        }
        f.i = map;
    }

    private static synchronized List<com.anythink.expressad.foundation.g.e.a> a(List<com.anythink.expressad.foundation.g.e.a> list, List<d> list2) {
        synchronized (b.class) {
            if (list2 != null) {
                try {
                    if (list2.size() > 0) {
                        if (list == null) {
                            list = new ArrayList<>();
                        }
                        for (d dVar : list2) {
                            if (dVar != null) {
                                com.anythink.expressad.foundation.g.e.a aVar = new com.anythink.expressad.foundation.g.e.a(dVar.bh(), dVar.r());
                                if (list.size() >= 20) {
                                    list.remove(0);
                                }
                                list.add(aVar);
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return list;
    }

    public static d a(String str, d dVar) {
        if (TextUtils.isEmpty(str)) {
            return dVar;
        }
        if (TextUtils.isEmpty(str) && dVar == null) {
            return null;
        }
        if (!str.contains("notice")) {
            try {
                JSONObject a9 = d.a(dVar);
                d b9 = d.b(a9);
                if (b9 == null) {
                    b9 = dVar;
                }
                if (!TextUtils.isEmpty(str)) {
                    String optString = a9.optString("unitId");
                    if (!TextUtils.isEmpty(optString)) {
                        b9.l(optString);
                    }
                    JSONObject optJSONObject = new JSONObject(str).optJSONObject(com.anythink.expressad.foundation.g.a.ci);
                    if (optJSONObject != null) {
                        String.valueOf(v.b(t.b().g(), Integer.valueOf(optJSONObject.getString(com.anythink.expressad.foundation.g.a.cg)).intValue()));
                        String.valueOf(v.b(t.b().g(), Integer.valueOf(optJSONObject.getString(com.anythink.expressad.foundation.g.a.ch)).intValue()));
                    }
                    b9.p(b9.af());
                    String aj = b9.aj();
                    if (optJSONObject != null) {
                        Iterator<String> keys = optJSONObject.keys();
                        StringBuilder sb = new StringBuilder();
                        while (keys.hasNext()) {
                            sb.append("&");
                            String next = keys.next();
                            String optString2 = optJSONObject.optString(next);
                            if (com.anythink.expressad.foundation.g.a.cg.equals(next) || com.anythink.expressad.foundation.g.a.ch.equals(next)) {
                                optString2 = String.valueOf(v.b(t.b().g(), Integer.valueOf(optString2).intValue()));
                            }
                            sb.append(next);
                            sb.append("=");
                            sb.append(optString2);
                        }
                        b9.r(aj + ((Object) sb));
                    }
                }
                return b9;
            } catch (Throwable unused) {
                return dVar;
            }
        }
        try {
            JSONObject a10 = d.a(dVar);
            JSONObject jSONObject = new JSONObject(str);
            try {
                if (!jSONObject.has(d.f18572U)) {
                    a10.put(d.f18572U, "");
                }
            } catch (Exception unused2) {
            }
            Iterator<String> keys2 = jSONObject.keys();
            while (keys2.hasNext()) {
                String next2 = keys2.next();
                a10.put(next2, jSONObject.getString(next2));
            }
            d b10 = d.b(a10);
            String optString3 = a10.optString("unitId");
            if (!TextUtils.isEmpty(optString3)) {
                b10.l(optString3);
            }
            return b10;
        } catch (JSONException e9) {
            e9.printStackTrace();
            return dVar;
        }
    }
}
