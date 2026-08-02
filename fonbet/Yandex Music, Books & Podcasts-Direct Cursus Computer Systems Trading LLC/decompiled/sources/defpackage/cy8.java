package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class cy8 implements u8s {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [szb] */
    public static zx8 b(t7k t7kVar, ey8 ey8Var, JSONObject jSONObject) {
        c9c c9cVar = ey8Var.a;
        ox8 ox8Var = vct.d;
        kzj kzjVar = kzj.E;
        uw8 uw8Var = dy8.f;
        ozb ozbVar = dy8.a;
        ?? R = h4a.R(t7kVar, c9cVar, jSONObject, "alpha", ox8Var, kzjVar, uw8Var, ozbVar);
        if (R != 0) {
            ozbVar = R;
        }
        c9c c9cVar2 = ey8Var.b;
        ox8 ox8Var2 = vct.b;
        kzj kzjVar2 = kzj.F;
        uw8 uw8Var2 = dy8.g;
        ozb ozbVar2 = dy8.b;
        szb R2 = h4a.R(t7kVar, c9cVar2, jSONObject, "duration", ox8Var2, kzjVar2, uw8Var2, ozbVar2);
        if (R2 == null) {
            R2 = ozbVar2;
        }
        c9c c9cVar3 = ey8Var.c;
        tct tctVar = dy8.e;
        qm8 qm8Var = qm8.v;
        ozb ozbVar3 = dy8.c;
        szb P = h4a.P(t7kVar, c9cVar3, jSONObject, "interpolator", tctVar, qm8Var, ozbVar3);
        if (P == null) {
            P = ozbVar3;
        }
        c9c c9cVar4 = ey8Var.d;
        uw8 uw8Var3 = dy8.h;
        ozb ozbVar4 = dy8.d;
        szb R3 = h4a.R(t7kVar, c9cVar4, jSONObject, "start_delay", ox8Var2, kzjVar2, uw8Var3, ozbVar4);
        if (R3 == null) {
            R3 = ozbVar4;
        }
        return new zx8(ozbVar, R2, P, R3);
    }

    @Override // defpackage.u8s
    public final /* bridge */ /* synthetic */ Object a(t7k t7kVar, d7f d7fVar, JSONObject jSONObject) {
        return b(t7kVar, (ey8) d7fVar, jSONObject);
    }
}
