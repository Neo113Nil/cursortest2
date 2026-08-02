package defpackage;

import io.appmetrica.analytics.rtm.internal.Constants;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ac3 implements gip, r8s {
    public static cc3 c(t7k t7kVar, cc3 cc3Var, JSONObject jSONObject) {
        boolean d = t7kVar.d();
        hzj Y = y1g.Y(t7kVar);
        return new cc3(y2x.G(Y, jSONObject, "name", d, cc3Var != null ? cc3Var.a : null), y2x.K(Y, jSONObject, Constants.KEY_VALUE, vct.a, d, cc3Var != null ? cc3Var.b : null, kzj.B, bcx.h));
    }

    public static JSONObject d(t7k t7kVar, cc3 cc3Var) {
        JSONObject jSONObject = new JSONObject();
        y2x.h0(t7kVar, jSONObject, "name", cc3Var.a);
        etn.l0(t7kVar, jSONObject, "type", "boolean");
        y2x.f0(t7kVar, jSONObject, Constants.KEY_VALUE, cc3Var.b);
        return jSONObject;
    }

    @Override // defpackage.r8s, defpackage.py7
    public final /* bridge */ /* synthetic */ d7f a(t7k t7kVar, JSONObject jSONObject) {
        return c(t7kVar, null, jSONObject);
    }

    @Override // defpackage.gip
    public final /* bridge */ /* synthetic */ JSONObject b(t7k t7kVar, Object obj) {
        return d(t7kVar, (cc3) obj);
    }
}
