package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class a2a implements u8s {
    public final t6f a;

    public a2a(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.u8s
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final x1a a(t7k t7kVar, b2a b2aVar, JSONObject jSONObject) {
        szb O = h4a.O(t7kVar, b2aVar.a, jSONObject, "constrained", vct.a, kzj.B);
        c9c c9cVar = b2aVar.b;
        t6f t6fVar = this.a;
        return new x1a((kk9) h4a.K(t7kVar, c9cVar, jSONObject, "max_size", t6fVar.p7, t6fVar.n7), (kk9) h4a.K(t7kVar, b2aVar.c, jSONObject, "min_size", t6fVar.p7, t6fVar.n7), O);
    }
}
