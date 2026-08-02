package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class td8 implements gip, py7 {
    public static sd8 c(t7k t7kVar, JSONObject jSONObject) {
        ox8 ox8Var = vct.b;
        kzj kzjVar = kzj.F;
        ns9 ns9Var = bcx.h;
        return new sd8(e5f.b(t7kVar, jSONObject, "index", ox8Var, kzjVar, ns9Var), e5f.b(t7kVar, jSONObject, "variable_name", vct.c, bcx.i, ns9Var));
    }

    public static JSONObject d(t7k t7kVar, sd8 sd8Var) {
        JSONObject jSONObject = new JSONObject();
        e5f.g(t7kVar, jSONObject, "index", sd8Var.a);
        etn.l0(t7kVar, jSONObject, "type", "array_remove_value");
        e5f.g(t7kVar, jSONObject, "variable_name", sd8Var.b);
        return jSONObject;
    }

    @Override // defpackage.py7
    public final /* bridge */ /* synthetic */ Object a(t7k t7kVar, JSONObject jSONObject) {
        return c(t7kVar, jSONObject);
    }

    @Override // defpackage.gip
    public final /* bridge */ /* synthetic */ JSONObject b(t7k t7kVar, Object obj) {
        return d(t7kVar, (sd8) obj);
    }
}
