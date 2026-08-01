package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowInterfaceBackend extends WinterFlowDebugFramework implements WinterFlowObjectSession {
    public final /* synthetic */ WinterFlowBandwidthCache WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ int WinterFlowUnitTestResponse;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WinterFlowInterfaceBackend(WinterFlowBandwidthCache winterFlowBandwidthCache, int i) {
        super(1);
        this.WinterFlowTransactionManagerStrategy = winterFlowBandwidthCache;
        this.WinterFlowUnitTestResponse = i;
    }

    @Override // com.google.android.datatransport.WinterFlowObjectSession
    public final Object WinterFlowUnitTestResponse(Object obj) {
        Boolean valueOf = Boolean.valueOf(((WinterFlowDeploymentWidget) obj).WinterFlowSoftwareServiceProvider(this.WinterFlowUnitTestResponse));
        this.WinterFlowTransactionManagerStrategy.WinterFlowVariableVersionControl = valueOf;
        return valueOf;
    }
}
