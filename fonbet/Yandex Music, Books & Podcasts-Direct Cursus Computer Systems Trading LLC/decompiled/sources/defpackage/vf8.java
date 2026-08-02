package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class vf8 implements gip, r8s {
    public final t6f a;

    public vf8(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.r8s, defpackage.py7
    public final /* bridge */ /* synthetic */ d7f a(t7k t7kVar, JSONObject jSONObject) {
        return c(t7kVar, null, jSONObject);
    }

    public final xf8 c(t7k t7kVar, xf8 xf8Var, JSONObject jSONObject) {
        boolean d = t7kVar.d();
        hzj Y = y1g.Y(t7kVar);
        c9c c9cVar = xf8Var != null ? xf8Var.a : null;
        t6f t6fVar = this.a;
        return new xf8(y2x.R(Y, jSONObject, "on_fail_actions", d, c9cVar, t6fVar.u1), y2x.R(Y, jSONObject, "on_success_actions", d, xf8Var != null ? xf8Var.b : null, t6fVar.u1), y2x.K(Y, jSONObject, "url", vct.e, d, xf8Var != null ? xf8Var.c : null, kzj.C, bcx.h));
    }

    @Override // defpackage.gip
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, xf8 xf8Var) {
        JSONObject jSONObject = new JSONObject();
        c9c c9cVar = xf8Var.a;
        jyr jyrVar = this.a.u1;
        y2x.k0(t7kVar, jSONObject, "on_fail_actions", c9cVar, jyrVar);
        y2x.k0(t7kVar, jSONObject, "on_success_actions", xf8Var.b, jyrVar);
        etn.l0(t7kVar, jSONObject, "type", "download");
        y2x.e0(xf8Var.c, t7kVar, "url", kzj.H, jSONObject);
        return jSONObject;
    }
}
