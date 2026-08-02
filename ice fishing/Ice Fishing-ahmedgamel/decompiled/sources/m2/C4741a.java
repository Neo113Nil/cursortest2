package m2;

import org.json.JSONException;
import org.json.JSONObject;
import s2.C4969z0;

/* renamed from: m2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4741a {

    /* renamed from: a, reason: collision with root package name */
    public final int f39357a;

    /* renamed from: b, reason: collision with root package name */
    public final String f39358b;

    /* renamed from: c, reason: collision with root package name */
    public final String f39359c;

    /* renamed from: d, reason: collision with root package name */
    public final C4741a f39360d;

    public C4741a(int i, String str, String str2, C4741a c4741a) {
        this.f39357a = i;
        this.f39358b = str;
        this.f39359c = str2;
        this.f39360d = c4741a;
    }

    public final C4969z0 a() {
        C4741a c4741a = this.f39360d;
        return new C4969z0(this.f39357a, this.f39358b, this.f39359c, c4741a == null ? null : new C4969z0(c4741a.f39357a, c4741a.f39358b, c4741a.f39359c, null, null), null);
    }

    public JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("Code", this.f39357a);
        jSONObject.put("Message", this.f39358b);
        jSONObject.put("Domain", this.f39359c);
        C4741a c4741a = this.f39360d;
        if (c4741a == null) {
            jSONObject.put("Cause", "null");
            return jSONObject;
        }
        jSONObject.put("Cause", c4741a.b());
        return jSONObject;
    }

    public String toString() {
        try {
            return b().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
