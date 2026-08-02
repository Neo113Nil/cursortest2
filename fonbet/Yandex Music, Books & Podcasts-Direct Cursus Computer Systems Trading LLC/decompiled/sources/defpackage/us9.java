package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class us9 implements u1f {
    public final szb a;

    public us9(szb szbVar) {
        this.a = szbVar;
    }

    @Override // defpackage.u1f
    public final JSONObject r() {
        vs9 vs9Var = (vs9) rj3.b.B8.getValue();
        pt0 pt0Var = rj3.a;
        vs9Var.getClass();
        JSONObject jSONObject = new JSONObject();
        e5f.g(pt0Var, jSONObject, "is_enabled", this.a);
        return jSONObject;
    }
}
