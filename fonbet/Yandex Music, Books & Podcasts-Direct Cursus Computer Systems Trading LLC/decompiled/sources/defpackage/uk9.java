package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class uk9 implements u8s {
    public final t6f a;

    public uk9(t6f t6fVar) {
        this.a = t6fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [szb] */
    @Override // defpackage.u8s
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final qk9 a(t7k t7kVar, wk9 wk9Var, JSONObject jSONObject) {
        c9c c9cVar = wk9Var.a;
        t6f t6fVar = this.a;
        ow8 ow8Var = (ow8) h4a.K(t7kVar, c9cVar, jSONObject, "distance", t6fVar.X2, t6fVar.V2);
        c9c c9cVar2 = wk9Var.b;
        ox8 ox8Var = vct.b;
        kzj kzjVar = kzj.F;
        mb9 mb9Var = vk9.g;
        ozb ozbVar = vk9.a;
        szb R = h4a.R(t7kVar, c9cVar2, jSONObject, "duration", ox8Var, kzjVar, mb9Var, ozbVar);
        if (R == null) {
            R = ozbVar;
        }
        c9c c9cVar3 = wk9Var.c;
        tct tctVar = vk9.e;
        gd9 gd9Var = gd9.z0;
        ozb ozbVar2 = vk9.b;
        szb P = h4a.P(t7kVar, c9cVar3, jSONObject, "edge", tctVar, gd9Var, ozbVar2);
        if (P == null) {
            P = ozbVar2;
        }
        c9c c9cVar4 = wk9Var.d;
        tct tctVar2 = vk9.f;
        qm8 qm8Var = qm8.v;
        ozb ozbVar3 = vk9.c;
        szb P2 = h4a.P(t7kVar, c9cVar4, jSONObject, "interpolator", tctVar2, qm8Var, ozbVar3);
        if (P2 == null) {
            P2 = ozbVar3;
        }
        c9c c9cVar5 = wk9Var.e;
        mb9 mb9Var2 = vk9.h;
        ozb ozbVar4 = vk9.d;
        ?? R2 = h4a.R(t7kVar, c9cVar5, jSONObject, "start_delay", ox8Var, kzjVar, mb9Var2, ozbVar4);
        return new qk9(ow8Var, R, P, P2, R2 == 0 ? ozbVar4 : R2);
    }
}
