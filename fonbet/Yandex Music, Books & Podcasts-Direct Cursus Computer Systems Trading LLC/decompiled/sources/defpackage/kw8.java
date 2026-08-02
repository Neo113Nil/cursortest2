package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class kw8 implements gip, r8s {
    public final t6f a;

    public kw8(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.r8s, defpackage.py7
    public final d7f a(t7k t7kVar, JSONObject jSONObject) {
        return new nw8(y2x.N(y1g.Y(t7kVar), jSONObject, "space_between_centers", t7kVar.d(), null, this.a.G3));
    }

    @Override // defpackage.gip
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, nw8 nw8Var) {
        JSONObject jSONObject = new JSONObject();
        y2x.i0(t7kVar, jSONObject, "space_between_centers", nw8Var.a, this.a.G3);
        etn.l0(t7kVar, jSONObject, "type", "default");
        return jSONObject;
    }
}
