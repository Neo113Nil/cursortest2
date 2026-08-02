package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class xd9 implements u1f {
    public Integer a;

    public final boolean a(xd9 xd9Var, xzb xzbVar, xzb xzbVar2) {
        if (xd9Var == null) {
            return false;
        }
        if (this instanceof vd9) {
            vd9 vd9Var = (vd9) this;
            Object c = xd9Var.c();
            yd9 yd9Var = c instanceof yd9 ? (yd9) c : null;
            if (yd9Var == null) {
                return false;
            }
            yd9 yd9Var2 = vd9Var.b;
            return yd9Var2.a.a(xzbVar) == yd9Var.a.a(xzbVar2) && ((Number) yd9Var2.b.a(xzbVar)).longValue() == ((Number) yd9Var.b.a(xzbVar2)).longValue();
        }
        if (!(this instanceof wd9)) {
            b6e.s();
            return false;
        }
        wd9 wd9Var = (wd9) this;
        Object c2 = xd9Var.c();
        he9 he9Var = c2 instanceof he9 ? (he9) c2 : null;
        return he9Var != null && ((Number) wd9Var.b.a.a(xzbVar)).doubleValue() == ((Number) he9Var.a.a(xzbVar2)).doubleValue();
    }

    public final int b() {
        int i;
        Integer num = this.a;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = ern.a(getClass()).hashCode();
        if (this instanceof vd9) {
            yd9 yd9Var = ((vd9) this).b;
            Integer num2 = yd9Var.c;
            if (num2 != null) {
                i = num2.intValue();
            } else {
                int hashCode2 = yd9Var.b.hashCode() + yd9Var.a.hashCode() + ern.a(yd9.class).hashCode();
                yd9Var.c = Integer.valueOf(hashCode2);
                i = hashCode2;
            }
        } else {
            if (!(this instanceof wd9)) {
                b6e.s();
                return 0;
            }
            he9 he9Var = ((wd9) this).b;
            Integer num3 = he9Var.b;
            if (num3 != null) {
                i = num3.intValue();
            } else {
                int hashCode3 = he9Var.a.hashCode() + ern.a(he9.class).hashCode();
                he9Var.b = Integer.valueOf(hashCode3);
                i = hashCode3;
            }
        }
        int i2 = hashCode + i;
        this.a = Integer.valueOf(i2);
        return i2;
    }

    public final Object c() {
        if (this instanceof vd9) {
            return ((vd9) this).b;
        }
        if (this instanceof wd9) {
            return ((wd9) this).b;
        }
        b6e.s();
        return null;
    }

    @Override // defpackage.u1f
    public final JSONObject r() {
        return ((ee9) rj3.b.i6.getValue()).b(rj3.a, this);
    }
}
