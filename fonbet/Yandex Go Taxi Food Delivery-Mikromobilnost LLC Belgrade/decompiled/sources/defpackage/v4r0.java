package defpackage;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.a;

/* loaded from: classes9.dex */
public class v4r0 extends u4r0 {
    public static LinkedHashSet f(Set set, Object obj) {
        LinkedHashSet linkedHashSet = new LinkedHashSet(gw00.d(set.size()));
        boolean z = false;
        for (Object obj2 : set) {
            boolean z2 = true;
            if (!z && jl40.l(obj2, obj)) {
                z = true;
                z2 = false;
            }
            if (z2) {
                linkedHashSet.add(obj2);
            }
        }
        return linkedHashSet;
    }

    public static Set g(Set set, Iterable iterable) {
        Collection<?> u = ycc.u(iterable);
        if (u.isEmpty()) {
            return a.N0(set);
        }
        if (!(u instanceof Set)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(set);
            linkedHashSet.removeAll(u);
            return linkedHashSet;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        for (Object obj : set) {
            if (!((Set) u).contains(obj)) {
                linkedHashSet2.add(obj);
            }
        }
        return linkedHashSet2;
    }

    public static LinkedHashSet h(Set set, Iterable iterable) {
        Integer valueOf = iterable instanceof Collection ? Integer.valueOf(((Collection) iterable).size()) : null;
        LinkedHashSet linkedHashSet = new LinkedHashSet(gw00.d(valueOf != null ? set.size() + valueOf.intValue() : set.size() * 2));
        linkedHashSet.addAll(set);
        ycc.r(iterable, linkedHashSet);
        return linkedHashSet;
    }

    public static LinkedHashSet i(Set set, Object obj) {
        LinkedHashSet linkedHashSet = new LinkedHashSet(gw00.d(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(obj);
        return linkedHashSet;
    }
}
