package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class a79 implements gip, py7 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v1, types: [szb] */
    public static z69 c(t7k t7kVar, JSONObject jSONObject) {
        ox8 ox8Var = vct.a;
        kzj kzjVar = kzj.B;
        ozb ozbVar = d79.a;
        ns9 ns9Var = bcx.h;
        ?? e = e5f.e(t7kVar, jSONObject, "allow_empty", ox8Var, kzjVar, ns9Var, ozbVar);
        if (e != 0) {
            ozbVar = e;
        }
        ox8 ox8Var2 = vct.c;
        s3f s3fVar = bcx.i;
        szb b = e5f.b(t7kVar, jSONObject, "label_id", ox8Var2, s3fVar, ns9Var);
        szb b2 = e5f.b(t7kVar, jSONObject, "pattern", ox8Var2, s3fVar, ns9Var);
        Object opt = jSONObject.opt("variable");
        if (opt == JSONObject.NULL) {
            opt = null;
        }
        if (opt != null) {
            return new z69(ozbVar, b, b2, (String) opt);
        }
        throw a8k.g("variable", jSONObject);
    }

    public static JSONObject d(t7k t7kVar, z69 z69Var) {
        JSONObject jSONObject = new JSONObject();
        e5f.g(t7kVar, jSONObject, "allow_empty", z69Var.a);
        e5f.g(t7kVar, jSONObject, "label_id", z69Var.b);
        e5f.g(t7kVar, jSONObject, "pattern", z69Var.c);
        etn.l0(t7kVar, jSONObject, "type", "regex");
        etn.l0(t7kVar, jSONObject, "variable", z69Var.d);
        return jSONObject;
    }

    @Override // defpackage.py7
    public final /* bridge */ /* synthetic */ Object a(t7k t7kVar, JSONObject jSONObject) {
        return c(t7kVar, jSONObject);
    }

    @Override // defpackage.gip
    public final /* bridge */ /* synthetic */ JSONObject b(t7k t7kVar, Object obj) {
        return d(t7kVar, (z69) obj);
    }
}
