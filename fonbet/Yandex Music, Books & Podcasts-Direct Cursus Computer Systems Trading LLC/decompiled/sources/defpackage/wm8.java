package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class wm8 implements gip, r8s {
    public final t6f a;

    public wm8(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.r8s, defpackage.py7
    public final d7f a(t7k t7kVar, JSONObject jSONObject) {
        boolean d = t7kVar.d();
        hzj Y = y1g.Y(t7kVar);
        ox8 ox8Var = vct.b;
        kzj kzjVar = kzj.F;
        c9c P = y2x.P(Y, jSONObject, "duration", ox8Var, d, null, kzjVar, xm8.g);
        ox8 ox8Var2 = vct.d;
        kzj kzjVar2 = kzj.E;
        ns9 ns9Var = bcx.h;
        c9c P2 = y2x.P(Y, jSONObject, "end_value", ox8Var2, d, null, kzjVar2, ns9Var);
        c9c P3 = y2x.P(Y, jSONObject, "interpolator", xm8.e, d, null, qm8.v, ns9Var);
        t6f t6fVar = this.a;
        return new ym8(P, P2, P3, y2x.R(Y, jSONObject, "items", d, null, t6fVar.A1), y2x.K(Y, jSONObject, "name", xm8.f, d, null, va8.B0, ns9Var), y2x.N(Y, jSONObject, "repeat", d, null, t6fVar.F2), y2x.P(Y, jSONObject, "start_delay", ox8Var, d, null, kzjVar, xm8.h), y2x.P(Y, jSONObject, "start_value", ox8Var2, d, null, kzjVar2, ns9Var));
    }

    @Override // defpackage.gip
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, ym8 ym8Var) {
        JSONObject jSONObject = new JSONObject();
        y2x.f0(t7kVar, jSONObject, "duration", ym8Var.a);
        y2x.f0(t7kVar, jSONObject, "end_value", ym8Var.b);
        y2x.e0(ym8Var.c, t7kVar, "interpolator", qm8.w, jSONObject);
        c9c c9cVar = ym8Var.d;
        t6f t6fVar = this.a;
        y2x.k0(t7kVar, jSONObject, "items", c9cVar, t6fVar.A1);
        y2x.e0(ym8Var.e, t7kVar, "name", qm8.s, jSONObject);
        y2x.i0(t7kVar, jSONObject, "repeat", ym8Var.f, t6fVar.F2);
        y2x.f0(t7kVar, jSONObject, "start_delay", ym8Var.g);
        y2x.f0(t7kVar, jSONObject, "start_value", ym8Var.h);
        return jSONObject;
    }
}
