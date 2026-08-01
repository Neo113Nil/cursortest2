package s;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class g implements Set {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f40424n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ j f40425u;

    public /* synthetic */ g(j jVar, int i) {
        this.f40424n = i;
        this.f40425u = jVar;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f40424n) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.f40424n) {
            case 0:
                j jVar = this.f40425u;
                int e9 = jVar.e();
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    jVar.h(entry.getKey(), entry.getValue());
                }
                return e9 != jVar.e();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        switch (this.f40424n) {
            case 0:
                this.f40425u.b();
                break;
            default:
                this.f40425u.b();
                break;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f40424n) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                j jVar = this.f40425u;
                int f3 = jVar.f(key);
                if (f3 < 0) {
                    return false;
                }
                Object c9 = jVar.c(f3, 1);
                Object value = entry.getValue();
                return c9 == value || (c9 != null && c9.equals(value));
            default:
                return this.f40425u.f(obj) >= 0;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        switch (this.f40424n) {
            case 0:
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (!contains(it.next())) {
                        break;
                    }
                }
                break;
            default:
                Map d2 = this.f40425u.d();
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    if (!d2.containsKey(it2.next())) {
                        break;
                    }
                }
                break;
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        switch (this.f40424n) {
        }
        return j.m(this, obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        switch (this.f40424n) {
            case 0:
                j jVar = this.f40425u;
                int i = 0;
                for (int e9 = jVar.e() - 1; e9 >= 0; e9--) {
                    Object c9 = jVar.c(e9, 0);
                    Object c10 = jVar.c(e9, 1);
                    i += (c9 == null ? 0 : c9.hashCode()) ^ (c10 == null ? 0 : c10.hashCode());
                }
                return i;
            default:
                j jVar2 = this.f40425u;
                int i6 = 0;
                for (int e10 = jVar2.e() - 1; e10 >= 0; e10--) {
                    Object c11 = jVar2.c(e10, 0);
                    i6 += c11 == null ? 0 : c11.hashCode();
                }
                return i6;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        switch (this.f40424n) {
            case 0:
                if (this.f40425u.e() == 0) {
                }
                break;
            default:
                if (this.f40425u.e() == 0) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f40424n) {
            case 0:
                return new h(this.f40425u);
            default:
                return new f(this.f40425u, 0);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.f40424n) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                j jVar = this.f40425u;
                int f3 = jVar.f(obj);
                if (f3 < 0) {
                    return false;
                }
                jVar.i(f3);
                return true;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.f40424n) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                Map d2 = this.f40425u.d();
                int size = d2.size();
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    d2.remove(it.next());
                }
                return size != d2.size();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.f40424n) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                Map d2 = this.f40425u.d();
                int size = d2.size();
                Iterator it = d2.keySet().iterator();
                while (it.hasNext()) {
                    if (!collection.contains(it.next())) {
                        it.remove();
                    }
                }
                return size != d2.size();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        switch (this.f40424n) {
        }
        return this.f40425u.e();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.f40424n) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                return this.f40425u.o(objArr, 0);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        switch (this.f40424n) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                j jVar = this.f40425u;
                int e9 = jVar.e();
                Object[] objArr = new Object[e9];
                for (int i = 0; i < e9; i++) {
                    objArr[i] = jVar.c(i, 0);
                }
                return objArr;
        }
    }
}
