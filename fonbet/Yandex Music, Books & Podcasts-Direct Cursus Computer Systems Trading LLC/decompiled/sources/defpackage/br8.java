package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class br8 implements gip, r8s {
    public final t6f a;

    public br8(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.r8s, defpackage.py7
    public final /* bridge */ /* synthetic */ d7f a(t7k t7kVar, JSONObject jSONObject) {
        return c(t7kVar, null, jSONObject);
    }

    public final er8 c(t7k t7kVar, er8 er8Var, JSONObject jSONObject) {
        boolean d = t7kVar.d();
        hzj Y = y1g.Y(t7kVar);
        c9c P = y2x.P(Y, jSONObject, "background_color", vct.f, d, er8Var != null ? er8Var.a : null, kzj.G, bcx.h);
        c9c c9cVar = er8Var != null ? er8Var.b : null;
        t6f t6fVar = this.a;
        return new er8(P, y2x.N(Y, jSONObject, "radius", d, c9cVar, t6fVar.G3), y2x.N(Y, jSONObject, "stroke", d, er8Var != null ? er8Var.c : null, t6fVar.b8));
    }

    @Override // defpackage.gip
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, er8 er8Var) {
        JSONObject jSONObject = new JSONObject();
        y2x.e0(er8Var.a, t7kVar, "background_color", kzj.D, jSONObject);
        c9c c9cVar = er8Var.b;
        t6f t6fVar = this.a;
        y2x.i0(t7kVar, jSONObject, "radius", c9cVar, t6fVar.G3);
        y2x.i0(t7kVar, jSONObject, "stroke", er8Var.c, t6fVar.b8);
        etn.l0(t7kVar, jSONObject, "type", "circle");
        return jSONObject;
    }
}
