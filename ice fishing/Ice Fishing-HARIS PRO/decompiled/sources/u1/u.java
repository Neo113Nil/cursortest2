package u1;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class u extends c {

    /* renamed from: a, reason: collision with root package name */
    public final List f4478a;

    public u(List list) {
        this.f4478a = list;
    }

    @Override // u1.c
    public final int a() {
        return this.f4478a.size();
    }

    @Override // java.util.List
    public final Object get(int i) {
        if (i >= 0 && i <= h.E(this)) {
            return this.f4478a.get(h.E(this) - i);
        }
        throw new IndexOutOfBoundsException("Element index " + i + " must be in range [" + new H1.c(0, h.E(this), 1) + "].");
    }

    @Override // u1.c, java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new t(this, 0);
    }

    @Override // u1.c, java.util.List
    public final ListIterator listIterator() {
        return new t(this, 0);
    }

    @Override // u1.c, java.util.List
    public final ListIterator listIterator(int i) {
        return new t(this, i);
    }
}
