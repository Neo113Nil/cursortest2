package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.tC, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3954tC extends AbstractSet {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ XB f35013n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ XB f35014u;

    public C3954tC(XB xb, XB xb2) {
        this.f35013n = xb;
        this.f35014u = xb2;
    }

    public final int a() {
        return Math.min(this.f35013n.size(), this.f35014u.size());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f35013n.contains(obj) && this.f35014u.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return this.f35013n.containsAll(collection) && this.f35014u.containsAll(collection);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        int size;
        if (obj != this) {
            if (obj instanceof Set) {
                Set set = (Set) obj;
                boolean z6 = set instanceof C3954tC;
                int a9 = z6 ? ((C3954tC) set).a() : set.size();
                if (a9 >= 0) {
                    if (z6) {
                        ((C3954tC) set).getClass();
                        size = 0;
                    } else {
                        size = set.size();
                    }
                    if (a() >= size) {
                        C2933aC c2933aC = new C2933aC(this, this.f35013n, this.f35014u);
                        int i = 0;
                        while (true) {
                            if (c2933aC.hasNext()) {
                                try {
                                    if (!set.contains(c2933aC.next())) {
                                        break;
                                    }
                                    i++;
                                } catch (ClassCastException | NullPointerException unused) {
                                }
                            } else if (i != a9) {
                                if (i >= size) {
                                    Iterator it = set.iterator();
                                    int i4 = 0;
                                    while (it.hasNext()) {
                                        it.next();
                                        i4++;
                                        if (i4 > i) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return Collections.disjoint(this.f35014u, this.f35013n);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C2933aC(this, this.f35013n, this.f35014u);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Iterator it = this.f35013n.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (this.f35014u.contains(it.next())) {
                i++;
            }
        }
        return i;
    }
}
