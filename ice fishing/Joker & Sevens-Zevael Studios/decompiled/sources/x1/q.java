package x1;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class q implements List, qc.a {

    /* renamed from: g, reason: collision with root package name */
    public final s.a0 f8147g = new s.a0(16);

    /* renamed from: h, reason: collision with root package name */
    public final s.w f8148h = new s.w(16);

    /* renamed from: i, reason: collision with root package name */
    public int f8149i = -1;

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0039, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long a() {
        long a6 = f.a(Float.POSITIVE_INFINITY, false, false);
        int i10 = this.f8149i + 1;
        int K = bc.n.K(this);
        if (i10 > K) {
            return a6;
        }
        while (true) {
            s.w wVar = this.f8148h;
            if (i10 < 0) {
                wVar.getClass();
                break;
            }
            if (i10 >= wVar.f6350b) {
                break;
            }
            long j3 = wVar.f6349a[i10];
            if (f.h(j3, a6) < 0) {
                a6 = j3;
            }
            if ((f.l(a6) >= 0.0f || !f.q(a6)) && i10 != K) {
                i10++;
            }
        }
        t.a.d("Index must be between 0 and size");
        throw null;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i10, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i10, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addFirst(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addLast(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void b(int i10, int i11) {
        if (i10 >= i11) {
            return;
        }
        this.f8147g.k(i10, i11);
        s.w wVar = this.f8148h;
        if (i10 >= 0) {
            int i12 = wVar.f6350b;
            if (i10 <= i12 && i11 >= 0 && i11 <= i12) {
                if (i11 < i10) {
                    t.a.c("The end index must be < start index");
                    throw null;
                }
                if (i11 != i10) {
                    if (i11 < i12) {
                        long[] jArr = wVar.f6349a;
                        bc.l.Q(jArr, jArr, i10, i11, i12);
                    }
                    wVar.f6350b -= i11 - i10;
                    return;
                }
                return;
            }
        } else {
            wVar.getClass();
        }
        t.a.d("Index must be between 0 and size");
        throw null;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.f8149i = -1;
        this.f8147g.c();
        this.f8148h.f6350b = 0;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return (obj instanceof y0.m) && indexOf((y0.m) obj) != -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains((y0.m) it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        Object e10 = this.f8147g.e(i10);
        pc.j.c(e10, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
        return (y0.m) e10;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof y0.m)) {
            return -1;
        }
        y0.m mVar = (y0.m) obj;
        int K = bc.n.K(this);
        if (K >= 0) {
            int i10 = 0;
            while (!pc.j.a(this.f8147g.e(i10), mVar)) {
                if (i10 != K) {
                    i10++;
                }
            }
            return i10;
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f8147g.g();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new cc.a(this, 0, 7);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof y0.m)) {
            return -1;
        }
        y0.m mVar = (y0.m) obj;
        for (int K = bc.n.K(this); -1 < K; K--) {
            if (pc.j.a(this.f8147g.e(K), mVar)) {
                return K;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new cc.a(this, 0, 7);
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object removeFirst() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object removeLast() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(UnaryOperator unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f8147g.f6220b;
    }

    @Override // java.util.List
    public final void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List subList(int i10, int i11) {
        return new p(this, i10, i11);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return pc.i.a(this);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i10) {
        return new cc.a(this, i10, 6);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return pc.i.b(this, objArr);
    }
}
