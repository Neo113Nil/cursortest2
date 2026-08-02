package defpackage;

import io.appmetrica.analytics.rtm.internal.Constants;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class vg9 implements gip, r8s {
    public static xg9 c(t7k t7kVar, xg9 xg9Var, JSONObject jSONObject) {
        return new xg9(y2x.K(y1g.Y(t7kVar), jSONObject, Constants.KEY_VALUE, vct.d, t7kVar.d(), xg9Var != null ? xg9Var.a : null, kzj.E, bcx.h));
    }

    public static JSONObject d(t7k t7kVar, xg9 xg9Var) {
        JSONObject w = ouj.w(t7kVar, "type", "relative");
        y2x.f0(t7kVar, w, Constants.KEY_VALUE, xg9Var.a);
        return w;
    }

    @Override // defpackage.r8s, defpackage.py7
    public final /* bridge */ /* synthetic */ d7f a(t7k t7kVar, JSONObject jSONObject) {
        return c(t7kVar, null, jSONObject);
    }

    @Override // defpackage.gip
    public final /* bridge */ /* synthetic */ JSONObject b(t7k t7kVar, Object obj) {
        return d(t7kVar, (xg9) obj);
    }
}
