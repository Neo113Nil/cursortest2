package defpackage;

import io.appmetrica.analytics.rtm.internal.Constants;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class sw8 implements u1f, d7f {
    public final c9c a;
    public final c9c b;

    public sw8(c9c c9cVar, c9c c9cVar2) {
        this.a = c9cVar;
        this.b = c9cVar2;
    }

    @Override // defpackage.u1f
    public final JSONObject r() {
        qw8 qw8Var = (qw8) rj3.b.W2.getValue();
        pt0 pt0Var = rj3.a;
        qw8Var.getClass();
        JSONObject jSONObject = new JSONObject();
        y2x.e0(this.a, pt0Var, "unit", gd9.x0, jSONObject);
        y2x.f0(pt0Var, jSONObject, Constants.KEY_VALUE, this.b);
        return jSONObject;
    }
}
