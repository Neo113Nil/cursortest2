package com.google.android.datatransport;

import java.util.Collections;
import java.util.HashSet;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowProxySubsystem {
    public int WinterFlowArrayNetwork;
    public final HashSet WinterFlowCacheManagerAgent;
    public final HashSet WinterFlowHookDataSource;
    public String WinterFlowRouterStructure = null;
    public WinterFlowInterfaceScript WinterFlowTransactionManagerStrategy;
    public final HashSet WinterFlowUnitTestResponse;
    public final int WinterFlowVariableVersionControl;

    public WinterFlowProxySubsystem(Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        this.WinterFlowHookDataSource = hashSet;
        this.WinterFlowCacheManagerAgent = new HashSet();
        this.WinterFlowArrayNetwork = 0;
        this.WinterFlowVariableVersionControl = 0;
        this.WinterFlowUnitTestResponse = new HashSet();
        hashSet.add(WinterFlowValidatorProcess.WinterFlowRouterStructure(cls));
        for (Class cls2 : clsArr) {
            WinterFlowInvokerComponent.WinterFlowServiceUtility(cls2, "Null interface");
            this.WinterFlowHookDataSource.add(WinterFlowValidatorProcess.WinterFlowRouterStructure(cls2));
        }
    }

    public final WinterFlowQueueManager WinterFlowHookDataSource() {
        if (this.WinterFlowTransactionManagerStrategy != null) {
            return new WinterFlowQueueManager(this.WinterFlowRouterStructure, new HashSet(this.WinterFlowHookDataSource), new HashSet(this.WinterFlowCacheManagerAgent), this.WinterFlowArrayNetwork, this.WinterFlowVariableVersionControl, this.WinterFlowTransactionManagerStrategy, this.WinterFlowUnitTestResponse);
        }
        WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("Missing required property: factory.");
        return null;
    }

    public final void WinterFlowRouterStructure(WinterFlowOrchestrationConcurrency winterFlowOrchestrationConcurrency) {
        if (this.WinterFlowHookDataSource.contains(winterFlowOrchestrationConcurrency.WinterFlowRouterStructure)) {
            WinterFlowEventEmitterOrchestration.WinterFlowBandwidthObject("Components are not allowed to depend on interfaces they themselves provide.");
        } else {
            this.WinterFlowCacheManagerAgent.add(winterFlowOrchestrationConcurrency);
        }
    }

    public WinterFlowProxySubsystem(WinterFlowValidatorProcess winterFlowValidatorProcess, WinterFlowValidatorProcess... winterFlowValidatorProcessArr) {
        HashSet hashSet = new HashSet();
        this.WinterFlowHookDataSource = hashSet;
        this.WinterFlowCacheManagerAgent = new HashSet();
        this.WinterFlowArrayNetwork = 0;
        this.WinterFlowVariableVersionControl = 0;
        this.WinterFlowUnitTestResponse = new HashSet();
        hashSet.add(winterFlowValidatorProcess);
        for (WinterFlowValidatorProcess winterFlowValidatorProcess2 : winterFlowValidatorProcessArr) {
            WinterFlowInvokerComponent.WinterFlowServiceUtility(winterFlowValidatorProcess2, "Null interface");
        }
        Collections.addAll(this.WinterFlowHookDataSource, winterFlowValidatorProcessArr);
    }
}
