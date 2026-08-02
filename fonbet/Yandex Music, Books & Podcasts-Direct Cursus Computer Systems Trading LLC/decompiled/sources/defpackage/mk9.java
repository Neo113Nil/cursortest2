package defpackage;

import io.appmetrica.analytics.rtm.internal.Constants;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class mk9 implements gip, r8s {
    @Override // defpackage.r8s, defpackage.py7
    public final d7f a(t7k t7kVar, JSONObject jSONObject) {
        boolean d = t7kVar.d();
        hzj Y = y1g.Y(t7kVar);
        return new ok9(y2x.P(Y, jSONObject, "unit", nk9.b, d, null, gd9.w0, bcx.h), y2x.K(Y, jSONObject, Constants.KEY_VALUE, vct.b, d, null, kzj.F, nk9.c));
    }

    @Override // defpackage.gip
    public final JSONObject b(t7k t7kVar, Object obj) {
        ok9 ok9Var = (ok9) obj;
        JSONObject jSONObject = new JSONObject();
        y2x.e0(ok9Var.a, t7kVar, "unit", gd9.x0, jSONObject);
        y2x.f0(t7kVar, jSONObject, Constants.KEY_VALUE, ok9Var.b);
        return jSONObject;
    }
}
