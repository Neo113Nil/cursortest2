package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class la9 implements gip, py7 {
    public final t6f a;

    public la9(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.py7
    public final Object a(t7k t7kVar, JSONObject jSONObject) {
        Object za9Var;
        Object obj;
        Object obj2;
        String b0 = etn.b0(jSONObject);
        d7f d7fVar = t7kVar.b().get(b0);
        Object obj3 = null;
        bb9 bb9Var = d7fVar instanceof bb9 ? (bb9) d7fVar : null;
        if (bb9Var != null) {
            if (bb9Var instanceof ab9) {
                b0 = "slide";
            } else {
                if (!(bb9Var instanceof za9)) {
                    b6e.s();
                    return null;
                }
                b0 = "overlap";
            }
        }
        boolean equals = b0.equals("slide");
        t6f t6fVar = this.a;
        if (equals) {
            va9 va9Var = (va9) t6fVar.D5.getValue();
            if (bb9Var != null) {
                if (bb9Var instanceof ab9) {
                    obj2 = ((ab9) bb9Var).a;
                } else {
                    if (!(bb9Var instanceof za9)) {
                        b6e.s();
                        return null;
                    }
                    obj2 = ((za9) bb9Var).a;
                }
                obj3 = obj2;
            }
            va9Var.getClass();
            za9Var = new ab9(va9.c(t7kVar, (ya9) obj3, jSONObject));
            return za9Var;
        }
        if (!b0.equals("overlap")) {
            throw a8k.l(jSONObject, "type", b0);
        }
        pa9 pa9Var = (pa9) t6fVar.A5.getValue();
        if (bb9Var != null) {
            if (bb9Var instanceof ab9) {
                obj = ((ab9) bb9Var).a;
            } else {
                if (!(bb9Var instanceof za9)) {
                    b6e.s();
                    return null;
                }
                obj = ((za9) bb9Var).a;
            }
            obj3 = obj;
        }
        pa9Var.getClass();
        za9Var = new za9(pa9.c(t7kVar, (sa9) obj3, jSONObject));
        return za9Var;
    }

    @Override // defpackage.gip
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, bb9 bb9Var) {
        boolean z = bb9Var instanceof ab9;
        t6f t6fVar = this.a;
        if (z) {
            va9 va9Var = (va9) t6fVar.D5.getValue();
            ya9 ya9Var = ((ab9) bb9Var).a;
            va9Var.getClass();
            return va9.d(t7kVar, ya9Var);
        }
        if (!(bb9Var instanceof za9)) {
            b6e.s();
            return null;
        }
        pa9 pa9Var = (pa9) t6fVar.A5.getValue();
        sa9 sa9Var = ((za9) bb9Var).a;
        pa9Var.getClass();
        return pa9.d(t7kVar, sa9Var);
    }
}
