package com.google.android.datatransport;

import com.google.android.gms.common.ConnectionResult;
import java.util.Objects;
import java.util.Set;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowConfiguration implements WinterFlowGatewayHandler {
    public final /* synthetic */ WinterFlowTransactionManagerStack WinterFlowResponseEngine;
    public Set WinterFlowRouterRouter;
    public boolean WinterFlowSyntax;
    public final WinterFlowRepositoryBandwidth WinterFlowTransactionManagerStrategy;
    public WinterFlowBandwidthRefactoring WinterFlowUnitTestResponse;
    public final com.google.android.gms.common.internal.WinterFlowSyntaxEvent WinterFlowVariableVersionControl;

    public WinterFlowConfiguration(WinterFlowTransactionManagerStack winterFlowTransactionManagerStack, com.google.android.gms.common.internal.WinterFlowSyntaxEvent winterFlowSyntaxEvent, WinterFlowRepositoryBandwidth winterFlowRepositoryBandwidth) {
        Objects.requireNonNull(winterFlowTransactionManagerStack);
        this.WinterFlowResponseEngine = winterFlowTransactionManagerStack;
        this.WinterFlowUnitTestResponse = null;
        this.WinterFlowRouterRouter = null;
        this.WinterFlowSyntax = false;
        this.WinterFlowVariableVersionControl = winterFlowSyntaxEvent;
        this.WinterFlowTransactionManagerStrategy = winterFlowRepositoryBandwidth;
    }

    @Override // com.google.android.datatransport.WinterFlowGatewayHandler
    public final void WinterFlowHookDataSource(ConnectionResult connectionResult) {
        this.WinterFlowResponseEngine.WinterFlowThreadListener.post(new WinterFlowProtocolThread(1, this, connectionResult));
    }

    public final void WinterFlowRouterStructure(ConnectionResult connectionResult) {
        WinterFlowCacheTransactionManager winterFlowCacheTransactionManager = (WinterFlowCacheTransactionManager) this.WinterFlowResponseEngine.WinterFlowResponseEngine.get(this.WinterFlowTransactionManagerStrategy);
        if (winterFlowCacheTransactionManager != null) {
            winterFlowCacheTransactionManager.WinterFlowThreadListener(connectionResult);
        }
    }
}
