package i1;

import a.AbstractC0083a;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: i1.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0252i extends o {
    public static List G(List list) {
        int size = list.size() - 1;
        if (size < 0) {
            size = 0;
        }
        return O(size, list);
    }

    public static Object H(List list) {
        kotlin.jvm.internal.i.e(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static final void I(Iterable iterable, StringBuilder sb, CharSequence separator, CharSequence prefix, CharSequence postfix, int i2, CharSequence truncated, t1.l lVar) {
        kotlin.jvm.internal.i.e(iterable, "<this>");
        kotlin.jvm.internal.i.e(separator, "separator");
        kotlin.jvm.internal.i.e(prefix, "prefix");
        kotlin.jvm.internal.i.e(postfix, "postfix");
        kotlin.jvm.internal.i.e(truncated, "truncated");
        sb.append(prefix);
        int i3 = 0;
        for (Object obj : iterable) {
            i3++;
            if (i3 > 1) {
                sb.append(separator);
            }
            if (i2 >= 0 && i3 > i2) {
                break;
            } else {
                R1.l.a(sb, obj, lVar);
            }
        }
        if (i2 >= 0 && i3 > i2) {
            sb.append(truncated);
        }
        sb.append(postfix);
    }

    public static String K(Iterable iterable, String str, String str2, String str3, t1.l lVar, int i2) {
        if ((i2 & 1) != 0) {
            str = ", ";
        }
        String separator = str;
        String prefix = (i2 & 2) != 0 ? "" : str2;
        String postfix = (i2 & 4) != 0 ? "" : str3;
        if ((i2 & 32) != 0) {
            lVar = null;
        }
        kotlin.jvm.internal.i.e(iterable, "<this>");
        kotlin.jvm.internal.i.e(separator, "separator");
        kotlin.jvm.internal.i.e(prefix, "prefix");
        kotlin.jvm.internal.i.e(postfix, "postfix");
        StringBuilder sb = new StringBuilder();
        I(iterable, sb, separator, prefix, postfix, -1, "...", lVar);
        return sb.toString();
    }

    public static Object L(List list) {
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(list.size() - 1);
    }

    public static ArrayList M(List list, Object obj) {
        kotlin.jvm.internal.i.e(list, "<this>");
        ArrayList arrayList = new ArrayList(list.size() + 1);
        arrayList.addAll(list);
        arrayList.add(obj);
        return arrayList;
    }

    public static ArrayList N(List list, List elements) {
        kotlin.jvm.internal.i.e(elements, "elements");
        ArrayList arrayList = new ArrayList(elements.size() + list.size());
        arrayList.addAll(list);
        arrayList.addAll(elements);
        return arrayList;
    }

    public static List O(int i2, List list) {
        if (i2 < 0) {
            throw new IllegalArgumentException(C1.a.g(i2, "Requested element count ", " is less than zero.").toString());
        }
        r rVar = r.f3416a;
        if (i2 == 0) {
            return rVar;
        }
        if (i2 >= list.size()) {
            return R(list);
        }
        if (i2 == 1) {
            if (list.isEmpty()) {
                throw new NoSuchElementException("List is empty.");
            }
            return AbstractC0083a.m(list.get(0));
        }
        ArrayList arrayList = new ArrayList(i2);
        Iterator it = list.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i3++;
            if (i3 == i2) {
                break;
            }
        }
        int size = arrayList.size();
        return size != 0 ? size != 1 ? arrayList : AbstractC0083a.m(arrayList.get(0)) : rVar;
    }

    public static final void P(Iterable iterable, AbstractCollection abstractCollection) {
        kotlin.jvm.internal.i.e(iterable, "<this>");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    public static int[] Q(List list) {
        kotlin.jvm.internal.i.e(list, "<this>");
        int[] iArr = new int[list.size()];
        Iterator it = list.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            iArr[i2] = ((Number) it.next()).intValue();
            i2++;
        }
        return iArr;
    }

    public static List R(Iterable iterable) {
        ArrayList arrayList;
        kotlin.jvm.internal.i.e(iterable, "<this>");
        boolean z2 = iterable instanceof Collection;
        r rVar = r.f3416a;
        if (z2) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size == 0) {
                return rVar;
            }
            if (size != 1) {
                return T(collection);
            }
            return AbstractC0083a.m(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
        }
        if (z2) {
            arrayList = T((Collection) iterable);
        } else {
            ArrayList arrayList2 = new ArrayList();
            P(iterable, arrayList2);
            arrayList = arrayList2;
        }
        int size2 = arrayList.size();
        return size2 != 0 ? size2 != 1 ? arrayList : AbstractC0083a.m(arrayList.get(0)) : rVar;
    }

    public static long[] S(Collection collection) {
        kotlin.jvm.internal.i.e(collection, "<this>");
        long[] jArr = new long[collection.size()];
        Iterator it = collection.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            jArr[i2] = ((Number) it.next()).longValue();
            i2++;
        }
        return jArr;
    }

    public static ArrayList T(Collection collection) {
        kotlin.jvm.internal.i.e(collection, "<this>");
        return new ArrayList(collection);
    }

    public static Set U(Collection collection) {
        kotlin.jvm.internal.i.e(collection, "<this>");
        return new LinkedHashSet(collection);
    }

    public static Set V(Iterable iterable) {
        kotlin.jvm.internal.i.e(iterable, "<this>");
        boolean z2 = iterable instanceof Collection;
        t tVar = t.f3418a;
        if (!z2) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            P(iterable, linkedHashSet);
            int size = linkedHashSet.size();
            if (size == 0) {
                return tVar;
            }
            if (size != 1) {
                return linkedHashSet;
            }
            Set singleton = Collections.singleton(linkedHashSet.iterator().next());
            kotlin.jvm.internal.i.d(singleton, "singleton(...)");
            return singleton;
        }
        Collection collection = (Collection) iterable;
        int size2 = collection.size();
        if (size2 == 0) {
            return tVar;
        }
        if (size2 != 1) {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet(v.G(collection.size()));
            P(iterable, linkedHashSet2);
            return linkedHashSet2;
        }
        Set singleton2 = Collections.singleton(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
        kotlin.jvm.internal.i.d(singleton2, "singleton(...)");
        return singleton2;
    }
}
