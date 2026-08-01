package com.google.android.datatransport;

import android.os.Process;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowDataSourceQuery implements Runnable {
    public final Runnable WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ int WinterFlowVariableVersionControl;

    public /* synthetic */ WinterFlowDataSourceQuery(Runnable runnable, int i) {
        this.WinterFlowVariableVersionControl = i;
        this.WinterFlowTransactionManagerStrategy = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.WinterFlowVariableVersionControl;
        Runnable runnable = this.WinterFlowTransactionManagerStrategy;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                try {
                    runnable.run();
                    break;
                } catch (Exception unused) {
                    WinterFlowServerManager.WinterFlowMapperProtocol("Executor");
                    return;
                }
            case 1:
                runnable.run();
                break;
            default:
                Process.setThreadPriority(0);
                runnable.run();
                break;
        }
    }

    public String toString() {
        switch (this.WinterFlowVariableVersionControl) {
            case 1:
                return this.WinterFlowTransactionManagerStrategy.toString();
            default:
                return super.toString();
        }
    }
}
