package com.google.android.datatransport;

import android.content.Context;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Iterator;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final /* synthetic */ class WinterFlowDataSourceCloud implements WinterFlowObjectUI {
    public final /* synthetic */ WinterFlowProtocolManager WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ int WinterFlowVariableVersionControl;

    public /* synthetic */ WinterFlowDataSourceCloud(WinterFlowProtocolManager winterFlowProtocolManager, int i) {
        this.WinterFlowVariableVersionControl = i;
        this.WinterFlowTransactionManagerStrategy = winterFlowProtocolManager;
    }

    @Override // com.google.android.datatransport.WinterFlowObjectUI
    public final Object WinterFlowRouterStructure() {
        int i;
        int i2 = this.WinterFlowVariableVersionControl;
        WinterFlowAlgorithmSession winterFlowAlgorithmSession = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
        WinterFlowProtocolManager winterFlowProtocolManager = this.WinterFlowTransactionManagerStrategy;
        switch (i2) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                WinterFlowQueueComponent winterFlowQueueComponent = winterFlowProtocolManager.WinterFlowTransactionManagerStrategy;
                boolean z = false;
                if (winterFlowProtocolManager.WinterFlowUnitTestResponse) {
                    WinterFlowOrchestrationValidator winterFlowOrchestrationValidator = winterFlowProtocolManager.WinterFlowHookDataSource.WinterFlowTransactionManagerStrategy;
                    if (winterFlowOrchestrationValidator == null || !winterFlowOrchestrationValidator.isEmpty()) {
                        Iterator it = winterFlowOrchestrationValidator.iterator();
                        i = 0;
                        while (it.hasNext()) {
                            if (!(((WinterFlowLibrarySessionManager) it.next()).WinterFlowTransactionManagerStrategy instanceof WinterFlowSerializerMicroservice) && (i = i + 1) < 0) {
                                throw new ArithmeticException("Count overflow has happened.");
                            }
                        }
                    } else {
                        i = 0;
                    }
                    if (i > 1) {
                        z = true;
                    }
                }
                winterFlowQueueComponent.WinterFlowArrayNetwork(z);
                return winterFlowAlgorithmSession;
            case 1:
                Context context = winterFlowProtocolManager.WinterFlowRouterStructure;
                WinterFlowRouterTesting winterFlowRouterTesting = winterFlowProtocolManager.WinterFlowHookDataSource.WinterFlowVariableBandwidth;
                context.getClass();
                winterFlowRouterTesting.getClass();
                return new WinterFlowIDELayer();
            case 2:
                if (winterFlowProtocolManager.WinterFlowRouterStructure() != null) {
                    winterFlowProtocolManager.WinterFlowHookDataSource();
                }
                return winterFlowAlgorithmSession;
            case 3:
                if (winterFlowProtocolManager.WinterFlowRouterStructure() != null) {
                    winterFlowProtocolManager.WinterFlowHookDataSource();
                }
                return winterFlowAlgorithmSession;
            case 4:
                if (winterFlowProtocolManager.WinterFlowRouterStructure() != null) {
                    winterFlowProtocolManager.WinterFlowHookDataSource();
                }
                return winterFlowAlgorithmSession;
            default:
                if (winterFlowProtocolManager.WinterFlowRouterStructure() != null) {
                    winterFlowProtocolManager.WinterFlowHookDataSource();
                }
                return winterFlowAlgorithmSession;
        }
    }
}
