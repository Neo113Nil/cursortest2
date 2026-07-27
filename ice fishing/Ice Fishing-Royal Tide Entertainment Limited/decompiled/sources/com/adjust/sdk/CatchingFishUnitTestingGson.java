package com.adjust.sdk;

import android.content.Context;
import com.android.installreferrer.api.InstallReferrerClient;

/* loaded from: classes.dex */
public final class CatchingFishUnitTestingGson implements Runnable {
    public final /* synthetic */ ActivityHandler CatchingFishDaggerWebsocket;
    public final /* synthetic */ int CatchingFishReduxKtor;

    public /* synthetic */ CatchingFishUnitTestingGson(ActivityHandler activityHandler, int i) {
        this.CatchingFishReduxKtor = i;
        this.CatchingFishDaggerWebsocket = activityHandler;
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
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ActivityHandler activityHandler = this.CatchingFishDaggerWebsocket;
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
                ActivityHandler activityHandler2 = this.CatchingFishDaggerWebsocket;
                if (!SharedPreferencesManager.getDefaultInstance(activityHandler2.getContext()).getLicenseVerificationTracked()) {
                    Context context2 = activityHandler2.getContext();
                    iLogger2 = activityHandler2.logger;
                    deviceInfo = activityHandler2.deviceInfo;
                    LicenseData licenseRequiredData = Reflection.getLicenseRequiredData(context2, iLogger2, deviceInfo.appInstallTime);
                    if (licenseRequiredData != null) {
                        activityHandler2.sendLicenseVerificationData(licenseRequiredData);
                        break;
                    }
                }
                break;
            default:
                ActivityHandler activityHandler3 = this.CatchingFishDaggerWebsocket;
                adjustConfig2 = activityHandler3.adjustConfig;
                if (adjustConfig2 != null) {
                    adjustConfig3 = activityHandler3.adjustConfig;
                    if (adjustConfig3.onAttributionChangedListener != null) {
                        adjustConfig4 = activityHandler3.adjustConfig;
                        OnAttributionChangedListener onAttributionChangedListener = adjustConfig4.onAttributionChangedListener;
                        adjustAttribution = activityHandler3.attribution;
                        onAttributionChangedListener.onAttributionChanged(adjustAttribution);
                        break;
                    }
                }
                break;
        }
    }
}
