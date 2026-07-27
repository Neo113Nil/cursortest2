package android.content.Context;

import com.adjust.sdk.Adjust;
import com.adjust.sdk.AdjustAttribution;
import com.adjust.sdk.OnAdidReadListener;
import com.adjust.sdk.OnAttributionReadListener;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterObjectDetectionCosmosNebulaEpic8434 extends FrostHunterWindowManagerThunderRogue4733 {
    public final FrostHunterBottomSheetEclipseUltraShadow6009 FrostHunterAlphaAnimationNeoCosmos5761;
    public final Object FrostHunterBundlePulseFusionHero2475;
    public final /* synthetic */ int FrostHunterConstraintSetCloneMasterUltraRogue2633;
    public final FrostHunterLooperShadowNovaXFusion5903 FrostHunterServiceEliteCelestialThunder1757;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FrostHunterObjectDetectionCosmosNebulaEpic8434(FrostHunterRewardedAdHyperStrike1151 frostHunterRewardedAdHyperStrike1151, FrostHunterChipSpeedTitan5326 frostHunterChipSpeedTitan5326, FrostHunterBottomSheetEclipseUltraShadow6009 frostHunterBottomSheetEclipseUltraShadow6009) {
        this(frostHunterChipSpeedTitan5326, frostHunterBottomSheetEclipseUltraShadow6009);
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = 1;
        this.FrostHunterBundlePulseFusionHero2475 = frostHunterRewardedAdHyperStrike1151;
        this.FrostHunterServiceEliteCelestialThunder1757 = FrostHunterFlowTurboOlympian5064.FrostHunterServiceEliteCelestialThunder1757;
    }

    @Override // android.content.Context.FrostHunterNestedScrollViewPulseUltra6683
    public final FrostHunterLooperShadowNovaXFusion5903 FrostHunterAlphaAnimationNeoCosmos5761() {
        switch (this.FrostHunterConstraintSetCloneMasterUltraRogue2633) {
        }
        return (FrostHunterFlowTurboOlympian5064) this.FrostHunterServiceEliteCelestialThunder1757;
    }

    @Override // android.content.Context.FrostHunterWindowManagerThunderRogue4733
    public final void FrostHunterBundlePulseFusionHero2475(FrostHunterPoseDetectionSparkSparkHyper8160 frostHunterPoseDetectionSparkSparkHyper8160, FrostHunterWindowManagerAlphaBeta2474 frostHunterWindowManagerAlphaBeta2474) {
        frostHunterPoseDetectionSparkSparkHyper8160.getClass();
        frostHunterWindowManagerAlphaBeta2474.getClass();
        final FrostHunterMapLegendNova8356 frostHunterMapLegendNova8356 = new FrostHunterMapLegendNova8356(13, frostHunterWindowManagerAlphaBeta2474, this);
        int i = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        Object obj = this.FrostHunterBundlePulseFusionHero2475;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((FrostHunterRippleDrawableBlazeBetaStorm6320) obj).getClass();
                Adjust.getAdid(new OnAdidReadListener() { // from class: android.content.Context.FrostHunterOnGlobalLayoutListenerBlazeSpectraVision2155
                    @Override // com.adjust.sdk.OnAdidReadListener
                    public final void onAdidRead(String str) {
                        FrostHunterMapLegendNova8356.this.FrostHunterAlphaAnimationNeoCosmos5761(str);
                    }
                });
                break;
            default:
                ((FrostHunterRewardedAdHyperStrike1151) obj).getClass();
                Adjust.getAttribution(new OnAttributionReadListener() { // from class: android.content.Context.FrostHunterTransitionManagerNebulaRogue3787
                    @Override // com.adjust.sdk.OnAttributionReadListener
                    public final void onAttributionRead(AdjustAttribution adjustAttribution) {
                        FrostHunterMapLegendNova8356.this.FrostHunterAlphaAnimationNeoCosmos5761(adjustAttribution != null ? adjustAttribution.jsonResponse : null);
                    }
                });
                break;
        }
    }

    public FrostHunterObjectDetectionCosmosNebulaEpic8434(FrostHunterChipSpeedTitan5326 frostHunterChipSpeedTitan5326, FrostHunterBottomSheetEclipseUltraShadow6009 frostHunterBottomSheetEclipseUltraShadow6009) {
        super(frostHunterChipSpeedTitan5326);
        this.FrostHunterAlphaAnimationNeoCosmos5761 = frostHunterBottomSheetEclipseUltraShadow6009;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FrostHunterObjectDetectionCosmosNebulaEpic8434(FrostHunterRippleDrawableBlazeBetaStorm6320 frostHunterRippleDrawableBlazeBetaStorm6320, FrostHunterChipSpeedTitan5326 frostHunterChipSpeedTitan5326, FrostHunterBottomSheetEclipseUltraShadow6009 frostHunterBottomSheetEclipseUltraShadow6009) {
        this(frostHunterChipSpeedTitan5326, frostHunterBottomSheetEclipseUltraShadow6009);
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = 0;
        this.FrostHunterBundlePulseFusionHero2475 = frostHunterRippleDrawableBlazeBetaStorm6320;
        this.FrostHunterServiceEliteCelestialThunder1757 = FrostHunterFlowTurboOlympian5064.FrostHunterConstraintSetCloneMasterUltraRogue2633;
    }
}
