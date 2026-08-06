package defpackage;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public abstract class wb extends vb {
    public static Object K0ReC6MK(ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            return arrayList.remove(0);
        }
        o4.AvO7iQsrTN("List is empty.");
        return null;
    }

    public static Object iriv6doqetn(AbstractList abstractList) {
        abstractList.getClass();
        if (abstractList.isEmpty()) {
            return null;
        }
        return abstractList.remove(abstractList.size() - 1);
    }

    public static void nXl1EmE5(AbstractList abstractList, Iterable iterable) {
        abstractList.getClass();
        iterable.getClass();
        if (iterable instanceof Collection) {
            abstractList.addAll((Collection) iterable);
            return;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractList.add(it.next());
        }
    }
}
