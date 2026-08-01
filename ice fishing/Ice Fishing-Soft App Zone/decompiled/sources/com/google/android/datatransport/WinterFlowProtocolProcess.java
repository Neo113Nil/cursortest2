package com.google.android.datatransport;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowProtocolProcess implements Map.Entry, WinterFlowLoaderProcess {
    public final int WinterFlowTransactionManagerStrategy;
    public final int WinterFlowUnitTestResponse;
    public final WinterFlowDatabaseScript WinterFlowVariableVersionControl;

    public WinterFlowProtocolProcess(WinterFlowDatabaseScript winterFlowDatabaseScript, int i) {
        this.WinterFlowVariableVersionControl = winterFlowDatabaseScript;
        this.WinterFlowTransactionManagerStrategy = i;
        this.WinterFlowUnitTestResponse = winterFlowDatabaseScript.WinterFlowServerProtocol;
    }

    public final void WinterFlowRouterStructure() {
        if (this.WinterFlowVariableVersionControl.WinterFlowServerProtocol != this.WinterFlowUnitTestResponse) {
            throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
        }
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return WinterFlowManagerRequest.WinterFlowThreadListener(entry.getKey(), getKey()) && WinterFlowManagerRequest.WinterFlowThreadListener(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        WinterFlowRouterStructure();
        return this.WinterFlowVariableVersionControl.WinterFlowVariableVersionControl[this.WinterFlowTransactionManagerStrategy];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        WinterFlowRouterStructure();
        Object[] objArr = this.WinterFlowVariableVersionControl.WinterFlowTransactionManagerStrategy;
        objArr.getClass();
        return objArr[this.WinterFlowTransactionManagerStrategy];
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object key = getKey();
        int hashCode = key != null ? key.hashCode() : 0;
        Object value = getValue();
        return hashCode ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        WinterFlowRouterStructure();
        WinterFlowDatabaseScript winterFlowDatabaseScript = this.WinterFlowVariableVersionControl;
        winterFlowDatabaseScript.WinterFlowCacheManagerAgent();
        Object[] objArr = winterFlowDatabaseScript.WinterFlowTransactionManagerStrategy;
        if (objArr == null) {
            int length = winterFlowDatabaseScript.WinterFlowVariableVersionControl.length;
            if (length < 0) {
                WinterFlowEventEmitterOrchestration.WinterFlowBandwidthObject("capacity must be non-negative.");
                return null;
            }
            objArr = new Object[length];
            winterFlowDatabaseScript.WinterFlowTransactionManagerStrategy = objArr;
        }
        int i = this.WinterFlowTransactionManagerStrategy;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getKey());
        sb.append('=');
        sb.append(getValue());
        return sb.toString();
    }
}
