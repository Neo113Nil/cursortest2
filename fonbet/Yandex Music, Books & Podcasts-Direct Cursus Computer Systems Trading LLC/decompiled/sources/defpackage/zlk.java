package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class zlk extends j8 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ zlk(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(Collection collection) {
        switch (this.a) {
            case 2:
                collection.getClass();
                throw new UnsupportedOperationException();
            default:
                return super.addAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.a) {
            case 0:
                ((xlk) this.b).clear();
                break;
            case 1:
                ((xlk) this.b).clear();
                break;
            default:
                ((f9h) this.b).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                xlk xlkVar = (xlk) this.b;
                Object obj2 = xlkVar.get(entry.getKey());
                return obj2 != null ? obj2.equals(entry.getValue()) : entry.getValue() == null && xlkVar.containsKey(entry.getKey());
            case 1:
                return ((xlk) this.b).containsKey(obj);
            default:
                return ((f9h) this.b).containsKey(obj);
        }
    }

    @Override // defpackage.j8
    public final int f() {
        switch (this.a) {
            case 0:
                return ((xlk) this.b).f();
            case 1:
                return ((xlk) this.b).f();
            default:
                return ((f9h) this.b).i;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        switch (this.a) {
            case 2:
                return ((f9h) this.b).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return new j7((xlk) this.b);
            case 1:
                xlk xlkVar = (xlk) this.b;
                bat[] batVarArr = new bat[8];
                for (int i = 0; i < 8; i++) {
                    batVarArr[i] = new cat(1);
                }
                return new amk(xlkVar, batVarArr);
            default:
                f9h f9hVar = (f9h) this.b;
                f9hVar.getClass();
                return new c9h(f9hVar, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return ((xlk) this.b).remove(entry.getKey(), entry.getValue());
            case 1:
                xlk xlkVar = (xlk) this.b;
                if (!xlkVar.containsKey(obj)) {
                    return false;
                }
                xlkVar.remove(obj);
                return true;
            default:
                f9h f9hVar = (f9h) this.b;
                f9hVar.c();
                int h = f9hVar.h(obj);
                if (h < 0) {
                    return false;
                }
                f9hVar.l(h);
                return true;
        }
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection collection) {
        switch (this.a) {
            case 2:
                collection.getClass();
                ((f9h) this.b).c();
                return super.removeAll(collection);
            default:
                return super.removeAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection collection) {
        switch (this.a) {
            case 2:
                collection.getClass();
                ((f9h) this.b).c();
                break;
        }
        return super.retainAll(collection);
    }
}
