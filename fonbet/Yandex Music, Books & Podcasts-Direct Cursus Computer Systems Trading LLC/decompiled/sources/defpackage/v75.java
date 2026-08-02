package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Pair;

/* loaded from: classes5.dex */
public class v75 extends u75 {
    public static int o(Iterable iterable, int i) {
        iterable.getClass();
        return iterable instanceof Collection ? ((Collection) iterable).size() : i;
    }

    public static ArrayList p(Iterable iterable) {
        iterable.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            z75.t(arrayList, (Iterable) it.next());
        }
        return arrayList;
    }

    public static Pair q(Iterable iterable) {
        int o = o(iterable, 10);
        ArrayList arrayList = new ArrayList(o);
        ArrayList arrayList2 = new ArrayList(o);
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            arrayList.add(pair.a);
            arrayList2.add(pair.b);
        }
        return new Pair(arrayList, arrayList2);
    }
}
