package k2;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class n extends C4631a {

    /* renamed from: e, reason: collision with root package name */
    public final s f38605e;

    public n(int i, String str, String str2, C4631a c4631a, s sVar) {
        super(i, str, str2, c4631a);
        this.f38605e = sVar;
    }

    @Override // k2.C4631a
    public final JSONObject b() {
        JSONObject b9 = super.b();
        s sVar = this.f38605e;
        if (sVar == null) {
            b9.put("Response Info", "null");
            return b9;
        }
        b9.put("Response Info", sVar.a());
        return b9;
    }

    @Override // k2.C4631a
    public final String toString() {
        try {
            return b().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
