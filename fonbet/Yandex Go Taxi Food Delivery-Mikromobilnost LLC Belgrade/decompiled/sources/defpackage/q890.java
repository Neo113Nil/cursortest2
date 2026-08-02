package defpackage;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes10.dex */
public abstract class q890 {
    public static final da10 a(t5y t5yVar, int i, long j, p890 p890Var, long j2, Orientation orientation, to5 to5Var, LayoutDirection layoutDirection, int i2, wx40 wx40Var) {
        List list;
        Object c = p890Var.c(i);
        List list2 = (List) wx40Var.b(i);
        if (list2 != null) {
            list = list2;
        } else {
            List a = t5yVar.a(i);
            int size = a.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i3 = 0; i3 < size; i3++) {
                arrayList.add(((x910) a.get(i3)).l0(j));
            }
            wx40Var.i(i, arrayList);
            list = arrayList;
        }
        return new da10(i, i2, list, j2, c, orientation, to5Var, layoutDirection);
    }
}
