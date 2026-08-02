package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class wp8 implements gip, r8s {
    public final t6f a;

    public wp8(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.r8s, defpackage.py7
    public final d7f a(t7k t7kVar, JSONObject jSONObject) {
        boolean d = t7kVar.d();
        hzj Y = y1g.Y(t7kVar);
        c9c P = y2x.P(Y, jSONObject, "corner_radius", vct.b, d, null, kzj.F, xp8.b);
        t6f t6fVar = this.a;
        return new aq8(P, y2x.N(Y, jSONObject, "corners_radius", d, null, t6fVar.C2), y2x.P(Y, jSONObject, "has_shadow", vct.a, d, null, kzj.B, bcx.h), y2x.N(Y, jSONObject, "shadow", d, null, t6fVar.f7), y2x.N(Y, jSONObject, "stroke", d, null, t6fVar.b8));
    }

    @Override // defpackage.gip
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, aq8 aq8Var) {
        JSONObject jSONObject = new JSONObject();
        y2x.f0(t7kVar, jSONObject, "corner_radius", aq8Var.a);
        c9c c9cVar = aq8Var.b;
        t6f t6fVar = this.a;
        y2x.i0(t7kVar, jSONObject, "corners_radius", c9cVar, t6fVar.C2);
        y2x.f0(t7kVar, jSONObject, "has_shadow", aq8Var.c);
        y2x.i0(t7kVar, jSONObject, "shadow", aq8Var.d, t6fVar.f7);
        y2x.i0(t7kVar, jSONObject, "stroke", aq8Var.e, t6fVar.b8);
        return jSONObject;
    }
}
