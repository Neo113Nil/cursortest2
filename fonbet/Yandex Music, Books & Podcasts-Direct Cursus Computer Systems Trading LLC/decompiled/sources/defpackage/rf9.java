package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class rf9 implements u1f {
    public Integer a;

    public final boolean a(rf9 rf9Var, xzb xzbVar, xzb xzbVar2) {
        Object obj;
        Object obj2;
        if (rf9Var == null) {
            return false;
        }
        if (this instanceof pf9) {
            pf9 pf9Var = (pf9) this;
            if (rf9Var instanceof pf9) {
                obj2 = ((pf9) rf9Var).b;
            } else {
                if (!(rf9Var instanceof qf9)) {
                    b6e.s();
                    return false;
                }
                obj2 = ((qf9) rf9Var).b;
            }
            ag9 ag9Var = obj2 instanceof ag9 ? (ag9) obj2 : null;
            if (ag9Var == null) {
                return false;
            }
            ag9 ag9Var2 = pf9Var.b;
            return ag9Var2.a.a(xzbVar) == ag9Var.a.a(xzbVar2) && ((Number) ag9Var2.b.a(xzbVar)).longValue() == ((Number) ag9Var.b.a(xzbVar2)).longValue();
        }
        if (!(this instanceof qf9)) {
            b6e.s();
            return false;
        }
        qf9 qf9Var = (qf9) this;
        if (rf9Var instanceof pf9) {
            obj = ((pf9) rf9Var).b;
        } else {
            if (!(rf9Var instanceof qf9)) {
                b6e.s();
                return false;
            }
            obj = ((qf9) rf9Var).b;
        }
        tg9 tg9Var = obj instanceof tg9 ? (tg9) obj : null;
        return tg9Var != null && ((Number) qf9Var.b.a.a(xzbVar)).doubleValue() == ((Number) tg9Var.a.a(xzbVar2)).doubleValue();
    }

    public final int b() {
        int i;
        Integer num = this.a;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = ern.a(getClass()).hashCode();
        if (this instanceof pf9) {
            ag9 ag9Var = ((pf9) this).b;
            Integer num2 = ag9Var.c;
            if (num2 != null) {
                i = num2.intValue();
            } else {
                int hashCode2 = ag9Var.b.hashCode() + ag9Var.a.hashCode() + ern.a(ag9.class).hashCode();
                ag9Var.c = Integer.valueOf(hashCode2);
                i = hashCode2;
            }
        } else {
            if (!(this instanceof qf9)) {
                b6e.s();
                return 0;
            }
            tg9 tg9Var = ((qf9) this).b;
            Integer num3 = tg9Var.b;
            if (num3 != null) {
                i = num3.intValue();
            } else {
                int hashCode3 = tg9Var.a.hashCode() + ern.a(tg9.class).hashCode();
                tg9Var.b = Integer.valueOf(hashCode3);
                i = hashCode3;
            }
        }
        int i2 = hashCode + i;
        this.a = Integer.valueOf(i2);
        return i2;
    }

    @Override // defpackage.u1f
    public final JSONObject r() {
        return ((sf9) rj3.b.o6.getValue()).b(rj3.a, this);
    }
}
