package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class oj9 implements u8s {
    public final t6f a;

    public oj9(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.u8s
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final lj9 a(t7k t7kVar, pj9 pj9Var, JSONObject jSONObject) {
        szb G = h4a.G(t7kVar, pj9Var.a, jSONObject, "color", vct.f, kzj.G);
        c9c c9cVar = pj9Var.b;
        t6f t6fVar = this.a;
        return new lj9(G, (kj9) h4a.D(t7kVar, c9cVar, jSONObject, "shape", t6fVar.m7, t6fVar.k7), (ln9) h4a.K(t7kVar, pj9Var.c, jSONObject, "stroke", t6fVar.c8, t6fVar.a8));
    }
}
