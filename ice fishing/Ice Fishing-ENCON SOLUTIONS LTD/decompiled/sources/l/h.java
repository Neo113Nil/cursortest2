package l;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class h implements Set {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8111a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0977a f8112b;

    public /* synthetic */ h(C0977a c0977a, int i2) {
        this.f8111a = i2;
        this.f8112b = c0977a;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f8111a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.f8111a) {
            case 0:
                C0977a c0977a = this.f8112b;
                int d2 = c0977a.d();
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    switch (c0977a.f8081d) {
                        case 0:
                            ((C0978b) c0977a.f8082e).put(key, value);
                            break;
                        default:
                            ((C0979c) c0977a.f8082e).add(key);
                            break;
                    }
                }
                return d2 != c0977a.d();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        switch (this.f8111a) {
            case 0:
                this.f8112b.a();
                break;
            default:
                this.f8112b.a();
                break;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f8111a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                C0977a c0977a = this.f8112b;
                int e2 = c0977a.e(key);
                if (e2 < 0) {
                    return false;
                }
                Object b2 = c0977a.b(e2, 1);
                Object value = entry.getValue();
                return b2 == value || (b2 != null && b2.equals(value));
            default:
                return this.f8112b.e(obj) >= 0;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        switch (this.f8111a) {
            case 0:
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (!contains(it.next())) {
                        break;
                    }
                }
                break;
            default:
                Map c2 = this.f8112b.c();
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    if (!c2.containsKey(it2.next())) {
                        break;
                    }
                }
                break;
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        switch (this.f8111a) {
        }
        return C0977a.h(this, obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        switch (this.f8111a) {
            case 0:
                C0977a c0977a = this.f8112b;
                int i2 = 0;
                for (int d2 = c0977a.d() - 1; d2 >= 0; d2--) {
                    Object b2 = c0977a.b(d2, 0);
                    Object b3 = c0977a.b(d2, 1);
                    i2 += (b2 == null ? 0 : b2.hashCode()) ^ (b3 == null ? 0 : b3.hashCode());
                }
                return i2;
            default:
                C0977a c0977a2 = this.f8112b;
                int i3 = 0;
                for (int d3 = c0977a2.d() - 1; d3 >= 0; d3--) {
                    Object b4 = c0977a2.b(d3, 0);
                    i3 += b4 == null ? 0 : b4.hashCode();
                }
                return i3;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        switch (this.f8111a) {
            case 0:
                if (this.f8112b.d() == 0) {
                }
                break;
            default:
                if (this.f8112b.d() == 0) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f8111a) {
            case 0:
                return new i(this.f8112b);
            default:
                return new g(this.f8112b, 0);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.f8111a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                C0977a c0977a = this.f8112b;
                int e2 = c0977a.e(obj);
                if (e2 < 0) {
                    return false;
                }
                c0977a.g(e2);
                return true;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.f8111a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                Map c2 = this.f8112b.c();
                int size = c2.size();
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    c2.remove(it.next());
                }
                return size != c2.size();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.f8111a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                Map c2 = this.f8112b.c();
                int size = c2.size();
                Iterator it = c2.keySet().iterator();
                while (it.hasNext()) {
                    if (!collection.contains(it.next())) {
                        it.remove();
                    }
                }
                return size != c2.size();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        switch (this.f8111a) {
        }
        return this.f8112b.d();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.f8111a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                return this.f8112b.i(0, objArr);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        switch (this.f8111a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                C0977a c0977a = this.f8112b;
                int d2 = c0977a.d();
                Object[] objArr = new Object[d2];
                for (int i2 = 0; i2 < d2; i2++) {
                    objArr[i2] = c0977a.b(i2, 0);
                }
                return objArr;
        }
    }
}
