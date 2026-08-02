package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class e69 implements gip, py7 {
    public static JSONObject c(t7k t7kVar, k49 k49Var) {
        JSONObject jSONObject = new JSONObject();
        szb szbVar = k49Var.a;
        if (szbVar == null) {
            return jSONObject;
        }
        Object b = szbVar.b();
        try {
            if (szbVar instanceof pzb) {
                jSONObject.put("color", b);
                return jSONObject;
            }
            jSONObject.put("color", c85.a(((Number) b).intValue()));
            return jSONObject;
        } catch (JSONException e) {
            t7kVar.a().a(e);
            return jSONObject;
        }
    }

    @Override // defpackage.py7
    public final Object a(t7k t7kVar, JSONObject jSONObject) {
        return new k49(e5f.b(t7kVar, jSONObject, "color", vct.f, kzj.G, bcx.h));
    }

    @Override // defpackage.gip
    public final /* bridge */ /* synthetic */ JSONObject b(t7k t7kVar, Object obj) {
        return c(t7kVar, (k49) obj);
    }
}
