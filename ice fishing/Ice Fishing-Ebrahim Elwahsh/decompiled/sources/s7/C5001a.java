package s7;

import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import r7.AbstractC4974e;

/* renamed from: s7.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5001a implements ListIterator, F7.a {

    /* renamed from: u, reason: collision with root package name */
    public int f40489u;

    /* renamed from: w, reason: collision with root package name */
    public int f40491w;

    /* renamed from: x, reason: collision with root package name */
    public final AbstractC4974e f40492x;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f40488n = 0;

    /* renamed from: v, reason: collision with root package name */
    public int f40490v = -1;

    public C5001a(C5003c c5003c, int i) {
        int i4;
        this.f40492x = c5003c;
        this.f40489u = i;
        i4 = ((AbstractList) c5003c).modCount;
        this.f40491w = i4;
    }

    public void a() {
        int i;
        i = ((AbstractList) ((C5002b) this.f40492x).f40497x).modCount;
        if (i != this.f40491w) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        int i;
        int i4;
        switch (this.f40488n) {
            case 0:
                a();
                int i9 = this.f40489u;
                this.f40489u = i9 + 1;
                C5002b c5002b = (C5002b) this.f40492x;
                c5002b.add(i9, obj);
                this.f40490v = -1;
                i = ((AbstractList) c5002b).modCount;
                this.f40491w = i;
                break;
            default:
                b();
                int i10 = this.f40489u;
                this.f40489u = i10 + 1;
                C5003c c5003c = (C5003c) this.f40492x;
                c5003c.add(i10, obj);
                this.f40490v = -1;
                i4 = ((AbstractList) c5003c).modCount;
                this.f40491w = i4;
                break;
        }
    }

    public void b() {
        int i;
        i = ((AbstractList) ((C5003c) this.f40492x)).modCount;
        if (i != this.f40491w) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.f40488n) {
            case 0:
                if (this.f40489u < ((C5002b) this.f40492x).f40495v) {
                }
                break;
            default:
                if (this.f40489u < ((C5003c) this.f40492x).f40500u) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f40488n) {
            case 0:
                if (this.f40489u > 0) {
                }
                break;
            default:
                if (this.f40489u > 0) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f40488n) {
            case 0:
                a();
                int i = this.f40489u;
                C5002b c5002b = (C5002b) this.f40492x;
                if (i >= c5002b.f40495v) {
                    throw new NoSuchElementException();
                }
                this.f40489u = i + 1;
                this.f40490v = i;
                return c5002b.f40493n[c5002b.f40494u + i];
            default:
                b();
                int i4 = this.f40489u;
                C5003c c5003c = (C5003c) this.f40492x;
                if (i4 >= c5003c.f40500u) {
                    throw new NoSuchElementException();
                }
                this.f40489u = i4 + 1;
                this.f40490v = i4;
                return c5003c.f40499n[i4];
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f40488n) {
        }
        return this.f40489u;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f40488n) {
            case 0:
                a();
                int i = this.f40489u;
                if (i <= 0) {
                    throw new NoSuchElementException();
                }
                int i4 = i - 1;
                this.f40489u = i4;
                this.f40490v = i4;
                C5002b c5002b = (C5002b) this.f40492x;
                return c5002b.f40493n[c5002b.f40494u + i4];
            default:
                b();
                int i9 = this.f40489u;
                if (i9 <= 0) {
                    throw new NoSuchElementException();
                }
                int i10 = i9 - 1;
                this.f40489u = i10;
                this.f40490v = i10;
                return ((C5003c) this.f40492x).f40499n[i10];
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch (this.f40488n) {
        }
        return this.f40489u - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i;
        int i4;
        switch (this.f40488n) {
            case 0:
                a();
                int i9 = this.f40490v;
                if (i9 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                C5002b c5002b = (C5002b) this.f40492x;
                c5002b.c(i9);
                this.f40489u = this.f40490v;
                this.f40490v = -1;
                i = ((AbstractList) c5002b).modCount;
                this.f40491w = i;
                return;
            default:
                b();
                int i10 = this.f40490v;
                if (i10 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                C5003c c5003c = (C5003c) this.f40492x;
                c5003c.c(i10);
                this.f40489u = this.f40490v;
                this.f40490v = -1;
                i4 = ((AbstractList) c5003c).modCount;
                this.f40491w = i4;
                return;
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.f40488n) {
            case 0:
                a();
                int i = this.f40490v;
                if (i == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                ((C5002b) this.f40492x).set(i, obj);
                return;
            default:
                b();
                int i4 = this.f40490v;
                if (i4 == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                ((C5003c) this.f40492x).set(i4, obj);
                return;
        }
    }

    public C5001a(C5002b c5002b, int i) {
        int i4;
        this.f40492x = c5002b;
        this.f40489u = i;
        i4 = ((AbstractList) c5002b).modCount;
        this.f40491w = i4;
    }
}
