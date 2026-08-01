package com.google.android.datatransport;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowDecoratorLayer implements List, WinterFlowLoaderProcess {
    public final WinterFlowJSON WinterFlowVariableVersionControl;

    public WinterFlowDecoratorLayer(WinterFlowJSON winterFlowJSON) {
        this.WinterFlowVariableVersionControl = winterFlowJSON;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        this.WinterFlowVariableVersionControl.WinterFlowHookDataSource(obj);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        WinterFlowJSON winterFlowJSON = this.WinterFlowVariableVersionControl;
        return winterFlowJSON.WinterFlowVariableVersionControl(winterFlowJSON.WinterFlowUnitTestResponse, collection);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.WinterFlowVariableVersionControl.WinterFlowUnitTestResponse();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return this.WinterFlowVariableVersionControl.WinterFlowRouterRouter(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.WinterFlowVariableVersionControl.WinterFlowRouterRouter(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        WinterFlowResponseTool.WinterFlowRouterStructure(i, this);
        return this.WinterFlowVariableVersionControl.WinterFlowVariableVersionControl[i];
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return this.WinterFlowVariableVersionControl.WinterFlowSyntax(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.WinterFlowVariableVersionControl.WinterFlowUnitTestResponse == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new WinterFlowRepositoryPlatform(0, this);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        WinterFlowJSON winterFlowJSON = this.WinterFlowVariableVersionControl;
        Object[] objArr = winterFlowJSON.WinterFlowVariableVersionControl;
        for (int i = winterFlowJSON.WinterFlowUnitTestResponse - 1; i >= 0; i--) {
            if (WinterFlowManagerRequest.WinterFlowThreadListener(obj, objArr[i])) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new WinterFlowRepositoryPlatform(0, this);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        WinterFlowResponseTool.WinterFlowRouterStructure(i, this);
        return this.WinterFlowVariableVersionControl.WinterFlowTransactionAgent(i);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        WinterFlowJSON winterFlowJSON = this.WinterFlowVariableVersionControl;
        int i = winterFlowJSON.WinterFlowUnitTestResponse;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            winterFlowJSON.WinterFlowResponseEngine(it.next());
        }
        return i != winterFlowJSON.WinterFlowUnitTestResponse;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        WinterFlowJSON winterFlowJSON = this.WinterFlowVariableVersionControl;
        int i = winterFlowJSON.WinterFlowUnitTestResponse;
        for (int i2 = i - 1; -1 < i2; i2--) {
            if (!collection.contains(winterFlowJSON.WinterFlowVariableVersionControl[i2])) {
                winterFlowJSON.WinterFlowTransactionAgent(i2);
            }
        }
        return i != winterFlowJSON.WinterFlowUnitTestResponse;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        WinterFlowResponseTool.WinterFlowRouterStructure(i, this);
        Object[] objArr = this.WinterFlowVariableVersionControl.WinterFlowVariableVersionControl;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.WinterFlowVariableVersionControl.WinterFlowUnitTestResponse;
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        WinterFlowResponseTool.WinterFlowHookDataSource(this, i, i2);
        return new WinterFlowUISubsystem(this, i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return WinterFlowTestingCloud.WinterFlowUserManagerUserManager(this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return WinterFlowTestingCloud.WinterFlowSoftwareEngine(this, objArr);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        this.WinterFlowVariableVersionControl.WinterFlowRouterStructure(i, obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return new WinterFlowRepositoryPlatform(i, this);
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        return this.WinterFlowVariableVersionControl.WinterFlowVariableVersionControl(i, collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        return this.WinterFlowVariableVersionControl.WinterFlowResponseEngine(obj);
    }
}
