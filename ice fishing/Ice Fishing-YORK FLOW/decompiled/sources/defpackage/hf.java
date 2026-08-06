package defpackage;

/* loaded from: classes.dex */
public abstract class hf extends defpackage.nf {
    public static java.lang.Object EgL5gQQnyJKX(java.util.List list) {
        list.getClass();
        if (list.isEmpty()) {
            throw new java.util.NoSuchElementException("List is empty.");
        }
        return list.get(list.size() - 1);
    }

    public static java.lang.Object FhgBoOud6zyW(java.util.List list) {
        list.getClass();
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static java.util.List GoIRkIe1iwj6(java.util.List list) {
        int size = list.size() - 1;
        if (size <= 0) {
            return defpackage.av.WDYagTQQm9ns;
        }
        if (size == 1) {
            return defpackage.ma0.VFeft99leXEK(EgL5gQQnyJKX(list));
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(size);
        if (list instanceof java.util.RandomAccess) {
            int size2 = list.size();
            for (int i = 1; i < size2; i++) {
                arrayList.add(list.get(i));
            }
        } else {
            java.util.ListIterator listIterator = list.listIterator(1);
            while (listIterator.hasNext()) {
                arrayList.add(listIterator.next());
            }
        }
        return arrayList;
    }

    public static final void Hx18F4M3RgD4(java.lang.Iterable iterable, java.util.AbstractCollection abstractCollection) {
        iterable.getClass();
        java.util.Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    public static java.lang.Comparable I5Vdbaz9SDkL(java.util.ArrayList arrayList) {
        java.util.Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            return null;
        }
        java.lang.Comparable comparable = (java.lang.Comparable) it.next();
        while (it.hasNext()) {
            java.lang.Comparable comparable2 = (java.lang.Comparable) it.next();
            if (comparable.compareTo(comparable2) < 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static java.lang.Object LCK4GGEwbWAr(java.util.List list) {
        list.getClass();
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static final int NkfcFfdaVTox(int i, java.util.List list) {
        if (i >= 0 && i <= list.size()) {
            return list.size() - i;
        }
        java.lang.StringBuilder h3m55N1URyyK = defpackage.pVQOaWB9QMo4.h3m55N1URyyK(i, "Position index ", " must be in range [");
        h3m55N1URyyK.append(new defpackage.p90(0, list.size(), 1));
        h3m55N1URyyK.append("].");
        throw new java.lang.IndexOutOfBoundsException(h3m55N1URyyK.toString());
    }

    public static boolean PS16moFv2oLu(java.lang.Iterable iterable, java.lang.Object obj) {
        iterable.getClass();
        return iterable instanceof java.util.Collection ? ((java.util.Collection) iterable).contains(obj) : cCeDCHgnx5OL(iterable, obj) >= 0;
    }

    public static java.util.Set RIHPIrzkudeW(java.lang.Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof java.util.Collection) {
            java.util.Collection collection = (java.util.Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet(defpackage.jk0.zJPqDeoF0Os1(collection.size()));
                    Hx18F4M3RgD4(iterable, linkedHashSet);
                    return linkedHashSet;
                }
                java.util.Set singleton = java.util.Collections.singleton(iterable instanceof java.util.List ? ((java.util.List) iterable).get(0) : collection.iterator().next());
                singleton.getClass();
                return singleton;
            }
        } else {
            java.util.LinkedHashSet linkedHashSet2 = new java.util.LinkedHashSet();
            Hx18F4M3RgD4(iterable, linkedHashSet2);
            int size2 = linkedHashSet2.size();
            if (size2 != 0) {
                if (size2 != 1) {
                    return linkedHashSet2;
                }
                java.util.Set singleton2 = java.util.Collections.singleton(linkedHashSet2.iterator().next());
                singleton2.getClass();
                return singleton2;
            }
        }
        return defpackage.ev.WDYagTQQm9ns;
    }

    public static java.lang.Object Rl68HURFBtL3(int i, java.util.List list) {
        if (i < 0 || i >= list.size()) {
            return null;
        }
        return list.get(i);
    }

    public static java.util.List S0YpfprlOYIn(java.lang.Iterable iterable) {
        iterable.getClass();
        if ((iterable instanceof java.util.Collection) && ((java.util.Collection) iterable).size() <= 1) {
            return a6r05ZxsOP0A(iterable);
        }
        java.util.List XuMcJunjB8iA = XuMcJunjB8iA(iterable);
        java.util.Collections.reverse(XuMcJunjB8iA);
        return XuMcJunjB8iA;
    }

    public static java.util.ArrayList ULjnV488Y6RO(java.util.Collection collection, java.util.List list) {
        collection.getClass();
        list.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size() + collection.size());
        arrayList.addAll(collection);
        arrayList.addAll(list);
        return arrayList;
    }

    public static final java.util.List XuMcJunjB8iA(java.lang.Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof java.util.Collection) {
            return new java.util.ArrayList((java.util.Collection) iterable);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        Hx18F4M3RgD4(iterable, arrayList);
        return arrayList;
    }

    public static java.util.List a6r05ZxsOP0A(java.lang.Iterable iterable) {
        iterable.getClass();
        if (!(iterable instanceof java.util.Collection)) {
            return defpackage.ma0.UmgHb6n58gfG(XuMcJunjB8iA(iterable));
        }
        java.util.Collection collection = (java.util.Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return defpackage.av.WDYagTQQm9ns;
        }
        if (size != 1) {
            return new java.util.ArrayList(collection);
        }
        return defpackage.ma0.VFeft99leXEK(iterable instanceof java.util.List ? ((java.util.List) iterable).get(0) : collection.iterator().next());
    }

    public static java.util.ArrayList awu2ulftxHsa(java.util.Collection collection) {
        collection.getClass();
        return new java.util.ArrayList(collection);
    }

    public static int cCeDCHgnx5OL(java.lang.Iterable iterable, java.lang.Object obj) {
        iterable.getClass();
        if (iterable instanceof java.util.List) {
            return ((java.util.List) iterable).indexOf(obj);
        }
        int i = 0;
        for (java.lang.Object obj2 : iterable) {
            if (i < 0) {
                defpackage.ma0.BXaznwstz2U0();
                throw null;
            }
            if (defpackage.ma0.QiMR8OkAhezm(obj, obj2)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static int[] cSrsis27vXSh(java.util.List list) {
        list.getClass();
        int[] iArr = new int[list.size()];
        java.util.Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = ((java.lang.Number) it.next()).intValue();
            i++;
        }
        return iArr;
    }

    public static java.util.List eSwlWMUpitz8(java.util.AbstractList abstractList) {
        abstractList.getClass();
        if (abstractList.size() <= 1) {
            return a6r05ZxsOP0A(abstractList);
        }
        java.lang.Object[] array = abstractList.toArray(new java.lang.Comparable[0]);
        java.lang.Comparable[] comparableArr = (java.lang.Comparable[]) array;
        comparableArr.getClass();
        if (comparableArr.length > 1) {
            java.util.Arrays.sort(comparableArr);
        }
        array.getClass();
        java.util.List asList = java.util.Arrays.asList(array);
        asList.getClass();
        return asList;
    }

    public static java.lang.Object fhbmYuu9J3cT(java.util.List list) {
        list.getClass();
        if (list.isEmpty()) {
            throw new java.util.NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    public static /* synthetic */ void hwoZxnIesQBZ(java.util.List list, java.lang.StringBuilder sb, java.lang.String str, defpackage.y10 y10Var, int i) {
        if ((i & 64) != 0) {
            y10Var = null;
        }
        omM9cAlgeGXx(list, sb, str, "", "", "...", y10Var);
    }

    public static java.util.ArrayList lXYSMswtzmix(java.util.Collection collection, java.lang.Object obj) {
        collection.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    public static java.lang.String m6iZQUu7XjoL(java.lang.Iterable iterable, java.lang.String str, java.lang.String str2, java.lang.String str3, defpackage.y10 y10Var, int i) {
        if ((i & 1) != 0) {
            str = ", ";
        }
        java.lang.String str4 = str;
        java.lang.String str5 = (i & 2) != 0 ? "" : str2;
        java.lang.String str6 = (i & 4) != 0 ? "" : str3;
        if ((i & 32) != 0) {
            y10Var = null;
        }
        iterable.getClass();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        omM9cAlgeGXx(iterable, sb, str4, str5, str6, "...", y10Var);
        return sb.toString();
    }

    public static java.util.List mnkwqFSfsWTC(java.lang.Iterable iterable, java.util.Comparator comparator) {
        iterable.getClass();
        if (!(iterable instanceof java.util.Collection)) {
            java.util.List XuMcJunjB8iA = XuMcJunjB8iA(iterable);
            defpackage.mf.OVwOqzUGHcCU(XuMcJunjB8iA, comparator);
            return XuMcJunjB8iA;
        }
        java.util.Collection collection = (java.util.Collection) iterable;
        if (collection.size() <= 1) {
            return a6r05ZxsOP0A(iterable);
        }
        java.lang.Object[] array = collection.toArray(new java.lang.Object[0]);
        array.getClass();
        if (array.length > 1) {
            java.util.Arrays.sort(array, comparator);
        }
        java.util.List asList = java.util.Arrays.asList(array);
        asList.getClass();
        return asList;
    }

    public static final void omM9cAlgeGXx(java.lang.Iterable iterable, java.lang.StringBuilder sb, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, java.lang.CharSequence charSequence3, java.lang.CharSequence charSequence4, defpackage.y10 y10Var) {
        iterable.getClass();
        sb.append(charSequence2);
        int i = 0;
        for (java.lang.Object obj : iterable) {
            i++;
            if (i > 1) {
                sb.append(charSequence);
            }
            defpackage.v70.GE9mJIPrb8gP(sb, obj, y10Var);
        }
        sb.append(charSequence3);
    }

    public static boolean[] pf0OXpZQoaz3(java.util.List list) {
        list.getClass();
        boolean[] zArr = new boolean[list.size()];
        java.util.Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            zArr[i] = ((java.lang.Boolean) it.next()).booleanValue();
            i++;
        }
        return zArr;
    }

    public static final int z16KqenTjq8o(int i, java.util.List list) {
        if (i >= 0 && i <= list.size() - 1) {
            return (list.size() - 1) - i;
        }
        java.lang.StringBuilder h3m55N1URyyK = defpackage.pVQOaWB9QMo4.h3m55N1URyyK(i, "Element index ", " must be in range [");
        h3m55N1URyyK.append(new defpackage.p90(0, list.size() - 1, 1));
        h3m55N1URyyK.append("].");
        throw new java.lang.IndexOutOfBoundsException(h3m55N1URyyK.toString());
    }
}
