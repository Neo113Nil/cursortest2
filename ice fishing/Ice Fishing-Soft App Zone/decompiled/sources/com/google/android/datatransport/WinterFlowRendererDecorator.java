package com.google.android.datatransport;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowRendererDecorator extends WinterFlowArrayCache implements Serializable {
    public static final WinterFlowRendererDecorator WinterFlowTransactionManagerStrategy = new WinterFlowRendererDecorator(WinterFlowDatabaseScript.WinterFlowSingletonPlatform);
    public final WinterFlowDatabaseScript WinterFlowVariableVersionControl;

    public WinterFlowRendererDecorator() {
        this.WinterFlowVariableVersionControl = new WinterFlowDatabaseScript();
    }

    @Override // com.google.android.datatransport.WinterFlowArrayCache
    public final int WinterFlowRouterStructure() {
        return this.WinterFlowVariableVersionControl.WinterFlowThreadListener;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        return this.WinterFlowVariableVersionControl.WinterFlowRouterStructure(obj) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        collection.getClass();
        this.WinterFlowVariableVersionControl.WinterFlowCacheManagerAgent();
        return super.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.WinterFlowVariableVersionControl.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.WinterFlowVariableVersionControl.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.WinterFlowVariableVersionControl.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new WinterFlowFrameworkNode(this.WinterFlowVariableVersionControl, 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        WinterFlowDatabaseScript winterFlowDatabaseScript = this.WinterFlowVariableVersionControl;
        winterFlowDatabaseScript.WinterFlowCacheManagerAgent();
        int WinterFlowUnitTestResponse = winterFlowDatabaseScript.WinterFlowUnitTestResponse(obj);
        if (WinterFlowUnitTestResponse < 0) {
            return false;
        }
        winterFlowDatabaseScript.WinterFlowTransactionAgent(WinterFlowUnitTestResponse);
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        this.WinterFlowVariableVersionControl.WinterFlowCacheManagerAgent();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        this.WinterFlowVariableVersionControl.WinterFlowCacheManagerAgent();
        return super.retainAll(collection);
    }

    public WinterFlowRendererDecorator(WinterFlowDatabaseScript winterFlowDatabaseScript) {
        winterFlowDatabaseScript.getClass();
        this.WinterFlowVariableVersionControl = winterFlowDatabaseScript;
    }
}
