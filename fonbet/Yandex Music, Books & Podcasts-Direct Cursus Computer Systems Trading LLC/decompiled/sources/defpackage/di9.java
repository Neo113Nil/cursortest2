package defpackage;

import io.appmetrica.analytics.rtm.internal.Constants;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class di9 implements u1f {
    public final szb a;
    public final szb b;
    public Integer c;

    public di9(szb szbVar, szb szbVar2) {
        this.a = szbVar;
        this.b = szbVar2;
    }

    @Override // defpackage.u1f
    public final JSONObject r() {
        ki9 ki9Var = (ki9) rj3.b.V6.getValue();
        pt0 pt0Var = rj3.a;
        ki9Var.getClass();
        JSONObject jSONObject = new JSONObject();
        e5f.g(pt0Var, jSONObject, "text", this.a);
        e5f.g(pt0Var, jSONObject, Constants.KEY_VALUE, this.b);
        return jSONObject;
    }
}
