package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class cx8 implements u1f, d7f {
    public final c9c a;
    public final c9c b;

    public cx8(c9c c9cVar, c9c c9cVar2) {
        this.a = c9cVar;
        this.b = c9cVar2;
    }

    @Override // defpackage.u1f
    public final JSONObject r() {
        bx8 bx8Var = (bx8) rj3.b.c3.getValue();
        pt0 pt0Var = rj3.a;
        bx8Var.getClass();
        JSONObject jSONObject = new JSONObject();
        jyr jyrVar = bx8Var.a.u1;
        y2x.k0(pt0Var, jSONObject, "on_fail_actions", this.a, jyrVar);
        y2x.k0(pt0Var, jSONObject, "on_success_actions", this.b, jyrVar);
        return jSONObject;
    }
}
