package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ud8 implements gip, r8s {
    public static wd8 c(t7k t7kVar, wd8 wd8Var, JSONObject jSONObject) {
        boolean d = t7kVar.d();
        hzj Y = y1g.Y(t7kVar);
        return new wd8(y2x.K(Y, jSONObject, "index", vct.b, d, wd8Var != null ? wd8Var.a : null, kzj.F, bcx.h), y2x.J(Y, jSONObject, "variable_name", vct.c, d, wd8Var != null ? wd8Var.b : null));
    }

    public static JSONObject d(t7k t7kVar, wd8 wd8Var) {
        JSONObject jSONObject = new JSONObject();
        y2x.f0(t7kVar, jSONObject, "index", wd8Var.a);
        etn.l0(t7kVar, jSONObject, "type", "array_remove_value");
        y2x.f0(t7kVar, jSONObject, "variable_name", wd8Var.b);
        return jSONObject;
    }

    @Override // defpackage.r8s, defpackage.py7
    public final /* bridge */ /* synthetic */ d7f a(t7k t7kVar, JSONObject jSONObject) {
        return c(t7kVar, null, jSONObject);
    }

    @Override // defpackage.gip
    public final /* bridge */ /* synthetic */ JSONObject b(t7k t7kVar, Object obj) {
        return d(t7kVar, (wd8) obj);
    }
}
