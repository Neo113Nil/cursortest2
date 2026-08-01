package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;
import java.io.File;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowQueryRenderer extends WinterFlowDebugFramework implements WinterFlowObjectUI {
    public final /* synthetic */ int WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ WinterFlowStrategyResolver WinterFlowUnitTestResponse;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WinterFlowQueryRenderer(WinterFlowStrategyResolver winterFlowStrategyResolver, int i) {
        super(0);
        this.WinterFlowTransactionManagerStrategy = i;
        this.WinterFlowUnitTestResponse = winterFlowStrategyResolver;
    }

    @Override // com.google.android.datatransport.WinterFlowObjectUI
    public final Object WinterFlowRouterStructure() {
        switch (this.WinterFlowTransactionManagerStrategy) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((WinterFlowCachePlatform) this.WinterFlowUnitTestResponse.WinterFlowServiceUtility.getValue()).WinterFlowHookDataSource;
            default:
                WinterFlowBackendCacheManager winterFlowBackendCacheManager = this.WinterFlowUnitTestResponse.WinterFlowVariableVersionControl;
                File canonicalFile = ((File) winterFlowBackendCacheManager.WinterFlowHookDataSource.WinterFlowRouterStructure()).getCanonicalFile();
                synchronized (WinterFlowBackendCacheManager.WinterFlowArrayNetwork) {
                    String absolutePath = canonicalFile.getAbsolutePath();
                    LinkedHashSet linkedHashSet = WinterFlowBackendCacheManager.WinterFlowCacheManagerAgent;
                    if (linkedHashSet.contains(absolutePath)) {
                        throw new IllegalStateException(("There are multiple DataStores active for the same file: " + absolutePath + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                    }
                    absolutePath.getClass();
                    linkedHashSet.add(absolutePath);
                }
                return new WinterFlowCachePlatform(canonicalFile, (WinterFlowDebugStrategy) winterFlowBackendCacheManager.WinterFlowRouterStructure.WinterFlowUnitTestResponse(canonicalFile), new WinterFlowRouterEngine(3, canonicalFile));
        }
    }
}
