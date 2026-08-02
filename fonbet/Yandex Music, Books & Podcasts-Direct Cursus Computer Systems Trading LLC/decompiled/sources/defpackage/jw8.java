package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class jw8 implements gip, py7 {
    public final t6f a;

    public jw8(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.py7
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final iw8 a(t7k t7kVar, JSONObject jSONObject) {
        jz8 jz8Var = (jz8) etn.U(t7kVar, jSONObject, "space_between_centers", this.a.F3);
        if (jz8Var == null) {
            jz8Var = mw8.a;
        }
        return new iw8(jz8Var);
    }

    @Override // defpackage.gip
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, iw8 iw8Var) {
        JSONObject jSONObject = new JSONObject();
        etn.m0(t7kVar, jSONObject, "space_between_centers", iw8Var.a, this.a.F3);
        etn.l0(t7kVar, jSONObject, "type", "default");
        return jSONObject;
    }
}
