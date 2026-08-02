package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class gv9 implements u1f {
    public Integer a;

    @Override // defpackage.u1f
    public final JSONObject r() {
        hv9 hv9Var = (hv9) rj3.b.h9.getValue();
        pt0 pt0Var = rj3.a;
        hv9Var.getClass();
        JSONObject jSONObject = new JSONObject();
        etn.l0(pt0Var, jSONObject, "type", "non_modal");
        return jSONObject;
    }
}
