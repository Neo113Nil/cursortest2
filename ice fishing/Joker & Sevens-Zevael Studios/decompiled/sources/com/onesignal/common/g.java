package com.onesignal.common;

import android.os.Bundle;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class g {
    public static final String EXTERNAL_USER_ID = "external_user_id";
    public static final g INSTANCE = new g();

    private g() {
    }

    public final JSONObject bundleAsJSONObject(Bundle bundle) {
        pc.j.e(bundle, "bundle");
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            try {
                jSONObject.put(str, bundle.get(str));
            } catch (JSONException e10) {
                com.onesignal.debug.internal.logging.b.error("bundleAsJSONObject error for key: " + str, e10);
            }
        }
        return jSONObject;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0048, code lost:
    
        r3 = r3 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean compareJSONArrays(JSONArray jSONArray, JSONArray jSONArray2) {
        int i10;
        if (jSONArray == null && jSONArray2 == null) {
            return true;
        }
        if (jSONArray == null || jSONArray2 == null || jSONArray.length() != jSONArray2.length()) {
            return false;
        }
        try {
            int length = jSONArray.length();
            int i11 = 0;
            while (i11 < length) {
                int length2 = jSONArray2.length();
                for (0; i10 < length2; i10 + 1) {
                    Object obj = jSONArray.get(i11);
                    pc.j.d(obj, "jsonArray1[i]");
                    Object normalizeType = normalizeType(obj);
                    Object obj2 = jSONArray2.get(i10);
                    pc.j.d(obj2, "jsonArray2[j]");
                    i10 = pc.j.a(normalizeType, normalizeType(obj2)) ? 0 : i10 + 1;
                }
                return false;
            }
            return true;
        } catch (JSONException e10) {
            e10.printStackTrace();
            return false;
        }
    }

    public final Bundle jsonStringToBundle(String str) {
        pc.j.e(str, "data");
        try {
            JSONObject jSONObject = new JSONObject(str);
            Bundle bundle = new Bundle();
            Iterator<String> keys = jSONObject.keys();
            pc.j.d(keys, "jsonObject.keys()");
            while (keys.hasNext()) {
                String next = keys.next();
                pc.j.c(next, "null cannot be cast to non-null type kotlin.String");
                String str2 = next;
                bundle.putString(str2, jSONObject.getString(str2));
            }
            return bundle;
        } catch (JSONException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public final Map<String, String> newStringMapFromJSONObject(JSONObject jSONObject) {
        Object opt;
        pc.j.e(jSONObject, "jsonObject");
        Iterator<String> keys = jSONObject.keys();
        pc.j.d(keys, "jsonObject.keys()");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                opt = jSONObject.opt(next);
            } catch (Throwable unused) {
            }
            if (!(opt instanceof JSONArray) && !(opt instanceof JSONObject)) {
                if (!jSONObject.isNull(next) && !"".equals(opt)) {
                    linkedHashMap.put(next, opt.toString());
                }
                linkedHashMap.put(next, "");
            }
            com.onesignal.debug.internal.logging.b.error$default("Omitting key '" + next + "'! sendTags DO NOT supported nested values!", null, 2, null);
        }
        return linkedHashMap;
    }

    public final Set<String> newStringSetFromJSONArray(JSONArray jSONArray) {
        pc.j.e(jSONArray, "jsonArray");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            String string = jSONArray.getString(i10);
            pc.j.d(string, "jsonArray.getString(i)");
            linkedHashSet.add(string);
        }
        return linkedHashSet;
    }

    public final Object normalizeType(Object obj) {
        pc.j.e(obj, "object");
        Class<?> cls = obj.getClass();
        return cls.equals(Integer.TYPE) ? Long.valueOf(((Integer) obj).intValue()) : cls.equals(Float.TYPE) ? Double.valueOf(((Float) obj).floatValue()) : obj;
    }

    public final String toUnescapedEUIDString(JSONObject jSONObject) {
        String group;
        pc.j.e(jSONObject, "json");
        String jSONObject2 = jSONObject.toString();
        pc.j.d(jSONObject2, "json.toString()");
        if (jSONObject.has(EXTERNAL_USER_ID)) {
            Matcher matcher = Pattern.compile("(?<=\"external_user_id\":\").*?(?=\")").matcher(jSONObject2);
            if (matcher.find() && (group = matcher.group(0)) != null) {
                String replaceAll = matcher.replaceAll(Matcher.quoteReplacement(xc.h.w(group, "\\/", "/")));
                pc.j.d(replaceAll, "eidMatcher.replaceAll(unescapedEID)");
                return replaceAll;
            }
        }
        return jSONObject2;
    }

    public final JSONArray wrapInJsonArray(JSONObject jSONObject) {
        JSONArray put = new JSONArray().put(jSONObject);
        pc.j.d(put, "JSONArray().put(jsonObject)");
        return put;
    }
}
