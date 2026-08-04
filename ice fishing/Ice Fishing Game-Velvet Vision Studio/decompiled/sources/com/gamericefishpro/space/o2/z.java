package com.gamericefishpro.space.o2;

import com.gamericefishpro.space.b2.d0;
import com.gamericefishpro.space.ph.b0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class z {
    public static final Comparator[] a;
    public static final j b;

    static {
        Comparator[] comparatorArr = new Comparator[2];
        int i = 0;
        while (i < 2) {
            comparatorArr[i] = new y(new y(i == 0 ? f.c : f.b));
            i++;
        }
        a = comparatorArr;
        b = j.N;
    }

    public static final void a(o oVar, ArrayList arrayList, d0 d0Var, d0 d0Var2, com.gamericefishpro.space.t.w wVar) {
        l lVar = oVar.d;
        Object objG = lVar.d.g(s.m);
        if (objG == null) {
            objG = Boolean.FALSE;
        }
        boolean zBooleanValue = ((Boolean) objG).booleanValue();
        if ((zBooleanValue || ((Boolean) d0Var2.invoke(oVar)).booleanValue()) && ((Boolean) d0Var.invoke(oVar)).booleanValue()) {
            arrayList.add(oVar);
        }
        if (zBooleanValue) {
            wVar.h(oVar.g, b(oVar, d0Var, d0Var2, o.j(7, oVar)));
            return;
        }
        List listJ = o.j(7, oVar);
        int size = listJ.size();
        for (int i = 0; i < size; i++) {
            a((o) listJ.get(i), arrayList, d0Var, d0Var2, wVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00d0  */
    public static final ArrayList b(o oVar, d0 d0Var, d0 d0Var2, List list) {
        com.gamericefishpro.space.t.w wVar = com.gamericefishpro.space.t.m.a;
        com.gamericefishpro.space.t.w wVar2 = new com.gamericefishpro.space.t.w();
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            a((o) list.get(i), arrayList, d0Var, d0Var2, wVar2);
        }
        char c = oVar.c.T == com.gamericefishpro.space.c3.l.e ? (char) 1 : (char) 0;
        ArrayList arrayList2 = new ArrayList(arrayList.size() / 2);
        int iE = com.gamericefishpro.space.ph.x.e(arrayList);
        if (iE >= 0) {
            int i2 = 0;
            while (true) {
                o oVar2 = (o) arrayList.get(i2);
                if (i2 == 0) {
                    arrayList2.add(new Pair(oVar2.h(), com.gamericefishpro.space.ph.x.g(oVar2)));
                    break;
                }
                float f = oVar2.h().b;
                float f2 = oVar2.h().d;
                boolean z = f >= f2;
                int iE2 = com.gamericefishpro.space.ph.x.e(arrayList2);
                if (iE2 >= 0) {
                    int i3 = 0;
                    while (true) {
                        com.gamericefishpro.space.n1.c cVar = (com.gamericefishpro.space.n1.c) ((Pair) arrayList2.get(i3)).d;
                        float f3 = cVar.b;
                        float f4 = cVar.d;
                        boolean z2 = f3 >= f4;
                        if (!z && !z2 && Math.max(f, f3) < Math.min(f2, f4)) {
                            arrayList2.set(i3, new Pair(new com.gamericefishpro.space.n1.c(Math.max(cVar.a, 0.0f), Math.max(cVar.b, f), Math.min(cVar.c, Float.POSITIVE_INFINITY), Math.min(f4, f2)), ((Pair) arrayList2.get(i3)).e));
                            ((List) ((Pair) arrayList2.get(i3)).e).add(oVar2);
                            break;
                        }
                        if (i3 != iE2) {
                            i3++;
                        }
                    }
                }
                arrayList2.add(new Pair(oVar2.h(), com.gamericefishpro.space.ph.x.g(oVar2)));
                break;
                if (i2 == iE) {
                    break;
                }
                i2++;
            }
        }
        b0.k(arrayList2, f.d);
        ArrayList arrayList3 = new ArrayList();
        Comparator comparator = a[c ^ 1];
        int size2 = arrayList2.size();
        for (int i4 = 0; i4 < size2; i4++) {
            Pair pair = (Pair) arrayList2.get(i4);
            b0.k((List) pair.e, comparator);
            arrayList3.addAll((Collection) pair.e);
        }
        b0.k(arrayList3, new x(0, b));
        int size3 = 0;
        while (size3 <= com.gamericefishpro.space.ph.x.e(arrayList3)) {
            List list2 = (List) wVar2.b(((o) arrayList3.get(size3)).g);
            if (list2 != null) {
                if (((Boolean) d0Var2.invoke(arrayList3.get(size3))).booleanValue()) {
                    size3++;
                } else {
                    arrayList3.remove(size3);
                }
                arrayList3.addAll(size3, list2);
                size3 += list2.size();
            } else {
                size3++;
            }
        }
        return arrayList3;
    }
}
