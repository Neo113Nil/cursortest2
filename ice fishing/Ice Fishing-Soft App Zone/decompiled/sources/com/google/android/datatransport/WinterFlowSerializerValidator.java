package com.google.android.datatransport;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowSerializerValidator extends AbstractList implements RandomAccess, WinterFlowXMLDecorator {
    public static final WinterFlowSerializerValidator WinterFlowRouterRouter = new WinterFlowSerializerValidator(new Object[0], 0, false);
    public Object[] WinterFlowTransactionManagerStrategy;
    public int WinterFlowUnitTestResponse;
    public boolean WinterFlowVariableVersionControl;

    public WinterFlowSerializerValidator(Object[] objArr, int i, boolean z) {
        this.WinterFlowVariableVersionControl = z;
        this.WinterFlowTransactionManagerStrategy = objArr;
        this.WinterFlowUnitTestResponse = i;
    }

    public final WinterFlowSerializerValidator WinterFlowArrayNetwork(int i) {
        if (i >= this.WinterFlowUnitTestResponse) {
            return new WinterFlowSerializerValidator(Arrays.copyOf(this.WinterFlowTransactionManagerStrategy, i), this.WinterFlowUnitTestResponse, true);
        }
        throw new IllegalArgumentException();
    }

    public final void WinterFlowCacheManagerAgent() {
        if (!this.WinterFlowVariableVersionControl) {
            throw new UnsupportedOperationException();
        }
    }

    public final void WinterFlowRouterStructure(int i) {
        if (i < 0 || i >= this.WinterFlowUnitTestResponse) {
            StringBuilder WinterFlowThreadListener = WinterFlowResolverBackend.WinterFlowThreadListener("Index:", i, ", Size:");
            WinterFlowThreadListener.append(this.WinterFlowUnitTestResponse);
            throw new IndexOutOfBoundsException(WinterFlowThreadListener.toString());
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        WinterFlowCacheManagerAgent();
        if (i < 0 || i > (i2 = this.WinterFlowUnitTestResponse)) {
            StringBuilder WinterFlowThreadListener = WinterFlowResolverBackend.WinterFlowThreadListener("Index:", i, ", Size:");
            WinterFlowThreadListener.append(this.WinterFlowUnitTestResponse);
            throw new IndexOutOfBoundsException(WinterFlowThreadListener.toString());
        }
        Object[] objArr = this.WinterFlowTransactionManagerStrategy;
        if (i2 < objArr.length) {
            System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
        } else {
            Object[] objArr2 = new Object[((i2 * 3) / 2) + 1];
            System.arraycopy(objArr, 0, objArr2, 0, i);
            System.arraycopy(this.WinterFlowTransactionManagerStrategy, i, objArr2, i + 1, this.WinterFlowUnitTestResponse - i);
            this.WinterFlowTransactionManagerStrategy = objArr2;
        }
        this.WinterFlowTransactionManagerStrategy[i] = obj;
        this.WinterFlowUnitTestResponse++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        WinterFlowCacheManagerAgent();
        return super.addAll(collection);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        WinterFlowCacheManagerAgent();
        super.clear();
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (!get(i).equals(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        WinterFlowRouterStructure(i);
        return this.WinterFlowTransactionManagerStrategy[i];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        WinterFlowCacheManagerAgent();
        WinterFlowRouterStructure(i);
        Object[] objArr = this.WinterFlowTransactionManagerStrategy;
        Object obj = objArr[i];
        if (i < this.WinterFlowUnitTestResponse - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (r2 - i) - 1);
        }
        this.WinterFlowUnitTestResponse--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        WinterFlowCacheManagerAgent();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        WinterFlowCacheManagerAgent();
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        WinterFlowCacheManagerAgent();
        WinterFlowRouterStructure(i);
        Object[] objArr = this.WinterFlowTransactionManagerStrategy;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.WinterFlowUnitTestResponse;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        WinterFlowCacheManagerAgent();
        return super.addAll(i, collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        WinterFlowCacheManagerAgent();
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        WinterFlowCacheManagerAgent();
        int i = this.WinterFlowUnitTestResponse;
        Object[] objArr = this.WinterFlowTransactionManagerStrategy;
        if (i == objArr.length) {
            objArr = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
            this.WinterFlowTransactionManagerStrategy = objArr;
        }
        int i2 = this.WinterFlowUnitTestResponse;
        this.WinterFlowUnitTestResponse = i2 + 1;
        objArr[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
