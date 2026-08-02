package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public interface ggi {
    default int a(fxe fxeVar, List list, int i) {
        ArrayList arrayList = (ArrayList) list;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            List list2 = (List) arrayList.get(i2);
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList3.add(new ln7((ffh) list2.get(i3), gxe.b, jxe.a, 0));
            }
            arrayList2.add(arrayList3);
        }
        return b(new sxe(fxeVar, fxeVar.getLayoutDirection()), arrayList2, ia6.b(0, i, 7)).c();
    }

    lfh b(mfh mfhVar, List list, long j);

    default int c(fxe fxeVar, List list, int i) {
        ArrayList arrayList = (ArrayList) list;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            List list2 = (List) arrayList.get(i2);
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList3.add(new ln7((ffh) list2.get(i3), gxe.a, jxe.a, 0));
            }
            arrayList2.add(arrayList3);
        }
        return b(new sxe(fxeVar, fxeVar.getLayoutDirection()), arrayList2, ia6.b(0, i, 7)).c();
    }

    default int d(fxe fxeVar, List list, int i) {
        ArrayList arrayList = (ArrayList) list;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            List list2 = (List) arrayList.get(i2);
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList3.add(new ln7((ffh) list2.get(i3), gxe.b, jxe.b, 0));
            }
            arrayList2.add(arrayList3);
        }
        return b(new sxe(fxeVar, fxeVar.getLayoutDirection()), arrayList2, ia6.b(i, 0, 13)).a();
    }

    default int e(fxe fxeVar, List list, int i) {
        ArrayList arrayList = (ArrayList) list;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            List list2 = (List) arrayList.get(i2);
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList3.add(new ln7((ffh) list2.get(i3), gxe.a, jxe.b, 0));
            }
            arrayList2.add(arrayList3);
        }
        return b(new sxe(fxeVar, fxeVar.getLayoutDirection()), arrayList2, ia6.b(i, 0, 13)).a();
    }
}
