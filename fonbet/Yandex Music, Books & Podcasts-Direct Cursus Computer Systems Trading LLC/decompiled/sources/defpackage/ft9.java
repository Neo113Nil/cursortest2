package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ft9 implements u8s {
    public final t6f a;

    public ft9(t6f t6fVar) {
        this.a = t6fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v4, types: [szb] */
    @Override // defpackage.u8s
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ct9 a(t7k t7kVar, ht9 ht9Var, JSONObject jSONObject) {
        szb G = h4a.G(t7kVar, ht9Var.a, jSONObject, "color", vct.f, kzj.G);
        c9c c9cVar = ht9Var.b;
        ox8 ox8Var = vct.d;
        kzj kzjVar = kzj.E;
        ns9 ns9Var = gt9.e;
        ozb ozbVar = gt9.a;
        ?? R = h4a.R(t7kVar, c9cVar, jSONObject, "density", ox8Var, kzjVar, ns9Var, ozbVar);
        if (R != 0) {
            ozbVar = R;
        }
        c9c c9cVar2 = ht9Var.c;
        ox8 ox8Var2 = vct.a;
        kzj kzjVar2 = kzj.B;
        ozb ozbVar2 = gt9.b;
        szb P = h4a.P(t7kVar, c9cVar2, jSONObject, "is_animated", ox8Var2, kzjVar2, ozbVar2);
        if (P == null) {
            P = ozbVar2;
        }
        c9c c9cVar3 = ht9Var.d;
        ozb ozbVar3 = gt9.c;
        ?? P2 = h4a.P(t7kVar, c9cVar3, jSONObject, "is_enabled", ox8Var2, kzjVar2, ozbVar3);
        if (P2 != 0) {
            ozbVar3 = P2;
        }
        c9c c9cVar4 = ht9Var.e;
        t6f t6fVar = this.a;
        jz8 jz8Var = (jz8) h4a.K(t7kVar, c9cVar4, jSONObject, "particle_size", t6fVar.H3, t6fVar.F3);
        if (jz8Var == null) {
            jz8Var = gt9.d;
        }
        return new ct9(G, ozbVar, P, ozbVar3, jz8Var);
    }
}
