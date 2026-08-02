package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class mn8 implements gip, py7 {
    public final t6f a;

    public mn8(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.py7
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final ln8 a(t7k t7kVar, JSONObject jSONObject) {
        return new ln8(etn.S(t7kVar, jSONObject, "items", this.a.I1, nt0.r));
    }

    @Override // defpackage.gip
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, ln8 ln8Var) {
        JSONObject jSONObject = new JSONObject();
        etn.n0(t7kVar, jSONObject, "items", ln8Var.a, this.a.I1);
        etn.l0(t7kVar, jSONObject, "type", "set");
        return jSONObject;
    }
}
