package androidx.versionedparcelable;

import android.content.Context;
import com.adjust.sdk.ActivityHandler;
import com.adjust.sdk.Constants;
import com.adjust.sdk.ILogger;
import com.adjust.sdk.ReferrerDetails;
import com.adjust.sdk.Reflection;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class XenoGridResolverNormalizationQ82LmpVIMyB6GcoL5a40551883649810 implements Runnable {
    public final /* synthetic */ ActivityHandler LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
    public final /* synthetic */ int RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;

    public /* synthetic */ XenoGridResolverNormalizationQ82LmpVIMyB6GcoL5a40551883649810(ActivityHandler activityHandler, int i) {
        this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = i;
        this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = activityHandler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ILogger iLogger;
        ILogger iLogger2;
        ILogger iLogger3;
        ILogger iLogger4;
        ILogger iLogger5;
        int i = this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
        ActivityHandler activityHandler = this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
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
            case InstallReferrerClient.InstallReferrerResponse.PERMISSION_ERROR /* 4 */:
                activityHandler.backgroundTimerFired();
                break;
            case 5:
                Context context = activityHandler.getContext();
                iLogger = activityHandler.logger;
                ReferrerDetails huaweiAdsReferrer = Reflection.getHuaweiAdsReferrer(context, iLogger);
                if (huaweiAdsReferrer != null) {
                    activityHandler.sendInstallReferrer(huaweiAdsReferrer, Constants.REFERRER_API_HUAWEI_ADS);
                    break;
                }
                break;
            case 6:
                Context context2 = activityHandler.getContext();
                iLogger2 = activityHandler.logger;
                ReferrerDetails huaweiAppGalleryReferrer = Reflection.getHuaweiAppGalleryReferrer(context2, iLogger2);
                if (huaweiAppGalleryReferrer != null) {
                    activityHandler.sendInstallReferrer(huaweiAppGalleryReferrer, Constants.REFERRER_API_HUAWEI_APP_GALLERY);
                    break;
                }
                break;
            case 7:
                Context context3 = activityHandler.getContext();
                iLogger3 = activityHandler.logger;
                ReferrerDetails samsungReferrer = Reflection.getSamsungReferrer(context3, iLogger3);
                if (samsungReferrer != null) {
                    activityHandler.sendInstallReferrer(samsungReferrer, Constants.REFERRER_API_SAMSUNG);
                    break;
                }
                break;
            case 8:
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
