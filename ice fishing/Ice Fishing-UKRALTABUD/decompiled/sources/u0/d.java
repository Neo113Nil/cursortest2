package u0;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class d extends j {
    public static final void E(Collection collection, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, D0.l lVar) {
        E0.i.e(collection, "<this>");
        E0.i.e(charSequence, "separator");
        E0.i.e(charSequence2, "prefix");
        E0.i.e(charSequence3, "postfix");
        E0.i.e(charSequence4, "truncated");
        sb.append(charSequence2);
        Iterator it = collection.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i3++;
            if (i3 > 1) {
                sb.append(charSequence);
            }
            if (i2 >= 0 && i3 > i2) {
                break;
            }
            if (lVar != null) {
                sb.append((CharSequence) lVar.i(next));
            } else {
                if (next != null ? next instanceof CharSequence : true) {
                    sb.append((CharSequence) next);
                } else if (next instanceof Character) {
                    sb.append(((Character) next).charValue());
                } else {
                    sb.append((CharSequence) next.toString());
                }
            }
        }
        if (i2 >= 0 && i3 > i2) {
            sb.append(charSequence4);
        }
        sb.append(charSequence3);
    }

    public static String F(Collection collection, String str, String str2, String str3, D0.l lVar, int i2) {
        String str4 = (i2 & 2) != 0 ? "" : str2;
        String str5 = (i2 & 4) != 0 ? "" : str3;
        if ((i2 & 32) != 0) {
            lVar = null;
        }
        E0.i.e(collection, "<this>");
        E0.i.e(str4, "prefix");
        E0.i.e(str5, "postfix");
        StringBuilder sb = new StringBuilder();
        E(collection, sb, str, str4, str5, -1, "...", lVar);
        return sb.toString();
    }

    public static final void G(Iterable iterable, AbstractCollection abstractCollection) {
        E0.i.e(iterable, "<this>");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    public static List H(Iterable iterable) {
        ArrayList arrayList;
        E0.i.e(iterable, "<this>");
        boolean z2 = iterable instanceof Collection;
        l lVar = l.f3001f;
        if (!z2) {
            if (z2) {
                arrayList = new ArrayList((Collection) iterable);
            } else {
                arrayList = new ArrayList();
                G(iterable, arrayList);
            }
            int size = arrayList.size();
            return size != 0 ? size != 1 ? arrayList : o.g.v(arrayList.get(0)) : lVar;
        }
        Collection collection = (Collection) iterable;
        int size2 = collection.size();
        if (size2 == 0) {
            return lVar;
        }
        if (size2 != 1) {
            return new ArrayList(collection);
        }
        return o.g.v(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    public static Set I(Collection collection) {
        E0.i.e(collection, "<this>");
        n nVar = n.f3003f;
        int size = collection.size();
        if (size == 0) {
            return nVar;
        }
        if (size != 1) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(o.g.w(collection.size()));
            G(collection, linkedHashSet);
            return linkedHashSet;
        }
        Set singleton = Collections.singleton(collection instanceof List ? ((List) collection).get(0) : collection.iterator().next());
        E0.i.d(singleton, "singleton(...)");
        return singleton;
    }
}
