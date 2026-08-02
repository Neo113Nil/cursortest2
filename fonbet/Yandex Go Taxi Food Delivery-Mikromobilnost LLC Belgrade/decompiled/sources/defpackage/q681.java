package defpackage;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;

/* loaded from: classes7.dex */
public class q681 extends AbstractCollection implements Set {
    public final Set a;
    public final ag71 b;

    public q681(Set set, ag71 ag71Var) {
        this.a = set;
        this.b = ag71Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        if (this.b.apply(obj)) {
            return this.a.add(obj);
        }
        w511.q();
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.b.apply(it.next())) {
                w511.q();
                return false;
            }
        }
        return this.a.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        Set set = this.a;
        boolean z = set instanceof RandomAccess;
        ag71 ag71Var = this.b;
        if (!z || !(set instanceof List)) {
            Iterator it = set.iterator();
            ag71Var.getClass();
            while (it.hasNext()) {
                if (ag71Var.apply(it.next())) {
                    it.remove();
                }
            }
            return;
        }
        List list = (List) set;
        ag71Var.getClass();
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            Object obj = list.get(i2);
            if (!ag71Var.apply(obj)) {
                if (i2 > i) {
                    try {
                        list.set(i, obj);
                    } catch (IllegalArgumentException unused) {
                        for (int size = list.size() - 1; size > i2; size--) {
                            if (ag71Var.apply(list.get(size))) {
                                list.remove(size);
                            }
                        }
                        for (int i3 = i2 - 1; i3 >= i; i3--) {
                            list.remove(i3);
                        }
                        return;
                    } catch (UnsupportedOperationException unused2) {
                        for (int size2 = list.size() - 1; size2 > i2; size2--) {
                            if (ag71Var.apply(list.get(size2))) {
                                list.remove(size2);
                            }
                        }
                        for (int i4 = i2 - 1; i4 >= i; i4--) {
                            list.remove(i4);
                        }
                        return;
                    }
                }
                i++;
            }
        }
        list.subList(i, list.size()).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        boolean z;
        Set set = this.a;
        set.getClass();
        try {
            z = set.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            z = false;
        }
        if (z) {
            return this.b.apply(obj);
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return mja1.e(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return mja1.c(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        Iterator it = this.a.iterator();
        ag71 ag71Var = this.b;
        if (ag71Var == null) {
            ny61.t("predicate");
            return false;
        }
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (ag71Var.apply(it.next())) {
                break;
            }
            i++;
        }
        return true ^ (i != -1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        Iterator it = this.a.iterator();
        it.getClass();
        ag71 ag71Var = this.b;
        ag71Var.getClass();
        return new f081(it, ag71Var);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        return contains(obj) && this.a.remove(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        Iterator it = this.a.iterator();
        boolean z = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.b.apply(next) && collection.contains(next)) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        Iterator it = this.a.iterator();
        boolean z = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.b.apply(next) && !collection.contains(next)) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Iterator it = this.a.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (this.b.apply(it.next())) {
                i++;
            }
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray() {
        f081 f081Var = (f081) iterator();
        ArrayList arrayList = new ArrayList();
        while (f081Var.hasNext()) {
            arrayList.add(f081Var.next());
        }
        return arrayList.toArray();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        f081 f081Var = (f081) iterator();
        ArrayList arrayList = new ArrayList();
        while (f081Var.hasNext()) {
            arrayList.add(f081Var.next());
        }
        return arrayList.toArray(objArr);
    }
}
