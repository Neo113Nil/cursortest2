package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.a;
import kotlin.collections.builders.ListBuilder;

/* loaded from: classes11.dex */
public final class swh {
    public final ArrayList a;

    public swh(nyk0 nyk0Var, nyk0 nyk0Var2) {
        Throwable th;
        Pair pair;
        Pair pair2;
        fa10 c = njb1.c(new iq31(nyk0Var.b, nyk0Var.c), nyk0Var);
        fa10 c2 = njb1.c(new iq31(nyk0Var2.b, nyk0Var2.c), nyk0Var2);
        List list = c.c;
        List list2 = c2.c;
        ListBuilder a = rcc.a();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((fkf0) list.get(i)).b instanceof dkp) {
                a.add(list.get(i));
            }
        }
        ListBuilder j = a.j();
        ListBuilder a2 = rcc.a();
        int size2 = list2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            if (((fkf0) list2.get(i2)).b instanceof dkp) {
                a2.add(list2.get(i2));
            }
        }
        ListBuilder j2 = a2.j();
        Pair pair3 = j.size() > j2.size() ? new Pair(zka1.b(j2, j), j2) : new Pair(j, zka1.b(j, j2));
        List list3 = (List) pair3.getFirst();
        List list4 = (List) pair3.getSecond();
        ListBuilder a3 = rcc.a();
        int size3 = list3.size();
        for (int i3 = 0; i3 < size3 && i3 != list4.size(); i3++) {
            a3.add(new Pair(Float.valueOf(((fkf0) list3.get(i3)).a), Float.valueOf(((fkf0) list4.get(i3)).a)));
        }
        Pair[] pairArr = (Pair[]) a3.j().toArray(new Pair[0]);
        t5m t5mVar = new t5m((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        rx40 rx40Var = t5mVar.a;
        rx40 rx40Var2 = t5mVar.b;
        float d = ppa1.d(rx40Var, rx40Var2, 0.0f);
        ArrayList arrayList = c2.b;
        if (0.0f > d || d > 1.0f) {
            ny61.g("Cutting point is expected to be between 0 and 1");
            throw null;
        }
        if (d < 1.0E-4f) {
            th = null;
        } else {
            Iterator it = arrayList.iterator();
            int i4 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i4 = -1;
                    break;
                }
                ea10 ea10Var = (ea10) it.next();
                float f = ea10Var.c;
                if (d <= ea10Var.d && f <= d) {
                    break;
                } else {
                    i4++;
                }
            }
            Pair a4 = ((ea10) arrayList.get(i4)).a(d);
            ea10 ea10Var2 = (ea10) a4.getFirst();
            ArrayList i5 = scc.i(((ea10) a4.getSecond()).a);
            int size4 = arrayList.size();
            for (int i6 = 1; i6 < size4; i6++) {
                i5.add(((ea10) arrayList.get((i6 + i4) % arrayList.size())).a);
            }
            th = null;
            i5.add(ea10Var2.a);
            rx40 rx40Var3 = new rx40(arrayList.size() + 2);
            int size5 = arrayList.size() + 2;
            int i7 = 0;
            while (i7 < size5) {
                rx40Var3.a(i7 == 0 ? 0.0f : i7 == arrayList.size() + 1 ? 1.0f : ex21.d(((ea10) arrayList.get(((i4 + i7) - 1) % arrayList.size())).d - d, 1.0f));
                i7++;
            }
            ListBuilder a5 = rcc.a();
            int size6 = list2.size();
            for (int i8 = 0; i8 < size6; i8++) {
                a5.add(new fkf0(ex21.d(((fkf0) list2.get(i8)).a - d, 1.0f), ((fkf0) list2.get(i8)).b));
            }
            c2 = new fa10(c2.a, a5.j(), i5, rx40Var3);
        }
        ArrayList arrayList2 = new ArrayList();
        ea10 ea10Var3 = (ea10) a.S(0, c);
        ea10 ea10Var4 = (ea10) a.S(0, c2);
        int i9 = 1;
        int i10 = 1;
        while (ea10Var3 != null && ea10Var4 != null) {
            float f2 = i10 == c.size() ? 1.0f : ea10Var3.d;
            float d2 = i9 == c2.size() ? 1.0f : ppa1.d(rx40Var2, rx40Var, ex21.d(ea10Var4.d + d, 1.0f));
            float min = Math.min(f2, d2);
            float f3 = 1.0E-6f + min;
            if (f2 > f3) {
                pair = ea10Var3.a(min);
            } else {
                Pair pair4 = new Pair(ea10Var3, a.S(i10, c));
                i10++;
                pair = pair4;
            }
            ea10 ea10Var5 = (ea10) pair.getFirst();
            ea10Var3 = (ea10) pair.getSecond();
            if (d2 > f3) {
                pair2 = ea10Var4.a(ex21.d(ppa1.d(rx40Var, rx40Var2, min) - d, 1.0f));
            } else {
                Pair pair5 = new Pair(ea10Var4, a.S(i9, c2));
                i9++;
                pair2 = pair5;
            }
            ea10 ea10Var6 = (ea10) pair2.getFirst();
            ea10Var4 = (ea10) pair2.getSecond();
            arrayList2.add(new Pair(ea10Var5.a, ea10Var6.a));
        }
        if (ea10Var3 != null || ea10Var4 != null) {
            ny61.g("Expected both Polygon's Cubic to be fully matched");
            throw th;
        }
        this.a = arrayList2;
    }

    public /* synthetic */ swh(ArrayList arrayList) {
        this.a = arrayList;
    }

    public swh() {
        this.a = new ArrayList();
    }
}
