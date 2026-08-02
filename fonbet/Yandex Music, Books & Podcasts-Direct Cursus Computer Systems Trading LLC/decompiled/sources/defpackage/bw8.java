package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class bw8 implements gip, py7 {
    public final t6f a;

    public bw8(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.py7
    public final Object a(t7k t7kVar, JSONObject jSONObject) {
        jc8 jc8Var = (jc8) etn.O(t7kVar, jSONObject, "div", this.a.aa);
        Object opt = jSONObject.opt("state_id");
        if (opt == JSONObject.NULL) {
            opt = null;
        }
        if (opt == null) {
            throw a8k.g("state_id", jSONObject);
        }
        try {
            return new qv8(jc8Var, ((Number) opt).longValue());
        } catch (ClassCastException unused) {
            throw a8k.l(jSONObject, "state_id", opt);
        } catch (Exception e) {
            throw a8k.f(jSONObject, "state_id", opt, e);
        }
    }

    @Override // defpackage.gip
    public final JSONObject b(t7k t7kVar, Object obj) {
        qv8 qv8Var = (qv8) obj;
        JSONObject jSONObject = new JSONObject();
        etn.m0(t7kVar, jSONObject, "div", qv8Var.a, this.a.aa);
        etn.l0(t7kVar, jSONObject, "state_id", Long.valueOf(qv8Var.b));
        return jSONObject;
    }
}
