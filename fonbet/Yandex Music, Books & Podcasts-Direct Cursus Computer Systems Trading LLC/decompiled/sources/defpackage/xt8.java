package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class xt8 implements gip, r8s {
    public final t6f a;

    public xt8(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.r8s, defpackage.py7
    public final d7f a(t7k t7kVar, JSONObject jSONObject) {
        boolean d = t7kVar.d();
        hzj Y = y1g.Y(t7kVar);
        t6f t6fVar = this.a;
        c9c N = y2x.N(Y, jSONObject, "margins", d, null, t6fVar.i3);
        ox8 ox8Var = vct.a;
        kzj kzjVar = kzj.B;
        ns9 ns9Var = bcx.h;
        return new zt8(N, y2x.P(Y, jSONObject, "show_at_end", ox8Var, d, null, kzjVar, ns9Var), y2x.P(Y, jSONObject, "show_at_start", ox8Var, d, null, kzjVar, ns9Var), y2x.P(Y, jSONObject, "show_between", ox8Var, d, null, kzjVar, ns9Var), y2x.H(Y, jSONObject, "style", d, null, t6fVar.f3));
    }

    @Override // defpackage.gip
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, zt8 zt8Var) {
        JSONObject jSONObject = new JSONObject();
        c9c c9cVar = zt8Var.a;
        t6f t6fVar = this.a;
        y2x.i0(t7kVar, jSONObject, "margins", c9cVar, t6fVar.i3);
        y2x.f0(t7kVar, jSONObject, "show_at_end", zt8Var.b);
        y2x.f0(t7kVar, jSONObject, "show_at_start", zt8Var.c);
        y2x.f0(t7kVar, jSONObject, "show_between", zt8Var.d);
        y2x.i0(t7kVar, jSONObject, "style", zt8Var.e, t6fVar.f3);
        return jSONObject;
    }
}
