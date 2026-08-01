package com.google.android.datatransport;

import android.os.Trace;
import android.view.MotionEvent;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final /* synthetic */ class WinterFlowWorkerDatabaseSchema implements Runnable {
    public final /* synthetic */ WinterFlowSyntaxTransactionManager WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ int WinterFlowVariableVersionControl;

    public /* synthetic */ WinterFlowWorkerDatabaseSchema(WinterFlowSyntaxTransactionManager winterFlowSyntaxTransactionManager, int i) {
        this.WinterFlowVariableVersionControl = i;
        this.WinterFlowTransactionManagerStrategy = winterFlowSyntaxTransactionManager;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.WinterFlowVariableVersionControl;
        WinterFlowSyntaxTransactionManager winterFlowSyntaxTransactionManager = this.WinterFlowTransactionManagerStrategy;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                WinterFlowOrchestrationValidator winterFlowOrchestrationValidator = winterFlowSyntaxTransactionManager.WinterFlowThreadListener;
                Trace.beginSection("AndroidOwner:outOfFrameExecutor");
                while (!winterFlowOrchestrationValidator.isEmpty()) {
                    try {
                        ((WinterFlowObjectUI) winterFlowOrchestrationValidator.removeLast()).WinterFlowRouterStructure();
                    } finally {
                        Trace.endSection();
                    }
                }
                return;
            case 1:
                winterFlowSyntaxTransactionManager.WinterFlowEncryptionAdapter = false;
                MotionEvent motionEvent = winterFlowSyntaxTransactionManager.WinterFlowFrameworkCacheManager;
                motionEvent.getClass();
                if (motionEvent.getActionMasked() == 10) {
                    winterFlowSyntaxTransactionManager.WinterFlowPackageIDE(motionEvent);
                    return;
                } else {
                    WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("The ACTION_HOVER_EXIT event was not cleared.");
                    return;
                }
            case 2:
                WinterFlowSyntaxTransactionManager.WinterFlowThreadListener(winterFlowSyntaxTransactionManager.getRoot());
                return;
            default:
                WinterFlowSyntaxTransactionManager.WinterFlowThreadListener(winterFlowSyntaxTransactionManager.getRoot());
                return;
        }
    }
}
