package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class lu8 implements u1f {
    public Integer a;

    public final boolean a(lu8 lu8Var, xzb xzbVar, xzb xzbVar2) {
        Object obj;
        Object obj2;
        if (lu8Var == null) {
            return false;
        }
        if (this instanceof ku8) {
            if (lu8Var instanceof ku8) {
                obj2 = ((ku8) lu8Var).b;
            } else {
                if (!(lu8Var instanceof ju8)) {
                    b6e.s();
                    return false;
                }
                obj2 = ((ju8) lu8Var).b;
            }
            return (obj2 instanceof b49 ? (b49) obj2 : null) != null;
        }
        if (!(this instanceof ju8)) {
            b6e.s();
            return false;
        }
        ju8 ju8Var = (ju8) this;
        if (lu8Var instanceof ku8) {
            obj = ((ku8) lu8Var).b;
        } else {
            if (!(lu8Var instanceof ju8)) {
                b6e.s();
                return false;
            }
            obj = ((ju8) lu8Var).b;
        }
        ty8 ty8Var = obj instanceof ty8 ? (ty8) obj : null;
        return ty8Var != null && ((Number) ju8Var.b.a.a(xzbVar)).longValue() == ((Number) ty8Var.a.a(xzbVar2)).longValue();
    }

    public final int b() {
        int i;
        Integer num = this.a;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = ern.a(getClass()).hashCode();
        if (this instanceof ku8) {
            b49 b49Var = ((ku8) this).b;
            Integer num2 = b49Var.a;
            if (num2 != null) {
                i = num2.intValue();
            } else {
                int hashCode2 = ern.a(b49.class).hashCode();
                b49Var.a = Integer.valueOf(hashCode2);
                i = hashCode2;
            }
        } else {
            if (!(this instanceof ju8)) {
                b6e.s();
                return 0;
            }
            ty8 ty8Var = ((ju8) this).b;
            Integer num3 = ty8Var.b;
            if (num3 != null) {
                i = num3.intValue();
            } else {
                int hashCode3 = ty8Var.a.hashCode() + ern.a(ty8.class).hashCode();
                ty8Var.b = Integer.valueOf(hashCode3);
                i = hashCode3;
            }
        }
        int i2 = hashCode + i;
        this.a = Integer.valueOf(i2);
        return i2;
    }

    @Override // defpackage.u1f
    public final JSONObject r() {
        return ((mu8) rj3.b.E2.getValue()).b(rj3.a, this);
    }
}
