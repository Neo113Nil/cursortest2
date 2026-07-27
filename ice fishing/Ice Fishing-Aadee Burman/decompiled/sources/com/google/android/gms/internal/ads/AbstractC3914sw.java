package com.google.android.gms.internal.ads;

import android.content.res.Resources;
import android.graphics.Point;
import android.view.WindowManager;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.sw, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3914sw {

    /* renamed from: a, reason: collision with root package name */
    public static WindowManager f34168a;

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f34169b = {"x", "y", "width", "height"};

    /* renamed from: c, reason: collision with root package name */
    public static float f34170c = Resources.getSystem().getDisplayMetrics().density;

    public static JSONObject a(int i, int i6, int i9, int i10) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", i / f34170c);
            jSONObject.put("y", i6 / f34170c);
            jSONObject.put("width", i9 / f34170c);
            jSONObject.put("height", i10 / f34170c);
            return jSONObject;
        } catch (JSONException e9) {
            MA.j("Error with creating viewStateObject", e9);
            return jSONObject;
        }
    }

    public static void b(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (NullPointerException | JSONException e9) {
            StringBuilder sb = new StringBuilder(str.length() + 47);
            sb.append("JSONException during JSONObject.put for name [");
            sb.append(str);
            sb.append("]");
            MA.j(sb.toString(), e9);
        }
    }

    public static void c(JSONObject jSONObject, JSONObject jSONObject2) {
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray("childViews");
            if (optJSONArray == null) {
                optJSONArray = new JSONArray();
                jSONObject.put("childViews", optJSONArray);
            }
            optJSONArray.put(jSONObject2);
        } catch (JSONException e9) {
            e9.printStackTrace();
        }
    }

    public static void d(JSONObject jSONObject) {
        float f3;
        float f9;
        if (f34168a != null) {
            Point point = new Point(0, 0);
            f34168a.getDefaultDisplay().getRealSize(point);
            float f10 = point.x;
            float f11 = f34170c;
            f3 = f10 / f11;
            f9 = point.y / f11;
        } else {
            f3 = 0.0f;
            f9 = 0.0f;
        }
        try {
            jSONObject.put("width", f3);
            jSONObject.put("height", f9);
        } catch (JSONException e9) {
            e9.printStackTrace();
        }
    }

    public static boolean e(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        if (jSONObject != null && jSONObject2 != null) {
            String[] strArr = f34169b;
            int i = 0;
            while (true) {
                if (i < 4) {
                    String str = strArr[i];
                    if (jSONObject.optDouble(str) != jSONObject2.optDouble(str)) {
                        break;
                    }
                    i++;
                } else if (jSONObject.optString("adSessionId", "").equals(jSONObject2.optString("adSessionId", "")) && Boolean.valueOf(jSONObject.optBoolean("noOutputDevice")).equals(Boolean.valueOf(jSONObject2.optBoolean("noOutputDevice"))) && Boolean.valueOf(jSONObject.optBoolean("hasWindowFocus")).equals(Boolean.valueOf(jSONObject2.optBoolean("hasWindowFocus")))) {
                    JSONArray optJSONArray = jSONObject.optJSONArray("isFriendlyObstructionFor");
                    JSONArray optJSONArray2 = jSONObject2.optJSONArray("isFriendlyObstructionFor");
                    if (optJSONArray != null || optJSONArray2 != null) {
                        if ((optJSONArray == null && optJSONArray2 == null) || (optJSONArray != null && optJSONArray2 != null && optJSONArray.length() == optJSONArray2.length())) {
                            for (int i6 = 0; i6 < optJSONArray.length(); i6++) {
                                if (!optJSONArray.optString(i6, "").equals(optJSONArray2.optString(i6, ""))) {
                                    break;
                                }
                            }
                        }
                    }
                    JSONArray optJSONArray3 = jSONObject.optJSONArray("childViews");
                    JSONArray optJSONArray4 = jSONObject2.optJSONArray("childViews");
                    if (optJSONArray3 == null && optJSONArray4 == null) {
                        return true;
                    }
                    if ((optJSONArray3 == null && optJSONArray4 == null) || (optJSONArray3 != null && optJSONArray4 != null && optJSONArray3.length() == optJSONArray4.length())) {
                        for (int i9 = 0; i9 < optJSONArray3.length(); i9++) {
                            if (e(optJSONArray3.optJSONObject(i9), optJSONArray4.optJSONObject(i9))) {
                            }
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
