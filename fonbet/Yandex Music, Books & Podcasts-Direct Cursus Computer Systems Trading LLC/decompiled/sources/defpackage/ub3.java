package defpackage;

import io.appmetrica.analytics.rtm.internal.Constants;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ub3 implements gip, py7 {
    public static tb3 c(t7k t7kVar, JSONObject jSONObject) {
        return new tb3(e5f.b(t7kVar, jSONObject, Constants.KEY_VALUE, vct.a, kzj.B, bcx.h));
    }

    public static JSONObject d(t7k t7kVar, tb3 tb3Var) {
        JSONObject w = ouj.w(t7kVar, "type", "boolean");
        e5f.g(t7kVar, w, Constants.KEY_VALUE, tb3Var.a);
        return w;
    }

    @Override // defpackage.py7
    public final /* bridge */ /* synthetic */ Object a(t7k t7kVar, JSONObject jSONObject) {
        return c(t7kVar, jSONObject);
    }

    @Override // defpackage.gip
    public final /* bridge */ /* synthetic */ JSONObject b(t7k t7kVar, Object obj) {
        return d(t7kVar, (tb3) obj);
    }
}
