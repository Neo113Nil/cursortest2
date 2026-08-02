package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class m69 implements gip, py7 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [szb] */
    @Override // defpackage.py7
    public final Object a(t7k t7kVar, JSONObject jSONObject) {
        ox8 ox8Var = vct.a;
        kzj kzjVar = kzj.B;
        ozb ozbVar = o69.a;
        ns9 ns9Var = bcx.h;
        ?? e = e5f.e(t7kVar, jSONObject, "allow_empty", ox8Var, kzjVar, ns9Var, ozbVar);
        if (e != 0) {
            ozbVar = e;
        }
        szb e2 = e5f.e(t7kVar, jSONObject, "label_id", vct.c, bcx.i, ns9Var, null);
        Object opt = jSONObject.opt("variable");
        if (opt == JSONObject.NULL) {
            opt = null;
        }
        return new l69(ozbVar, e2, (String) (opt != null ? opt : null));
    }

    @Override // defpackage.gip
    public final JSONObject b(t7k t7kVar, Object obj) {
        l69 l69Var = (l69) obj;
        JSONObject jSONObject = new JSONObject();
        e5f.g(t7kVar, jSONObject, "allow_empty", l69Var.a);
        e5f.g(t7kVar, jSONObject, "label_id", l69Var.b);
        etn.l0(t7kVar, jSONObject, "variable", l69Var.c);
        return jSONObject;
    }
}
