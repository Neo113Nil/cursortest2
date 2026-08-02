package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ag8 implements gip, py7 {
    public static JSONObject c(t7k t7kVar, zf8 zf8Var) {
        JSONObject jSONObject = new JSONObject();
        e5f.g(t7kVar, jSONObject, "element_id", zf8Var.a);
        etn.l0(t7kVar, jSONObject, "type", "focus_element");
        return jSONObject;
    }

    @Override // defpackage.py7
    public final Object a(t7k t7kVar, JSONObject jSONObject) {
        return new zf8(e5f.a(t7kVar, jSONObject, "element_id", vct.c));
    }

    @Override // defpackage.gip
    public final /* bridge */ /* synthetic */ JSONObject b(t7k t7kVar, Object obj) {
        return c(t7kVar, (zf8) obj);
    }
}
