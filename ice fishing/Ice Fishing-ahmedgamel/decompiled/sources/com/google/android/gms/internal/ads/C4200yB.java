package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.ads.yB, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C4200yB extends AbstractCollection implements List {

    /* renamed from: n, reason: collision with root package name */
    public final Object f35125n;

    /* renamed from: u, reason: collision with root package name */
    public Collection f35126u;

    /* renamed from: v, reason: collision with root package name */
    public final C4200yB f35127v;

    /* renamed from: w, reason: collision with root package name */
    public final Collection f35128w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ C3340iC f35129x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ C3340iC f35130y;

    public C4200yB(C3340iC c3340iC, Object obj, List list, C4200yB c4200yB) {
        Objects.requireNonNull(c3340iC);
        this.f35130y = c3340iC;
        this.f35129x = c3340iC;
        this.f35125n = obj;
        this.f35126u = list;
        this.f35127v = c4200yB;
        this.f35128w = c4200yB == null ? null : c4200yB.f35126u;
    }

    public final void a() {
        Collection collection;
        C4200yB c4200yB = this.f35127v;
        if (c4200yB != null) {
            c4200yB.a();
            if (c4200yB.f35126u != this.f35128w) {
                throw new ConcurrentModificationException();
            }
        } else {
            if (!this.f35126u.isEmpty() || (collection = (Collection) this.f35129x.f31011w.get(this.f35125n)) == null) {
                return;
            }
            this.f35126u = collection;
        }
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        a();
        boolean isEmpty = this.f35126u.isEmpty();
        ((List) this.f35126u).add(i, obj);
        this.f35130y.f31012x++;
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
        boolean addAll = ((List) this.f35126u).addAll(i, collection);
        if (!addAll) {
            return addAll;
        }
        this.f35130y.f31012x += this.f35126u.size() - size;
        if (size != 0) {
            return addAll;
        }
        d();
        return true;
    }

    public final void c() {
        C4200yB c4200yB = this.f35127v;
        if (c4200yB != null) {
            c4200yB.c();
        } else if (this.f35126u.isEmpty()) {
            this.f35129x.f31011w.remove(this.f35125n);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        int size = size();
        if (size == 0) {
            return;
        }
        this.f35126u.clear();
        this.f35129x.f31012x -= size;
        c();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        a();
        return this.f35126u.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean containsAll(Collection collection) {
        a();
        return this.f35126u.containsAll(collection);
    }

    public final void d() {
        C4200yB c4200yB = this.f35127v;
        if (c4200yB != null) {
            c4200yB.d();
        } else {
            this.f35129x.f31011w.put(this.f35125n, this.f35126u);
        }
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        a();
        return this.f35126u.equals(obj);
    }

    @Override // java.util.List
    public final Object get(int i) {
        a();
        return ((List) this.f35126u).get(i);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        a();
        return this.f35126u.hashCode();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        a();
        return ((List) this.f35126u).indexOf(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        a();
        return new C3661oB(this);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        a();
        return ((List) this.f35126u).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        a();
        return new C4146xB(this);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        a();
        Object remove = ((List) this.f35126u).remove(i);
        C3340iC c3340iC = this.f35130y;
        c3340iC.f31012x--;
        c();
        return remove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean removeAll = this.f35126u.removeAll(collection);
        if (removeAll) {
            this.f35129x.f31012x += this.f35126u.size() - size;
            c();
        }
        return removeAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        int size = size();
        boolean retainAll = this.f35126u.retainAll(collection);
        if (retainAll) {
            this.f35129x.f31012x += this.f35126u.size() - size;
            c();
        }
        return retainAll;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        a();
        return ((List) this.f35126u).set(i, obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        a();
        return this.f35126u.size();
    }

    @Override // java.util.List
    public final List subList(int i, int i6) {
        a();
        List subList = ((List) this.f35126u).subList(i, i6);
        C4200yB c4200yB = this.f35127v;
        if (c4200yB == null) {
            c4200yB = this;
        }
        C3340iC c3340iC = this.f35130y;
        c3340iC.getClass();
        boolean z3 = subList instanceof RandomAccess;
        Object obj = this.f35125n;
        return z3 ? new C3930tB(c3340iC, obj, subList, c4200yB) : new C4200yB(c3340iC, obj, subList, c4200yB);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        a();
        return this.f35126u.toString();
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        a();
        return new C4146xB(this, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        a();
        boolean remove = this.f35126u.remove(obj);
        if (remove) {
            C3340iC c3340iC = this.f35129x;
            c3340iC.f31012x--;
            c();
        }
        return remove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        a();
        boolean isEmpty = this.f35126u.isEmpty();
        boolean add = this.f35126u.add(obj);
        if (add) {
            this.f35129x.f31012x++;
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
        boolean addAll = this.f35126u.addAll(collection);
        if (!addAll) {
            return addAll;
        }
        this.f35129x.f31012x += this.f35126u.size() - size;
        if (size != 0) {
            return addAll;
        }
        d();
        return true;
    }
}
