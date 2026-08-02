package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.uC, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C4008uC extends AbstractCollection implements Set {

    /* renamed from: n, reason: collision with root package name */
    public final Set f35278n;

    /* renamed from: u, reason: collision with root package name */
    public final XA f35279u;

    public C4008uC(Set set, XA xa) {
        this.f35278n = set;
        this.f35279u = xa;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        AbstractC2792Sd.i(this.f35279u.a(obj));
        return this.f35278n.add(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            AbstractC2792Sd.i(this.f35279u.a(it.next()));
        }
        return this.f35278n.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        Set set = this.f35278n;
        boolean z6 = set instanceof RandomAccess;
        XA xa = this.f35279u;
        if (!z6 || !(set instanceof List)) {
            Iterator it = set.iterator();
            xa.getClass();
            while (it.hasNext()) {
                if (xa.a(it.next())) {
                    it.remove();
                }
            }
            return;
        }
        List list = (List) set;
        xa.getClass();
        int i = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            Object obj = list.get(i4);
            if (!xa.a(obj)) {
                if (i4 > i) {
                    try {
                        list.set(i, obj);
                    } catch (IllegalArgumentException unused) {
                        MA.H(list, xa, i, i4);
                        return;
                    } catch (UnsupportedOperationException unused2) {
                        MA.H(list, xa, i, i4);
                        return;
                    }
                }
                i++;
            }
        }
        list.subList(i, list.size()).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        boolean z6;
        Set set = this.f35278n;
        set.getClass();
        try {
            z6 = set.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            z6 = false;
        }
        if (z6) {
            return this.f35279u.a(obj);
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return AbstractC2659Kg.y(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return AbstractC2659Kg.t(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        Iterator it = this.f35278n.iterator();
        XA xa = this.f35279u;
        AbstractC2792Sd.J(xa, "predicate");
        int i = 0;
        while (it.hasNext()) {
            if (xa.a(it.next())) {
                return i == -1;
            }
            i++;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        Iterator it = this.f35278n.iterator();
        it.getClass();
        XA xa = this.f35279u;
        xa.getClass();
        return new C2933aC(it, xa);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        return contains(obj) && this.f35278n.remove(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        Iterator it = this.f35278n.iterator();
        boolean z6 = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f35279u.a(next) && collection.contains(next)) {
                it.remove();
                z6 = true;
            }
        }
        return z6;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        Iterator it = this.f35278n.iterator();
        boolean z6 = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f35279u.a(next) && !collection.contains(next)) {
                it.remove();
                z6 = true;
            }
        }
        return z6;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Iterator it = this.f35278n.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (this.f35279u.a(it.next())) {
                i++;
            }
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return AbstractC2991bG.g((AbstractC4278zC) iterator()).toArray();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        return AbstractC2991bG.g((AbstractC4278zC) iterator()).toArray(objArr);
    }
}
