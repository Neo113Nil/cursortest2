package r7;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: r7.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4979j extends AbstractC4983n {
    public static void F(Iterable elements, AbstractCollection abstractCollection) {
        kotlin.jvm.internal.h.e(elements, "elements");
        if (elements instanceof Collection) {
            abstractCollection.addAll((Collection) elements);
            return;
        }
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    public static Object G(List list) {
        kotlin.jvm.internal.h.e(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    public static Object H(int i, List list) {
        if (i < 0 || i >= list.size()) {
            return null;
        }
        return list.get(i);
    }

    public static final void I(Iterable iterable, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, E7.l lVar) {
        kotlin.jvm.internal.h.e(iterable, "<this>");
        sb.append(charSequence2);
        int i = 0;
        for (Object obj : iterable) {
            i++;
            if (i > 1) {
                sb.append(charSequence);
            }
            w8.a.a(sb, obj, lVar);
        }
        sb.append(charSequence3);
    }

    public static String K(Iterable iterable, String str, String str2, String str3, E7.l lVar, int i) {
        if ((i & 1) != 0) {
            str = ", ";
        }
        String str4 = str;
        String prefix = (i & 2) != 0 ? "" : str2;
        String str5 = (i & 4) != 0 ? "" : str3;
        if ((i & 32) != 0) {
            lVar = null;
        }
        kotlin.jvm.internal.h.e(iterable, "<this>");
        kotlin.jvm.internal.h.e(prefix, "prefix");
        StringBuilder sb = new StringBuilder();
        I(iterable, sb, str4, prefix, str5, "...", lVar);
        return sb.toString();
    }

    public static Object L(List list) {
        kotlin.jvm.internal.h.e(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(AbstractC4980k.A(list));
    }

    public static Object M(List list) {
        kotlin.jvm.internal.h.e(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static ArrayList N(Collection collection, Iterable iterable) {
        Collection collection2 = (Collection) iterable;
        ArrayList arrayList = new ArrayList(collection2.size() + collection.size());
        arrayList.addAll(collection);
        arrayList.addAll(collection2);
        return arrayList;
    }

    public static List O(Collection collection) {
        kotlin.jvm.internal.h.e(collection, "<this>");
        if (collection.size() <= 1) {
            return R(collection);
        }
        List T8 = T(collection);
        Collections.reverse(T8);
        return T8;
    }

    public static List P(List list) {
        kotlin.jvm.internal.h.e(list, "<this>");
        if (list.size() <= 1) {
            return R(list);
        }
        Object[] array = list.toArray(new Comparable[0]);
        Comparable[] comparableArr = (Comparable[]) array;
        kotlin.jvm.internal.h.e(comparableArr, "<this>");
        if (comparableArr.length > 1) {
            Arrays.sort(comparableArr);
        }
        return AbstractC4978i.H(array);
    }

    public static final void Q(Iterable iterable, AbstractCollection abstractCollection) {
        kotlin.jvm.internal.h.e(iterable, "<this>");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    public static List R(Iterable iterable) {
        kotlin.jvm.internal.h.e(iterable, "<this>");
        boolean z8 = iterable instanceof Collection;
        C4985p c4985p = C4985p.f40358n;
        if (!z8) {
            List T8 = T(iterable);
            ArrayList arrayList = (ArrayList) T8;
            int size = arrayList.size();
            return size != 0 ? size != 1 ? T8 : p8.g.k(arrayList.get(0)) : c4985p;
        }
        Collection collection = (Collection) iterable;
        int size2 = collection.size();
        if (size2 == 0) {
            return c4985p;
        }
        if (size2 != 1) {
            return S(collection);
        }
        return p8.g.k(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    public static ArrayList S(Collection collection) {
        kotlin.jvm.internal.h.e(collection, "<this>");
        return new ArrayList(collection);
    }

    public static final List T(Iterable iterable) {
        kotlin.jvm.internal.h.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            return S((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        Q(iterable, arrayList);
        return arrayList;
    }

    public static Set U(Collection collection) {
        kotlin.jvm.internal.h.e(collection, "<this>");
        return new LinkedHashSet(collection);
    }

    public static Set V(Collection collection) {
        kotlin.jvm.internal.h.e(collection, "<this>");
        r rVar = r.f40360n;
        int size = collection.size();
        if (size == 0) {
            return rVar;
        }
        if (size != 1) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(t.z(collection.size()));
            Q(collection, linkedHashSet);
            return linkedHashSet;
        }
        Set singleton = Collections.singleton(collection instanceof List ? ((List) collection).get(0) : collection.iterator().next());
        kotlin.jvm.internal.h.d(singleton, "singleton(...)");
        return singleton;
    }
}
