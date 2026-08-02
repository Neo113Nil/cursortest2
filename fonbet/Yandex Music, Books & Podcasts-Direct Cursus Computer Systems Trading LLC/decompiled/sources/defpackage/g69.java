package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class g69 implements u1f, d7f {
    public final c9c a;

    public g69(c9c c9cVar) {
        this.a = c9cVar;
    }

    @Override // defpackage.u1f
    public final JSONObject r() {
        f69 f69Var = (f69) rj3.b.W4.getValue();
        pt0 pt0Var = rj3.a;
        f69Var.getClass();
        JSONObject jSONObject = new JSONObject();
        y2x.e0(this.a, pt0Var, "color", kzj.D, jSONObject);
        return jSONObject;
    }
}
