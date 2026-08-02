package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class sd9 implements gip, r8s {
    public static JSONObject c(t7k t7kVar, ud9 ud9Var) {
        JSONObject jSONObject = new JSONObject();
        y2x.h0(t7kVar, jSONObject, "raw_text_variable", ud9Var.a);
        etn.l0(t7kVar, jSONObject, "type", "phone");
        return jSONObject;
    }

    @Override // defpackage.r8s, defpackage.py7
    public final d7f a(t7k t7kVar, JSONObject jSONObject) {
        return new ud9(y2x.G(y1g.Y(t7kVar), jSONObject, "raw_text_variable", t7kVar.d(), null));
    }

    @Override // defpackage.gip
    public final /* bridge */ /* synthetic */ JSONObject b(t7k t7kVar, Object obj) {
        return c(t7kVar, (ud9) obj);
    }
}
