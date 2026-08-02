package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class fh9 implements u1f, d7f {
    public final c9c a;
    public final c9c b;

    public fh9(c9c c9cVar, c9c c9cVar2) {
        this.a = c9cVar;
        this.b = c9cVar2;
    }

    @Override // defpackage.u1f
    public final JSONObject r() {
        zf9 zf9Var = (zf9) rj3.b.H6.getValue();
        pt0 pt0Var = rj3.a;
        zf9Var.getClass();
        JSONObject jSONObject = new JSONObject();
        y2x.e0(this.a, pt0Var, "color", kzj.D, jSONObject);
        y2x.f0(pt0Var, jSONObject, "position", this.b);
        return jSONObject;
    }
}
