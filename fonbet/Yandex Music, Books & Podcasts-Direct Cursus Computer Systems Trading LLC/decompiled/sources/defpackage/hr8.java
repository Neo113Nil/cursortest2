package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class hr8 implements gip, r8s {
    public final t6f a;

    public hr8(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.r8s, defpackage.py7
    public final /* bridge */ /* synthetic */ d7f a(t7k t7kVar, JSONObject jSONObject) {
        return c(t7kVar, null, jSONObject);
    }

    public final jr8 c(t7k t7kVar, jr8 jr8Var, JSONObject jSONObject) {
        boolean d = t7kVar.d();
        hzj Y = y1g.Y(t7kVar);
        return new jr8(y2x.K(Y, jSONObject, "color", vct.f, d, jr8Var != null ? jr8Var.a : null, kzj.G, bcx.h), y2x.K(Y, jSONObject, "corner_radius", vct.b, d, jr8Var != null ? jr8Var.b : null, kzj.F, sj2.h), y2x.N(Y, jSONObject, "paddings", d, jr8Var != null ? jr8Var.c : null, this.a.i3));
    }

    @Override // defpackage.gip
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, jr8 jr8Var) {
        JSONObject jSONObject = new JSONObject();
        y2x.e0(jr8Var.a, t7kVar, "color", kzj.D, jSONObject);
        y2x.f0(t7kVar, jSONObject, "corner_radius", jr8Var.b);
        y2x.i0(t7kVar, jSONObject, "paddings", jr8Var.c, this.a.i3);
        etn.l0(t7kVar, jSONObject, "type", "cloud");
        return jSONObject;
    }
}
