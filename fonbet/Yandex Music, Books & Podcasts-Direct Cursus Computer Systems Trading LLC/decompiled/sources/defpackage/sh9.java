package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class sh9 implements gip, r8s {
    public final t6f a;

    public sh9(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.r8s, defpackage.py7
    public final /* bridge */ /* synthetic */ d7f a(t7k t7kVar, JSONObject jSONObject) {
        return c(t7kVar, null, jSONObject);
    }

    public final vh9 c(t7k t7kVar, vh9 vh9Var, JSONObject jSONObject) {
        boolean d = t7kVar.d();
        hzj Y = y1g.Y(t7kVar);
        c9c P = y2x.P(Y, jSONObject, "background_color", vct.f, d, vh9Var != null ? vh9Var.a : null, kzj.G, bcx.h);
        c9c c9cVar = vh9Var != null ? vh9Var.b : null;
        t6f t6fVar = this.a;
        return new vh9(P, y2x.N(Y, jSONObject, "corner_radius", d, c9cVar, t6fVar.G3), y2x.N(Y, jSONObject, "item_height", d, vh9Var != null ? vh9Var.c : null, t6fVar.G3), y2x.N(Y, jSONObject, "item_width", d, vh9Var != null ? vh9Var.d : null, t6fVar.G3), y2x.N(Y, jSONObject, "stroke", d, vh9Var != null ? vh9Var.e : null, t6fVar.b8));
    }

    @Override // defpackage.gip
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, vh9 vh9Var) {
        JSONObject jSONObject = new JSONObject();
        y2x.e0(vh9Var.a, t7kVar, "background_color", kzj.D, jSONObject);
        c9c c9cVar = vh9Var.b;
        t6f t6fVar = this.a;
        jyr jyrVar = t6fVar.G3;
        y2x.i0(t7kVar, jSONObject, "corner_radius", c9cVar, jyrVar);
        y2x.i0(t7kVar, jSONObject, "item_height", vh9Var.c, jyrVar);
        y2x.i0(t7kVar, jSONObject, "item_width", vh9Var.d, jyrVar);
        y2x.i0(t7kVar, jSONObject, "stroke", vh9Var.e, t6fVar.b8);
        etn.l0(t7kVar, jSONObject, "type", "rounded_rectangle");
        return jSONObject;
    }
}
