package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class k89 implements gip, r8s {
    public final t6f a;

    public k89(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.r8s, defpackage.py7
    public final /* bridge */ /* synthetic */ d7f a(t7k t7kVar, JSONObject jSONObject) {
        return c(t7kVar, null, jSONObject);
    }

    public final o89 c(t7k t7kVar, o89 o89Var, JSONObject jSONObject) {
        boolean d = t7kVar.d();
        hzj Y = y1g.Y(t7kVar);
        return new o89(y2x.P(Y, jSONObject, "angle", vct.b, d, o89Var != null ? o89Var.a : null, kzj.F, m89.b), y2x.T(Y, jSONObject, d, o89Var != null ? o89Var.b : null, this.a.f5, m89.d), y2x.M(Y, jSONObject, vct.f, d, o89Var != null ? o89Var.c : null, m89.c));
    }

    @Override // defpackage.gip
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, o89 o89Var) {
        JSONObject jSONObject = new JSONObject();
        y2x.f0(t7kVar, jSONObject, "angle", o89Var.a);
        y2x.k0(t7kVar, jSONObject, "color_map", o89Var.b, this.a.f5);
        y2x.g0(t7kVar, jSONObject, o89Var.c);
        etn.l0(t7kVar, jSONObject, "type", "gradient");
        return jSONObject;
    }
}
