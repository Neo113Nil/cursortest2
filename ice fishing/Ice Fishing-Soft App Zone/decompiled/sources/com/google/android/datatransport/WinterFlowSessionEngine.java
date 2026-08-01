package com.google.android.datatransport;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowSessionEngine implements Map, WinterFlowLoaderProcess {
    public WinterFlowCacheManagerGateway WinterFlowRouterRouter;
    public WinterFlowJavaScript WinterFlowTransactionManagerStrategy;
    public WinterFlowJavaScript WinterFlowUnitTestResponse;
    public final WinterFlowDatabaseSchemaStructure WinterFlowVariableVersionControl;

    public WinterFlowSessionEngine(WinterFlowDatabaseSchemaStructure winterFlowDatabaseSchemaStructure) {
        this.WinterFlowVariableVersionControl = winterFlowDatabaseSchemaStructure;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object compute(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object computeIfAbsent(Object obj, Function function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object computeIfPresent(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.WinterFlowVariableVersionControl.WinterFlowCacheManagerAgent(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.WinterFlowVariableVersionControl.WinterFlowArrayNetwork(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        WinterFlowJavaScript winterFlowJavaScript = this.WinterFlowTransactionManagerStrategy;
        if (winterFlowJavaScript != null) {
            return winterFlowJavaScript;
        }
        WinterFlowJavaScript winterFlowJavaScript2 = new WinterFlowJavaScript(this.WinterFlowVariableVersionControl, 0);
        this.WinterFlowTransactionManagerStrategy = winterFlowJavaScript2;
        return winterFlowJavaScript2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || WinterFlowSessionEngine.class != obj.getClass()) {
            return false;
        }
        return this.WinterFlowVariableVersionControl.equals(((WinterFlowSessionEngine) obj).WinterFlowVariableVersionControl);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return this.WinterFlowVariableVersionControl.WinterFlowUnitTestResponse(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.WinterFlowVariableVersionControl.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.WinterFlowVariableVersionControl.WinterFlowSyntax();
    }

    @Override // java.util.Map
    public final Set keySet() {
        WinterFlowJavaScript winterFlowJavaScript = this.WinterFlowUnitTestResponse;
        if (winterFlowJavaScript != null) {
            return winterFlowJavaScript;
        }
        WinterFlowJavaScript winterFlowJavaScript2 = new WinterFlowJavaScript(this.WinterFlowVariableVersionControl, 1);
        this.WinterFlowUnitTestResponse = winterFlowJavaScript2;
        return winterFlowJavaScript2;
    }

    @Override // java.util.Map
    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object putIfAbsent(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object replace(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void replaceAll(BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int size() {
        return this.WinterFlowVariableVersionControl.WinterFlowVariableVersionControl;
    }

    public final String toString() {
        return this.WinterFlowVariableVersionControl.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        WinterFlowCacheManagerGateway winterFlowCacheManagerGateway = this.WinterFlowRouterRouter;
        if (winterFlowCacheManagerGateway != null) {
            return winterFlowCacheManagerGateway;
        }
        WinterFlowCacheManagerGateway winterFlowCacheManagerGateway2 = new WinterFlowCacheManagerGateway(this.WinterFlowVariableVersionControl);
        this.WinterFlowRouterRouter = winterFlowCacheManagerGateway2;
        return winterFlowCacheManagerGateway2;
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
