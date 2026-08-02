package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ea9 implements gip, r8s {
    public final t6f a;

    public ea9(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.r8s, defpackage.py7
    public final d7f a(t7k t7kVar, JSONObject jSONObject) {
        return new ga9(y2x.H(y1g.Y(t7kVar), jSONObject, "page_width", t7kVar.d(), null, this.a.U5));
    }

    @Override // defpackage.gip
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, ga9 ga9Var) {
        JSONObject jSONObject = new JSONObject();
        y2x.i0(t7kVar, jSONObject, "page_width", ga9Var.a, this.a.U5);
        etn.l0(t7kVar, jSONObject, "type", "percentage");
        return jSONObject;
    }
}
