package defpackage;

import io.appmetrica.analytics.rtm.internal.Constants;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class da5 implements gip, r8s {
    public static fa5 c(t7k t7kVar, fa5 fa5Var, JSONObject jSONObject) {
        return new fa5(y2x.K(y1g.Y(t7kVar), jSONObject, Constants.KEY_VALUE, vct.f, t7kVar.d(), fa5Var != null ? fa5Var.a : null, kzj.G, bcx.h));
    }

    public static JSONObject d(t7k t7kVar, fa5 fa5Var) {
        JSONObject w = ouj.w(t7kVar, "type", "color");
        y2x.e0(fa5Var.a, t7kVar, Constants.KEY_VALUE, kzj.D, w);
        return w;
    }

    @Override // defpackage.r8s, defpackage.py7
    public final /* bridge */ /* synthetic */ d7f a(t7k t7kVar, JSONObject jSONObject) {
        return c(t7kVar, null, jSONObject);
    }

    @Override // defpackage.gip
    public final /* bridge */ /* synthetic */ JSONObject b(t7k t7kVar, Object obj) {
        return d(t7kVar, (fa5) obj);
    }
}
