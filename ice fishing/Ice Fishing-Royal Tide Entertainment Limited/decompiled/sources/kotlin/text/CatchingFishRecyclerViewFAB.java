package kotlin.text;

import com.adjust.sdk.ActivityPackage;
import com.adjust.sdk.ILogger;
import com.adjust.sdk.SdkClickHandler;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.List;

/* loaded from: classes.dex */
public final class CatchingFishRecyclerViewFAB implements Runnable {
    public final /* synthetic */ ActivityPackage CatchingFishDaggerWebsocket;
    public final /* synthetic */ int CatchingFishReduxKtor;
    public final /* synthetic */ SdkClickHandler CatchingFishWorkManager;

    public /* synthetic */ CatchingFishRecyclerViewFAB(SdkClickHandler sdkClickHandler, ActivityPackage activityPackage, int i) {
        this.CatchingFishReduxKtor = i;
        this.CatchingFishWorkManager = sdkClickHandler;
        this.CatchingFishDaggerWebsocket = activityPackage;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List list;
        ILogger iLogger;
        List list2;
        ILogger iLogger2;
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                SdkClickHandler sdkClickHandler = this.CatchingFishWorkManager;
                list = sdkClickHandler.packageQueue;
                ActivityPackage activityPackage = this.CatchingFishDaggerWebsocket;
                list.add(activityPackage);
                iLogger = sdkClickHandler.logger;
                list2 = sdkClickHandler.packageQueue;
                iLogger.debug("Added sdk_click %d", Integer.valueOf(list2.size()));
                iLogger2 = sdkClickHandler.logger;
                iLogger2.verbose("%s", activityPackage.getExtendedString());
                sdkClickHandler.sendNextSdkClick();
                break;
            default:
                ActivityPackage activityPackage2 = this.CatchingFishDaggerWebsocket;
                SdkClickHandler sdkClickHandler2 = this.CatchingFishWorkManager;
                sdkClickHandler2.sendSdkClickI(activityPackage2);
                sdkClickHandler2.sendNextSdkClick();
                break;
        }
    }
}
