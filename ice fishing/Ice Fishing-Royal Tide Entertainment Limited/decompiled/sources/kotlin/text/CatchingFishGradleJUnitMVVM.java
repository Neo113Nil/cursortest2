package kotlin.text;

import android.content.Context;
import com.adjust.sdk.ActivityHandler;
import com.adjust.sdk.Constants;
import com.adjust.sdk.ILogger;
import com.adjust.sdk.ReferrerDetails;
import com.adjust.sdk.Reflection;
import com.android.installreferrer.api.InstallReferrerClient;

/* loaded from: classes.dex */
public final class CatchingFishGradleJUnitMVVM implements Runnable {
    public final /* synthetic */ ActivityHandler CatchingFishDaggerWebsocket;
    public final /* synthetic */ int CatchingFishReduxKtor;

    public /* synthetic */ CatchingFishGradleJUnitMVVM(ActivityHandler activityHandler, int i) {
        this.CatchingFishReduxKtor = i;
        this.CatchingFishDaggerWebsocket = activityHandler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ILogger iLogger;
        ILogger iLogger2;
        ILogger iLogger3;
        ILogger iLogger4;
        ILogger iLogger5;
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                this.CatchingFishDaggerWebsocket.gotOptOutResponseI();
                break;
            case 1:
                this.CatchingFishDaggerWebsocket.foregroundTimerFiredI();
                break;
            case 2:
                this.CatchingFishDaggerWebsocket.backgroundTimerFiredI();
                break;
            case 3:
                this.CatchingFishDaggerWebsocket.foregroundTimerFired();
                break;
            case 4:
                this.CatchingFishDaggerWebsocket.backgroundTimerFired();
                break;
            case CatchingFishMoshiSpannable.STRING_FIELD_NUMBER /* 5 */:
                ActivityHandler activityHandler = this.CatchingFishDaggerWebsocket;
                Context context = activityHandler.getContext();
                iLogger = activityHandler.logger;
                ReferrerDetails huaweiAdsReferrer = Reflection.getHuaweiAdsReferrer(context, iLogger);
                if (huaweiAdsReferrer != null) {
                    activityHandler.sendInstallReferrer(huaweiAdsReferrer, Constants.REFERRER_API_HUAWEI_ADS);
                    break;
                }
                break;
            case CatchingFishMoshiSpannable.STRING_SET_FIELD_NUMBER /* 6 */:
                ActivityHandler activityHandler2 = this.CatchingFishDaggerWebsocket;
                Context context2 = activityHandler2.getContext();
                iLogger2 = activityHandler2.logger;
                ReferrerDetails huaweiAppGalleryReferrer = Reflection.getHuaweiAppGalleryReferrer(context2, iLogger2);
                if (huaweiAppGalleryReferrer != null) {
                    activityHandler2.sendInstallReferrer(huaweiAppGalleryReferrer, Constants.REFERRER_API_HUAWEI_APP_GALLERY);
                    break;
                }
                break;
            case CatchingFishMoshiSpannable.DOUBLE_FIELD_NUMBER /* 7 */:
                ActivityHandler activityHandler3 = this.CatchingFishDaggerWebsocket;
                Context context3 = activityHandler3.getContext();
                iLogger3 = activityHandler3.logger;
                ReferrerDetails samsungReferrer = Reflection.getSamsungReferrer(context3, iLogger3);
                if (samsungReferrer != null) {
                    activityHandler3.sendInstallReferrer(samsungReferrer, Constants.REFERRER_API_SAMSUNG);
                    break;
                }
                break;
            case CatchingFishMoshiSpannable.BYTES_FIELD_NUMBER /* 8 */:
                ActivityHandler activityHandler4 = this.CatchingFishDaggerWebsocket;
                Context context4 = activityHandler4.getContext();
                iLogger4 = activityHandler4.logger;
                ReferrerDetails xiaomiReferrer = Reflection.getXiaomiReferrer(context4, iLogger4);
                if (xiaomiReferrer != null) {
                    activityHandler4.sendInstallReferrer(xiaomiReferrer, Constants.REFERRER_API_XIAOMI);
                    break;
                }
                break;
            default:
                ActivityHandler activityHandler5 = this.CatchingFishDaggerWebsocket;
                Context context5 = activityHandler5.getContext();
                iLogger5 = activityHandler5.logger;
                ReferrerDetails vivoReferrer = Reflection.getVivoReferrer(context5, iLogger5);
                if (vivoReferrer != null) {
                    activityHandler5.sendInstallReferrer(vivoReferrer, Constants.REFERRER_API_VIVO);
                    break;
                }
                break;
        }
    }
}
