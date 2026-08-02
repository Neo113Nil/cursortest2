package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class nj9 implements gip, r8s {
    public final t6f a;

    public nj9(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.r8s, defpackage.py7
    public final /* bridge */ /* synthetic */ d7f a(t7k t7kVar, JSONObject jSONObject) {
        return c(t7kVar, null, jSONObject);
    }

    public final pj9 c(t7k t7kVar, pj9 pj9Var, JSONObject jSONObject) {
        boolean d = t7kVar.d();
        hzj Y = y1g.Y(t7kVar);
        c9c K = y2x.K(Y, jSONObject, "color", vct.f, d, pj9Var != null ? pj9Var.a : null, kzj.G, bcx.h);
        c9c c9cVar = pj9Var != null ? pj9Var.b : null;
        t6f t6fVar = this.a;
        return new pj9(K, y2x.H(Y, jSONObject, "shape", d, c9cVar, t6fVar.l7), y2x.N(Y, jSONObject, "stroke", d, pj9Var != null ? pj9Var.c : null, t6fVar.b8));
    }

    @Override // defpackage.gip
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, pj9 pj9Var) {
        JSONObject jSONObject = new JSONObject();
        y2x.e0(pj9Var.a, t7kVar, "color", kzj.D, jSONObject);
        c9c c9cVar = pj9Var.b;
        t6f t6fVar = this.a;
        y2x.i0(t7kVar, jSONObject, "shape", c9cVar, t6fVar.l7);
        y2x.i0(t7kVar, jSONObject, "stroke", pj9Var.c, t6fVar.b8);
        etn.l0(t7kVar, jSONObject, "type", "shape_drawable");
        return jSONObject;
    }
}
