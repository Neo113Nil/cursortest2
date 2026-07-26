package android.content.Context;

import com.adjust.sdk.ActivityHandler;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final /* synthetic */ class FrostHunterJobIntentServiceUltraOlympianNeo1582 implements Runnable {
    public final /* synthetic */ boolean FrostHunterAlertDialogAuroraDelta3200;
    public final /* synthetic */ int FrostHunterCameraXPixelTurboCosmos9814;
    public final /* synthetic */ Object FrostHunterFlowMaxDragonHero5809;

    public /* synthetic */ FrostHunterJobIntentServiceUltraOlympianNeo1582(Object obj, boolean z, int i) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = i;
        this.FrostHunterFlowMaxDragonHero5809 = obj;
        this.FrostHunterAlertDialogAuroraDelta3200 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.FrostHunterCameraXPixelTurboCosmos9814;
        final boolean z = this.FrostHunterAlertDialogAuroraDelta3200;
        Object obj = this.FrostHunterFlowMaxDragonHero5809;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((ActivityHandler) obj).lambda$onActivityLifecycle$0(z);
                break;
            case 1:
                ((ActivityHandler) obj).lambda$trackMeasurementConsent$39(z);
                break;
            case 2:
                ((ActivityHandler) obj).lambda$setCoppaComplianceInDelay$49(z);
                break;
            case 3:
                ((ActivityHandler) obj).lambda$setOfflineMode$7(z);
                break;
            case 4:
                ((ActivityHandler) obj).lambda$setOfflineMode$8(z);
                break;
            case FrostHunterRemoteModelManagerCyberLegend2797.STRING_FIELD_NUMBER /* 5 */:
                ((ActivityHandler) obj).lambda$setEnabled$6(z);
                break;
            case FrostHunterRemoteModelManagerCyberLegend2797.STRING_SET_FIELD_NUMBER /* 6 */:
                ((ActivityHandler) obj).lambda$setPlayStoreKidsComplianceInDelay$50(z);
                break;
            case FrostHunterRemoteModelManagerCyberLegend2797.DOUBLE_FIELD_NUMBER /* 7 */:
                ((ActivityHandler) obj).lambda$setEnabled$5(z);
                break;
            case FrostHunterRemoteModelManagerCyberLegend2797.BYTES_FIELD_NUMBER /* 8 */:
                ((ActivityHandler) obj).lambda$onActivityLifecycle$1(z);
                break;
            default:
                FrostHunterProcessCameraProviderQuantumNovaXHyperion4894 frostHunterProcessCameraProviderQuantumNovaXHyperion4894 = ((FrostHunterStorageDeltaInferno9007) obj).FrostHunterConstraintSetCloneMasterUltraRogue2633;
                String str = FrostHunterGyroscopeHeroAlpha1995.FrostHunterAlphaAnimationNeoCosmos5761;
                FrostHunterThreadSpectraShadowGamma2307 frostHunterThreadSpectraShadowGamma2307 = frostHunterProcessCameraProviderQuantumNovaXHyperion4894.FrostHunterAlphaAnimationNeoCosmos5761;
                if (frostHunterThreadSpectraShadowGamma2307.FrostHunterConstraintSetCloneOmegaHyperion9304 != z) {
                    frostHunterThreadSpectraShadowGamma2307.FrostHunterConstraintSetCloneOmegaHyperion9304 = z;
                    frostHunterThreadSpectraShadowGamma2307.FrostHunterFragmentBetaMegaVortex6025.FrostHunterLifecycleBlazeGammaElite2889(23, new FrostHunterApplicationInfoHeroForceSpark2431() { // from class: android.content.Context.FrostHunterRunnableAlphaAlpha7611
                        @Override // android.content.Context.FrostHunterApplicationInfoHeroForceSpark2431
                        public final void FrostHunterAlphaAnimationNeoCosmos5761(Object obj2) {
                            ((FrostHunterHandlerStrikeNova5644) obj2).FrostHunterFlowMaxDragonHero5809(z);
                        }
                    });
                    break;
                }
                break;
        }
    }
}
