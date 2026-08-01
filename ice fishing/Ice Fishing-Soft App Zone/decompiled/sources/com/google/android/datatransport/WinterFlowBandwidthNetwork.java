package com.google.android.datatransport;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowBandwidthNetwork implements Collection {
    public final /* synthetic */ WinterFlowUnitTestSystem WinterFlowVariableVersionControl;

    public WinterFlowBandwidthNetwork(WinterFlowUnitTestSystem winterFlowUnitTestSystem) {
        this.WinterFlowVariableVersionControl = winterFlowUnitTestSystem;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        this.WinterFlowVariableVersionControl.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.WinterFlowVariableVersionControl.WinterFlowRouterStructure(obj) >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.WinterFlowVariableVersionControl.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new WinterFlowRendererComponent(this.WinterFlowVariableVersionControl, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        WinterFlowUnitTestSystem winterFlowUnitTestSystem = this.WinterFlowVariableVersionControl;
        int WinterFlowRouterStructure = winterFlowUnitTestSystem.WinterFlowRouterStructure(obj);
        if (WinterFlowRouterStructure < 0) {
            return false;
        }
        winterFlowUnitTestSystem.WinterFlowTransactionManagerStrategy(WinterFlowRouterStructure);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        WinterFlowUnitTestSystem winterFlowUnitTestSystem = this.WinterFlowVariableVersionControl;
        int i = winterFlowUnitTestSystem.WinterFlowUnitTestResponse;
        int i2 = 0;
        boolean z = false;
        while (i2 < i) {
            if (collection.contains(winterFlowUnitTestSystem.WinterFlowRouterRouter(i2))) {
                winterFlowUnitTestSystem.WinterFlowTransactionManagerStrategy(i2);
                i2--;
                i--;
                z = true;
            }
            i2++;
        }
        return z;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        WinterFlowUnitTestSystem winterFlowUnitTestSystem = this.WinterFlowVariableVersionControl;
        int i = winterFlowUnitTestSystem.WinterFlowUnitTestResponse;
        int i2 = 0;
        boolean z = false;
        while (i2 < i) {
            if (!collection.contains(winterFlowUnitTestSystem.WinterFlowRouterRouter(i2))) {
                winterFlowUnitTestSystem.WinterFlowTransactionManagerStrategy(i2);
                i2--;
                i--;
                z = true;
            }
            i2++;
        }
        return z;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.WinterFlowVariableVersionControl.WinterFlowUnitTestResponse;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        WinterFlowUnitTestSystem winterFlowUnitTestSystem = this.WinterFlowVariableVersionControl;
        int i = winterFlowUnitTestSystem.WinterFlowUnitTestResponse;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = winterFlowUnitTestSystem.WinterFlowRouterRouter(i2);
        }
        if (objArr.length > i) {
            objArr[i] = null;
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        WinterFlowUnitTestSystem winterFlowUnitTestSystem = this.WinterFlowVariableVersionControl;
        int i = winterFlowUnitTestSystem.WinterFlowUnitTestResponse;
        Object[] objArr = new Object[i];
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = winterFlowUnitTestSystem.WinterFlowRouterRouter(i2);
        }
        return objArr;
    }
}
