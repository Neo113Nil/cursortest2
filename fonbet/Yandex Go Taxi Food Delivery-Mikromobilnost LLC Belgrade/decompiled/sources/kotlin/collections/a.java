package kotlin.collections;

import defpackage.adc;
import defpackage.b64;
import defpackage.d6w;
import defpackage.dj9;
import defpackage.g73;
import defpackage.gw00;
import defpackage.ii8;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.sbc;
import defpackage.scc;
import defpackage.tcc;
import defpackage.tls;
import defpackage.uuu0;
import defpackage.vrq0;
import defpackage.vvn;
import defpackage.w511;
import defpackage.xcc;
import defpackage.y5e;
import defpackage.ycc;
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
import kotlin.Pair;
import kotlin.random.Random;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public class a extends adc {
    public static List A0(Iterable iterable, int i) {
        if (i < 0) {
            w511.f(oyr.j(i, "Requested element count ", " is less than zero."));
            return null;
        }
        if (i == 0) {
            return EmptyList.a;
        }
        if (iterable instanceof Collection) {
            if (i >= ((Collection) iterable).size()) {
                return J0(iterable);
            }
            if (i == 1) {
                return Collections.singletonList(O(iterable));
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
        return scc.j(arrayList);
    }

    public static List B0(int i, List list) {
        if (i < 0) {
            w511.f(oyr.j(i, "Requested element count ", " is less than zero."));
            return null;
        }
        if (i == 0) {
            return EmptyList.a;
        }
        int size = list.size();
        if (i >= size) {
            return J0(list);
        }
        if (i == 1) {
            return Collections.singletonList(Z(list));
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

    public static boolean[] C0(Collection collection) {
        boolean[] zArr = new boolean[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            zArr[i] = ((Boolean) it.next()).booleanValue();
            i++;
        }
        return zArr;
    }

    public static byte[] D0(Collection collection) {
        byte[] bArr = new byte[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            bArr[i] = ((Number) it.next()).byteValue();
            i++;
        }
        return bArr;
    }

    public static boolean E(Iterable iterable) {
        return iterable instanceof Collection ? !((Collection) iterable).isEmpty() : iterable.iterator().hasNext();
    }

    public static char[] E0(Collection collection) {
        char[] cArr = new char[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            cArr[i] = ((Character) it.next()).charValue();
            i++;
        }
        return cArr;
    }

    public static ArrayList F(Iterable iterable, int i) {
        y5e.j(i, i);
        if (!(iterable instanceof RandomAccess) || !(iterable instanceof List)) {
            ArrayList arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            Iterator a = !it.hasNext() ? vvn.a : vrq0.a(new SlidingWindowKt$windowedIterator$1(i, i, it, false, true, null));
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

    public static void F0(Iterable iterable, Collection collection) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            collection.add(it.next());
        }
    }

    public static boolean G(Iterable iterable, Object obj) {
        return iterable instanceof Collection ? ((Collection) iterable).contains(obj) : T(iterable, obj) >= 0;
    }

    public static float[] G0(Collection collection) {
        float[] fArr = new float[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            fArr[i] = ((Number) it.next()).floatValue();
            i++;
        }
        return fArr;
    }

    public static int H(Iterable iterable) {
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        Iterator it = iterable.iterator();
        int i = 0;
        while (it.hasNext()) {
            it.next();
            i++;
            if (i < 0) {
                scc.l();
                throw null;
            }
        }
        return i;
    }

    public static HashSet H0(Iterable iterable) {
        HashSet hashSet = new HashSet(gw00.d(tcc.n(iterable, 12)));
        F0(iterable, hashSet);
        return hashSet;
    }

    public static List I(Iterable iterable) {
        return J0(M0(iterable));
    }

    public static int[] I0(Collection collection) {
        int[] iArr = new int[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = ((Number) it.next()).intValue();
            i++;
        }
        return iArr;
    }

    public static List J(Iterable iterable, int i) {
        ArrayList arrayList;
        if (i < 0) {
            w511.f(oyr.j(i, "Requested element count ", " is less than zero."));
            return null;
        }
        if (i == 0) {
            return J0(iterable);
        }
        if (iterable instanceof Collection) {
            int size = ((Collection) iterable).size() - i;
            if (size <= 0) {
                return EmptyList.a;
            }
            if (size == 1) {
                return Collections.singletonList(Y(iterable));
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
        for (Object obj : iterable) {
            if (i2 >= i) {
                arrayList.add(obj);
            } else {
                i2++;
            }
        }
        return scc.j(arrayList);
    }

    public static List J0(Iterable iterable) {
        if (!(iterable instanceof Collection)) {
            return scc.j(L0(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return EmptyList.a;
        }
        if (size != 1) {
            return new ArrayList(collection);
        }
        return Collections.singletonList(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    public static List K(List list) {
        List list2 = list;
        int size = list.size() - 1;
        if (size < 0) {
            size = 0;
        }
        return A0(list2, size);
    }

    public static long[] K0(Collection collection) {
        long[] jArr = new long[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            jArr[i] = ((Number) it.next()).longValue();
            i++;
        }
        return jArr;
    }

    public static Object L(Iterable iterable, int i) {
        boolean z = iterable instanceof List;
        if (z) {
            return ((List) iterable).get(i);
        }
        ii8 ii8Var = new ii8(i, 2);
        if (z) {
            List list = (List) iterable;
            if (i >= 0 && i < list.size()) {
                return list.get(i);
            }
            ii8Var.invoke(Integer.valueOf(i));
            throw null;
        }
        if (i < 0) {
            ii8Var.invoke(Integer.valueOf(i));
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
        ii8Var.invoke(Integer.valueOf(i));
        throw null;
    }

    public static List L0(Iterable iterable) {
        if (iterable instanceof Collection) {
            return new ArrayList((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        F0(iterable, arrayList);
        return arrayList;
    }

    public static List M(Iterable iterable) {
        ArrayList arrayList = new ArrayList();
        N(iterable, arrayList);
        return arrayList;
    }

    public static Set M0(Iterable iterable) {
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        F0(iterable, linkedHashSet);
        return linkedHashSet;
    }

    public static void N(Iterable iterable, Collection collection) {
        for (Object obj : iterable) {
            if (obj != null) {
                collection.add(obj);
            }
        }
    }

    public static Set N0(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size == 1) {
                    return Collections.singleton(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet(gw00.d(collection.size()));
                F0(iterable, linkedHashSet);
                return linkedHashSet;
            }
        } else {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            F0(iterable, linkedHashSet2);
            int size2 = linkedHashSet2.size();
            if (size2 != 0) {
                return size2 != 1 ? linkedHashSet2 : Collections.singleton(linkedHashSet2.iterator().next());
            }
        }
        return EmptySet.a;
    }

    public static Object O(Iterable iterable) {
        if (iterable instanceof List) {
            return P((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        w511.i("Collection is empty.");
        return null;
    }

    public static g73 O0(Iterable iterable) {
        int i = 1;
        return new g73(i, new sbc(i, iterable));
    }

    public static Object P(List list) {
        if (!list.isEmpty()) {
            return list.get(0);
        }
        w511.i("List is empty.");
        return null;
    }

    public static ArrayList P0(Iterable iterable, Iterable iterable2) {
        Iterator it = iterable.iterator();
        Iterator it2 = iterable2.iterator();
        ArrayList arrayList = new ArrayList(Math.min(tcc.n(iterable, 10), tcc.n(iterable2, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(new Pair(it.next(), it2.next()));
        }
        return arrayList;
    }

    public static Object Q(Iterable iterable) {
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

    public static Object R(List list) {
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static Object S(int i, List list) {
        if (i < 0 || i >= list.size()) {
            return null;
        }
        return list.get(i);
    }

    public static int T(Iterable iterable, Object obj) {
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(obj);
        }
        int i = 0;
        for (Object obj2 : iterable) {
            if (i < 0) {
                scc.m();
                throw null;
            }
            if (jl40.l(obj, obj2)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static LinkedHashSet U(Iterable iterable, Iterable iterable2) {
        Collection u = ycc.u(iterable2);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : iterable) {
            if (u.contains(obj)) {
                linkedHashSet.add(obj);
            }
        }
        return linkedHashSet;
    }

    public static final void V(Iterable iterable, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, String str, tls tlsVar) {
        sb.append(charSequence2);
        int i = 0;
        for (Object obj : iterable) {
            i++;
            if (i > 1) {
                sb.append(charSequence);
            }
            uuu0.a(sb, obj, tlsVar);
        }
        sb.append(charSequence3);
    }

    public static /* synthetic */ void W(Iterable iterable, StringBuilder sb, String str, tls tlsVar, int i) {
        String str2 = (i & 4) != 0 ? "" : "Errors: ";
        if ((i & 64) != 0) {
            tlsVar = null;
        }
        V(iterable, sb, str, str2, "", "...", tlsVar);
    }

    public static String X(Iterable iterable, CharSequence charSequence, String str, String str2, tls tlsVar, int i) {
        if ((i & 1) != 0) {
            charSequence = Extension.FIX_SPACE;
        }
        CharSequence charSequence2 = charSequence;
        String str3 = (i & 2) != 0 ? "" : str;
        String str4 = (i & 4) != 0 ? "" : str2;
        if ((i & 32) != 0) {
            tlsVar = null;
        }
        StringBuilder sb = new StringBuilder();
        V(iterable, sb, charSequence2, str3, str4, "...", tlsVar);
        return sb.toString();
    }

    public static Object Y(Iterable iterable) {
        if (iterable instanceof List) {
            return Z((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            w511.i("Collection is empty.");
            return null;
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static Object Z(List list) {
        if (!list.isEmpty()) {
            return list.get(scc.f(list));
        }
        w511.i("List is empty.");
        return null;
    }

    public static Object a0(Collection collection) {
        if (collection instanceof List) {
            List list = (List) collection;
            if (list.isEmpty()) {
                return null;
            }
            return b64.c(1, list);
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static Object b0(List list) {
        if (list.isEmpty()) {
            return null;
        }
        return b64.c(1, list);
    }

    public static Comparable c0(Iterable iterable) {
        Iterator it = iterable.iterator();
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

    public static Double d0(Iterable iterable) {
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        double doubleValue = ((Number) it.next()).doubleValue();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, ((Number) it.next()).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    public static Float e0(Iterable iterable) {
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

    public static Object f0(ArrayList arrayList, Comparator comparator) {
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        while (it.hasNext()) {
            Object next2 = it.next();
            if (comparator.compare(next, next2) < 0) {
                next = next2;
            }
        }
        return next;
    }

    public static Object g0(Iterable iterable, Comparator comparator) {
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            ny61.p();
            return null;
        }
        Object next = it.next();
        while (it.hasNext()) {
            Object next2 = it.next();
            if (comparator.compare(next, next2) < 0) {
                next = next2;
            }
        }
        return next;
    }

    public static Comparable h0(Iterable iterable) {
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

    public static Float i0(Iterable iterable) {
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

    public static ArrayList j0(Iterable iterable, Object obj) {
        ArrayList arrayList = new ArrayList(tcc.n(iterable, 10));
        boolean z = false;
        for (Object obj2 : iterable) {
            boolean z2 = true;
            if (!z && jl40.l(obj2, obj)) {
                z = true;
                z2 = false;
            }
            if (z2) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    public static List k0(Iterable iterable, Iterable iterable2) {
        Collection u = ycc.u(iterable2);
        if (u.isEmpty()) {
            return J0(iterable);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (!u.contains(obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ArrayList l0(dj9 dj9Var, dj9 dj9Var2) {
        if (dj9Var instanceof Collection) {
            return m0(dj9Var2, (Collection) dj9Var);
        }
        ArrayList arrayList = new ArrayList();
        ycc.r(dj9Var, arrayList);
        ycc.r(dj9Var2, arrayList);
        return arrayList;
    }

    public static ArrayList m0(Iterable iterable, Collection collection) {
        if (!(iterable instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            ycc.r(iterable, arrayList);
            return arrayList;
        }
        Collection collection2 = (Collection) iterable;
        ArrayList arrayList2 = new ArrayList(collection2.size() + collection.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    public static ArrayList n0(ArrayList arrayList, Object[] objArr) {
        ArrayList arrayList2 = new ArrayList(arrayList.size() + objArr.length);
        arrayList2.addAll(arrayList);
        ycc.t(arrayList2, objArr);
        return arrayList2;
    }

    public static ArrayList o0(Collection collection, Object obj) {
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    public static Object p0(Collection collection, Random random) {
        if (!collection.isEmpty()) {
            return L(collection, random.c(collection.size()));
        }
        w511.i("Collection is empty.");
        return null;
    }

    public static List q0(Iterable iterable) {
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return J0(iterable);
        }
        List L0 = L0(iterable);
        Collections.reverse(L0);
        return L0;
    }

    public static Object r0(Iterable iterable) {
        if (iterable instanceof List) {
            return s0((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            w511.i("Collection is empty.");
            return null;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        ny61.g("Collection has more than one element.");
        return null;
    }

    public static Object s0(List list) {
        int size = list.size();
        if (size == 0) {
            w511.i("List is empty.");
            return null;
        }
        if (size == 1) {
            return list.get(0);
        }
        ny61.g("List has more than one element.");
        return null;
    }

    public static Object t0(Iterable iterable) {
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.size() == 1) {
                return list.get(0);
            }
            return null;
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        if (it.hasNext()) {
            return null;
        }
        return next;
    }

    public static Object u0(List list) {
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    public static List v0(d6w d6wVar, List list) {
        return d6wVar.isEmpty() ? EmptyList.a : J0(list.subList(d6wVar.a, d6wVar.b + 1));
    }

    public static List w0(Iterable iterable) {
        if (!(iterable instanceof Collection)) {
            List L0 = L0(iterable);
            xcc.p(L0);
            return L0;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return J0(iterable);
        }
        Object[] array = collection.toArray(new Comparable[0]);
        Comparable[] comparableArr = (Comparable[]) array;
        if (comparableArr.length > 1) {
            Arrays.sort(comparableArr);
        }
        return Arrays.asList(array);
    }

    public static List x0(Iterable iterable, Comparator comparator) {
        if (!(iterable instanceof Collection)) {
            List L0 = L0(iterable);
            xcc.q(L0, comparator);
            return L0;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return J0(iterable);
        }
        Object[] array = collection.toArray(new Object[0]);
        if (array.length > 1) {
            Arrays.sort(array, comparator);
        }
        return Arrays.asList(array);
    }

    public static LinkedHashSet y0(Iterable iterable, Iterable iterable2) {
        Collection u = ycc.u(iterable2);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : iterable) {
            if (!u.contains(obj)) {
                linkedHashSet.add(obj);
            }
        }
        return linkedHashSet;
    }

    public static int z0(Iterable iterable) {
        Iterator it = iterable.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((Number) it.next()).intValue();
        }
        return i;
    }
}
