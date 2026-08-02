package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class nc8 implements gip, r8s {
    public static JSONObject c(t7k t7kVar, qc8 qc8Var) {
        JSONObject jSONObject = new JSONObject();
        y2x.f0(t7kVar, jSONObject, "bottom", qc8Var.a);
        y2x.f0(t7kVar, jSONObject, "left", qc8Var.b);
        y2x.f0(t7kVar, jSONObject, "right", qc8Var.c);
        y2x.f0(t7kVar, jSONObject, "top", qc8Var.d);
        return jSONObject;
    }

    @Override // defpackage.r8s, defpackage.py7
    public final d7f a(t7k t7kVar, JSONObject jSONObject) {
        boolean d = t7kVar.d();
        hzj Y = y1g.Y(t7kVar);
        ox8 ox8Var = vct.b;
        kzj kzjVar = kzj.F;
        return new qc8(y2x.P(Y, jSONObject, "bottom", ox8Var, d, null, kzjVar, pc8.e), y2x.P(Y, jSONObject, "left", ox8Var, d, null, kzjVar, pc8.f), y2x.P(Y, jSONObject, "right", ox8Var, d, null, kzjVar, pc8.g), y2x.P(Y, jSONObject, "top", ox8Var, d, null, kzjVar, pc8.h));
    }

    @Override // defpackage.gip
    public final /* bridge */ /* synthetic */ JSONObject b(t7k t7kVar, Object obj) {
        return c(t7kVar, (qc8) obj);
    }
}
