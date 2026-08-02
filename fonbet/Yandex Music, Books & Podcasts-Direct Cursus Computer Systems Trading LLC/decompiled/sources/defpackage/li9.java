package defpackage;

import io.appmetrica.analytics.rtm.internal.Constants;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class li9 implements gip, r8s {
    @Override // defpackage.r8s, defpackage.py7
    public final d7f a(t7k t7kVar, JSONObject jSONObject) {
        boolean d = t7kVar.d();
        hzj Y = y1g.Y(t7kVar);
        ox8 ox8Var = vct.c;
        return new mi9(y2x.P(Y, jSONObject, "text", ox8Var, d, null, bcx.i, bcx.h), y2x.J(Y, jSONObject, Constants.KEY_VALUE, ox8Var, d, null));
    }

    @Override // defpackage.gip
    public final JSONObject b(t7k t7kVar, Object obj) {
        mi9 mi9Var = (mi9) obj;
        JSONObject jSONObject = new JSONObject();
        y2x.f0(t7kVar, jSONObject, "text", mi9Var.a);
        y2x.f0(t7kVar, jSONObject, Constants.KEY_VALUE, mi9Var.b);
        return jSONObject;
    }
}
