package com.adjust.sdk;

import com.android.installreferrer.api.InstallReferrerClient;

/* loaded from: classes.dex */
public final class CatchingFishPagingLibrary implements Runnable {
    public final /* synthetic */ OnAdidReadListener CatchingFishDaggerWebsocket;
    public final /* synthetic */ int CatchingFishReduxKtor;
    public final /* synthetic */ ActivityHandler CatchingFishWorkManager;

    public /* synthetic */ CatchingFishPagingLibrary(ActivityHandler activityHandler, OnAdidReadListener onAdidReadListener, int i) {
        this.CatchingFishReduxKtor = i;
        this.CatchingFishWorkManager = activityHandler;
        this.CatchingFishDaggerWebsocket = onAdidReadListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ActivityState activityState;
        ActivityState activityState2;
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                activityState = this.CatchingFishWorkManager.activityState;
                this.CatchingFishDaggerWebsocket.onAdidRead(activityState.adid);
                break;
            default:
                activityState2 = this.CatchingFishWorkManager.activityState;
                this.CatchingFishDaggerWebsocket.onAdidRead(activityState2.adid);
                break;
        }
    }
}
