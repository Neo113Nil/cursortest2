package com.adjust.sdk;

import android.content.Context;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowRouterCompiler implements Runnable {
    public final /* synthetic */ ActivityHandler WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ int WinterFlowVariableVersionControl;

    public /* synthetic */ WinterFlowRouterCompiler(ActivityHandler activityHandler, int i) {
        this.WinterFlowVariableVersionControl = i;
        this.WinterFlowTransactionManagerStrategy = activityHandler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AdjustConfig adjustConfig;
        ILogger iLogger;
        ILogger iLogger2;
        DeviceInfo deviceInfo;
        AdjustConfig adjustConfig2;
        AdjustConfig adjustConfig3;
        AdjustConfig adjustConfig4;
        AdjustAttribution adjustAttribution;
        AdjustConfig adjustConfig5;
        AdjustConfig adjustConfig6;
        AdjustConfig adjustConfig7;
        AdjustThirdPartySharingResult adjustThirdPartySharingResult;
        int i = this.WinterFlowVariableVersionControl;
        ActivityHandler activityHandler = this.WinterFlowTransactionManagerStrategy;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                Context context = activityHandler.getContext();
                adjustConfig = activityHandler.adjustConfig;
                String str = adjustConfig.fbAppId;
                iLogger = activityHandler.logger;
                ReferrerDetails metaReferrer = Reflection.getMetaReferrer(context, str, iLogger);
                if (metaReferrer != null) {
                    activityHandler.sendInstallReferrer(metaReferrer, Constants.REFERRER_API_META);
                    break;
                }
                break;
            case 1:
                if (!SharedPreferencesManager.getDefaultInstance(activityHandler.getContext()).getLicenseVerificationTracked()) {
                    Context context2 = activityHandler.getContext();
                    iLogger2 = activityHandler.logger;
                    deviceInfo = activityHandler.deviceInfo;
                    LicenseData licenseRequiredData = Reflection.getLicenseRequiredData(context2, iLogger2, deviceInfo.appInstallTime);
                    if (licenseRequiredData != null) {
                        activityHandler.sendLicenseVerificationData(licenseRequiredData);
                        break;
                    }
                }
                break;
            case 2:
                adjustConfig2 = activityHandler.adjustConfig;
                if (adjustConfig2 != null) {
                    adjustConfig3 = activityHandler.adjustConfig;
                    if (adjustConfig3.onAttributionChangedListener != null) {
                        adjustConfig4 = activityHandler.adjustConfig;
                        OnAttributionChangedListener onAttributionChangedListener = adjustConfig4.onAttributionChangedListener;
                        adjustAttribution = activityHandler.attribution;
                        onAttributionChangedListener.onAttributionChanged(adjustAttribution);
                        break;
                    }
                }
                break;
            default:
                adjustConfig5 = activityHandler.adjustConfig;
                if (adjustConfig5 != null) {
                    adjustConfig6 = activityHandler.adjustConfig;
                    if (adjustConfig6.onThirdPartySharingSettingsChangedListener != null) {
                        adjustConfig7 = activityHandler.adjustConfig;
                        OnThirdPartySharingSettingsChangedListener onThirdPartySharingSettingsChangedListener = adjustConfig7.onThirdPartySharingSettingsChangedListener;
                        adjustThirdPartySharingResult = activityHandler.thirdPartySharingResult;
                        onThirdPartySharingSettingsChangedListener.onThirdPartySharingSettingsChanged(adjustThirdPartySharingResult);
                        break;
                    }
                }
                break;
        }
    }
}
