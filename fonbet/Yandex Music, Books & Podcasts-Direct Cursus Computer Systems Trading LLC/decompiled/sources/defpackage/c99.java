package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class c99 implements gip, r8s {
    public final t6f a;

    public c99(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.r8s, defpackage.py7
    public final /* bridge */ /* synthetic */ d7f a(t7k t7kVar, JSONObject jSONObject) {
        return c(t7kVar, null, jSONObject);
    }

    public final e99 c(t7k t7kVar, e99 e99Var, JSONObject jSONObject) {
        boolean d = t7kVar.d();
        hzj Y = y1g.Y(t7kVar);
        c9c c9cVar = e99Var != null ? e99Var.a : null;
        t6f t6fVar = this.a;
        return new e99(y2x.N(Y, jSONObject, "max_size", d, c9cVar, t6fVar.o7), y2x.N(Y, jSONObject, "min_size", d, e99Var != null ? e99Var.b : null, t6fVar.o7), y2x.P(Y, jSONObject, "weight", vct.d, d, e99Var != null ? e99Var.c : null, kzj.E, zc4.g));
    }

    @Override // defpackage.gip
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, e99 e99Var) {
        JSONObject jSONObject = new JSONObject();
        c9c c9cVar = e99Var.a;
        jyr jyrVar = this.a.o7;
        y2x.i0(t7kVar, jSONObject, "max_size", c9cVar, jyrVar);
        y2x.i0(t7kVar, jSONObject, "min_size", e99Var.b, jyrVar);
        etn.l0(t7kVar, jSONObject, "type", "match_parent");
        y2x.f0(t7kVar, jSONObject, "weight", e99Var.c);
        return jSONObject;
    }
}
