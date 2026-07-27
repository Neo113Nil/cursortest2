package k2;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: k2.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4643n extends C4630a {

    /* renamed from: e, reason: collision with root package name */
    public final s f38725e;

    public C4643n(int i, String str, String str2, C4630a c4630a, s sVar) {
        super(i, str, str2, c4630a);
        this.f38725e = sVar;
    }

    @Override // k2.C4630a
    public final JSONObject b() {
        JSONObject b9 = super.b();
        s sVar = this.f38725e;
        if (sVar == null) {
            b9.put("Response Info", "null");
            return b9;
        }
        b9.put("Response Info", sVar.a());
        return b9;
    }

    @Override // k2.C4630a
    public final String toString() {
        try {
            return b().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
