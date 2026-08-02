package defpackage;

import io.appmetrica.analytics.rtm.internal.Constants;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ia5 implements gip, r8s {
    public static ka5 c(t7k t7kVar, ka5 ka5Var, JSONObject jSONObject) {
        boolean d = t7kVar.d();
        hzj Y = y1g.Y(t7kVar);
        return new ka5(y2x.G(Y, jSONObject, "name", d, ka5Var != null ? ka5Var.a : null), y2x.K(Y, jSONObject, Constants.KEY_VALUE, vct.f, d, ka5Var != null ? ka5Var.b : null, kzj.G, bcx.h));
    }

    public static JSONObject d(t7k t7kVar, ka5 ka5Var) {
        JSONObject jSONObject = new JSONObject();
        y2x.h0(t7kVar, jSONObject, "name", ka5Var.a);
        etn.l0(t7kVar, jSONObject, "type", "color");
        y2x.e0(ka5Var.b, t7kVar, Constants.KEY_VALUE, kzj.D, jSONObject);
        return jSONObject;
    }

    @Override // defpackage.r8s, defpackage.py7
    public final /* bridge */ /* synthetic */ d7f a(t7k t7kVar, JSONObject jSONObject) {
        return c(t7kVar, null, jSONObject);
    }

    @Override // defpackage.gip
    public final /* bridge */ /* synthetic */ JSONObject b(t7k t7kVar, Object obj) {
        return d(t7kVar, (ka5) obj);
    }
}
