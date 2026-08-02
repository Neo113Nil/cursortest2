package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class cr8 implements u8s {
    public final t6f a;

    public cr8(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.u8s
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final zq8 a(t7k t7kVar, er8 er8Var, JSONObject jSONObject) {
        szb O = h4a.O(t7kVar, er8Var.a, jSONObject, "background_color", vct.f, kzj.G);
        c9c c9cVar = er8Var.b;
        t6f t6fVar = this.a;
        jz8 jz8Var = (jz8) h4a.K(t7kVar, c9cVar, jSONObject, "radius", t6fVar.H3, t6fVar.F3);
        if (jz8Var == null) {
            jz8Var = dr8.a;
        }
        return new zq8(O, jz8Var, (ln9) h4a.K(t7kVar, er8Var.c, jSONObject, "stroke", t6fVar.c8, t6fVar.a8));
    }
}
