package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ff8 implements gip, py7 {
    public final t6f a;

    public ff8(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.py7
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final ve8 a(t7k t7kVar, JSONObject jSONObject) {
        return new ve8((ye8) etn.O(t7kVar, jSONObject, "content", this.a.c0));
    }

    @Override // defpackage.gip
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, ve8 ve8Var) {
        JSONObject jSONObject = new JSONObject();
        etn.m0(t7kVar, jSONObject, "content", ve8Var.a, this.a.c0);
        etn.l0(t7kVar, jSONObject, "type", "copy_to_clipboard");
        return jSONObject;
    }
}
