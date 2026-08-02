package io.appmetrica.analytics.locationinternal.impl;

import org.json.JSONArray;
import org.json.JSONObject;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

/* loaded from: classes9.dex */
public final class H {
    public static C0971n1[] a(JSONArray jSONArray) {
        if (jSONArray == null) {
            return new C0971n1[0];
        }
        int length = jSONArray.length();
        C0971n1[] c0971n1Arr = new C0971n1[length];
        for (int i = 0; i < length; i++) {
            C0971n1 c0971n1 = new C0971n1();
            try {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                c0971n1.b = optJSONObject.optInt("signal_strength", Integer.MAX_VALUE);
                c0971n1.a = optJSONObject.optInt("cell_id", Integer.MAX_VALUE);
                c0971n1.c = optJSONObject.optInt("lac", Integer.MAX_VALUE);
                c0971n1.d = optJSONObject.optInt("country_code", Integer.MAX_VALUE);
                c0971n1.e = optJSONObject.optInt("operator_id", Integer.MAX_VALUE);
                c0971n1.f = optJSONObject.optString("operator_name", c0971n1.f);
                c0971n1.g = optJSONObject.optBoolean("is_connected", c0971n1.g);
                c0971n1.h = optJSONObject.optInt("cell_type", Integer.MAX_VALUE);
                c0971n1.i = optJSONObject.optInt("pci", Integer.MAX_VALUE);
                c0971n1.j = optJSONObject.optLong("last_visible_time_offset", ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED);
                c0971n1.k = optJSONObject.optInt("lte_rsrq", Integer.MAX_VALUE);
                c0971n1.l = optJSONObject.optInt("lte_rssnr", Integer.MAX_VALUE);
                c0971n1.n = optJSONObject.optInt("arfcn", Integer.MAX_VALUE);
                c0971n1.m = optJSONObject.optInt("lte_rssi", Integer.MAX_VALUE);
                c0971n1.o = optJSONObject.optInt("lte_bandwidth", Integer.MAX_VALUE);
                c0971n1.p = optJSONObject.optInt("lte_cqi", c0971n1.p);
                c0971n1.q = optJSONObject.optInt("lte_timing_advance", c0971n1.q);
            } catch (Throwable unused) {
            }
            c0971n1Arr[i] = c0971n1;
        }
        return c0971n1Arr;
    }
}
