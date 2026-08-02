package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class lt9 implements u8s {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v1, types: [szb] */
    public static it9 b(t7k t7kVar, nt9 nt9Var, JSONObject jSONObject) {
        szb G = h4a.G(t7kVar, nt9Var.a, jSONObject, "color", vct.f, kzj.G);
        c9c c9cVar = nt9Var.b;
        ox8 ox8Var = vct.a;
        kzj kzjVar = kzj.B;
        ozb ozbVar = mt9.a;
        ?? P = h4a.P(t7kVar, c9cVar, jSONObject, "is_enabled", ox8Var, kzjVar, ozbVar);
        if (P != 0) {
            ozbVar = P;
        }
        return new it9(G, ozbVar);
    }

    @Override // defpackage.u8s
    public final /* bridge */ /* synthetic */ Object a(t7k t7kVar, d7f d7fVar, JSONObject jSONObject) {
        return b(t7kVar, (nt9) d7fVar, jSONObject);
    }
}
