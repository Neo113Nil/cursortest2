package kotlin.collections;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.b5b;
import defpackage.c5b;
import defpackage.cv0;
import defpackage.dfi;
import defpackage.dhp;
import defpackage.ge4;
import defpackage.kma;
import defpackage.neg;
import defpackage.ohn;
import defpackage.phn;
import defpackage.q5b;
import defpackage.r25;
import defpackage.t75;
import defpackage.tah;
import defpackage.u75;
import defpackage.uop;
import defpackage.uz0;
import defpackage.v75;
import defpackage.vz0;
import defpackage.wvs;
import defpackage.wz0;
import defpackage.xq0;
import defpackage.y75;
import defpackage.z75;
import defpackage.zwq;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

@Metadata(d1 = {"t75", "u75", "v75", "w75", "x75", "y75", "z75", "a85", "b85", "kotlin/collections/CollectionsKt___CollectionsKt"}, d2 = {}, k = 4, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_1)
/* loaded from: classes5.dex */
public final class CollectionsKt extends CollectionsKt___CollectionsKt {
    public static Set A0(Iterable iterable) {
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            CollectionsKt___CollectionsKt.E(iterable, linkedHashSet);
            int size = linkedHashSet.size();
            return size != 0 ? size != 1 ? linkedHashSet : uop.b(linkedHashSet.iterator().next()) : q5b.a;
        }
        Collection collection = (Collection) iterable;
        int size2 = collection.size();
        if (size2 == 0) {
            return q5b.a;
        }
        if (size2 == 1) {
            return uop.b(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet(tah.a(collection.size()));
        CollectionsKt___CollectionsKt.E(iterable, linkedHashSet2);
        return linkedHashSet2;
    }

    public static vz0 B0(Iterable iterable) {
        iterable.getClass();
        return new vz0(2, new r25(4, iterable));
    }

    public static ArrayList C0(Iterable iterable, Iterable iterable2) {
        iterable.getClass();
        iterable2.getClass();
        Iterator it = iterable.iterator();
        Iterator it2 = iterable2.iterator();
        ArrayList arrayList = new ArrayList(Math.min(v75.o(iterable, 10), v75.o(iterable2, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(new Pair(it.next(), it2.next()));
        }
        return arrayList;
    }

    public static wz0 F(Iterable iterable) {
        iterable.getClass();
        return new wz0(1, iterable);
    }

    public static double G(ArrayList arrayList) {
        arrayList.getClass();
        Iterator it = arrayList.iterator();
        double d = 0.0d;
        int i = 0;
        while (it.hasNext()) {
            d += ((Number) it.next()).floatValue();
            i++;
            if (i < 0) {
                u75.m();
                throw null;
            }
        }
        if (i == 0) {
            return Double.NaN;
        }
        return d / i;
    }

    public static ArrayList H(Iterable iterable, int i) {
        iterable.getClass();
        neg.j(i, i);
        if (!(iterable instanceof RandomAccess) || !(iterable instanceof List)) {
            ArrayList arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            it.getClass();
            Iterator a = !it.hasNext() ? b5b.a : dhp.a(new zwq(i, i, it, null));
            while (a.hasNext()) {
                arrayList.add((List) a.next());
            }
            return arrayList;
        }
        List list = (List) iterable;
        int size = list.size();
        ArrayList arrayList2 = new ArrayList((size / i) + (size % i == 0 ? 0 : 1));
        int i2 = 0;
        while (i2 >= 0 && i2 < size) {
            int i3 = size - i2;
            if (i <= i3) {
                i3 = i;
            }
            ArrayList arrayList3 = new ArrayList(i3);
            for (int i4 = 0; i4 < i3; i4++) {
                arrayList3.add(list.get(i4 + i2));
            }
            arrayList2.add(arrayList3);
            i2 += i;
        }
        return arrayList2;
    }

    public static boolean I(Iterable iterable, Object obj) {
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
                    u75.n();
                    throw null;
                }
                if (Intrinsics.d(obj, next)) {
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

    public static int J(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        Iterator it = iterable.iterator();
        int i = 0;
        while (it.hasNext()) {
            it.next();
            i++;
            if (i < 0) {
                u75.m();
                throw null;
            }
        }
        return i;
    }

    public static List K(Iterable iterable) {
        iterable.getClass();
        return w0(z0(iterable));
    }

    public static List L(Iterable iterable, int i) {
        ArrayList arrayList;
        Object obj;
        iterable.getClass();
        if (i < 0) {
            xq0.o(dfi.c(i, "Requested element count ", " is less than zero."));
            return null;
        }
        if (i == 0) {
            return w0(iterable);
        }
        if (iterable instanceof Collection) {
            int size = ((Collection) iterable).size() - i;
            if (size <= 0) {
                return c5b.a;
            }
            if (size == 1) {
                if (iterable instanceof List) {
                    obj = Y((List) iterable);
                } else {
                    Iterator it = iterable.iterator();
                    if (!it.hasNext()) {
                        wvs.h("Collection is empty.");
                        return null;
                    }
                    Object next = it.next();
                    while (it.hasNext()) {
                        next = it.next();
                    }
                    obj = next;
                }
                return t75.c(obj);
            }
            arrayList = new ArrayList(size);
            if (iterable instanceof List) {
                if (iterable instanceof RandomAccess) {
                    List list = (List) iterable;
                    int size2 = list.size();
                    while (i < size2) {
                        arrayList.add(list.get(i));
                        i++;
                    }
                } else {
                    ListIterator listIterator = ((List) iterable).listIterator(i);
                    while (listIterator.hasNext()) {
                        arrayList.add(listIterator.next());
                    }
                }
                return arrayList;
            }
        } else {
            arrayList = new ArrayList();
        }
        int i2 = 0;
        for (Object obj2 : iterable) {
            if (i2 >= i) {
                arrayList.add(obj2);
            } else {
                i2++;
            }
        }
        return u75.k(arrayList);
    }

    public static List M(List list) {
        list.getClass();
        List list2 = list;
        int size = list.size() - 1;
        if (size < 0) {
            size = 0;
        }
        return q0(list2, size);
    }

    public static Object N(Iterable iterable, int i) {
        iterable.getClass();
        boolean z = iterable instanceof List;
        if (z) {
            return ((List) iterable).get(i);
        }
        cv0 cv0Var = new cv0(i, 1);
        if (z) {
            List list = (List) iterable;
            if (i >= 0 && i < list.size()) {
                return list.get(i);
            }
            cv0Var.invoke(Integer.valueOf(i));
            throw null;
        }
        if (i < 0) {
            cv0Var.invoke(Integer.valueOf(i));
            throw null;
        }
        int i2 = 0;
        for (Object obj : iterable) {
            int i3 = i2 + 1;
            if (i == i2) {
                return obj;
            }
            i2 = i3;
        }
        cv0Var.invoke(Integer.valueOf(i));
        throw null;
    }

    public static ArrayList O(Iterable iterable) {
        iterable.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static Object P(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof List) {
            return Q((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        wvs.h("Collection is empty.");
        return null;
    }

    public static Object Q(List list) {
        list.getClass();
        if (!list.isEmpty()) {
            return list.get(0);
        }
        wvs.h("List is empty.");
        return null;
    }

    public static Object R(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return list.get(0);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static Object S(List list, int i) {
        list.getClass();
        if (i < 0 || i >= list.size()) {
            return null;
        }
        return list.get(i);
    }

    public static int T(List list, Object obj) {
        list.getClass();
        return list.indexOf(obj);
    }

    public static LinkedHashSet U(Iterable iterable, Iterable iterable2) {
        iterable.getClass();
        iterable2.getClass();
        LinkedHashSet z0 = z0(iterable);
        z0.retainAll(z75.v(iterable2));
        return z0;
    }

    public static /* synthetic */ void V(Iterable iterable, StringBuilder sb, String str, kma kmaVar, int i) {
        if ((i & 64) != 0) {
            kmaVar = null;
        }
        CollectionsKt___CollectionsKt.D(iterable, sb, str, "", "", kmaVar);
    }

    public static String W(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Function1 function1) {
        iterable.getClass();
        charSequence.getClass();
        charSequence2.getClass();
        charSequence3.getClass();
        StringBuilder sb = new StringBuilder();
        CollectionsKt___CollectionsKt.D(iterable, sb, charSequence, charSequence2, charSequence3, function1);
        return sb.toString();
    }

    public static /* synthetic */ String X(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Function1 function1, int i) {
        if ((i & 1) != 0) {
            charSequence = ", ";
        }
        if ((i & 2) != 0) {
            charSequence2 = "";
        }
        if ((i & 4) != 0) {
            charSequence3 = "";
        }
        if ((i & 32) != 0) {
            function1 = null;
        }
        return W(iterable, charSequence, charSequence2, charSequence3, function1);
    }

    public static Object Y(List list) {
        list.getClass();
        if (!list.isEmpty()) {
            return list.get(list.size() - 1);
        }
        wvs.h("List is empty.");
        return null;
    }

    public static Object Z(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static Float a0(Iterable iterable) {
        iterable.getClass();
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float floatValue = ((Number) it.next()).floatValue();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, ((Number) it.next()).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    public static Comparable b0(Iterable iterable) {
        iterable.getClass();
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) > 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static Float c0(Iterable iterable) {
        iterable.getClass();
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float floatValue = ((Number) it.next()).floatValue();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, ((Number) it.next()).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    public static ArrayList d0(Iterable iterable, Object obj) {
        iterable.getClass();
        ArrayList arrayList = new ArrayList(v75.o(iterable, 10));
        boolean z = false;
        for (Object obj2 : iterable) {
            boolean z2 = true;
            if (!z && Intrinsics.d(obj2, obj)) {
                z = true;
                z2 = false;
            }
            if (z2) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    public static List e0(Iterable iterable, Iterable iterable2) {
        iterable.getClass();
        iterable2.getClass();
        Collection v = z75.v(iterable2);
        if (v.isEmpty()) {
            return w0(iterable);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (!v.contains(obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ArrayList f0(ge4 ge4Var, ge4 ge4Var2) {
        if (ge4Var instanceof Collection) {
            return g0((Collection) ge4Var, ge4Var2);
        }
        ArrayList arrayList = new ArrayList();
        z75.t(arrayList, ge4Var);
        z75.t(arrayList, ge4Var2);
        return arrayList;
    }

    public static ArrayList g0(Collection collection, Iterable iterable) {
        collection.getClass();
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            z75.t(arrayList, iterable);
            return arrayList;
        }
        Collection collection2 = (Collection) iterable;
        ArrayList arrayList2 = new ArrayList(collection2.size() + collection.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    public static ArrayList h0(Collection collection, Object obj) {
        collection.getClass();
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    public static Object i0(Collection collection, ohn ohnVar) {
        collection.getClass();
        ohnVar.getClass();
        if (collection.isEmpty()) {
            wvs.h("Collection is empty.");
            return null;
        }
        return N(collection, phn.b.d(collection.size()));
    }

    public static List j0(Iterable iterable) {
        iterable.getClass();
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return w0(iterable);
        }
        ArrayList x0 = x0(iterable);
        Collections.reverse(x0);
        return x0;
    }

    public static Object k0(List list) {
        list.getClass();
        int size = list.size();
        if (size == 0) {
            wvs.h("List is empty.");
            return null;
        }
        if (size == 1) {
            return list.get(0);
        }
        xq0.x("List has more than one element.");
        return null;
    }

    public static Object l0(List list) {
        list.getClass();
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    public static List m0(List list, IntRange intRange) {
        list.getClass();
        intRange.getClass();
        return intRange.isEmpty() ? c5b.a : w0(list.subList(intRange.a, intRange.b + 1));
    }

    public static List n0(Iterable iterable) {
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            ArrayList x0 = x0(iterable);
            y75.r(x0);
            return x0;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return w0(iterable);
        }
        Object[] array = collection.toArray(new Comparable[0]);
        Comparable[] comparableArr = (Comparable[]) array;
        comparableArr.getClass();
        if (comparableArr.length > 1) {
            Arrays.sort(comparableArr);
        }
        return uz0.c(array);
    }

    public static List o0(Iterable iterable, Comparator comparator) {
        iterable.getClass();
        comparator.getClass();
        if (!(iterable instanceof Collection)) {
            ArrayList x0 = x0(iterable);
            y75.s(x0, comparator);
            return x0;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return w0(iterable);
        }
        Object[] array = collection.toArray(new Object[0]);
        uz0.p(array, comparator);
        List asList = Arrays.asList(array);
        asList.getClass();
        return asList;
    }

    public static int p0(Iterable iterable) {
        iterable.getClass();
        Iterator it = iterable.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((Number) it.next()).intValue();
        }
        return i;
    }

    public static List q0(Iterable iterable, int i) {
        iterable.getClass();
        if (i < 0) {
            xq0.o(dfi.c(i, "Requested element count ", " is less than zero."));
            return null;
        }
        if (i == 0) {
            return c5b.a;
        }
        if (iterable instanceof Collection) {
            if (i >= ((Collection) iterable).size()) {
                return w0(iterable);
            }
            if (i == 1) {
                return t75.c(P(iterable));
            }
        }
        ArrayList arrayList = new ArrayList(i);
        Iterator it = iterable.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i2++;
            if (i2 == i) {
                break;
            }
        }
        return u75.k(arrayList);
    }

    public static List r0(List list, int i) {
        list.getClass();
        if (i < 0) {
            xq0.o(dfi.c(i, "Requested element count ", " is less than zero."));
            return null;
        }
        if (i == 0) {
            return c5b.a;
        }
        int size = list.size();
        if (i >= size) {
            return w0(list);
        }
        if (i == 1) {
            return t75.c(Y(list));
        }
        ArrayList arrayList = new ArrayList(i);
        if (list instanceof RandomAccess) {
            for (int i2 = size - i; i2 < size; i2++) {
                arrayList.add(list.get(i2));
            }
        } else {
            ListIterator listIterator = list.listIterator(size - i);
            while (listIterator.hasNext()) {
                arrayList.add(listIterator.next());
            }
        }
        return arrayList;
    }

    public static boolean[] s0(ArrayList arrayList) {
        arrayList.getClass();
        boolean[] zArr = new boolean[arrayList.size()];
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            zArr[i] = ((Boolean) it.next()).booleanValue();
            i++;
        }
        return zArr;
    }

    public static float[] t0(Collection collection) {
        collection.getClass();
        float[] fArr = new float[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            fArr[i] = ((Number) it.next()).floatValue();
            i++;
        }
        return fArr;
    }

    public static HashSet u0(Iterable iterable) {
        iterable.getClass();
        HashSet hashSet = new HashSet(tah.a(v75.o(iterable, 12)));
        CollectionsKt___CollectionsKt.E(iterable, hashSet);
        return hashSet;
    }

    public static int[] v0(Collection collection) {
        collection.getClass();
        int[] iArr = new int[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = ((Number) it.next()).intValue();
            i++;
        }
        return iArr;
    }

    public static List w0(Iterable iterable) {
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            return u75.k(x0(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return c5b.a;
        }
        if (size != 1) {
            return new ArrayList(collection);
        }
        return t75.c(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    public static ArrayList x0(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return new ArrayList((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        CollectionsKt___CollectionsKt.E(iterable, arrayList);
        return arrayList;
    }

    public static ArrayList y0(Collection collection) {
        collection.getClass();
        return new ArrayList(collection);
    }

    public static LinkedHashSet z0(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        CollectionsKt___CollectionsKt.E(iterable, linkedHashSet);
        return linkedHashSet;
    }
}
