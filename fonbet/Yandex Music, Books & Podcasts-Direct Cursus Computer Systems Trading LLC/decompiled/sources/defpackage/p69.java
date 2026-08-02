package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class p69 implements u1f, d7f {
    public final c9c a;
    public final c9c b;
    public final c9c c;

    public p69(c9c c9cVar, c9c c9cVar2, c9c c9cVar3) {
        this.a = c9cVar;
        this.b = c9cVar2;
        this.c = c9cVar3;
    }

    @Override // defpackage.u1f
    public final JSONObject r() {
        n69 n69Var = (n69) rj3.b.I4.getValue();
        pt0 pt0Var = rj3.a;
        n69Var.getClass();
        JSONObject jSONObject = new JSONObject();
        y2x.f0(pt0Var, jSONObject, "allow_empty", this.a);
        y2x.f0(pt0Var, jSONObject, "label_id", this.b);
        y2x.h0(pt0Var, jSONObject, "variable", this.c);
        return jSONObject;
    }
}
