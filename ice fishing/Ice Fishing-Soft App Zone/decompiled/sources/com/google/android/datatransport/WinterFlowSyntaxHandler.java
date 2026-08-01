package com.google.android.datatransport;

import com.adjust.sdk.AdjustFactory;
import com.adjust.sdk.scheduler.SingleThreadCachedScheduler;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowSyntaxHandler implements Runnable {
    public final /* synthetic */ Runnable WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ SingleThreadCachedScheduler WinterFlowUnitTestResponse;
    public final /* synthetic */ long WinterFlowVariableVersionControl;

    public WinterFlowSyntaxHandler(SingleThreadCachedScheduler singleThreadCachedScheduler, long j, Runnable runnable) {
        this.WinterFlowUnitTestResponse = singleThreadCachedScheduler;
        this.WinterFlowVariableVersionControl = j;
        this.WinterFlowTransactionManagerStrategy = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Thread.sleep(this.WinterFlowVariableVersionControl);
        } catch (InterruptedException e) {
            AdjustFactory.getLogger().warn("Sleep delay exception: %s", e.getMessage());
        }
        this.WinterFlowUnitTestResponse.submit(this.WinterFlowTransactionManagerStrategy);
    }
}
