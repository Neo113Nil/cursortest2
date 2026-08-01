package k2;

import org.json.JSONException;
import org.json.JSONObject;
import q2.C4920z0;

/* renamed from: k2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4631a {

    /* renamed from: a, reason: collision with root package name */
    public final int f38568a;

    /* renamed from: b, reason: collision with root package name */
    public final String f38569b;

    /* renamed from: c, reason: collision with root package name */
    public final String f38570c;

    /* renamed from: d, reason: collision with root package name */
    public final C4631a f38571d;

    public C4631a(int i, String str, String str2, C4631a c4631a) {
        this.f38568a = i;
        this.f38569b = str;
        this.f38570c = str2;
        this.f38571d = c4631a;
    }

    public final C4920z0 a() {
        C4631a c4631a = this.f38571d;
        return new C4920z0(this.f38568a, this.f38569b, this.f38570c, c4631a == null ? null : new C4920z0(c4631a.f38568a, c4631a.f38569b, c4631a.f38570c, null, null), null);
    }

    public JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("Code", this.f38568a);
        jSONObject.put("Message", this.f38569b);
        jSONObject.put("Domain", this.f38570c);
        C4631a c4631a = this.f38571d;
        if (c4631a == null) {
            jSONObject.put("Cause", "null");
            return jSONObject;
        }
        jSONObject.put("Cause", c4631a.b());
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
