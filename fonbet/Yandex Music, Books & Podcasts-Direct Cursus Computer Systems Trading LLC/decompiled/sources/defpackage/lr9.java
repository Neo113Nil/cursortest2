package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class lr9 implements gip, py7 {
    public final t6f a;

    public lr9(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.py7
    public final Object a(t7k t7kVar, JSONObject jSONObject) {
        Object or9Var;
        Object obj;
        Object obj2;
        String b0 = etn.b0(jSONObject);
        d7f d7fVar = t7kVar.b().get(b0);
        Object obj3 = null;
        pr9 pr9Var = d7fVar instanceof pr9 ? (pr9) d7fVar : null;
        if (pr9Var != null) {
            if (pr9Var instanceof nr9) {
                b0 = "gradient";
            } else {
                if (!(pr9Var instanceof or9)) {
                    b6e.s();
                    return null;
                }
                b0 = "radial_gradient";
            }
        }
        boolean equals = b0.equals("gradient");
        t6f t6fVar = this.a;
        if (equals) {
            k89 k89Var = (k89) t6fVar.c5.getValue();
            if (pr9Var != null) {
                if (pr9Var instanceof nr9) {
                    obj2 = ((nr9) pr9Var).a;
                } else {
                    if (!(pr9Var instanceof or9)) {
                        b6e.s();
                        return null;
                    }
                    obj2 = ((or9) pr9Var).a;
                }
                obj3 = obj2;
            }
            or9Var = new nr9(k89Var.c(t7kVar, (o89) obj3, jSONObject));
            return or9Var;
        }
        if (!b0.equals("radial_gradient")) {
            throw a8k.l(jSONObject, "type", b0);
        }
        hg9 hg9Var = (hg9) t6fVar.E6.getValue();
        if (pr9Var != null) {
            if (pr9Var instanceof nr9) {
                obj = ((nr9) pr9Var).a;
            } else {
                if (!(pr9Var instanceof or9)) {
                    b6e.s();
                    return null;
                }
                obj = ((or9) pr9Var).a;
            }
            obj3 = obj;
        }
        or9Var = new or9(hg9Var.c(t7kVar, (gh9) obj3, jSONObject));
        return or9Var;
    }

    @Override // defpackage.gip
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, pr9 pr9Var) {
        boolean z = pr9Var instanceof nr9;
        t6f t6fVar = this.a;
        if (z) {
            return ((k89) t6fVar.c5.getValue()).b(t7kVar, ((nr9) pr9Var).a);
        }
        if (pr9Var instanceof or9) {
            return ((hg9) t6fVar.E6.getValue()).b(t7kVar, ((or9) pr9Var).a);
        }
        b6e.s();
        return null;
    }
}
