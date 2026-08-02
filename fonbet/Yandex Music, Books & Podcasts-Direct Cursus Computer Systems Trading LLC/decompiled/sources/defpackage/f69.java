package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class f69 implements gip, r8s {
    @Override // defpackage.r8s, defpackage.py7
    public final d7f a(t7k t7kVar, JSONObject jSONObject) {
        return new g69(y2x.K(y1g.Y(t7kVar), jSONObject, "color", vct.f, t7kVar.d(), null, kzj.G, bcx.h));
    }

    @Override // defpackage.gip
    public final JSONObject b(t7k t7kVar, Object obj) {
        JSONObject jSONObject = new JSONObject();
        y2x.e0(((g69) obj).a, t7kVar, "color", kzj.D, jSONObject);
        return jSONObject;
    }
}
