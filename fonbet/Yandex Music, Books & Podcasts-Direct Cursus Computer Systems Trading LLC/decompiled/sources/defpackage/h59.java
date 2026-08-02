package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class h59 implements gip, py7 {
    public static JSONObject c(t7k t7kVar, g59 g59Var) {
        JSONObject jSONObject = new JSONObject();
        e5f.g(t7kVar, jSONObject, "pattern", g59Var.a);
        etn.l0(t7kVar, jSONObject, "type", "regex");
        return jSONObject;
    }

    @Override // defpackage.py7
    public final Object a(t7k t7kVar, JSONObject jSONObject) {
        return new g59(e5f.a(t7kVar, jSONObject, "pattern", vct.c));
    }

    @Override // defpackage.gip
    public final /* bridge */ /* synthetic */ JSONObject b(t7k t7kVar, Object obj) {
        return c(t7kVar, (g59) obj);
    }
}
