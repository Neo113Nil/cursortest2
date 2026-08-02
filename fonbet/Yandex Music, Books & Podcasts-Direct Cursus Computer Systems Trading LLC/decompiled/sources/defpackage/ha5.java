package defpackage;

import io.appmetrica.analytics.rtm.internal.Constants;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ha5 implements gip, py7 {
    public static ga5 c(t7k t7kVar, JSONObject jSONObject) {
        return new ga5(e5f.b(t7kVar, jSONObject, Constants.KEY_VALUE, vct.f, kzj.G, bcx.h), (String) etn.P("name", jSONObject));
    }

    public static JSONObject d(t7k t7kVar, ga5 ga5Var) {
        JSONObject jSONObject = new JSONObject();
        etn.l0(t7kVar, jSONObject, "name", ga5Var.a);
        etn.l0(t7kVar, jSONObject, "type", "color");
        szb szbVar = ga5Var.b;
        if (szbVar == null) {
            return jSONObject;
        }
        Object b = szbVar.b();
        try {
            if (szbVar instanceof pzb) {
                jSONObject.put(Constants.KEY_VALUE, b);
                return jSONObject;
            }
            jSONObject.put(Constants.KEY_VALUE, c85.a(((Number) b).intValue()));
            return jSONObject;
        } catch (JSONException e) {
            t7kVar.a().a(e);
            return jSONObject;
        }
    }

    @Override // defpackage.py7
    public final /* bridge */ /* synthetic */ Object a(t7k t7kVar, JSONObject jSONObject) {
        return c(t7kVar, jSONObject);
    }

    @Override // defpackage.gip
    public final /* bridge */ /* synthetic */ JSONObject b(t7k t7kVar, Object obj) {
        return d(t7kVar, (ga5) obj);
    }
}
