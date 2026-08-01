package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowViewPackage extends WinterFlowMicroserviceRefactoring {
    public static final /* synthetic */ long WinterFlowResponseEngine = WinterFlowQueueThreadPool.WinterFlowRouterStructure.objectFieldOffset(WinterFlowViewPackage.class.getDeclaredField("_invoked$volatile"));
    public final WinterFlowFrameworkCache WinterFlowSyntax;
    private volatile /* synthetic */ int _invoked$volatile = 0;

    public WinterFlowViewPackage(WinterFlowFrameworkCache winterFlowFrameworkCache) {
        this.WinterFlowSyntax = winterFlowFrameworkCache;
    }

    @Override // com.google.android.datatransport.WinterFlowMicroserviceRefactoring
    public final void WinterFlowServiceUtility(Throwable th) {
        if (WinterFlowQueueThreadPool.WinterFlowRouterStructure.compareAndSwapInt(this, WinterFlowResponseEngine, 0, 1)) {
            this.WinterFlowSyntax.WinterFlowUnitTestResponse(th);
        }
    }

    @Override // com.google.android.datatransport.WinterFlowMicroserviceRefactoring
    public final boolean WinterFlowThreadListener() {
        return true;
    }
}
