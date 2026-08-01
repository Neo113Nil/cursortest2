package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.SortedSet;

/* renamed from: com.google.android.gms.internal.ads.vC, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4039vC extends C3985uC implements SortedSet {
    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return ((SortedSet) this.f34504n).comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        Iterator it = this.f34504n.iterator();
        it.getClass();
        XA xa = this.f34505u;
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
        return new C4039vC(((SortedSet) this.f34504n).headSet(obj), this.f34505u);
    }

    @Override // java.util.SortedSet
    public final Object last() {
        SortedSet sortedSet = (SortedSet) this.f34504n;
        while (true) {
            Object last = sortedSet.last();
            if (this.f34505u.a(last)) {
                return last;
            }
            sortedSet = sortedSet.headSet(last);
        }
    }

    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return new C4039vC(((SortedSet) this.f34504n).subSet(obj, obj2), this.f34505u);
    }

    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return new C4039vC(((SortedSet) this.f34504n).tailSet(obj), this.f34505u);
    }
}
