package bc;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class m extends s {
    public static boolean R(Iterable iterable, Object obj) {
        int i10;
        pc.j.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(obj);
        }
        if (!(iterable instanceof List)) {
            Iterator it = iterable.iterator();
            int i11 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i10 = -1;
                    break;
                }
                Object next = it.next();
                if (i11 < 0) {
                    n.N();
                    throw null;
                }
                if (pc.j.a(obj, next)) {
                    i10 = i11;
                    break;
                }
                i11++;
            }
        } else {
            i10 = ((List) iterable).indexOf(obj);
        }
        return i10 >= 0;
    }

    public static List S(List list) {
        pc.j.e(list, "<this>");
        int size = list.size() - 1;
        if (size <= 0) {
            return v.f1067g;
        }
        if (size == 1) {
            return i7.b.z(X(list));
        }
        ArrayList arrayList = new ArrayList(size);
        if (list instanceof RandomAccess) {
            int size2 = list.size();
            for (int i10 = 1; i10 < size2; i10++) {
                arrayList.add(list.get(i10));
            }
        } else {
            ListIterator listIterator = list.listIterator(1);
            while (listIterator.hasNext()) {
                arrayList.add(listIterator.next());
            }
        }
        return arrayList;
    }

    public static Object T(List list) {
        pc.j.e(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    public static Object U(List list) {
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static final void V(Iterable iterable, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, oc.c cVar) {
        pc.j.e(iterable, "<this>");
        sb.append(charSequence2);
        int i10 = 0;
        for (Object obj : iterable) {
            i10++;
            if (i10 > 1) {
                sb.append(charSequence);
            }
            u5.d.a(sb, obj, cVar);
        }
        sb.append(charSequence3);
    }

    public static String W(Iterable iterable, String str, String str2, String str3, oc.c cVar, int i10) {
        if ((i10 & 1) != 0) {
            str = ", ";
        }
        String str4 = str;
        String str5 = (i10 & 2) != 0 ? "" : str2;
        String str6 = (i10 & 4) != 0 ? "" : str3;
        if ((i10 & 32) != 0) {
            cVar = null;
        }
        pc.j.e(iterable, "<this>");
        StringBuilder sb = new StringBuilder();
        V(iterable, sb, str4, str5, str6, "...", cVar);
        String sb2 = sb.toString();
        pc.j.d(sb2, "toString(...)");
        return sb2;
    }

    public static Object X(List list) {
        pc.j.e(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(n.K(list));
    }

    public static Object Y(List list) {
        pc.j.e(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static ArrayList Z(Collection collection, Object obj) {
        pc.j.e(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    public static ArrayList a0(Collection collection, List list) {
        pc.j.e(collection, "<this>");
        pc.j.e(list, "elements");
        ArrayList arrayList = new ArrayList(list.size() + collection.size());
        arrayList.addAll(collection);
        arrayList.addAll(list);
        return arrayList;
    }

    public static List b0(Iterable iterable) {
        pc.j.e(iterable, "<this>");
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return e0(iterable);
        }
        List g02 = g0(iterable);
        Collections.reverse(g02);
        return g02;
    }

    public static List c0(ArrayList arrayList, Comparator comparator) {
        pc.j.e(arrayList, "<this>");
        if (arrayList.size() <= 1) {
            return e0(arrayList);
        }
        Object[] array = arrayList.toArray(new Object[0]);
        pc.j.e(array, "<this>");
        if (array.length > 1) {
            Arrays.sort(array, comparator);
        }
        return l.N(array);
    }

    public static final void d0(Iterable iterable, AbstractCollection abstractCollection) {
        pc.j.e(iterable, "<this>");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    public static List e0(Iterable iterable) {
        pc.j.e(iterable, "<this>");
        boolean z10 = iterable instanceof Collection;
        v vVar = v.f1067g;
        if (!z10) {
            List g02 = g0(iterable);
            ArrayList arrayList = (ArrayList) g02;
            int size = arrayList.size();
            return size != 0 ? size != 1 ? g02 : i7.b.z(arrayList.get(0)) : vVar;
        }
        Collection collection = (Collection) iterable;
        int size2 = collection.size();
        if (size2 == 0) {
            return vVar;
        }
        if (size2 != 1) {
            return f0(collection);
        }
        return i7.b.z(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
    }

    public static ArrayList f0(Collection collection) {
        pc.j.e(collection, "<this>");
        return new ArrayList(collection);
    }

    public static final List g0(Iterable iterable) {
        pc.j.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            return f0((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        d0(iterable, arrayList);
        return arrayList;
    }

    public static Set h0(Iterable iterable) {
        pc.j.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        d0(iterable, linkedHashSet);
        return linkedHashSet;
    }

    public static Set i0(Iterable iterable) {
        pc.j.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet(a0.B(collection.size()));
                    d0(iterable, linkedHashSet);
                    return linkedHashSet;
                }
                Set singleton = Collections.singleton(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
                pc.j.d(singleton, "singleton(...)");
                return singleton;
            }
        } else {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            d0(iterable, linkedHashSet2);
            int size2 = linkedHashSet2.size();
            if (size2 != 0) {
                if (size2 != 1) {
                    return linkedHashSet2;
                }
                Set singleton2 = Collections.singleton(linkedHashSet2.iterator().next());
                pc.j.d(singleton2, "singleton(...)");
                return singleton2;
            }
        }
        return x.f1069g;
    }
}
