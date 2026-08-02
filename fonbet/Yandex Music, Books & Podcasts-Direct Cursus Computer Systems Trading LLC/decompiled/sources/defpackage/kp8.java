package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class kp8 implements gip, py7 {
    public static jp8 c(t7k t7kVar, JSONObject jSONObject) {
        return new jp8(e5f.b(t7kVar, jSONObject, "radius", vct.b, kzj.F, tt0.m));
    }

    public static JSONObject d(t7k t7kVar, jp8 jp8Var) {
        JSONObject jSONObject = new JSONObject();
        e5f.g(t7kVar, jSONObject, "radius", jp8Var.a);
        etn.l0(t7kVar, jSONObject, "type", "blur");
        return jSONObject;
    }

    @Override // defpackage.py7
    public final /* bridge */ /* synthetic */ Object a(t7k t7kVar, JSONObject jSONObject) {
        return c(t7kVar, jSONObject);
    }

    @Override // defpackage.gip
    public final /* bridge */ /* synthetic */ JSONObject b(t7k t7kVar, Object obj) {
        return d(t7kVar, (jp8) obj);
    }
}
