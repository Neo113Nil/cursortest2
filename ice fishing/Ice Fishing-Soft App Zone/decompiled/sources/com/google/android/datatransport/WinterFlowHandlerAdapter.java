package com.google.android.datatransport;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowHandlerAdapter implements List, WinterFlowLoaderProcess {
    public final int WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ WinterFlowProxyService WinterFlowUnitTestResponse;
    public final int WinterFlowVariableVersionControl;

    public WinterFlowHandlerAdapter(WinterFlowProxyService winterFlowProxyService, int i, int i2) {
        this.WinterFlowUnitTestResponse = winterFlowProxyService;
        this.WinterFlowVariableVersionControl = i;
        this.WinterFlowTransactionManagerStrategy = i2;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addFirst(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addLast(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return (obj instanceof WinterFlowUserManagerController) && indexOf((WinterFlowUserManagerController) obj) != -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains((WinterFlowUserManagerController) it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        Object WinterFlowTransactionManagerStrategy = this.WinterFlowUnitTestResponse.WinterFlowVariableVersionControl.WinterFlowTransactionManagerStrategy(i + this.WinterFlowVariableVersionControl);
        WinterFlowTransactionManagerStrategy.getClass();
        return (WinterFlowUserManagerController) WinterFlowTransactionManagerStrategy;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof WinterFlowUserManagerController)) {
            return -1;
        }
        WinterFlowUserManagerController winterFlowUserManagerController = (WinterFlowUserManagerController) obj;
        int i = this.WinterFlowVariableVersionControl;
        int i2 = this.WinterFlowTransactionManagerStrategy;
        if (i > i2) {
            return -1;
        }
        int i3 = i;
        while (!WinterFlowManagerRequest.WinterFlowThreadListener(this.WinterFlowUnitTestResponse.WinterFlowVariableVersionControl.WinterFlowTransactionManagerStrategy(i3), winterFlowUserManagerController)) {
            if (i3 == i2) {
                return -1;
            }
            i3++;
        }
        return i3 - i;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        int i = this.WinterFlowVariableVersionControl;
        return new WinterFlowClassAlgorithm(this.WinterFlowUnitTestResponse, i, i, this.WinterFlowTransactionManagerStrategy);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof WinterFlowUserManagerController)) {
            return -1;
        }
        WinterFlowUserManagerController winterFlowUserManagerController = (WinterFlowUserManagerController) obj;
        int i = this.WinterFlowTransactionManagerStrategy;
        int i2 = this.WinterFlowVariableVersionControl;
        if (i2 > i) {
            return -1;
        }
        while (!WinterFlowManagerRequest.WinterFlowThreadListener(this.WinterFlowUnitTestResponse.WinterFlowVariableVersionControl.WinterFlowTransactionManagerStrategy(i), winterFlowUserManagerController)) {
            if (i == i2) {
                return -1;
            }
            i--;
        }
        return i - i2;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        int i2 = this.WinterFlowVariableVersionControl;
        int i3 = this.WinterFlowTransactionManagerStrategy;
        return new WinterFlowClassAlgorithm(this.WinterFlowUnitTestResponse, i + i2, i2, i3);
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object removeFirst() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object removeLast() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(UnaryOperator unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.WinterFlowTransactionManagerStrategy - this.WinterFlowVariableVersionControl;
    }

    @Override // java.util.List
    public final void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        int i3 = this.WinterFlowVariableVersionControl;
        return new WinterFlowHandlerAdapter(this.WinterFlowUnitTestResponse, i + i3, i3 + i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return WinterFlowTestingCloud.WinterFlowUserManagerUserManager(this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return WinterFlowTestingCloud.WinterFlowSoftwareEngine(this, objArr);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        int i = this.WinterFlowVariableVersionControl;
        return new WinterFlowClassAlgorithm(this.WinterFlowUnitTestResponse, i, i, this.WinterFlowTransactionManagerStrategy);
    }
}
