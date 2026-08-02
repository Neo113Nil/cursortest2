package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class hq8 implements gip, r8s {
    public static kq8 c(t7k t7kVar, kq8 kq8Var, JSONObject jSONObject) {
        boolean d = t7kVar.d();
        hzj Y = y1g.Y(t7kVar);
        ox8 ox8Var = vct.b;
        c9c c9cVar = kq8Var != null ? kq8Var.a : null;
        kzj kzjVar = kzj.F;
        return new kq8(y2x.P(Y, jSONObject, "duration", ox8Var, d, c9cVar, kzjVar, jq8.e), y2x.P(Y, jSONObject, "interpolator", jq8.d, d, kq8Var != null ? kq8Var.b : null, qm8.v, bcx.h), y2x.P(Y, jSONObject, "start_delay", ox8Var, d, kq8Var != null ? kq8Var.c : null, kzjVar, jq8.f));
    }

    public static JSONObject d(t7k t7kVar, kq8 kq8Var) {
        JSONObject jSONObject = new JSONObject();
        y2x.f0(t7kVar, jSONObject, "duration", kq8Var.a);
        y2x.e0(kq8Var.b, t7kVar, "interpolator", qm8.w, jSONObject);
        y2x.f0(t7kVar, jSONObject, "start_delay", kq8Var.c);
        etn.l0(t7kVar, jSONObject, "type", "change_bounds");
        return jSONObject;
    }

    @Override // defpackage.r8s, defpackage.py7
    public final /* bridge */ /* synthetic */ d7f a(t7k t7kVar, JSONObject jSONObject) {
        return c(t7kVar, null, jSONObject);
    }

    @Override // defpackage.gip
    public final /* bridge */ /* synthetic */ JSONObject b(t7k t7kVar, Object obj) {
        return d(t7kVar, (kq8) obj);
    }
}
