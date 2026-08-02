package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ef9 implements u1f, d7f {
    public final c9c a;
    public final c9c b;

    public ef9(c9c c9cVar, c9c c9cVar2) {
        this.a = c9cVar;
        this.b = c9cVar2;
    }

    @Override // defpackage.u1f
    public final JSONObject r() {
        df9 df9Var = (df9) rj3.b.m6.getValue();
        pt0 pt0Var = rj3.a;
        df9Var.getClass();
        JSONObject jSONObject = new JSONObject();
        jyr jyrVar = df9Var.a.W2;
        y2x.i0(pt0Var, jSONObject, "x", this.a, jyrVar);
        y2x.i0(pt0Var, jSONObject, "y", this.b, jyrVar);
        return jSONObject;
    }
}
