package com.google.android.datatransport;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.util.Map;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowProviderHandler extends WinterFlowDatabaseResponse {
    public final WinterFlowSessionManagerProcess WinterFlowArrayNetwork;
    public final WinterFlowArrayEngine WinterFlowCacheManagerAgent;
    public final WinterFlowStrategyVersionControl WinterFlowHookDataSource;

    public WinterFlowProviderHandler(int i, WinterFlowStrategyVersionControl winterFlowStrategyVersionControl, WinterFlowArrayEngine winterFlowArrayEngine, WinterFlowSessionManagerProcess winterFlowSessionManagerProcess) {
        super(i);
        this.WinterFlowCacheManagerAgent = winterFlowArrayEngine;
        this.WinterFlowHookDataSource = winterFlowStrategyVersionControl;
        this.WinterFlowArrayNetwork = winterFlowSessionManagerProcess;
        if (i == 2 && winterFlowStrategyVersionControl.WinterFlowRouterStructure) {
            WinterFlowEventEmitterOrchestration.WinterFlowBandwidthObject("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
            throw null;
        }
    }

    @Override // com.google.android.datatransport.WinterFlowDatabaseResponse
    public final void WinterFlowArrayNetwork(Status status) {
        this.WinterFlowArrayNetwork.getClass();
        this.WinterFlowCacheManagerAgent.WinterFlowHookDataSource(status.WinterFlowUnitTestResponse != null ? new WinterFlowNetworkInterface(status) : new WinterFlowInheritanceOrchestration(status));
    }

    @Override // com.google.android.datatransport.WinterFlowDatabaseResponse
    public final int WinterFlowCacheManagerAgent(WinterFlowCacheTransactionManager winterFlowCacheTransactionManager) {
        return this.WinterFlowHookDataSource.WinterFlowHookDataSource;
    }

    @Override // com.google.android.datatransport.WinterFlowDatabaseResponse
    public final boolean WinterFlowHookDataSource(WinterFlowCacheTransactionManager winterFlowCacheTransactionManager) {
        return this.WinterFlowHookDataSource.WinterFlowRouterStructure;
    }

    @Override // com.google.android.datatransport.WinterFlowDatabaseResponse
    public final WinterFlowDebugDatabaseSchema[] WinterFlowRouterStructure(WinterFlowCacheTransactionManager winterFlowCacheTransactionManager) {
        return (WinterFlowDebugDatabaseSchema[]) this.WinterFlowHookDataSource.WinterFlowCacheManagerAgent;
    }

    @Override // com.google.android.datatransport.WinterFlowDatabaseResponse
    public final void WinterFlowTransactionManagerStrategy(WinterFlowCacheManagerVersionControl winterFlowCacheManagerVersionControl, boolean z) {
        Boolean valueOf = Boolean.valueOf(z);
        Map map = (Map) winterFlowCacheManagerVersionControl.WinterFlowUnitTestResponse;
        WinterFlowArrayEngine winterFlowArrayEngine = this.WinterFlowCacheManagerAgent;
        map.put(winterFlowArrayEngine, valueOf);
        WinterFlowExceptionParser winterFlowExceptionParser = winterFlowArrayEngine.WinterFlowRouterStructure;
        winterFlowExceptionParser.WinterFlowHookDataSource.WinterFlowHookDataSource(new WinterFlowProtocolMechanism(WinterFlowCacheHandler.WinterFlowRouterStructure, new WinterFlowCacheManagerVersionControl(winterFlowCacheManagerVersionControl, winterFlowArrayEngine)));
        winterFlowExceptionParser.WinterFlowThreadListener();
    }

    @Override // com.google.android.datatransport.WinterFlowDatabaseResponse
    public final void WinterFlowUnitTestResponse(WinterFlowCacheTransactionManager winterFlowCacheTransactionManager) {
        WinterFlowArrayEngine winterFlowArrayEngine = this.WinterFlowCacheManagerAgent;
        try {
            WinterFlowStrategyVersionControl winterFlowStrategyVersionControl = this.WinterFlowHookDataSource;
            ((WinterFlowEventPipeline) ((WinterFlowStrategyVersionControl) winterFlowStrategyVersionControl.WinterFlowArrayNetwork).WinterFlowCacheManagerAgent).accept(winterFlowCacheTransactionManager.WinterFlowArrayNetwork, winterFlowArrayEngine);
        } catch (DeadObjectException e) {
            throw e;
        } catch (RemoteException e2) {
            WinterFlowArrayNetwork(WinterFlowDatabaseResponse.WinterFlowRouterRouter(e2));
        } catch (RuntimeException e3) {
            winterFlowArrayEngine.WinterFlowHookDataSource(e3);
        }
    }

    @Override // com.google.android.datatransport.WinterFlowDatabaseResponse
    public final void WinterFlowVariableVersionControl(Exception exc) {
        this.WinterFlowCacheManagerAgent.WinterFlowHookDataSource(exc);
    }
}
