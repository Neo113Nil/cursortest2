package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class b09 implements gip, r8s {
    public static JSONObject c(t7k t7kVar, c09 c09Var) {
        JSONObject jSONObject = new JSONObject();
        y2x.f0(t7kVar, jSONObject, "down", c09Var.a);
        y2x.f0(t7kVar, jSONObject, "forward", c09Var.b);
        y2x.f0(t7kVar, jSONObject, "left", c09Var.c);
        y2x.f0(t7kVar, jSONObject, "right", c09Var.d);
        y2x.f0(t7kVar, jSONObject, "up", c09Var.e);
        return jSONObject;
    }

    @Override // defpackage.r8s, defpackage.py7
    public final d7f a(t7k t7kVar, JSONObject jSONObject) {
        boolean d = t7kVar.d();
        hzj Y = y1g.Y(t7kVar);
        ox8 ox8Var = vct.c;
        s3f s3fVar = bcx.i;
        ns9 ns9Var = bcx.h;
        return new c09(y2x.P(Y, jSONObject, "down", ox8Var, d, null, s3fVar, ns9Var), y2x.P(Y, jSONObject, "forward", ox8Var, d, null, s3fVar, ns9Var), y2x.P(Y, jSONObject, "left", ox8Var, d, null, s3fVar, ns9Var), y2x.P(Y, jSONObject, "right", ox8Var, d, null, s3fVar, ns9Var), y2x.P(Y, jSONObject, "up", ox8Var, d, null, s3fVar, ns9Var));
    }

    @Override // defpackage.gip
    public final /* bridge */ /* synthetic */ JSONObject b(t7k t7kVar, Object obj) {
        return c(t7kVar, (c09) obj);
    }
}
