package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class i59 implements gip, r8s {
    public static JSONObject c(t7k t7kVar, k59 k59Var) {
        JSONObject jSONObject = new JSONObject();
        y2x.f0(t7kVar, jSONObject, "pattern", k59Var.a);
        etn.l0(t7kVar, jSONObject, "type", "regex");
        return jSONObject;
    }

    @Override // defpackage.r8s, defpackage.py7
    public final d7f a(t7k t7kVar, JSONObject jSONObject) {
        return new k59(y2x.J(y1g.Y(t7kVar), jSONObject, "pattern", vct.c, t7kVar.d(), null));
    }

    @Override // defpackage.gip
    public final /* bridge */ /* synthetic */ JSONObject b(t7k t7kVar, Object obj) {
        return c(t7kVar, (k59) obj);
    }
}
