package k;

import D.C0013n;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class f implements Set {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f2648f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0013n f2649g;

    public /* synthetic */ f(C0013n c0013n, int i2) {
        this.f2648f = i2;
        this.f2649g = c0013n;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f2648f) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.f2648f) {
            case 0:
                C0013n c0013n = this.f2649g;
                int i2 = ((C0189a) c0013n.f245d).f2661h;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    ((C0189a) c0013n.f245d).put(entry.getKey(), entry.getValue());
                }
                return i2 != ((C0189a) c0013n.f245d).f2661h;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        switch (this.f2648f) {
            case 0:
                ((C0189a) this.f2649g.f245d).clear();
                break;
            default:
                ((C0189a) this.f2649g.f245d).clear();
                break;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f2648f) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                C0013n c0013n = this.f2649g;
                int d2 = ((C0189a) c0013n.f245d).d(key);
                if (d2 < 0) {
                    return false;
                }
                Object b2 = c0013n.b(d2, 1);
                Object value = entry.getValue();
                return b2 == value || (b2 != null && b2.equals(value));
            default:
                return ((C0189a) this.f2649g.f245d).d(obj) >= 0;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        switch (this.f2648f) {
            case 0:
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (!contains(it.next())) {
                        break;
                    }
                }
                break;
            default:
                C0189a c0189a = (C0189a) this.f2649g.f245d;
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    if (!c0189a.containsKey(it2.next())) {
                        break;
                    }
                }
                break;
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        switch (this.f2648f) {
        }
        return C0013n.e(this, obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        switch (this.f2648f) {
            case 0:
                C0013n c0013n = this.f2649g;
                int i2 = 0;
                for (int i3 = ((C0189a) c0013n.f245d).f2661h - 1; i3 >= 0; i3--) {
                    Object b2 = c0013n.b(i3, 0);
                    Object b3 = c0013n.b(i3, 1);
                    i2 += (b2 == null ? 0 : b2.hashCode()) ^ (b3 == null ? 0 : b3.hashCode());
                }
                return i2;
            default:
                C0013n c0013n2 = this.f2649g;
                int i4 = 0;
                for (int i5 = ((C0189a) c0013n2.f245d).f2661h - 1; i5 >= 0; i5--) {
                    Object b4 = c0013n2.b(i5, 0);
                    i4 += b4 == null ? 0 : b4.hashCode();
                }
                return i4;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        switch (this.f2648f) {
            case 0:
                if (((C0189a) this.f2649g.f245d).f2661h == 0) {
                }
                break;
            default:
                if (((C0189a) this.f2649g.f245d).f2661h == 0) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f2648f) {
            case 0:
                return new g(this.f2649g);
            default:
                return new e(this.f2649g, 0);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.f2648f) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                C0013n c0013n = this.f2649g;
                int d2 = ((C0189a) c0013n.f245d).d(obj);
                if (d2 < 0) {
                    return false;
                }
                c0013n.c(d2);
                return true;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.f2648f) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                C0189a c0189a = (C0189a) this.f2649g.f245d;
                int size = c0189a.size();
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    c0189a.remove(it.next());
                }
                return size != c0189a.size();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.f2648f) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                C0189a c0189a = (C0189a) this.f2649g.f245d;
                int size = c0189a.size();
                Iterator it = c0189a.keySet().iterator();
                while (it.hasNext()) {
                    if (!collection.contains(it.next())) {
                        it.remove();
                    }
                }
                return size != c0189a.size();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        switch (this.f2648f) {
        }
        return ((C0189a) this.f2649g.f245d).f2661h;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        switch (this.f2648f) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                C0013n c0013n = this.f2649g;
                int i2 = ((C0189a) c0013n.f245d).f2661h;
                Object[] objArr = new Object[i2];
                for (int i3 = 0; i3 < i2; i3++) {
                    objArr[i3] = c0013n.b(i3, 0);
                }
                return objArr;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.f2648f) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                return this.f2649g.k(0, objArr);
        }
    }
}
