package com.google.android.datatransport;

import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowMicroserviceUserManager extends WinterFlowConcurrencyQueue implements RandomAccess {
    public final int WinterFlowTransactionManagerStrategy;
    public final int WinterFlowUnitTestResponse;
    public final WinterFlowConcurrencyQueue WinterFlowVariableVersionControl;

    public WinterFlowMicroserviceUserManager(WinterFlowConcurrencyQueue winterFlowConcurrencyQueue, int i, int i2) {
        this.WinterFlowVariableVersionControl = winterFlowConcurrencyQueue;
        this.WinterFlowTransactionManagerStrategy = i;
        WinterFlowInvokerComponent.WinterFlowBandwidthObject(i, i2, winterFlowConcurrencyQueue.WinterFlowRouterStructure());
        this.WinterFlowUnitTestResponse = i2 - i;
    }

    @Override // com.google.android.datatransport.WinterFlowResolverRefactoring
    public final int WinterFlowRouterStructure() {
        return this.WinterFlowUnitTestResponse;
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.WinterFlowUnitTestResponse;
        if (i < 0 || i >= i2) {
            WinterFlowCompilerMechanism.WinterFlowTransactionAgent(WinterFlowResolverBackend.WinterFlowRouterRouter(i, i2, "index: ", ", size: "));
            return null;
        }
        return this.WinterFlowVariableVersionControl.get(this.WinterFlowTransactionManagerStrategy + i);
    }

    @Override // com.google.android.datatransport.WinterFlowConcurrencyQueue, java.util.List
    public final List subList(int i, int i2) {
        WinterFlowInvokerComponent.WinterFlowBandwidthObject(i, i2, this.WinterFlowUnitTestResponse);
        int i3 = this.WinterFlowTransactionManagerStrategy;
        return new WinterFlowMicroserviceUserManager(this.WinterFlowVariableVersionControl, i + i3, i3 + i2);
    }
}
