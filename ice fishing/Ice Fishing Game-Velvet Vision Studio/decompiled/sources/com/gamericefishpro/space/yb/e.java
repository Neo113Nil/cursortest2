package com.gamericefishpro.space.yb;

import android.os.Bundle;
import com.gamericefishpro.space.ph.l0;
import com.gamericefishpro.space.ph.y;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class e {
    public static final String EXTERNAL_USER_ID = "external_user_id";
    public static final e INSTANCE = new e();

    private e() {
    }

    public final JSONObject bundleAsJSONObject(Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            try {
                jSONObject.put(str, bundle.get(str));
            } catch (JSONException e) {
                com.gamericefishpro.space.od.b.error("bundleAsJSONObject error for key: " + str, e);
            }
        }
        return jSONObject;
    }

    public final boolean compareJSONArrays(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray == null && jSONArray2 == null) {
            return true;
        }
        if (jSONArray == null || jSONArray2 == null || jSONArray.length() != jSONArray2.length()) {
            return false;
        }
        try {
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                int length2 = jSONArray2.length();
                for (int i2 = 0; i2 < length2; i2++) {
                    Object obj = jSONArray.get(i);
                    Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                    Object objNormalizeType = normalizeType(obj);
                    Object obj2 = jSONArray2.get(i2);
                    Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
                    if (Intrinsics.a(objNormalizeType, normalizeType(obj2))) {
                    }
                }
                return false;
            }
            return true;
        } catch (JSONException e) {
            e.printStackTrace();
            return false;
        }
    }

    public final Object convertToJson(Object obj) {
        if (obj == null) {
            return JSONObject.NULL;
        }
        if (!(obj instanceof Map)) {
            if (!(obj instanceof List)) {
                return obj;
            }
            JSONArray jSONArray = new JSONArray();
            Iterator it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
                jSONArray.put(INSTANCE.convertToJson(it.next()));
            }
            return jSONArray;
        }
        Set setEntrySet = ((Map) obj).entrySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : setEntrySet) {
            if (((Map.Entry) obj2).getKey() instanceof String) {
                arrayList.add(obj2);
            }
        }
        int iA = l0.a(y.j(arrayList, 10));
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj3 = arrayList.get(i);
            i++;
            Map.Entry entry = (Map.Entry) obj3;
            Object key = entry.getKey();
            Intrinsics.c(key, "null cannot be cast to non-null type kotlin.String");
            linkedHashMap.put((String) key, INSTANCE.convertToJson(entry.getValue()));
        }
        return mapToJson(linkedHashMap);
    }

    public final boolean isValidJsonObject(Object obj) {
        boolean z;
        boolean z2;
        if (obj == null ? true : obj instanceof Boolean ? true : obj instanceof Number ? true : obj instanceof String ? true : obj instanceof JSONObject ? true : obj instanceof JSONArray) {
            return true;
        }
        if (!(obj instanceof Map)) {
            if (!(obj instanceof List)) {
                return false;
            }
            Iterable iterable = (Iterable) obj;
            if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
                return true;
            }
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                if (!INSTANCE.isValidJsonObject(it.next())) {
                    return false;
                }
            }
            return true;
        }
        Map map = (Map) obj;
        Set setKeySet = map.keySet();
        if (!(setKeySet instanceof Collection) || !setKeySet.isEmpty()) {
            Iterator it2 = setKeySet.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    z = true;
                    break;
                }
                if (!(it2.next() instanceof String)) {
                    z = false;
                    break;
                }
            }
        } else {
            z = true;
            break;
        }
        if (z) {
            Collection collectionValues = map.values();
            if ((collectionValues instanceof Collection) && collectionValues.isEmpty()) {
                z2 = true;
            } else {
                Iterator it3 = collectionValues.iterator();
                while (it3.hasNext()) {
                    if (!INSTANCE.isValidJsonObject(it3.next())) {
                        z2 = false;
                    }
                }
                z2 = true;
            }
            if (z2) {
                return true;
            }
        }
        return false;
    }

    public final Bundle jsonStringToBundle(String data) {
        Intrinsics.checkNotNullParameter(data, "data");
        try {
            JSONObject jSONObject = new JSONObject(data);
            Bundle bundle = new Bundle();
            Iterator<String> itKeys = jSONObject.keys();
            Intrinsics.checkNotNullExpressionValue(itKeys, "keys(...)");
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Intrinsics.c(next, "null cannot be cast to non-null type kotlin.String");
                String str = next;
                bundle.putString(str, jSONObject.getString(str));
            }
            return bundle;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    public final JSONObject mapToJson(Map<String, ? extends Object> map) throws JSONException {
        Intrinsics.checkNotNullParameter(map, "map");
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            jSONObject.put(entry.getKey(), convertToJson(entry.getValue()));
        }
        return jSONObject;
    }

    public final Map<String, String> newStringMapFromJSONObject(JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        Iterator<String> itKeys = jsonObject.keys();
        Intrinsics.checkNotNullExpressionValue(itKeys, "keys(...)");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                Object objOpt = jsonObject.opt(next);
                if ((objOpt instanceof JSONArray) || (objOpt instanceof JSONObject)) {
                    com.gamericefishpro.space.od.b.error$default("Omitting key '" + next + "'! sendTags DO NOT supported nested values!", null, 2, null);
                } else if (jsonObject.isNull(next) || "".equals(objOpt)) {
                    linkedHashMap.put(next, "");
                } else {
                    linkedHashMap.put(next, objOpt.toString());
                }
            } catch (Throwable unused) {
            }
        }
        return linkedHashMap;
    }

    public final Set<String> newStringSetFromJSONArray(JSONArray jsonArray) throws JSONException {
        Intrinsics.checkNotNullParameter(jsonArray, "jsonArray");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int length = jsonArray.length();
        for (int i = 0; i < length; i++) {
            String string = jsonArray.getString(i);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            linkedHashSet.add(string);
        }
        return linkedHashSet;
    }

    public final Object normalizeType(Object object) {
        Intrinsics.checkNotNullParameter(object, "object");
        Class<?> cls = object.getClass();
        if (cls.equals(Integer.TYPE)) {
            return Long.valueOf(((Integer) object).intValue());
        }
        return cls.equals(Float.TYPE) ? Double.valueOf(((Float) object).floatValue()) : object;
    }

    public final String toUnescapedEUIDString(JSONObject json) {
        String strGroup;
        Intrinsics.checkNotNullParameter(json, "json");
        String string = json.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        if (json.has(EXTERNAL_USER_ID)) {
            Matcher matcher = Pattern.compile("(?<=\"external_user_id\":\").*?(?=\")").matcher(string);
            if (matcher.find() && (strGroup = matcher.group(0)) != null) {
                String strReplaceAll = matcher.replaceAll(Matcher.quoteReplacement(kotlin.text.d.i(strGroup, "\\/", "/")));
                Intrinsics.checkNotNullExpressionValue(strReplaceAll, "replaceAll(...)");
                return strReplaceAll;
            }
        }
        return string;
    }

    public final JSONArray wrapInJsonArray(JSONObject jSONObject) {
        JSONArray jSONArrayPut = new JSONArray().put(jSONObject);
        Intrinsics.checkNotNullExpressionValue(jSONArrayPut, "put(...)");
        return jSONArrayPut;
    }
}
