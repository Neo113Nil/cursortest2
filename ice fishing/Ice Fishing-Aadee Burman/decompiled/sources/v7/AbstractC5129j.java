package v7;

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

/* renamed from: v7.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5129j extends AbstractC5133n {
    public static Object A(List list) {
        kotlin.jvm.internal.h.e(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    public static Object B(int i, List list) {
        if (i < 0 || i >= list.size()) {
            return null;
        }
        return list.get(i);
    }

    public static final void C(Iterable iterable, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, I7.l lVar) {
        kotlin.jvm.internal.h.e(iterable, "<this>");
        sb.append(charSequence2);
        int i = 0;
        for (Object obj : iterable) {
            i++;
            if (i > 1) {
                sb.append(charSequence);
            }
            O3.b.c(sb, obj, lVar);
        }
        sb.append(charSequence3);
    }

    public static String E(Iterable iterable, String str, String str2, String str3, I7.l lVar, int i) {
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
        C(iterable, sb, str4, prefix, str5, "...", lVar);
        return sb.toString();
    }

    public static Object F(List list) {
        kotlin.jvm.internal.h.e(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(AbstractC5130k.u(list));
    }

    public static Object G(List list) {
        kotlin.jvm.internal.h.e(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static ArrayList H(Collection collection, Iterable iterable) {
        Collection collection2 = (Collection) iterable;
        ArrayList arrayList = new ArrayList(collection2.size() + collection.size());
        arrayList.addAll(collection);
        arrayList.addAll(collection2);
        return arrayList;
    }

    public static List I(Collection collection) {
        kotlin.jvm.internal.h.e(collection, "<this>");
        if (collection.size() <= 1) {
            return L(collection);
        }
        List N8 = N(collection);
        Collections.reverse(N8);
        return N8;
    }

    public static List J(List list) {
        kotlin.jvm.internal.h.e(list, "<this>");
        if (list.size() <= 1) {
            return L(list);
        }
        Object[] array = list.toArray(new Comparable[0]);
        Comparable[] comparableArr = (Comparable[]) array;
        kotlin.jvm.internal.h.e(comparableArr, "<this>");
        if (comparableArr.length > 1) {
            Arrays.sort(comparableArr);
        }
        return AbstractC5128i.q(array);
    }

    public static final void K(Iterable iterable, AbstractCollection abstractCollection) {
        kotlin.jvm.internal.h.e(iterable, "<this>");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    public static List L(Iterable iterable) {
        kotlin.jvm.internal.h.e(iterable, "<this>");
        boolean z3 = iterable instanceof Collection;
        C5135p c5135p = C5135p.f41439n;
        if (!z3) {
            List N8 = N(iterable);
            ArrayList arrayList = (ArrayList) N8;
            int size = arrayList.size();
            return size != 0 ? size != 1 ? N8 : d6.c.k(arrayList.get(0)) : c5135p;
        }
        Collection collection = (Collection) iterable;
        int size2 = collection.size();
        if (size2 == 0) {
            return c5135p;
        }
        if (size2 != 1) {
            return M(collection);
        }
        return d6.c.k(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    public static ArrayList M(Collection collection) {
        kotlin.jvm.internal.h.e(collection, "<this>");
        return new ArrayList(collection);
    }

    public static final List N(Iterable iterable) {
        kotlin.jvm.internal.h.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            return M((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        K(iterable, arrayList);
        return arrayList;
    }

    public static Set O(Collection collection) {
        kotlin.jvm.internal.h.e(collection, "<this>");
        return new LinkedHashSet(collection);
    }

    public static Set P(Collection collection) {
        kotlin.jvm.internal.h.e(collection, "<this>");
        r rVar = r.f41441n;
        int size = collection.size();
        if (size == 0) {
            return rVar;
        }
        if (size != 1) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(t.P(collection.size()));
            K(collection, linkedHashSet);
            return linkedHashSet;
        }
        Set singleton = Collections.singleton(collection instanceof List ? ((List) collection).get(0) : collection.iterator().next());
        kotlin.jvm.internal.h.d(singleton, "singleton(...)");
        return singleton;
    }

    public static void z(Iterable elements, AbstractCollection abstractCollection) {
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
}
