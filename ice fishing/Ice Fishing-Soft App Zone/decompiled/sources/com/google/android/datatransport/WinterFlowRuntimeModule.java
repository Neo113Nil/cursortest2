package com.google.android.datatransport;

import java.util.Objects;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowRuntimeModule extends WinterFlowRuntimeBandwidth {
    public static final WinterFlowRuntimeModule WinterFlowSyntax = new WinterFlowRuntimeModule(0, new Object[0]);
    public final transient int WinterFlowRouterRouter;
    public final transient Object[] WinterFlowUnitTestResponse;

    public WinterFlowRuntimeModule(int i, Object[] objArr) {
        this.WinterFlowUnitTestResponse = objArr;
        this.WinterFlowRouterRouter = i;
    }

    @Override // com.google.android.datatransport.WinterFlowInterfaceServer
    public final int WinterFlowArrayNetwork() {
        return this.WinterFlowRouterRouter;
    }

    @Override // com.google.android.datatransport.WinterFlowInterfaceServer
    public final int WinterFlowCacheManagerAgent() {
        return 0;
    }

    @Override // com.google.android.datatransport.WinterFlowInterfaceServer
    public final Object[] WinterFlowRouterStructure() {
        return this.WinterFlowUnitTestResponse;
    }

    @Override // com.google.android.datatransport.WinterFlowRuntimeBandwidth, com.google.android.datatransport.WinterFlowInterfaceServer
    public final int WinterFlowVariableVersionControl(Object[] objArr) {
        Object[] objArr2 = this.WinterFlowUnitTestResponse;
        int i = this.WinterFlowRouterRouter;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        WinterFlowProtocolNetwork.WinterFlowTransactionAgent(i, this.WinterFlowRouterRouter);
        Object obj = this.WinterFlowUnitTestResponse[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.WinterFlowRouterRouter;
    }
}
