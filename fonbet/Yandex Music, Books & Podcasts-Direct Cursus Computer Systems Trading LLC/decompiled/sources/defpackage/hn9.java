package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class hn9 implements gip, r8s {
    public final t6f a;

    public hn9(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.r8s, defpackage.py7
    public final /* bridge */ /* synthetic */ d7f a(t7k t7kVar, JSONObject jSONObject) {
        return c(t7kVar, null, jSONObject);
    }

    public final kn9 c(t7k t7kVar, kn9 kn9Var, JSONObject jSONObject) {
        boolean d = t7kVar.d();
        hzj Y = y1g.Y(t7kVar);
        return new kn9(y2x.N(Y, jSONObject, "item_spacing", d, kn9Var != null ? kn9Var.a : null, this.a.G3), y2x.P(Y, jSONObject, "max_visible_items", vct.b, d, kn9Var != null ? kn9Var.b : null, kzj.F, jn9.c));
    }

    @Override // defpackage.gip
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, kn9 kn9Var) {
        JSONObject jSONObject = new JSONObject();
        y2x.i0(t7kVar, jSONObject, "item_spacing", kn9Var.a, this.a.G3);
        y2x.f0(t7kVar, jSONObject, "max_visible_items", kn9Var.b);
        etn.l0(t7kVar, jSONObject, "type", "stretch");
        return jSONObject;
    }
}
