package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public abstract class yde extends qde implements List, RandomAccess {
    public static final ude b = new ude(qsn.e, 0);
    private static final long serialVersionUID = -889275714;

    public static qsn A(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        Object[] objArr = {obj, obj2, obj3, obj4, obj5};
        gdg.r(5, objArr);
        return t(5, objArr);
    }

    public static qsn B(zwj zwjVar, AbstractCollection abstractCollection) {
        zwjVar.getClass();
        if (abstractCollection == null) {
            Iterator it = abstractCollection.iterator();
            ArrayList arrayList = new ArrayList();
            it.getClass();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            abstractCollection = arrayList;
        }
        Object[] array = abstractCollection.toArray();
        gdg.r(array.length, array);
        Arrays.sort(array, zwjVar);
        return t(array.length, array);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static qsn t(int i, Object[] objArr) {
        return i == 0 ? qsn.e : new qsn(i, objArr);
    }

    public static tde u() {
        return new tde(4);
    }

    public static yde v(Collection collection) {
        if (!(collection instanceof qde)) {
            Object[] array = collection.toArray();
            gdg.r(array.length, array);
            return t(array.length, array);
        }
        yde a = ((qde) collection).a();
        if (!a.r()) {
            return a;
        }
        Object[] array2 = a.toArray(qde.a);
        return t(array2.length, array2);
    }

    public static qsn w(Object[] objArr) {
        if (objArr.length == 0) {
            return qsn.e;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        gdg.r(objArr2.length, objArr2);
        return t(objArr2.length, objArr2);
    }

    public static qsn y(Object obj) {
        Object[] objArr = {obj};
        gdg.r(1, objArr);
        return t(1, objArr);
    }

    public static qsn z(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        gdg.r(2, objArr);
        return t(2, objArr);
    }

    @Override // java.util.List
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public yde subList(int i, int i2) {
        o2g.Q(i, i2, size());
        int i3 = i2 - i;
        return i3 == size() ? this : i3 == 0 ? qsn.e : new wde(this, i, i3);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.qde, java.util.AbstractCollection, java.util.Collection, java.util.Set
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
                            if (it2.hasNext() && hdg.S(it.next(), it2.next())) {
                            }
                        }
                        return !it2.hasNext();
                    }
                    for (int i = 0; i < size; i++) {
                        if (hdg.S(get(i), list.get(i))) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.qde
    public int g(int i, Object[] objArr) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
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

    @Override // defpackage.qde, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return listIterator(0);
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

    @Override // defpackage.qde
    /* renamed from: s */
    public final xkt iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.qde
    public Object writeReplace() {
        return new vde(toArray(qde.a));
    }

    @Override // java.util.List
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public final ude listIterator(int i) {
        o2g.P(i, size());
        return isEmpty() ? b : new ude(this, i);
    }

    @Override // defpackage.qde
    public final yde a() {
        return this;
    }
}
