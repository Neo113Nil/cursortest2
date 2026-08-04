package kotlin.collections;

import com.gamericefishpro.space.f5.q;
import com.gamericefishpro.space.ph.b0;
import com.gamericefishpro.space.ph.c0;
import com.gamericefishpro.space.ph.g0;
import com.gamericefishpro.space.ph.i0;
import com.gamericefishpro.space.ph.l0;
import com.gamericefishpro.space.ph.q0;
import com.gamericefishpro.space.ph.u;
import com.gamericefishpro.space.ph.w;
import com.gamericefishpro.space.ph.x;
import com.gamericefishpro.space.t0.y0;
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
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    java.lang.IllegalArgumentException: Provided Metadata instance does not have metadataVersion in it and therefore is malformed and cannot be read.
    	at kotlin.metadata.jvm.internal.JvmReadUtils.checkMetadataVersionForRead(JvmReadUtils.kt:79)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:46)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:68)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:31)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    */
/* JADX INFO: loaded from: classes.dex */
@Metadata
public final class CollectionsKt extends CollectionsKt___CollectionsKt {
    private CollectionsKt() {
    }

    public static String A(Iterable iterable, String str, String str2, String str3, Function1 function1, int i) {
        if ((i & 1) != 0) {
            str = ", ";
        }
        String separator = str;
        String prefix = (i & 2) != 0 ? "" : str2;
        String postfix = (i & 4) != 0 ? "" : str3;
        if ((i & 32) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter("...", "truncated");
        StringBuilder sb = new StringBuilder();
        CollectionsKt___CollectionsKt.p(iterable, sb, separator, prefix, postfix, function1);
        return sb.toString();
    }

    public static Object B(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(x.e(list));
    }

    public static Object C(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static Comparable D(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
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

    public static ArrayList E(Collection collection, Object obj) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    public static ArrayList F(Collection collection, List elements) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (elements == null) {
            ArrayList arrayList = new ArrayList(collection);
            c0.l(arrayList, elements);
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(elements.size() + collection.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(elements);
        return arrayList2;
    }

    public static List G(Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return L(iterable);
        }
        List listR = CollectionsKt___CollectionsKt.r(iterable);
        Intrinsics.checkNotNullParameter(listR, "<this>");
        Collections.reverse(listR);
        return listR;
    }

    public static List H(Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            List listR = CollectionsKt___CollectionsKt.r(iterable);
            Intrinsics.checkNotNullParameter(listR, "<this>");
            if (((ArrayList) listR).size() > 1) {
                Collections.sort(listR);
            }
            return listR;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return L(iterable);
        }
        Object[] array = collection.toArray(new Comparable[0]);
        Comparable[] comparableArr = (Comparable[]) array;
        Intrinsics.checkNotNullParameter(comparableArr, "<this>");
        if (comparableArr.length > 1) {
            Arrays.sort(comparableArr);
        }
        return u.b(array);
    }

    public static List I(Iterable iterable, Comparator comparator) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (!(iterable instanceof Collection)) {
            List listR = CollectionsKt___CollectionsKt.r(iterable);
            b0.k(listR, comparator);
            return listR;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return L(iterable);
        }
        Object[] array = collection.toArray(new Object[0]);
        u.l(array, comparator);
        return u.b(array);
    }

    public static List J(int i, List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(y0.f(i, "Requested element count ", " is less than zero.").toString());
        }
        if (i == 0) {
            return g0.d;
        }
        if (i >= list.size()) {
            return L(list);
        }
        if (i == 1) {
            return w.c(v(list));
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
        return x.h(arrayList);
    }

    public static int[] K(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        int[] iArr = new int[list.size()];
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = ((Number) it.next()).intValue();
            i++;
        }
        return iArr;
    }

    public static List L(Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return x.h(CollectionsKt___CollectionsKt.r(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return g0.d;
        }
        if (size != 1) {
            return M(collection);
        }
        return w.c(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    public static ArrayList M(Collection collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        return new ArrayList(collection);
    }

    public static LinkedHashSet N(Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        CollectionsKt___CollectionsKt.q(iterable, linkedHashSet);
        return linkedHashSet;
    }

    public static Set O(Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            CollectionsKt___CollectionsKt.q(iterable, linkedHashSet);
            Intrinsics.checkNotNullParameter(linkedHashSet, "<this>");
            int size = linkedHashSet.size();
            if (size != 0) {
                return size != 1 ? linkedHashSet : q0.b(linkedHashSet.iterator().next());
            }
            return i0.d;
        }
        Collection collection = (Collection) iterable;
        int size2 = collection.size();
        if (size2 == 0) {
            return i0.d;
        }
        if (size2 == 1) {
            return q0.b(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet(l0.a(collection.size()));
        CollectionsKt___CollectionsKt.q(iterable, linkedHashSet2);
        return linkedHashSet2;
    }

    public static double s(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        int size = arrayList.size();
        double dFloatValue = 0.0d;
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            dFloatValue += (double) ((Number) obj).floatValue();
            i++;
            if (i < 0) {
                throw new ArithmeticException("Count overflow has happened.");
            }
        }
        if (i == 0) {
            return Double.NaN;
        }
        return dFloatValue / ((double) i);
    }

    public static boolean t(Iterable iterable, Object obj) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(obj);
        }
        return y(iterable, obj) >= 0;
    }

    public static List u(List list) {
        ArrayList arrayList;
        Object objB;
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list != null) {
            int size = list.size() - 1;
            if (size <= 0) {
                return g0.d;
            }
            if (size == 1) {
                Intrinsics.checkNotNullParameter(list, "<this>");
                if (list != null) {
                    objB = B(list);
                } else {
                    Iterator it = list.iterator();
                    if (!it.hasNext()) {
                        throw new NoSuchElementException("Collection is empty.");
                    }
                    Object next = it.next();
                    while (it.hasNext()) {
                        next = it.next();
                    }
                    objB = next;
                }
                return w.c(objB);
            }
            arrayList = new ArrayList(size);
            if (list != null) {
                if (list instanceof RandomAccess) {
                    int size2 = list.size();
                    for (int i = 1; i < size2; i++) {
                        arrayList.add(list.get(i));
                    }
                } else {
                    ListIterator listIterator = list.listIterator(1);
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
        for (Object obj : list) {
            if (i2 >= 1) {
                arrayList.add(obj);
            } else {
                i2++;
            }
        }
        return x.h(arrayList);
    }

    public static Object v(Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof List) {
            return w((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static Object w(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    public static Object x(int i, List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (i < 0 || i >= list.size()) {
            return null;
        }
        return list.get(i);
    }

    public static int y(Iterable iterable, Object obj) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(obj);
        }
        int i = 0;
        for (Object obj2 : iterable) {
            if (i < 0) {
                x.i();
                throw null;
            }
            if (Intrinsics.a(obj, obj2)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static /* synthetic */ void z(Iterable iterable, StringBuilder sb, String str, q qVar, int i) {
        if ((i & 64) != 0) {
            qVar = null;
        }
        CollectionsKt___CollectionsKt.p(iterable, sb, str, "", "", qVar);
    }
}
