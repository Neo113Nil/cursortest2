package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class xn8 implements u8s {
    public final t6f a;

    public xn8(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.u8s
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final un8 a(t7k t7kVar, co8 co8Var, JSONObject jSONObject) {
        boolean z = co8Var instanceof ao8;
        t6f t6fVar = this.a;
        if (z) {
            on8 on8Var = (on8) t6fVar.H1.getValue();
            pn8 pn8Var = ((ao8) co8Var).a;
            on8Var.getClass();
            c9c c9cVar = pn8Var.a;
            t6f t6fVar2 = on8Var.a;
            return new sn8(new ln8(h4a.J(t7kVar, c9cVar, jSONObject, "items", t6fVar2.K1, t6fVar2.I1, nt0.r)));
        }
        if (co8Var instanceof yn8) {
            cy8 cy8Var = (cy8) t6fVar.p3.getValue();
            ey8 ey8Var = ((yn8) co8Var).a;
            cy8Var.getClass();
            return new qn8(cy8.b(t7kVar, ey8Var, jSONObject));
        }
        if (co8Var instanceof zn8) {
            ai9 ai9Var = (ai9) t6fVar.R6.getValue();
            ci9 ci9Var = ((zn8) co8Var).a;
            ai9Var.getClass();
            return new rn8(ai9.b(t7kVar, ci9Var, jSONObject));
        }
        if (co8Var instanceof bo8) {
            return new tn8(((uk9) t6fVar.v7.getValue()).a(t7kVar, ((bo8) co8Var).a, jSONObject));
        }
        b6e.s();
        return null;
    }
}
