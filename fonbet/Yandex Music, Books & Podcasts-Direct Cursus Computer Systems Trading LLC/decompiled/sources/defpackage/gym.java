package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class gym implements gip, r8s {
    public final t6f a;

    public gym(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.r8s, defpackage.py7
    public final /* bridge */ /* synthetic */ d7f a(t7k t7kVar, JSONObject jSONObject) {
        return c(t7kVar, null, jSONObject);
    }

    public final iym c(t7k t7kVar, iym iymVar, JSONObject jSONObject) {
        boolean d = t7kVar.d();
        hzj Y = y1g.Y(t7kVar);
        return new iym(y2x.J(Y, jSONObject, "get", vct.c, d, iymVar != null ? iymVar.a : null), y2x.G(Y, jSONObject, "name", d, iymVar != null ? iymVar.b : null), y2x.O(Y, jSONObject, "new_value_variable_name", d, iymVar != null ? iymVar.c : null, bcx.i), y2x.R(Y, jSONObject, "set", d, iymVar != null ? iymVar.d : null, this.a.u1), y2x.I(Y, jSONObject, "value_type", d, iymVar != null ? iymVar.e : null, vv8.v, bcx.h));
    }

    @Override // defpackage.gip
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, iym iymVar) {
        JSONObject jSONObject = new JSONObject();
        y2x.f0(t7kVar, jSONObject, "get", iymVar.a);
        y2x.h0(t7kVar, jSONObject, "name", iymVar.b);
        y2x.h0(t7kVar, jSONObject, "new_value_variable_name", iymVar.c);
        y2x.k0(t7kVar, jSONObject, "set", iymVar.d, this.a.u1);
        etn.l0(t7kVar, jSONObject, "type", "property");
        c9c c9cVar = iymVar.e;
        if (c9cVar instanceof a9c) {
            Object obj = ((a9c) c9cVar).c;
            if (obj != null) {
                try {
                    jSONObject.put("value_type", ((nx8) obj).a);
                } catch (JSONException e) {
                    t7kVar.a().a(e);
                }
            }
        } else if (c9cVar instanceof z8c) {
            etn.l0(t7kVar, jSONObject, "$".concat("value_type"), ((z8c) c9cVar).c);
        }
        return jSONObject;
    }
}
