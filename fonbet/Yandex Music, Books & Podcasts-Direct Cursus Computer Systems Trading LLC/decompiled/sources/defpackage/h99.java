package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class h99 implements gip, py7 {
    public final t6f a;

    public h99(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.py7
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final g99 a(t7k t7kVar, JSONObject jSONObject) {
        return new g99((jz8) etn.O(t7kVar, jSONObject, "neighbour_page_width", this.a.F3));
    }

    @Override // defpackage.gip
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, g99 g99Var) {
        JSONObject jSONObject = new JSONObject();
        etn.m0(t7kVar, jSONObject, "neighbour_page_width", g99Var.a, this.a.F3);
        etn.l0(t7kVar, jSONObject, "type", "fixed");
        return jSONObject;
    }
}
