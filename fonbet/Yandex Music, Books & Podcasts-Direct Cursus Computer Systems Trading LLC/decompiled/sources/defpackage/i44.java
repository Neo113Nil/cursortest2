package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class i44 {
    public static final String h = f1d.g("Collection.Carousel.", "Repository");
    public final p34 a;
    public final tf6 b;
    public final rhp c;
    public final rhp d;
    public final xdr e;
    public final xdr f;
    public final jyr g;

    public i44(p34 p34Var) {
        p34Var.getClass();
        this.a = p34Var;
        this.b = gld.e(dm6.b());
        this.c = new rhp();
        this.d = new rhp();
        this.e = ydr.a(null);
        this.f = ydr.a(null);
        this.g = btf.b(wg.f);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0097 A[LOOP:1: B:28:0x0091->B:30:0x0097, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f1 A[LOOP:3: B:50:0x00eb->B:52:0x00f1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(i44 i44Var, cg6 cg6Var) {
        g44 g44Var;
        int i;
        int a;
        Iterator it;
        Iterator it2;
        if (cg6Var instanceof g44) {
            g44Var = (g44) cg6Var;
            int i2 = g44Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                g44Var.l = i2 - Integer.MIN_VALUE;
                Object obj = g44Var.j;
                nm6 nm6Var = nm6.a;
                i = g44Var.l;
                Continuation continuation = null;
                if (i != 0) {
                    qgg.h0(obj);
                    g44Var.l = 1;
                    obj = x97.V(dm6.b, new cs1(i44Var, continuation, 18), g44Var);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                List<q44> list = (List) obj;
                ArrayList arrayList = new ArrayList();
                for (q44 q44Var : list) {
                    f24 f24Var = q44Var.a;
                    Long l = q44Var.b;
                    Pair pair = l != null ? new Pair(f24Var, new Long(l.longValue())) : null;
                    if (pair != null) {
                        arrayList.add(pair);
                    }
                }
                a = tah.a(v75.o(arrayList, 10));
                if (a < 16) {
                    a = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(a);
                it = arrayList.iterator();
                while (it.hasNext()) {
                    Pair pair2 = (Pair) it.next();
                    linkedHashMap.put(pair2.a, pair2.b);
                }
                ArrayList arrayList2 = new ArrayList();
                for (q44 q44Var2 : list) {
                    f24 f24Var2 = q44Var2.a;
                    Long l2 = q44Var2.c;
                    Pair pair3 = l2 != null ? new Pair(f24Var2, new Long(l2.longValue())) : null;
                    if (pair3 != null) {
                        arrayList2.add(pair3);
                    }
                }
                int a2 = tah.a(v75.o(arrayList2, 10));
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(a2 >= 16 ? a2 : 16);
                it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    Pair pair4 = (Pair) it2.next();
                    linkedHashMap2.put(pair4.a, pair4.b);
                }
                return new a44(linkedHashMap2, linkedHashMap);
            }
        }
        g44Var = new g44(i44Var, cg6Var);
        Object obj2 = g44Var.j;
        nm6 nm6Var2 = nm6.a;
        i = g44Var.l;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        List<q44> list2 = (List) obj2;
        ArrayList arrayList3 = new ArrayList();
        while (r0.hasNext()) {
        }
        a = tah.a(v75.o(arrayList3, 10));
        if (a < 16) {
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(a);
        it = arrayList3.iterator();
        while (it.hasNext()) {
        }
        ArrayList arrayList22 = new ArrayList();
        while (r9.hasNext()) {
        }
        int a22 = tah.a(v75.o(arrayList22, 10));
        LinkedHashMap linkedHashMap22 = new LinkedHashMap(a22 >= 16 ? a22 : 16);
        it2 = arrayList22.iterator();
        while (it2.hasNext()) {
        }
        return new a44(linkedHashMap22, linkedHashMap3);
    }

    public static List c(List... listArr) {
        ArrayList arrayList = new ArrayList();
        for (List list : listArr) {
            if (list == null) {
                list = c5b.a;
            }
            z75.t(arrayList, list);
        }
        return CollectionsKt.q0(CollectionsKt.o0(arrayList, new C1318t(28)), 20);
    }

    public final void b(String str) {
        Continuation continuation = null;
        ssg.a(3, h, "refreshed by ".concat(str), null);
        h44 h44Var = new h44(this, continuation, 0);
        tf6 tf6Var = this.b;
        rar y = x97.y(tf6Var, null, null, h44Var, 3);
        rhp rhpVar = this.c;
        rhpVar.getClass();
        rhpVar.c(y);
        rar y2 = x97.y(tf6Var, null, null, new h44(this, continuation, 1), 3);
        rhp rhpVar2 = this.d;
        rhpVar2.getClass();
        rhpVar2.c(y2);
    }
}
