package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class wa9 implements u8s {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [szb] */
    /* JADX WARN: Type inference failed for: r3v1, types: [szb] */
    public static ta9 b(t7k t7kVar, ya9 ya9Var, JSONObject jSONObject) {
        c9c c9cVar = ya9Var.a;
        tct tctVar = xa9.f;
        qm8 qm8Var = qm8.v;
        ozb ozbVar = xa9.a;
        ?? P = h4a.P(t7kVar, c9cVar, jSONObject, "interpolator", tctVar, qm8Var, ozbVar);
        if (P != 0) {
            ozbVar = P;
        }
        c9c c9cVar2 = ya9Var.b;
        ox8 ox8Var = vct.d;
        kzj kzjVar = kzj.E;
        l29 l29Var = xa9.g;
        ozb ozbVar2 = xa9.b;
        szb R = h4a.R(t7kVar, c9cVar2, jSONObject, "next_page_alpha", ox8Var, kzjVar, l29Var, ozbVar2);
        if (R == null) {
            R = ozbVar2;
        }
        c9c c9cVar3 = ya9Var.c;
        l29 l29Var2 = xa9.h;
        ozb ozbVar3 = xa9.c;
        szb R2 = h4a.R(t7kVar, c9cVar3, jSONObject, "next_page_scale", ox8Var, kzjVar, l29Var2, ozbVar3);
        if (R2 == null) {
            R2 = ozbVar3;
        }
        c9c c9cVar4 = ya9Var.d;
        l29 l29Var3 = xa9.i;
        ozb ozbVar4 = xa9.d;
        szb R3 = h4a.R(t7kVar, c9cVar4, jSONObject, "previous_page_alpha", ox8Var, kzjVar, l29Var3, ozbVar4);
        if (R3 == null) {
            R3 = ozbVar4;
        }
        c9c c9cVar5 = ya9Var.e;
        l29 l29Var4 = xa9.j;
        ozb ozbVar5 = xa9.e;
        ?? R4 = h4a.R(t7kVar, c9cVar5, jSONObject, "previous_page_scale", ox8Var, kzjVar, l29Var4, ozbVar5);
        return new ta9(ozbVar, R, R2, R3, R4 == 0 ? ozbVar5 : R4);
    }

    @Override // defpackage.u8s
    public final /* bridge */ /* synthetic */ Object a(t7k t7kVar, d7f d7fVar, JSONObject jSONObject) {
        return b(t7kVar, (ya9) d7fVar, jSONObject);
    }
}
