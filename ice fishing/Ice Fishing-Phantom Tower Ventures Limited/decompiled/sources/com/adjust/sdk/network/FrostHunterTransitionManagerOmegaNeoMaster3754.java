package com.adjust.sdk.network;

import com.adjust.sdk.ActivityPackage;
import com.adjust.sdk.network.IActivityPackageSender;
import java.util.Map;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterTransitionManagerOmegaNeoMaster3754 implements Runnable {
    public final /* synthetic */ Map FrostHunterAlertDialogAuroraDelta3200;
    public final /* synthetic */ IActivityPackageSender.ResponseDataCallbackSubscriber FrostHunterCameraXPixelTurboCosmos9814;
    public final /* synthetic */ ActivityPackage FrostHunterFlowMaxDragonHero5809;
    public final /* synthetic */ ActivityPackageSender FrostHunterKeyframeGammaGamma1197;

    public FrostHunterTransitionManagerOmegaNeoMaster3754(ActivityPackageSender activityPackageSender, IActivityPackageSender.ResponseDataCallbackSubscriber responseDataCallbackSubscriber, ActivityPackage activityPackage, Map map) {
        this.FrostHunterKeyframeGammaGamma1197 = activityPackageSender;
        this.FrostHunterCameraXPixelTurboCosmos9814 = responseDataCallbackSubscriber;
        this.FrostHunterFlowMaxDragonHero5809 = activityPackage;
        this.FrostHunterAlertDialogAuroraDelta3200 = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.FrostHunterCameraXPixelTurboCosmos9814.onResponseDataCallback(this.FrostHunterKeyframeGammaGamma1197.sendActivityPackageSync(this.FrostHunterFlowMaxDragonHero5809, this.FrostHunterAlertDialogAuroraDelta3200));
    }
}
