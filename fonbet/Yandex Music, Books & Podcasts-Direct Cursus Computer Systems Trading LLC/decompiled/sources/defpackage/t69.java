package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class t69 implements u8s {
    public static q69 b(t7k t7kVar, v69 v69Var, JSONObject jSONObject) {
        c9c c9cVar = v69Var.a;
        ox8 ox8Var = vct.a;
        kzj kzjVar = kzj.B;
        ozb ozbVar = u69.a;
        szb P = h4a.P(t7kVar, c9cVar, jSONObject, "allow_empty", ox8Var, kzjVar, ozbVar);
        if (P == null) {
            P = ozbVar;
        }
        return new q69(P, h4a.G(t7kVar, v69Var.b, jSONObject, "condition", ox8Var, kzjVar), h4a.F(t7kVar, v69Var.c, jSONObject, "label_id", vct.c), (String) h4a.C(v69Var.d, jSONObject, "variable", bcx.i, bcx.h));
    }

    @Override // defpackage.u8s
    public final /* bridge */ /* synthetic */ Object a(t7k t7kVar, d7f d7fVar, JSONObject jSONObject) {
        return b(t7kVar, (v69) d7fVar, jSONObject);
    }
}
