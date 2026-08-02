package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class yl9 implements gip, py7 {
    public static xl9 c(t7k t7kVar, JSONObject jSONObject) {
        return new xl9(e5f.b(t7kVar, jSONObject, "color", vct.f, kzj.G, bcx.h));
    }

    public static JSONObject d(t7k t7kVar, xl9 xl9Var) {
        JSONObject jSONObject = new JSONObject();
        szb szbVar = xl9Var.a;
        if (szbVar != null) {
            Object b = szbVar.b();
            try {
                if (szbVar instanceof pzb) {
                    jSONObject.put("color", b);
                } else {
                    jSONObject.put("color", c85.a(((Number) b).intValue()));
                }
            } catch (JSONException e) {
                t7kVar.a().a(e);
            }
        }
        etn.l0(t7kVar, jSONObject, "type", "solid");
        return jSONObject;
    }

    @Override // defpackage.py7
    public final /* bridge */ /* synthetic */ Object a(t7k t7kVar, JSONObject jSONObject) {
        return c(t7kVar, jSONObject);
    }

    @Override // defpackage.gip
    public final /* bridge */ /* synthetic */ JSONObject b(t7k t7kVar, Object obj) {
        return d(t7kVar, (xl9) obj);
    }
}
