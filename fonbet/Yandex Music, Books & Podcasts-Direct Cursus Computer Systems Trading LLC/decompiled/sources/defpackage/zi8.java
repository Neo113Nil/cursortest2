package defpackage;

import io.appmetrica.analytics.rtm.internal.Constants;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zi8 implements u1f {
    public final szb a;
    public final szb b;
    public Integer c;

    public zi8(szb szbVar, szb szbVar2) {
        this.a = szbVar;
        this.b = szbVar2;
    }

    @Override // defpackage.u1f
    public final JSONObject r() {
        gj8 gj8Var = (gj8) rj3.b.e1.getValue();
        pt0 pt0Var = rj3.a;
        gj8Var.getClass();
        JSONObject jSONObject = new JSONObject();
        e5f.g(pt0Var, jSONObject, "name", this.a);
        e5f.g(pt0Var, jSONObject, Constants.KEY_VALUE, this.b);
        return jSONObject;
    }
}
