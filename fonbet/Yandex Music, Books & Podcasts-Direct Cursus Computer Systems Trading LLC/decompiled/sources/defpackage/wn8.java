package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class wn8 implements gip, py7 {
    public final t6f a;

    public wn8(t6f t6fVar) {
        this.a = t6fVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.py7
    public final Object a(t7k t7kVar, JSONObject jSONObject) {
        Object ao8Var;
        Object a;
        String b0 = etn.b0(jSONObject);
        d7f d7fVar = t7kVar.b().get(b0);
        co8 co8Var = d7fVar instanceof co8 ? (co8) d7fVar : null;
        if (co8Var != null) {
            if (co8Var instanceof ao8) {
                b0 = "set";
            } else if (co8Var instanceof yn8) {
                b0 = "fade";
            } else if (co8Var instanceof zn8) {
                b0 = "scale";
            } else {
                if (!(co8Var instanceof bo8)) {
                    b6e.s();
                    return null;
                }
                b0 = "slide";
            }
        }
        int hashCode = b0.hashCode();
        t6f t6fVar = this.a;
        switch (hashCode) {
            case 113762:
                if (b0.equals("set")) {
                    ao8Var = new ao8(((nn8) t6fVar.G1.getValue()).c(t7kVar, (pn8) (co8Var != null ? co8Var.a() : null), jSONObject));
                    return ao8Var;
                }
                throw a8k.l(jSONObject, "type", b0);
            case 3135100:
                if (b0.equals("fade")) {
                    by8 by8Var = (by8) t6fVar.o3.getValue();
                    a = co8Var != null ? co8Var.a() : null;
                    by8Var.getClass();
                    ao8Var = new yn8(by8.c(t7kVar, (ey8) a, jSONObject));
                    return ao8Var;
                }
                throw a8k.l(jSONObject, "type", b0);
            case 109250890:
                if (b0.equals("scale")) {
                    zh9 zh9Var = (zh9) t6fVar.Q6.getValue();
                    a = co8Var != null ? co8Var.a() : null;
                    zh9Var.getClass();
                    ao8Var = new zn8(zh9.c(t7kVar, (ci9) a, jSONObject));
                    return ao8Var;
                }
                throw a8k.l(jSONObject, "type", b0);
            case 109526449:
                if (b0.equals("slide")) {
                    ao8Var = new bo8(((tk9) t6fVar.u7.getValue()).c(t7kVar, (wk9) (co8Var != null ? co8Var.a() : null), jSONObject));
                    return ao8Var;
                }
                throw a8k.l(jSONObject, "type", b0);
            default:
                throw a8k.l(jSONObject, "type", b0);
        }
    }

    @Override // defpackage.gip
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, co8 co8Var) {
        boolean z = co8Var instanceof ao8;
        t6f t6fVar = this.a;
        if (z) {
            return ((nn8) t6fVar.G1.getValue()).b(t7kVar, ((ao8) co8Var).a);
        }
        if (co8Var instanceof yn8) {
            by8 by8Var = (by8) t6fVar.o3.getValue();
            ey8 ey8Var = ((yn8) co8Var).a;
            by8Var.getClass();
            return by8.d(t7kVar, ey8Var);
        }
        if (co8Var instanceof zn8) {
            zh9 zh9Var = (zh9) t6fVar.Q6.getValue();
            ci9 ci9Var = ((zn8) co8Var).a;
            zh9Var.getClass();
            return zh9.d(t7kVar, ci9Var);
        }
        if (co8Var instanceof bo8) {
            return ((tk9) t6fVar.u7.getValue()).b(t7kVar, ((bo8) co8Var).a);
        }
        b6e.s();
        return null;
    }
}
