package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class d99 implements u8s {
    public final t6f a;

    public d99(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.u8s
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final a99 a(t7k t7kVar, e99 e99Var, JSONObject jSONObject) {
        c9c c9cVar = e99Var.a;
        t6f t6fVar = this.a;
        return new a99((kk9) h4a.K(t7kVar, c9cVar, jSONObject, "max_size", t6fVar.p7, t6fVar.n7), (kk9) h4a.K(t7kVar, e99Var.b, jSONObject, "min_size", t6fVar.p7, t6fVar.n7), h4a.Q(t7kVar, e99Var.c, jSONObject, "weight", vct.d, kzj.E, zc4.g));
    }
}
