package defpackage;

import io.appmetrica.analytics.rtm.internal.Constants;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class cg9 implements gip, r8s {
    public static fg9 c(t7k t7kVar, fg9 fg9Var, JSONObject jSONObject) {
        boolean d = t7kVar.d();
        hzj Y = y1g.Y(t7kVar);
        tct tctVar = eg9.b;
        c9c c9cVar = fg9Var != null ? fg9Var.a : null;
        gd9 gd9Var = gd9.w0;
        ns9 ns9Var = bcx.h;
        return new fg9(y2x.P(Y, jSONObject, "unit", tctVar, d, c9cVar, gd9Var, ns9Var), y2x.K(Y, jSONObject, Constants.KEY_VALUE, vct.b, d, fg9Var != null ? fg9Var.b : null, kzj.F, ns9Var));
    }

    public static JSONObject d(t7k t7kVar, fg9 fg9Var) {
        JSONObject w = ouj.w(t7kVar, "type", "fixed");
        y2x.e0(fg9Var.a, t7kVar, "unit", gd9.x0, w);
        y2x.f0(t7kVar, w, Constants.KEY_VALUE, fg9Var.b);
        return w;
    }

    @Override // defpackage.r8s, defpackage.py7
    public final /* bridge */ /* synthetic */ d7f a(t7k t7kVar, JSONObject jSONObject) {
        return c(t7kVar, null, jSONObject);
    }

    @Override // defpackage.gip
    public final /* bridge */ /* synthetic */ JSONObject b(t7k t7kVar, Object obj) {
        return d(t7kVar, (fg9) obj);
    }
}
