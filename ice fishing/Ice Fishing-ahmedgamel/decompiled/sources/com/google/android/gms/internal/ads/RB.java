package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public abstract class RB extends NB implements List, RandomAccess {

    /* renamed from: u, reason: collision with root package name */
    public static final PB f27933u = new PB(C3523lC.f32525x, 0);

    public static C3523lC j(Object obj) {
        Object[] objArr = {obj};
        AbstractC2792Sd.j(objArr, 1);
        return p(objArr, 1);
    }

    public static C3523lC k(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        AbstractC2792Sd.j(objArr, 2);
        return p(objArr, 2);
    }

    public static C3523lC l(Long l9, Long l10, Long l11, Long l12, Long l13) {
        Object[] objArr = {l9, l10, l11, l12, l13};
        AbstractC2792Sd.j(objArr, 5);
        return p(objArr, 5);
    }

    public static C3523lC m(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object... objArr) {
        int length = objArr.length;
        int i = length + 12;
        Object[] objArr2 = new Object[i];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        objArr2[6] = obj7;
        objArr2[7] = obj8;
        objArr2[8] = obj9;
        objArr2[9] = obj10;
        objArr2[10] = obj11;
        objArr2[11] = obj12;
        System.arraycopy(objArr, 0, objArr2, 12, length);
        AbstractC2792Sd.j(objArr2, i);
        return p(objArr2, i);
    }

    public static RB n(Collection collection) {
        if (!(collection instanceof NB)) {
            Object[] array = collection.toArray();
            int length = array.length;
            AbstractC2792Sd.j(array, length);
            return p(array, length);
        }
        RB f2 = ((NB) collection).f();
        if (!f2.g()) {
            return f2;
        }
        Object[] array2 = f2.toArray(NB.f27255n);
        return p(array2, array2.length);
    }

    public static C3523lC o(Object[] objArr) {
        if (objArr.length == 0) {
            return C3523lC.f32525x;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        int length = objArr2.length;
        AbstractC2792Sd.j(objArr2, length);
        return p(objArr2, length);
    }

    public static C3523lC p(Object[] objArr, int i) {
        return i == 0 ? C3523lC.f32525x : new C3523lC(objArr, i);
    }

    @Override // com.google.android.gms.internal.ads.NB
    public final AbstractC4278zC a() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.NB, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i = 0; i < size; i++) {
                        if (Objects.equals(get(i), list.get(i))) {
                        }
                    }
                    return true;
                }
                PB listIterator = listIterator(0);
                Iterator it = list.iterator();
                while (true) {
                    if (listIterator.hasNext()) {
                        if (!it.hasNext() || !Objects.equals(listIterator.next(), it.next())) {
                            break;
                        }
                    } else if (!it.hasNext()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.NB
    public final RB f() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.NB
    public int h(Object[] objArr, int i) {
        int size = size();
        for (int i4 = 0; i4 < size; i4++) {
            objArr[i + i4] = get(i4);
        }
        return i + size;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i4 = 0; i4 < size; i4++) {
            i = (i * 31) + get(i4).hashCode();
        }
        return i;
    }

    @Override // java.util.List
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public RB subList(int i, int i4) {
        AbstractC2792Sd.M(i, i4, size());
        int i6 = i4 - i;
        return i6 == size() ? this : i6 == 0 ? C3523lC.f32525x : new QB(this, i, i6);
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

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final /* synthetic */ Iterator iterator() {
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

    @Override // java.util.List
    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public final PB listIterator(int i) {
        AbstractC2792Sd.L(i, size());
        return isEmpty() ? f27933u : new PB(this, i);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }
}
