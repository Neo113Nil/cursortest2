package q0;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class c extends bc.e implements List, Collection, qc.a {
    public abstract c b(int i10, Object obj);

    @Override // bc.a, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // bc.a, java.util.Collection
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

    public abstract c d(Object obj);

    public c e(Collection collection) {
        f f10 = f();
        f10.addAll(collection);
        return f10.d();
    }

    public abstract f f();

    public abstract c g(b bVar);

    public abstract c h(int i10);

    public abstract c i(int i10, Object obj);

    @Override // bc.e, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // bc.e, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // bc.e, java.util.List
    public final List subList(int i10, int i11) {
        return new p0.a(this, i10, i11);
    }
}
