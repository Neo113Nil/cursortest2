package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class jj8 implements gip, r8s {
    public final t6f a;

    public jj8(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.r8s, defpackage.py7
    public final d7f a(t7k t7kVar, JSONObject jSONObject) {
        boolean d = t7kVar.d();
        hzj Y = y1g.Y(t7kVar);
        c9c R = y2x.R(Y, jSONObject, "headers", d, null, this.a.f1);
        tct tctVar = kj8.b;
        va8 va8Var = va8.I;
        ns9 ns9Var = bcx.h;
        return new mj8(R, y2x.P(Y, jSONObject, "method", tctVar, d, null, va8Var, ns9Var), y2x.K(Y, jSONObject, "url", vct.e, d, null, kzj.C, ns9Var));
    }

    @Override // defpackage.gip
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, mj8 mj8Var) {
        JSONObject jSONObject = new JSONObject();
        y2x.k0(t7kVar, jSONObject, "headers", mj8Var.a, this.a.f1);
        y2x.e0(mj8Var.b, t7kVar, "method", va8.J, jSONObject);
        y2x.e0(mj8Var.c, t7kVar, "url", kzj.H, jSONObject);
        return jSONObject;
    }
}
