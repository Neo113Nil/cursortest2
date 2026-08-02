package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class th8 implements u1f {
    public final szb a;
    public final szb b;
    public Integer c;

    public th8(szb szbVar, szb szbVar2) {
        this.a = szbVar;
        this.b = szbVar2;
    }

    @Override // defpackage.u1f
    public final JSONObject r() {
        yh8 yh8Var = (yh8) rj3.b.J0.getValue();
        pt0 pt0Var = rj3.a;
        yh8Var.getClass();
        JSONObject jSONObject = new JSONObject();
        e5f.g(pt0Var, jSONObject, "end", this.a);
        e5f.g(pt0Var, jSONObject, "start", this.b);
        etn.l0(pt0Var, jSONObject, "type", "absolute");
        return jSONObject;
    }
}
