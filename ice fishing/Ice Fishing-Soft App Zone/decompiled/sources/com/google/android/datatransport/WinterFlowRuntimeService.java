package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final /* synthetic */ class WinterFlowRuntimeService implements Executor {
    public static final /* synthetic */ WinterFlowRuntimeService WinterFlowTransactionManagerStrategy = new WinterFlowRuntimeService(0);
    public static final /* synthetic */ WinterFlowRuntimeService WinterFlowUnitTestResponse = new WinterFlowRuntimeService(1);
    public final /* synthetic */ int WinterFlowVariableVersionControl;

    public /* synthetic */ WinterFlowRuntimeService(int i) {
        this.WinterFlowVariableVersionControl = i;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.WinterFlowVariableVersionControl) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                runnable.run();
                break;
            case 1:
                runnable.run();
                break;
            default:
                runnable.run();
                break;
        }
    }
}
