package defpackage;

import java.util.Collections;
import java.util.Comparator;
import java.util.NavigableSet;
import java.util.SortedSet;

/* loaded from: classes.dex */
public abstract class c6x extends u5x implements NavigableSet, Iterable {
    public final transient Comparator f;
    public transient c6x g;

    public c6x(Comparator comparator) {
        super(0);
        this.f = comparator;
    }

    public static t6x y(Comparator comparator) {
        if (l6x.b.equals(comparator)) {
            return t6x.i;
        }
        t4x t4xVar = q5x.d;
        return new t6x(o6x.g, comparator);
    }

    public final void addFirst(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final void addLast(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return this.f;
    }

    @Override // java.util.SortedSet
    public abstract Object first();

    public final Object getFirst() {
        return first();
    }

    public final Object getLast() {
        return last();
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        obj.getClass();
        t6x t6xVar = (t6x) this;
        return t6xVar.B(0, t6xVar.z(obj, false));
    }

    @Override // java.util.SortedSet
    public abstract Object last();

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        throw new UnsupportedOperationException();
    }

    public final Object removeFirst() {
        throw new UnsupportedOperationException();
    }

    public final Object removeLast() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final /* bridge */ /* synthetic */ SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        obj.getClass();
        t6x t6xVar = (t6x) this;
        return t6xVar.B(t6xVar.A(obj, true), t6xVar.h.size());
    }

    @Override // java.util.NavigableSet
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public final c6x descendingSet() {
        c6x c6xVar = this.g;
        if (c6xVar == null) {
            t6x t6xVar = (t6x) this;
            Comparator reverseOrder = Collections.reverseOrder(t6xVar.f);
            c6xVar = t6xVar.isEmpty() ? y(reverseOrder) : new t6x(t6xVar.h.s(), reverseOrder);
            this.g = c6xVar;
            c6xVar.g = this;
        }
        return c6xVar;
    }

    @Override // java.util.NavigableSet
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public final t6x subSet(Object obj, boolean z, Object obj2, boolean z2) {
        obj.getClass();
        obj2.getClass();
        if (this.f.compare(obj, obj2) > 0) {
            e7o.e();
            return null;
        }
        t6x t6xVar = (t6x) this;
        t6x B = t6xVar.B(t6xVar.A(obj, z), t6xVar.h.size());
        return B.B(0, B.z(obj2, z2));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z) {
        obj.getClass();
        t6x t6xVar = (t6x) this;
        return t6xVar.B(0, t6xVar.z(obj, z));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z) {
        obj.getClass();
        t6x t6xVar = (t6x) this;
        return t6xVar.B(t6xVar.A(obj, z), t6xVar.h.size());
    }
}
