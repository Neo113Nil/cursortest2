package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.a;

/* loaded from: classes7.dex */
public final class qj71 {
    public static Set a(List list) {
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((uy71) it.next()).c);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            List singletonList = next instanceof cu81 ? Collections.singletonList(next) : next instanceof d171 ? ((d171) next).c : null;
            if (singletonList != null) {
                arrayList2.add(singletonList);
            }
        }
        return a.N0(tcc.o(arrayList2));
    }
}
