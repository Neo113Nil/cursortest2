package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class n89 implements u1f, d7f {
    public final c9c a;
    public final c9c b;

    public n89(c9c c9cVar, c9c c9cVar2) {
        this.a = c9cVar;
        this.b = c9cVar2;
    }

    @Override // defpackage.u1f
    public final JSONObject r() {
        i89 i89Var = (i89) rj3.b.f5.getValue();
        pt0 pt0Var = rj3.a;
        i89Var.getClass();
        JSONObject jSONObject = new JSONObject();
        y2x.e0(this.a, pt0Var, "color", kzj.D, jSONObject);
        y2x.f0(pt0Var, jSONObject, "position", this.b);
        return jSONObject;
    }
}
