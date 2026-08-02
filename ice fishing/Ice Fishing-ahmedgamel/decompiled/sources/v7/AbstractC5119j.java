package v7;

import N3.C;
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
public abstract class AbstractC5119j extends AbstractC5123n {
    public static final void A(Iterable iterable, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, I7.l lVar) {
        kotlin.jvm.internal.h.e(iterable, "<this>");
        sb.append(charSequence2);
        int i = 0;
        for (Object obj : iterable) {
            i++;
            if (i > 1) {
                sb.append(charSequence);
            }
            C.y(sb, obj, lVar);
        }
        sb.append(charSequence3);
    }

    public static String C(Iterable iterable, String str, String str2, String str3, I7.l lVar, int i) {
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
        A(iterable, sb, str4, prefix, str5, "...", lVar);
        return sb.toString();
    }

    public static Object D(List list) {
        kotlin.jvm.internal.h.e(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(AbstractC5120k.s(list));
    }

    public static Object E(List list) {
        kotlin.jvm.internal.h.e(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static ArrayList F(Collection collection, Iterable iterable) {
        Collection collection2 = (Collection) iterable;
        ArrayList arrayList = new ArrayList(collection2.size() + collection.size());
        arrayList.addAll(collection);
        arrayList.addAll(collection2);
        return arrayList;
    }

    public static List G(Collection collection) {
        kotlin.jvm.internal.h.e(collection, "<this>");
        if (collection.size() <= 1) {
            return J(collection);
        }
        List L2 = L(collection);
        Collections.reverse(L2);
        return L2;
    }

    public static List H(List list) {
        kotlin.jvm.internal.h.e(list, "<this>");
        if (list.size() <= 1) {
            return J(list);
        }
        Object[] array = list.toArray(new Comparable[0]);
        Comparable[] comparableArr = (Comparable[]) array;
        kotlin.jvm.internal.h.e(comparableArr, "<this>");
        if (comparableArr.length > 1) {
            Arrays.sort(comparableArr);
        }
        return AbstractC5118i.t(array);
    }

    public static final void I(Iterable iterable, AbstractCollection abstractCollection) {
        kotlin.jvm.internal.h.e(iterable, "<this>");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    public static List J(Iterable iterable) {
        kotlin.jvm.internal.h.e(iterable, "<this>");
        boolean z6 = iterable instanceof Collection;
        C5125p c5125p = C5125p.f41221n;
        if (!z6) {
            List L2 = L(iterable);
            ArrayList arrayList = (ArrayList) L2;
            int size = arrayList.size();
            return size != 0 ? size != 1 ? L2 : Z2.d.n(arrayList.get(0)) : c5125p;
        }
        Collection collection = (Collection) iterable;
        int size2 = collection.size();
        if (size2 == 0) {
            return c5125p;
        }
        if (size2 != 1) {
            return K(collection);
        }
        return Z2.d.n(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    public static ArrayList K(Collection collection) {
        kotlin.jvm.internal.h.e(collection, "<this>");
        return new ArrayList(collection);
    }

    public static final List L(Iterable iterable) {
        kotlin.jvm.internal.h.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            return K((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        I(iterable, arrayList);
        return arrayList;
    }

    public static Set M(Collection collection) {
        kotlin.jvm.internal.h.e(collection, "<this>");
        return new LinkedHashSet(collection);
    }

    public static Set N(Collection collection) {
        kotlin.jvm.internal.h.e(collection, "<this>");
        r rVar = r.f41223n;
        int size = collection.size();
        if (size == 0) {
            return rVar;
        }
        if (size != 1) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(t.t(collection.size()));
            I(collection, linkedHashSet);
            return linkedHashSet;
        }
        Set singleton = Collections.singleton(collection instanceof List ? ((List) collection).get(0) : collection.iterator().next());
        kotlin.jvm.internal.h.d(singleton, "singleton(...)");
        return singleton;
    }

    public static void x(Iterable elements, AbstractCollection abstractCollection) {
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

    public static Object y(List list) {
        kotlin.jvm.internal.h.e(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    public static Object z(int i, List list) {
        if (i < 0 || i >= list.size()) {
            return null;
        }
        return list.get(i);
    }
}
