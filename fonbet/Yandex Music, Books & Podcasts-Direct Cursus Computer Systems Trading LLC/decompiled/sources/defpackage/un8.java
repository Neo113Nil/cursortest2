package defpackage;

import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class un8 implements u1f {
    public Integer a;

    /* JADX WARN: Removed duplicated region for block: B:25:0x01a5 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(un8 un8Var, xzb xzbVar, xzb xzbVar2) {
        if (un8Var != null) {
            if (this instanceof sn8) {
                sn8 sn8Var = (sn8) this;
                Object c = un8Var.c();
                ln8 ln8Var = c instanceof ln8 ? (ln8) c : null;
                if (ln8Var != null) {
                    List list = sn8Var.b.a;
                    List list2 = ln8Var.a;
                    if (list.size() == list2.size()) {
                        int i = 0;
                        for (Object obj : list) {
                            int i2 = i + 1;
                            if (i < 0) {
                                u75.n();
                                throw null;
                            }
                            if (((un8) obj).a((un8) list2.get(i), xzbVar, xzbVar2)) {
                                i = i2;
                            }
                        }
                        return true;
                    }
                }
            } else {
                if (this instanceof qn8) {
                    qn8 qn8Var = (qn8) this;
                    Object c2 = un8Var.c();
                    return qn8Var.b.a(c2 instanceof zx8 ? (zx8) c2 : null, xzbVar, xzbVar2);
                }
                if (this instanceof rn8) {
                    rn8 rn8Var = (rn8) this;
                    Object c3 = un8Var.c();
                    xh9 xh9Var = c3 instanceof xh9 ? (xh9) c3 : null;
                    if (xh9Var != null) {
                        xh9 xh9Var2 = rn8Var.b;
                        if (((Number) xh9Var2.a.a(xzbVar)).longValue() == ((Number) xh9Var.a.a(xzbVar2)).longValue() && xh9Var2.b.a(xzbVar) == xh9Var.b.a(xzbVar2) && ((Number) xh9Var2.c.a(xzbVar)).doubleValue() == ((Number) xh9Var.c.a(xzbVar2)).doubleValue() && ((Number) xh9Var2.d.a(xzbVar)).doubleValue() == ((Number) xh9Var.d.a(xzbVar2)).doubleValue() && ((Number) xh9Var2.e.a(xzbVar)).doubleValue() == ((Number) xh9Var.e.a(xzbVar2)).doubleValue() && ((Number) xh9Var2.f.a(xzbVar)).longValue() == ((Number) xh9Var.f.a(xzbVar2)).longValue()) {
                            return true;
                        }
                    }
                } else {
                    if (!(this instanceof tn8)) {
                        b6e.s();
                        return false;
                    }
                    tn8 tn8Var = (tn8) this;
                    Object c4 = un8Var.c();
                    qk9 qk9Var = c4 instanceof qk9 ? (qk9) c4 : null;
                    if (qk9Var != null) {
                        qk9 qk9Var2 = tn8Var.b;
                        ow8 ow8Var = qk9Var2.a;
                        ow8 ow8Var2 = qk9Var.a;
                        if (!(ow8Var != null ? ow8Var.a(ow8Var2, xzbVar, xzbVar2) : ow8Var2 == null) || ((Number) qk9Var2.b.a(xzbVar)).longValue() != ((Number) qk9Var.b.a(xzbVar2)).longValue() || qk9Var2.c.a(xzbVar) != qk9Var.c.a(xzbVar2) || qk9Var2.d.a(xzbVar) != qk9Var.d.a(xzbVar2) || ((Number) qk9Var2.e.a(xzbVar)).longValue() != ((Number) qk9Var.e.a(xzbVar2)).longValue()) {
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int b() {
        int hashCode;
        int intValue;
        int hashCode2;
        Integer num = this.a;
        if (num != null) {
            return num.intValue();
        }
        int hashCode3 = ern.a(getClass()).hashCode();
        if (this instanceof sn8) {
            ln8 ln8Var = ((sn8) this).b;
            Integer num2 = ln8Var.c;
            if (num2 != null) {
                intValue = num2.intValue();
            } else {
                Integer num3 = ln8Var.b;
                if (num3 != null) {
                    hashCode2 = num3.intValue();
                } else {
                    hashCode2 = ern.a(ln8.class).hashCode();
                    ln8Var.b = Integer.valueOf(hashCode2);
                }
                Iterator it = ln8Var.a.iterator();
                int i = 0;
                while (it.hasNext()) {
                    i += ((un8) it.next()).b();
                }
                hashCode = hashCode2 + i;
                ln8Var.c = Integer.valueOf(hashCode);
                intValue = hashCode;
            }
        } else if (this instanceof qn8) {
            intValue = ((qn8) this).b.b();
        } else if (this instanceof rn8) {
            xh9 xh9Var = ((rn8) this).b;
            Integer num4 = xh9Var.g;
            if (num4 != null) {
                intValue = num4.intValue();
            } else {
                hashCode = xh9Var.f.hashCode() + xh9Var.e.hashCode() + xh9Var.d.hashCode() + xh9Var.c.hashCode() + xh9Var.b.hashCode() + xh9Var.a.hashCode() + ern.a(xh9.class).hashCode();
                xh9Var.g = Integer.valueOf(hashCode);
                intValue = hashCode;
            }
        } else {
            if (!(this instanceof tn8)) {
                b6e.s();
                return 0;
            }
            qk9 qk9Var = ((tn8) this).b;
            Integer num5 = qk9Var.f;
            if (num5 != null) {
                intValue = num5.intValue();
            } else {
                int hashCode4 = ern.a(qk9.class).hashCode();
                ow8 ow8Var = qk9Var.a;
                hashCode = qk9Var.e.hashCode() + qk9Var.d.hashCode() + qk9Var.c.hashCode() + qk9Var.b.hashCode() + hashCode4 + (ow8Var != null ? ow8Var.b() : 0);
                qk9Var.f = Integer.valueOf(hashCode);
                intValue = hashCode;
            }
        }
        int i2 = hashCode3 + intValue;
        this.a = Integer.valueOf(i2);
        return i2;
    }

    public final Object c() {
        if (this instanceof sn8) {
            return ((sn8) this).b;
        }
        if (this instanceof qn8) {
            return ((qn8) this).b;
        }
        if (this instanceof rn8) {
            return ((rn8) this).b;
        }
        if (this instanceof tn8) {
            return ((tn8) this).b;
        }
        b6e.s();
        return null;
    }

    @Override // defpackage.u1f
    public final JSONObject r() {
        return ((vn8) rj3.b.I1.getValue()).b(rj3.a, this);
    }
}
