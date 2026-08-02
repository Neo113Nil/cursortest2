package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class l69 implements u1f {
    public final szb a;
    public final szb b;
    public final String c;

    public l69(szb szbVar, szb szbVar2, String str) {
        this.a = szbVar;
        this.b = szbVar2;
        this.c = str;
    }

    @Override // defpackage.u1f
    public final JSONObject r() {
        m69 m69Var = (m69) rj3.b.H4.getValue();
        pt0 pt0Var = rj3.a;
        m69Var.getClass();
        JSONObject jSONObject = new JSONObject();
        e5f.g(pt0Var, jSONObject, "allow_empty", this.a);
        e5f.g(pt0Var, jSONObject, "label_id", this.b);
        etn.l0(pt0Var, jSONObject, "variable", this.c);
        return jSONObject;
    }
}
