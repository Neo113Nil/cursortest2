package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.xC, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C4160xC extends AbstractCollection implements Set {

    /* renamed from: n, reason: collision with root package name */
    public final Set f35127n;

    /* renamed from: u, reason: collision with root package name */
    public final InterfaceC2916aB f35128u;

    public C4160xC(Set set, InterfaceC2916aB interfaceC2916aB) {
        this.f35127n = set;
        this.f35128u = interfaceC2916aB;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        PA.n(this.f35128u.b(obj));
        return this.f35127n.add(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            PA.n(this.f35128u.b(it.next()));
        }
        return this.f35127n.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        Set set = this.f35127n;
        boolean z8 = set instanceof RandomAccess;
        InterfaceC2916aB interfaceC2916aB = this.f35128u;
        if (!z8 || !(set instanceof List)) {
            Iterator it = set.iterator();
            interfaceC2916aB.getClass();
            while (it.hasNext()) {
                if (interfaceC2916aB.b(it.next())) {
                    it.remove();
                }
            }
            return;
        }
        List list = (List) set;
        interfaceC2916aB.getClass();
        int i = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            Object obj = list.get(i4);
            if (!interfaceC2916aB.b(obj)) {
                if (i4 > i) {
                    try {
                        list.set(i, obj);
                    } catch (IllegalArgumentException unused) {
                        AbstractC2720Pd.F(list, interfaceC2916aB, i, i4);
                        return;
                    } catch (UnsupportedOperationException unused2) {
                        AbstractC2720Pd.F(list, interfaceC2916aB, i, i4);
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
        boolean z8;
        Set set = this.f35127n;
        set.getClass();
        try {
            z8 = set.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            z8 = false;
        }
        if (z8) {
            return this.f35128u.b(obj);
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
        return AbstractC3194fG.v(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return AbstractC3194fG.s(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        Iterator it = this.f35127n.iterator();
        InterfaceC2916aB interfaceC2916aB = this.f35128u;
        PA.X(interfaceC2916aB, "predicate");
        int i = 0;
        while (it.hasNext()) {
            if (interfaceC2916aB.b(it.next())) {
                return i == -1;
            }
            i++;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        Iterator it = this.f35127n.iterator();
        it.getClass();
        InterfaceC2916aB interfaceC2916aB = this.f35128u;
        interfaceC2916aB.getClass();
        return new C3081dC(it, interfaceC2916aB);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        return contains(obj) && this.f35127n.remove(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        Iterator it = this.f35127n.iterator();
        boolean z8 = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f35128u.b(next) && collection.contains(next)) {
                it.remove();
                z8 = true;
            }
        }
        return z8;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        Iterator it = this.f35127n.iterator();
        boolean z8 = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f35128u.b(next) && !collection.contains(next)) {
                it.remove();
                z8 = true;
            }
        }
        return z8;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Iterator it = this.f35127n.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (this.f35128u.b(it.next())) {
                i++;
            }
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return AbstractC2655Lg.g((CC) iterator()).toArray();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        return AbstractC2655Lg.g((CC) iterator()).toArray(objArr);
    }
}
