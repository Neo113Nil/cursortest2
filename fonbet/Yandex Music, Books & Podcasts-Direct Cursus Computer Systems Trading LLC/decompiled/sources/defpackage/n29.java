package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class n29 implements gip, r8s {
    public final t6f a;

    public n29(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.r8s, defpackage.py7
    public final /* bridge */ /* synthetic */ d7f a(t7k t7kVar, JSONObject jSONObject) {
        return c(t7kVar, null, jSONObject);
    }

    public final q29 c(t7k t7kVar, q29 q29Var, JSONObject jSONObject) {
        boolean d = t7kVar.d();
        hzj Y = y1g.Y(t7kVar);
        c9c P = y2x.P(Y, jSONObject, "alpha", vct.d, d, q29Var != null ? q29Var.a : null, kzj.E, p29.i);
        tct tctVar = p29.f;
        c9c c9cVar = q29Var != null ? q29Var.b : null;
        va8 va8Var = va8.x0;
        ns9 ns9Var = bcx.h;
        return new q29(P, y2x.P(Y, jSONObject, "content_alignment_horizontal", tctVar, d, c9cVar, va8Var, ns9Var), y2x.P(Y, jSONObject, "content_alignment_vertical", p29.g, d, q29Var != null ? q29Var.c : null, va8.z0, ns9Var), y2x.R(Y, jSONObject, "filters", d, q29Var != null ? q29Var.d : null, this.a.u3), y2x.K(Y, jSONObject, "image_url", vct.e, d, q29Var != null ? q29Var.e : null, kzj.C, ns9Var), y2x.P(Y, jSONObject, "preload_required", vct.a, d, q29Var != null ? q29Var.f : null, kzj.B, ns9Var), y2x.P(Y, jSONObject, "scale", p29.h, d, q29Var != null ? q29Var.g : null, p19.J, ns9Var));
    }

    @Override // defpackage.gip
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, q29 q29Var) {
        JSONObject jSONObject = new JSONObject();
        y2x.f0(t7kVar, jSONObject, "alpha", q29Var.a);
        y2x.e0(q29Var.b, t7kVar, "content_alignment_horizontal", va8.y0, jSONObject);
        y2x.e0(q29Var.c, t7kVar, "content_alignment_vertical", va8.A0, jSONObject);
        y2x.k0(t7kVar, jSONObject, "filters", q29Var.d, this.a.u3);
        y2x.e0(q29Var.e, t7kVar, "image_url", kzj.H, jSONObject);
        y2x.f0(t7kVar, jSONObject, "preload_required", q29Var.f);
        y2x.e0(q29Var.g, t7kVar, "scale", p19.K, jSONObject);
        etn.l0(t7kVar, jSONObject, "type", "image");
        return jSONObject;
    }
}
