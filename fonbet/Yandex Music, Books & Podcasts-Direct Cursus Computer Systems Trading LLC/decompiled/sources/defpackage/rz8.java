package defpackage;

import io.appmetrica.analytics.rtm.internal.Constants;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class rz8 implements gip, r8s {
    public static uz8 c(t7k t7kVar, uz8 uz8Var, JSONObject jSONObject) {
        boolean d = t7kVar.d();
        hzj Y = y1g.Y(t7kVar);
        tct tctVar = tz8.b;
        c9c c9cVar = uz8Var != null ? uz8Var.a : null;
        gd9 gd9Var = gd9.w0;
        ns9 ns9Var = bcx.h;
        return new uz8(y2x.P(Y, jSONObject, "unit", tctVar, d, c9cVar, gd9Var, ns9Var), y2x.K(Y, jSONObject, Constants.KEY_VALUE, vct.b, d, uz8Var != null ? uz8Var.b : null, kzj.F, ns9Var));
    }

    public static JSONObject d(t7k t7kVar, uz8 uz8Var) {
        JSONObject w = ouj.w(t7kVar, "type", "translation-fixed");
        y2x.e0(uz8Var.a, t7kVar, "unit", gd9.x0, w);
        y2x.f0(t7kVar, w, Constants.KEY_VALUE, uz8Var.b);
        return w;
    }

    @Override // defpackage.r8s, defpackage.py7
    public final /* bridge */ /* synthetic */ d7f a(t7k t7kVar, JSONObject jSONObject) {
        return c(t7kVar, null, jSONObject);
    }

    @Override // defpackage.gip
    public final /* bridge */ /* synthetic */ JSONObject b(t7k t7kVar, Object obj) {
        return d(t7kVar, (uz8) obj);
    }
}
