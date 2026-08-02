package defpackage;

import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes5.dex */
public final class h9h extends g8 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ h9h(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean addAll(Collection collection) {
        switch (this.a) {
            case 0:
                collection.getClass();
                throw new UnsupportedOperationException();
            default:
                return super.addAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        switch (this.a) {
            case 0:
                ((f9h) this.b).clear();
                break;
            default:
                ((xlk) this.b).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.a) {
            case 0:
                return ((f9h) this.b).containsValue(obj);
            default:
                return ((xlk) this.b).containsValue(obj);
        }
    }

    @Override // defpackage.g8
    public final int f() {
        switch (this.a) {
            case 0:
                return ((f9h) this.b).i;
            default:
                return ((xlk) this.b).f();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        switch (this.a) {
            case 0:
                return ((f9h) this.b).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                f9h f9hVar = (f9h) this.b;
                f9hVar.getClass();
                return new c9h(f9hVar, 2);
            default:
                xlk xlkVar = (xlk) this.b;
                bat[] batVarArr = new bat[8];
                for (int i = 0; i < 8; i++) {
                    batVarArr[i] = new cat(2);
                }
                return new amk(xlkVar, batVarArr);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        switch (this.a) {
            case 0:
                f9h f9hVar = (f9h) this.b;
                f9hVar.c();
                int i = f9hVar.i(obj);
                if (i < 0) {
                    return false;
                }
                f9hVar.l(i);
                return true;
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        switch (this.a) {
            case 0:
                collection.getClass();
                ((f9h) this.b).c();
                break;
        }
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        switch (this.a) {
            case 0:
                collection.getClass();
                ((f9h) this.b).c();
                break;
        }
        return super.retainAll(collection);
    }
}
