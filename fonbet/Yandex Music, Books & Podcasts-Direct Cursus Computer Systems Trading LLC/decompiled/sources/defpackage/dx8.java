package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class dx8 implements u1f {
    public Integer a;
    public final lj9 b;

    public dx8(lj9 lj9Var) {
        this.b = lj9Var;
    }

    public final boolean a(dx8 dx8Var, xzb xzbVar, xzb xzbVar2) {
        if (dx8Var != null) {
            lj9 lj9Var = dx8Var.b;
            lj9 lj9Var2 = this.b;
            if (((Number) lj9Var2.a.a(xzbVar)).intValue() == ((Number) lj9Var.a.a(xzbVar2)).intValue() && lj9Var2.b.a(lj9Var.b, xzbVar, xzbVar2)) {
                ln9 ln9Var = lj9Var2.c;
                ln9 ln9Var2 = lj9Var.c;
                if (ln9Var != null ? ln9Var.a(ln9Var2, xzbVar, xzbVar2) : ln9Var2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int b() {
        int i;
        Integer num = this.a;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = ern.a(dx8.class).hashCode();
        lj9 lj9Var = this.b;
        Integer num2 = lj9Var.d;
        if (num2 != null) {
            i = num2.intValue();
        } else {
            int b = lj9Var.b.b() + lj9Var.a.hashCode() + ern.a(lj9.class).hashCode();
            ln9 ln9Var = lj9Var.c;
            int b2 = b + (ln9Var != null ? ln9Var.b() : 0);
            lj9Var.d = Integer.valueOf(b2);
            i = b2;
        }
        int i2 = i + hashCode;
        this.a = Integer.valueOf(i2);
        return i2;
    }

    @Override // defpackage.u1f
    public final JSONObject r() {
        ex8 ex8Var = (ex8) rj3.b.e3.getValue();
        return ((mj9) ex8Var.a.h7.getValue()).b(rj3.a, this.b);
    }
}
