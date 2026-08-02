package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class nh9 implements u8s {
    public final t6f a;

    public nh9(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.u8s
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final kh9 a(t7k t7kVar, ph9 ph9Var, JSONObject jSONObject) {
        szb G = h4a.G(t7kVar, ph9Var.a, jSONObject, "angle", vct.d, kzj.E);
        c9c c9cVar = ph9Var.b;
        t6f t6fVar = this.a;
        xd9 xd9Var = (xd9) h4a.K(t7kVar, c9cVar, jSONObject, "pivot_x", t6fVar.k6, t6fVar.i6);
        if (xd9Var == null) {
            xd9Var = oh9.a;
        }
        xd9 xd9Var2 = xd9Var;
        xd9 xd9Var3 = (xd9) h4a.K(t7kVar, ph9Var.c, jSONObject, "pivot_y", t6fVar.k6, t6fVar.i6);
        if (xd9Var3 == null) {
            xd9Var3 = oh9.b;
        }
        return new kh9(xd9Var2, xd9Var3, G);
    }
}
