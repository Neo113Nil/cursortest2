package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zf9 implements gip, r8s {
    @Override // defpackage.r8s, defpackage.py7
    public final d7f a(t7k t7kVar, JSONObject jSONObject) {
        boolean d = t7kVar.d();
        hzj Y = y1g.Y(t7kVar);
        return new fh9(y2x.K(Y, jSONObject, "color", vct.f, d, null, kzj.G, bcx.h), y2x.K(Y, jSONObject, "position", vct.d, d, null, kzj.E, j66.h));
    }

    @Override // defpackage.gip
    public final JSONObject b(t7k t7kVar, Object obj) {
        fh9 fh9Var = (fh9) obj;
        JSONObject jSONObject = new JSONObject();
        y2x.e0(fh9Var.a, t7kVar, "color", kzj.D, jSONObject);
        y2x.f0(t7kVar, jSONObject, "position", fh9Var.b);
        return jSONObject;
    }
}
