package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import kotlin.collections.a;

/* loaded from: classes9.dex */
public class ycc extends xcc {
    public static Object A(List list) {
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(scc.f(list));
    }

    public static void r(Iterable iterable, Collection collection) {
        if (iterable instanceof Collection) {
            collection.addAll((Collection) iterable);
            return;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            collection.add(it.next());
        }
    }

    public static void s(Collection collection, qrq0 qrq0Var) {
        Iterator it = qrq0Var.iterator();
        while (it.hasNext()) {
            collection.add(it.next());
        }
    }

    public static void t(Collection collection, Object[] objArr) {
        collection.addAll(Arrays.asList(objArr));
    }

    public static final Collection u(Iterable iterable) {
        return iterable instanceof Collection ? (Collection) iterable : a.J0(iterable);
    }

    public static final boolean v(Iterable iterable, tls tlsVar, boolean z) {
        Iterator it = iterable.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            if (((Boolean) tlsVar.invoke(it.next())).booleanValue() == z) {
                it.remove();
                z2 = true;
            }
        }
        return z2;
    }

    public static final boolean w(List list, tls tlsVar, boolean z) {
        int i;
        if (!(list instanceof RandomAccess)) {
            if ((list instanceof xfx) && !(list instanceof yfx)) {
                ym11.j(list, "kotlin.collections.MutableIterable");
                throw null;
            }
            try {
                return v(list, tlsVar, z);
            } catch (ClassCastException e) {
                jl40.J(e, ym11.class.getName());
                throw e;
            }
        }
        int f = scc.f(list);
        if (f >= 0) {
            int i2 = 0;
            i = 0;
            while (true) {
                Object obj = list.get(i2);
                if (((Boolean) tlsVar.invoke(obj)).booleanValue() != z) {
                    if (i != i2) {
                        list.set(i, obj);
                    }
                    i++;
                }
                if (i2 == f) {
                    break;
                }
                i2++;
            }
        } else {
            i = 0;
        }
        if (i >= list.size()) {
            return false;
        }
        int f2 = scc.f(list);
        if (i > f2) {
            return true;
        }
        while (true) {
            list.remove(f2);
            if (f2 == i) {
                return true;
            }
            f2--;
        }
    }

    public static Object x(List list) {
        if (!list.isEmpty()) {
            return list.remove(0);
        }
        w511.i("List is empty.");
        return null;
    }

    public static Object y(List list) {
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(0);
    }

    public static Object z(List list) {
        if (!list.isEmpty()) {
            return list.remove(scc.f(list));
        }
        w511.i("List is empty.");
        return null;
    }
}
