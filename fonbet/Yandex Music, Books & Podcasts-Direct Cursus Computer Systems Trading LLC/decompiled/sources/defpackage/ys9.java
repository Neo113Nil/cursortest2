package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ys9 implements u1f, d7f {
    public final c9c a;

    public ys9(c9c c9cVar) {
        this.a = c9cVar;
    }

    @Override // defpackage.u1f
    public final JSONObject r() {
        ws9 ws9Var = (ws9) rj3.b.C8.getValue();
        pt0 pt0Var = rj3.a;
        ws9Var.getClass();
        JSONObject jSONObject = new JSONObject();
        y2x.f0(pt0Var, jSONObject, "is_enabled", this.a);
        return jSONObject;
    }
}
