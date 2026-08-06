package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import com.yandex.varioqub.config.model.ConfigValue;
import io.appmetrica.analytics.coreapi.internal.model.ScreenInfo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.gb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0430gb {
    public static String a(HashMap hashMap) {
        if (hashMap == null) {
            return null;
        }
        return hashMap.isEmpty() ? "" : b(hashMap);
    }

    public static String b(Map map) {
        if (AbstractC0572lo.a(map)) {
            return null;
        }
        return new JSONObject(map).toString();
    }

    public static HashMap c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            HashMap hashMap = new HashMap();
            if (!JSONObject.NULL.equals(jSONObject)) {
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    hashMap.put(next, jSONObject.optString(next));
                }
            }
            return hashMap;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static HashMap d(String str) {
        JSONObject jSONObject = new JSONObject(str);
        HashMap hashMap = new HashMap();
        if (!JSONObject.NULL.equals(jSONObject)) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.optString(next));
            }
        }
        return hashMap;
    }

    public static ScreenInfo e(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(str);
            return new ScreenInfo(jSONObject.optInt("width"), jSONObject.optInt("height"), jSONObject.optInt("dpi"), (float) jSONObject.optDouble("scaleFactor", ConfigValue.DOUBLE_DEFAULT_VALUE));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static ArrayList b(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONArray jSONArray = new JSONArray(str);
                ArrayList arrayList = new ArrayList(jSONArray.length());
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    try {
                        arrayList.add(jSONArray.getString(i2));
                    } catch (Throwable unused) {
                        return arrayList;
                    }
                }
                return arrayList;
            } catch (Throwable unused2) {
            }
        }
        return null;
    }

    public static HashMap a(String str) {
        if (str == null) {
            return null;
        }
        if (str.isEmpty()) {
            return new HashMap();
        }
        return c(str);
    }

    public static Integer a(JSONObject jSONObject, String str, Integer num) {
        if (jSONObject == null || !jSONObject.has(str)) {
            return num;
        }
        try {
            return Integer.valueOf(jSONObject.getInt(str));
        } catch (Throwable unused) {
            return num;
        }
    }

    public static ArrayList a(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            arrayList.add(jSONArray.getString(i2));
        }
        return arrayList;
    }

    public static String a(ScreenInfo screenInfo) {
        JSONObject jSONObject;
        if (screenInfo == null) {
            jSONObject = null;
        } else {
            jSONObject = new JSONObject();
            try {
                jSONObject.put("width", screenInfo.getWidth()).put("height", screenInfo.getHeight()).put("dpi", screenInfo.getDpi()).put("scaleFactor", screenInfo.getScaleFactor());
            } catch (Throwable unused) {
            }
        }
        if (jSONObject == null) {
            return null;
        }
        return jSONObject.toString();
    }

    public static String a(Map map) {
        if (map == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry entry : map.entrySet()) {
                List list = (List) entry.getValue();
                JSONArray jSONArray = AbstractC0572lo.a((Collection) list) ? null : new JSONArray((Collection) list);
                if (jSONArray != null) {
                    jSONObject.put((String) entry.getKey(), jSONArray.toString());
                }
            }
        } catch (Throwable unused) {
        }
        return jSONObject.toString();
    }
}
