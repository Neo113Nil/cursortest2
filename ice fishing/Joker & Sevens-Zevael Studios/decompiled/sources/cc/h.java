package cc;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class h extends bc.h {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1328g;

    /* renamed from: h, reason: collision with root package name */
    public final g f1329h;

    public /* synthetic */ h(g gVar, int i10) {
        this.f1328g = i10;
        this.f1329h = gVar;
    }

    @Override // bc.h
    public final int a() {
        switch (this.f1328g) {
        }
        return this.f1329h.f1323o;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.f1328g) {
            case 0:
                pc.j.e((Map.Entry) obj, "element");
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        switch (this.f1328g) {
            case 0:
                pc.j.e(collection, "elements");
                throw new UnsupportedOperationException();
            default:
                pc.j.e(collection, "elements");
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f1328g) {
            case 0:
                this.f1329h.clear();
                break;
            default:
                this.f1329h.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f1328g) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                return this.f1329h.g((Map.Entry) obj);
            default:
                return this.f1329h.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        switch (this.f1328g) {
            case 0:
                pc.j.e(collection, "elements");
                return this.f1329h.f(collection);
            default:
                return super.containsAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        switch (this.f1328g) {
        }
        return this.f1329h.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f1328g) {
            case 0:
                g gVar = this.f1329h;
                gVar.getClass();
                return new d(gVar, 0);
            default:
                g gVar2 = this.f1329h;
                gVar2.getClass();
                return new d(gVar2, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f1328g) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    g gVar = this.f1329h;
                    gVar.getClass();
                    gVar.d();
                    int i10 = gVar.i(entry.getKey());
                    if (i10 >= 0) {
                        Object[] objArr = gVar.f1316h;
                        pc.j.b(objArr);
                        if (pc.j.a(objArr[i10], entry.getValue())) {
                            gVar.m(i10);
                            break;
                        }
                    }
                }
                break;
            default:
                g gVar2 = this.f1329h;
                gVar2.d();
                int i11 = gVar2.i(obj);
                if (i11 >= 0) {
                    gVar2.m(i11);
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        switch (this.f1328g) {
            case 0:
                pc.j.e(collection, "elements");
                this.f1329h.d();
                break;
            default:
                pc.j.e(collection, "elements");
                this.f1329h.d();
                break;
        }
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        switch (this.f1328g) {
            case 0:
                pc.j.e(collection, "elements");
                this.f1329h.d();
                break;
            default:
                pc.j.e(collection, "elements");
                this.f1329h.d();
                break;
        }
        return super.retainAll(collection);
    }
}
