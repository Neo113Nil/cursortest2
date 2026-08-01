package com.google.android.datatransport;

import com.icewinter.flow.winter.icecatch.db.AppDatabase_Impl;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowResponseConfiguration {
    public final ReentrantLock WinterFlowArrayNetwork;
    public final LinkedHashMap WinterFlowCacheManagerAgent;
    public final WinterFlowGatewaySession WinterFlowHookDataSource;
    public final AppDatabase_Impl WinterFlowRouterStructure;
    public final WinterFlowDeploymentEngine WinterFlowTransactionManagerStrategy;
    public final Object WinterFlowUnitTestResponse;
    public final WinterFlowDeploymentEngine WinterFlowVariableVersionControl;

    public WinterFlowResponseConfiguration(AppDatabase_Impl appDatabase_Impl, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, String... strArr) {
        this.WinterFlowRouterStructure = appDatabase_Impl;
        WinterFlowGatewaySession winterFlowGatewaySession = new WinterFlowGatewaySession(appDatabase_Impl, linkedHashMap, linkedHashMap2, strArr, appDatabase_Impl.WinterFlowResponseEngine, new WinterFlowFrameworkCache(1, this, WinterFlowResponseConfiguration.class, "notifyInvalidatedObservers", "notifyInvalidatedObservers(Ljava/util/Set;)V", 0, 1));
        this.WinterFlowHookDataSource = winterFlowGatewaySession;
        this.WinterFlowCacheManagerAgent = new LinkedHashMap();
        this.WinterFlowArrayNetwork = new ReentrantLock();
        this.WinterFlowVariableVersionControl = new WinterFlowDeploymentEngine(this, 14);
        this.WinterFlowTransactionManagerStrategy = new WinterFlowDeploymentEngine(this, 15);
        Collections.newSetFromMap(new IdentityHashMap()).getClass();
        this.WinterFlowUnitTestResponse = new Object();
        winterFlowGatewaySession.WinterFlowTransactionAgent = new WinterFlowAPISystem(4, this);
    }
}
