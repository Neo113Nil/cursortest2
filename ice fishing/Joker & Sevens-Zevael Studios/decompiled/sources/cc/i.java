package cc;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import r0.l;
import r0.m;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class i extends AbstractCollection implements Collection, qc.b {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1330g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f1331h;

    public /* synthetic */ i(int i10, Object obj) {
        this.f1330g = i10;
        this.f1331h = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f1330g) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean addAll(Collection collection) {
        switch (this.f1330g) {
            case 0:
                pc.j.e(collection, "elements");
                throw new UnsupportedOperationException();
            default:
                return super.addAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        switch (this.f1330g) {
            case 0:
                ((g) this.f1331h).clear();
                break;
            default:
                ((u0.h) this.f1331h).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f1330g) {
            case 0:
                return ((g) this.f1331h).containsValue(obj);
            default:
                return ((u0.h) this.f1331h).containsValue(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        switch (this.f1330g) {
            case 0:
                return ((g) this.f1331h).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f1330g) {
            case 0:
                g gVar = (g) this.f1331h;
                gVar.getClass();
                return new d(gVar, 2);
            default:
                u0.h hVar = (u0.h) this.f1331h;
                l[] lVarArr = new l[8];
                for (int i10 = 0; i10 < 8; i10++) {
                    lVarArr[i10] = new m(2);
                }
                return new r0.g(hVar, lVarArr);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        switch (this.f1330g) {
            case 0:
                g gVar = (g) this.f1331h;
                gVar.d();
                int j3 = gVar.j(obj);
                if (j3 < 0) {
                    return false;
                }
                gVar.m(j3);
                return true;
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        switch (this.f1330g) {
            case 0:
                pc.j.e(collection, "elements");
                ((g) this.f1331h).d();
                break;
        }
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        switch (this.f1330g) {
            case 0:
                pc.j.e(collection, "elements");
                ((g) this.f1331h).d();
                break;
        }
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        switch (this.f1330g) {
            case 0:
                return ((g) this.f1331h).f1323o;
            default:
                u0.h hVar = (u0.h) this.f1331h;
                hVar.getClass();
                return hVar.f6676k;
        }
    }
}
