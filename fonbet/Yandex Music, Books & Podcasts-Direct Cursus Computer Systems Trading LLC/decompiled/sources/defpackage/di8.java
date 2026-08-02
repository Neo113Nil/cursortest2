package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class di8 implements gip, py7 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v1, types: [szb] */
    public static ci8 c(t7k t7kVar, JSONObject jSONObject) {
        szb a = e5f.a(t7kVar, jSONObject, "state_id", vct.c);
        ox8 ox8Var = vct.a;
        kzj kzjVar = kzj.B;
        ozb ozbVar = gi8.a;
        ?? e = e5f.e(t7kVar, jSONObject, "temporary", ox8Var, kzjVar, bcx.h, ozbVar);
        if (e != 0) {
            ozbVar = e;
        }
        return new ci8(a, ozbVar);
    }

    public static JSONObject d(t7k t7kVar, ci8 ci8Var) {
        JSONObject jSONObject = new JSONObject();
        e5f.g(t7kVar, jSONObject, "state_id", ci8Var.a);
        e5f.g(t7kVar, jSONObject, "temporary", ci8Var.b);
        etn.l0(t7kVar, jSONObject, "type", "set_state");
        return jSONObject;
    }

    @Override // defpackage.py7
    public final /* bridge */ /* synthetic */ Object a(t7k t7kVar, JSONObject jSONObject) {
        return c(t7kVar, jSONObject);
    }

    @Override // defpackage.gip
    public final /* bridge */ /* synthetic */ JSONObject b(t7k t7kVar, Object obj) {
        return d(t7kVar, (ci8) obj);
    }
}
