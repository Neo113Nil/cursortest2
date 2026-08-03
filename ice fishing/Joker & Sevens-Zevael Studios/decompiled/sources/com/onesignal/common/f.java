package com.onesignal.common;

import ac.o;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class f {

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class a extends pc.k implements oc.c {
        final /* synthetic */ Map<String, Object> $map;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Map<String, ? extends Object> map) {
            super(1);
            this.$map = map;
        }

        @Override // oc.c
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((JSONObject) obj);
            return o.f277a;
        }

        public final void invoke(JSONObject jSONObject) {
            pc.j.e(jSONObject, "it");
            f.putMap(jSONObject, this.$map);
        }
    }

    public static final <T> List<T> expandJSONArray(JSONObject jSONObject, String str, oc.c cVar) {
        pc.j.e(jSONObject, "<this>");
        pc.j.e(str, "name");
        pc.j.e(cVar, "into");
        ArrayList arrayList = new ArrayList();
        if (jSONObject.has(str)) {
            JSONArray jSONArray = jSONObject.getJSONArray(str);
            int length = jSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                pc.j.d(jSONObject2, "itemJSONObject");
                Object invoke = cVar.invoke(jSONObject2);
                if (invoke != null) {
                    arrayList.add(invoke);
                }
            }
        }
        return arrayList;
    }

    public static final void expandJSONObject(JSONObject jSONObject, String str, oc.c cVar) {
        pc.j.e(jSONObject, "<this>");
        pc.j.e(str, "name");
        pc.j.e(cVar, "into");
        if (jSONObject.has(str)) {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            pc.j.d(jSONObject2, "this.getJSONObject(name)");
            cVar.invoke(jSONObject2);
        }
    }

    public static final <T> JSONObject putJSONArray(JSONObject jSONObject, String str, List<? extends T> list, oc.c cVar) {
        pc.j.e(jSONObject, "<this>");
        pc.j.e(str, "name");
        pc.j.e(cVar, "create");
        if (list != null) {
            JSONArray jSONArray = new JSONArray();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                JSONObject jSONObject2 = (JSONObject) cVar.invoke(it.next());
                if (jSONObject2 != null) {
                    jSONArray.put(jSONObject2);
                }
            }
            jSONObject.put(str, jSONArray);
        }
        return jSONObject;
    }

    public static final JSONObject putJSONObject(JSONObject jSONObject, String str, oc.c cVar) {
        pc.j.e(jSONObject, "<this>");
        pc.j.e(str, "name");
        pc.j.e(cVar, "expand");
        JSONObject jSONObject2 = new JSONObject();
        cVar.invoke(jSONObject2);
        jSONObject.put(str, jSONObject2);
        return jSONObject;
    }

    public static final JSONObject putMap(JSONObject jSONObject, Map<String, ? extends Object> map) {
        pc.j.e(jSONObject, "<this>");
        pc.j.e(map, "map");
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value == null) {
                value = JSONObject.NULL;
            }
            jSONObject.put(key, value);
        }
        return jSONObject;
    }

    public static final JSONObject putSafe(JSONObject jSONObject, String str, Object obj) {
        pc.j.e(jSONObject, "<this>");
        pc.j.e(str, "name");
        if (obj != null) {
            jSONObject.put(str, obj);
        }
        return jSONObject;
    }

    public static final Boolean safeBool(JSONObject jSONObject, String str) {
        pc.j.e(jSONObject, "<this>");
        pc.j.e(str, "name");
        if (jSONObject.has(str)) {
            return Boolean.valueOf(jSONObject.getBoolean(str));
        }
        return null;
    }

    public static final Double safeDouble(JSONObject jSONObject, String str) {
        pc.j.e(jSONObject, "<this>");
        pc.j.e(str, "name");
        if (jSONObject.has(str)) {
            return Double.valueOf(jSONObject.getDouble(str));
        }
        return null;
    }

    public static final Integer safeInt(JSONObject jSONObject, String str) {
        pc.j.e(jSONObject, "<this>");
        pc.j.e(str, "name");
        if (jSONObject.has(str)) {
            return Integer.valueOf(jSONObject.getInt(str));
        }
        return null;
    }

    public static final JSONObject safeJSONObject(JSONObject jSONObject, String str) {
        pc.j.e(jSONObject, "<this>");
        pc.j.e(str, "name");
        if (jSONObject.has(str)) {
            return jSONObject.getJSONObject(str);
        }
        return null;
    }

    public static final Long safeLong(JSONObject jSONObject, String str) {
        pc.j.e(jSONObject, "<this>");
        pc.j.e(str, "name");
        if (jSONObject.has(str)) {
            return Long.valueOf(jSONObject.getLong(str));
        }
        return null;
    }

    public static final String safeString(JSONObject jSONObject, String str) {
        pc.j.e(jSONObject, "<this>");
        pc.j.e(str, "name");
        if (jSONObject.has(str)) {
            return jSONObject.getString(str);
        }
        return null;
    }

    public static final List<Object> toList(JSONArray jSONArray) {
        pc.j.e(jSONArray, "<this>");
        int length = jSONArray.length();
        ArrayList arrayList = new ArrayList(length);
        for (int i10 = 0; i10 < length; i10++) {
            Object opt = jSONArray.opt(i10);
            if (JSONObject.NULL.equals(opt)) {
                arrayList.add(null);
            } else if (opt instanceof JSONArray) {
                arrayList.add(toList((JSONArray) opt));
            } else if (opt instanceof JSONObject) {
                arrayList.add(toMap((JSONObject) opt));
            } else {
                arrayList.add(opt);
            }
        }
        return arrayList;
    }

    public static final Map<String, Object> toMap(JSONObject jSONObject) {
        pc.j.e(jSONObject, "<this>");
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        pc.j.d(keys, "this.keys()");
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            pc.j.d(next, "key");
            if (JSONObject.NULL.equals(obj)) {
                obj = null;
            } else if (obj instanceof JSONObject) {
                obj = toMap((JSONObject) obj);
            } else if (obj instanceof JSONArray) {
                obj = toList((JSONArray) obj);
            }
            hashMap.put(next, obj);
        }
        return hashMap;
    }

    public static final JSONObject putMap(JSONObject jSONObject, String str, Map<String, ? extends Object> map) {
        pc.j.e(jSONObject, "<this>");
        pc.j.e(str, "name");
        if (map != null) {
            putJSONObject(jSONObject, str, new a(map));
        }
        return jSONObject;
    }
}
