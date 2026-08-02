package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ms9 implements u1f, d7f {
    public final c9c a;
    public final c9c b;

    public ms9(c9c c9cVar, c9c c9cVar2) {
        this.a = c9cVar;
        this.b = c9cVar2;
    }

    @Override // defpackage.u1f
    public final JSONObject r() {
        ls9 ls9Var = (ls9) rj3.b.z8.getValue();
        pt0 pt0Var = rj3.a;
        ls9Var.getClass();
        JSONObject jSONObject = new JSONObject();
        y2x.f0(pt0Var, jSONObject, "corner_radius", this.a);
        y2x.i0(pt0Var, jSONObject, "stroke", this.b, ls9Var.a.b8);
        return jSONObject;
    }
}
