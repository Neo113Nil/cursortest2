package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class i89 implements gip, r8s {
    @Override // defpackage.r8s, defpackage.py7
    public final d7f a(t7k t7kVar, JSONObject jSONObject) {
        boolean d = t7kVar.d();
        hzj Y = y1g.Y(t7kVar);
        return new n89(y2x.K(Y, jSONObject, "color", vct.f, d, null, kzj.G, bcx.h), y2x.K(Y, jSONObject, "position", vct.d, d, null, kzj.E, xp3.k));
    }

    @Override // defpackage.gip
    public final JSONObject b(t7k t7kVar, Object obj) {
        n89 n89Var = (n89) obj;
        JSONObject jSONObject = new JSONObject();
        y2x.e0(n89Var.a, t7kVar, "color", kzj.D, jSONObject);
        y2x.f0(t7kVar, jSONObject, "position", n89Var.b);
        return jSONObject;
    }
}
