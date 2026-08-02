package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class qm9 implements gip, py7 {
    public final t6f a;

    public qm9(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.py7
    public final Object a(t7k t7kVar, JSONObject jSONObject) {
        t6f t6fVar = this.a;
        jyr jyrVar = t6fVar.z1;
        sm8 sm8Var = (sm8) etn.U(t7kVar, jSONObject, "animation_in", jyrVar);
        sm8 sm8Var2 = (sm8) etn.U(t7kVar, jSONObject, "animation_out", jyrVar);
        jc8 jc8Var = (jc8) etn.U(t7kVar, jSONObject, "div", t6fVar.aa);
        Object opt = jSONObject.opt("state_id");
        if (opt == JSONObject.NULL) {
            opt = null;
        }
        if (opt != null) {
            return new cm9(sm8Var, sm8Var2, jc8Var, (String) opt, etn.Y(t7kVar, jSONObject, "swipe_out_actions", t6fVar.t1));
        }
        throw a8k.g("state_id", jSONObject);
    }

    @Override // defpackage.gip
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, cm9 cm9Var) {
        JSONObject jSONObject = new JSONObject();
        sm8 sm8Var = cm9Var.a;
        t6f t6fVar = this.a;
        jyr jyrVar = t6fVar.z1;
        etn.m0(t7kVar, jSONObject, "animation_in", sm8Var, jyrVar);
        etn.m0(t7kVar, jSONObject, "animation_out", cm9Var.b, jyrVar);
        etn.m0(t7kVar, jSONObject, "div", cm9Var.c, t6fVar.aa);
        etn.l0(t7kVar, jSONObject, "state_id", cm9Var.d);
        etn.n0(t7kVar, jSONObject, "swipe_out_actions", cm9Var.e, t6fVar.t1);
        return jSONObject;
    }
}
