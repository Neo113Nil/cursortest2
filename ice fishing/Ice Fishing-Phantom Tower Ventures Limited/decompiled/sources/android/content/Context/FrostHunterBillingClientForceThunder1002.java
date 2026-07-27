package android.content.Context;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterBillingClientForceThunder1002 implements FrostHunterApplicationInfoEclipseSparkDelta6014 {
    public static final FrostHunterResourceUltraUltraLegend1377 FrostHunterLifecycleBlazeGammaElite2889;
    public static final FrostHunterBillingClientForceThunder1002 FrostHunterServiceEliteCelestialThunder1757;
    public final /* synthetic */ int FrostHunterAlphaAnimationNeoCosmos5761;
    public static final FrostHunterBillingClientForceThunder1002 FrostHunterConstraintSetCloneMasterUltraRogue2633 = new FrostHunterBillingClientForceThunder1002(0);
    public static final FrostHunterBillingClientForceThunder1002 FrostHunterBundlePulseFusionHero2475 = new FrostHunterBillingClientForceThunder1002(1);
    public static final FrostHunterBillingClientForceThunder1002 FrostHunterLevelListDrawableFusionDragonHero2232 = new FrostHunterBillingClientForceThunder1002(3);
    public static final FrostHunterBillingClientForceThunder1002 FrostHunterRemoteConfigSpeedSpeed8566 = new FrostHunterBillingClientForceThunder1002(4);

    static {
        int i = 2;
        FrostHunterServiceEliteCelestialThunder1757 = new FrostHunterBillingClientForceThunder1002(i);
        FrostHunterLifecycleBlazeGammaElite2889 = new FrostHunterResourceUltraUltraLegend1377(i);
    }

    public /* synthetic */ FrostHunterBillingClientForceThunder1002(int i) {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = i;
    }

    @Override // android.content.Context.FrostHunterApplicationInfoEclipseSparkDelta6014
    public final FrostHunterInstrumentationPhantomVortex8747 FrostHunterConstraintSetCloneMasterUltraRogue2633(FrostHunterStateFlowCosmosMega1087 frostHunterStateFlowCosmosMega1087, List list, long j) {
        int i = this.FrostHunterAlphaAnimationNeoCosmos5761;
        int i2 = 2;
        FrostHunterLayoutInfernoStrike4529 frostHunterLayoutInfernoStrike4529 = FrostHunterLayoutInfernoStrike4529.FrostHunterCameraXPixelTurboCosmos9814;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                int i3 = 0;
                int i4 = 0;
                for (int i5 = 0; i5 < size; i5++) {
                    FrostHunterClipDrawableMasterVortexEclipse8656 FrostHunterLifecycleBlazeGammaElite28892 = ((FrostHunterDigitalInkRecognitionSpeedMasterVision5998) list.get(i5)).FrostHunterLifecycleBlazeGammaElite2889(j);
                    i3 = Math.max(i3, FrostHunterLifecycleBlazeGammaElite28892.FrostHunterCameraXPixelTurboCosmos9814);
                    i4 = Math.max(i4, FrostHunterLifecycleBlazeGammaElite28892.FrostHunterFlowMaxDragonHero5809);
                    arrayList.add(FrostHunterLifecycleBlazeGammaElite28892);
                }
                if (list.isEmpty()) {
                    i3 = FrostHunterRealtimeDatabaseSpeedMax1344.FrostHunterAlertDialogAuroraDelta3200(j);
                    i4 = FrostHunterRealtimeDatabaseSpeedMax1344.FrostHunterFlowMaxDragonHero5809(j);
                }
                return frostHunterStateFlowCosmosMega1087.FrostHunterPushNotificationStormTitanGamma8999(i3, i4, frostHunterLayoutInfernoStrike4529, new FrostHunterExecutorFusionNebula6739(0, arrayList));
            case 1:
                return frostHunterStateFlowCosmosMega1087.FrostHunterPushNotificationStormTitanGamma8999(FrostHunterRealtimeDatabaseSpeedMax1344.FrostHunterAlertDialogAuroraDelta3200(j), FrostHunterRealtimeDatabaseSpeedMax1344.FrostHunterFlowMaxDragonHero5809(j), frostHunterLayoutInfernoStrike4529, new FrostHunterResourceUltraUltraLegend1377(i2));
            case 2:
                return frostHunterStateFlowCosmosMega1087.FrostHunterPushNotificationStormTitanGamma8999(FrostHunterRealtimeDatabaseSpeedMax1344.FrostHunterCameraXPixelTurboCosmos9814(j), FrostHunterRealtimeDatabaseSpeedMax1344.FrostHunterRemoteConfigSpeedSpeed8566(j), frostHunterLayoutInfernoStrike4529, FrostHunterLifecycleBlazeGammaElite2889);
            case 3:
                return frostHunterStateFlowCosmosMega1087.FrostHunterPushNotificationStormTitanGamma8999(FrostHunterRealtimeDatabaseSpeedMax1344.FrostHunterLevelListDrawableFusionDragonHero2232(j) ? FrostHunterRealtimeDatabaseSpeedMax1344.FrostHunterCameraXPixelTurboCosmos9814(j) : 0, FrostHunterRealtimeDatabaseSpeedMax1344.FrostHunterLifecycleBlazeGammaElite2889(j) ? FrostHunterRealtimeDatabaseSpeedMax1344.FrostHunterRemoteConfigSpeedSpeed8566(j) : 0, frostHunterLayoutInfernoStrike4529, new FrostHunterResourceUltraUltraLegend1377(i2));
            default:
                return frostHunterStateFlowCosmosMega1087.FrostHunterPushNotificationStormTitanGamma8999(FrostHunterRealtimeDatabaseSpeedMax1344.FrostHunterAlertDialogAuroraDelta3200(j), FrostHunterRealtimeDatabaseSpeedMax1344.FrostHunterFlowMaxDragonHero5809(j), frostHunterLayoutInfernoStrike4529, new FrostHunterResourceUltraUltraLegend1377(i2));
        }
    }
}
