package com.google.android.datatransport;

import com.adjust.sdk.ActivityHandler;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowQueryWorker implements Runnable {
    public final /* synthetic */ ActivityHandler WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ boolean WinterFlowVariableVersionControl;

    public WinterFlowQueryWorker(ActivityHandler activityHandler, boolean z) {
        this.WinterFlowTransactionManagerStrategy = activityHandler;
        this.WinterFlowVariableVersionControl = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.WinterFlowTransactionManagerStrategy.setAskingAttributionI(this.WinterFlowVariableVersionControl);
    }
}
