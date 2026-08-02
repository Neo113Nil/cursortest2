package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class js9 implements u1f {
    public final szb a;
    public final ln9 b;
    public Integer c;

    public js9(szb szbVar, ln9 ln9Var) {
        this.a = szbVar;
        this.b = ln9Var;
    }

    @Override // defpackage.u1f
    public final JSONObject r() {
        ks9 ks9Var = (ks9) rj3.b.y8.getValue();
        pt0 pt0Var = rj3.a;
        ks9Var.getClass();
        JSONObject jSONObject = new JSONObject();
        e5f.g(pt0Var, jSONObject, "corner_radius", this.a);
        etn.m0(pt0Var, jSONObject, "stroke", this.b, ks9Var.a.a8);
        return jSONObject;
    }
}
