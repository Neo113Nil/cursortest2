package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class hg9 implements gip, r8s {
    public final t6f a;

    public hg9(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.r8s, defpackage.py7
    public final /* bridge */ /* synthetic */ d7f a(t7k t7kVar, JSONObject jSONObject) {
        return c(t7kVar, null, jSONObject);
    }

    public final gh9 c(t7k t7kVar, gh9 gh9Var, JSONObject jSONObject) {
        boolean d = t7kVar.d();
        hzj Y = y1g.Y(t7kVar);
        c9c c9cVar = gh9Var != null ? gh9Var.a : null;
        t6f t6fVar = this.a;
        c9c N = y2x.N(Y, jSONObject, "center_x", d, c9cVar, t6fVar.p6);
        c9c N2 = y2x.N(Y, jSONObject, "center_y", d, gh9Var != null ? gh9Var.b : null, t6fVar.p6);
        c9c c9cVar2 = gh9Var != null ? gh9Var.c : null;
        jyr jyrVar = t6fVar.H6;
        y19 y19Var = jg9.e;
        y19Var.getClass();
        c9c T = y2x.T(Y, jSONObject, d, c9cVar2, jyrVar, y19Var);
        ox8 ox8Var = vct.f;
        c9c c9cVar3 = gh9Var != null ? gh9Var.d : null;
        y19 y19Var2 = jg9.d;
        y19Var2.getClass();
        return new gh9(N, N2, T, y2x.M(Y, jSONObject, ox8Var, d, c9cVar3, y19Var2), y2x.N(Y, jSONObject, "radius", d, gh9Var != null ? gh9Var.e : null, t6fVar.v6));
    }

    @Override // defpackage.gip
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, gh9 gh9Var) {
        JSONObject jSONObject = new JSONObject();
        c9c c9cVar = gh9Var.a;
        t6f t6fVar = this.a;
        jyr jyrVar = t6fVar.p6;
        y2x.i0(t7kVar, jSONObject, "center_x", c9cVar, jyrVar);
        y2x.i0(t7kVar, jSONObject, "center_y", gh9Var.b, jyrVar);
        y2x.k0(t7kVar, jSONObject, "color_map", gh9Var.c, t6fVar.H6);
        y2x.g0(t7kVar, jSONObject, gh9Var.d);
        y2x.i0(t7kVar, jSONObject, "radius", gh9Var.e, t6fVar.v6);
        etn.l0(t7kVar, jSONObject, "type", "radial_gradient");
        return jSONObject;
    }
}
