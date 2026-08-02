package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class i99 implements gip, r8s {
    public final t6f a;

    public i99(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.r8s, defpackage.py7
    public final d7f a(t7k t7kVar, JSONObject jSONObject) {
        return new k99(y2x.H(y1g.Y(t7kVar), jSONObject, "neighbour_page_width", t7kVar.d(), null, this.a.G3));
    }

    @Override // defpackage.gip
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, k99 k99Var) {
        JSONObject jSONObject = new JSONObject();
        y2x.i0(t7kVar, jSONObject, "neighbour_page_width", k99Var.a, this.a.G3);
        etn.l0(t7kVar, jSONObject, "type", "fixed");
        return jSONObject;
    }
}
