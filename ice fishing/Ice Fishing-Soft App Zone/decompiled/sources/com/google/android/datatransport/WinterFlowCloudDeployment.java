package com.google.android.datatransport;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowCloudDeployment implements Set {
    public final /* synthetic */ WinterFlowUnitTestSystem WinterFlowVariableVersionControl;

    public WinterFlowCloudDeployment(WinterFlowUnitTestSystem winterFlowUnitTestSystem) {
        this.WinterFlowVariableVersionControl = winterFlowUnitTestSystem;
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
        this.WinterFlowVariableVersionControl.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.WinterFlowVariableVersionControl.containsKey(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.WinterFlowVariableVersionControl.WinterFlowSyntax(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        WinterFlowUnitTestSystem winterFlowUnitTestSystem = this.WinterFlowVariableVersionControl;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        try {
            if (winterFlowUnitTestSystem.WinterFlowUnitTestResponse == set.size()) {
                return winterFlowUnitTestSystem.WinterFlowSyntax(set);
            }
            return false;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        WinterFlowUnitTestSystem winterFlowUnitTestSystem = this.WinterFlowVariableVersionControl;
        int i = 0;
        for (int i2 = winterFlowUnitTestSystem.WinterFlowUnitTestResponse - 1; i2 >= 0; i2--) {
            Object WinterFlowVariableVersionControl = winterFlowUnitTestSystem.WinterFlowVariableVersionControl(i2);
            i += WinterFlowVariableVersionControl == null ? 0 : WinterFlowVariableVersionControl.hashCode();
        }
        return i;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.WinterFlowVariableVersionControl.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new WinterFlowRendererComponent(this.WinterFlowVariableVersionControl, 0);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        WinterFlowUnitTestSystem winterFlowUnitTestSystem = this.WinterFlowVariableVersionControl;
        int WinterFlowCacheManagerAgent = winterFlowUnitTestSystem.WinterFlowCacheManagerAgent(obj);
        if (WinterFlowCacheManagerAgent < 0) {
            return false;
        }
        winterFlowUnitTestSystem.WinterFlowTransactionManagerStrategy(WinterFlowCacheManagerAgent);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        return this.WinterFlowVariableVersionControl.WinterFlowResponseEngine(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        WinterFlowUnitTestSystem winterFlowUnitTestSystem = this.WinterFlowVariableVersionControl;
        int i = winterFlowUnitTestSystem.WinterFlowUnitTestResponse;
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (!collection.contains(winterFlowUnitTestSystem.WinterFlowVariableVersionControl(i2))) {
                winterFlowUnitTestSystem.WinterFlowTransactionManagerStrategy(i2);
            }
        }
        return i != winterFlowUnitTestSystem.WinterFlowUnitTestResponse;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.WinterFlowVariableVersionControl.WinterFlowUnitTestResponse;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        WinterFlowUnitTestSystem winterFlowUnitTestSystem = this.WinterFlowVariableVersionControl;
        int i = winterFlowUnitTestSystem.WinterFlowUnitTestResponse;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = winterFlowUnitTestSystem.WinterFlowVariableVersionControl(i2);
        }
        if (objArr.length > i) {
            objArr[i] = null;
        }
        return objArr;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        WinterFlowUnitTestSystem winterFlowUnitTestSystem = this.WinterFlowVariableVersionControl;
        int i = winterFlowUnitTestSystem.WinterFlowUnitTestResponse;
        Object[] objArr = new Object[i];
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = winterFlowUnitTestSystem.WinterFlowVariableVersionControl(i2);
        }
        return objArr;
    }
}
