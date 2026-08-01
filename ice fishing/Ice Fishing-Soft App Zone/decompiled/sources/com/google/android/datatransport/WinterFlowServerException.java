package com.google.android.datatransport;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowServerException extends WinterFlowDatabaseResponse {
    public final WinterFlowArrayEngine WinterFlowHookDataSource;

    public WinterFlowServerException(WinterFlowArrayEngine winterFlowArrayEngine) {
        super(4);
        this.WinterFlowHookDataSource = winterFlowArrayEngine;
    }

    @Override // com.google.android.datatransport.WinterFlowDatabaseResponse
    public final void WinterFlowArrayNetwork(Status status) {
        this.WinterFlowHookDataSource.WinterFlowHookDataSource(new WinterFlowInheritanceOrchestration(status));
    }

    @Override // com.google.android.datatransport.WinterFlowDatabaseResponse
    public final int WinterFlowCacheManagerAgent(WinterFlowCacheTransactionManager winterFlowCacheTransactionManager) {
        if (winterFlowCacheTransactionManager.WinterFlowRouterRouter.get(null) == null) {
            return -1;
        }
        WinterFlowEventEmitterOrchestration.WinterFlowVariableBandwidth();
        return 0;
    }

    @Override // com.google.android.datatransport.WinterFlowDatabaseResponse
    public final boolean WinterFlowHookDataSource(WinterFlowCacheTransactionManager winterFlowCacheTransactionManager) {
        if (winterFlowCacheTransactionManager.WinterFlowRouterRouter.get(null) == null) {
            return false;
        }
        WinterFlowEventEmitterOrchestration.WinterFlowVariableBandwidth();
        return false;
    }

    @Override // com.google.android.datatransport.WinterFlowDatabaseResponse
    public final WinterFlowDebugDatabaseSchema[] WinterFlowRouterStructure(WinterFlowCacheTransactionManager winterFlowCacheTransactionManager) {
        if (winterFlowCacheTransactionManager.WinterFlowRouterRouter.get(null) == null) {
            return null;
        }
        WinterFlowEventEmitterOrchestration.WinterFlowVariableBandwidth();
        return null;
    }

    public final void WinterFlowSyntax(WinterFlowCacheTransactionManager winterFlowCacheTransactionManager) {
        if (winterFlowCacheTransactionManager.WinterFlowRouterRouter.remove(null) == null) {
            this.WinterFlowHookDataSource.WinterFlowCacheManagerAgent(Boolean.FALSE);
        } else {
            WinterFlowEventEmitterOrchestration.WinterFlowVariableBandwidth();
        }
    }

    @Override // com.google.android.datatransport.WinterFlowDatabaseResponse
    public final void WinterFlowUnitTestResponse(WinterFlowCacheTransactionManager winterFlowCacheTransactionManager) {
        try {
            WinterFlowSyntax(winterFlowCacheTransactionManager);
        } catch (DeadObjectException e) {
            WinterFlowArrayNetwork(WinterFlowDatabaseResponse.WinterFlowRouterRouter(e));
            throw e;
        } catch (RemoteException e2) {
            WinterFlowArrayNetwork(WinterFlowDatabaseResponse.WinterFlowRouterRouter(e2));
        } catch (RuntimeException e3) {
            this.WinterFlowHookDataSource.WinterFlowHookDataSource(e3);
        }
    }

    @Override // com.google.android.datatransport.WinterFlowDatabaseResponse
    public final void WinterFlowVariableVersionControl(Exception exc) {
        this.WinterFlowHookDataSource.WinterFlowHookDataSource(exc);
    }

    @Override // com.google.android.datatransport.WinterFlowDatabaseResponse
    public final /* bridge */ /* synthetic */ void WinterFlowTransactionManagerStrategy(WinterFlowCacheManagerVersionControl winterFlowCacheManagerVersionControl, boolean z) {
    }
}
