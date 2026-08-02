package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class mo8 implements u1f {
    public Integer a;

    /* JADX WARN: Code restructure failed: missing block: B:55:0x00cb, code lost:
    
        if (r5 == null) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(mo8 mo8Var, xzb xzbVar, xzb xzbVar2) {
        if (mo8Var != null) {
            if (this instanceof io8) {
                io8 io8Var = (io8) this;
                Object c = mo8Var.c();
                return io8Var.b.a(c instanceof g89 ? (g89) c : null, xzbVar, xzbVar2);
            }
            if (this instanceof ko8) {
                ko8 ko8Var = (ko8) this;
                Object c2 = mo8Var.c();
                return ko8Var.b.a(c2 instanceof of9 ? (of9) c2 : null, xzbVar, xzbVar2);
            }
            if (this instanceof ho8) {
                ho8 ho8Var = (ho8) this;
                Object c3 = mo8Var.c();
                k29 k29Var = c3 instanceof k29 ? (k29) c3 : null;
                if (k29Var != null) {
                    k29 k29Var2 = ho8Var.b;
                    if (((Number) k29Var2.a.a(xzbVar)).doubleValue() == ((Number) k29Var.a.a(xzbVar2)).doubleValue() && k29Var2.b.a(xzbVar) == k29Var.b.a(xzbVar2) && k29Var2.c.a(xzbVar) == k29Var.c.a(xzbVar2)) {
                        List list = k29Var2.d;
                        List list2 = k29Var.d;
                        if (list != null) {
                            if (list2 != null && list.size() == list2.size()) {
                                int i = 0;
                                for (Object obj : list) {
                                    int i2 = i + 1;
                                    if (i < 0) {
                                        u75.n();
                                        throw null;
                                    }
                                    if (!((hy8) obj).a((hy8) list2.get(i), xzbVar, xzbVar2)) {
                                        break;
                                    }
                                    i = i2;
                                }
                                if (!Intrinsics.d(k29Var2.e.a(xzbVar), k29Var.e.a(xzbVar2)) || ((Boolean) k29Var2.f.a(xzbVar)).booleanValue() != ((Boolean) k29Var.f.a(xzbVar2)).booleanValue() || k29Var2.g.a(xzbVar) != k29Var.g.a(xzbVar2)) {
                                    break;
                                }
                            }
                        }
                        return true;
                    }
                }
            } else {
                if (this instanceof lo8) {
                    lo8 lo8Var = (lo8) this;
                    Object c4 = mo8Var.c();
                    xl9 xl9Var = c4 instanceof xl9 ? (xl9) c4 : null;
                    return xl9Var != null && ((Number) lo8Var.b.a.a(xzbVar)).intValue() == ((Number) xl9Var.a.a(xzbVar2)).intValue();
                }
                if (!(this instanceof jo8)) {
                    b6e.s();
                    return false;
                }
                jo8 jo8Var = (jo8) this;
                Object c5 = mo8Var.c();
                l99 l99Var = c5 instanceof l99 ? (l99) c5 : null;
                if (l99Var != null) {
                    l99 l99Var2 = jo8Var.b;
                    if (Intrinsics.d(l99Var2.a.a(xzbVar), l99Var.a.a(xzbVar2))) {
                        kc8 kc8Var = l99Var2.b;
                        kc8 kc8Var2 = l99Var.b;
                        if (kc8Var2 == null) {
                            kc8Var.getClass();
                            return false;
                        }
                        if (((Number) kc8Var.a.a(xzbVar)).longValue() != ((Number) kc8Var2.a.a(xzbVar2)).longValue() || ((Number) kc8Var.b.a(xzbVar)).longValue() != ((Number) kc8Var2.b.a(xzbVar2)).longValue() || ((Number) kc8Var.c.a(xzbVar)).longValue() != ((Number) kc8Var2.c.a(xzbVar2)).longValue() || ((Number) kc8Var.d.a(xzbVar)).longValue() != ((Number) kc8Var2.d.a(xzbVar2)).longValue()) {
                            break;
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int b() {
        int i;
        int i2;
        int intValue;
        Integer num = this.a;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = ern.a(getClass()).hashCode();
        if (this instanceof io8) {
            intValue = ((io8) this).b.b();
        } else if (this instanceof ko8) {
            intValue = ((ko8) this).b.b();
        } else if (this instanceof ho8) {
            k29 k29Var = ((ho8) this).b;
            Integer num2 = k29Var.h;
            if (num2 != null) {
                intValue = num2.intValue();
            } else {
                int hashCode2 = k29Var.c.hashCode() + k29Var.b.hashCode() + k29Var.a.hashCode() + ern.a(k29.class).hashCode();
                List list = k29Var.d;
                int i3 = 0;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        i3 += ((hy8) it.next()).b();
                    }
                }
                i2 = k29Var.g.hashCode() + k29Var.f.hashCode() + k29Var.e.hashCode() + hashCode2 + i3;
                k29Var.h = Integer.valueOf(i2);
                intValue = i2;
            }
        } else if (this instanceof lo8) {
            intValue = ((lo8) this).b.a();
        } else {
            if (!(this instanceof jo8)) {
                b6e.s();
                return 0;
            }
            l99 l99Var = ((jo8) this).b;
            Integer num3 = l99Var.c;
            if (num3 != null) {
                intValue = num3.intValue();
            } else {
                int hashCode3 = l99Var.a.hashCode() + ern.a(l99.class).hashCode();
                kc8 kc8Var = l99Var.b;
                Integer num4 = kc8Var.e;
                if (num4 != null) {
                    i = num4.intValue();
                } else {
                    int hashCode4 = kc8Var.d.hashCode() + kc8Var.c.hashCode() + kc8Var.b.hashCode() + kc8Var.a.hashCode() + ern.a(kc8.class).hashCode();
                    kc8Var.e = Integer.valueOf(hashCode4);
                    i = hashCode4;
                }
                i2 = i + hashCode3;
                l99Var.c = Integer.valueOf(i2);
                intValue = i2;
            }
        }
        int i4 = hashCode + intValue;
        this.a = Integer.valueOf(i4);
        return i4;
    }

    public final Object c() {
        if (this instanceof io8) {
            return ((io8) this).b;
        }
        if (this instanceof ko8) {
            return ((ko8) this).b;
        }
        if (this instanceof ho8) {
            return ((ho8) this).b;
        }
        if (this instanceof lo8) {
            return ((lo8) this).b;
        }
        if (this instanceof jo8) {
            return ((jo8) this).b;
        }
        b6e.s();
        return null;
    }

    @Override // defpackage.u1f
    public final JSONObject r() {
        return ((no8) rj3.b.O1.getValue()).b(rj3.a, this);
    }
}
