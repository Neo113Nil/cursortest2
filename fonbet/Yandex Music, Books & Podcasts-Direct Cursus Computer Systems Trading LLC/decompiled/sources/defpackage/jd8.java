package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class jd8 implements gip, py7 {
    public static JSONObject c(t7k t7kVar, id8 id8Var) {
        JSONObject jSONObject = new JSONObject();
        etn.l0(t7kVar, jSONObject, "animator_id", id8Var.a);
        etn.l0(t7kVar, jSONObject, "type", "animator_stop");
        return jSONObject;
    }

    @Override // defpackage.py7
    public final Object a(t7k t7kVar, JSONObject jSONObject) {
        return new id8((String) etn.P("animator_id", jSONObject));
    }

    @Override // defpackage.gip
    public final /* bridge */ /* synthetic */ JSONObject b(t7k t7kVar, Object obj) {
        return c(t7kVar, (id8) obj);
    }
}
