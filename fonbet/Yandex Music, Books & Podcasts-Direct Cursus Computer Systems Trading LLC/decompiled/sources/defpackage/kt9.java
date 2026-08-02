package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class kt9 implements gip, r8s {
    public static nt9 c(t7k t7kVar, nt9 nt9Var, JSONObject jSONObject) {
        boolean d = t7kVar.d();
        hzj Y = y1g.Y(t7kVar);
        ox8 ox8Var = vct.f;
        c9c c9cVar = nt9Var != null ? nt9Var.a : null;
        kzj kzjVar = kzj.G;
        ns9 ns9Var = bcx.h;
        return new nt9(y2x.K(Y, jSONObject, "color", ox8Var, d, c9cVar, kzjVar, ns9Var), y2x.P(Y, jSONObject, "is_enabled", vct.a, d, nt9Var != null ? nt9Var.b : null, kzj.B, ns9Var));
    }

    public static JSONObject d(t7k t7kVar, nt9 nt9Var) {
        JSONObject jSONObject = new JSONObject();
        y2x.e0(nt9Var.a, t7kVar, "color", kzj.D, jSONObject);
        y2x.f0(t7kVar, jSONObject, "is_enabled", nt9Var.b);
        etn.l0(t7kVar, jSONObject, "type", "solid");
        return jSONObject;
    }

    @Override // defpackage.r8s, defpackage.py7
    public final /* bridge */ /* synthetic */ d7f a(t7k t7kVar, JSONObject jSONObject) {
        return c(t7kVar, null, jSONObject);
    }

    @Override // defpackage.gip
    public final /* bridge */ /* synthetic */ JSONObject b(t7k t7kVar, Object obj) {
        return d(t7kVar, (nt9) obj);
    }
}
