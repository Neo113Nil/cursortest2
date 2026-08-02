package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class fym implements gip, py7 {
    public final t6f a;

    public fym(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.py7
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final cym a(t7k t7kVar, JSONObject jSONObject) {
        szb a = e5f.a(t7kVar, jSONObject, "get", vct.c);
        Object opt = jSONObject.opt("name");
        Object obj = JSONObject.NULL;
        if (opt == obj) {
            opt = null;
        }
        if (opt == null) {
            throw a8k.g("name", jSONObject);
        }
        String str = (String) opt;
        Object opt2 = jSONObject.opt("new_value_variable_name");
        if (opt2 == obj) {
            opt2 = null;
        }
        String str2 = (String) (opt2 != null ? opt2 : null);
        if (str2 == null) {
            str2 = "new_value";
        }
        return new cym(a, str, str2, etn.Y(t7kVar, jSONObject, "set", this.a.t1), (nx8) etn.R("value_type", jSONObject));
    }

    @Override // defpackage.gip
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, cym cymVar) {
        JSONObject jSONObject = new JSONObject();
        e5f.g(t7kVar, jSONObject, "get", cymVar.a);
        etn.l0(t7kVar, jSONObject, "name", cymVar.b);
        etn.l0(t7kVar, jSONObject, "new_value_variable_name", cymVar.c);
        etn.n0(t7kVar, jSONObject, "set", cymVar.d, this.a.t1);
        etn.l0(t7kVar, jSONObject, "type", "property");
        nx8 nx8Var = cymVar.e;
        if (nx8Var != null) {
            try {
                jSONObject.put("value_type", nx8Var.a);
                return jSONObject;
            } catch (JSONException e) {
                t7kVar.a().a(e);
            }
        }
        return jSONObject;
    }
}
