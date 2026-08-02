package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class kj9 implements u1f {
    public Integer a;

    public final boolean a(kj9 kj9Var, xzb xzbVar, xzb xzbVar2) {
        Object obj;
        Object obj2;
        if (kj9Var != null) {
            if (this instanceof jj9) {
                jj9 jj9Var = (jj9) this;
                if (kj9Var instanceof jj9) {
                    obj2 = ((jj9) kj9Var).b;
                } else {
                    if (!(kj9Var instanceof ij9)) {
                        b6e.s();
                        return false;
                    }
                    obj2 = ((ij9) kj9Var).b;
                }
                return jj9Var.b.a(obj2 instanceof qh9 ? (qh9) obj2 : null, xzbVar, xzbVar2);
            }
            if (!(this instanceof ij9)) {
                b6e.s();
                return false;
            }
            ij9 ij9Var = (ij9) this;
            if (kj9Var instanceof jj9) {
                obj = ((jj9) kj9Var).b;
            } else {
                if (!(kj9Var instanceof ij9)) {
                    b6e.s();
                    return false;
                }
                obj = ((ij9) kj9Var).b;
            }
            zq8 zq8Var = obj instanceof zq8 ? (zq8) obj : null;
            if (zq8Var != null) {
                zq8 zq8Var2 = ij9Var.b;
                szb szbVar = zq8Var2.a;
                Integer num = szbVar != null ? (Integer) szbVar.a(xzbVar) : null;
                szb szbVar2 = zq8Var.a;
                if (Intrinsics.d(num, szbVar2 != null ? (Integer) szbVar2.a(xzbVar2) : null) && zq8Var2.b.a(zq8Var.b, xzbVar, xzbVar2)) {
                    ln9 ln9Var = zq8Var2.c;
                    ln9 ln9Var2 = zq8Var.c;
                    if (ln9Var != null ? ln9Var.a(ln9Var2, xzbVar, xzbVar2) : ln9Var2 == null) {
                        return true;
                    }
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
        int hashCode = ern.a(getClass()).hashCode();
        if (this instanceof jj9) {
            i = ((jj9) this).b.b();
        } else {
            if (!(this instanceof ij9)) {
                b6e.s();
                return 0;
            }
            zq8 zq8Var = ((ij9) this).b;
            Integer num2 = zq8Var.d;
            if (num2 != null) {
                i = num2.intValue();
            } else {
                int hashCode2 = ern.a(zq8.class).hashCode();
                szb szbVar = zq8Var.a;
                int b = zq8Var.b.b() + hashCode2 + (szbVar != null ? szbVar.hashCode() : 0);
                ln9 ln9Var = zq8Var.c;
                int b2 = b + (ln9Var != null ? ln9Var.b() : 0);
                zq8Var.d = Integer.valueOf(b2);
                i = b2;
            }
        }
        int i2 = hashCode + i;
        this.a = Integer.valueOf(i2);
        return i2;
    }

    @Override // defpackage.u1f
    public final JSONObject r() {
        return ((qj9) rj3.b.k7.getValue()).b(rj3.a, this);
    }
}
