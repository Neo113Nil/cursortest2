package com.google.android.datatransport;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public abstract class WinterFlowDatabaseResponse {
    public final int WinterFlowRouterStructure;

    public WinterFlowDatabaseResponse(int i) {
        this.WinterFlowRouterStructure = i;
    }

    public static Status WinterFlowRouterRouter(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage(), null, null);
    }

    public abstract void WinterFlowArrayNetwork(Status status);

    public abstract int WinterFlowCacheManagerAgent(WinterFlowCacheTransactionManager winterFlowCacheTransactionManager);

    public abstract boolean WinterFlowHookDataSource(WinterFlowCacheTransactionManager winterFlowCacheTransactionManager);

    public abstract WinterFlowDebugDatabaseSchema[] WinterFlowRouterStructure(WinterFlowCacheTransactionManager winterFlowCacheTransactionManager);

    public abstract void WinterFlowTransactionManagerStrategy(WinterFlowCacheManagerVersionControl winterFlowCacheManagerVersionControl, boolean z);

    public abstract void WinterFlowUnitTestResponse(WinterFlowCacheTransactionManager winterFlowCacheTransactionManager);

    public abstract void WinterFlowVariableVersionControl(Exception exc);
}
