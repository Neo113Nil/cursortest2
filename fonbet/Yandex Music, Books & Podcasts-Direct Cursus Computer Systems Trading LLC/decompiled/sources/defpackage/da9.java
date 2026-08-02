package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class da9 implements gip, py7 {
    public final t6f a;

    public da9(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.py7
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final ca9 a(t7k t7kVar, JSONObject jSONObject) {
        return new ca9((hd9) etn.O(t7kVar, jSONObject, "page_width", this.a.T5));
    }

    @Override // defpackage.gip
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, ca9 ca9Var) {
        JSONObject jSONObject = new JSONObject();
        etn.m0(t7kVar, jSONObject, "page_width", ca9Var.a, this.a.T5);
        etn.l0(t7kVar, jSONObject, "type", "percentage");
        return jSONObject;
    }
}
