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
import java.util.Set;

/* loaded from: classes.dex */
public abstract class rb extends wb {
    public static List FhVkB11j(ArrayList arrayList, Comparator comparator) {
        arrayList.getClass();
        if (arrayList.size() <= 1) {
            return gqMuANyCes(arrayList);
        }
        Object[] array = arrayList.toArray(new Object[0]);
        array.getClass();
        if (array.length > 1) {
            Arrays.sort(array, comparator);
        }
        List asList = Arrays.asList(array);
        asList.getClass();
        return asList;
    }

    public static Set Hc2GqxcqBiX(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet(rc0.EXrPz3p7hFb(collection.size()));
                    j6IIN2O8eOU(iterable, linkedHashSet);
                    return linkedHashSet;
                }
                Set singleton = Collections.singleton(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
                singleton.getClass();
                return singleton;
            }
        } else {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            j6IIN2O8eOU(iterable, linkedHashSet2);
            int size2 = linkedHashSet2.size();
            if (size2 != 0) {
                if (size2 != 1) {
                    return linkedHashSet2;
                }
                Set singleton2 = Collections.singleton(linkedHashSet2.iterator().next());
                singleton2.getClass();
                return singleton2;
            }
        }
        return bq.OOA6hdeuvCS;
    }

    public static boolean JB4pnjMK(Iterable iterable, Object obj) {
        iterable.getClass();
        return iterable instanceof Collection ? ((Collection) iterable).contains(obj) : ZB4nixHlTE(iterable, obj) >= 0;
    }

    public static final int SyyZR548qbcW(int i, List list) {
        if (i >= 0 && i <= list.size() - 1) {
            return (list.size() - 1) - i;
        }
        StringBuilder rQPn8YBR = mr0.rQPn8YBR("Element index ", i, " must be in range [");
        rQPn8YBR.append(new x20(0, list.size() - 1, 1));
        rQPn8YBR.append("].");
        throw new IndexOutOfBoundsException(rQPn8YBR.toString());
    }

    public static /* synthetic */ void UjhVk5crk(ArrayList arrayList, StringBuilder sb, String str, bCsSzSHkbaQ bcsszshkbaq, int i) {
        if ((i & 64) != 0) {
            bcsszshkbaq = null;
        }
        oFzb77RX3H8t(arrayList, sb, str, "", "", "...", bcsszshkbaq);
    }

    public static String WkXHDbKiD(Iterable iterable, String str, String str2, String str3, hv hvVar, int i) {
        if ((i & 1) != 0) {
            str = ", ";
        }
        String str4 = str;
        String str5 = (i & 2) != 0 ? "" : str2;
        String str6 = (i & 4) != 0 ? "" : str3;
        if ((i & 32) != 0) {
            hvVar = null;
        }
        iterable.getClass();
        StringBuilder sb = new StringBuilder();
        oFzb77RX3H8t(iterable, sb, str4, str5, str6, "...", hvVar);
        return sb.toString();
    }

    public static final List XmVeRDAr(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return new ArrayList((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        j6IIN2O8eOU(iterable, arrayList);
        return arrayList;
    }

    public static Object YTyqgZhdF(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static int ZB4nixHlTE(Iterable iterable, Object obj) {
        iterable.getClass();
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(obj);
        }
        int i = 0;
        for (Object obj2 : iterable) {
            if (i < 0) {
                fb1.MjxSquD6Av();
                throw null;
            }
            if (o30.rQPn8YBR(obj, obj2)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static Comparable bCsSzSHkbaQ(ArrayList arrayList) {
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

    public static Object cTIXpaxc(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static ArrayList gHe2tSmr6w(Collection collection, Object obj) {
        collection.getClass();
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    public static List gqMuANyCes(Iterable iterable) {
        iterable.getClass();
        boolean z = iterable instanceof Collection;
        xp xpVar = xp.OOA6hdeuvCS;
        if (!z) {
            List XmVeRDAr = XmVeRDAr(iterable);
            int size = XmVeRDAr.size();
            return size != 0 ? size != 1 ? XmVeRDAr : fb1.HFYAaqMd6(XmVeRDAr.get(0)) : xpVar;
        }
        Collection collection = (Collection) iterable;
        int size2 = collection.size();
        if (size2 == 0) {
            return xpVar;
        }
        if (size2 != 1) {
            return new ArrayList(collection);
        }
        return fb1.HFYAaqMd6(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    public static ArrayList hOpoc9RpANL(Collection collection, List list) {
        collection.getClass();
        list.getClass();
        ArrayList arrayList = new ArrayList(list.size() + collection.size());
        arrayList.addAll(collection);
        arrayList.addAll(list);
        return arrayList;
    }

    public static final void j6IIN2O8eOU(Iterable iterable, AbstractCollection abstractCollection) {
        iterable.getClass();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    public static Object jed7WnvkLvFq(List list) {
        list.getClass();
        if (!list.isEmpty()) {
            return list.get(0);
        }
        o4.AvO7iQsrTN("List is empty.");
        return null;
    }

    public static List kbVzROOfKK(Iterable iterable) {
        iterable.getClass();
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return gqMuANyCes(iterable);
        }
        List XmVeRDAr = XmVeRDAr(iterable);
        Collections.reverse(XmVeRDAr);
        return XmVeRDAr;
    }

    public static final void oFzb77RX3H8t(Iterable iterable, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, hv hvVar) {
        iterable.getClass();
        sb.append(charSequence2);
        int i = 0;
        for (Object obj : iterable) {
            i++;
            if (i > 1) {
                sb.append(charSequence);
            }
            b70.XnEVoBF0td1l(sb, obj, hvVar);
        }
        sb.append(charSequence3);
    }

    public static final int rASgSCrgZkT7(int i, List list) {
        if (i >= 0 && i <= list.size()) {
            return list.size() - i;
        }
        StringBuilder rQPn8YBR = mr0.rQPn8YBR("Position index ", i, " must be in range [");
        rQPn8YBR.append(new x20(0, list.size(), 1));
        rQPn8YBR.append("].");
        throw new IndexOutOfBoundsException(rQPn8YBR.toString());
    }

    public static ArrayList sb9fmtV8A(Collection collection) {
        collection.getClass();
        return new ArrayList(collection);
    }

    public static Object vaTCmWUgXF(List list) {
        list.getClass();
        if (!list.isEmpty()) {
            return list.get(list.size() - 1);
        }
        o4.AvO7iQsrTN("List is empty.");
        return null;
    }

    public static float[] xtv4Xm13vGi(List list) {
        list.getClass();
        float[] fArr = new float[list.size()];
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            fArr[i] = ((Number) it.next()).floatValue();
            i++;
        }
        return fArr;
    }
}
