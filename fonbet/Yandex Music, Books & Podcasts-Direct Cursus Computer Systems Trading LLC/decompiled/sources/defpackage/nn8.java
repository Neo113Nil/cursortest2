package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class nn8 implements gip, r8s {
    public final t6f a;

    public nn8(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.r8s, defpackage.py7
    public final /* bridge */ /* synthetic */ d7f a(t7k t7kVar, JSONObject jSONObject) {
        return c(t7kVar, null, jSONObject);
    }

    public final pn8 c(t7k t7kVar, pn8 pn8Var, JSONObject jSONObject) {
        return new pn8(y2x.L(y1g.Y(t7kVar), jSONObject, "items", t7kVar.d(), pn8Var != null ? pn8Var.a : null, this.a.J1, nt0.r));
    }

    @Override // defpackage.gip
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, pn8 pn8Var) {
        JSONObject jSONObject = new JSONObject();
        y2x.k0(t7kVar, jSONObject, "items", pn8Var.a, this.a.J1);
        etn.l0(t7kVar, jSONObject, "type", "set");
        return jSONObject;
    }
}
