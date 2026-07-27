package com.adjust.sdk;

import android.content.Context;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class JadeCircuitSchedulerCompressionYXYHvpPIby7qI1Smme42614025685565 implements Runnable {
    public final /* synthetic */ ActivityHandler LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
    public final /* synthetic */ int RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;

    public /* synthetic */ JadeCircuitSchedulerCompressionYXYHvpPIby7qI1Smme42614025685565(ActivityHandler activityHandler, int i) {
        this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = i;
        this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = activityHandler;
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
        int i = this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
        ActivityHandler activityHandler = this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
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
            default:
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
        }
    }
}
