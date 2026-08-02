package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.SortedSet;

/* renamed from: com.google.android.gms.internal.ads.vC, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4062vC extends C4008uC implements SortedSet {
    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return ((SortedSet) this.f35278n).comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        Iterator it = this.f35278n.iterator();
        it.getClass();
        XA xa = this.f35279u;
        xa.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            if (xa.a(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return new C4062vC(((SortedSet) this.f35278n).headSet(obj), this.f35279u);
    }

    @Override // java.util.SortedSet
    public final Object last() {
        SortedSet sortedSet = (SortedSet) this.f35278n;
        while (true) {
            Object last = sortedSet.last();
            if (this.f35279u.a(last)) {
                return last;
            }
            sortedSet = sortedSet.headSet(last);
        }
    }

    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return new C4062vC(((SortedSet) this.f35278n).subSet(obj, obj2), this.f35279u);
    }

    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return new C4062vC(((SortedSet) this.f35278n).tailSet(obj), this.f35279u);
    }
}
