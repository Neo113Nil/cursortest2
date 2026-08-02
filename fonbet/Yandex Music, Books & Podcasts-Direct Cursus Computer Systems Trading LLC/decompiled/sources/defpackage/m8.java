package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.collections.a;

/* loaded from: classes.dex */
public abstract class m8 extends a implements List, Collection, j9f {
    public abstract m8 a(int i, Object obj);

    @Override // defpackage.w5, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // defpackage.w5, java.util.Collection, java.util.List
    public final boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public abstract m8 g(Object obj);

    @Override // kotlin.collections.a, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // kotlin.collections.a, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    public m8 o(Collection collection) {
        hmk q = q();
        q.addAll(collection);
        return q.g();
    }

    public abstract hmk q();

    public abstract m8 r(l8 l8Var);

    public abstract m8 s(int i);

    @Override // kotlin.collections.a, java.util.List
    public final List subList(int i, int i2) {
        return new xde(this, i, i2);
    }

    public abstract m8 t(int i, Object obj);
}
