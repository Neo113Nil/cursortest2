package u1;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class g extends m {
    public static boolean L(Iterable iterable, Object obj) {
        int i;
        D1.i.e(iterable, "<this>");
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
                    h.H();
                    throw null;
                }
                if (D1.i.a(obj, next)) {
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

    public static Object M(List list) {
        D1.i.e(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    public static Object N(List list) {
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static Object O(List list, int i) {
        D1.i.e(list, "<this>");
        if (i < 0 || i >= list.size()) {
            return null;
        }
        return list.get(i);
    }

    public static final void P(Iterable iterable, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, C1.l lVar) {
        D1.i.e(iterable, "<this>");
        D1.i.e(charSequence, "separator");
        D1.i.e(charSequence2, "prefix");
        D1.i.e(charSequence3, "postfix");
        D1.i.e(charSequence4, "truncated");
        sb.append(charSequence2);
        Iterator it = iterable.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i2++;
            if (i2 > 1) {
                sb.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            if (lVar != null) {
                sb.append((CharSequence) lVar.g(next));
            } else {
                if (next != null ? next instanceof CharSequence : true) {
                    sb.append((CharSequence) next);
                } else if (next instanceof Character) {
                    sb.append(((Character) next).charValue());
                } else {
                    sb.append((CharSequence) String.valueOf(next));
                }
            }
        }
        if (i >= 0 && i2 > i) {
            sb.append(charSequence4);
        }
        sb.append(charSequence3);
    }

    public static String Q(Iterable iterable, String str, String str2, String str3, C1.l lVar, int i) {
        String str4 = (i & 2) != 0 ? "" : str2;
        String str5 = (i & 4) != 0 ? "" : str3;
        if ((i & 32) != 0) {
            lVar = null;
        }
        D1.i.e(iterable, "<this>");
        D1.i.e(str4, "prefix");
        D1.i.e(str5, "postfix");
        StringBuilder sb = new StringBuilder();
        P(iterable, sb, str, str4, str5, -1, "...", lVar);
        String sb2 = sb.toString();
        D1.i.d(sb2, "toString(...)");
        return sb2;
    }

    public static Object R(List list) {
        D1.i.e(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(h.E(list));
    }

    public static Object S(List list) {
        D1.i.e(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static Comparable T(ArrayList arrayList) {
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

    public static ArrayList U(Collection collection, Iterable iterable) {
        D1.i.e(collection, "<this>");
        D1.i.e(iterable, "elements");
        if (!(iterable instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            m.J(iterable, arrayList);
            return arrayList;
        }
        Collection collection2 = (Collection) iterable;
        ArrayList arrayList2 = new ArrayList(collection2.size() + collection.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    public static List V(Iterable iterable) {
        ArrayList arrayList;
        D1.i.e(iterable, "<this>");
        boolean z2 = iterable instanceof Collection;
        if (z2 && ((Collection) iterable).size() <= 1) {
            return Y(iterable);
        }
        if (z2) {
            arrayList = Z((Collection) iterable);
        } else {
            ArrayList arrayList2 = new ArrayList();
            W(iterable, arrayList2);
            arrayList = arrayList2;
        }
        Collections.reverse(arrayList);
        return arrayList;
    }

    public static final void W(Iterable iterable, AbstractCollection abstractCollection) {
        D1.i.e(iterable, "<this>");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    public static int[] X(List list) {
        D1.i.e(list, "<this>");
        int[] iArr = new int[list.size()];
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = ((Number) it.next()).intValue();
            i++;
        }
        return iArr;
    }

    public static List Y(Iterable iterable) {
        ArrayList arrayList;
        D1.i.e(iterable, "<this>");
        boolean z2 = iterable instanceof Collection;
        if (!z2) {
            if (z2) {
                arrayList = Z((Collection) iterable);
            } else {
                ArrayList arrayList2 = new ArrayList();
                W(iterable, arrayList2);
                arrayList = arrayList2;
            }
            return h.G(arrayList);
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return o.f4473a;
        }
        if (size != 1) {
            return Z(collection);
        }
        return h0.f.s(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
    }

    public static ArrayList Z(Collection collection) {
        D1.i.e(collection, "<this>");
        return new ArrayList(collection);
    }

    public static Set a0(Iterable iterable) {
        D1.i.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        W(iterable, linkedHashSet);
        return linkedHashSet;
    }
}
