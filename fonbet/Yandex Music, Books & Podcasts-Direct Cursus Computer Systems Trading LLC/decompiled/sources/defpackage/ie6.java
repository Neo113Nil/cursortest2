package defpackage;

import io.appmetrica.analytics.rtm.internal.Constants;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ie6 implements gip, r8s {
    public static ke6 c(t7k t7kVar, ke6 ke6Var, JSONObject jSONObject) {
        return new ke6(y2x.K(y1g.Y(t7kVar), jSONObject, Constants.KEY_VALUE, vct.e, t7kVar.d(), ke6Var != null ? ke6Var.a : null, kzj.C, bcx.h));
    }

    public static JSONObject d(t7k t7kVar, ke6 ke6Var) {
        JSONObject w = ouj.w(t7kVar, "type", "url");
        y2x.e0(ke6Var.a, t7kVar, Constants.KEY_VALUE, kzj.H, w);
        return w;
    }

    @Override // defpackage.r8s, defpackage.py7
    public final /* bridge */ /* synthetic */ d7f a(t7k t7kVar, JSONObject jSONObject) {
        return c(t7kVar, null, jSONObject);
    }

    @Override // defpackage.gip
    public final /* bridge */ /* synthetic */ JSONObject b(t7k t7kVar, Object obj) {
        return d(t7kVar, (ke6) obj);
    }
}
