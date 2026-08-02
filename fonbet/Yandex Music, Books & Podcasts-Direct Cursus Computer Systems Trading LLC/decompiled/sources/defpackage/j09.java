package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class j09 implements gip, r8s {
    @Override // defpackage.r8s, defpackage.py7
    public final d7f a(t7k t7kVar, JSONObject jSONObject) {
        boolean d = t7kVar.d();
        hzj Y = y1g.Y(t7kVar);
        return new k09(y2x.G(Y, jSONObject, "name", d, null), y2x.I(Y, jSONObject, "type", d, null, vv8.v, bcx.h));
    }

    @Override // defpackage.gip
    public final JSONObject b(t7k t7kVar, Object obj) {
        k09 k09Var = (k09) obj;
        JSONObject jSONObject = new JSONObject();
        y2x.h0(t7kVar, jSONObject, "name", k09Var.a);
        c9c c9cVar = k09Var.b;
        if (c9cVar instanceof a9c) {
            Object obj2 = ((a9c) c9cVar).c;
            if (obj2 != null) {
                try {
                    jSONObject.put("type", ((nx8) obj2).a);
                    return jSONObject;
                } catch (JSONException e) {
                    t7kVar.a().a(e);
                    return jSONObject;
                }
            }
        } else if (c9cVar instanceof z8c) {
            etn.l0(t7kVar, jSONObject, "$".concat("type"), ((z8c) c9cVar).c);
        }
        return jSONObject;
    }
}
