package defpackage;

import io.appmetrica.analytics.rtm.internal.Constants;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class khj implements gip, py7 {
    public static jhj c(t7k t7kVar, JSONObject jSONObject) {
        return new jhj(e5f.b(t7kVar, jSONObject, Constants.KEY_VALUE, vct.d, kzj.E, bcx.h), (String) etn.P("name", jSONObject));
    }

    public static JSONObject d(t7k t7kVar, jhj jhjVar) {
        JSONObject jSONObject = new JSONObject();
        etn.l0(t7kVar, jSONObject, "name", jhjVar.a);
        etn.l0(t7kVar, jSONObject, "type", "number");
        e5f.g(t7kVar, jSONObject, Constants.KEY_VALUE, jhjVar.b);
        return jSONObject;
    }

    @Override // defpackage.py7
    public final /* bridge */ /* synthetic */ Object a(t7k t7kVar, JSONObject jSONObject) {
        return c(t7kVar, jSONObject);
    }

    @Override // defpackage.gip
    public final /* bridge */ /* synthetic */ JSONObject b(t7k t7kVar, Object obj) {
        return d(t7kVar, (jhj) obj);
    }
}
