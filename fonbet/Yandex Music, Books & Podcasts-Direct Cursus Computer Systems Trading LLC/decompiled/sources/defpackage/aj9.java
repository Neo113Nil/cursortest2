package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class aj9 implements u1f, d7f {
    public final c9c a;
    public final c9c b;

    public aj9(c9c c9cVar, c9c c9cVar2) {
        this.a = c9cVar;
        this.b = c9cVar2;
    }

    @Override // defpackage.u1f
    public final JSONObject r() {
        ui9 ui9Var = (ui9) rj3.b.c7.getValue();
        pt0 pt0Var = rj3.a;
        ui9Var.getClass();
        JSONObject jSONObject = new JSONObject();
        y2x.e0(this.a, pt0Var, "color", kzj.D, jSONObject);
        y2x.e0(this.b, pt0Var, "orientation", gd9.L, jSONObject);
        return jSONObject;
    }
}
