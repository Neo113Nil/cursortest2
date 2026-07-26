package android.content.Context;

import com.android.installreferrer.api.InstallReferrerClient;
import com.frosthunter.arcticwildlands.frozenexpedition.adventure.GeneratorStateActivity;
import java.util.ArrayList;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterJavaMaxThunderLegend3579 implements FrostHunterNotificationGammaBlazePhoenix7595 {
    public final /* synthetic */ int FrostHunterCameraXPixelTurboCosmos9814;
    public final /* synthetic */ Object FrostHunterFlowMaxDragonHero5809;

    public /* synthetic */ FrostHunterJavaMaxThunderLegend3579(int i, Object obj) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = i;
        this.FrostHunterFlowMaxDragonHero5809 = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.content.Context.FrostHunterNotificationGammaBlazePhoenix7595
    public final Object FrostHunterConstraintSetCloneMasterUltraRogue2633() {
        int i = this.FrostHunterCameraXPixelTurboCosmos9814;
        Object obj = this.FrostHunterFlowMaxDragonHero5809;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((GeneratorStateActivity) obj).FrostHunterLevelListDrawableFusionDragonHero2232();
            case 1:
                return ((GeneratorStateActivity) obj).FrostHunterLifecycleBlazeGammaElite2889();
            default:
                ArrayList arrayList = ((FrostHunterMotionEventBetaAuroraStorm8100) obj).FrostHunterAlphaAnimationNeoCosmos5761;
                FrostHunterToastHyperTitanThunder2275 frostHunterToastHyperTitanThunder2275 = new FrostHunterToastHyperTitanThunder2275(arrayList.size());
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    FrostHunterTimerLegendMaster7334 frostHunterTimerLegendMaster7334 = (FrostHunterTimerLegendMaster7334) arrayList.get(i2);
                    Object obj2 = frostHunterTimerLegendMaster7334.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                    int i3 = frostHunterTimerLegendMaster7334.FrostHunterAlphaAnimationNeoCosmos5761;
                    Object frostHunterCombineSparkOmega6357 = obj2 != null ? new FrostHunterCombineSparkOmega6357(Integer.valueOf(i3), frostHunterTimerLegendMaster7334.FrostHunterConstraintSetCloneMasterUltraRogue2633) : Integer.valueOf(i3);
                    int FrostHunterLevelListDrawableFusionDragonHero2232 = frostHunterToastHyperTitanThunder2275.FrostHunterLevelListDrawableFusionDragonHero2232(frostHunterCombineSparkOmega6357);
                    boolean z = FrostHunterLevelListDrawableFusionDragonHero2232 < 0;
                    Object obj3 = z ? null : frostHunterToastHyperTitanThunder2275.FrostHunterBundlePulseFusionHero2475[FrostHunterLevelListDrawableFusionDragonHero2232];
                    if (obj3 != null) {
                        if (obj3 instanceof FrostHunterOrientationSensorPhoenixOmegaStorm9585) {
                            FrostHunterOrientationSensorPhoenixOmegaStorm9585 frostHunterOrientationSensorPhoenixOmegaStorm9585 = (FrostHunterOrientationSensorPhoenixOmegaStorm9585) obj3;
                            frostHunterOrientationSensorPhoenixOmegaStorm9585.FrostHunterAlphaAnimationNeoCosmos5761(frostHunterTimerLegendMaster7334);
                            frostHunterTimerLegendMaster7334 = frostHunterOrientationSensorPhoenixOmegaStorm9585;
                        } else {
                            Object[] objArr = FrostHunterStateOmegaNebulaInferno6382.FrostHunterAlphaAnimationNeoCosmos5761;
                            FrostHunterOrientationSensorPhoenixOmegaStorm9585 frostHunterOrientationSensorPhoenixOmegaStorm95852 = new FrostHunterOrientationSensorPhoenixOmegaStorm9585(2);
                            frostHunterOrientationSensorPhoenixOmegaStorm95852.FrostHunterAlphaAnimationNeoCosmos5761(obj3);
                            frostHunterOrientationSensorPhoenixOmegaStorm95852.FrostHunterAlphaAnimationNeoCosmos5761(frostHunterTimerLegendMaster7334);
                            frostHunterTimerLegendMaster7334 = frostHunterOrientationSensorPhoenixOmegaStorm95852;
                        }
                    }
                    if (z) {
                        int i4 = ~FrostHunterLevelListDrawableFusionDragonHero2232;
                        frostHunterToastHyperTitanThunder2275.FrostHunterConstraintSetCloneMasterUltraRogue2633[i4] = frostHunterCombineSparkOmega6357;
                        frostHunterToastHyperTitanThunder2275.FrostHunterBundlePulseFusionHero2475[i4] = frostHunterTimerLegendMaster7334;
                    } else {
                        frostHunterToastHyperTitanThunder2275.FrostHunterBundlePulseFusionHero2475[FrostHunterLevelListDrawableFusionDragonHero2232] = frostHunterTimerLegendMaster7334;
                    }
                }
                return new FrostHunterRealtimeDatabaseSparkPhoenix3709(frostHunterToastHyperTitanThunder2275);
        }
    }
}
