package defpackage;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class x5 extends d6 {
    public static Set AxnhUDtd(ArrayList arrayList) {
        int size = arrayList.size();
        if (size == 0) {
            return zf.NCTxEWno;
        }
        if (size != 1) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(zq.ESscZ9M1(arrayList.size()));
            S7WAX0X5(arrayList, linkedHashSet);
            return linkedHashSet;
        }
        Set singleton = Collections.singleton(arrayList.get(0));
        singleton.getClass();
        return singleton;
    }

    public static List B1cjorwa(Iterable iterable) {
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            return y5.HdOGZAzC(D4B4MtvK(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return wf.NCTxEWno;
        }
        if (size != 1) {
            return new ArrayList(collection);
        }
        return ra.FySoLYna(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    public static int[] CTE3lpUp(List list) {
        int[] iArr = new int[list.size()];
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = ((Number) it.next()).intValue();
            i++;
        }
        return iArr;
    }

    public static final List D4B4MtvK(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return new ArrayList((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        S7WAX0X5(iterable, arrayList);
        return arrayList;
    }

    public static Object ESscZ9M1(List list) {
        list.getClass();
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    public static Object LfKQckgD(List list, int i) {
        list.getClass();
        if (i < 0 || i >= list.size()) {
            return null;
        }
        return list.get(i);
    }

    public static Object LvHlPNBd(List list) {
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(list.size() - 1);
    }

    public static List N2kLh4D5(List list, int i) {
        if (i < 0) {
            m1.Qr9iLBAD("Requested element count ", i, " is less than zero.");
            return null;
        }
        if (i == 0) {
            return wf.NCTxEWno;
        }
        if (i >= list.size()) {
            return B1cjorwa(list);
        }
        if (i == 1) {
            return ra.FySoLYna(ESscZ9M1(list));
        }
        ArrayList arrayList = new ArrayList(i);
        Iterator it = list.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i2++;
            if (i2 == i) {
                break;
            }
        }
        return y5.HdOGZAzC(arrayList);
    }

    public static ArrayList QT4Tf9Dt(Collection collection, Iterable iterable) {
        collection.getClass();
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            d6.KRabZ4CU(iterable, arrayList);
            return arrayList;
        }
        Collection collection2 = (Collection) iterable;
        ArrayList arrayList2 = new ArrayList(collection2.size() + collection.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    public static final void S7WAX0X5(Iterable iterable, AbstractCollection abstractCollection) {
        iterable.getClass();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    public static boolean[] SMax8wMR(List list) {
        boolean[] zArr = new boolean[list.size()];
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            zArr[i] = ((Boolean) it.next()).booleanValue();
            i++;
        }
        return zArr;
    }

    public static String Sjrx9cEN(Iterable iterable, String str, String str2, String str3, zk zkVar, int i) {
        if ((i & 1) != 0) {
            str = ", ";
        }
        String str4 = str;
        String str5 = (i & 2) != 0 ? "" : str2;
        String str6 = (i & 4) != 0 ? "" : str3;
        if ((i & 32) != 0) {
            zkVar = null;
        }
        iterable.getClass();
        StringBuilder sb = new StringBuilder();
        pP9Y2m6O(iterable, sb, str4, str5, str6, "...", zkVar);
        return sb.toString();
    }

    public static Object VGmz0ccI(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static Comparable Wi7iiXC4(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) < 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static ArrayList X1t0wlBd(Collection collection) {
        collection.getClass();
        return new ArrayList(collection);
    }

    public static List XrPeKzBk(Iterable iterable, Comparator comparator) {
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            List D4B4MtvK = D4B4MtvK(iterable);
            if (((ArrayList) D4B4MtvK).size() > 1) {
                Collections.sort(D4B4MtvK, comparator);
            }
            return D4B4MtvK;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return B1cjorwa(iterable);
        }
        Object[] array = collection.toArray(new Object[0]);
        array.getClass();
        if (array.length > 1) {
            Arrays.sort(array, comparator);
        }
        List asList = Arrays.asList(array);
        asList.getClass();
        return asList;
    }

    public static Object dHozS53r(bg bgVar) {
        amk52bBQ amk52bbq = b10.NCTxEWno;
        bgVar.getClass();
        if (bgVar.isEmpty()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        return bgVar.get(b10.NCTxEWno.NCTxEWno(bgVar.qoPGr6Ce()));
    }

    public static List f7oeun2L(Iterable iterable) {
        iterable.getClass();
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return B1cjorwa(iterable);
        }
        List D4B4MtvK = D4B4MtvK(iterable);
        Collections.reverse(D4B4MtvK);
        return D4B4MtvK;
    }

    public static boolean g2aRJUAd(Iterable iterable, Object obj) {
        int i;
        iterable.getClass();
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(obj);
        }
        if (!(iterable instanceof List)) {
            Iterator it = iterable.iterator();
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                Object next = it.next();
                if (i2 < 0) {
                    y5.ZyZthT5G();
                    throw null;
                }
                if (fn.qoPGr6Ce(obj, next)) {
                    i = i2;
                    break;
                }
                i2++;
            }
        } else {
            i = ((List) iterable).indexOf(obj);
        }
        return i >= 0;
    }

    public static Object hGvurcGl(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static ArrayList orhfF2Ya(Collection collection, Object obj) {
        collection.getClass();
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    public static final void pP9Y2m6O(Iterable iterable, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, zk zkVar) {
        iterable.getClass();
        sb.append(charSequence2);
        int i = 0;
        for (Object obj : iterable) {
            i++;
            if (i > 1) {
                sb.append(charSequence);
            }
            e50.qoPGr6Ce(sb, obj, zkVar);
        }
        sb.append(charSequence3);
    }

    public static List uQ3KJUK5(List list) {
        list.getClass();
        if (list.size() <= 1) {
            return B1cjorwa(list);
        }
        Object[] array = list.toArray(new Comparable[0]);
        Comparable[] comparableArr = (Comparable[]) array;
        comparableArr.getClass();
        if (comparableArr.length > 1) {
            Arrays.sort(comparableArr);
        }
        array.getClass();
        List asList = Arrays.asList(array);
        asList.getClass();
        return asList;
    }

    public static Set yzvmSy3z(AbstractCollection abstractCollection) {
        abstractCollection.getClass();
        return new LinkedHashSet(abstractCollection);
    }
}
