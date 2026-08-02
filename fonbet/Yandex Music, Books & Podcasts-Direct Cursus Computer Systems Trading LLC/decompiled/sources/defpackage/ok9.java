package defpackage;

import io.appmetrica.analytics.rtm.internal.Constants;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ok9 implements u1f, d7f {
    public final c9c a;
    public final c9c b;

    public ok9(c9c c9cVar, c9c c9cVar2) {
        this.a = c9cVar;
        this.b = c9cVar2;
    }

    @Override // defpackage.u1f
    public final JSONObject r() {
        mk9 mk9Var = (mk9) rj3.b.o7.getValue();
        pt0 pt0Var = rj3.a;
        mk9Var.getClass();
        JSONObject jSONObject = new JSONObject();
        y2x.e0(this.a, pt0Var, "unit", gd9.x0, jSONObject);
        y2x.f0(pt0Var, jSONObject, Constants.KEY_VALUE, this.b);
        return jSONObject;
    }
}
