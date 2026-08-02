package defpackage;

import io.appmetrica.analytics.rtm.internal.Constants;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class qw8 implements gip, r8s {
    @Override // defpackage.r8s, defpackage.py7
    public final d7f a(t7k t7kVar, JSONObject jSONObject) {
        boolean d = t7kVar.d();
        hzj Y = y1g.Y(t7kVar);
        tct tctVar = rw8.b;
        gd9 gd9Var = gd9.w0;
        ns9 ns9Var = bcx.h;
        return new sw8(y2x.P(Y, jSONObject, "unit", tctVar, d, null, gd9Var, ns9Var), y2x.K(Y, jSONObject, Constants.KEY_VALUE, vct.d, d, null, kzj.E, ns9Var));
    }

    @Override // defpackage.gip
    public final JSONObject b(t7k t7kVar, Object obj) {
        sw8 sw8Var = (sw8) obj;
        JSONObject jSONObject = new JSONObject();
        y2x.e0(sw8Var.a, t7kVar, "unit", gd9.x0, jSONObject);
        y2x.f0(t7kVar, jSONObject, Constants.KEY_VALUE, sw8Var.b);
        return jSONObject;
    }
}
