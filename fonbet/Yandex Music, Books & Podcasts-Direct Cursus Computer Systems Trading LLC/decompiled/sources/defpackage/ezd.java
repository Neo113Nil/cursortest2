package defpackage;

import java.util.AbstractList;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class ezd implements ListIterator, j9f {
    public final /* synthetic */ int a;
    public int b;
    public int c;
    public int d;
    public final Object e;

    public ezd(s2r s2rVar, int i) {
        this.a = 3;
        this.e = s2rVar;
        this.b = i - 1;
        this.c = -1;
        this.d = s2rVar.r();
    }

    public void a() {
        int i;
        i = ((AbstractList) ((m8g) this.e).e).modCount;
        if (i == this.d) {
            return;
        }
        xq0.i();
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        int i;
        int i2;
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                a();
                m8g m8gVar = (m8g) this.e;
                int i3 = this.b;
                this.b = i3 + 1;
                m8gVar.add(i3, obj);
                this.c = -1;
                i = ((AbstractList) m8gVar).modCount;
                this.d = i;
                return;
            case 2:
                b();
                n8g n8gVar = (n8g) this.e;
                int i4 = this.b;
                this.b = i4 + 1;
                n8gVar.add(i4, obj);
                this.c = -1;
                i2 = ((AbstractList) n8gVar).modCount;
                this.d = i2;
                return;
            default:
                c();
                s2r s2rVar = (s2r) this.e;
                s2rVar.add(this.b + 1, obj);
                this.c = -1;
                this.b++;
                this.d = s2rVar.r();
                return;
        }
    }

    public void b() {
        int i;
        i = ((AbstractList) ((n8g) this.e)).modCount;
        if (i == this.d) {
            return;
        }
        xq0.i();
    }

    public void c() {
        if (((s2r) this.e).r() == this.d) {
            return;
        }
        xq0.i();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                return this.b < this.d;
            case 1:
                return this.b < ((m8g) this.e).c;
            case 2:
                return this.b < ((n8g) this.e).b;
            default:
                return this.b < ((s2r) this.e).size() - 1;
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.a) {
            case 0:
                if (this.b > this.c) {
                }
                break;
            case 1:
                if (this.b > 0) {
                }
                break;
            case 2:
                if (this.b > 0) {
                }
                break;
            default:
                if (this.b >= 0) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.a) {
            case 0:
                gpi gpiVar = ((gzd) this.e).a;
                int i = this.b;
                this.b = i + 1;
                Object e = gpiVar.e(i);
                e.getClass();
                return (xci) e;
            case 1:
                a();
                int i2 = this.b;
                m8g m8gVar = (m8g) this.e;
                if (i2 >= m8gVar.c) {
                    wvs.n();
                    return null;
                }
                this.b = i2 + 1;
                this.c = i2;
                return m8gVar.a[m8gVar.b + i2];
            case 2:
                b();
                int i3 = this.b;
                n8g n8gVar = (n8g) this.e;
                if (i3 >= n8gVar.b) {
                    wvs.n();
                    return null;
                }
                this.b = i3 + 1;
                this.c = i3;
                return n8gVar.a[i3];
            default:
                c();
                int i4 = this.b + 1;
                this.c = i4;
                s2r s2rVar = (s2r) this.e;
                fgq.r(i4, s2rVar.size());
                Object obj = s2rVar.get(i4);
                this.b = i4;
                return obj;
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.a) {
            case 0:
                return this.b - this.c;
            case 1:
                return this.b;
            case 2:
                return this.b;
            default:
                return this.b + 1;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.a) {
            case 0:
                gpi gpiVar = ((gzd) this.e).a;
                int i = this.b - 1;
                this.b = i;
                Object e = gpiVar.e(i);
                e.getClass();
                return (xci) e;
            case 1:
                a();
                int i2 = this.b;
                if (i2 <= 0) {
                    wvs.n();
                    return null;
                }
                int i3 = i2 - 1;
                this.b = i3;
                this.c = i3;
                m8g m8gVar = (m8g) this.e;
                return m8gVar.a[m8gVar.b + i3];
            case 2:
                b();
                int i4 = this.b;
                if (i4 <= 0) {
                    wvs.n();
                    return null;
                }
                int i5 = i4 - 1;
                this.b = i5;
                this.c = i5;
                return ((n8g) this.e).a[i5];
            default:
                c();
                int i6 = this.b;
                s2r s2rVar = (s2r) this.e;
                fgq.r(i6, s2rVar.size());
                int i7 = this.b;
                this.c = i7;
                this.b--;
                return s2rVar.get(i7);
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int i;
        switch (this.a) {
            case 0:
                i = this.b - this.c;
                break;
            case 1:
                i = this.b;
                break;
            case 2:
                i = this.b;
                break;
            default:
                return this.b;
        }
        return i - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i;
        int i2;
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                m8g m8gVar = (m8g) this.e;
                a();
                int i3 = this.c;
                if (i3 == -1) {
                    xq0.q("Call next() or previous() before removing element from the iterator.");
                    return;
                }
                m8gVar.a(i3);
                this.b = this.c;
                this.c = -1;
                i = ((AbstractList) m8gVar).modCount;
                this.d = i;
                return;
            case 2:
                n8g n8gVar = (n8g) this.e;
                b();
                int i4 = this.c;
                if (i4 == -1) {
                    xq0.q("Call next() or previous() before removing element from the iterator.");
                    return;
                }
                n8gVar.a(i4);
                this.b = this.c;
                this.c = -1;
                i2 = ((AbstractList) n8gVar).modCount;
                this.d = i2;
                return;
            default:
                c();
                s2r s2rVar = (s2r) this.e;
                s2rVar.remove(this.b);
                this.b--;
                this.c = -1;
                this.d = s2rVar.r();
                return;
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                a();
                int i = this.c;
                if (i != -1) {
                    ((m8g) this.e).set(i, obj);
                    return;
                } else {
                    xq0.q("Call next() or previous() before replacing element from the iterator.");
                    return;
                }
            case 2:
                b();
                int i2 = this.c;
                if (i2 != -1) {
                    ((n8g) this.e).set(i2, obj);
                    return;
                } else {
                    xq0.q("Call next() or previous() before replacing element from the iterator.");
                    return;
                }
            default:
                s2r s2rVar = (s2r) this.e;
                c();
                int i3 = this.c;
                if (i3 < 0) {
                    xq0.q("Cannot call set before the first call to next() or previous() or immediately after a call to add() or remove()");
                    return;
                } else {
                    s2rVar.set(i3, obj);
                    this.d = s2rVar.r();
                    return;
                }
        }
    }

    public ezd(n8g n8gVar, int i) {
        int i2;
        this.a = 2;
        this.e = n8gVar;
        this.b = i;
        this.c = -1;
        i2 = ((AbstractList) n8gVar).modCount;
        this.d = i2;
    }

    public ezd(gzd gzdVar, int i, int i2, int i3) {
        this.a = 0;
        this.e = gzdVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ezd(gzd gzdVar, int i, int i2) {
        this(gzdVar, (i2 & 1) != 0 ? 0 : i, 0, gzdVar.a.b);
        this.a = 0;
    }

    public ezd(m8g m8gVar, int i) {
        int i2;
        this.a = 1;
        this.e = m8gVar;
        this.b = i;
        this.c = -1;
        i2 = ((AbstractList) m8gVar).modCount;
        this.d = i2;
    }
}
