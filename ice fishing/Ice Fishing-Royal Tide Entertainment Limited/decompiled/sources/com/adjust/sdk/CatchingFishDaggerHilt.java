package com.adjust.sdk;

import android.content.Intent;
import android.net.Uri;

/* loaded from: classes.dex */
public final class CatchingFishDaggerHilt implements Runnable {
    public final /* synthetic */ Intent CatchingFishDaggerWebsocket;
    public final /* synthetic */ Uri CatchingFishReduxKtor;
    public final /* synthetic */ ActivityHandler CatchingFishWorkManager;

    public CatchingFishDaggerHilt(ActivityHandler activityHandler, Intent intent, Uri uri) {
        this.CatchingFishWorkManager = activityHandler;
        this.CatchingFishReduxKtor = uri;
        this.CatchingFishDaggerWebsocket = intent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AdjustConfig adjustConfig;
        AdjustConfig adjustConfig2;
        boolean z;
        AdjustConfig adjustConfig3;
        ActivityHandler activityHandler = this.CatchingFishWorkManager;
        adjustConfig = activityHandler.adjustConfig;
        if (adjustConfig == null) {
            return;
        }
        adjustConfig2 = activityHandler.adjustConfig;
        OnDeferredDeeplinkResponseListener onDeferredDeeplinkResponseListener = adjustConfig2.onDeferredDeeplinkResponseListener;
        Uri uri = this.CatchingFishReduxKtor;
        if (onDeferredDeeplinkResponseListener != null) {
            adjustConfig3 = activityHandler.adjustConfig;
            z = adjustConfig3.onDeferredDeeplinkResponseListener.launchReceivedDeeplink(uri);
        } else {
            z = true;
        }
        if (z) {
            activityHandler.launchDeeplinkMain(this.CatchingFishDaggerWebsocket, uri);
        }
    }
}
