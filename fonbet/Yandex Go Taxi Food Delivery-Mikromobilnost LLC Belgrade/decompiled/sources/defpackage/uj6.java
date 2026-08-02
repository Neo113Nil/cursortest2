package defpackage;

import android.os.Bundle;
import android.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class uj6 implements x32, vj6 {
    public u2f a;

    public static String b(Bundle bundle, String str) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String str2 : bundle.keySet()) {
            jSONObject2.put(str2, bundle.get(str2));
        }
        jSONObject.put("name", str);
        jSONObject.put("parameters", jSONObject2);
        return jSONObject.toString();
    }

    @Override // defpackage.vj6
    public final void a(u2f u2fVar) {
        this.a = u2fVar;
        Log.isLoggable("FirebaseCrashlytics", 3);
    }

    @Override // defpackage.x32
    public final void onEvent(String str, Bundle bundle) {
        u2f u2fVar = this.a;
        if (u2fVar != null) {
            try {
                String str2 = "$A$:" + b(bundle, str);
                v2f v2fVar = u2fVar.a;
                v2fVar.p.a.a(new t2f(v2fVar, System.currentTimeMillis() - v2fVar.d, str2));
            } catch (JSONException unused) {
            }
        }
    }
}
