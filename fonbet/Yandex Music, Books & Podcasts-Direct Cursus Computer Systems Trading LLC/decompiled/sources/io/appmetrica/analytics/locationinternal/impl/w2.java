package io.appmetrica.analytics.locationinternal.impl;

import defpackage.tlm;
import java.util.Collection;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class w2 {
    public final String a;
    public final String b;
    public final boolean c;
    public final int d;
    public final Long e;

    public w2(String str, String str2, boolean z, int i, Long l) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = i;
        this.e = l;
    }

    public static JSONArray a(Collection collection) {
        JSONObject jSONObject;
        JSONArray jSONArray = new JSONArray();
        if (collection != null) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                w2 w2Var = (w2) it.next();
                w2Var.getClass();
                try {
                    jSONObject = new JSONObject().put("mac", w2Var.a).put("ssid", w2Var.b).put("signal_strength", w2Var.d).put("is_connected", w2Var.c).put("last_visible_offset_seconds", w2Var.e);
                } catch (Throwable unused) {
                    jSONObject = null;
                }
                if (jSONObject != null) {
                    jSONArray.put(jSONObject);
                }
            }
        }
        return jSONArray;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WifiData{mac='");
        sb.append(this.a);
        sb.append("', ssid='");
        sb.append(this.b);
        sb.append("', connected=");
        sb.append(this.c);
        sb.append(", signalStrength=");
        sb.append(this.d);
        sb.append(", lastVisibleOffsetSeconds=");
        return tlm.k(sb, this.e, '}');
    }
}
