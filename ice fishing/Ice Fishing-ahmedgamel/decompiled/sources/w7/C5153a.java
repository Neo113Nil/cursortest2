package w7;

import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import v7.AbstractC5114e;

/* renamed from: w7.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5153a implements ListIterator, J7.a {

    /* renamed from: u, reason: collision with root package name */
    public int f41714u;

    /* renamed from: w, reason: collision with root package name */
    public int f41716w;

    /* renamed from: x, reason: collision with root package name */
    public final AbstractC5114e f41717x;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f41713n = 0;

    /* renamed from: v, reason: collision with root package name */
    public int f41715v = -1;

    public C5153a(C5155c c5155c, int i) {
        int i4;
        this.f41717x = c5155c;
        this.f41714u = i;
        i4 = ((AbstractList) c5155c).modCount;
        this.f41716w = i4;
    }

    public void a() {
        int i;
        i = ((AbstractList) ((C5154b) this.f41717x).f41722x).modCount;
        if (i != this.f41716w) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        int i;
        int i4;
        switch (this.f41713n) {
            case 0:
                a();
                int i6 = this.f41714u;
                this.f41714u = i6 + 1;
                C5154b c5154b = (C5154b) this.f41717x;
                c5154b.add(i6, obj);
                this.f41715v = -1;
                i = ((AbstractList) c5154b).modCount;
                this.f41716w = i;
                break;
            default:
                b();
                int i9 = this.f41714u;
                this.f41714u = i9 + 1;
                C5155c c5155c = (C5155c) this.f41717x;
                c5155c.add(i9, obj);
                this.f41715v = -1;
                i4 = ((AbstractList) c5155c).modCount;
                this.f41716w = i4;
                break;
        }
    }

    public void b() {
        int i;
        i = ((AbstractList) ((C5155c) this.f41717x)).modCount;
        if (i != this.f41716w) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.f41713n) {
            case 0:
                if (this.f41714u < ((C5154b) this.f41717x).f41720v) {
                }
                break;
            default:
                if (this.f41714u < ((C5155c) this.f41717x).f41725u) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f41713n) {
            case 0:
                if (this.f41714u > 0) {
                }
                break;
            default:
                if (this.f41714u > 0) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f41713n) {
            case 0:
                a();
                int i = this.f41714u;
                C5154b c5154b = (C5154b) this.f41717x;
                if (i >= c5154b.f41720v) {
                    throw new NoSuchElementException();
                }
                this.f41714u = i + 1;
                this.f41715v = i;
                return c5154b.f41718n[c5154b.f41719u + i];
            default:
                b();
                int i4 = this.f41714u;
                C5155c c5155c = (C5155c) this.f41717x;
                if (i4 >= c5155c.f41725u) {
                    throw new NoSuchElementException();
                }
                this.f41714u = i4 + 1;
                this.f41715v = i4;
                return c5155c.f41724n[i4];
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f41713n) {
        }
        return this.f41714u;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f41713n) {
            case 0:
                a();
                int i = this.f41714u;
                if (i <= 0) {
                    throw new NoSuchElementException();
                }
                int i4 = i - 1;
                this.f41714u = i4;
                this.f41715v = i4;
                C5154b c5154b = (C5154b) this.f41717x;
                return c5154b.f41718n[c5154b.f41719u + i4];
            default:
                b();
                int i6 = this.f41714u;
                if (i6 <= 0) {
                    throw new NoSuchElementException();
                }
                int i9 = i6 - 1;
                this.f41714u = i9;
                this.f41715v = i9;
                return ((C5155c) this.f41717x).f41724n[i9];
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch (this.f41713n) {
        }
        return this.f41714u - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i;
        int i4;
        switch (this.f41713n) {
            case 0:
                a();
                int i6 = this.f41715v;
                if (i6 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                C5154b c5154b = (C5154b) this.f41717x;
                c5154b.c(i6);
                this.f41714u = this.f41715v;
                this.f41715v = -1;
                i = ((AbstractList) c5154b).modCount;
                this.f41716w = i;
                return;
            default:
                b();
                int i9 = this.f41715v;
                if (i9 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                C5155c c5155c = (C5155c) this.f41717x;
                c5155c.c(i9);
                this.f41714u = this.f41715v;
                this.f41715v = -1;
                i4 = ((AbstractList) c5155c).modCount;
                this.f41716w = i4;
                return;
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.f41713n) {
            case 0:
                a();
                int i = this.f41715v;
                if (i == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                ((C5154b) this.f41717x).set(i, obj);
                return;
            default:
                b();
                int i4 = this.f41715v;
                if (i4 == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                ((C5155c) this.f41717x).set(i4, obj);
                return;
        }
    }

    public C5153a(C5154b c5154b, int i) {
        int i4;
        this.f41717x = c5154b;
        this.f41714u = i;
        i4 = ((AbstractList) c5154b).modCount;
        this.f41716w = i4;
    }
}
