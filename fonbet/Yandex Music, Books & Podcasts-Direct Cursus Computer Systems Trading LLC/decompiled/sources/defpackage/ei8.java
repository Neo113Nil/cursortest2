package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ei8 implements gip, r8s {
    public static hi8 c(t7k t7kVar, hi8 hi8Var, JSONObject jSONObject) {
        boolean d = t7kVar.d();
        hzj Y = y1g.Y(t7kVar);
        return new hi8(y2x.J(Y, jSONObject, "state_id", vct.c, d, hi8Var != null ? hi8Var.a : null), y2x.P(Y, jSONObject, "temporary", vct.a, d, hi8Var != null ? hi8Var.b : null, kzj.B, bcx.h));
    }

    public static JSONObject d(t7k t7kVar, hi8 hi8Var) {
        JSONObject jSONObject = new JSONObject();
        y2x.f0(t7kVar, jSONObject, "state_id", hi8Var.a);
        y2x.f0(t7kVar, jSONObject, "temporary", hi8Var.b);
        etn.l0(t7kVar, jSONObject, "type", "set_state");
        return jSONObject;
    }

    @Override // defpackage.r8s, defpackage.py7
    public final /* bridge */ /* synthetic */ d7f a(t7k t7kVar, JSONObject jSONObject) {
        return c(t7kVar, null, jSONObject);
    }

    @Override // defpackage.gip
    public final /* bridge */ /* synthetic */ JSONObject b(t7k t7kVar, Object obj) {
        return d(t7kVar, (hi8) obj);
    }
}
