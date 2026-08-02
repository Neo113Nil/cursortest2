package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class x69 implements gip, py7 {
    public final t6f a;

    public x69(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.py7
    public final Object a(t7k t7kVar, JSONObject jSONObject) {
        Object f79Var;
        Object obj;
        Object obj2;
        String b0 = etn.b0(jSONObject);
        d7f d7fVar = t7kVar.b().get(b0);
        Object obj3 = null;
        h79 h79Var = d7fVar instanceof h79 ? (h79) d7fVar : null;
        if (h79Var != null) {
            if (h79Var instanceof g79) {
                b0 = "regex";
            } else {
                if (!(h79Var instanceof f79)) {
                    b6e.s();
                    return null;
                }
                b0 = "expression";
            }
        }
        boolean equals = b0.equals("regex");
        t6f t6fVar = this.a;
        if (equals) {
            b79 b79Var = (b79) t6fVar.N4.getValue();
            if (h79Var != null) {
                if (h79Var instanceof g79) {
                    obj2 = ((g79) h79Var).a;
                } else {
                    if (!(h79Var instanceof f79)) {
                        b6e.s();
                        return null;
                    }
                    obj2 = ((f79) h79Var).a;
                }
                obj3 = obj2;
            }
            b79Var.getClass();
            f79Var = new g79(b79.c(t7kVar, (e79) obj3, jSONObject));
            return f79Var;
        }
        if (!b0.equals("expression")) {
            throw a8k.l(jSONObject, "type", b0);
        }
        s69 s69Var = (s69) t6fVar.K4.getValue();
        if (h79Var != null) {
            if (h79Var instanceof g79) {
                obj = ((g79) h79Var).a;
            } else {
                if (!(h79Var instanceof f79)) {
                    b6e.s();
                    return null;
                }
                obj = ((f79) h79Var).a;
            }
            obj3 = obj;
        }
        s69Var.getClass();
        f79Var = new f79(s69.c(t7kVar, (v69) obj3, jSONObject));
        return f79Var;
    }

    @Override // defpackage.gip
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, h79 h79Var) {
        boolean z = h79Var instanceof g79;
        t6f t6fVar = this.a;
        if (z) {
            b79 b79Var = (b79) t6fVar.N4.getValue();
            e79 e79Var = ((g79) h79Var).a;
            b79Var.getClass();
            return b79.d(t7kVar, e79Var);
        }
        if (!(h79Var instanceof f79)) {
            b6e.s();
            return null;
        }
        s69 s69Var = (s69) t6fVar.K4.getValue();
        v69 v69Var = ((f79) h79Var).a;
        s69Var.getClass();
        return s69.d(t7kVar, v69Var);
    }
}
