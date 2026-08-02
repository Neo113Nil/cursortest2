package defpackage;

import android.os.Build;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class dpe {
    public String a;
    public cpe b;
    public JSONArray c;
    public String d;
    public String e;
    public String f;
    public Long g;

    public final boolean a() {
        String str = this.f;
        Long l = this.g;
        cpe cpeVar = this.b;
        if (cpeVar != null) {
            int ordinal = cpeVar.ordinal();
            return ordinal != 1 ? ordinal != 2 ? ((ordinal != 3 && ordinal != 4 && ordinal != 5) || str == null || l == null) ? false : true : (str == null || this.e == null || l == null) ? false : true : (this.c == null || l == null) ? false : true;
        }
        return false;
    }

    public final void b() {
        if (a()) {
            zsd.O0(this.a, toString());
        }
    }

    public final String toString() {
        Long l = this.g;
        cpe cpeVar = this.b;
        JSONObject jSONObject = null;
        if (cpeVar != null) {
            int ordinal = cpeVar.ordinal();
            try {
                if (ordinal == 1) {
                    JSONObject jSONObject2 = new JSONObject();
                    JSONArray jSONArray = this.c;
                    if (jSONArray != null) {
                        jSONObject2.put("feature_names", jSONArray);
                    }
                    if (l != null) {
                        jSONObject2.put("timestamp", l);
                    }
                    jSONObject = jSONObject2;
                } else if (ordinal == 2 || ordinal == 3 || ordinal == 4 || ordinal == 5) {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("device_os_version", Build.VERSION.RELEASE);
                    jSONObject3.put("device_model", Build.MODEL);
                    String str = this.d;
                    if (str != null) {
                        jSONObject3.put("app_version", str);
                    }
                    if (l != null) {
                        jSONObject3.put("timestamp", l);
                    }
                    String str2 = this.e;
                    if (str2 != null) {
                        jSONObject3.put("reason", str2);
                    }
                    String str3 = this.f;
                    if (str3 != null) {
                        jSONObject3.put("callstack", str3);
                    }
                    jSONObject3.put("type", cpeVar);
                    jSONObject = jSONObject3;
                }
            } catch (JSONException unused) {
            }
        }
        if (jSONObject != null) {
            String jSONObject4 = jSONObject.toString();
            jSONObject4.getClass();
            return jSONObject4;
        }
        String jSONObject5 = new JSONObject().toString();
        jSONObject5.getClass();
        return jSONObject5;
    }
}
