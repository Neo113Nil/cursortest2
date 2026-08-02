package yads;

import defpackage.ny61;
import defpackage.oaa1;
import defpackage.p481;
import defpackage.q8a1;
import defpackage.tja1;
import defpackage.wr71;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes7.dex */
public abstract class t31 extends n31 implements List, RandomAccess {
    public static final p481 b = new p481(wk2.x, 0);

    public static t31 m(Collection collection) {
        if (!(collection instanceof n31)) {
            return n(collection.toArray());
        }
        t31 b2 = ((n31) collection).b();
        if (!b2.i()) {
            return b2;
        }
        Object[] array = b2.toArray(n31.a);
        return p(array.length, array);
    }

    public static wk2 n(Object... objArr) {
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            if (objArr[i] == null) {
                ny61.t(q8a1.c(i, "at index "));
                return null;
            }
        }
        return p(objArr.length, objArr);
    }

    public static wk2 p(int i, Object[] objArr) {
        return i == 0 ? wk2.x : new wk2(i, objArr);
    }

    public static wk2 q(Object[] objArr) {
        return objArr.length == 0 ? wk2.x : n((Object[]) objArr.clone());
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // yads.n31
    public int a(int i, Object[] objArr) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // yads.n31
    public final t31 b() {
        return this;
    }

    @Override // yads.n31, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof List) {
                List list = (List) obj;
                int size = size();
                if (size == list.size()) {
                    if (!(list instanceof RandomAccess)) {
                        Iterator it = iterator();
                        Iterator it2 = list.iterator();
                        while (it.hasNext()) {
                            if (it2.hasNext() && tja1.a(it.next(), it2.next())) {
                            }
                        }
                        return !it2.hasNext();
                    }
                    for (int i = 0; i < size; i++) {
                        if (tja1.a(get(i), list.get(i))) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = ~(~(get(i2).hashCode() + (i * 31)));
        }
        return i;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    @Override // yads.n31, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // yads.n31
    /* renamed from: j */
    public final wr71 iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final p481 listIterator(int i) {
        oaa1.i(i, size());
        return isEmpty() ? b : new p481(this, i);
    }

    @Override // java.util.List
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public t31 subList(int i, int i2) {
        oaa1.g(i, i2, size());
        int i3 = i2 - i;
        return i3 == size() ? this : i3 == 0 ? wk2.x : new s31(this, i, i3);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // yads.n31
    public Object writeReplace() {
        return new r31(toArray(n31.a));
    }
}
