package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public class BB extends AbstractCollection implements List {

    /* renamed from: n, reason: collision with root package name */
    public final Object f24002n;

    /* renamed from: u, reason: collision with root package name */
    public Collection f24003u;

    /* renamed from: v, reason: collision with root package name */
    public final BB f24004v;

    /* renamed from: w, reason: collision with root package name */
    public final Collection f24005w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ C3513lC f24006x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ C3513lC f24007y;

    public BB(C3513lC c3513lC, Object obj, List list, BB bb) {
        Objects.requireNonNull(c3513lC);
        this.f24007y = c3513lC;
        this.f24006x = c3513lC;
        this.f24002n = obj;
        this.f24003u = list;
        this.f24004v = bb;
        this.f24005w = bb == null ? null : bb.f24003u;
    }

    public final void a() {
        Collection collection;
        BB bb = this.f24004v;
        if (bb != null) {
            bb.a();
            if (bb.f24003u != this.f24005w) {
                throw new ConcurrentModificationException();
            }
        } else {
            if (!this.f24003u.isEmpty() || (collection = (Collection) this.f24006x.f32551w.get(this.f24002n)) == null) {
                return;
            }
            this.f24003u = collection;
        }
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        a();
        boolean isEmpty = this.f24003u.isEmpty();
        ((List) this.f24003u).add(i, obj);
        this.f24007y.f32552x++;
        if (isEmpty) {
            d();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = ((List) this.f24003u).addAll(i, collection);
        if (!addAll) {
            return addAll;
        }
        this.f24007y.f32552x += this.f24003u.size() - size;
        if (size != 0) {
            return addAll;
        }
        d();
        return true;
    }

    public final void c() {
        BB bb = this.f24004v;
        if (bb != null) {
            bb.c();
        } else if (this.f24003u.isEmpty()) {
            this.f24006x.f32551w.remove(this.f24002n);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        int size = size();
        if (size == 0) {
            return;
        }
        this.f24003u.clear();
        this.f24006x.f32552x -= size;
        c();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        a();
        return this.f24003u.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean containsAll(Collection collection) {
        a();
        return this.f24003u.containsAll(collection);
    }

    public final void d() {
        BB bb = this.f24004v;
        if (bb != null) {
            bb.d();
        } else {
            this.f24006x.f32551w.put(this.f24002n, this.f24003u);
        }
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        a();
        return this.f24003u.equals(obj);
    }

    @Override // java.util.List
    public final Object get(int i) {
        a();
        return ((List) this.f24003u).get(i);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        a();
        return this.f24003u.hashCode();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        a();
        return ((List) this.f24003u).indexOf(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        a();
        return new C3835rB(this);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        a();
        return ((List) this.f24003u).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        a();
        return new AB(this);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        a();
        Object remove = ((List) this.f24003u).remove(i);
        C3513lC c3513lC = this.f24007y;
        c3513lC.f32552x--;
        c();
        return remove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean removeAll = this.f24003u.removeAll(collection);
        if (removeAll) {
            this.f24006x.f32552x += this.f24003u.size() - size;
            c();
        }
        return removeAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        int size = size();
        boolean retainAll = this.f24003u.retainAll(collection);
        if (retainAll) {
            this.f24006x.f32552x += this.f24003u.size() - size;
            c();
        }
        return retainAll;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        a();
        return ((List) this.f24003u).set(i, obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        a();
        return this.f24003u.size();
    }

    @Override // java.util.List
    public final List subList(int i, int i4) {
        a();
        List subList = ((List) this.f24003u).subList(i, i4);
        BB bb = this.f24004v;
        if (bb == null) {
            bb = this;
        }
        C3513lC c3513lC = this.f24007y;
        c3513lC.getClass();
        boolean z8 = subList instanceof RandomAccess;
        Object obj = this.f24002n;
        return z8 ? new C4159xB(c3513lC, obj, subList, bb) : new BB(c3513lC, obj, subList, bb);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        a();
        return this.f24003u.toString();
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        a();
        return new AB(this, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        a();
        boolean remove = this.f24003u.remove(obj);
        if (remove) {
            C3513lC c3513lC = this.f24006x;
            c3513lC.f32552x--;
            c();
        }
        return remove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        a();
        boolean isEmpty = this.f24003u.isEmpty();
        boolean add = this.f24003u.add(obj);
        if (add) {
            this.f24006x.f32552x++;
            if (isEmpty) {
                d();
                return true;
            }
        }
        return add;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = this.f24003u.addAll(collection);
        if (!addAll) {
            return addAll;
        }
        this.f24006x.f32552x += this.f24003u.size() - size;
        if (size != 0) {
            return addAll;
        }
        d();
        return true;
    }
}
