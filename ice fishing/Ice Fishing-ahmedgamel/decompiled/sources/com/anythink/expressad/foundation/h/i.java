package com.anythink.expressad.foundation.h;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private static final String f19627a = "JSONUtils";

    public static ArrayList<String> a(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        int length = jSONArray.length();
        ArrayList<String> arrayList = new ArrayList<>(length);
        for (int i = 0; i < length; i++) {
            arrayList.add(jSONArray.optString(i));
        }
        return arrayList;
    }

    public static String a(int i, int i6, int i9, int i10, int i11) {
        JSONObject jSONObject = new JSONObject();
        try {
            try {
                jSONObject.put("code", 0);
                jSONObject.put("message", "Sucess");
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("rotateAngle", i);
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("left", i6);
                jSONObject3.put("right", i9);
                jSONObject3.put("top", i10);
                jSONObject3.put("bottom", i11);
                jSONObject2.put("cutoutInfo", jSONObject3);
                jSONObject.put("data", jSONObject2);
            } catch (Throwable th) {
                th.getMessage();
                try {
                    jSONObject.put("code", 1);
                    jSONObject.put("message", "Fail");
                } catch (JSONException e9) {
                    e9.getMessage();
                }
            }
        } catch (Exception e10) {
            e10.getMessage();
        }
        return jSONObject.toString();
    }
}
