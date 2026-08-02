package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class rj9 implements gip, py7 {
    public final t6f a;

    public rj9(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.py7
    public final Object a(t7k t7kVar, JSONObject jSONObject) {
        Object tj9Var;
        Object obj;
        Object obj2;
        String b0 = etn.b0(jSONObject);
        d7f d7fVar = t7kVar.b().get(b0);
        Object obj3 = null;
        vj9 vj9Var = d7fVar instanceof vj9 ? (vj9) d7fVar : null;
        if (vj9Var != null) {
            if (vj9Var instanceof uj9) {
                b0 = "rounded_rectangle";
            } else {
                if (!(vj9Var instanceof tj9)) {
                    b6e.s();
                    return null;
                }
                b0 = "circle";
            }
        }
        boolean equals = b0.equals("rounded_rectangle");
        t6f t6fVar = this.a;
        if (equals) {
            sh9 sh9Var = (sh9) t6fVar.N6.getValue();
            if (vj9Var != null) {
                if (vj9Var instanceof uj9) {
                    obj2 = ((uj9) vj9Var).a;
                } else {
                    if (!(vj9Var instanceof tj9)) {
                        b6e.s();
                        return null;
                    }
                    obj2 = ((tj9) vj9Var).a;
                }
                obj3 = obj2;
            }
            tj9Var = new uj9(sh9Var.c(t7kVar, (vh9) obj3, jSONObject));
            return tj9Var;
        }
        if (!b0.equals("circle")) {
            throw a8k.l(jSONObject, "type", b0);
        }
        br8 br8Var = (br8) t6fVar.h2.getValue();
        if (vj9Var != null) {
            if (vj9Var instanceof uj9) {
                obj = ((uj9) vj9Var).a;
            } else {
                if (!(vj9Var instanceof tj9)) {
                    b6e.s();
                    return null;
                }
                obj = ((tj9) vj9Var).a;
            }
            obj3 = obj;
        }
        tj9Var = new tj9(br8Var.c(t7kVar, (er8) obj3, jSONObject));
        return tj9Var;
    }

    @Override // defpackage.gip
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, vj9 vj9Var) {
        boolean z = vj9Var instanceof uj9;
        t6f t6fVar = this.a;
        if (z) {
            return ((sh9) t6fVar.N6.getValue()).b(t7kVar, ((uj9) vj9Var).a);
        }
        if (vj9Var instanceof tj9) {
            return ((br8) t6fVar.h2.getValue()).b(t7kVar, ((tj9) vj9Var).a);
        }
        b6e.s();
        return null;
    }
}
