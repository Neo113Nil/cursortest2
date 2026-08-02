package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class yf9 implements gip, py7 {
    public static JSONObject c(t7k t7kVar, nf9 nf9Var) {
        JSONObject jSONObject = new JSONObject();
        szb szbVar = nf9Var.a;
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
        e5f.g(t7kVar, jSONObject, "position", nf9Var.b);
        return jSONObject;
    }

    @Override // defpackage.py7
    public final Object a(t7k t7kVar, JSONObject jSONObject) {
        return new nf9(e5f.b(t7kVar, jSONObject, "color", vct.f, kzj.G, bcx.h), e5f.b(t7kVar, jSONObject, "position", vct.d, kzj.E, j66.h));
    }

    @Override // defpackage.gip
    public final /* bridge */ /* synthetic */ JSONObject b(t7k t7kVar, Object obj) {
        return c(t7kVar, (nf9) obj);
    }
}
