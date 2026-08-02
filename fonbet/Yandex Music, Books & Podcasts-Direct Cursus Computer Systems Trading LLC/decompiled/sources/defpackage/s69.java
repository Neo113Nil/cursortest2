package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class s69 implements gip, r8s {
    public static v69 c(t7k t7kVar, v69 v69Var, JSONObject jSONObject) {
        boolean d = t7kVar.d();
        hzj Y = y1g.Y(t7kVar);
        ox8 ox8Var = vct.a;
        c9c c9cVar = v69Var != null ? v69Var.a : null;
        kzj kzjVar = kzj.B;
        ns9 ns9Var = bcx.h;
        return new v69(y2x.P(Y, jSONObject, "allow_empty", ox8Var, d, c9cVar, kzjVar, ns9Var), y2x.K(Y, jSONObject, "condition", ox8Var, d, v69Var != null ? v69Var.b : null, kzjVar, ns9Var), y2x.J(Y, jSONObject, "label_id", vct.c, d, v69Var != null ? v69Var.c : null), y2x.G(Y, jSONObject, "variable", d, v69Var != null ? v69Var.d : null));
    }

    public static JSONObject d(t7k t7kVar, v69 v69Var) {
        JSONObject jSONObject = new JSONObject();
        y2x.f0(t7kVar, jSONObject, "allow_empty", v69Var.a);
        y2x.f0(t7kVar, jSONObject, "condition", v69Var.b);
        y2x.f0(t7kVar, jSONObject, "label_id", v69Var.c);
        etn.l0(t7kVar, jSONObject, "type", "expression");
        y2x.h0(t7kVar, jSONObject, "variable", v69Var.d);
        return jSONObject;
    }

    @Override // defpackage.r8s, defpackage.py7
    public final /* bridge */ /* synthetic */ d7f a(t7k t7kVar, JSONObject jSONObject) {
        return c(t7kVar, null, jSONObject);
    }

    @Override // defpackage.gip
    public final /* bridge */ /* synthetic */ JSONObject b(t7k t7kVar, Object obj) {
        return d(t7kVar, (v69) obj);
    }
}
