package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class pl9 implements gip, r8s {
    public final t6f a;

    public pl9(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.r8s, defpackage.py7
    public final d7f a(t7k t7kVar, JSONObject jSONObject) {
        boolean d = t7kVar.d();
        hzj Y = y1g.Y(t7kVar);
        ox8 ox8Var = vct.b;
        kzj kzjVar = kzj.F;
        ns9 ns9Var = bcx.h;
        c9c P = y2x.P(Y, jSONObject, "end", ox8Var, d, null, kzjVar, ns9Var);
        t6f t6fVar = this.a;
        jyr jyrVar = t6fVar.i3;
        jyr jyrVar2 = t6fVar.f3;
        return new ql9(P, y2x.N(Y, jSONObject, "margins", d, null, jyrVar), y2x.P(Y, jSONObject, "start", ox8Var, d, null, kzjVar, ns9Var), y2x.N(Y, jSONObject, "track_active_style", d, null, jyrVar2), y2x.N(Y, jSONObject, "track_inactive_style", d, null, jyrVar2));
    }

    @Override // defpackage.gip
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, ql9 ql9Var) {
        JSONObject jSONObject = new JSONObject();
        y2x.f0(t7kVar, jSONObject, "end", ql9Var.a);
        c9c c9cVar = ql9Var.b;
        t6f t6fVar = this.a;
        y2x.i0(t7kVar, jSONObject, "margins", c9cVar, t6fVar.i3);
        y2x.f0(t7kVar, jSONObject, "start", ql9Var.c);
        c9c c9cVar2 = ql9Var.d;
        jyr jyrVar = t6fVar.f3;
        y2x.i0(t7kVar, jSONObject, "track_active_style", c9cVar2, jyrVar);
        y2x.i0(t7kVar, jSONObject, "track_inactive_style", ql9Var.e, jyrVar);
        return jSONObject;
    }
}
