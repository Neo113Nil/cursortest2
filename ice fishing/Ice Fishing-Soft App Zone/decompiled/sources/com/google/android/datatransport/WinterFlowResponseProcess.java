package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;
import com.google.firebase.messaging.FirebaseMessaging;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final /* synthetic */ class WinterFlowResponseProcess implements WinterFlowListenerModule {
    public final /* synthetic */ FirebaseMessaging WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ int WinterFlowVariableVersionControl;

    public /* synthetic */ WinterFlowResponseProcess(FirebaseMessaging firebaseMessaging, int i) {
        this.WinterFlowVariableVersionControl = i;
        this.WinterFlowTransactionManagerStrategy = firebaseMessaging;
    }

    @Override // com.google.android.datatransport.WinterFlowListenerModule
    public final void WinterFlowCacheManagerAgent(Object obj) {
        boolean z;
        int i = this.WinterFlowVariableVersionControl;
        FirebaseMessaging firebaseMessaging = this.WinterFlowTransactionManagerStrategy;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                WinterFlowFunctionJSON winterFlowFunctionJSON = (WinterFlowFunctionJSON) obj;
                if (!firebaseMessaging.WinterFlowTransactionManagerStrategy.WinterFlowRouterStructure() || winterFlowFunctionJSON.WinterFlowUnitTestResponse.WinterFlowRouterStructure() == null) {
                    return;
                }
                synchronized (winterFlowFunctionJSON) {
                    z = winterFlowFunctionJSON.WinterFlowTransactionManagerStrategy;
                }
                if (z) {
                    return;
                }
                winterFlowFunctionJSON.WinterFlowCacheManagerAgent(0L);
                return;
            default:
                WinterFlowThreadTransactionManager winterFlowThreadTransactionManager = (WinterFlowThreadTransactionManager) obj;
                if (winterFlowThreadTransactionManager != null) {
                    WinterFlowEncryptionSubsystem.WinterFlowSoftwareEngine(winterFlowThreadTransactionManager.WinterFlowVariableVersionControl);
                    firebaseMessaging.WinterFlowVariableVersionControl();
                    return;
                }
                return;
        }
    }
}
