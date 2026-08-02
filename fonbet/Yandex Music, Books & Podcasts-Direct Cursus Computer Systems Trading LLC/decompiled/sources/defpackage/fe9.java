package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class fe9 implements gip, py7 {
    public final t6f a;

    public fe9(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.py7
    public final Object a(t7k t7kVar, JSONObject jSONObject) {
        Object ne9Var;
        Object obj;
        Object obj2;
        String b0 = etn.b0(jSONObject);
        d7f d7fVar = t7kVar.b().get(b0);
        Object obj3 = null;
        oe9 oe9Var = d7fVar instanceof oe9 ? (oe9) d7fVar : null;
        if (oe9Var != null) {
            if (oe9Var instanceof me9) {
                b0 = "pivot-fixed";
            } else {
                if (!(oe9Var instanceof ne9)) {
                    b6e.s();
                    return null;
                }
                b0 = "pivot-percentage";
            }
        }
        boolean equals = b0.equals("pivot-fixed");
        t6f t6fVar = this.a;
        if (equals) {
            ae9 ae9Var = (ae9) t6fVar.d6.getValue();
            if (oe9Var != null) {
                if (oe9Var instanceof me9) {
                    obj2 = ((me9) oe9Var).a;
                } else {
                    if (!(oe9Var instanceof ne9)) {
                        b6e.s();
                        return null;
                    }
                    obj2 = ((ne9) oe9Var).a;
                }
                obj3 = obj2;
            }
            ae9Var.getClass();
            ne9Var = new me9(ae9.c(t7kVar, (de9) obj3, jSONObject));
            return ne9Var;
        }
        if (!b0.equals("pivot-percentage")) {
            throw a8k.l(jSONObject, "type", b0);
        }
        je9 je9Var = (je9) t6fVar.g6.getValue();
        if (oe9Var != null) {
            if (oe9Var instanceof me9) {
                obj = ((me9) oe9Var).a;
            } else {
                if (!(oe9Var instanceof ne9)) {
                    b6e.s();
                    return null;
                }
                obj = ((ne9) oe9Var).a;
            }
            obj3 = obj;
        }
        je9Var.getClass();
        ne9Var = new ne9(je9.c(t7kVar, (le9) obj3, jSONObject));
        return ne9Var;
    }

    @Override // defpackage.gip
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, oe9 oe9Var) {
        boolean z = oe9Var instanceof me9;
        t6f t6fVar = this.a;
        if (z) {
            ae9 ae9Var = (ae9) t6fVar.d6.getValue();
            de9 de9Var = ((me9) oe9Var).a;
            ae9Var.getClass();
            return ae9.d(t7kVar, de9Var);
        }
        if (!(oe9Var instanceof ne9)) {
            b6e.s();
            return null;
        }
        je9 je9Var = (je9) t6fVar.g6.getValue();
        le9 le9Var = ((ne9) oe9Var).a;
        je9Var.getClass();
        return je9.d(t7kVar, le9Var);
    }
}
