package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ai8 implements u1f, d7f {
    public final c9c a;
    public final c9c b;

    public ai8(c9c c9cVar, c9c c9cVar2) {
        this.a = c9cVar;
        this.b = c9cVar2;
    }

    @Override // defpackage.u1f
    public final JSONObject r() {
        zh8 zh8Var = (zh8) rj3.b.K0.getValue();
        pt0 pt0Var = rj3.a;
        zh8Var.getClass();
        JSONObject jSONObject = new JSONObject();
        y2x.f0(pt0Var, jSONObject, "end", this.a);
        y2x.f0(pt0Var, jSONObject, "start", this.b);
        etn.l0(pt0Var, jSONObject, "type", "absolute");
        return jSONObject;
    }
}
