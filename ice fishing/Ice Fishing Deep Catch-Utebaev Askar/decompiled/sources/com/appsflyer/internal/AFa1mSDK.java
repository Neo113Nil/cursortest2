package com.appsflyer.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class AFa1mSDK {
    public static AFh1sSDK AFAdRevenueData(Context context) {
        if (context instanceof Activity) {
            return AFh1sSDK.activity;
        }
        return context instanceof Application ? AFh1sSDK.application : AFh1sSDK.other;
    }

    private static List<Object> getCurrencyIso4217Code(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            Object revenue = jSONArray.get(i2);
            if (revenue instanceof JSONArray) {
                revenue = getCurrencyIso4217Code((JSONArray) revenue);
            } else if (revenue instanceof JSONObject) {
                revenue = getRevenue((JSONObject) revenue);
            }
            arrayList.add(revenue);
        }
        return arrayList;
    }

    private static Object getMediationNetwork(Object obj) {
        if (obj == null) {
            return JSONObject.NULL;
        }
        if ((obj instanceof JSONArray) || (obj instanceof JSONObject) || obj.equals(JSONObject.NULL)) {
            return obj;
        }
        try {
            if (obj instanceof Collection) {
                JSONArray jSONArray = new JSONArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    jSONArray.put(getMediationNetwork(it.next()));
                }
                return jSONArray;
            }
            if (!obj.getClass().isArray()) {
                if (obj instanceof Map) {
                    return getMediationNetwork((Map<String, ?>) obj);
                }
                return ((obj instanceof Boolean) || (obj instanceof Byte) || (obj instanceof Character) || (obj instanceof Double) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Short) || (obj instanceof String)) ? obj : obj.toString();
            }
            int length = Array.getLength(obj);
            JSONArray jSONArray2 = new JSONArray();
            for (int i2 = 0; i2 < length; i2++) {
                jSONArray2.put(getMediationNetwork(Array.get(obj, i2)));
            }
            return jSONArray2;
        } catch (Exception unused) {
            return JSONObject.NULL;
        }
    }

    public static JSONObject getMonetizationNetwork(String str) {
        if (str == null) {
            return null;
        }
        try {
            return new JSONObject(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    public static Map<String, Object> getRevenue(JSONObject jSONObject) throws JSONException {
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object revenue = jSONObject.get(next);
            if (revenue instanceof JSONArray) {
                revenue = getCurrencyIso4217Code((JSONArray) revenue);
            } else if (revenue instanceof JSONObject) {
                revenue = getRevenue((JSONObject) revenue);
            }
            map.put(next, revenue);
        }
        return map;
    }

    public static JSONObject getMediationNetwork(Map<String, ?> map) {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, ?> entry : map.entrySet()) {
            try {
                jSONObject.put(entry.getKey(), getMediationNetwork(entry.getValue()));
            } catch (JSONException unused) {
            }
        }
        return jSONObject;
    }
}
