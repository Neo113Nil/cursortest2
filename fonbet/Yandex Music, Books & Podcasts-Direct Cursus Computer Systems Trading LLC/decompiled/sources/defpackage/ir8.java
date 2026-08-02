package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ir8 implements u8s {
    public final t6f a;

    public ir8(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.u8s
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final fr8 a(t7k t7kVar, jr8 jr8Var, JSONObject jSONObject) {
        szb G = h4a.G(t7kVar, jr8Var.a, jSONObject, "color", vct.f, kzj.G);
        szb H = h4a.H(t7kVar, jr8Var.b, jSONObject, "corner_radius", vct.b, kzj.F, sj2.h);
        c9c c9cVar = jr8Var.c;
        t6f t6fVar = this.a;
        return new fr8(G, H, (ix8) h4a.K(t7kVar, c9cVar, jSONObject, "paddings", t6fVar.j3, t6fVar.h3));
    }
}
