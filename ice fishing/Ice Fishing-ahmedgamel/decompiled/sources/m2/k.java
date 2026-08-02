package m2;

import android.os.Bundle;
import org.json.JSONException;
import org.json.JSONObject;
import s2.C4969z0;
import s2.h1;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final h1 f39391a;

    /* renamed from: b, reason: collision with root package name */
    public final C4741a f39392b;

    public k(h1 h1Var) {
        this.f39391a = h1Var;
        C4969z0 c4969z0 = h1Var.f40465v;
        this.f39392b = c4969z0 == null ? null : c4969z0.a();
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        h1 h1Var = this.f39391a;
        jSONObject.put("Adapter", h1Var.f40463n);
        jSONObject.put("Latency", h1Var.f40464u);
        String str = h1Var.f40467x;
        if (str == null) {
            jSONObject.put("Ad Source Name", "null");
        } else {
            jSONObject.put("Ad Source Name", str);
        }
        String str2 = h1Var.f40468y;
        if (str2 == null) {
            jSONObject.put("Ad Source ID", "null");
        } else {
            jSONObject.put("Ad Source ID", str2);
        }
        String str3 = h1Var.f40469z;
        if (str3 == null) {
            jSONObject.put("Ad Source Instance Name", "null");
        } else {
            jSONObject.put("Ad Source Instance Name", str3);
        }
        String str4 = h1Var.f40462A;
        if (str4 == null) {
            jSONObject.put("Ad Source Instance ID", "null");
        } else {
            jSONObject.put("Ad Source Instance ID", str4);
        }
        JSONObject jSONObject2 = new JSONObject();
        Bundle bundle = h1Var.f40466w;
        for (String str5 : bundle.keySet()) {
            jSONObject2.put(str5, bundle.get(str5));
        }
        jSONObject.put("Credentials", jSONObject2);
        C4741a c4741a = this.f39392b;
        if (c4741a == null) {
            jSONObject.put("Ad Error", "null");
            return jSONObject;
        }
        jSONObject.put("Ad Error", c4741a.b());
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
