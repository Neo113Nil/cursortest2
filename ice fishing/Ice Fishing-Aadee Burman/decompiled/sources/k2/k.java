package k2;

import android.os.Bundle;
import org.json.JSONException;
import org.json.JSONObject;
import q2.C4920z0;
import q2.h1;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final h1 f38602a;

    /* renamed from: b, reason: collision with root package name */
    public final C4631a f38603b;

    public k(h1 h1Var) {
        this.f38602a = h1Var;
        C4920z0 c4920z0 = h1Var.f40163v;
        this.f38603b = c4920z0 == null ? null : c4920z0.a();
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        h1 h1Var = this.f38602a;
        jSONObject.put("Adapter", h1Var.f40161n);
        jSONObject.put("Latency", h1Var.f40162u);
        String str = h1Var.f40165x;
        if (str == null) {
            jSONObject.put("Ad Source Name", "null");
        } else {
            jSONObject.put("Ad Source Name", str);
        }
        String str2 = h1Var.f40166y;
        if (str2 == null) {
            jSONObject.put("Ad Source ID", "null");
        } else {
            jSONObject.put("Ad Source ID", str2);
        }
        String str3 = h1Var.f40167z;
        if (str3 == null) {
            jSONObject.put("Ad Source Instance Name", "null");
        } else {
            jSONObject.put("Ad Source Instance Name", str3);
        }
        String str4 = h1Var.f40160A;
        if (str4 == null) {
            jSONObject.put("Ad Source Instance ID", "null");
        } else {
            jSONObject.put("Ad Source Instance ID", str4);
        }
        JSONObject jSONObject2 = new JSONObject();
        Bundle bundle = h1Var.f40164w;
        for (String str5 : bundle.keySet()) {
            jSONObject2.put(str5, bundle.get(str5));
        }
        jSONObject.put("Credentials", jSONObject2);
        C4631a c4631a = this.f38603b;
        if (c4631a == null) {
            jSONObject.put("Ad Error", "null");
            return jSONObject;
        }
        jSONObject.put("Ad Error", c4631a.b());
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
