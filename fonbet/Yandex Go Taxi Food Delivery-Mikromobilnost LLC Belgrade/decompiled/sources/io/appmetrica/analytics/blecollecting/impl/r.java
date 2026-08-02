package io.appmetrica.analytics.blecollecting.impl;

import android.location.Location;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class r {
    public static JSONObject a(Location location, String str) {
        JSONObject jSONObject = new JSONObject();
        if (location != null) {
            try {
                jSONObject.put("l_lat", location.getLatitude());
                jSONObject.put("l_lon", location.getLongitude());
                jSONObject.put("l_time", location.getTime());
                jSONObject.put("l_acc", Float.valueOf(location.getAccuracy()));
            } catch (Throwable unused) {
            }
        }
        jSONObject.put("l_type", str);
        return jSONObject;
    }
}
