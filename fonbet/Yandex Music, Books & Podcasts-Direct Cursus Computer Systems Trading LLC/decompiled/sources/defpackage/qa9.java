package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class qa9 implements u8s {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [szb] */
    /* JADX WARN: Type inference failed for: r3v1, types: [szb] */
    public static na9 b(t7k t7kVar, sa9 sa9Var, JSONObject jSONObject) {
        c9c c9cVar = sa9Var.a;
        tct tctVar = ra9.g;
        qm8 qm8Var = qm8.v;
        ozb ozbVar = ra9.a;
        ?? P = h4a.P(t7kVar, c9cVar, jSONObject, "interpolator", tctVar, qm8Var, ozbVar);
        if (P != 0) {
            ozbVar = P;
        }
        c9c c9cVar2 = sa9Var.b;
        ox8 ox8Var = vct.d;
        kzj kzjVar = kzj.E;
        l29 l29Var = ra9.h;
        ozb ozbVar2 = ra9.b;
        szb R = h4a.R(t7kVar, c9cVar2, jSONObject, "next_page_alpha", ox8Var, kzjVar, l29Var, ozbVar2);
        if (R == null) {
            R = ozbVar2;
        }
        c9c c9cVar3 = sa9Var.c;
        l29 l29Var2 = ra9.i;
        ozb ozbVar3 = ra9.c;
        szb R2 = h4a.R(t7kVar, c9cVar3, jSONObject, "next_page_scale", ox8Var, kzjVar, l29Var2, ozbVar3);
        if (R2 == null) {
            R2 = ozbVar3;
        }
        c9c c9cVar4 = sa9Var.d;
        l29 l29Var3 = ra9.j;
        ozb ozbVar4 = ra9.d;
        szb R3 = h4a.R(t7kVar, c9cVar4, jSONObject, "previous_page_alpha", ox8Var, kzjVar, l29Var3, ozbVar4);
        if (R3 == null) {
            R3 = ozbVar4;
        }
        c9c c9cVar5 = sa9Var.e;
        l29 l29Var4 = ra9.k;
        ozb ozbVar5 = ra9.e;
        szb R4 = h4a.R(t7kVar, c9cVar5, jSONObject, "previous_page_scale", ox8Var, kzjVar, l29Var4, ozbVar5);
        if (R4 == null) {
            R4 = ozbVar5;
        }
        c9c c9cVar6 = sa9Var.f;
        ox8 ox8Var2 = vct.a;
        kzj kzjVar2 = kzj.B;
        ozb ozbVar6 = ra9.f;
        ?? P2 = h4a.P(t7kVar, c9cVar6, jSONObject, "reversed_stacking_order", ox8Var2, kzjVar2, ozbVar6);
        return new na9(ozbVar, R, R2, R3, R4, P2 == 0 ? ozbVar6 : P2);
    }

    @Override // defpackage.u8s
    public final /* bridge */ /* synthetic */ Object a(t7k t7kVar, d7f d7fVar, JSONObject jSONObject) {
        return b(t7kVar, (sa9) d7fVar, jSONObject);
    }
}
