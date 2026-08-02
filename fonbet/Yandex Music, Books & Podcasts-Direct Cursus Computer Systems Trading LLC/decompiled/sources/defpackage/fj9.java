package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class fj9 implements gip, r8s {
    public final t6f a;

    public fj9(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.r8s, defpackage.py7
    public final d7f a(t7k t7kVar, JSONObject jSONObject) {
        boolean d = t7kVar.d();
        hzj Y = y1g.Y(t7kVar);
        return new hj9(y2x.P(Y, jSONObject, "alpha", vct.d, d, null, kzj.E, gj9.d), y2x.P(Y, jSONObject, "blur", vct.b, d, null, kzj.F, gj9.e), y2x.P(Y, jSONObject, "color", vct.f, d, null, kzj.G, bcx.h), y2x.H(Y, jSONObject, "offset", d, null, this.a.m6));
    }

    @Override // defpackage.gip
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, hj9 hj9Var) {
        JSONObject jSONObject = new JSONObject();
        y2x.f0(t7kVar, jSONObject, "alpha", hj9Var.a);
        y2x.f0(t7kVar, jSONObject, "blur", hj9Var.b);
        y2x.e0(hj9Var.c, t7kVar, "color", kzj.D, jSONObject);
        y2x.i0(t7kVar, jSONObject, "offset", hj9Var.d, this.a.m6);
        return jSONObject;
    }
}
