package io.appmetrica.analytics.accessibility.impl;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public abstract class j {
    public static List a(JSONObject jSONObject, String str) {
        if (jSONObject != null && jSONObject.has(str)) {
            try {
                JSONArray jSONArray = jSONObject.getJSONArray(str);
                int length = jSONArray.length();
                ArrayList arrayList = new ArrayList(length);
                for (int i = 0; i < length; i++) {
                    arrayList.add(jSONArray.getString(i));
                }
                return arrayList;
            } catch (Throwable unused) {
            }
        }
        return EmptyList.a;
    }
}
