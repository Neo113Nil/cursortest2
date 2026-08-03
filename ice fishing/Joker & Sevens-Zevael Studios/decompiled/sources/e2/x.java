package e2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class x {

    /* renamed from: a, reason: collision with root package name */
    public static final Comparator[] f2059a;

    /* renamed from: b, reason: collision with root package name */
    public static final r f2060b;

    static {
        Comparator[] comparatorArr = new Comparator[2];
        int i10 = 0;
        while (i10 < 2) {
            comparatorArr[i10] = new w(new w(i10 == 0 ? e.f1951c : e.f1950b));
            i10++;
        }
        f2059a = comparatorArr;
        f2060b = r.f2023x;
    }

    public static final void a(n nVar, ArrayList arrayList, wc.i iVar, wc.i iVar2, s.u uVar) {
        j jVar = nVar.f1996d;
        Object g8 = jVar.f1985g.g(s.f2037m);
        if (g8 == null) {
            g8 = Boolean.FALSE;
        }
        boolean booleanValue = ((Boolean) g8).booleanValue();
        if ((booleanValue || ((Boolean) iVar2.invoke(nVar)).booleanValue()) && ((Boolean) iVar.invoke(nVar)).booleanValue()) {
            arrayList.add(nVar);
        }
        if (booleanValue) {
            uVar.h(nVar.f1999g, b(nVar, iVar, iVar2, n.j(7, nVar)));
            return;
        }
        List j3 = n.j(7, nVar);
        int size = j3.size();
        for (int i10 = 0; i10 < size; i10++) {
            a((n) j3.get(i10), arrayList, iVar, iVar2, uVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00e8 A[LOOP:1: B:11:0x0044->B:29:0x00e8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ee A[EDGE_INSN: B:30:0x00ee->B:31:0x00ee BREAK  A[LOOP:1: B:11:0x0044->B:29:0x00e8], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final ArrayList b(n nVar, wc.i iVar, wc.i iVar2, List list) {
        int i10;
        s.u uVar = s.l.f6301a;
        s.u uVar2 = new s.u();
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            a((n) list.get(i11), arrayList, iVar, iVar2, uVar2);
        }
        char c3 = nVar.f1995c.C == s2.l.f6397h ? (char) 1 : (char) 0;
        ArrayList arrayList2 = new ArrayList(arrayList.size() / 2);
        int K = bc.n.K(arrayList);
        if (K >= 0) {
            int i12 = 0;
            while (true) {
                n nVar2 = (n) arrayList.get(i12);
                if (i12 != 0) {
                    float f10 = nVar2.h().f1932b;
                    float f11 = nVar2.h().f1934d;
                    boolean z10 = f10 >= f11;
                    int K2 = bc.n.K(arrayList2);
                    if (K2 >= 0) {
                        int i13 = 0;
                        while (true) {
                            e1.c cVar = (e1.c) ((ac.i) arrayList2.get(i13)).f270g;
                            float f12 = cVar.f1932b;
                            i10 = 1;
                            float f13 = cVar.f1934d;
                            boolean z11 = f12 >= f13;
                            if (!z10 && !z11 && Math.max(f10, f12) < Math.min(f11, f13)) {
                                arrayList2.set(i13, new ac.i(new e1.c(Math.max(cVar.f1931a, 0.0f), Math.max(cVar.f1932b, f10), Math.min(cVar.f1933c, Float.POSITIVE_INFINITY), Math.min(f13, f11)), ((ac.i) arrayList2.get(i13)).f271h));
                                ((List) ((ac.i) arrayList2.get(i13)).f271h).add(nVar2);
                                break;
                            }
                            if (i13 == K2) {
                                break;
                            }
                            i13++;
                        }
                        if (i12 != K) {
                            break;
                        }
                        i12++;
                    }
                }
                i10 = 1;
                arrayList2.add(new ac.i(nVar2.h(), bc.n.M(nVar2)));
                if (i12 != K) {
                }
            }
        } else {
            i10 = 1;
        }
        bc.r.P(arrayList2, e.f1952d);
        ArrayList arrayList3 = new ArrayList();
        Comparator comparator = f2059a[c3 ^ 1];
        int size2 = arrayList2.size();
        for (int i14 = 0; i14 < size2; i14++) {
            ac.i iVar3 = (ac.i) arrayList2.get(i14);
            bc.r.P((List) iVar3.f271h, comparator);
            arrayList3.addAll((Collection) iVar3.f271h);
        }
        bc.r.P(arrayList3, new dc.a(i10, f2060b));
        int i15 = 0;
        while (i15 <= bc.n.K(arrayList3)) {
            List list2 = (List) uVar2.b(((n) arrayList3.get(i15)).f1999g);
            if (list2 != null) {
                if (((Boolean) iVar2.invoke(arrayList3.get(i15))).booleanValue()) {
                    i15++;
                } else {
                    arrayList3.remove(i15);
                }
                arrayList3.addAll(i15, list2);
                i15 += list2.size();
            } else {
                i15++;
            }
        }
        return arrayList3;
    }
}
