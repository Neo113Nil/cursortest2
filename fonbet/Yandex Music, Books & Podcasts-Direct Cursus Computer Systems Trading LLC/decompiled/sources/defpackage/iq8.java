package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class iq8 implements u8s {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1, types: [szb] */
    public static fq8 b(t7k t7kVar, kq8 kq8Var, JSONObject jSONObject) {
        c9c c9cVar = kq8Var.a;
        ox8 ox8Var = vct.b;
        kzj kzjVar = kzj.F;
        lc8 lc8Var = jq8.e;
        ozb ozbVar = jq8.a;
        szb R = h4a.R(t7kVar, c9cVar, jSONObject, "duration", ox8Var, kzjVar, lc8Var, ozbVar);
        if (R == null) {
            R = ozbVar;
        }
        c9c c9cVar2 = kq8Var.b;
        tct tctVar = jq8.d;
        qm8 qm8Var = qm8.v;
        ozb ozbVar2 = jq8.b;
        szb P = h4a.P(t7kVar, c9cVar2, jSONObject, "interpolator", tctVar, qm8Var, ozbVar2);
        if (P == null) {
            P = ozbVar2;
        }
        c9c c9cVar3 = kq8Var.c;
        lc8 lc8Var2 = jq8.f;
        ozb ozbVar3 = jq8.c;
        ?? R2 = h4a.R(t7kVar, c9cVar3, jSONObject, "start_delay", ox8Var, kzjVar, lc8Var2, ozbVar3);
        if (R2 != 0) {
            ozbVar3 = R2;
        }
        return new fq8(R, P, ozbVar3);
    }

    @Override // defpackage.u8s
    public final /* bridge */ /* synthetic */ Object a(t7k t7kVar, d7f d7fVar, JSONObject jSONObject) {
        return b(t7kVar, (kq8) d7fVar, jSONObject);
    }
}
