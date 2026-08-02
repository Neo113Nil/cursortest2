package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class gn8 implements gip, py7 {
    public final t6f a;

    public gn8(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.py7
    public final Object a(t7k t7kVar, JSONObject jSONObject) {
        Object jn8Var;
        Object obj;
        Object obj2;
        String b0 = etn.b0(jSONObject);
        d7f d7fVar = t7kVar.b().get(b0);
        Object obj3 = null;
        kn8 kn8Var = d7fVar instanceof kn8 ? (kn8) d7fVar : null;
        if (kn8Var != null) {
            if (kn8Var instanceof in8) {
                b0 = "color_animator";
            } else {
                if (!(kn8Var instanceof jn8)) {
                    b6e.s();
                    return null;
                }
                b0 = "number_animator";
            }
        }
        boolean equals = b0.equals("color_animator");
        t6f t6fVar = this.a;
        if (equals) {
            as8 as8Var = (as8) t6fVar.t2.getValue();
            if (kn8Var != null) {
                if (kn8Var instanceof in8) {
                    obj2 = ((in8) kn8Var).a;
                } else {
                    if (!(kn8Var instanceof jn8)) {
                        b6e.s();
                        return null;
                    }
                    obj2 = ((jn8) kn8Var).a;
                }
                obj3 = obj2;
            }
            jn8Var = new in8(as8Var.c(t7kVar, (ds8) obj3, jSONObject));
            return jn8Var;
        }
        if (!b0.equals("number_animator")) {
            throw a8k.l(jSONObject, "type", b0);
        }
        s99 s99Var = (s99) t6fVar.r5.getValue();
        if (kn8Var != null) {
            if (kn8Var instanceof in8) {
                obj = ((in8) kn8Var).a;
            } else {
                if (!(kn8Var instanceof jn8)) {
                    b6e.s();
                    return null;
                }
                obj = ((jn8) kn8Var).a;
            }
            obj3 = obj;
        }
        jn8Var = new jn8(s99Var.c(t7kVar, (v99) obj3, jSONObject));
        return jn8Var;
    }

    @Override // defpackage.gip
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, kn8 kn8Var) {
        boolean z = kn8Var instanceof in8;
        t6f t6fVar = this.a;
        if (z) {
            return ((as8) t6fVar.t2.getValue()).b(t7kVar, ((in8) kn8Var).a);
        }
        if (kn8Var instanceof jn8) {
            return ((s99) t6fVar.r5.getValue()).b(t7kVar, ((jn8) kn8Var).a);
        }
        b6e.s();
        return null;
    }
}
