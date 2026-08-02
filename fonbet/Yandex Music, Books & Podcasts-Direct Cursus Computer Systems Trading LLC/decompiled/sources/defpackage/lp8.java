package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class lp8 implements gip, r8s {
    public static np8 c(t7k t7kVar, np8 np8Var, JSONObject jSONObject) {
        return new np8(y2x.K(y1g.Y(t7kVar), jSONObject, "radius", vct.b, t7kVar.d(), np8Var != null ? np8Var.a : null, kzj.F, tt0.m));
    }

    public static JSONObject d(t7k t7kVar, np8 np8Var) {
        JSONObject jSONObject = new JSONObject();
        y2x.f0(t7kVar, jSONObject, "radius", np8Var.a);
        etn.l0(t7kVar, jSONObject, "type", "blur");
        return jSONObject;
    }

    @Override // defpackage.r8s, defpackage.py7
    public final /* bridge */ /* synthetic */ d7f a(t7k t7kVar, JSONObject jSONObject) {
        return c(t7kVar, null, jSONObject);
    }

    @Override // defpackage.gip
    public final /* bridge */ /* synthetic */ JSONObject b(t7k t7kVar, Object obj) {
        return d(t7kVar, (np8) obj);
    }
}
