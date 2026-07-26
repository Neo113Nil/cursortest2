package android.content.Context;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final /* synthetic */ class FrostHunterOnDeviceTranslatorTurboTitanium1451 implements FrostHunterFontFamilyNeoBetaEpic8574 {
    public final /* synthetic */ FrostHunterVibratorMegaNovaX1236 FrostHunterAlertDialogAuroraDelta3200;
    public final /* synthetic */ int FrostHunterCameraXPixelTurboCosmos9814 = 1;
    public final /* synthetic */ FrostHunterConstraintLayoutBetaAlphaNebula8582 FrostHunterFlowMaxDragonHero5809;
    public final /* synthetic */ FrostHunterVibratorMegaNovaX1236 FrostHunterFragmentBetaMegaVortex6025;
    public final /* synthetic */ FrostHunterVibratorMegaNovaX1236 FrostHunterKeyframeGammaGamma1197;

    public /* synthetic */ FrostHunterOnDeviceTranslatorTurboTitanium1451(FrostHunterConstraintLayoutBetaAlphaNebula8582 frostHunterConstraintLayoutBetaAlphaNebula8582, FrostHunterVibratorMegaNovaX1236 frostHunterVibratorMegaNovaX1236, FrostHunterVibratorMegaNovaX1236 frostHunterVibratorMegaNovaX12362, FrostHunterVibratorMegaNovaX1236 frostHunterVibratorMegaNovaX12363) {
        this.FrostHunterFlowMaxDragonHero5809 = frostHunterConstraintLayoutBetaAlphaNebula8582;
        this.FrostHunterAlertDialogAuroraDelta3200 = frostHunterVibratorMegaNovaX1236;
        this.FrostHunterKeyframeGammaGamma1197 = frostHunterVibratorMegaNovaX12362;
        this.FrostHunterFragmentBetaMegaVortex6025 = frostHunterVibratorMegaNovaX12363;
    }

    @Override // android.content.Context.FrostHunterFontFamilyNeoBetaEpic8574
    public final Object FrostHunterCameraXPixelTurboCosmos9814(Object obj, Object obj2) {
        int i = this.FrostHunterCameraXPixelTurboCosmos9814;
        FrostHunterLinearLayoutSolarHero7990 frostHunterLinearLayoutSolarHero7990 = FrostHunterLinearLayoutSolarHero7990.FrostHunterAlphaAnimationNeoCosmos5761;
        FrostHunterVibratorMegaNovaX1236 frostHunterVibratorMegaNovaX1236 = this.FrostHunterFragmentBetaMegaVortex6025;
        FrostHunterVibratorMegaNovaX1236 frostHunterVibratorMegaNovaX12362 = this.FrostHunterKeyframeGammaGamma1197;
        FrostHunterVibratorMegaNovaX1236 frostHunterVibratorMegaNovaX12363 = this.FrostHunterAlertDialogAuroraDelta3200;
        FrostHunterConstraintLayoutBetaAlphaNebula8582 frostHunterConstraintLayoutBetaAlphaNebula8582 = this.FrostHunterFlowMaxDragonHero5809;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                int intValue = ((Integer) obj).intValue();
                long longValue = ((Long) obj2).longValue();
                if (intValue == 1) {
                    if (frostHunterVibratorMegaNovaX12363.FrostHunterCameraXPixelTurboCosmos9814 != null) {
                        FrostHunterVibratorSpectraBetaNovaX4683.FrostHunterFragmentBetaMegaVortex6025("bad zip: NTFS extra attribute tag 0x0001 repeated");
                        break;
                    } else if (longValue != 24) {
                        FrostHunterVibratorSpectraBetaNovaX4683.FrostHunterFragmentBetaMegaVortex6025("bad zip: NTFS extra attribute tag 0x0001 size != 24");
                        break;
                    } else {
                        frostHunterVibratorMegaNovaX12363.FrostHunterCameraXPixelTurboCosmos9814 = Long.valueOf(frostHunterConstraintLayoutBetaAlphaNebula8582.FrostHunterCameraXPixelTurboCosmos9814());
                        frostHunterVibratorMegaNovaX12362.FrostHunterCameraXPixelTurboCosmos9814 = Long.valueOf(frostHunterConstraintLayoutBetaAlphaNebula8582.FrostHunterCameraXPixelTurboCosmos9814());
                        frostHunterVibratorMegaNovaX1236.FrostHunterCameraXPixelTurboCosmos9814 = Long.valueOf(frostHunterConstraintLayoutBetaAlphaNebula8582.FrostHunterCameraXPixelTurboCosmos9814());
                        break;
                    }
                }
                break;
            default:
                int intValue2 = ((Integer) obj).intValue();
                long longValue2 = ((Long) obj2).longValue();
                if (intValue2 == 21589) {
                    if (longValue2 < 1) {
                        FrostHunterVibratorSpectraBetaNovaX4683.FrostHunterFragmentBetaMegaVortex6025("bad zip: extended timestamp extra too short");
                        break;
                    } else {
                        byte readByte = frostHunterConstraintLayoutBetaAlphaNebula8582.readByte();
                        boolean z = (readByte & 1) == 1;
                        boolean z2 = (readByte & 2) == 2;
                        boolean z3 = (readByte & 4) == 4;
                        long j = z ? 5L : 1L;
                        if (z2) {
                            j += 4;
                        }
                        if (z3) {
                            j += 4;
                        }
                        if (longValue2 < j) {
                            FrostHunterVibratorSpectraBetaNovaX4683.FrostHunterFragmentBetaMegaVortex6025("bad zip: extended timestamp extra too short");
                            break;
                        } else {
                            if (z) {
                                frostHunterVibratorMegaNovaX12363.FrostHunterCameraXPixelTurboCosmos9814 = Integer.valueOf(frostHunterConstraintLayoutBetaAlphaNebula8582.FrostHunterLevelListDrawableFusionDragonHero2232());
                            }
                            if (z2) {
                                frostHunterVibratorMegaNovaX12362.FrostHunterCameraXPixelTurboCosmos9814 = Integer.valueOf(frostHunterConstraintLayoutBetaAlphaNebula8582.FrostHunterLevelListDrawableFusionDragonHero2232());
                            }
                            if (z3) {
                                frostHunterVibratorMegaNovaX1236.FrostHunterCameraXPixelTurboCosmos9814 = Integer.valueOf(frostHunterConstraintLayoutBetaAlphaNebula8582.FrostHunterLevelListDrawableFusionDragonHero2232());
                                break;
                            }
                        }
                    }
                }
                break;
        }
        return frostHunterLinearLayoutSolarHero7990;
    }

    public /* synthetic */ FrostHunterOnDeviceTranslatorTurboTitanium1451(FrostHunterVibratorMegaNovaX1236 frostHunterVibratorMegaNovaX1236, FrostHunterConstraintLayoutBetaAlphaNebula8582 frostHunterConstraintLayoutBetaAlphaNebula8582, FrostHunterVibratorMegaNovaX1236 frostHunterVibratorMegaNovaX12362, FrostHunterVibratorMegaNovaX1236 frostHunterVibratorMegaNovaX12363) {
        this.FrostHunterAlertDialogAuroraDelta3200 = frostHunterVibratorMegaNovaX1236;
        this.FrostHunterFlowMaxDragonHero5809 = frostHunterConstraintLayoutBetaAlphaNebula8582;
        this.FrostHunterKeyframeGammaGamma1197 = frostHunterVibratorMegaNovaX12362;
        this.FrostHunterFragmentBetaMegaVortex6025 = frostHunterVibratorMegaNovaX12363;
    }
}
