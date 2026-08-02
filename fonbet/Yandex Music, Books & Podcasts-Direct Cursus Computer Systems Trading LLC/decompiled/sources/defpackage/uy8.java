package defpackage;

import io.appmetrica.analytics.rtm.internal.Constants;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class uy8 implements gip, py7 {
    public static ty8 c(t7k t7kVar, JSONObject jSONObject) {
        return new ty8(e5f.b(t7kVar, jSONObject, Constants.KEY_VALUE, vct.b, kzj.F, lg3.r));
    }

    public static JSONObject d(t7k t7kVar, ty8 ty8Var) {
        JSONObject w = ouj.w(t7kVar, "type", "fixed");
        e5f.g(t7kVar, w, Constants.KEY_VALUE, ty8Var.a);
        return w;
    }

    @Override // defpackage.py7
    public final /* bridge */ /* synthetic */ Object a(t7k t7kVar, JSONObject jSONObject) {
        return c(t7kVar, jSONObject);
    }

    @Override // defpackage.gip
    public final /* bridge */ /* synthetic */ JSONObject b(t7k t7kVar, Object obj) {
        return d(t7kVar, (ty8) obj);
    }
}
