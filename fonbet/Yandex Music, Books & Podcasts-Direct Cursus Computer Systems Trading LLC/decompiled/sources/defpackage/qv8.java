package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class qv8 implements u1f {
    public final jc8 a;
    public final long b;

    public qv8(jc8 jc8Var, long j) {
        this.a = jc8Var;
        this.b = j;
    }

    @Override // defpackage.u1f
    public final JSONObject r() {
        bw8 bw8Var = (bw8) rj3.b.P2.getValue();
        pt0 pt0Var = rj3.a;
        bw8Var.getClass();
        JSONObject jSONObject = new JSONObject();
        etn.m0(pt0Var, jSONObject, "div", this.a, bw8Var.a.aa);
        etn.l0(pt0Var, jSONObject, "state_id", Long.valueOf(this.b));
        return jSONObject;
    }
}
