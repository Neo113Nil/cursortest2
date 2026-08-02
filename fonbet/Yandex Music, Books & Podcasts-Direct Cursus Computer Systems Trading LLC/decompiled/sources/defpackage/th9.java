package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class th9 implements u8s {
    public final t6f a;

    public th9(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.u8s
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final qh9 a(t7k t7kVar, vh9 vh9Var, JSONObject jSONObject) {
        szb O = h4a.O(t7kVar, vh9Var.a, jSONObject, "background_color", vct.f, kzj.G);
        c9c c9cVar = vh9Var.b;
        t6f t6fVar = this.a;
        jz8 jz8Var = (jz8) h4a.K(t7kVar, c9cVar, jSONObject, "corner_radius", t6fVar.H3, t6fVar.F3);
        if (jz8Var == null) {
            jz8Var = uh9.a;
        }
        jz8 jz8Var2 = jz8Var;
        jz8 jz8Var3 = (jz8) h4a.K(t7kVar, vh9Var.c, jSONObject, "item_height", t6fVar.H3, t6fVar.F3);
        if (jz8Var3 == null) {
            jz8Var3 = uh9.b;
        }
        jz8 jz8Var4 = jz8Var3;
        jz8 jz8Var5 = (jz8) h4a.K(t7kVar, vh9Var.d, jSONObject, "item_width", t6fVar.H3, t6fVar.F3);
        if (jz8Var5 == null) {
            jz8Var5 = uh9.c;
        }
        return new qh9(O, jz8Var2, jz8Var4, jz8Var5, (ln9) h4a.K(t7kVar, vh9Var.e, jSONObject, "stroke", t6fVar.c8, t6fVar.a8));
    }
}
