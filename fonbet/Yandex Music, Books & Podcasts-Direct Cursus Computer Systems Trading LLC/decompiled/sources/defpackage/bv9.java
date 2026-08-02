package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class bv9 implements u1f {
    public Integer a;

    @Override // defpackage.u1f
    public final JSONObject r() {
        cv9 cv9Var = (cv9) rj3.b.e9.getValue();
        pt0 pt0Var = rj3.a;
        cv9Var.getClass();
        JSONObject jSONObject = new JSONObject();
        etn.l0(pt0Var, jSONObject, "type", "modal");
        return jSONObject;
    }
}
