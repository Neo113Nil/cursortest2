package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class go8 implements u1f, d7f {
    public final c9c a;

    public go8(c9c c9cVar) {
        this.a = c9cVar;
    }

    @Override // defpackage.u1f
    public final JSONObject r() {
        fo8 fo8Var = (fo8) rj3.b.M1.getValue();
        pt0 pt0Var = rj3.a;
        fo8Var.getClass();
        JSONObject jSONObject = new JSONObject();
        y2x.f0(pt0Var, jSONObject, "ratio", this.a);
        return jSONObject;
    }
}
