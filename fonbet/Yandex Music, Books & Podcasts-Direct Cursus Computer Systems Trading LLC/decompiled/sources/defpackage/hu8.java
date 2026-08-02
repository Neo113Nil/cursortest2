package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class hu8 implements gip, r8s {
    public static JSONObject c(t7k t7kVar, iu8 iu8Var) {
        JSONObject jSONObject = new JSONObject();
        y2x.f0(t7kVar, jSONObject, "bottom-left", iu8Var.a);
        y2x.f0(t7kVar, jSONObject, "bottom-right", iu8Var.b);
        y2x.f0(t7kVar, jSONObject, "top-left", iu8Var.c);
        y2x.f0(t7kVar, jSONObject, "top-right", iu8Var.d);
        return jSONObject;
    }

    @Override // defpackage.r8s, defpackage.py7
    public final d7f a(t7k t7kVar, JSONObject jSONObject) {
        boolean d = t7kVar.d();
        hzj Y = y1g.Y(t7kVar);
        ox8 ox8Var = vct.b;
        kzj kzjVar = kzj.F;
        return new iu8(y2x.P(Y, jSONObject, "bottom-left", ox8Var, d, null, kzjVar, bg3.f), y2x.P(Y, jSONObject, "bottom-right", ox8Var, d, null, kzjVar, bg3.g), y2x.P(Y, jSONObject, "top-left", ox8Var, d, null, kzjVar, bg3.h), y2x.P(Y, jSONObject, "top-right", ox8Var, d, null, kzjVar, bg3.i));
    }

    @Override // defpackage.gip
    public final /* bridge */ /* synthetic */ JSONObject b(t7k t7kVar, Object obj) {
        return c(t7kVar, (iu8) obj);
    }
}
