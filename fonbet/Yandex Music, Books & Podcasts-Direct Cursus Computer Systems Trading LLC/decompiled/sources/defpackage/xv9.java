package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class xv9 implements u1f {
    public Integer a;

    /* JADX WARN: Removed duplicated region for block: B:18:0x00aa A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(xv9 xv9Var, xzb xzbVar, xzb xzbVar2) {
        Object obj;
        Object obj2;
        if (xv9Var != null) {
            if (this instanceof vv9) {
                vv9 vv9Var = (vv9) this;
                if (xv9Var instanceof vv9) {
                    obj2 = ((vv9) xv9Var).b;
                } else {
                    if (!(xv9Var instanceof wv9)) {
                        b6e.s();
                        return false;
                    }
                    obj2 = ((wv9) xv9Var).b;
                }
                kh9 kh9Var = obj2 instanceof kh9 ? (kh9) obj2 : null;
                if (kh9Var != null) {
                    kh9 kh9Var2 = vv9Var.b;
                    if (((Number) kh9Var2.a.a(xzbVar)).doubleValue() == ((Number) kh9Var.a.a(xzbVar2)).doubleValue() && kh9Var2.b.a(kh9Var.b, xzbVar, xzbVar2) && kh9Var2.c.a(kh9Var.c, xzbVar, xzbVar2)) {
                        return true;
                    }
                }
            } else {
                if (!(this instanceof wv9)) {
                    b6e.s();
                    return false;
                }
                wv9 wv9Var = (wv9) this;
                if (xv9Var instanceof vv9) {
                    obj = ((vv9) xv9Var).b;
                } else {
                    if (!(xv9Var instanceof wv9)) {
                        b6e.s();
                        return false;
                    }
                    obj = ((wv9) xv9Var).b;
                }
                xw9 xw9Var = obj instanceof xw9 ? (xw9) obj : null;
                if (xw9Var != null) {
                    xw9 xw9Var2 = wv9Var.b;
                    qw9 qw9Var = xw9Var2.a;
                    qw9 qw9Var2 = xw9Var.a;
                    if (qw9Var != null ? qw9Var.a(qw9Var2, xzbVar, xzbVar2) : qw9Var2 == null) {
                        qw9 qw9Var3 = xw9Var2.b;
                        qw9 qw9Var4 = xw9Var.b;
                        if (qw9Var3 != null ? qw9Var3.a(qw9Var4, xzbVar, xzbVar2) : qw9Var4 == null) {
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int b() {
        int b;
        int intValue;
        Integer num = this.a;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = ern.a(getClass()).hashCode();
        if (this instanceof vv9) {
            kh9 kh9Var = ((vv9) this).b;
            Integer num2 = kh9Var.d;
            if (num2 != null) {
                intValue = num2.intValue();
            } else {
                b = kh9Var.b.b() + kh9Var.a.hashCode() + ern.a(kh9.class).hashCode() + kh9Var.c.b();
                kh9Var.d = Integer.valueOf(b);
                intValue = b;
            }
        } else {
            if (!(this instanceof wv9)) {
                b6e.s();
                return 0;
            }
            xw9 xw9Var = ((wv9) this).b;
            Integer num3 = xw9Var.c;
            if (num3 != null) {
                intValue = num3.intValue();
            } else {
                int hashCode2 = ern.a(xw9.class).hashCode();
                qw9 qw9Var = xw9Var.a;
                int b2 = hashCode2 + (qw9Var != null ? qw9Var.b() : 0);
                qw9 qw9Var2 = xw9Var.b;
                b = b2 + (qw9Var2 != null ? qw9Var2.b() : 0);
                xw9Var.c = Integer.valueOf(b);
                intValue = b;
            }
        }
        int i = hashCode + intValue;
        this.a = Integer.valueOf(i);
        return i;
    }

    @Override // defpackage.u1f
    public final JSONObject r() {
        return ((yv9) rj3.b.t9.getValue()).b(rj3.a, this);
    }
}
