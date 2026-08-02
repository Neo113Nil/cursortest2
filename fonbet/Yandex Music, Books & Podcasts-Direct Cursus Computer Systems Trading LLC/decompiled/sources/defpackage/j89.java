package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class j89 implements gip, py7 {
    public final t6f a;

    public j89(t6f t6fVar) {
        this.a = t6fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v1, types: [szb] */
    @Override // defpackage.py7
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final g89 a(t7k t7kVar, JSONObject jSONObject) {
        ox8 ox8Var = vct.b;
        kzj kzjVar = kzj.F;
        l29 l29Var = m89.b;
        ozb ozbVar = m89.a;
        ?? e = e5f.e(t7kVar, jSONObject, "angle", ox8Var, kzjVar, l29Var, ozbVar);
        if (e != 0) {
            ozbVar = e;
        }
        return new g89(ozbVar, etn.Z(t7kVar, jSONObject, "color_map", this.a.e5, m89.d), e5f.f(t7kVar, jSONObject, "colors", vct.f, m89.c));
    }

    @Override // defpackage.gip
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, g89 g89Var) {
        JSONObject jSONObject = new JSONObject();
        e5f.g(t7kVar, jSONObject, "angle", g89Var.a);
        etn.n0(t7kVar, jSONObject, "color_map", g89Var.b, this.a.e5);
        e5f.i(t7kVar, jSONObject, g89Var.c);
        etn.l0(t7kVar, jSONObject, "type", "gradient");
        return jSONObject;
    }
}
