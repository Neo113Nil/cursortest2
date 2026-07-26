package android.content.Context;

import com.android.installreferrer.api.InstallReferrerClient;
import com.google.firebase.messaging.FirebaseMessaging;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final /* synthetic */ class FrostHunterTimerGammaRogueThunder1720 implements FrostHunterLocationManagerHeroPhoenixTitanium9045 {
    public final /* synthetic */ int FrostHunterCameraXPixelTurboCosmos9814;
    public final /* synthetic */ FirebaseMessaging FrostHunterFlowMaxDragonHero5809;

    public /* synthetic */ FrostHunterTimerGammaRogueThunder1720(FirebaseMessaging firebaseMessaging, int i) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = i;
        this.FrostHunterFlowMaxDragonHero5809 = firebaseMessaging;
    }

    @Override // android.content.Context.FrostHunterLocationManagerHeroPhoenixTitanium9045
    public final void FrostHunterConstraintSetCloneMasterUltraRogue2633(Object obj) {
        boolean z;
        int i = this.FrostHunterCameraXPixelTurboCosmos9814;
        FirebaseMessaging firebaseMessaging = this.FrostHunterFlowMaxDragonHero5809;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                FrostHunterFirestoreVisionForce1922 frostHunterFirestoreVisionForce1922 = (FrostHunterFirestoreVisionForce1922) obj;
                if (!firebaseMessaging.FrostHunterLifecycleBlazeGammaElite2889.FrostHunterLevelListDrawableFusionDragonHero2232() || frostHunterFirestoreVisionForce1922.FrostHunterCameraXPixelTurboCosmos9814.FrostHunterAlphaAnimationNeoCosmos5761() == null) {
                    return;
                }
                synchronized (frostHunterFirestoreVisionForce1922) {
                    z = frostHunterFirestoreVisionForce1922.FrostHunterRemoteConfigSpeedSpeed8566;
                }
                if (z) {
                    return;
                }
                frostHunterFirestoreVisionForce1922.FrostHunterLevelListDrawableFusionDragonHero2232(0L);
                return;
            default:
                FrostHunterDigitalInkRecognitionAuroraUltra6822 frostHunterDigitalInkRecognitionAuroraUltra6822 = (FrostHunterDigitalInkRecognitionAuroraUltra6822) obj;
                if (frostHunterDigitalInkRecognitionAuroraUltra6822 != null) {
                    FrostHunterCardViewHyperionAurora3829.FrostHunterRewardedAdMasterStrike9463(frostHunterDigitalInkRecognitionAuroraUltra6822.FrostHunterCameraXPixelTurboCosmos9814);
                    firebaseMessaging.FrostHunterLifecycleBlazeGammaElite2889();
                    return;
                }
                return;
        }
    }
}
