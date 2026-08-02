package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ui9 implements gip, r8s {
    @Override // defpackage.r8s, defpackage.py7
    public final d7f a(t7k t7kVar, JSONObject jSONObject) {
        boolean d = t7kVar.d();
        hzj Y = y1g.Y(t7kVar);
        ox8 ox8Var = vct.f;
        kzj kzjVar = kzj.G;
        ns9 ns9Var = bcx.h;
        return new aj9(y2x.P(Y, jSONObject, "color", ox8Var, d, null, kzjVar, ns9Var), y2x.P(Y, jSONObject, "orientation", vi9.c, d, null, gd9.K, ns9Var));
    }

    @Override // defpackage.gip
    public final JSONObject b(t7k t7kVar, Object obj) {
        aj9 aj9Var = (aj9) obj;
        JSONObject jSONObject = new JSONObject();
        y2x.e0(aj9Var.a, t7kVar, "color", kzj.D, jSONObject);
        y2x.e0(aj9Var.b, t7kVar, "orientation", gd9.L, jSONObject);
        return jSONObject;
    }
}
