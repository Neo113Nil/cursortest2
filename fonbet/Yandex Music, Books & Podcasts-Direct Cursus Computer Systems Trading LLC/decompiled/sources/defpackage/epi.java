package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class epi implements List, l9f {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ epi(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        int i2;
        switch (this.a) {
            case 0:
                gpi gpiVar = (gpi) this.b;
                if (i < 0 || i > (i2 = gpiVar.b)) {
                    gpiVar.m(i);
                    throw null;
                }
                int i3 = i2 + 1;
                Object[] objArr = gpiVar.a;
                if (objArr.length < i3) {
                    gpiVar.k(i3, objArr);
                }
                Object[] objArr2 = gpiVar.a;
                int i4 = gpiVar.b;
                if (i != i4) {
                    uz0.f(i + 1, i, i4, objArr2, objArr2);
                }
                objArr2[i] = obj;
                gpiVar.b++;
                return;
            default:
                ((eqi) this.b).a(i, obj);
                return;
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        switch (this.a) {
            case 0:
                collection.getClass();
                gpi gpiVar = (gpi) this.b;
                if (i < 0 || i > gpiVar.b) {
                    gpiVar.m(i);
                    throw null;
                }
                int i2 = 0;
                if (collection.isEmpty()) {
                    return false;
                }
                int size = collection.size() + gpiVar.b;
                Object[] objArr = gpiVar.a;
                if (objArr.length < size) {
                    gpiVar.k(size, objArr);
                }
                Object[] objArr2 = gpiVar.a;
                if (i != gpiVar.b) {
                    uz0.f(collection.size() + i, i, gpiVar.b, objArr2, objArr2);
                }
                for (Object obj : collection) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        u75.n();
                        throw null;
                    }
                    objArr2[i2 + i] = obj;
                    i2 = i3;
                }
                gpiVar.b = collection.size() + gpiVar.b;
                return true;
            default:
                return ((eqi) this.b).g(i, collection);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        switch (this.a) {
            case 0:
                ((gpi) this.b).c();
                break;
            default:
                ((eqi) this.b).i();
                break;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.a) {
            case 0:
                return ((gpi) this.b).f(obj) >= 0;
            default:
                return ((eqi) this.b).j(obj);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        switch (this.a) {
            case 0:
                collection.getClass();
                gpi gpiVar = (gpi) this.b;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (gpiVar.f(it.next()) < 0) {
                        break;
                    }
                }
                break;
            default:
                eqi eqiVar = (eqi) this.b;
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    if (!eqiVar.j(it2.next())) {
                        break;
                    }
                }
                break;
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        switch (this.a) {
            case 0:
                whj.a(this, i);
                return ((gpi) this.b).e(i);
            default:
                fqi.a(this, i);
                return ((eqi) this.b).a[i];
        }
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        switch (this.a) {
            case 0:
                return ((gpi) this.b).f(obj);
            default:
                return ((eqi) this.b).k(obj);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        switch (this.a) {
            case 0:
                return ((gpi) this.b).g();
            default:
                return ((eqi) this.b).c == 0;
        }
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return new dpi(0, 0, this);
            default:
                return new dpi(0, 1, this);
        }
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        int i;
        switch (this.a) {
            case 0:
                gpi gpiVar = (gpi) this.b;
                Object[] objArr = gpiVar.a;
                int i2 = gpiVar.b;
                if (obj == null) {
                    i = i2 - 1;
                    while (-1 < i) {
                        if (objArr[i] != null) {
                            i--;
                        }
                    }
                    return -1;
                }
                i = i2 - 1;
                while (-1 < i) {
                    if (!obj.equals(objArr[i])) {
                        i--;
                    }
                }
                return -1;
                return i;
            default:
                eqi eqiVar = (eqi) this.b;
                Object[] objArr2 = eqiVar.a;
                for (int i3 = eqiVar.c - 1; i3 >= 0; i3--) {
                    if (Intrinsics.d(obj, objArr2[i3])) {
                        return i3;
                    }
                }
                return -1;
        }
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        switch (this.a) {
            case 0:
                return new dpi(0, 0, this);
            default:
                return new dpi(0, 1, this);
        }
    }

    @Override // java.util.List
    public final Object remove(int i) {
        switch (this.a) {
            case 0:
                whj.a(this, i);
                return ((gpi) this.b).i(i);
            default:
                fqi.a(this, i);
                return ((eqi) this.b).m(i);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.a) {
            case 0:
                collection.getClass();
                gpi gpiVar = (gpi) this.b;
                int i = gpiVar.b;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    gpiVar.h(it.next());
                }
                if (i != gpiVar.b) {
                }
                break;
            default:
                eqi eqiVar = (eqi) this.b;
                if (!collection.isEmpty()) {
                    int i2 = eqiVar.c;
                    Iterator it2 = collection.iterator();
                    while (it2.hasNext()) {
                        eqiVar.l(it2.next());
                    }
                    if (i2 != eqiVar.c) {
                    }
                }
                break;
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.a) {
            case 0:
                collection.getClass();
                gpi gpiVar = (gpi) this.b;
                int i = gpiVar.b;
                Object[] objArr = gpiVar.a;
                for (int i2 = i - 1; -1 < i2; i2--) {
                    if (!collection.contains(objArr[i2])) {
                        gpiVar.i(i2);
                    }
                }
                if (i != gpiVar.b) {
                }
                break;
            default:
                eqi eqiVar = (eqi) this.b;
                int i3 = eqiVar.c;
                for (int i4 = i3 - 1; -1 < i4; i4--) {
                    if (!collection.contains(eqiVar.a[i4])) {
                        eqiVar.m(i4);
                    }
                }
                if (i3 != eqiVar.c) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        switch (this.a) {
            case 0:
                whj.a(this, i);
                gpi gpiVar = (gpi) this.b;
                if (i < 0 || i >= gpiVar.b) {
                    gpiVar.l(i);
                    throw null;
                }
                Object[] objArr = gpiVar.a;
                Object obj2 = objArr[i];
                objArr[i] = obj;
                return obj2;
            default:
                fqi.a(this, i);
                Object[] objArr2 = ((eqi) this.b).a;
                Object obj3 = objArr2[i];
                objArr2[i] = obj;
                return obj3;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        switch (this.a) {
            case 0:
                return ((gpi) this.b).b;
            default:
                return ((eqi) this.b).c;
        }
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        switch (this.a) {
            case 0:
                whj.b(i, i2, this);
                return new fpi(i, i2, 0, this);
            default:
                fqi.b(i, i2, this);
                return new fpi(i, i2, 1, this);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.a) {
            case 0:
                objArr.getClass();
                break;
        }
        return hld.L(this, objArr);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        switch (this.a) {
        }
        return hld.K(this);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        switch (this.a) {
            case 0:
                return new dpi(i, 0, this);
            default:
                return new dpi(i, 1, this);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.a) {
            case 0:
                return ((gpi) this.b).h(obj);
            default:
                return ((eqi) this.b).l(obj);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.a) {
            case 0:
                ((gpi) this.b).a(obj);
                break;
            default:
                ((eqi) this.b).d(obj);
                break;
        }
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.a) {
            case 0:
                collection.getClass();
                gpi gpiVar = (gpi) this.b;
                int i = gpiVar.b;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    gpiVar.a(it.next());
                }
                return i != gpiVar.b;
            default:
                eqi eqiVar = (eqi) this.b;
                return eqiVar.g(eqiVar.c, collection);
        }
    }
}
