package defpackage;

import io.appmetrica.analytics.rtm.internal.Constants;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class lz8 implements gip, r8s {
    public static oz8 c(t7k t7kVar, oz8 oz8Var, JSONObject jSONObject) {
        boolean d = t7kVar.d();
        hzj Y = y1g.Y(t7kVar);
        return new oz8(y2x.P(Y, jSONObject, "unit", nz8.b, d, oz8Var != null ? oz8Var.a : null, gd9.w0, bcx.h), y2x.K(Y, jSONObject, Constants.KEY_VALUE, vct.b, d, oz8Var != null ? oz8Var.b : null, kzj.F, nz8.c));
    }

    public static JSONObject d(t7k t7kVar, oz8 oz8Var) {
        JSONObject w = ouj.w(t7kVar, "type", "fixed");
        y2x.e0(oz8Var.a, t7kVar, "unit", gd9.x0, w);
        y2x.f0(t7kVar, w, Constants.KEY_VALUE, oz8Var.b);
        return w;
    }

    @Override // defpackage.r8s, defpackage.py7
    public final /* bridge */ /* synthetic */ d7f a(t7k t7kVar, JSONObject jSONObject) {
        return c(t7kVar, null, jSONObject);
    }

    @Override // defpackage.gip
    public final /* bridge */ /* synthetic */ JSONObject b(t7k t7kVar, Object obj) {
        return d(t7kVar, (oz8) obj);
    }
}
