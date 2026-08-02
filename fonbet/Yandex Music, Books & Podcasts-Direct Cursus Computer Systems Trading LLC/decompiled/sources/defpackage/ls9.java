package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ls9 implements gip, r8s {
    public final t6f a;

    public ls9(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.r8s, defpackage.py7
    public final d7f a(t7k t7kVar, JSONObject jSONObject) {
        boolean d = t7kVar.d();
        hzj Y = y1g.Y(t7kVar);
        return new ms9(y2x.P(Y, jSONObject, "corner_radius", vct.b, d, null, kzj.F, up6.l), y2x.N(Y, jSONObject, "stroke", d, null, this.a.b8));
    }

    @Override // defpackage.gip
    public final JSONObject b(t7k t7kVar, Object obj) {
        ms9 ms9Var = (ms9) obj;
        JSONObject jSONObject = new JSONObject();
        y2x.f0(t7kVar, jSONObject, "corner_radius", ms9Var.a);
        y2x.i0(t7kVar, jSONObject, "stroke", ms9Var.b, this.a.b8);
        return jSONObject;
    }
}
