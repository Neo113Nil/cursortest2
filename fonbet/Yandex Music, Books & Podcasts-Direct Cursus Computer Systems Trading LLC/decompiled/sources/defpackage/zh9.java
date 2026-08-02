package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zh9 implements gip, r8s {
    public static ci9 c(t7k t7kVar, ci9 ci9Var, JSONObject jSONObject) {
        boolean d = t7kVar.d();
        hzj Y = y1g.Y(t7kVar);
        ox8 ox8Var = vct.b;
        c9c c9cVar = ci9Var != null ? ci9Var.a : null;
        kzj kzjVar = kzj.F;
        c9c P = y2x.P(Y, jSONObject, "duration", ox8Var, d, c9cVar, kzjVar, bi9.h);
        c9c P2 = y2x.P(Y, jSONObject, "interpolator", bi9.g, d, ci9Var != null ? ci9Var.b : null, qm8.v, bcx.h);
        ox8 ox8Var2 = vct.d;
        c9c c9cVar2 = ci9Var != null ? ci9Var.c : null;
        kzj kzjVar2 = kzj.E;
        return new ci9(P, P2, y2x.P(Y, jSONObject, "pivot_x", ox8Var2, d, c9cVar2, kzjVar2, bi9.i), y2x.P(Y, jSONObject, "pivot_y", ox8Var2, d, ci9Var != null ? ci9Var.d : null, kzjVar2, bi9.j), y2x.P(Y, jSONObject, "scale", ox8Var2, d, ci9Var != null ? ci9Var.e : null, kzjVar2, bi9.k), y2x.P(Y, jSONObject, "start_delay", ox8Var, d, ci9Var != null ? ci9Var.f : null, kzjVar, bi9.l));
    }

    public static JSONObject d(t7k t7kVar, ci9 ci9Var) {
        JSONObject jSONObject = new JSONObject();
        y2x.f0(t7kVar, jSONObject, "duration", ci9Var.a);
        y2x.e0(ci9Var.b, t7kVar, "interpolator", qm8.w, jSONObject);
        y2x.f0(t7kVar, jSONObject, "pivot_x", ci9Var.c);
        y2x.f0(t7kVar, jSONObject, "pivot_y", ci9Var.d);
        y2x.f0(t7kVar, jSONObject, "scale", ci9Var.e);
        y2x.f0(t7kVar, jSONObject, "start_delay", ci9Var.f);
        etn.l0(t7kVar, jSONObject, "type", "scale");
        return jSONObject;
    }

    @Override // defpackage.r8s, defpackage.py7
    public final /* bridge */ /* synthetic */ d7f a(t7k t7kVar, JSONObject jSONObject) {
        return c(t7kVar, null, jSONObject);
    }

    @Override // defpackage.gip
    public final /* bridge */ /* synthetic */ JSONObject b(t7k t7kVar, Object obj) {
        return d(t7kVar, (ci9) obj);
    }
}
