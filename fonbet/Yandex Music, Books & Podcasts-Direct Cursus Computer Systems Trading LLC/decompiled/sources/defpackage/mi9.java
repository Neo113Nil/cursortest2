package defpackage;

import io.appmetrica.analytics.rtm.internal.Constants;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class mi9 implements u1f, d7f {
    public final c9c a;
    public final c9c b;

    public mi9(c9c c9cVar, c9c c9cVar2) {
        this.a = c9cVar;
        this.b = c9cVar2;
    }

    @Override // defpackage.u1f
    public final JSONObject r() {
        li9 li9Var = (li9) rj3.b.W6.getValue();
        pt0 pt0Var = rj3.a;
        li9Var.getClass();
        JSONObject jSONObject = new JSONObject();
        y2x.f0(pt0Var, jSONObject, "text", this.a);
        y2x.f0(pt0Var, jSONObject, Constants.KEY_VALUE, this.b);
        return jSONObject;
    }
}
