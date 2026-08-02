package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class cz8 implements u8s {
    public final t6f a;

    public cz8(t6f t6fVar) {
        this.a = t6fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [szb] */
    @Override // defpackage.u8s
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final zy8 a(t7k t7kVar, iz8 iz8Var, JSONObject jSONObject) {
        c9c c9cVar = iz8Var.a;
        ox8 ox8Var = vct.a;
        kzj kzjVar = kzj.B;
        ozb ozbVar = dz8.a;
        ?? P = h4a.P(t7kVar, c9cVar, jSONObject, "always_visible", ox8Var, kzjVar, ozbVar);
        ozb ozbVar2 = P == 0 ? ozbVar : P;
        szb F = h4a.F(t7kVar, iz8Var.b, jSONObject, "pattern", vct.c);
        c9c c9cVar2 = iz8Var.c;
        t6f t6fVar = this.a;
        return new zy8(ozbVar2, F, h4a.J(t7kVar, c9cVar2, jSONObject, "pattern_elements", t6fVar.E3, t6fVar.C3, dz8.b), (String) h4a.C(iz8Var.d, jSONObject, "raw_text_variable", bcx.i, bcx.h));
    }
}
