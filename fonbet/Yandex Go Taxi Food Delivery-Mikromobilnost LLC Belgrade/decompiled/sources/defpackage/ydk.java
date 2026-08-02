package defpackage;

import com.yandex.div.json.expressions.Expression;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public abstract class ydk implements c4x {
    public Integer a;

    /* JADX WARN: Code restructure failed: missing block: B:143:0x0215, code lost:
    
        if (r3 == null) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x01a8, code lost:
    
        if (r3 == null) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00cc, code lost:
    
        if (r3 == null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x005f, code lost:
    
        if (r3 == null) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(ydk ydkVar, rvo rvoVar, rvo rvoVar2) {
        if (ydkVar != null) {
            if (this instanceof wdk) {
                wdk wdkVar = (wdk) this;
                aek c = ydkVar.c();
                ljk ljkVar = c instanceof ljk ? (ljk) c : null;
                if (ljkVar != null) {
                    ljk ljkVar2 = wdkVar.b;
                    List list = ljkVar2.a;
                    List list2 = ljkVar.a;
                    if (list != null) {
                        if (list2 != null && list.size() == list2.size()) {
                            int i = 0;
                            for (Object obj : list) {
                                int i2 = i + 1;
                                if (i < 0) {
                                    scc.m();
                                    throw null;
                                }
                                if (!((v3k) obj).a((v3k) list2.get(i), rvoVar, rvoVar2)) {
                                    break;
                                }
                                i = i2;
                            }
                            if (ljkVar2.b.a(rvoVar) == ljkVar.b.a(rvoVar2) && ((Number) ljkVar2.c.a(rvoVar)).longValue() == ((Number) ljkVar.c.a(rvoVar2)).longValue()) {
                                List list3 = ljkVar2.d;
                                List list4 = ljkVar.d;
                                if (list3 != null) {
                                    if (list4 != null && list3.size() == list4.size()) {
                                        int i3 = 0;
                                        for (Object obj2 : list3) {
                                            int i4 = i3 + 1;
                                            if (i3 < 0) {
                                                scc.m();
                                                throw null;
                                            }
                                            if (!((v3k) obj2).a((v3k) list4.get(i3), rvoVar, rvoVar2)) {
                                                break;
                                            }
                                            i3 = i4;
                                        }
                                        if (((Number) ljkVar2.e.a(rvoVar)).intValue() == ((Number) ljkVar.e.a(rvoVar2)).intValue() && jl40.l(ljkVar2.f, ljkVar.f) && ljkVar2.g.a(rvoVar) == ljkVar.g.a(rvoVar2) && ljkVar2.h.a(ljkVar.h, rvoVar, rvoVar2) && ((Number) ljkVar2.i.a(rvoVar)).longValue() == ((Number) ljkVar.i.a(rvoVar2)).longValue()) {
                                            Expression expression = ljkVar2.j;
                                            Integer num = expression != null ? (Integer) expression.a(rvoVar) : null;
                                            Expression expression2 = ljkVar.j;
                                            if (!jl40.l(num, expression2 != null ? (Integer) expression2.a(rvoVar2) : null) || !jl40.l(ljkVar2.k, ljkVar.k)) {
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
                if (!(this instanceof xdk)) {
                    w511.b();
                    return false;
                }
                xdk xdkVar = (xdk) this;
                aek c2 = ydkVar.c();
                i0l i0lVar = c2 instanceof i0l ? (i0l) c2 : null;
                if (i0lVar != null) {
                    i0l i0lVar2 = xdkVar.b;
                    List list5 = i0lVar2.a;
                    List list6 = i0lVar.a;
                    if (list5 != null) {
                        if (list6 != null && list5.size() == list6.size()) {
                            int i5 = 0;
                            for (Object obj3 : list5) {
                                int i6 = i5 + 1;
                                if (i5 < 0) {
                                    scc.m();
                                    throw null;
                                }
                                if (!((v3k) obj3).a((v3k) list6.get(i5), rvoVar, rvoVar2)) {
                                    break;
                                }
                                i5 = i6;
                            }
                            if (i0lVar2.b.a(rvoVar) == i0lVar.b.a(rvoVar2) && ((Number) i0lVar2.c.a(rvoVar)).longValue() == ((Number) i0lVar.c.a(rvoVar2)).longValue()) {
                                List list7 = i0lVar2.d;
                                List list8 = i0lVar.d;
                                if (list7 != null) {
                                    if (list8 != null && list7.size() == list8.size()) {
                                        int i7 = 0;
                                        for (Object obj4 : list7) {
                                            int i8 = i7 + 1;
                                            if (i7 < 0) {
                                                scc.m();
                                                throw null;
                                            }
                                            if (!((v3k) obj4).a((v3k) list8.get(i7), rvoVar, rvoVar2)) {
                                                break;
                                            }
                                            i7 = i8;
                                        }
                                        if (((Number) i0lVar2.e.a(rvoVar)).doubleValue() == ((Number) i0lVar.e.a(rvoVar2)).doubleValue() && jl40.l(i0lVar2.f, i0lVar.f) && i0lVar2.g.a(rvoVar) == i0lVar.g.a(rvoVar2) && i0lVar2.h.a(i0lVar.h, rvoVar, rvoVar2) && ((Number) i0lVar2.i.a(rvoVar)).longValue() == ((Number) i0lVar.i.a(rvoVar2)).longValue()) {
                                            Expression expression3 = i0lVar2.j;
                                            Double d = expression3 != null ? (Double) expression3.a(rvoVar) : null;
                                            Expression expression4 = i0lVar.j;
                                            if (!jl40.i(d, expression4 != null ? (Double) expression4.a(rvoVar2) : null) || !jl40.l(i0lVar2.k, i0lVar.k)) {
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
        int hashCode2 = qoi0.a(getClass()).hashCode();
        if (this instanceof wdk) {
            ljk ljkVar = ((wdk) this).b;
            Integer num2 = ljkVar.l;
            if (num2 != null) {
                intValue = num2.intValue();
            } else {
                int hashCode3 = qoi0.a(ljk.class).hashCode();
                List list = ljkVar.a;
                if (list != null) {
                    Iterator it = list.iterator();
                    i3 = 0;
                    while (it.hasNext()) {
                        i3 += ((v3k) it.next()).b();
                    }
                } else {
                    i3 = 0;
                }
                int hashCode4 = ljkVar.c.hashCode() + ljkVar.b.hashCode() + hashCode3 + i3;
                List list2 = ljkVar.d;
                if (list2 != null) {
                    Iterator it2 = list2.iterator();
                    i4 = 0;
                    while (it2.hasNext()) {
                        i4 += ((v3k) it2.next()).b();
                    }
                } else {
                    i4 = 0;
                }
                int hashCode5 = ljkVar.i.hashCode() + ljkVar.h.b() + ljkVar.g.hashCode() + ljkVar.f.hashCode() + ljkVar.e.hashCode() + hashCode4 + i4;
                Expression expression = ljkVar.j;
                hashCode = ljkVar.k.hashCode() + hashCode5 + (expression != null ? expression.hashCode() : 0);
                ljkVar.l = Integer.valueOf(hashCode);
                intValue = hashCode;
            }
        } else {
            if (!(this instanceof xdk)) {
                w511.b();
                return 0;
            }
            i0l i0lVar = ((xdk) this).b;
            Integer num3 = i0lVar.l;
            if (num3 != null) {
                intValue = num3.intValue();
            } else {
                int hashCode6 = qoi0.a(i0l.class).hashCode();
                List list3 = i0lVar.a;
                if (list3 != null) {
                    Iterator it3 = list3.iterator();
                    i = 0;
                    while (it3.hasNext()) {
                        i += ((v3k) it3.next()).b();
                    }
                } else {
                    i = 0;
                }
                int hashCode7 = i0lVar.c.hashCode() + i0lVar.b.hashCode() + hashCode6 + i;
                List list4 = i0lVar.d;
                if (list4 != null) {
                    Iterator it4 = list4.iterator();
                    i2 = 0;
                    while (it4.hasNext()) {
                        i2 += ((v3k) it4.next()).b();
                    }
                } else {
                    i2 = 0;
                }
                int hashCode8 = i0lVar.i.hashCode() + i0lVar.h.b() + i0lVar.g.hashCode() + i0lVar.f.hashCode() + i0lVar.e.hashCode() + hashCode7 + i2;
                Expression expression2 = i0lVar.j;
                hashCode = i0lVar.k.hashCode() + hashCode8 + (expression2 != null ? expression2.hashCode() : 0);
                i0lVar.l = Integer.valueOf(hashCode);
                intValue = hashCode;
            }
        }
        int i5 = hashCode2 + intValue;
        this.a = Integer.valueOf(i5);
        return i5;
    }

    public final aek c() {
        if (this instanceof wdk) {
            return ((wdk) this).b;
        }
        if (this instanceof xdk) {
            return ((xdk) this).b;
        }
        w511.b();
        return null;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        return ((cek) ft6.b.C1.getValue()).b(ft6.a, this);
    }
}
