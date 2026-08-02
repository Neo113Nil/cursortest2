package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class r69 implements gip, py7 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v1, types: [szb] */
    public static q69 c(t7k t7kVar, JSONObject jSONObject) {
        ox8 ox8Var = vct.a;
        kzj kzjVar = kzj.B;
        ozb ozbVar = u69.a;
        ns9 ns9Var = bcx.h;
        ?? e = e5f.e(t7kVar, jSONObject, "allow_empty", ox8Var, kzjVar, ns9Var, ozbVar);
        if (e != 0) {
            ozbVar = e;
        }
        szb b = e5f.b(t7kVar, jSONObject, "condition", ox8Var, kzjVar, ns9Var);
        szb b2 = e5f.b(t7kVar, jSONObject, "label_id", vct.c, bcx.i, ns9Var);
        Object opt = jSONObject.opt("variable");
        if (opt == JSONObject.NULL) {
            opt = null;
        }
        if (opt != null) {
            return new q69(ozbVar, b, b2, (String) opt);
        }
        throw a8k.g("variable", jSONObject);
    }

    public static JSONObject d(t7k t7kVar, q69 q69Var) {
        JSONObject jSONObject = new JSONObject();
        e5f.g(t7kVar, jSONObject, "allow_empty", q69Var.a);
        e5f.g(t7kVar, jSONObject, "condition", q69Var.b);
        e5f.g(t7kVar, jSONObject, "label_id", q69Var.c);
        etn.l0(t7kVar, jSONObject, "type", "expression");
        etn.l0(t7kVar, jSONObject, "variable", q69Var.d);
        return jSONObject;
    }

    @Override // defpackage.py7
    public final /* bridge */ /* synthetic */ Object a(t7k t7kVar, JSONObject jSONObject) {
        return c(t7kVar, jSONObject);
    }

    @Override // defpackage.gip
    public final /* bridge */ /* synthetic */ JSONObject b(t7k t7kVar, Object obj) {
        return d(t7kVar, (q69) obj);
    }
}
