package com.google.android.datatransport;

import com.adjust.sdk.ActivityHandler;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final /* synthetic */ class WinterFlowAlgorithmRenderer implements Runnable {
    public final /* synthetic */ ActivityHandler WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ boolean WinterFlowUnitTestResponse;
    public final /* synthetic */ int WinterFlowVariableVersionControl;

    public /* synthetic */ WinterFlowAlgorithmRenderer(ActivityHandler activityHandler, boolean z, int i) {
        this.WinterFlowVariableVersionControl = i;
        this.WinterFlowTransactionManagerStrategy = activityHandler;
        this.WinterFlowUnitTestResponse = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.WinterFlowVariableVersionControl;
        boolean z = this.WinterFlowUnitTestResponse;
        ActivityHandler activityHandler = this.WinterFlowTransactionManagerStrategy;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                activityHandler.lambda$onActivityLifecycle$0(z);
                break;
            case 1:
                activityHandler.lambda$trackMeasurementConsent$39(z);
                break;
            case 2:
                activityHandler.lambda$setCoppaComplianceInDelay$49(z);
                break;
            case 3:
                activityHandler.lambda$setOfflineMode$7(z);
                break;
            case 4:
                activityHandler.lambda$setOfflineMode$8(z);
                break;
            case WinterFlowJSONLibrary.STRING_FIELD_NUMBER /* 5 */:
                activityHandler.lambda$setEnabled$6(z);
                break;
            case WinterFlowJSONLibrary.STRING_SET_FIELD_NUMBER /* 6 */:
                activityHandler.lambda$setPlayStoreKidsComplianceInDelay$50(z);
                break;
            case WinterFlowJSONLibrary.DOUBLE_FIELD_NUMBER /* 7 */:
                activityHandler.lambda$setEnabled$5(z);
                break;
            default:
                activityHandler.lambda$onActivityLifecycle$1(z);
                break;
        }
    }
}
