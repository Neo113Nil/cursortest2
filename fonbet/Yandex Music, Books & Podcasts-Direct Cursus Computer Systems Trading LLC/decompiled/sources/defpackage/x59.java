package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class x59 implements gip, py7 {
    public final t6f a;

    public x59(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.py7
    public final Object a(t7k t7kVar, JSONObject jSONObject) {
        String b0 = etn.b0(jSONObject);
        int hashCode = b0.hashCode();
        t6f t6fVar = this.a;
        if (hashCode != 106642798) {
            if (hashCode != 393594385) {
                if (hashCode == 575402001 && b0.equals("currency")) {
                    ((uu8) t6fVar.H2.getValue()).getClass();
                    return new s59(uu8.c(t7kVar, jSONObject));
                }
            } else if (b0.equals("fixed_length")) {
                return new t59(((az8) t6fVar.z3.getValue()).a(t7kVar, jSONObject));
            }
        } else if (b0.equals("phone")) {
            ((rd9) t6fVar.Z5.getValue()).getClass();
            return new u59(new qd9((String) etn.P("raw_text_variable", jSONObject)));
        }
        d7f t = t7kVar.b().t(b0, jSONObject);
        d69 d69Var = t instanceof d69 ? (d69) t : null;
        if (d69Var != null) {
            return ((z59) t6fVar.G4.getValue()).a(t7kVar, d69Var, jSONObject);
        }
        throw a8k.l(jSONObject, "type", b0);
    }

    @Override // defpackage.gip
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, v59 v59Var) {
        boolean z = v59Var instanceof t59;
        t6f t6fVar = this.a;
        if (z) {
            return ((az8) t6fVar.z3.getValue()).b(t7kVar, ((t59) v59Var).b);
        }
        if (v59Var instanceof s59) {
            uu8 uu8Var = (uu8) t6fVar.H2.getValue();
            tu8 tu8Var = ((s59) v59Var).b;
            uu8Var.getClass();
            return uu8.d(t7kVar, tu8Var);
        }
        if (!(v59Var instanceof u59)) {
            b6e.s();
            return null;
        }
        rd9 rd9Var = (rd9) t6fVar.Z5.getValue();
        qd9 qd9Var = ((u59) v59Var).b;
        rd9Var.getClass();
        return rd9.c(t7kVar, qd9Var);
    }
}
