package defpackage;

import io.appmetrica.analytics.rtm.internal.Constants;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zb3 implements gip, py7 {
    public static yb3 c(t7k t7kVar, JSONObject jSONObject) {
        return new yb3(e5f.b(t7kVar, jSONObject, Constants.KEY_VALUE, vct.a, kzj.B, bcx.h), (String) etn.P("name", jSONObject));
    }

    public static JSONObject d(t7k t7kVar, yb3 yb3Var) {
        JSONObject jSONObject = new JSONObject();
        etn.l0(t7kVar, jSONObject, "name", yb3Var.a);
        etn.l0(t7kVar, jSONObject, "type", "boolean");
        e5f.g(t7kVar, jSONObject, Constants.KEY_VALUE, yb3Var.b);
        return jSONObject;
    }

    @Override // defpackage.py7
    public final /* bridge */ /* synthetic */ Object a(t7k t7kVar, JSONObject jSONObject) {
        return c(t7kVar, jSONObject);
    }

    @Override // defpackage.gip
    public final /* bridge */ /* synthetic */ JSONObject b(t7k t7kVar, Object obj) {
        return d(t7kVar, (yb3) obj);
    }
}
