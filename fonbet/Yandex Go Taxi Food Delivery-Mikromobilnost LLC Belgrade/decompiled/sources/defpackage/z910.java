package defpackage;

import androidx.compose.ui.layout.IntrinsicMinMax;
import androidx.compose.ui.layout.IntrinsicWidthHeight;
import androidx.compose.ui.layout.d;
import androidx.compose.ui.layout.k;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public interface z910 {
    aa10 b(k kVar, List list, long j);

    default int e(yuw yuwVar, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new ldh((x910) list.get(i2), IntrinsicMinMax.Max, IntrinsicWidthHeight.Width));
        }
        return b(new d(yuwVar, yuwVar.getLayoutDirection()), arrayList, p8e.b(0, 0, 0, i, 7)).getWidth();
    }

    default int f(yuw yuwVar, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new ldh((x910) list.get(i2), IntrinsicMinMax.Min, IntrinsicWidthHeight.Width));
        }
        return b(new d(yuwVar, yuwVar.getLayoutDirection()), arrayList, p8e.b(0, 0, 0, i, 7)).getWidth();
    }

    default int g(yuw yuwVar, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new ldh((x910) list.get(i2), IntrinsicMinMax.Max, IntrinsicWidthHeight.Height));
        }
        return b(new d(yuwVar, yuwVar.getLayoutDirection()), arrayList, p8e.b(0, i, 0, 0, 13)).getHeight();
    }

    default int i(yuw yuwVar, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new ldh((x910) list.get(i2), IntrinsicMinMax.Min, IntrinsicWidthHeight.Height));
        }
        return b(new d(yuwVar, yuwVar.getLayoutDirection()), arrayList, p8e.b(0, i, 0, 0, 13)).getHeight();
    }
}
