package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class cf9 implements gip, py7 {
    public final t6f a;

    public cf9(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.py7
    public final Object a(t7k t7kVar, JSONObject jSONObject) {
        jyr jyrVar = this.a.V2;
        return new bf9((ow8) etn.O(t7kVar, jSONObject, "x", jyrVar), (ow8) etn.O(t7kVar, jSONObject, "y", jyrVar));
    }

    @Override // defpackage.gip
    public final JSONObject b(t7k t7kVar, Object obj) {
        bf9 bf9Var = (bf9) obj;
        JSONObject jSONObject = new JSONObject();
        ow8 ow8Var = bf9Var.a;
        jyr jyrVar = this.a.V2;
        etn.m0(t7kVar, jSONObject, "x", ow8Var, jyrVar);
        etn.m0(t7kVar, jSONObject, "y", bf9Var.b, jyrVar);
        return jSONObject;
    }
}
