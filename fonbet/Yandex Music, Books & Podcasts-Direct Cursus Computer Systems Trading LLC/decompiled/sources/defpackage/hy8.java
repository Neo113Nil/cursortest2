package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class hy8 implements u1f {
    public Integer a;

    public final boolean a(hy8 hy8Var, xzb xzbVar, xzb xzbVar2) {
        Object obj;
        Object obj2;
        if (hy8Var == null) {
            return false;
        }
        if (this instanceof fy8) {
            fy8 fy8Var = (fy8) this;
            if (hy8Var instanceof fy8) {
                obj2 = ((fy8) hy8Var).b;
            } else {
                if (!(hy8Var instanceof gy8)) {
                    b6e.s();
                    return false;
                }
                obj2 = ((gy8) hy8Var).b;
            }
            jp8 jp8Var = obj2 instanceof jp8 ? (jp8) obj2 : null;
            return jp8Var != null && ((Number) fy8Var.b.a.a(xzbVar)).longValue() == ((Number) jp8Var.a.a(xzbVar2)).longValue();
        }
        if (!(this instanceof gy8)) {
            b6e.s();
            return false;
        }
        if (hy8Var instanceof fy8) {
            obj = ((fy8) hy8Var).b;
        } else {
            if (!(hy8Var instanceof gy8)) {
                b6e.s();
                return false;
            }
            obj = ((gy8) hy8Var).b;
        }
        return (obj instanceof ly8 ? (ly8) obj : null) != null;
    }

    public final int b() {
        int hashCode;
        int intValue;
        Integer num = this.a;
        if (num != null) {
            return num.intValue();
        }
        int hashCode2 = ern.a(getClass()).hashCode();
        if (this instanceof fy8) {
            jp8 jp8Var = ((fy8) this).b;
            Integer num2 = jp8Var.b;
            if (num2 != null) {
                intValue = num2.intValue();
            } else {
                hashCode = ern.a(jp8.class).hashCode() + jp8Var.a.hashCode();
                jp8Var.b = Integer.valueOf(hashCode);
                intValue = hashCode;
            }
        } else {
            if (!(this instanceof gy8)) {
                b6e.s();
                return 0;
            }
            ly8 ly8Var = ((gy8) this).b;
            Integer num3 = ly8Var.a;
            if (num3 != null) {
                intValue = num3.intValue();
            } else {
                hashCode = ern.a(ly8.class).hashCode();
                ly8Var.a = Integer.valueOf(hashCode);
                intValue = hashCode;
            }
        }
        int i = hashCode2 + intValue;
        this.a = Integer.valueOf(i);
        return i;
    }

    @Override // defpackage.u1f
    public final JSONObject r() {
        return ((iy8) rj3.b.t3.getValue()).b(rj3.a, this);
    }
}
