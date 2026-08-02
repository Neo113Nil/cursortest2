package defpackage;

import io.appmetrica.analytics.rtm.internal.Constants;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class lj8 implements u1f, d7f {
    public final c9c a;
    public final c9c b;

    public lj8(c9c c9cVar, c9c c9cVar2) {
        this.a = c9cVar;
        this.b = c9cVar2;
    }

    @Override // defpackage.u1f
    public final JSONObject r() {
        hj8 hj8Var = (hj8) rj3.b.f1.getValue();
        pt0 pt0Var = rj3.a;
        hj8Var.getClass();
        JSONObject jSONObject = new JSONObject();
        y2x.f0(pt0Var, jSONObject, "name", this.a);
        y2x.f0(pt0Var, jSONObject, Constants.KEY_VALUE, this.b);
        return jSONObject;
    }
}
