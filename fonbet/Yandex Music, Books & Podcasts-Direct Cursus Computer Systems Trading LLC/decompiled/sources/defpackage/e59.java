package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class e59 implements gip, py7 {
    public final t6f a;

    public e59(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.py7
    public final Object a(t7k t7kVar, JSONObject jSONObject) {
        Object l59Var;
        d7f d7fVar;
        d7f d7fVar2;
        String b0 = etn.b0(jSONObject);
        d7f d7fVar3 = t7kVar.b().get(b0);
        d7f d7fVar4 = null;
        n59 n59Var = d7fVar3 instanceof n59 ? (n59) d7fVar3 : null;
        if (n59Var != null) {
            if (n59Var instanceof m59) {
                b0 = "regex";
            } else {
                if (!(n59Var instanceof l59)) {
                    b6e.s();
                    return null;
                }
                b0 = "expression";
            }
        }
        boolean equals = b0.equals("regex");
        t6f t6fVar = this.a;
        if (equals) {
            i59 i59Var = (i59) t6fVar.z4.getValue();
            if (n59Var == null) {
                d7fVar2 = null;
            } else if (n59Var instanceof m59) {
                d7fVar2 = ((m59) n59Var).a;
            } else {
                if (!(n59Var instanceof l59)) {
                    b6e.s();
                    return null;
                }
                d7fVar2 = ((l59) n59Var).a;
            }
            k59 k59Var = (k59) d7fVar2;
            i59Var.getClass();
            l59Var = new m59(new k59(y2x.J(y1g.Y(t7kVar), jSONObject, "pattern", vct.c, t7kVar.d(), k59Var != null ? k59Var.a : null)));
            return l59Var;
        }
        if (!b0.equals("expression")) {
            throw a8k.l(jSONObject, "type", b0);
        }
        a59 a59Var = (a59) t6fVar.w4.getValue();
        if (n59Var != null) {
            if (n59Var instanceof m59) {
                d7fVar = ((m59) n59Var).a;
            } else {
                if (!(n59Var instanceof l59)) {
                    b6e.s();
                    return null;
                }
                d7fVar = ((l59) n59Var).a;
            }
            d7fVar4 = d7fVar;
        }
        a59Var.getClass();
        l59Var = new l59(a59.c(t7kVar, (c59) d7fVar4, jSONObject));
        return l59Var;
    }

    @Override // defpackage.gip
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, n59 n59Var) {
        boolean z = n59Var instanceof m59;
        t6f t6fVar = this.a;
        if (z) {
            i59 i59Var = (i59) t6fVar.z4.getValue();
            k59 k59Var = ((m59) n59Var).a;
            i59Var.getClass();
            return i59.c(t7kVar, k59Var);
        }
        if (!(n59Var instanceof l59)) {
            b6e.s();
            return null;
        }
        a59 a59Var = (a59) t6fVar.w4.getValue();
        c59 c59Var = ((l59) n59Var).a;
        a59Var.getClass();
        return a59.d(t7kVar, c59Var);
    }
}
