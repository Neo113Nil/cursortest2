package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class kd8 implements gip, r8s {
    public static JSONObject c(t7k t7kVar, md8 md8Var) {
        JSONObject jSONObject = new JSONObject();
        y2x.h0(t7kVar, jSONObject, "animator_id", md8Var.a);
        etn.l0(t7kVar, jSONObject, "type", "animator_stop");
        return jSONObject;
    }

    @Override // defpackage.r8s, defpackage.py7
    public final d7f a(t7k t7kVar, JSONObject jSONObject) {
        return new md8(y2x.G(y1g.Y(t7kVar), jSONObject, "animator_id", t7kVar.d(), null));
    }

    @Override // defpackage.gip
    public final /* bridge */ /* synthetic */ JSONObject b(t7k t7kVar, Object obj) {
        return c(t7kVar, (md8) obj);
    }
}
