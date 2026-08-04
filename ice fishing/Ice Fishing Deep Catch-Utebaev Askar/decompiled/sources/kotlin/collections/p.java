package kotlin.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public class p extends o {
    public static final int c(Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        return 10;
    }

    public static final ArrayList d(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Iterable elements = (Iterable) it.next();
            Intrinsics.checkNotNullParameter(arrayList2, "<this>");
            Intrinsics.checkNotNullParameter(elements, "elements");
            if (elements instanceof Collection) {
                arrayList2.addAll((Collection) elements);
            } else {
                Iterator it2 = elements.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(it2.next());
                }
            }
        }
        return arrayList2;
    }
}
