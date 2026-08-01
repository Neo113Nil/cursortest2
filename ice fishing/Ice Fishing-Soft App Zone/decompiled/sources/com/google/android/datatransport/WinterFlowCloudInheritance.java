package com.google.android.datatransport;

import java.util.Map;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowCloudInheritance implements Map.Entry, Comparable {
    public Object WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ WinterFlowDataSourceNetwork WinterFlowUnitTestResponse;
    public final Comparable WinterFlowVariableVersionControl;

    public WinterFlowCloudInheritance(WinterFlowDataSourceNetwork winterFlowDataSourceNetwork, Comparable comparable, Object obj) {
        this.WinterFlowUnitTestResponse = winterFlowDataSourceNetwork;
        this.WinterFlowVariableVersionControl = comparable;
        this.WinterFlowTransactionManagerStrategy = obj;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.WinterFlowVariableVersionControl.compareTo(((WinterFlowCloudInheritance) obj).WinterFlowVariableVersionControl);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Comparable comparable = this.WinterFlowVariableVersionControl;
                if (comparable == null ? key == null : comparable.equals(key)) {
                    Object obj2 = this.WinterFlowTransactionManagerStrategy;
                    Object value = entry.getValue();
                    if (obj2 == null ? value == null : obj2.equals(value)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.WinterFlowVariableVersionControl;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.WinterFlowTransactionManagerStrategy;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.WinterFlowVariableVersionControl;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.WinterFlowTransactionManagerStrategy;
        return hashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.WinterFlowUnitTestResponse.WinterFlowHookDataSource();
        Object obj2 = this.WinterFlowTransactionManagerStrategy;
        this.WinterFlowTransactionManagerStrategy = obj;
        return obj2;
    }

    public final String toString() {
        return this.WinterFlowVariableVersionControl + "=" + this.WinterFlowTransactionManagerStrategy;
    }
}
