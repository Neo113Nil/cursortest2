package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public interface kfh {
    default int a(fxe fxeVar, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new ln7((ffh) list.get(i2), gxe.b, jxe.a, 0));
        }
        return b(new sxe(fxeVar, fxeVar.getLayoutDirection()), arrayList, ia6.b(0, i, 7)).c();
    }

    lfh b(mfh mfhVar, List list, long j);

    default int c(fxe fxeVar, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new ln7((ffh) list.get(i2), gxe.a, jxe.a, 0));
        }
        return b(new sxe(fxeVar, fxeVar.getLayoutDirection()), arrayList, ia6.b(0, i, 7)).c();
    }

    default int d(fxe fxeVar, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new ln7((ffh) list.get(i2), gxe.b, jxe.b, 0));
        }
        return b(new sxe(fxeVar, fxeVar.getLayoutDirection()), arrayList, ia6.b(i, 0, 13)).a();
    }

    default int e(fxe fxeVar, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new ln7((ffh) list.get(i2), gxe.a, jxe.b, 0));
        }
        return b(new sxe(fxeVar, fxeVar.getLayoutDirection()), arrayList, ia6.b(i, 0, 13)).a();
    }
}
