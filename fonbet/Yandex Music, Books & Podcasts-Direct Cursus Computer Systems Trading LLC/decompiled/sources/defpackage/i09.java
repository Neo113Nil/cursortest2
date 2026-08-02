package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class i09 implements gip, py7 {
    public static JSONObject c(t7k t7kVar, h09 h09Var) {
        JSONObject jSONObject = new JSONObject();
        etn.l0(t7kVar, jSONObject, "name", h09Var.a);
        nx8 nx8Var = h09Var.b;
        if (nx8Var != null) {
            try {
                jSONObject.put("type", nx8Var.a);
                return jSONObject;
            } catch (JSONException e) {
                t7kVar.a().a(e);
            }
        }
        return jSONObject;
    }

    @Override // defpackage.py7
    public final Object a(t7k t7kVar, JSONObject jSONObject) {
        return new h09((String) etn.P("name", jSONObject), (nx8) etn.R("type", jSONObject));
    }

    @Override // defpackage.gip
    public final /* bridge */ /* synthetic */ JSONObject b(t7k t7kVar, Object obj) {
        return c(t7kVar, (h09) obj);
    }
}
