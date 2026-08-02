package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class yw9 implements gip, py7 {
    public final t6f a;

    public yw9(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.py7
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final xw9 a(t7k t7kVar, JSONObject jSONObject) {
        jyr jyrVar = this.a.z9;
        return new xw9((qw9) etn.U(t7kVar, jSONObject, "x", jyrVar), (qw9) etn.U(t7kVar, jSONObject, "y", jyrVar));
    }

    @Override // defpackage.gip
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, xw9 xw9Var) {
        JSONObject w = ouj.w(t7kVar, "type", "translation");
        qw9 qw9Var = xw9Var.a;
        jyr jyrVar = this.a.z9;
        etn.m0(t7kVar, w, "x", qw9Var, jyrVar);
        etn.m0(t7kVar, w, "y", xw9Var.b, jyrVar);
        return w;
    }
}
