package o0;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import pc.i;
import pc.j;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class c implements List, qc.c {

    /* renamed from: g, reason: collision with root package name */
    public final Object f5129g;

    /* renamed from: h, reason: collision with root package name */
    public final int f5130h;

    /* renamed from: i, reason: collision with root package name */
    public int f5131i;

    public c(List list, int i10, int i11) {
        this.f5129g = list;
        this.f5130h = i10;
        this.f5131i = i11;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i10 = this.f5131i;
        this.f5131i = i10 + 1;
        this.f5129g.add(i10, obj);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final boolean addAll(int i10, Collection collection) {
        this.f5129g.addAll(i10 + this.f5130h, collection);
        int size = collection.size();
        this.f5131i += size;
        return size > 0;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final void clear() {
        int i10 = this.f5131i - 1;
        int i11 = this.f5130h;
        if (i11 <= i10) {
            while (true) {
                this.f5129g.remove(i10);
                if (i10 == i11) {
                    break;
                } else {
                    i10--;
                }
            }
        }
        this.f5131i = i11;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        int i10 = this.f5131i;
        for (int i11 = this.f5130h; i11 < i10; i11++) {
            if (j.a(this.f5129g.get(i11), obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final Object get(int i10) {
        f.a(i10, this);
        return this.f5129g.get(i10 + this.f5130h);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final int indexOf(Object obj) {
        int i10 = this.f5131i;
        int i11 = this.f5130h;
        for (int i12 = i11; i12 < i10; i12++) {
            if (j.a(this.f5129g.get(i12), obj)) {
                return i12 - i11;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f5131i == this.f5130h;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new d(0, this);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        int i10 = this.f5131i - 1;
        int i11 = this.f5130h;
        if (i11 > i10) {
            return -1;
        }
        while (!j.a(this.f5129g.get(i10), obj)) {
            if (i10 == i11) {
                return -1;
            }
            i10--;
        }
        return i10 - i11;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new d(0, this);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i10 = this.f5131i;
        for (int i11 = this.f5130h; i11 < i10; i11++) {
            ?? r22 = this.f5129g;
            if (j.a(r22.get(i11), obj)) {
                r22.remove(i11);
                this.f5131i--;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i10 = this.f5131i;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
        return i10 != this.f5131i;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i10 = this.f5131i;
        int i11 = i10 - 1;
        int i12 = this.f5130h;
        if (i12 <= i11) {
            while (true) {
                ?? r32 = this.f5129g;
                if (!collection.contains(r32.get(i11))) {
                    r32.remove(i11);
                    this.f5131i--;
                }
                if (i11 == i12) {
                    break;
                }
                i11--;
            }
        }
        return i10 != this.f5131i;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final Object set(int i10, Object obj) {
        f.a(i10, this);
        return this.f5129g.set(i10 + this.f5130h, obj);
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f5131i - this.f5130h;
    }

    @Override // java.util.List
    public final List subList(int i10, int i11) {
        f.b(this, i10, i11);
        return new c(this, i10, i11);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return i.a(this);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final void add(int i10, Object obj) {
        this.f5129g.add(i10 + this.f5130h, obj);
        this.f5131i++;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i10) {
        return new d(i10, this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return i.b(this, objArr);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        this.f5129g.addAll(this.f5131i, collection);
        int size = collection.size();
        this.f5131i += size;
        return size > 0;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final Object remove(int i10) {
        f.a(i10, this);
        this.f5131i--;
        return this.f5129g.remove(i10 + this.f5130h);
    }
}
