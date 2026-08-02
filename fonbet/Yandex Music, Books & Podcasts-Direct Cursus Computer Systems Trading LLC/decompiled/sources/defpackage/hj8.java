package defpackage;

import io.appmetrica.analytics.rtm.internal.Constants;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class hj8 implements gip, r8s {
    @Override // defpackage.r8s, defpackage.py7
    public final d7f a(t7k t7kVar, JSONObject jSONObject) {
        boolean d = t7kVar.d();
        hzj Y = y1g.Y(t7kVar);
        ox8 ox8Var = vct.c;
        return new lj8(y2x.J(Y, jSONObject, "name", ox8Var, d, null), y2x.J(Y, jSONObject, Constants.KEY_VALUE, ox8Var, d, null));
    }

    @Override // defpackage.gip
    public final JSONObject b(t7k t7kVar, Object obj) {
        lj8 lj8Var = (lj8) obj;
        JSONObject jSONObject = new JSONObject();
        y2x.f0(t7kVar, jSONObject, "name", lj8Var.a);
        y2x.f0(t7kVar, jSONObject, Constants.KEY_VALUE, lj8Var.b);
        return jSONObject;
    }
}
