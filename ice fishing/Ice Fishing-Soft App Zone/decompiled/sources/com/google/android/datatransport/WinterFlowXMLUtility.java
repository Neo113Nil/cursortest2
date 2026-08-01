package com.google.android.datatransport;

import android.os.Bundle;
import java.util.Arrays;
import java.util.Map;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowXMLUtility implements WinterFlowQueueFramework {
    public final WinterFlowRendererNode WinterFlowArrayNetwork;
    public Bundle WinterFlowCacheManagerAgent;
    public boolean WinterFlowHookDataSource;
    public final WinterFlowAlgorithmArray WinterFlowRouterStructure;

    public WinterFlowXMLUtility(WinterFlowAlgorithmArray winterFlowAlgorithmArray, WinterFlowProviderCacheManager winterFlowProviderCacheManager) {
        winterFlowAlgorithmArray.getClass();
        this.WinterFlowRouterStructure = winterFlowAlgorithmArray;
        this.WinterFlowArrayNetwork = new WinterFlowRendererNode(new WinterFlowAPISystem(17, winterFlowProviderCacheManager));
    }

    public final void WinterFlowHookDataSource() {
        if (this.WinterFlowHookDataSource) {
            return;
        }
        Bundle WinterFlowServiceUtility = this.WinterFlowRouterStructure.WinterFlowServiceUtility("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle WinterFlowOrchestrationSubsystem = WinterFlowManagerRequest.WinterFlowOrchestrationSubsystem((WinterFlowServerPlatform[]) Arrays.copyOf(new WinterFlowServerPlatform[0], 0));
        Bundle bundle = this.WinterFlowCacheManagerAgent;
        if (bundle != null) {
            WinterFlowOrchestrationSubsystem.putAll(bundle);
        }
        if (WinterFlowServiceUtility != null) {
            WinterFlowOrchestrationSubsystem.putAll(WinterFlowServiceUtility);
        }
        this.WinterFlowCacheManagerAgent = WinterFlowOrchestrationSubsystem;
        this.WinterFlowHookDataSource = true;
    }

    @Override // com.google.android.datatransport.WinterFlowQueueFramework
    public final Bundle WinterFlowRouterStructure() {
        Bundle WinterFlowOrchestrationSubsystem = WinterFlowManagerRequest.WinterFlowOrchestrationSubsystem((WinterFlowServerPlatform[]) Arrays.copyOf(new WinterFlowServerPlatform[0], 0));
        Bundle bundle = this.WinterFlowCacheManagerAgent;
        if (bundle != null) {
            WinterFlowOrchestrationSubsystem.putAll(bundle);
        }
        for (Map.Entry entry : ((WinterFlowCompilerFramework) this.WinterFlowArrayNetwork.getValue()).WinterFlowHookDataSource.entrySet()) {
            String str = (String) entry.getKey();
            Bundle WinterFlowRouterStructure = ((WinterFlowTestingRepository) ((WinterFlowOrchestrationMapper) entry.getValue()).WinterFlowHookDataSource.WinterFlowSyntax).WinterFlowRouterStructure();
            if (!WinterFlowRouterStructure.isEmpty()) {
                str.getClass();
                WinterFlowOrchestrationSubsystem.putBundle(str, WinterFlowRouterStructure);
            }
        }
        this.WinterFlowHookDataSource = false;
        return WinterFlowOrchestrationSubsystem;
    }
}
