package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class z79 implements gip, py7 {
    @Override // defpackage.py7
    public final Object a(t7k t7kVar, JSONObject jSONObject) {
        Object N = etn.N("height_variable_name", jSONObject);
        if (N == null) {
            N = null;
        }
        String str = (String) N;
        Object opt = jSONObject.opt("width_variable_name");
        if (opt == JSONObject.NULL) {
            opt = null;
        }
        return new w79(str, (String) (opt != null ? opt : null));
    }

    @Override // defpackage.gip
    public final JSONObject b(t7k t7kVar, Object obj) {
        w79 w79Var = (w79) obj;
        JSONObject jSONObject = new JSONObject();
        etn.l0(t7kVar, jSONObject, "height_variable_name", w79Var.a);
        etn.l0(t7kVar, jSONObject, "width_variable_name", w79Var.b);
        return jSONObject;
    }
}
