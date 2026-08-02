package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ai9 implements u8s {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [szb] */
    /* JADX WARN: Type inference failed for: r4v1, types: [szb] */
    /* JADX WARN: Type inference failed for: r4v2, types: [szb] */
    /* JADX WARN: Type inference failed for: r4v3, types: [szb] */
    public static xh9 b(t7k t7kVar, ci9 ci9Var, JSONObject jSONObject) {
        c9c c9cVar = ci9Var.a;
        ox8 ox8Var = vct.b;
        kzj kzjVar = kzj.F;
        mb9 mb9Var = bi9.h;
        ozb ozbVar = bi9.a;
        szb R = h4a.R(t7kVar, c9cVar, jSONObject, "duration", ox8Var, kzjVar, mb9Var, ozbVar);
        if (R == null) {
            R = ozbVar;
        }
        c9c c9cVar2 = ci9Var.b;
        tct tctVar = bi9.g;
        qm8 qm8Var = qm8.v;
        ozb ozbVar2 = bi9.b;
        szb P = h4a.P(t7kVar, c9cVar2, jSONObject, "interpolator", tctVar, qm8Var, ozbVar2);
        if (P == null) {
            P = ozbVar2;
        }
        c9c c9cVar3 = ci9Var.c;
        ox8 ox8Var2 = vct.d;
        kzj kzjVar2 = kzj.E;
        mb9 mb9Var2 = bi9.i;
        ozb ozbVar3 = bi9.c;
        ?? R2 = h4a.R(t7kVar, c9cVar3, jSONObject, "pivot_x", ox8Var2, kzjVar2, mb9Var2, ozbVar3);
        ozb ozbVar4 = R2 == 0 ? ozbVar3 : R2;
        c9c c9cVar4 = ci9Var.d;
        mb9 mb9Var3 = bi9.j;
        ozb ozbVar5 = bi9.d;
        ?? R3 = h4a.R(t7kVar, c9cVar4, jSONObject, "pivot_y", ox8Var2, kzjVar2, mb9Var3, ozbVar5);
        ozb ozbVar6 = R3 == 0 ? ozbVar5 : R3;
        c9c c9cVar5 = ci9Var.e;
        mb9 mb9Var4 = bi9.k;
        ozb ozbVar7 = bi9.e;
        ?? R4 = h4a.R(t7kVar, c9cVar5, jSONObject, "scale", ox8Var2, kzjVar2, mb9Var4, ozbVar7);
        if (R4 != 0) {
            ozbVar7 = R4;
        }
        c9c c9cVar6 = ci9Var.f;
        mb9 mb9Var5 = bi9.l;
        ozb ozbVar8 = bi9.f;
        ?? R5 = h4a.R(t7kVar, c9cVar6, jSONObject, "start_delay", ox8Var, kzjVar, mb9Var5, ozbVar8);
        return new xh9(R, P, ozbVar4, ozbVar6, ozbVar7, R5 == 0 ? ozbVar8 : R5);
    }

    @Override // defpackage.u8s
    public final /* bridge */ /* synthetic */ Object a(t7k t7kVar, d7f d7fVar, JSONObject jSONObject) {
        return b(t7kVar, (ci9) d7fVar, jSONObject);
    }
}
