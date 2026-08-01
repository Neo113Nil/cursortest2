package com.google.android.datatransport;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowRuntimeException implements Collection, WinterFlowLoaderProcess {
    public static final WinterFlowRuntimeException WinterFlowUnitTestResponse = new WinterFlowRuntimeException(WinterFlowDataSourceEngine.WinterFlowVariableVersionControl);
    public final int WinterFlowTransactionManagerStrategy;
    public final List WinterFlowVariableVersionControl;

    public WinterFlowRuntimeException(List list) {
        this.WinterFlowVariableVersionControl = list;
        this.WinterFlowTransactionManagerStrategy = list.size();
    }

    @Override // java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof WinterFlowGatewayEngine)) {
            return false;
        }
        return this.WinterFlowVariableVersionControl.contains((WinterFlowGatewayEngine) obj);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.WinterFlowVariableVersionControl.containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WinterFlowRuntimeException) {
            return this.WinterFlowVariableVersionControl.equals(((WinterFlowRuntimeException) obj).WinterFlowVariableVersionControl);
        }
        return false;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return this.WinterFlowVariableVersionControl.hashCode();
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.WinterFlowVariableVersionControl.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.WinterFlowVariableVersionControl.iterator();
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeIf(Predicate predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        return this.WinterFlowTransactionManagerStrategy;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return WinterFlowTestingCloud.WinterFlowUserManagerUserManager(this);
    }

    public final String toString() {
        return "LocaleList(localeList=" + this.WinterFlowVariableVersionControl + ')';
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return WinterFlowTestingCloud.WinterFlowSoftwareEngine(this, objArr);
    }
}
