package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zl9 implements gip, r8s {
    public static bm9 c(t7k t7kVar, bm9 bm9Var, JSONObject jSONObject) {
        return new bm9(y2x.K(y1g.Y(t7kVar), jSONObject, "color", vct.f, t7kVar.d(), bm9Var != null ? bm9Var.a : null, kzj.G, bcx.h));
    }

    public static JSONObject d(t7k t7kVar, bm9 bm9Var) {
        JSONObject jSONObject = new JSONObject();
        y2x.e0(bm9Var.a, t7kVar, "color", kzj.D, jSONObject);
        etn.l0(t7kVar, jSONObject, "type", "solid");
        return jSONObject;
    }

    @Override // defpackage.r8s, defpackage.py7
    public final /* bridge */ /* synthetic */ d7f a(t7k t7kVar, JSONObject jSONObject) {
        return c(t7kVar, null, jSONObject);
    }

    @Override // defpackage.gip
    public final /* bridge */ /* synthetic */ JSONObject b(t7k t7kVar, Object obj) {
        return d(t7kVar, (bm9) obj);
    }
}
