package defpackage;

import io.appmetrica.analytics.rtm.internal.Constants;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class hd9 implements u1f {
    public final szb a;
    public Integer b;

    public hd9(szb szbVar) {
        this.a = szbVar;
    }

    @Override // defpackage.u1f
    public final JSONObject r() {
        id9 id9Var = (id9) rj3.b.T5.getValue();
        pt0 pt0Var = rj3.a;
        id9Var.getClass();
        JSONObject jSONObject = new JSONObject();
        etn.l0(pt0Var, jSONObject, "type", "percentage");
        e5f.g(pt0Var, jSONObject, Constants.KEY_VALUE, this.a);
        return jSONObject;
    }
}
