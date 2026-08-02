package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class b79 implements gip, r8s {
    public static e79 c(t7k t7kVar, e79 e79Var, JSONObject jSONObject) {
        boolean d = t7kVar.d();
        hzj Y = y1g.Y(t7kVar);
        c9c P = y2x.P(Y, jSONObject, "allow_empty", vct.a, d, e79Var != null ? e79Var.a : null, kzj.B, bcx.h);
        ox8 ox8Var = vct.c;
        return new e79(P, y2x.J(Y, jSONObject, "label_id", ox8Var, d, e79Var != null ? e79Var.b : null), y2x.J(Y, jSONObject, "pattern", ox8Var, d, e79Var != null ? e79Var.c : null), y2x.G(Y, jSONObject, "variable", d, e79Var != null ? e79Var.d : null));
    }

    public static JSONObject d(t7k t7kVar, e79 e79Var) {
        JSONObject jSONObject = new JSONObject();
        y2x.f0(t7kVar, jSONObject, "allow_empty", e79Var.a);
        y2x.f0(t7kVar, jSONObject, "label_id", e79Var.b);
        y2x.f0(t7kVar, jSONObject, "pattern", e79Var.c);
        etn.l0(t7kVar, jSONObject, "type", "regex");
        y2x.h0(t7kVar, jSONObject, "variable", e79Var.d);
        return jSONObject;
    }

    @Override // defpackage.r8s, defpackage.py7
    public final /* bridge */ /* synthetic */ d7f a(t7k t7kVar, JSONObject jSONObject) {
        return c(t7kVar, null, jSONObject);
    }

    @Override // defpackage.gip
    public final /* bridge */ /* synthetic */ JSONObject b(t7k t7kVar, Object obj) {
        return d(t7kVar, (e79) obj);
    }
}
