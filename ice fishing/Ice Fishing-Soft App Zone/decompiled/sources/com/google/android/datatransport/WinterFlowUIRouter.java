package com.google.android.datatransport;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public class WinterFlowUIRouter implements Map, WinterFlowLoaderProcess {
    public static final WinterFlowUIRouter WinterFlowUnitTestResponse = new WinterFlowUIRouter(WinterFlowLoaderScheduler.WinterFlowVariableVersionControl, 0);
    public final int WinterFlowTransactionManagerStrategy;
    public final WinterFlowLoaderScheduler WinterFlowVariableVersionControl;

    public WinterFlowUIRouter(WinterFlowLoaderScheduler winterFlowLoaderScheduler, int i) {
        this.WinterFlowVariableVersionControl = winterFlowLoaderScheduler;
        this.WinterFlowTransactionManagerStrategy = i;
    }

    public final WinterFlowUIRouter WinterFlowRouterStructure(Object obj, WinterFlowRendererView winterFlowRendererView) {
        WinterFlowSyntax WinterFlowRouterAdapter = this.WinterFlowVariableVersionControl.WinterFlowRouterAdapter(obj != null ? obj.hashCode() : 0, 0, obj, winterFlowRendererView);
        return WinterFlowRouterAdapter == null ? this : new WinterFlowUIRouter((WinterFlowLoaderScheduler) WinterFlowRouterAdapter.WinterFlowHookDataSource, this.WinterFlowTransactionManagerStrategy + WinterFlowRouterAdapter.WinterFlowRouterStructure);
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.WinterFlowVariableVersionControl.WinterFlowArrayNetwork(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        Set entrySet = entrySet();
        if (entrySet.isEmpty()) {
            return false;
        }
        Iterator it = entrySet.iterator();
        while (it.hasNext()) {
            if (WinterFlowManagerRequest.WinterFlowThreadListener(((Map.Entry) it.next()).getValue(), obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return new WinterFlowExceptionSession(this, 0);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this.WinterFlowTransactionManagerStrategy != map.size()) {
            return false;
        }
        Set<Map.Entry> entrySet = map.entrySet();
        if ((entrySet instanceof Collection) && entrySet.isEmpty()) {
            return true;
        }
        for (Map.Entry entry : entrySet) {
            if (entry != null) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                Object obj2 = get(key);
                if (WinterFlowManagerRequest.WinterFlowThreadListener(value, obj2) && (obj2 != null || containsKey(key))) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        return this.WinterFlowVariableVersionControl.WinterFlowUnitTestResponse(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return entrySet().hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.WinterFlowTransactionManagerStrategy == 0;
    }

    @Override // java.util.Map
    public final Set keySet() {
        return new WinterFlowExceptionSession(this, 1);
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
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int size() {
        return this.WinterFlowTransactionManagerStrategy;
    }

    public final String toString() {
        return WinterFlowSerializerUtility.WinterFlowHookQuery(entrySet(), ", ", "{", "}", new WinterFlowCompilerCloud(1, this), 24);
    }

    @Override // java.util.Map
    public final Collection values() {
        return new WinterFlowLoaderRequest(1, this);
    }
}
