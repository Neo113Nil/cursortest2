package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class bz8 implements gip, r8s {
    public final t6f a;

    public bz8(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.r8s, defpackage.py7
    public final /* bridge */ /* synthetic */ d7f a(t7k t7kVar, JSONObject jSONObject) {
        return c(t7kVar, null, jSONObject);
    }

    public final iz8 c(t7k t7kVar, iz8 iz8Var, JSONObject jSONObject) {
        boolean d = t7kVar.d();
        hzj Y = y1g.Y(t7kVar);
        return new iz8(y2x.P(Y, jSONObject, "always_visible", vct.a, d, iz8Var != null ? iz8Var.a : null, kzj.B, bcx.h), y2x.J(Y, jSONObject, "pattern", vct.c, d, iz8Var != null ? iz8Var.b : null), y2x.L(Y, jSONObject, "pattern_elements", d, iz8Var != null ? iz8Var.c : null, this.a.D3, dz8.b), y2x.G(Y, jSONObject, "raw_text_variable", d, iz8Var != null ? iz8Var.d : null));
    }

    @Override // defpackage.gip
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, iz8 iz8Var) {
        JSONObject jSONObject = new JSONObject();
        y2x.f0(t7kVar, jSONObject, "always_visible", iz8Var.a);
        y2x.f0(t7kVar, jSONObject, "pattern", iz8Var.b);
        y2x.k0(t7kVar, jSONObject, "pattern_elements", iz8Var.c, this.a.D3);
        y2x.h0(t7kVar, jSONObject, "raw_text_variable", iz8Var.d);
        etn.l0(t7kVar, jSONObject, "type", "fixed_length");
        return jSONObject;
    }
}
