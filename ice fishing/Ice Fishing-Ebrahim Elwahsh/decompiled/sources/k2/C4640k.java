package k2;

import android.os.Bundle;
import org.json.JSONException;
import org.json.JSONObject;
import q2.C4927z0;
import q2.i1;

/* renamed from: k2.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4640k {

    /* renamed from: a, reason: collision with root package name */
    public final i1 f38722a;

    /* renamed from: b, reason: collision with root package name */
    public final C4630a f38723b;

    public C4640k(i1 i1Var) {
        this.f38722a = i1Var;
        C4927z0 c4927z0 = i1Var.f40081v;
        this.f38723b = c4927z0 == null ? null : c4927z0.a();
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        i1 i1Var = this.f38722a;
        jSONObject.put("Adapter", i1Var.f40079n);
        jSONObject.put("Latency", i1Var.f40080u);
        String str = i1Var.f40083x;
        if (str == null) {
            jSONObject.put("Ad Source Name", "null");
        } else {
            jSONObject.put("Ad Source Name", str);
        }
        String str2 = i1Var.f40084y;
        if (str2 == null) {
            jSONObject.put("Ad Source ID", "null");
        } else {
            jSONObject.put("Ad Source ID", str2);
        }
        String str3 = i1Var.f40085z;
        if (str3 == null) {
            jSONObject.put("Ad Source Instance Name", "null");
        } else {
            jSONObject.put("Ad Source Instance Name", str3);
        }
        String str4 = i1Var.f40078A;
        if (str4 == null) {
            jSONObject.put("Ad Source Instance ID", "null");
        } else {
            jSONObject.put("Ad Source Instance ID", str4);
        }
        JSONObject jSONObject2 = new JSONObject();
        Bundle bundle = i1Var.f40082w;
        for (String str5 : bundle.keySet()) {
            jSONObject2.put(str5, bundle.get(str5));
        }
        jSONObject.put("Credentials", jSONObject2);
        C4630a c4630a = this.f38723b;
        if (c4630a == null) {
            jSONObject.put("Ad Error", "null");
            return jSONObject;
        }
        jSONObject.put("Ad Error", c4630a.b());
        return jSONObject;
    }

    public final String toString() {
        try {
            return a().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
