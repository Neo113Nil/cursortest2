package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class b89 implements u1f, d7f {
    public final c9c a;
    public final c9c b;

    public b89(c9c c9cVar, c9c c9cVar2) {
        this.a = c9cVar;
        this.b = c9cVar2;
    }

    @Override // defpackage.u1f
    public final JSONObject r() {
        a89 a89Var = (a89) rj3.b.Z4.getValue();
        pt0 pt0Var = rj3.a;
        a89Var.getClass();
        JSONObject jSONObject = new JSONObject();
        y2x.h0(pt0Var, jSONObject, "height_variable_name", this.a);
        y2x.h0(pt0Var, jSONObject, "width_variable_name", this.b);
        return jSONObject;
    }
}
