package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class rd9 implements gip, py7 {
    public static JSONObject c(t7k t7kVar, qd9 qd9Var) {
        JSONObject jSONObject = new JSONObject();
        etn.l0(t7kVar, jSONObject, "raw_text_variable", qd9Var.a);
        etn.l0(t7kVar, jSONObject, "type", "phone");
        return jSONObject;
    }

    @Override // defpackage.py7
    public final Object a(t7k t7kVar, JSONObject jSONObject) {
        return new qd9((String) etn.P("raw_text_variable", jSONObject));
    }

    @Override // defpackage.gip
    public final /* bridge */ /* synthetic */ JSONObject b(t7k t7kVar, Object obj) {
        return c(t7kVar, (qd9) obj);
    }
}
