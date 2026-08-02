package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class a59 implements gip, r8s {
    public static c59 c(t7k t7kVar, c59 c59Var, JSONObject jSONObject) {
        return new c59(y2x.K(y1g.Y(t7kVar), jSONObject, "condition", vct.a, t7kVar.d(), c59Var != null ? c59Var.a : null, kzj.B, bcx.h));
    }

    public static JSONObject d(t7k t7kVar, c59 c59Var) {
        JSONObject jSONObject = new JSONObject();
        y2x.f0(t7kVar, jSONObject, "condition", c59Var.a);
        etn.l0(t7kVar, jSONObject, "type", "expression");
        return jSONObject;
    }

    @Override // defpackage.r8s, defpackage.py7
    public final /* bridge */ /* synthetic */ d7f a(t7k t7kVar, JSONObject jSONObject) {
        return c(t7kVar, null, jSONObject);
    }

    @Override // defpackage.gip
    public final /* bridge */ /* synthetic */ JSONObject b(t7k t7kVar, Object obj) {
        return d(t7kVar, (c59) obj);
    }
}
