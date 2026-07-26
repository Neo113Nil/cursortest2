package com.adjust.sdk;

import android.content.Intent;
import android.net.Uri;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterFirestoreSparkCosmos6148 implements Runnable {
    public final /* synthetic */ ActivityHandler FrostHunterAlertDialogAuroraDelta3200;
    public final /* synthetic */ Uri FrostHunterCameraXPixelTurboCosmos9814;
    public final /* synthetic */ Intent FrostHunterFlowMaxDragonHero5809;

    public FrostHunterFirestoreSparkCosmos6148(ActivityHandler activityHandler, Intent intent, Uri uri) {
        this.FrostHunterAlertDialogAuroraDelta3200 = activityHandler;
        this.FrostHunterCameraXPixelTurboCosmos9814 = uri;
        this.FrostHunterFlowMaxDragonHero5809 = intent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AdjustConfig adjustConfig;
        AdjustConfig adjustConfig2;
        boolean z;
        AdjustConfig adjustConfig3;
        ActivityHandler activityHandler = this.FrostHunterAlertDialogAuroraDelta3200;
        adjustConfig = activityHandler.adjustConfig;
        if (adjustConfig == null) {
            return;
        }
        adjustConfig2 = activityHandler.adjustConfig;
        OnDeferredDeeplinkResponseListener onDeferredDeeplinkResponseListener = adjustConfig2.onDeferredDeeplinkResponseListener;
        Uri uri = this.FrostHunterCameraXPixelTurboCosmos9814;
        if (onDeferredDeeplinkResponseListener != null) {
            adjustConfig3 = activityHandler.adjustConfig;
            z = adjustConfig3.onDeferredDeeplinkResponseListener.launchReceivedDeeplink(uri);
        } else {
            z = true;
        }
        if (z) {
            activityHandler.launchDeeplinkMain(this.FrostHunterFlowMaxDragonHero5809, uri);
        }
    }
}
