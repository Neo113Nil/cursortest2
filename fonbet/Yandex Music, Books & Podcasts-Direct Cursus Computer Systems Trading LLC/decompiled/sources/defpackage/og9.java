package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class og9 implements gip, py7 {
    public final t6f a;

    public og9(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.py7
    public final Object a(t7k t7kVar, JSONObject jSONObject) {
        Object rg9Var;
        Object obj;
        Object obj2;
        String b0 = etn.b0(jSONObject);
        d7f d7fVar = t7kVar.b().get(b0);
        Object obj3 = null;
        sg9 sg9Var = d7fVar instanceof sg9 ? (sg9) d7fVar : null;
        if (sg9Var != null) {
            if (sg9Var instanceof qg9) {
                b0 = "fixed";
            } else {
                if (!(sg9Var instanceof rg9)) {
                    b6e.s();
                    return null;
                }
                b0 = "relative";
            }
        }
        boolean equals = b0.equals("fixed");
        t6f t6fVar = this.a;
        if (equals) {
            lz8 lz8Var = (lz8) t6fVar.G3.getValue();
            if (sg9Var != null) {
                if (sg9Var instanceof qg9) {
                    obj2 = ((qg9) sg9Var).a;
                } else {
                    if (!(sg9Var instanceof rg9)) {
                        b6e.s();
                        return null;
                    }
                    obj2 = ((rg9) sg9Var).a;
                }
                obj3 = obj2;
            }
            lz8Var.getClass();
            rg9Var = new qg9(lz8.c(t7kVar, (oz8) obj3, jSONObject));
            return rg9Var;
        }
        if (!b0.equals("relative")) {
            throw a8k.l(jSONObject, "type", b0);
        }
        bh9 bh9Var = (bh9) t6fVar.B6.getValue();
        if (sg9Var != null) {
            if (sg9Var instanceof qg9) {
                obj = ((qg9) sg9Var).a;
            } else {
                if (!(sg9Var instanceof rg9)) {
                    b6e.s();
                    return null;
                }
                obj = ((rg9) sg9Var).a;
            }
            obj3 = obj;
        }
        bh9Var.getClass();
        rg9Var = new rg9(bh9.c(t7kVar, (eh9) obj3, jSONObject));
        return rg9Var;
    }

    @Override // defpackage.gip
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, sg9 sg9Var) {
        boolean z = sg9Var instanceof qg9;
        t6f t6fVar = this.a;
        if (z) {
            lz8 lz8Var = (lz8) t6fVar.G3.getValue();
            oz8 oz8Var = ((qg9) sg9Var).a;
            lz8Var.getClass();
            return lz8.d(t7kVar, oz8Var);
        }
        if (!(sg9Var instanceof rg9)) {
            b6e.s();
            return null;
        }
        bh9 bh9Var = (bh9) t6fVar.B6.getValue();
        eh9 eh9Var = ((rg9) sg9Var).a;
        bh9Var.getClass();
        return bh9.d(t7kVar, eh9Var);
    }
}
