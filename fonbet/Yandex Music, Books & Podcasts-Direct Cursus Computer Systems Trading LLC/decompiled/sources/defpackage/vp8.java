package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class vp8 implements gip, py7 {
    public final t6f a;

    public vp8(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.py7
    public final Object a(t7k t7kVar, JSONObject jSONObject) {
        szb e = e5f.e(t7kVar, jSONObject, "corner_radius", vct.b, kzj.F, xp8.b, null);
        t6f t6fVar = this.a;
        fu8 fu8Var = (fu8) etn.U(t7kVar, jSONObject, "corners_radius", t6fVar.B2);
        ox8 ox8Var = vct.a;
        kzj kzjVar = kzj.B;
        ozb ozbVar = xp8.a;
        szb e2 = e5f.e(t7kVar, jSONObject, "has_shadow", ox8Var, kzjVar, bcx.h, ozbVar);
        if (e2 == null) {
            e2 = ozbVar;
        }
        return new op8(e, fu8Var, e2, (dj9) etn.U(t7kVar, jSONObject, "shadow", t6fVar.e7), (ln9) etn.U(t7kVar, jSONObject, "stroke", t6fVar.a8));
    }

    @Override // defpackage.gip
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, op8 op8Var) {
        JSONObject jSONObject = new JSONObject();
        e5f.g(t7kVar, jSONObject, "corner_radius", op8Var.a);
        fu8 fu8Var = op8Var.b;
        t6f t6fVar = this.a;
        etn.m0(t7kVar, jSONObject, "corners_radius", fu8Var, t6fVar.B2);
        e5f.g(t7kVar, jSONObject, "has_shadow", op8Var.c);
        etn.m0(t7kVar, jSONObject, "shadow", op8Var.d, t6fVar.e7);
        etn.m0(t7kVar, jSONObject, "stroke", op8Var.e, t6fVar.a8);
        return jSONObject;
    }
}
