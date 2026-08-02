package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class b99 implements gip, py7 {
    public final t6f a;

    public b99(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.py7
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final a99 a(t7k t7kVar, JSONObject jSONObject) {
        jyr jyrVar = this.a.n7;
        return new a99((kk9) etn.U(t7kVar, jSONObject, "max_size", jyrVar), (kk9) etn.U(t7kVar, jSONObject, "min_size", jyrVar), e5f.e(t7kVar, jSONObject, "weight", vct.d, kzj.E, zc4.g, null));
    }

    @Override // defpackage.gip
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, a99 a99Var) {
        JSONObject jSONObject = new JSONObject();
        kk9 kk9Var = a99Var.a;
        jyr jyrVar = this.a.n7;
        etn.m0(t7kVar, jSONObject, "max_size", kk9Var, jyrVar);
        etn.m0(t7kVar, jSONObject, "min_size", a99Var.b, jyrVar);
        etn.l0(t7kVar, jSONObject, "type", "match_parent");
        e5f.g(t7kVar, jSONObject, "weight", a99Var.c);
        return jSONObject;
    }
}
