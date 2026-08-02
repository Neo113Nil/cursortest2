package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ew8 implements u1f, d7f {
    public final c9c a;
    public final c9c b;

    public ew8(c9c c9cVar, c9c c9cVar2) {
        this.a = c9cVar;
        this.b = c9cVar2;
    }

    @Override // defpackage.u1f
    public final JSONObject r() {
        cw8 cw8Var = (cw8) rj3.b.Q2.getValue();
        pt0 pt0Var = rj3.a;
        cw8Var.getClass();
        JSONObject jSONObject = new JSONObject();
        y2x.i0(pt0Var, jSONObject, "div", this.a, cw8Var.a.ba);
        y2x.h0(pt0Var, jSONObject, "state_id", this.b);
        return jSONObject;
    }
}
