package defpackage;

import com.yandex.div.json.expressions.Expression;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class t9k implements c4x {
    public final Expression a;
    public final List b;
    public final List c;
    public final s9k d;
    public Integer e;

    public t9k(Expression expression, List list, List list2, s9k s9kVar) {
        this.a = expression;
        this.b = list;
        this.c = list2;
        this.d = s9kVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x0109, code lost:
    
        if (r3 == null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0099, code lost:
    
        if (r1 == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0057, code lost:
    
        if (r1 == null) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(t9k t9kVar, rvo rvoVar, rvo rvoVar2) {
        if (t9kVar != null && jl40.l(this.a.a(rvoVar), t9kVar.a.a(rvoVar2))) {
            List list = t9kVar.b;
            List list2 = this.b;
            if (list2 != null) {
                if (list != null && list2.size() == list.size()) {
                    int i = 0;
                    for (Object obj : list2) {
                        int i2 = i + 1;
                        if (i < 0) {
                            scc.m();
                            throw null;
                        }
                        if (!((v3k) obj).a((v3k) list.get(i), rvoVar, rvoVar2)) {
                            break;
                        }
                        i = i2;
                    }
                    List list3 = t9kVar.c;
                    List list4 = this.c;
                    if (list4 != null) {
                        if (list3 != null && list4.size() == list3.size()) {
                            int i3 = 0;
                            for (Object obj2 : list4) {
                                int i4 = i3 + 1;
                                if (i3 < 0) {
                                    scc.m();
                                    throw null;
                                }
                                if (!((v3k) obj2).a((v3k) list3.get(i3), rvoVar, rvoVar2)) {
                                    break;
                                }
                                i3 = i4;
                            }
                            s9k s9kVar = t9kVar.d;
                            s9k s9kVar2 = this.d;
                            if (s9kVar == null) {
                                s9kVar2.getClass();
                            } else {
                                List list5 = s9kVar2.a;
                                List list6 = s9kVar.a;
                                if (list5 != null) {
                                    if (list6 != null && list5.size() == list6.size()) {
                                        int i5 = 0;
                                        for (Object obj3 : list5) {
                                            int i6 = i5 + 1;
                                            if (i5 < 0) {
                                                scc.m();
                                                throw null;
                                            }
                                            q9k q9kVar = (q9k) list6.get(i5);
                                            q9k q9kVar2 = (q9k) obj3;
                                            if (q9kVar == null) {
                                                q9kVar2.getClass();
                                                break;
                                            }
                                            if (!jl40.l(q9kVar2.a.a(rvoVar), q9kVar.a.a(rvoVar2)) || !jl40.l(q9kVar2.b.a(rvoVar), q9kVar.b.a(rvoVar2))) {
                                                break;
                                            }
                                            i5 = i6;
                                        }
                                        if (s9kVar2.b.a(rvoVar) != s9kVar.b.a(rvoVar2) || !jl40.l(s9kVar2.c.a(rvoVar), s9kVar.c.a(rvoVar2))) {
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
        return false;
    }

    public final int b() {
        int i;
        int i2;
        int hashCode;
        int i3;
        Integer num = this.e;
        if (num != null) {
            return num.intValue();
        }
        int hashCode2 = this.a.hashCode() + qoi0.a(t9k.class).hashCode();
        int i4 = 0;
        List list = this.b;
        if (list != null) {
            Iterator it = list.iterator();
            i = 0;
            while (it.hasNext()) {
                i += ((v3k) it.next()).b();
            }
        } else {
            i = 0;
        }
        int i5 = hashCode2 + i;
        List list2 = this.c;
        if (list2 != null) {
            Iterator it2 = list2.iterator();
            i2 = 0;
            while (it2.hasNext()) {
                i2 += ((v3k) it2.next()).b();
            }
        } else {
            i2 = 0;
        }
        int i6 = i5 + i2;
        s9k s9kVar = this.d;
        Integer num2 = s9kVar.d;
        if (num2 != null) {
            hashCode = num2.intValue();
        } else {
            int hashCode3 = qoi0.a(s9k.class).hashCode();
            List<q9k> list3 = s9kVar.a;
            if (list3 != null) {
                for (q9k q9kVar : list3) {
                    Integer num3 = q9kVar.c;
                    if (num3 != null) {
                        i3 = num3.intValue();
                    } else {
                        int hashCode4 = q9kVar.b.hashCode() + q9kVar.a.hashCode() + qoi0.a(q9k.class).hashCode();
                        q9kVar.c = Integer.valueOf(hashCode4);
                        i3 = hashCode4;
                    }
                    i4 += i3;
                }
            }
            hashCode = s9kVar.b.hashCode() + hashCode3 + i4 + s9kVar.c.hashCode();
            s9kVar.d = Integer.valueOf(hashCode);
        }
        int i7 = hashCode + i6;
        this.e = Integer.valueOf(i7);
        return i7;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        return ((u9k) ft6.b.Y0.getValue()).b(ft6.a, this);
    }
}
