package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class fi8 implements u8s {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v1, types: [szb] */
    public static ci8 b(t7k t7kVar, hi8 hi8Var, JSONObject jSONObject) {
        szb F = h4a.F(t7kVar, hi8Var.a, jSONObject, "state_id", vct.c);
        c9c c9cVar = hi8Var.b;
        ox8 ox8Var = vct.a;
        kzj kzjVar = kzj.B;
        ozb ozbVar = gi8.a;
        ?? P = h4a.P(t7kVar, c9cVar, jSONObject, "temporary", ox8Var, kzjVar, ozbVar);
        if (P != 0) {
            ozbVar = P;
        }
        return new ci8(F, ozbVar);
    }

    @Override // defpackage.u8s
    public final /* bridge */ /* synthetic */ Object a(t7k t7kVar, d7f d7fVar, JSONObject jSONObject) {
        return b(t7kVar, (hi8) d7fVar, jSONObject);
    }
}
