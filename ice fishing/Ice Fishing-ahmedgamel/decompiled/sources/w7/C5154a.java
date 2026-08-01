package w7;

import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import v7.AbstractC5124e;

/* renamed from: w7.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5154a implements ListIterator, J7.a {

    /* renamed from: u, reason: collision with root package name */
    public int f41660u;

    /* renamed from: w, reason: collision with root package name */
    public int f41662w;

    /* renamed from: x, reason: collision with root package name */
    public final AbstractC5124e f41663x;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f41659n = 0;

    /* renamed from: v, reason: collision with root package name */
    public int f41661v = -1;

    public C5154a(C5156c c5156c, int i) {
        int i6;
        this.f41663x = c5156c;
        this.f41660u = i;
        i6 = ((AbstractList) c5156c).modCount;
        this.f41662w = i6;
    }

    public void a() {
        int i;
        i = ((AbstractList) ((C5155b) this.f41663x).f41668x).modCount;
        if (i != this.f41662w) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        int i;
        int i6;
        switch (this.f41659n) {
            case 0:
                a();
                int i9 = this.f41660u;
                this.f41660u = i9 + 1;
                C5155b c5155b = (C5155b) this.f41663x;
                c5155b.add(i9, obj);
                this.f41661v = -1;
                i = ((AbstractList) c5155b).modCount;
                this.f41662w = i;
                break;
            default:
                b();
                int i10 = this.f41660u;
                this.f41660u = i10 + 1;
                C5156c c5156c = (C5156c) this.f41663x;
                c5156c.add(i10, obj);
                this.f41661v = -1;
                i6 = ((AbstractList) c5156c).modCount;
                this.f41662w = i6;
                break;
        }
    }

    public void b() {
        int i;
        i = ((AbstractList) ((C5156c) this.f41663x)).modCount;
        if (i != this.f41662w) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.f41659n) {
            case 0:
                if (this.f41660u < ((C5155b) this.f41663x).f41666v) {
                }
                break;
            default:
                if (this.f41660u < ((C5156c) this.f41663x).f41671u) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f41659n) {
            case 0:
                if (this.f41660u > 0) {
                }
                break;
            default:
                if (this.f41660u > 0) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f41659n) {
            case 0:
                a();
                int i = this.f41660u;
                C5155b c5155b = (C5155b) this.f41663x;
                if (i >= c5155b.f41666v) {
                    throw new NoSuchElementException();
                }
                this.f41660u = i + 1;
                this.f41661v = i;
                return c5155b.f41664n[c5155b.f41665u + i];
            default:
                b();
                int i6 = this.f41660u;
                C5156c c5156c = (C5156c) this.f41663x;
                if (i6 >= c5156c.f41671u) {
                    throw new NoSuchElementException();
                }
                this.f41660u = i6 + 1;
                this.f41661v = i6;
                return c5156c.f41670n[i6];
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f41659n) {
        }
        return this.f41660u;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f41659n) {
            case 0:
                a();
                int i = this.f41660u;
                if (i <= 0) {
                    throw new NoSuchElementException();
                }
                int i6 = i - 1;
                this.f41660u = i6;
                this.f41661v = i6;
                C5155b c5155b = (C5155b) this.f41663x;
                return c5155b.f41664n[c5155b.f41665u + i6];
            default:
                b();
                int i9 = this.f41660u;
                if (i9 <= 0) {
                    throw new NoSuchElementException();
                }
                int i10 = i9 - 1;
                this.f41660u = i10;
                this.f41661v = i10;
                return ((C5156c) this.f41663x).f41670n[i10];
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch (this.f41659n) {
        }
        return this.f41660u - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i;
        int i6;
        switch (this.f41659n) {
            case 0:
                a();
                int i9 = this.f41661v;
                if (i9 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                C5155b c5155b = (C5155b) this.f41663x;
                c5155b.c(i9);
                this.f41660u = this.f41661v;
                this.f41661v = -1;
                i = ((AbstractList) c5155b).modCount;
                this.f41662w = i;
                return;
            default:
                b();
                int i10 = this.f41661v;
                if (i10 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                C5156c c5156c = (C5156c) this.f41663x;
                c5156c.c(i10);
                this.f41660u = this.f41661v;
                this.f41661v = -1;
                i6 = ((AbstractList) c5156c).modCount;
                this.f41662w = i6;
                return;
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.f41659n) {
            case 0:
                a();
                int i = this.f41661v;
                if (i == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                ((C5155b) this.f41663x).set(i, obj);
                return;
            default:
                b();
                int i6 = this.f41661v;
                if (i6 == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                ((C5156c) this.f41663x).set(i6, obj);
                return;
        }
    }

    public C5154a(C5155b c5155b, int i) {
        int i6;
        this.f41663x = c5155b;
        this.f41660u = i;
        i6 = ((AbstractList) c5155b).modCount;
        this.f41662w = i6;
    }
}
