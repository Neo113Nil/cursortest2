package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class jf8 implements u1f {
    public Integer a;

    @Override // defpackage.u1f
    public final JSONObject r() {
        kf8 kf8Var = (kf8) rj3.b.i0.getValue();
        pt0 pt0Var = rj3.a;
        kf8Var.getClass();
        JSONObject jSONObject = new JSONObject();
        etn.l0(pt0Var, jSONObject, "type", "custom");
        return jSONObject;
    }
}
