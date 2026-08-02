package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class nq8 implements gip, r8s {
    public final t6f a;

    public nq8(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.r8s, defpackage.py7
    public final /* bridge */ /* synthetic */ d7f a(t7k t7kVar, JSONObject jSONObject) {
        return c(t7kVar, null, jSONObject);
    }

    public final pq8 c(t7k t7kVar, pq8 pq8Var, JSONObject jSONObject) {
        return new pq8(y2x.L(y1g.Y(t7kVar), jSONObject, "items", t7kVar.d(), pq8Var != null ? pq8Var.a : null, this.a.e2, vq1.h));
    }

    @Override // defpackage.gip
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, pq8 pq8Var) {
        JSONObject jSONObject = new JSONObject();
        y2x.k0(t7kVar, jSONObject, "items", pq8Var.a, this.a.e2);
        etn.l0(t7kVar, jSONObject, "type", "set");
        return jSONObject;
    }
}
