package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class c79 implements u8s {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1, types: [szb] */
    public static z69 b(t7k t7kVar, e79 e79Var, JSONObject jSONObject) {
        c9c c9cVar = e79Var.a;
        ox8 ox8Var = vct.a;
        kzj kzjVar = kzj.B;
        ozb ozbVar = d79.a;
        ?? P = h4a.P(t7kVar, c9cVar, jSONObject, "allow_empty", ox8Var, kzjVar, ozbVar);
        if (P != 0) {
            ozbVar = P;
        }
        c9c c9cVar2 = e79Var.b;
        ox8 ox8Var2 = vct.c;
        return new z69(ozbVar, h4a.F(t7kVar, c9cVar2, jSONObject, "label_id", ox8Var2), h4a.F(t7kVar, e79Var.c, jSONObject, "pattern", ox8Var2), (String) h4a.C(e79Var.d, jSONObject, "variable", bcx.i, bcx.h));
    }

    @Override // defpackage.u8s
    public final /* bridge */ /* synthetic */ Object a(t7k t7kVar, d7f d7fVar, JSONObject jSONObject) {
        return b(t7kVar, (e79) d7fVar, jSONObject);
    }
}
