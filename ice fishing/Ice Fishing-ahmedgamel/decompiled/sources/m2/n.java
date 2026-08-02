package m2;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class n extends C4741a {

    /* renamed from: e, reason: collision with root package name */
    public final s f39394e;

    public n(int i, String str, String str2, C4741a c4741a, s sVar) {
        super(i, str, str2, c4741a);
        this.f39394e = sVar;
    }

    @Override // m2.C4741a
    public final JSONObject b() {
        JSONObject b9 = super.b();
        s sVar = this.f39394e;
        if (sVar == null) {
            b9.put("Response Info", "null");
            return b9;
        }
        b9.put("Response Info", sVar.a());
        return b9;
    }

    @Override // m2.C4741a
    public final String toString() {
        try {
            return b().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
