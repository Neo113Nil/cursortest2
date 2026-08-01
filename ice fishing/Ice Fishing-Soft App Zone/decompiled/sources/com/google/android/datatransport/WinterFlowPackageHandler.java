package com.google.android.datatransport;

import com.adjust.sdk.ActivityPackage;
import com.adjust.sdk.ILogger;
import com.adjust.sdk.SdkClickHandler;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.List;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowPackageHandler implements Runnable {
    public final /* synthetic */ ActivityPackage WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ SdkClickHandler WinterFlowUnitTestResponse;
    public final /* synthetic */ int WinterFlowVariableVersionControl;

    public /* synthetic */ WinterFlowPackageHandler(SdkClickHandler sdkClickHandler, ActivityPackage activityPackage, int i) {
        this.WinterFlowVariableVersionControl = i;
        this.WinterFlowUnitTestResponse = sdkClickHandler;
        this.WinterFlowTransactionManagerStrategy = activityPackage;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List list;
        ILogger iLogger;
        List list2;
        ILogger iLogger2;
        int i = this.WinterFlowVariableVersionControl;
        ActivityPackage activityPackage = this.WinterFlowTransactionManagerStrategy;
        SdkClickHandler sdkClickHandler = this.WinterFlowUnitTestResponse;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                list = sdkClickHandler.packageQueue;
                list.add(activityPackage);
                iLogger = sdkClickHandler.logger;
                list2 = sdkClickHandler.packageQueue;
                iLogger.debug("Added sdk_click %d", Integer.valueOf(list2.size()));
                iLogger2 = sdkClickHandler.logger;
                iLogger2.verbose("%s", activityPackage.getExtendedString());
                sdkClickHandler.sendNextSdkClick();
                break;
            default:
                sdkClickHandler.sendSdkClickI(activityPackage);
                sdkClickHandler.sendNextSdkClick();
                break;
        }
    }
}
