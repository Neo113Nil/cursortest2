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
public class C4223yB extends AbstractCollection implements List {

    /* renamed from: n, reason: collision with root package name */
    public final Object f35911n;

    /* renamed from: u, reason: collision with root package name */
    public Collection f35912u;

    /* renamed from: v, reason: collision with root package name */
    public final C4223yB f35913v;

    /* renamed from: w, reason: collision with root package name */
    public final Collection f35914w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ C3363iC f35915x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ C3363iC f35916y;

    public C4223yB(C3363iC c3363iC, Object obj, List list, C4223yB c4223yB) {
        Objects.requireNonNull(c3363iC);
        this.f35916y = c3363iC;
        this.f35915x = c3363iC;
        this.f35911n = obj;
        this.f35912u = list;
        this.f35913v = c4223yB;
        this.f35914w = c4223yB == null ? null : c4223yB.f35912u;
    }

    public final void a() {
        Collection collection;
        C4223yB c4223yB = this.f35913v;
        if (c4223yB != null) {
            c4223yB.a();
            if (c4223yB.f35912u != this.f35914w) {
                throw new ConcurrentModificationException();
            }
        } else {
            if (!this.f35912u.isEmpty() || (collection = (Collection) this.f35915x.f31784w.get(this.f35911n)) == null) {
                return;
            }
            this.f35912u = collection;
        }
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        a();
        boolean isEmpty = this.f35912u.isEmpty();
        ((List) this.f35912u).add(i, obj);
        this.f35916y.f31785x++;
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
        boolean addAll = ((List) this.f35912u).addAll(i, collection);
        if (!addAll) {
            return addAll;
        }
        this.f35916y.f31785x += this.f35912u.size() - size;
        if (size != 0) {
            return addAll;
        }
        d();
        return true;
    }

    public final void c() {
        C4223yB c4223yB = this.f35913v;
        if (c4223yB != null) {
            c4223yB.c();
        } else if (this.f35912u.isEmpty()) {
            this.f35915x.f31784w.remove(this.f35911n);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        int size = size();
        if (size == 0) {
            return;
        }
        this.f35912u.clear();
        this.f35915x.f31785x -= size;
        c();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        a();
        return this.f35912u.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean containsAll(Collection collection) {
        a();
        return this.f35912u.containsAll(collection);
    }

    public final void d() {
        C4223yB c4223yB = this.f35913v;
        if (c4223yB != null) {
            c4223yB.d();
        } else {
            this.f35915x.f31784w.put(this.f35911n, this.f35912u);
        }
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        a();
        return this.f35912u.equals(obj);
    }

    @Override // java.util.List
    public final Object get(int i) {
        a();
        return ((List) this.f35912u).get(i);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        a();
        return this.f35912u.hashCode();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        a();
        return ((List) this.f35912u).indexOf(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        a();
        return new C3684oB(this);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        a();
        return ((List) this.f35912u).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        a();
        return new C4169xB(this);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        a();
        Object remove = ((List) this.f35912u).remove(i);
        C3363iC c3363iC = this.f35916y;
        c3363iC.f31785x--;
        c();
        return remove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean removeAll = this.f35912u.removeAll(collection);
        if (removeAll) {
            this.f35915x.f31785x += this.f35912u.size() - size;
            c();
        }
        return removeAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        int size = size();
        boolean retainAll = this.f35912u.retainAll(collection);
        if (retainAll) {
            this.f35915x.f31785x += this.f35912u.size() - size;
            c();
        }
        return retainAll;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        a();
        return ((List) this.f35912u).set(i, obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        a();
        return this.f35912u.size();
    }

    @Override // java.util.List
    public final List subList(int i, int i4) {
        a();
        List subList = ((List) this.f35912u).subList(i, i4);
        C4223yB c4223yB = this.f35913v;
        if (c4223yB == null) {
            c4223yB = this;
        }
        C3363iC c3363iC = this.f35916y;
        c3363iC.getClass();
        boolean z6 = subList instanceof RandomAccess;
        Object obj = this.f35911n;
        return z6 ? new C3953tB(c3363iC, obj, subList, c4223yB) : new C4223yB(c3363iC, obj, subList, c4223yB);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        a();
        return this.f35912u.toString();
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        a();
        return new C4169xB(this, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        a();
        boolean remove = this.f35912u.remove(obj);
        if (remove) {
            C3363iC c3363iC = this.f35915x;
            c3363iC.f31785x--;
            c();
        }
        return remove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        a();
        boolean isEmpty = this.f35912u.isEmpty();
        boolean add = this.f35912u.add(obj);
        if (add) {
            this.f35915x.f31785x++;
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
        boolean addAll = this.f35912u.addAll(collection);
        if (!addAll) {
            return addAll;
        }
        this.f35915x.f31785x += this.f35912u.size() - size;
        if (size != 0) {
            return addAll;
        }
        d();
        return true;
    }
}
