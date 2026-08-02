package defpackage;

import io.appmetrica.analytics.rtm.internal.Constants;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class kd9 implements u1f, d7f {
    public final c9c a;

    public kd9(c9c c9cVar) {
        this.a = c9cVar;
    }

    @Override // defpackage.u1f
    public final JSONObject r() {
        jd9 jd9Var = (jd9) rj3.b.U5.getValue();
        pt0 pt0Var = rj3.a;
        jd9Var.getClass();
        JSONObject jSONObject = new JSONObject();
        etn.l0(pt0Var, jSONObject, "type", "percentage");
        y2x.f0(pt0Var, jSONObject, Constants.KEY_VALUE, this.a);
        return jSONObject;
    }
}
