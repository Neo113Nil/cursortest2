package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class eo8 implements gip, py7 {
    @Override // defpackage.py7
    public final Object a(t7k t7kVar, JSONObject jSONObject) {
        return new do8(e5f.b(t7kVar, jSONObject, "ratio", vct.d, kzj.E, ot0.i));
    }

    @Override // defpackage.gip
    public final JSONObject b(t7k t7kVar, Object obj) {
        JSONObject jSONObject = new JSONObject();
        e5f.g(t7kVar, jSONObject, "ratio", ((do8) obj).a);
        return jSONObject;
    }
}
