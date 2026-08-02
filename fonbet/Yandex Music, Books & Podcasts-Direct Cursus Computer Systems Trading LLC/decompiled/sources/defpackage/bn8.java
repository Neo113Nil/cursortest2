package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class bn8 implements u1f {
    public Integer a;

    /* JADX WARN: Code restructure failed: missing block: B:143:0x0217, code lost:
    
        if (r4 == null) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x01aa, code lost:
    
        if (r4 == null) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00cd, code lost:
    
        if (r4 == null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0060, code lost:
    
        if (r4 == null) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(bn8 bn8Var, xzb xzbVar, xzb xzbVar2) {
        if (bn8Var != null) {
            if (this instanceof zm8) {
                zm8 zm8Var = (zm8) this;
                cn8 c = bn8Var.c();
                yr8 yr8Var = c instanceof yr8 ? (yr8) c : null;
                if (yr8Var != null) {
                    yr8 yr8Var2 = zm8Var.b;
                    List list = yr8Var2.a;
                    List list2 = yr8Var.a;
                    if (list != null) {
                        if (list2 != null && list.size() == list2.size()) {
                            int i = 0;
                            for (Object obj : list) {
                                int i2 = i + 1;
                                if (i < 0) {
                                    u75.n();
                                    throw null;
                                }
                                if (!((bd8) obj).a((bd8) list2.get(i), xzbVar, xzbVar2)) {
                                    break;
                                }
                                i = i2;
                            }
                            if (yr8Var2.b.a(xzbVar) == yr8Var.b.a(xzbVar2) && ((Number) yr8Var2.c.a(xzbVar)).longValue() == ((Number) yr8Var.c.a(xzbVar2)).longValue()) {
                                List list3 = yr8Var2.d;
                                List list4 = yr8Var.d;
                                if (list3 != null) {
                                    if (list4 != null && list3.size() == list4.size()) {
                                        int i3 = 0;
                                        for (Object obj2 : list3) {
                                            int i4 = i3 + 1;
                                            if (i3 < 0) {
                                                u75.n();
                                                throw null;
                                            }
                                            if (!((bd8) obj2).a((bd8) list4.get(i3), xzbVar, xzbVar2)) {
                                                break;
                                            }
                                            i3 = i4;
                                        }
                                        if (((Number) yr8Var2.e.a(xzbVar)).intValue() == ((Number) yr8Var.e.a(xzbVar2)).intValue() && Intrinsics.d(yr8Var2.f, yr8Var.f) && yr8Var2.g.a(xzbVar) == yr8Var.g.a(xzbVar2) && yr8Var2.h.a(yr8Var.h, xzbVar, xzbVar2) && ((Number) yr8Var2.i.a(xzbVar)).longValue() == ((Number) yr8Var.i.a(xzbVar2)).longValue()) {
                                            szb szbVar = yr8Var2.j;
                                            Integer num = szbVar != null ? (Integer) szbVar.a(xzbVar) : null;
                                            szb szbVar2 = yr8Var.j;
                                            if (!Intrinsics.d(num, szbVar2 != null ? (Integer) szbVar2.a(xzbVar2) : null) || !Intrinsics.d(yr8Var2.k, yr8Var.k)) {
                                                break;
                                            }
                                            return true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                if (!(this instanceof an8)) {
                    b6e.s();
                    return false;
                }
                an8 an8Var = (an8) this;
                cn8 c2 = bn8Var.c();
                q99 q99Var = c2 instanceof q99 ? (q99) c2 : null;
                if (q99Var != null) {
                    q99 q99Var2 = an8Var.b;
                    List list5 = q99Var2.a;
                    List list6 = q99Var.a;
                    if (list5 != null) {
                        if (list6 != null && list5.size() == list6.size()) {
                            int i5 = 0;
                            for (Object obj3 : list5) {
                                int i6 = i5 + 1;
                                if (i5 < 0) {
                                    u75.n();
                                    throw null;
                                }
                                if (!((bd8) obj3).a((bd8) list6.get(i5), xzbVar, xzbVar2)) {
                                    break;
                                }
                                i5 = i6;
                            }
                            if (q99Var2.b.a(xzbVar) == q99Var.b.a(xzbVar2) && ((Number) q99Var2.c.a(xzbVar)).longValue() == ((Number) q99Var.c.a(xzbVar2)).longValue()) {
                                List list7 = q99Var2.d;
                                List list8 = q99Var.d;
                                if (list7 != null) {
                                    if (list8 != null && list7.size() == list8.size()) {
                                        int i7 = 0;
                                        for (Object obj4 : list7) {
                                            int i8 = i7 + 1;
                                            if (i7 < 0) {
                                                u75.n();
                                                throw null;
                                            }
                                            if (!((bd8) obj4).a((bd8) list8.get(i7), xzbVar, xzbVar2)) {
                                                break;
                                            }
                                            i7 = i8;
                                        }
                                        if (((Number) q99Var2.e.a(xzbVar)).doubleValue() == ((Number) q99Var.e.a(xzbVar2)).doubleValue() && Intrinsics.d(q99Var2.f, q99Var.f) && q99Var2.g.a(xzbVar) == q99Var.g.a(xzbVar2) && q99Var2.h.a(q99Var.h, xzbVar, xzbVar2) && ((Number) q99Var2.i.a(xzbVar)).longValue() == ((Number) q99Var.i.a(xzbVar2)).longValue()) {
                                            szb szbVar3 = q99Var2.j;
                                            Double d = szbVar3 != null ? (Double) szbVar3.a(xzbVar) : null;
                                            szb szbVar4 = q99Var.j;
                                            if (!Intrinsics.b(d, szbVar4 != null ? (Double) szbVar4.a(xzbVar2) : null) || !Intrinsics.d(q99Var2.k, q99Var.k)) {
                                                break;
                                            }
                                            return true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int b() {
        int i;
        int i2;
        int hashCode;
        int intValue;
        int i3;
        int i4;
        Integer num = this.a;
        if (num != null) {
            return num.intValue();
        }
        int hashCode2 = ern.a(getClass()).hashCode();
        if (this instanceof zm8) {
            yr8 yr8Var = ((zm8) this).b;
            Integer num2 = yr8Var.l;
            if (num2 != null) {
                intValue = num2.intValue();
            } else {
                int hashCode3 = ern.a(yr8.class).hashCode();
                List list = yr8Var.a;
                if (list != null) {
                    Iterator it = list.iterator();
                    i3 = 0;
                    while (it.hasNext()) {
                        i3 += ((bd8) it.next()).b();
                    }
                } else {
                    i3 = 0;
                }
                int hashCode4 = yr8Var.c.hashCode() + yr8Var.b.hashCode() + hashCode3 + i3;
                List list2 = yr8Var.d;
                if (list2 != null) {
                    Iterator it2 = list2.iterator();
                    i4 = 0;
                    while (it2.hasNext()) {
                        i4 += ((bd8) it2.next()).b();
                    }
                } else {
                    i4 = 0;
                }
                int hashCode5 = yr8Var.i.hashCode() + yr8Var.h.b() + yr8Var.g.hashCode() + yr8Var.f.hashCode() + yr8Var.e.hashCode() + hashCode4 + i4;
                szb szbVar = yr8Var.j;
                hashCode = yr8Var.k.hashCode() + hashCode5 + (szbVar != null ? szbVar.hashCode() : 0);
                yr8Var.l = Integer.valueOf(hashCode);
                intValue = hashCode;
            }
        } else {
            if (!(this instanceof an8)) {
                b6e.s();
                return 0;
            }
            q99 q99Var = ((an8) this).b;
            Integer num3 = q99Var.l;
            if (num3 != null) {
                intValue = num3.intValue();
            } else {
                int hashCode6 = ern.a(q99.class).hashCode();
                List list3 = q99Var.a;
                if (list3 != null) {
                    Iterator it3 = list3.iterator();
                    i = 0;
                    while (it3.hasNext()) {
                        i += ((bd8) it3.next()).b();
                    }
                } else {
                    i = 0;
                }
                int hashCode7 = q99Var.c.hashCode() + q99Var.b.hashCode() + hashCode6 + i;
                List list4 = q99Var.d;
                if (list4 != null) {
                    Iterator it4 = list4.iterator();
                    i2 = 0;
                    while (it4.hasNext()) {
                        i2 += ((bd8) it4.next()).b();
                    }
                } else {
                    i2 = 0;
                }
                int hashCode8 = q99Var.i.hashCode() + q99Var.h.b() + q99Var.g.hashCode() + q99Var.f.hashCode() + q99Var.e.hashCode() + hashCode7 + i2;
                szb szbVar2 = q99Var.j;
                hashCode = q99Var.k.hashCode() + hashCode8 + (szbVar2 != null ? szbVar2.hashCode() : 0);
                q99Var.l = Integer.valueOf(hashCode);
                intValue = hashCode;
            }
        }
        int i5 = hashCode2 + intValue;
        this.a = Integer.valueOf(i5);
        return i5;
    }

    public final cn8 c() {
        if (this instanceof zm8) {
            return ((zm8) this).b;
        }
        if (this instanceof an8) {
            return ((an8) this).b;
        }
        b6e.s();
        return null;
    }

    @Override // defpackage.u1f
    public final JSONObject r() {
        return ((fn8) rj3.b.C1.getValue()).b(rj3.a, this);
    }
}
