package defpackage;

import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class sq8 implements u1f {
    public Integer a;

    public final boolean a(sq8 sq8Var, xzb xzbVar, xzb xzbVar2) {
        Object obj;
        Object obj2;
        if (sq8Var != null) {
            if (this instanceof rq8) {
                rq8 rq8Var = (rq8) this;
                if (sq8Var instanceof rq8) {
                    obj2 = ((rq8) sq8Var).b;
                } else {
                    if (!(sq8Var instanceof qq8)) {
                        b6e.s();
                        return false;
                    }
                    obj2 = ((qq8) sq8Var).b;
                }
                lq8 lq8Var = obj2 instanceof lq8 ? (lq8) obj2 : null;
                if (lq8Var != null) {
                    List list = rq8Var.b.a;
                    List list2 = lq8Var.a;
                    if (list.size() == list2.size()) {
                        int i = 0;
                        for (Object obj3 : list) {
                            int i2 = i + 1;
                            if (i < 0) {
                                u75.n();
                                throw null;
                            }
                            if (((sq8) obj3).a((sq8) list2.get(i), xzbVar, xzbVar2)) {
                                i = i2;
                            }
                        }
                        return true;
                    }
                }
            } else {
                if (!(this instanceof qq8)) {
                    b6e.s();
                    return false;
                }
                qq8 qq8Var = (qq8) this;
                if (sq8Var instanceof rq8) {
                    obj = ((rq8) sq8Var).b;
                } else {
                    if (!(sq8Var instanceof qq8)) {
                        b6e.s();
                        return false;
                    }
                    obj = ((qq8) sq8Var).b;
                }
                fq8 fq8Var = obj instanceof fq8 ? (fq8) obj : null;
                if (fq8Var != null) {
                    fq8 fq8Var2 = qq8Var.b;
                    if (((Number) fq8Var2.a.a(xzbVar)).longValue() == ((Number) fq8Var.a.a(xzbVar2)).longValue() && fq8Var2.b.a(xzbVar) == fq8Var.b.a(xzbVar2) && ((Number) fq8Var2.c.a(xzbVar)).longValue() == ((Number) fq8Var.c.a(xzbVar2)).longValue()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int b() {
        int i;
        int hashCode;
        Integer num = this.a;
        if (num != null) {
            return num.intValue();
        }
        int hashCode2 = ern.a(getClass()).hashCode();
        if (this instanceof rq8) {
            lq8 lq8Var = ((rq8) this).b;
            Integer num2 = lq8Var.c;
            if (num2 != null) {
                i = num2.intValue();
            } else {
                Integer num3 = lq8Var.b;
                if (num3 != null) {
                    hashCode = num3.intValue();
                } else {
                    hashCode = ern.a(lq8.class).hashCode();
                    lq8Var.b = Integer.valueOf(hashCode);
                }
                Iterator it = lq8Var.a.iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    i2 += ((sq8) it.next()).b();
                }
                int i3 = hashCode + i2;
                lq8Var.c = Integer.valueOf(i3);
                i = i3;
            }
        } else {
            if (!(this instanceof qq8)) {
                b6e.s();
                return 0;
            }
            fq8 fq8Var = ((qq8) this).b;
            Integer num4 = fq8Var.d;
            if (num4 != null) {
                i = num4.intValue();
            } else {
                int hashCode3 = fq8Var.c.hashCode() + fq8Var.b.hashCode() + fq8Var.a.hashCode() + ern.a(fq8.class).hashCode();
                fq8Var.d = Integer.valueOf(hashCode3);
                i = hashCode3;
            }
        }
        int i4 = hashCode2 + i;
        this.a = Integer.valueOf(i4);
        return i4;
    }

    @Override // defpackage.u1f
    public final JSONObject r() {
        return ((tq8) rj3.b.d2.getValue()).b(rj3.a, this);
    }
}
