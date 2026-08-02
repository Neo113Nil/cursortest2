package defpackage;

import io.appmetrica.analytics.rtm.internal.Constants;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class vy8 implements gip, r8s {
    public static xy8 c(t7k t7kVar, xy8 xy8Var, JSONObject jSONObject) {
        return new xy8(y2x.K(y1g.Y(t7kVar), jSONObject, Constants.KEY_VALUE, vct.b, t7kVar.d(), xy8Var != null ? xy8Var.a : null, kzj.F, lg3.r));
    }

    public static JSONObject d(t7k t7kVar, xy8 xy8Var) {
        JSONObject w = ouj.w(t7kVar, "type", "fixed");
        y2x.f0(t7kVar, w, Constants.KEY_VALUE, xy8Var.a);
        return w;
    }

    @Override // defpackage.r8s, defpackage.py7
    public final /* bridge */ /* synthetic */ d7f a(t7k t7kVar, JSONObject jSONObject) {
        return c(t7kVar, null, jSONObject);
    }

    @Override // defpackage.gip
    public final /* bridge */ /* synthetic */ JSONObject b(t7k t7kVar, Object obj) {
        return d(t7kVar, (xy8) obj);
    }
}
