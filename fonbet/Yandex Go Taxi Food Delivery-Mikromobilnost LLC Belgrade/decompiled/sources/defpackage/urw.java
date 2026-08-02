package defpackage;

import com.yandex.go.zone.dto.objects.VerticalType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.collections.EmptyList;
import kotlin.collections.a;
import kotlin.sequences.b;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

/* loaded from: classes8.dex */
public final class urw {
    public final qrw a;
    public final slh b;

    public urw(qrw qrwVar, slh slhVar) {
        this.a = qrwVar;
        this.b = slhVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object] */
    public static mi31 a(za31 za31Var) {
        Object obj;
        mi31 mi31Var;
        List list = za31Var.b;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((mi31) obj).a.t) {
                break;
            }
        }
        mi31 mi31Var2 = (mi31) obj;
        if (mi31Var2 == null) {
            Iterator it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    mi31Var = 0;
                    break;
                }
                mi31Var = it2.next();
                if (((mi31) mi31Var).a.s) {
                    break;
                }
            }
            mi31Var2 = mi31Var;
        }
        if (mi31Var2 != null) {
            return mi31Var2.d(za31Var.d);
        }
        return null;
    }

    public static mi31 b(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!((za31) obj).a.o) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            za31 za31Var = (za31) it.next();
            mi31 a = a(za31Var);
            if (a != null) {
                return a.d(za31Var.d);
            }
        }
        return null;
    }

    public static mi31 f(String str, String str2, List list) {
        Object obj;
        t5r g = b.g(eja1.d(str2, list), new vsq(str, 15));
        s5r s5rVar = new s5r(g);
        while (true) {
            if (!s5rVar.hasNext()) {
                obj = null;
                break;
            }
            obj = s5rVar.next();
            if (jl40.l(((mi31) obj).b, str2)) {
                break;
            }
        }
        mi31 mi31Var = (mi31) obj;
        if (mi31Var == null) {
            mi31Var = (mi31) b.j(g);
        }
        if (mi31Var != null || gwk0.v(str2)) {
            return mi31Var;
        }
        return null;
    }

    public final mi31 c(String str, String str2, List list) {
        Object obj;
        Object obj2;
        Object obj3;
        mi31 mi31Var;
        List list2;
        mi31 mi31Var2;
        VerticalType verticalType;
        if (str != null) {
            this.a.getClass();
            mi31 a = qrw.a(str, str2, list);
            if (a == null) {
                a = f(str, str2, list);
            }
            if (a != null) {
                return a;
            }
        }
        mi31 e = e(str, str2, list);
        if (e != null) {
            return e;
        }
        List list3 = list;
        Iterator it = list3.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (jl40.l(((za31) obj).a.a, str2)) {
                break;
            }
        }
        za31 za31Var = (za31) obj;
        mi31 a2 = za31Var != null ? a(za31Var) : null;
        if (a2 != null) {
            return a2;
        }
        Iterator it2 = list3.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it2.next();
            if (jl40.l(((za31) obj2).a.a, str2)) {
                break;
            }
        }
        za31 za31Var2 = (za31) obj2;
        mi31 mi31Var3 = (za31Var2 == null || jl40.l(za31Var2.d, "")) ? null : (mi31) a.R(za31Var2.b);
        if (mi31Var3 != null) {
            return mi31Var3;
        }
        if (str != null) {
            Iterator it3 = list3.iterator();
            while (it3.hasNext()) {
                Iterator it4 = ((za31) it3.next()).b.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        obj3 = null;
                        break;
                    }
                    obj3 = it4.next();
                    if (jl40.l(((mi31) obj3).a.b, str)) {
                        break;
                    }
                }
                mi31Var = (mi31) obj3;
                if (mi31Var != null) {
                    break;
                }
            }
        }
        mi31Var = null;
        if (mi31Var != null) {
            return mi31Var;
        }
        mi31 b = b(list);
        if (b != null) {
            return b;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj4 : list3) {
            oa31 oa31Var = ((za31) obj4).a;
            if (!oa31Var.o && !oa31Var.e() && (verticalType = oa31Var.c) != VerticalType.NAVIGATOR && verticalType != VerticalType.MIXED) {
                arrayList.add(obj4);
            }
        }
        za31 za31Var3 = (za31) a.R(arrayList);
        if (za31Var3 == null || (list2 = za31Var3.b) == null || (mi31Var2 = (mi31) a.R(list2)) == null) {
            return null;
        }
        return mi31Var2.d(za31Var3.d);
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00f4 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final mi31 d(List list, mi31 mi31Var, boolean z) {
        mi31 mi31Var2;
        mi31 mi31Var3;
        String str;
        Object obj;
        mi31 mi31Var4;
        Object obj2;
        String str2;
        pex0 c;
        qrw qrwVar = this.a;
        if (mi31Var != null) {
            sgx0 sgx0Var = mi31Var.a.J0;
            String str3 = mi31Var.b;
            qrwVar.getClass();
            mi31Var2 = qrw.b(list, sgx0Var, str3);
        } else {
            mi31Var2 = null;
        }
        if (mi31Var2 != null) {
            return (!z || (str2 = mi31Var.g) == null || (c = mi31Var2.a.t0.c(str2)) == null) ? mi31Var2 : mi31.a(mi31Var2, c, null, 30);
        }
        if (mi31Var != null) {
            String str4 = mi31Var.b;
            pex0 pex0Var = mi31Var.a;
            String str5 = mi31Var.f;
            slh slhVar = this.b;
            mi31 mi31Var5 = (mi31) slhVar.b.get(str5);
            if (mi31Var5 == null) {
                mi31Var3 = null;
            } else {
                slhVar.b.remove(str5);
                String str6 = mi31Var5.f;
                String str7 = mi31Var5.b;
                qrwVar.getClass();
                mi31Var3 = qrw.a(str6, str7, list);
            }
            if (mi31Var3 == null) {
                TariffOrderFlow tariffOrderFlow = pex0Var.u0;
                switch (trw.a[tariffOrderFlow.ordinal()]) {
                    case 1:
                        Iterator it = list.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                obj = it.next();
                                if (jl40.l(((za31) obj).a.a, str4)) {
                                }
                            } else {
                                obj = null;
                            }
                        }
                        za31 za31Var = (za31) obj;
                        if (za31Var != null) {
                            mi31Var4 = e(str5, str4, list);
                            if (mi31Var4 == null) {
                                mi31Var4 = a(za31Var);
                            }
                        } else {
                            mi31Var4 = null;
                        }
                        if (mi31Var4 == null) {
                            mi31Var4 = b(list);
                        }
                        mi31Var3 = mi31Var4;
                        break;
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            za31 za31Var2 = (za31) it2.next();
                            Iterator it3 = za31Var2.b.iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    obj2 = it3.next();
                                    pex0 pex0Var2 = ((mi31) obj2).a;
                                    if (pex0Var2.u0 != tariffOrderFlow || !jl40.l(pex0Var2.b, pex0Var.b)) {
                                    }
                                } else {
                                    obj2 = null;
                                }
                            }
                            mi31 mi31Var6 = (mi31) obj2;
                            if (mi31Var6 != null) {
                                mi31Var6.d(za31Var2.d);
                            }
                        }
                        break;
                    default:
                        w511.b();
                        return null;
                }
            }
            if (mi31Var3 == null) {
                return mi31Var3;
            }
            String str8 = mi31Var != null ? mi31Var.f : null;
            if (mi31Var == null || (str = mi31Var.b) == null) {
                str = "";
            }
            return c(str8, str, list);
        }
        mi31Var3 = null;
        if (mi31Var3 == null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v8 */
    public final mi31 e(String str, String str2, List list) {
        Object obj;
        if (str != null) {
            slh slhVar = this.b;
            ?? r2 = EmptyList.a;
            List list2 = slhVar.a;
            ArrayList<String> arrayList = r2;
            if (list2 != null) {
                Iterator it = list2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((List) obj).contains(str)) {
                        break;
                    }
                }
                List list3 = (List) obj;
                arrayList = r2;
                if (list3 != null) {
                    List list4 = list3;
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : list4) {
                        if (jl40.l((String) obj2, str)) {
                            break;
                        }
                        arrayList2.add(obj2);
                    }
                    u1l u1lVar = new u1l(2, arrayList2);
                    if (!list3.isEmpty()) {
                        ListIterator listIterator = list3.listIterator(list3.size());
                        while (true) {
                            if (!listIterator.hasPrevious()) {
                                r2 = a.J0(list4);
                                break;
                            }
                            if (jl40.l((String) listIterator.previous(), str)) {
                                listIterator.next();
                                int size = list3.size() - listIterator.nextIndex();
                                if (size != 0) {
                                    r2 = new ArrayList(size);
                                    while (listIterator.hasNext()) {
                                        r2.add(listIterator.next());
                                    }
                                }
                            }
                        }
                    }
                    arrayList = a.m0((Iterable) r2, u1lVar);
                }
            }
            for (String str3 : arrayList) {
                this.a.getClass();
                mi31 a = qrw.a(str3, str2, list);
                if (a != null) {
                    return a;
                }
                if (gwk0.v(str2)) {
                    this.a.getClass();
                    mi31 a2 = qrw.a(str3, "", list);
                    if (a2 != null) {
                        return a2;
                    }
                }
            }
        }
        return null;
    }
}
