package com.google.android.datatransport;

import android.content.Context;
import com.adjust.sdk.ActivityHandler;
import com.adjust.sdk.Constants;
import com.adjust.sdk.ILogger;
import com.adjust.sdk.ReferrerDetails;
import com.adjust.sdk.Reflection;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowTestingBackend implements Runnable {
    public final /* synthetic */ ActivityHandler WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ int WinterFlowVariableVersionControl;

    public /* synthetic */ WinterFlowTestingBackend(ActivityHandler activityHandler, int i) {
        this.WinterFlowVariableVersionControl = i;
        this.WinterFlowTransactionManagerStrategy = activityHandler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ILogger iLogger;
        ILogger iLogger2;
        ILogger iLogger3;
        ILogger iLogger4;
        ILogger iLogger5;
        int i = this.WinterFlowVariableVersionControl;
        ActivityHandler activityHandler = this.WinterFlowTransactionManagerStrategy;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                activityHandler.gotOptOutResponseI();
                break;
            case 1:
                activityHandler.foregroundTimerFiredI();
                break;
            case 2:
                activityHandler.backgroundTimerFiredI();
                break;
            case 3:
                activityHandler.foregroundTimerFired();
                break;
            case 4:
                activityHandler.backgroundTimerFired();
                break;
            case WinterFlowJSONLibrary.STRING_FIELD_NUMBER /* 5 */:
                Context context = activityHandler.getContext();
                iLogger = activityHandler.logger;
                ReferrerDetails huaweiAdsReferrer = Reflection.getHuaweiAdsReferrer(context, iLogger);
                if (huaweiAdsReferrer != null) {
                    activityHandler.sendInstallReferrer(huaweiAdsReferrer, Constants.REFERRER_API_HUAWEI_ADS);
                    break;
                }
                break;
            case WinterFlowJSONLibrary.STRING_SET_FIELD_NUMBER /* 6 */:
                Context context2 = activityHandler.getContext();
                iLogger2 = activityHandler.logger;
                ReferrerDetails huaweiAppGalleryReferrer = Reflection.getHuaweiAppGalleryReferrer(context2, iLogger2);
                if (huaweiAppGalleryReferrer != null) {
                    activityHandler.sendInstallReferrer(huaweiAppGalleryReferrer, Constants.REFERRER_API_HUAWEI_APP_GALLERY);
                    break;
                }
                break;
            case WinterFlowJSONLibrary.DOUBLE_FIELD_NUMBER /* 7 */:
                Context context3 = activityHandler.getContext();
                iLogger3 = activityHandler.logger;
                ReferrerDetails samsungReferrer = Reflection.getSamsungReferrer(context3, iLogger3);
                if (samsungReferrer != null) {
                    activityHandler.sendInstallReferrer(samsungReferrer, Constants.REFERRER_API_SAMSUNG);
                    break;
                }
                break;
            case WinterFlowJSONLibrary.BYTES_FIELD_NUMBER /* 8 */:
                Context context4 = activityHandler.getContext();
                iLogger4 = activityHandler.logger;
                ReferrerDetails xiaomiReferrer = Reflection.getXiaomiReferrer(context4, iLogger4);
                if (xiaomiReferrer != null) {
                    activityHandler.sendInstallReferrer(xiaomiReferrer, Constants.REFERRER_API_XIAOMI);
                    break;
                }
                break;
            default:
                Context context5 = activityHandler.getContext();
                iLogger5 = activityHandler.logger;
                ReferrerDetails vivoReferrer = Reflection.getVivoReferrer(context5, iLogger5);
                if (vivoReferrer != null) {
                    activityHandler.sendInstallReferrer(vivoReferrer, Constants.REFERRER_API_VIVO);
                    break;
                }
                break;
        }
    }
}
