package defpackage;

import io.appmetrica.analytics.rtm.internal.Constants;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class vb3 implements gip, r8s {
    public static xb3 c(t7k t7kVar, xb3 xb3Var, JSONObject jSONObject) {
        return new xb3(y2x.K(y1g.Y(t7kVar), jSONObject, Constants.KEY_VALUE, vct.a, t7kVar.d(), xb3Var != null ? xb3Var.a : null, kzj.B, bcx.h));
    }

    public static JSONObject d(t7k t7kVar, xb3 xb3Var) {
        JSONObject w = ouj.w(t7kVar, "type", "boolean");
        y2x.f0(t7kVar, w, Constants.KEY_VALUE, xb3Var.a);
        return w;
    }

    @Override // defpackage.r8s, defpackage.py7
    public final /* bridge */ /* synthetic */ d7f a(t7k t7kVar, JSONObject jSONObject) {
        return c(t7kVar, null, jSONObject);
    }

    @Override // defpackage.gip
    public final /* bridge */ /* synthetic */ JSONObject b(t7k t7kVar, Object obj) {
        return d(t7kVar, (xb3) obj);
    }
}
