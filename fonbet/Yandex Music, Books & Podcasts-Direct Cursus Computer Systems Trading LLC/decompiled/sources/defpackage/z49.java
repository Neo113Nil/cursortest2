package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class z49 implements gip, py7 {
    public static y49 c(t7k t7kVar, JSONObject jSONObject) {
        return new y49(e5f.b(t7kVar, jSONObject, "condition", vct.a, kzj.B, bcx.h));
    }

    public static JSONObject d(t7k t7kVar, y49 y49Var) {
        JSONObject jSONObject = new JSONObject();
        e5f.g(t7kVar, jSONObject, "condition", y49Var.a);
        etn.l0(t7kVar, jSONObject, "type", "expression");
        return jSONObject;
    }

    @Override // defpackage.py7
    public final /* bridge */ /* synthetic */ Object a(t7k t7kVar, JSONObject jSONObject) {
        return c(t7kVar, jSONObject);
    }

    @Override // defpackage.gip
    public final /* bridge */ /* synthetic */ JSONObject b(t7k t7kVar, Object obj) {
        return d(t7kVar, (y49) obj);
    }
}
