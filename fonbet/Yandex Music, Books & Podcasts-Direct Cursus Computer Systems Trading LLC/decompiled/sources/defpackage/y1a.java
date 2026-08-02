package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class y1a implements gip, py7 {
    public final t6f a;

    public y1a(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.py7
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final x1a a(t7k t7kVar, JSONObject jSONObject) {
        szb d = e5f.d(t7kVar, jSONObject, "constrained", vct.a, kzj.B);
        jyr jyrVar = this.a.n7;
        return new x1a((kk9) etn.U(t7kVar, jSONObject, "max_size", jyrVar), (kk9) etn.U(t7kVar, jSONObject, "min_size", jyrVar), d);
    }

    @Override // defpackage.gip
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, x1a x1aVar) {
        JSONObject jSONObject = new JSONObject();
        e5f.g(t7kVar, jSONObject, "constrained", x1aVar.a);
        kk9 kk9Var = x1aVar.b;
        jyr jyrVar = this.a.n7;
        etn.m0(t7kVar, jSONObject, "max_size", kk9Var, jyrVar);
        etn.m0(t7kVar, jSONObject, "min_size", x1aVar.c, jyrVar);
        etn.l0(t7kVar, jSONObject, "type", "wrap_content");
        return jSONObject;
    }
}
