package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class y59 implements gip, py7 {
    public final t6f a;

    public y59(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.py7
    public final Object a(t7k t7kVar, JSONObject jSONObject) {
        Object c69Var;
        String b0 = etn.b0(jSONObject);
        d7f d7fVar = t7kVar.b().get(b0);
        d69 d69Var = d7fVar instanceof d69 ? (d69) d7fVar : null;
        if (d69Var != null) {
            if (d69Var instanceof b69) {
                b0 = "fixed_length";
            } else if (d69Var instanceof a69) {
                b0 = "currency";
            } else {
                if (!(d69Var instanceof c69)) {
                    b6e.s();
                    return null;
                }
                b0 = "phone";
            }
        }
        int hashCode = b0.hashCode();
        t6f t6fVar = this.a;
        if (hashCode == 106642798) {
            if (b0.equals("phone")) {
                sd9 sd9Var = (sd9) t6fVar.a6.getValue();
                ud9 ud9Var = (ud9) (d69Var != null ? d69Var.a() : null);
                sd9Var.getClass();
                c69Var = new c69(new ud9(y2x.G(y1g.Y(t7kVar), jSONObject, "raw_text_variable", t7kVar.d(), ud9Var != null ? ud9Var.a : null)));
                return c69Var;
            }
            throw a8k.l(jSONObject, "type", b0);
        }
        if (hashCode == 393594385) {
            if (b0.equals("fixed_length")) {
                c69Var = new b69(((bz8) t6fVar.A3.getValue()).c(t7kVar, (iz8) (d69Var != null ? d69Var.a() : null), jSONObject));
                return c69Var;
            }
            throw a8k.l(jSONObject, "type", b0);
        }
        if (hashCode == 575402001 && b0.equals("currency")) {
            vu8 vu8Var = (vu8) t6fVar.I2.getValue();
            Object a = d69Var != null ? d69Var.a() : null;
            vu8Var.getClass();
            c69Var = new a69(vu8.c(t7kVar, (xu8) a, jSONObject));
            return c69Var;
        }
        throw a8k.l(jSONObject, "type", b0);
    }

    @Override // defpackage.gip
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, d69 d69Var) {
        boolean z = d69Var instanceof b69;
        t6f t6fVar = this.a;
        if (z) {
            return ((bz8) t6fVar.A3.getValue()).b(t7kVar, ((b69) d69Var).a);
        }
        if (d69Var instanceof a69) {
            vu8 vu8Var = (vu8) t6fVar.I2.getValue();
            xu8 xu8Var = ((a69) d69Var).a;
            vu8Var.getClass();
            return vu8.d(t7kVar, xu8Var);
        }
        if (!(d69Var instanceof c69)) {
            b6e.s();
            return null;
        }
        sd9 sd9Var = (sd9) t6fVar.a6.getValue();
        ud9 ud9Var = ((c69) d69Var).a;
        sd9Var.getClass();
        return sd9.c(t7kVar, ud9Var);
    }
}
