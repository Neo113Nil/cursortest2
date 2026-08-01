package com.google.android.datatransport;

import android.os.Build;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final /* synthetic */ class WinterFlowTransactionManagerConsumer implements Runnable {
    public final /* synthetic */ int WinterFlowVariableVersionControl;

    public /* synthetic */ WinterFlowTransactionManagerConsumer(int i) {
        this.WinterFlowVariableVersionControl = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.WinterFlowVariableVersionControl) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                int i = AlarmManagerSchedulerBroadcastReceiver.WinterFlowRouterStructure;
                return;
            default:
                WinterFlowMicroserviceFunction winterFlowMicroserviceFunction = WinterFlowSyntaxTransactionManager.WinterFlowQueryModule;
                synchronized (winterFlowMicroserviceFunction) {
                    try {
                        int i2 = Build.VERSION.SDK_INT;
                        Object[] objArr = winterFlowMicroserviceFunction.WinterFlowRouterStructure;
                        int i3 = winterFlowMicroserviceFunction.WinterFlowHookDataSource;
                        int i4 = 0;
                        if (i2 < 30) {
                            while (i4 < i3) {
                                WinterFlowSyntaxTransactionManager winterFlowSyntaxTransactionManager = (WinterFlowSyntaxTransactionManager) objArr[i4];
                                boolean showLayoutBounds = winterFlowSyntaxTransactionManager.getShowLayoutBounds();
                                Class cls = WinterFlowSyntaxTransactionManager.WinterFlowHandlerConsumer;
                                winterFlowSyntaxTransactionManager.setShowLayoutBounds(WinterFlowManagerRequest.WinterFlowEventEmitterController());
                                if (showLayoutBounds != winterFlowSyntaxTransactionManager.getShowLayoutBounds()) {
                                    winterFlowSyntaxTransactionManager.post(new WinterFlowWorkerDatabaseSchema(winterFlowSyntaxTransactionManager, 2));
                                }
                                i4++;
                            }
                        } else {
                            while (i4 < i3) {
                                WinterFlowSyntaxTransactionManager winterFlowSyntaxTransactionManager2 = (WinterFlowSyntaxTransactionManager) objArr[i4];
                                winterFlowSyntaxTransactionManager2.post(new WinterFlowWorkerDatabaseSchema(winterFlowSyntaxTransactionManager2, 3));
                                i4++;
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }
}
