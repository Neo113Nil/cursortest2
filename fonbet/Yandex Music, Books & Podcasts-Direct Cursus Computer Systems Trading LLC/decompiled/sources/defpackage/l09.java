package defpackage;

import java.util.List;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class l09 implements gip, py7 {
    public final t6f a;

    public l09(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.py7
    public final Object a(t7k t7kVar, JSONObject jSONObject) {
        List T = etn.T(t7kVar, jSONObject, "arguments", this.a.R3);
        Object opt = jSONObject.opt("body");
        Object obj = JSONObject.NULL;
        if (opt == obj) {
            opt = null;
        }
        if (opt == null) {
            throw a8k.g("body", jSONObject);
        }
        String str = (String) opt;
        Object opt2 = jSONObject.opt("name");
        Object obj2 = opt2 != obj ? opt2 : null;
        if (obj2 == null) {
            throw a8k.g("name", jSONObject);
        }
        try {
            if (Pattern.matches("^[a-zA-Z_][a-zA-Z0-9_]*$", (String) obj2)) {
                return new g09(T, str, (String) obj2, (nx8) etn.R("return_type", jSONObject));
            }
            throw a8k.e(jSONObject, "name", obj2);
        } catch (ClassCastException unused) {
            throw a8k.l(jSONObject, "name", obj2);
        }
    }

    @Override // defpackage.gip
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, g09 g09Var) {
        JSONObject jSONObject = new JSONObject();
        etn.n0(t7kVar, jSONObject, "arguments", g09Var.a, this.a.R3);
        etn.l0(t7kVar, jSONObject, "body", g09Var.b);
        etn.l0(t7kVar, jSONObject, "name", g09Var.c);
        nx8 nx8Var = g09Var.d;
        if (nx8Var != null) {
            try {
                jSONObject.put("return_type", nx8Var.a);
                return jSONObject;
            } catch (JSONException e) {
                t7kVar.a().a(e);
            }
        }
        return jSONObject;
    }
}
