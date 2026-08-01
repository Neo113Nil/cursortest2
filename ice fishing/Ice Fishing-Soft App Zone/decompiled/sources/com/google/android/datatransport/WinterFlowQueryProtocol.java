package com.google.android.datatransport;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowQueryProtocol extends WinterFlowRendererSystem implements List, WinterFlowLoaderProcess {
    public final List WinterFlowUnitTestResponse;

    public WinterFlowQueryProtocol(List list) {
        this.WinterFlowUnitTestResponse = list;
        if (list.isEmpty()) {
            WinterFlowWorkerPipeline.WinterFlowHookDataSource("At least one font should be passed to FontFamily");
        }
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
        if (!(obj instanceof WinterFlowStrategyBackend)) {
            return false;
        }
        return this.WinterFlowUnitTestResponse.contains((WinterFlowStrategyBackend) obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.WinterFlowUnitTestResponse.containsAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WinterFlowQueryProtocol) {
            return this.WinterFlowUnitTestResponse.equals(((WinterFlowQueryProtocol) obj).WinterFlowUnitTestResponse);
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return (WinterFlowStrategyBackend) this.WinterFlowUnitTestResponse.get(i);
    }

    @Override // java.util.List, java.util.Collection
    public final int hashCode() {
        return this.WinterFlowUnitTestResponse.hashCode();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof WinterFlowStrategyBackend)) {
            return -1;
        }
        return this.WinterFlowUnitTestResponse.indexOf((WinterFlowStrategyBackend) obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.WinterFlowUnitTestResponse.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.WinterFlowUnitTestResponse.iterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof WinterFlowStrategyBackend)) {
            return -1;
        }
        return this.WinterFlowUnitTestResponse.lastIndexOf((WinterFlowStrategyBackend) obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return this.WinterFlowUnitTestResponse.listIterator();
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
        return this.WinterFlowUnitTestResponse.size();
    }

    @Override // java.util.List
    public final void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        return this.WinterFlowUnitTestResponse.subList(i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return WinterFlowTestingCloud.WinterFlowUserManagerUserManager(this);
    }

    public final String toString() {
        return "FontListFontFamily(fonts=" + this.WinterFlowUnitTestResponse + ')';
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return WinterFlowTestingCloud.WinterFlowSoftwareEngine(this, objArr);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return this.WinterFlowUnitTestResponse.listIterator(i);
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
}
