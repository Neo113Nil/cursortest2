package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class by8 implements gip, r8s {
    public static ey8 c(t7k t7kVar, ey8 ey8Var, JSONObject jSONObject) {
        boolean d = t7kVar.d();
        hzj Y = y1g.Y(t7kVar);
        c9c P = y2x.P(Y, jSONObject, "alpha", vct.d, d, ey8Var != null ? ey8Var.a : null, kzj.E, dy8.f);
        ox8 ox8Var = vct.b;
        c9c c9cVar = ey8Var != null ? ey8Var.b : null;
        kzj kzjVar = kzj.F;
        return new ey8(P, y2x.P(Y, jSONObject, "duration", ox8Var, d, c9cVar, kzjVar, dy8.g), y2x.P(Y, jSONObject, "interpolator", dy8.e, d, ey8Var != null ? ey8Var.c : null, qm8.v, bcx.h), y2x.P(Y, jSONObject, "start_delay", ox8Var, d, ey8Var != null ? ey8Var.d : null, kzjVar, dy8.h));
    }

    public static JSONObject d(t7k t7kVar, ey8 ey8Var) {
        JSONObject jSONObject = new JSONObject();
        y2x.f0(t7kVar, jSONObject, "alpha", ey8Var.a);
        y2x.f0(t7kVar, jSONObject, "duration", ey8Var.b);
        y2x.e0(ey8Var.c, t7kVar, "interpolator", qm8.w, jSONObject);
        y2x.f0(t7kVar, jSONObject, "start_delay", ey8Var.d);
        etn.l0(t7kVar, jSONObject, "type", "fade");
        return jSONObject;
    }

    @Override // defpackage.r8s, defpackage.py7
    public final /* bridge */ /* synthetic */ d7f a(t7k t7kVar, JSONObject jSONObject) {
        return c(t7kVar, null, jSONObject);
    }

    @Override // defpackage.gip
    public final /* bridge */ /* synthetic */ JSONObject b(t7k t7kVar, Object obj) {
        return d(t7kVar, (ey8) obj);
    }
}
