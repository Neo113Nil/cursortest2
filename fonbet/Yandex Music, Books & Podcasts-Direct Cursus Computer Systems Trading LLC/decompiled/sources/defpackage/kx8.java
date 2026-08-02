package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class kx8 implements gip, r8s {
    public static JSONObject c(t7k t7kVar, mx8 mx8Var) {
        JSONObject jSONObject = new JSONObject();
        y2x.f0(t7kVar, jSONObject, "bottom", mx8Var.a);
        y2x.f0(t7kVar, jSONObject, "end", mx8Var.b);
        y2x.f0(t7kVar, jSONObject, "left", mx8Var.c);
        y2x.f0(t7kVar, jSONObject, "right", mx8Var.d);
        y2x.f0(t7kVar, jSONObject, "start", mx8Var.e);
        y2x.f0(t7kVar, jSONObject, "top", mx8Var.f);
        y2x.e0(mx8Var.g, t7kVar, "unit", gd9.x0, jSONObject);
        return jSONObject;
    }

    @Override // defpackage.r8s, defpackage.py7
    public final d7f a(t7k t7kVar, JSONObject jSONObject) {
        boolean d = t7kVar.d();
        hzj Y = y1g.Y(t7kVar);
        ox8 ox8Var = vct.b;
        kzj kzjVar = kzj.F;
        return new mx8(y2x.P(Y, jSONObject, "bottom", ox8Var, d, null, kzjVar, lx8.g), y2x.P(Y, jSONObject, "end", ox8Var, d, null, kzjVar, lx8.h), y2x.P(Y, jSONObject, "left", ox8Var, d, null, kzjVar, lx8.i), y2x.P(Y, jSONObject, "right", ox8Var, d, null, kzjVar, lx8.j), y2x.P(Y, jSONObject, "start", ox8Var, d, null, kzjVar, lx8.k), y2x.P(Y, jSONObject, "top", ox8Var, d, null, kzjVar, lx8.l), y2x.P(Y, jSONObject, "unit", lx8.f, d, null, gd9.w0, bcx.h));
    }

    @Override // defpackage.gip
    public final /* bridge */ /* synthetic */ JSONObject b(t7k t7kVar, Object obj) {
        return c(t7kVar, (mx8) obj);
    }
}
