package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.tC, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3931tC extends AbstractSet {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ XB f34227n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ XB f34228u;

    public C3931tC(XB xb, XB xb2) {
        this.f34227n = xb;
        this.f34228u = xb2;
    }

    public final int a() {
        return Math.min(this.f34227n.size(), this.f34228u.size());
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
        return this.f34227n.contains(obj) && this.f34228u.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return this.f34227n.containsAll(collection) && this.f34228u.containsAll(collection);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        int size;
        if (obj != this) {
            if (obj instanceof Set) {
                Set set = (Set) obj;
                boolean z3 = set instanceof C3931tC;
                int a9 = z3 ? ((C3931tC) set).a() : set.size();
                if (a9 >= 0) {
                    if (z3) {
                        ((C3931tC) set).getClass();
                        size = 0;
                    } else {
                        size = set.size();
                    }
                    if (a() >= size) {
                        C2910aC c2910aC = new C2910aC(this, this.f34227n, this.f34228u);
                        int i = 0;
                        while (true) {
                            if (c2910aC.hasNext()) {
                                try {
                                    if (!set.contains(c2910aC.next())) {
                                        break;
                                    }
                                    i++;
                                } catch (ClassCastException | NullPointerException unused) {
                                }
                            } else if (i != a9) {
                                if (i >= size) {
                                    Iterator it = set.iterator();
                                    int i6 = 0;
                                    while (it.hasNext()) {
                                        it.next();
                                        i6++;
                                        if (i6 > i) {
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
        return Collections.disjoint(this.f34228u, this.f34227n);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C2910aC(this, this.f34227n, this.f34228u);
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
        Iterator it = this.f34227n.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (this.f34228u.contains(it.next())) {
                i++;
            }
        }
        return i;
    }
}
