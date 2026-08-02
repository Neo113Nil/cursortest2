package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class dk9 implements gip, py7 {
    public final t6f a;

    public dk9(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.py7
    public final Object a(t7k t7kVar, JSONObject jSONObject) {
        Object fk9Var;
        String b0 = etn.b0(jSONObject);
        d7f d7fVar = t7kVar.b().get(b0);
        ik9 ik9Var = d7fVar instanceof ik9 ? (ik9) d7fVar : null;
        if (ik9Var != null) {
            if (ik9Var instanceof fk9) {
                b0 = "fixed";
            } else if (ik9Var instanceof gk9) {
                b0 = "match_parent";
            } else {
                if (!(ik9Var instanceof hk9)) {
                    b6e.s();
                    return null;
                }
                b0 = "wrap_content";
            }
        }
        int hashCode = b0.hashCode();
        t6f t6fVar = this.a;
        if (hashCode == 97445748) {
            if (b0.equals("fixed")) {
                lz8 lz8Var = (lz8) t6fVar.G3.getValue();
                Object a = ik9Var != null ? ik9Var.a() : null;
                lz8Var.getClass();
                fk9Var = new fk9(lz8.c(t7kVar, (oz8) a, jSONObject));
                return fk9Var;
            }
            throw a8k.l(jSONObject, "type", b0);
        }
        if (hashCode == 343327108) {
            if (b0.equals("wrap_content")) {
                fk9Var = new hk9(((z1a) t6fVar.Y9.getValue()).c(t7kVar, (b2a) (ik9Var != null ? ik9Var.a() : null), jSONObject));
                return fk9Var;
            }
            throw a8k.l(jSONObject, "type", b0);
        }
        if (hashCode == 1386124388 && b0.equals("match_parent")) {
            fk9Var = new gk9(((c99) t6fVar.i5.getValue()).c(t7kVar, (e99) (ik9Var != null ? ik9Var.a() : null), jSONObject));
            return fk9Var;
        }
        throw a8k.l(jSONObject, "type", b0);
    }

    @Override // defpackage.gip
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, ik9 ik9Var) {
        boolean z = ik9Var instanceof fk9;
        t6f t6fVar = this.a;
        if (z) {
            lz8 lz8Var = (lz8) t6fVar.G3.getValue();
            oz8 oz8Var = ((fk9) ik9Var).a;
            lz8Var.getClass();
            return lz8.d(t7kVar, oz8Var);
        }
        if (ik9Var instanceof gk9) {
            return ((c99) t6fVar.i5.getValue()).b(t7kVar, ((gk9) ik9Var).a);
        }
        if (ik9Var instanceof hk9) {
            return ((z1a) t6fVar.Y9.getValue()).b(t7kVar, ((hk9) ik9Var).a);
        }
        b6e.s();
        return null;
    }
}
