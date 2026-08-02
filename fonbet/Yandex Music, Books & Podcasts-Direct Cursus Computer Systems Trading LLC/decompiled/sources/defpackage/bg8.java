package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class bg8 implements gip, r8s {
    public static JSONObject c(t7k t7kVar, dg8 dg8Var) {
        JSONObject jSONObject = new JSONObject();
        y2x.f0(t7kVar, jSONObject, "element_id", dg8Var.a);
        etn.l0(t7kVar, jSONObject, "type", "focus_element");
        return jSONObject;
    }

    @Override // defpackage.r8s, defpackage.py7
    public final d7f a(t7k t7kVar, JSONObject jSONObject) {
        return new dg8(y2x.J(y1g.Y(t7kVar), jSONObject, "element_id", vct.c, t7kVar.d(), null));
    }

    @Override // defpackage.gip
    public final /* bridge */ /* synthetic */ JSONObject b(t7k t7kVar, Object obj) {
        return c(t7kVar, (dg8) obj);
    }
}
