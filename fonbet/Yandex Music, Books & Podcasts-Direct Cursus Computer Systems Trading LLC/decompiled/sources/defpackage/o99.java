package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class o99 implements u8s {
    public final t6f a;

    public o99(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.u8s
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final l99 a(t7k t7kVar, p99 p99Var, JSONObject jSONObject) {
        szb G = h4a.G(t7kVar, p99Var.a, jSONObject, "image_url", vct.e, kzj.C);
        c9c c9cVar = p99Var.b;
        t6f t6fVar = this.a;
        return new l99(G, (kc8) h4a.D(t7kVar, c9cVar, jSONObject, "insets", t6fVar.G, t6fVar.E));
    }
}
