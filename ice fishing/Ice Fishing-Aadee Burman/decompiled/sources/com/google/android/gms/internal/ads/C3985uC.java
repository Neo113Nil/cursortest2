package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.uC, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3985uC extends AbstractCollection implements Set {

    /* renamed from: n, reason: collision with root package name */
    public final Set f34504n;

    /* renamed from: u, reason: collision with root package name */
    public final XA f34505u;

    public C3985uC(Set set, XA xa) {
        this.f34504n = set;
        this.f34505u = xa;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        AbstractC2772Sd.i(this.f34505u.a(obj));
        return this.f34504n.add(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            AbstractC2772Sd.i(this.f34505u.a(it.next()));
        }
        return this.f34504n.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        Set set = this.f34504n;
        boolean z3 = set instanceof RandomAccess;
        XA xa = this.f34505u;
        if (!z3 || !(set instanceof List)) {
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
        for (int i6 = 0; i6 < list.size(); i6++) {
            Object obj = list.get(i6);
            if (!xa.a(obj)) {
                if (i6 > i) {
                    try {
                        list.set(i, obj);
                    } catch (IllegalArgumentException unused) {
                        MA.H(list, xa, i, i6);
                        return;
                    } catch (UnsupportedOperationException unused2) {
                        MA.H(list, xa, i, i6);
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
        boolean z3;
        Set set = this.f34504n;
        set.getClass();
        try {
            z3 = set.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            z3 = false;
        }
        if (z3) {
            return this.f34505u.a(obj);
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
        return AbstractC2639Kg.y(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return AbstractC2639Kg.t(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        Iterator it = this.f34504n.iterator();
        XA xa = this.f34505u;
        AbstractC2772Sd.J(xa, "predicate");
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
        Iterator it = this.f34504n.iterator();
        it.getClass();
        XA xa = this.f34505u;
        xa.getClass();
        return new C2910aC(it, xa);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        return contains(obj) && this.f34504n.remove(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        Iterator it = this.f34504n.iterator();
        boolean z3 = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f34505u.a(next) && collection.contains(next)) {
                it.remove();
                z3 = true;
            }
        }
        return z3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        Iterator it = this.f34504n.iterator();
        boolean z3 = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f34505u.a(next) && !collection.contains(next)) {
                it.remove();
                z3 = true;
            }
        }
        return z3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Iterator it = this.f34504n.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (this.f34505u.a(it.next())) {
                i++;
            }
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return AbstractC2968bG.g((AbstractC4255zC) iterator()).toArray();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        return AbstractC2968bG.g((AbstractC4255zC) iterator()).toArray(objArr);
    }
}
