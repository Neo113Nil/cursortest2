package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ks9 implements gip, py7 {
    public final t6f a;

    public ks9(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.py7
    public final Object a(t7k t7kVar, JSONObject jSONObject) {
        return new js9(e5f.e(t7kVar, jSONObject, "corner_radius", vct.b, kzj.F, up6.l, null), (ln9) etn.U(t7kVar, jSONObject, "stroke", this.a.a8));
    }

    @Override // defpackage.gip
    public final JSONObject b(t7k t7kVar, Object obj) {
        js9 js9Var = (js9) obj;
        JSONObject jSONObject = new JSONObject();
        e5f.g(t7kVar, jSONObject, "corner_radius", js9Var.a);
        etn.m0(t7kVar, jSONObject, "stroke", js9Var.b, this.a.a8);
        return jSONObject;
    }
}
