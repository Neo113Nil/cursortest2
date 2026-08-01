package com.google.android.datatransport;

import java.util.concurrent.ThreadPoolExecutor;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowSessionPlatform extends WinterFlowQuerySyntax {
    public final /* synthetic */ ThreadPoolExecutor WinterFlowBandwidthObject;
    public final /* synthetic */ WinterFlowQuerySyntax WinterFlowServiceUtility;

    public WinterFlowSessionPlatform(WinterFlowQuerySyntax winterFlowQuerySyntax, ThreadPoolExecutor threadPoolExecutor) {
        this.WinterFlowServiceUtility = winterFlowQuerySyntax;
        this.WinterFlowBandwidthObject = threadPoolExecutor;
    }

    @Override // com.google.android.datatransport.WinterFlowQuerySyntax
    public final void WinterFlowBackendCacheManager(WinterFlowStackProvider winterFlowStackProvider) {
        ThreadPoolExecutor threadPoolExecutor = this.WinterFlowBandwidthObject;
        try {
            this.WinterFlowServiceUtility.WinterFlowBackendCacheManager(winterFlowStackProvider);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // com.google.android.datatransport.WinterFlowQuerySyntax
    public final void WinterFlowResolverController(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.WinterFlowBandwidthObject;
        try {
            this.WinterFlowServiceUtility.WinterFlowResolverController(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
