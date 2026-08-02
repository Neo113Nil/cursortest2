package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class qw9 implements u1f {
    public Integer a;

    public final boolean a(qw9 qw9Var, xzb xzbVar, xzb xzbVar2) {
        Object obj;
        Object obj2;
        if (qw9Var == null) {
            return false;
        }
        if (this instanceof ow9) {
            ow9 ow9Var = (ow9) this;
            if (qw9Var instanceof ow9) {
                obj2 = ((ow9) qw9Var).b;
            } else {
                if (!(qw9Var instanceof pw9)) {
                    b6e.s();
                    return false;
                }
                obj2 = ((pw9) qw9Var).b;
            }
            pz8 pz8Var = obj2 instanceof pz8 ? (pz8) obj2 : null;
            if (pz8Var == null) {
                return false;
            }
            pz8 pz8Var2 = ow9Var.b;
            return pz8Var2.a.a(xzbVar) == pz8Var.a.a(xzbVar2) && ((Number) pz8Var2.b.a(xzbVar)).longValue() == ((Number) pz8Var.b.a(xzbVar2)).longValue();
        }
        if (!(this instanceof pw9)) {
            b6e.s();
            return false;
        }
        pw9 pw9Var = (pw9) this;
        if (qw9Var instanceof ow9) {
            obj = ((ow9) qw9Var).b;
        } else {
            if (!(qw9Var instanceof pw9)) {
                b6e.s();
                return false;
            }
            obj = ((pw9) qw9Var).b;
        }
        ld9 ld9Var = obj instanceof ld9 ? (ld9) obj : null;
        return ld9Var != null && ((Number) pw9Var.b.a.a(xzbVar)).doubleValue() == ((Number) ld9Var.a.a(xzbVar2)).doubleValue();
    }

    public final int b() {
        int i;
        Integer num = this.a;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = ern.a(getClass()).hashCode();
        if (this instanceof ow9) {
            pz8 pz8Var = ((ow9) this).b;
            Integer num2 = pz8Var.c;
            if (num2 != null) {
                i = num2.intValue();
            } else {
                int hashCode2 = pz8Var.b.hashCode() + pz8Var.a.hashCode() + ern.a(pz8.class).hashCode();
                pz8Var.c = Integer.valueOf(hashCode2);
                i = hashCode2;
            }
        } else {
            if (!(this instanceof pw9)) {
                b6e.s();
                return 0;
            }
            ld9 ld9Var = ((pw9) this).b;
            Integer num3 = ld9Var.b;
            if (num3 != null) {
                i = num3.intValue();
            } else {
                int hashCode3 = ld9Var.a.hashCode() + ern.a(ld9.class).hashCode();
                ld9Var.b = Integer.valueOf(hashCode3);
                i = hashCode3;
            }
        }
        int i2 = hashCode + i;
        this.a = Integer.valueOf(i2);
        return i2;
    }

    @Override // defpackage.u1f
    public final JSONObject r() {
        return ((rw9) rj3.b.z9.getValue()).b(rj3.a, this);
    }
}
