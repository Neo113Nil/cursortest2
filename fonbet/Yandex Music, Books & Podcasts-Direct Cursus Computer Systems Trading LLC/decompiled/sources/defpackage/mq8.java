package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class mq8 implements gip, py7 {
    public final t6f a;

    public mq8(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.py7
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final lq8 a(t7k t7kVar, JSONObject jSONObject) {
        return new lq8(etn.S(t7kVar, jSONObject, "items", this.a.d2, vq1.h));
    }

    @Override // defpackage.gip
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, lq8 lq8Var) {
        JSONObject jSONObject = new JSONObject();
        etn.n0(t7kVar, jSONObject, "items", lq8Var.a, this.a.d2);
        etn.l0(t7kVar, jSONObject, "type", "set");
        return jSONObject;
    }
}
