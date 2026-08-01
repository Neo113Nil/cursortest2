package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowBatchSoftware implements WinterFlowSoftwareStrategy {
    public static final Object WinterFlowUnitTestResponse = new Object();
    public volatile Object WinterFlowTransactionManagerStrategy;
    public volatile WinterFlowSoftwareStrategy WinterFlowVariableVersionControl;

    public static WinterFlowSoftwareStrategy WinterFlowRouterStructure(WinterFlowSoftwareStrategy winterFlowSoftwareStrategy) {
        if (winterFlowSoftwareStrategy instanceof WinterFlowBatchSoftware) {
            return winterFlowSoftwareStrategy;
        }
        WinterFlowBatchSoftware winterFlowBatchSoftware = new WinterFlowBatchSoftware();
        winterFlowBatchSoftware.WinterFlowTransactionManagerStrategy = WinterFlowUnitTestResponse;
        winterFlowBatchSoftware.WinterFlowVariableVersionControl = winterFlowSoftwareStrategy;
        return winterFlowBatchSoftware;
    }

    @Override // com.google.android.datatransport.WinterFlowSoftwareStrategy
    public final Object get() {
        Object obj;
        Object obj2 = this.WinterFlowTransactionManagerStrategy;
        Object obj3 = WinterFlowUnitTestResponse;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.WinterFlowTransactionManagerStrategy;
                if (obj == obj3) {
                    obj = this.WinterFlowVariableVersionControl.get();
                    Object obj4 = this.WinterFlowTransactionManagerStrategy;
                    if (obj4 != obj3 && obj4 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.WinterFlowTransactionManagerStrategy = obj;
                    this.WinterFlowVariableVersionControl = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
