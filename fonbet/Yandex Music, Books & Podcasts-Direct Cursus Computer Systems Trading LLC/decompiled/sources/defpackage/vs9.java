package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class vs9 implements gip, py7 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v1, types: [szb] */
    @Override // defpackage.py7
    public final Object a(t7k t7kVar, JSONObject jSONObject) {
        ox8 ox8Var = vct.a;
        kzj kzjVar = kzj.B;
        ozb ozbVar = xs9.a;
        ?? e = e5f.e(t7kVar, jSONObject, "is_enabled", ox8Var, kzjVar, bcx.h, ozbVar);
        if (e != 0) {
            ozbVar = e;
        }
        return new us9(ozbVar);
    }

    @Override // defpackage.gip
    public final JSONObject b(t7k t7kVar, Object obj) {
        JSONObject jSONObject = new JSONObject();
        e5f.g(t7kVar, jSONObject, "is_enabled", ((us9) obj).a);
        return jSONObject;
    }
}
