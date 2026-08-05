package defpackage;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class u0 implements Set {
    public final /* synthetic */ x0 NCTxEWno;

    public u0(x0 x0Var) {
        this.NCTxEWno = x0Var;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.NCTxEWno.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.NCTxEWno.containsKey(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.NCTxEWno.eVhOlqcC(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        x0 x0Var = this.NCTxEWno;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        try {
            if (x0Var.wxUZMvaN == set.size()) {
                return x0Var.eVhOlqcC(set);
            }
            return false;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        x0 x0Var = this.NCTxEWno;
        int i = 0;
        for (int i2 = x0Var.wxUZMvaN - 1; i2 >= 0; i2--) {
            Object P7K7Inc8 = x0Var.P7K7Inc8(i2);
            i += P7K7Inc8 == null ? 0 : P7K7Inc8.hashCode();
        }
        return i;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.NCTxEWno.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new t0(this.NCTxEWno, 0);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        x0 x0Var = this.NCTxEWno;
        int wxUZMvaN = x0Var.wxUZMvaN(obj);
        if (wxUZMvaN < 0) {
            return false;
        }
        x0Var.b2ZJblxo(wxUZMvaN);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        return this.NCTxEWno.k3x7lurq(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        x0 x0Var = this.NCTxEWno;
        int i = x0Var.wxUZMvaN;
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (!collection.contains(x0Var.P7K7Inc8(i2))) {
                x0Var.b2ZJblxo(i2);
            }
        }
        return i != x0Var.wxUZMvaN;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.NCTxEWno.wxUZMvaN;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        x0 x0Var = this.NCTxEWno;
        int i = x0Var.wxUZMvaN;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = x0Var.P7K7Inc8(i2);
        }
        if (objArr.length > i) {
            objArr[i] = null;
        }
        return objArr;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        x0 x0Var = this.NCTxEWno;
        int i = x0Var.wxUZMvaN;
        Object[] objArr = new Object[i];
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = x0Var.P7K7Inc8(i2);
        }
        return objArr;
    }
}
