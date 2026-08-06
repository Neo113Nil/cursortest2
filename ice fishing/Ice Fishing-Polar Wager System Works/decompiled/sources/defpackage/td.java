package defpackage;

/* loaded from: classes.dex */
public abstract class td extends defpackage.yd {
    public static double AQHddgaEX(java.util.ArrayList arrayList) {
        int size = arrayList.size();
        double d = 0.0d;
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            java.lang.Object obj = arrayList.get(i2);
            i2++;
            d += ((java.lang.Number) obj).floatValue();
            i++;
            if (i < 0) {
                defpackage.fm.lpprD5VAS();
                throw null;
            }
        }
        if (i == 0) {
            return Double.NaN;
        }
        return d / i;
    }

    public static final java.util.List Ay906ovssqgN(java.lang.Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof java.util.Collection) {
            return new java.util.ArrayList((java.util.Collection) iterable);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        juTJww2r(iterable, arrayList);
        return arrayList;
    }

    public static boolean CGXpA9s3RjIa(java.lang.Iterable iterable, java.lang.Object obj) {
        iterable.getClass();
        return iterable instanceof java.util.Collection ? ((java.util.Collection) iterable).contains(obj) : d6FAb9xVJ8GU(iterable, obj) >= 0;
    }

    public static java.util.Set FisHbM7NmV(java.lang.Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof java.util.Collection) {
            java.util.Collection collection = (java.util.Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet(defpackage.yh0.yIx6ChFVk(collection.size()));
                    juTJww2r(iterable, linkedHashSet);
                    return linkedHashSet;
                }
                java.util.Set singleton = java.util.Collections.singleton(iterable instanceof java.util.List ? ((java.util.List) iterable).get(0) : collection.iterator().next());
                singleton.getClass();
                return singleton;
            }
        } else {
            java.util.LinkedHashSet linkedHashSet2 = new java.util.LinkedHashSet();
            juTJww2r(iterable, linkedHashSet2);
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
        return defpackage.rt.adDC3e2L;
    }

    public static java.lang.Object FyULxpbU8bu(java.util.List list) {
        list.getClass();
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static java.util.List JX5fKip1C6(java.util.AbstractList abstractList) {
        abstractList.getClass();
        if (abstractList.size() <= 1) {
            return boH8X4DXyc4(abstractList);
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

    public static java.lang.Object JcqDrWrgMf(java.util.List list) {
        list.getClass();
        if (list.isEmpty()) {
            throw new java.util.NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    public static java.lang.Object NWDBeGGF(java.util.List list) {
        list.getClass();
        if (list.isEmpty()) {
            throw new java.util.NoSuchElementException("List is empty.");
        }
        return list.get(list.size() - 1);
    }

    public static final void OtkytngK3Mr(java.lang.Iterable iterable, java.lang.StringBuilder sb, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, java.lang.CharSequence charSequence3, java.lang.CharSequence charSequence4, defpackage.g00 g00Var) {
        iterable.getClass();
        sb.append(charSequence2);
        int i = 0;
        for (java.lang.Object obj : iterable) {
            i++;
            if (i > 1) {
                sb.append(charSequence);
            }
            defpackage.s70.xiZrDbcSW0(sb, obj, g00Var);
        }
        sb.append(charSequence3);
    }

    public static java.util.ArrayList ZNF7fheNE(java.util.Collection collection, java.lang.Object obj) {
        collection.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    public static java.util.List boH8X4DXyc4(java.lang.Iterable iterable) {
        iterable.getClass();
        boolean z = iterable instanceof java.util.Collection;
        defpackage.nt ntVar = defpackage.nt.adDC3e2L;
        if (!z) {
            java.util.List Ay906ovssqgN = Ay906ovssqgN(iterable);
            int size = Ay906ovssqgN.size();
            return size != 0 ? size != 1 ? Ay906ovssqgN : defpackage.fm.p4kuH6PDtgom(Ay906ovssqgN.get(0)) : ntVar;
        }
        java.util.Collection collection = (java.util.Collection) iterable;
        int size2 = collection.size();
        if (size2 == 0) {
            return ntVar;
        }
        if (size2 != 1) {
            return new java.util.ArrayList(collection);
        }
        return defpackage.fm.p4kuH6PDtgom(iterable instanceof java.util.List ? ((java.util.List) iterable).get(0) : collection.iterator().next());
    }

    public static java.lang.String cSNyPqwud(java.lang.Iterable iterable, java.lang.String str, java.lang.String str2, java.lang.String str3, defpackage.g00 g00Var, int i) {
        if ((i & 1) != 0) {
            str = ", ";
        }
        java.lang.String str4 = str;
        java.lang.String str5 = (i & 2) != 0 ? "" : str2;
        java.lang.String str6 = (i & 4) != 0 ? "" : str3;
        if ((i & 32) != 0) {
            g00Var = null;
        }
        iterable.getClass();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        OtkytngK3Mr(iterable, sb, str4, str5, str6, "...", g00Var);
        return sb.toString();
    }

    public static int d6FAb9xVJ8GU(java.lang.Iterable iterable, java.lang.Object obj) {
        iterable.getClass();
        if (iterable instanceof java.util.List) {
            return ((java.util.List) iterable).indexOf(obj);
        }
        int i = 0;
        for (java.lang.Object obj2 : iterable) {
            if (i < 0) {
                defpackage.fm.hkbnNdmy();
                throw null;
            }
            if (defpackage.x70.QoRHpC4k(obj, obj2)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static java.lang.Comparable dOmtpLcqqI1y(java.util.ArrayList arrayList) {
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

    public static java.util.ArrayList flIYPhR0(java.util.Collection collection, java.util.List list) {
        collection.getClass();
        list.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size() + collection.size());
        arrayList.addAll(collection);
        arrayList.addAll(list);
        return arrayList;
    }

    public static java.lang.Object gG5uWf3dqScO(java.util.List list) {
        list.getClass();
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static final void juTJww2r(java.lang.Iterable iterable, java.util.AbstractCollection abstractCollection) {
        iterable.getClass();
        java.util.Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    public static java.util.List k3hcgHS3MP(java.lang.Iterable iterable) {
        iterable.getClass();
        if ((iterable instanceof java.util.Collection) && ((java.util.Collection) iterable).size() <= 1) {
            return boH8X4DXyc4(iterable);
        }
        java.util.List Ay906ovssqgN = Ay906ovssqgN(iterable);
        java.util.Collections.reverse(Ay906ovssqgN);
        return Ay906ovssqgN;
    }

    public static java.util.List mL9sMlGfef(java.util.List list) {
        int size = list.size() - 1;
        if (size <= 0) {
            return defpackage.nt.adDC3e2L;
        }
        if (size == 1) {
            return defpackage.fm.p4kuH6PDtgom(NWDBeGGF(list));
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

    public static java.lang.Object sJNB7mCer5(int i, java.util.List list) {
        list.getClass();
        if (i < 0 || i >= list.size()) {
            return null;
        }
        return list.get(i);
    }

    public static java.util.ArrayList seT5W8IHOge(java.util.Collection collection) {
        collection.getClass();
        return new java.util.ArrayList(collection);
    }

    public static java.util.List yUiIS9dG7NYk(java.lang.Iterable iterable, java.util.Comparator comparator) {
        iterable.getClass();
        if (!(iterable instanceof java.util.Collection)) {
            java.util.List Ay906ovssqgN = Ay906ovssqgN(iterable);
            defpackage.xd.wKlPRKlRnfqr(Ay906ovssqgN, comparator);
            return Ay906ovssqgN;
        }
        java.util.Collection collection = (java.util.Collection) iterable;
        if (collection.size() <= 1) {
            return boH8X4DXyc4(iterable);
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
}
