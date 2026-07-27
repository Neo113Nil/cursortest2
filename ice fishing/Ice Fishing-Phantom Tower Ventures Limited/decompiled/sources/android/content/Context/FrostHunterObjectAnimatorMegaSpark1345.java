package android.content.Context;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterObjectAnimatorMegaSpark1345 {
    public final /* synthetic */ int FrostHunterAlphaAnimationNeoCosmos5761;
    public final FrostHunterLicensingSpectraPulse8868 FrostHunterBundlePulseFusionHero2475;
    public long FrostHunterCameraXPixelTurboCosmos9814;
    public final FrostHunterPaintFlagsDrawFilterPhantomRogue4543 FrostHunterConstraintSetCloneMasterUltraRogue2633;
    public long FrostHunterFlowMaxDragonHero5809;
    public boolean FrostHunterLevelListDrawableFusionDragonHero2232;
    public boolean FrostHunterLifecycleBlazeGammaElite2889;
    public long FrostHunterRemoteConfigSpeedSpeed8566;
    public boolean FrostHunterServiceEliteCelestialThunder1757;

    public FrostHunterObjectAnimatorMegaSpark1345(int i) {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = i;
        switch (i) {
            case 1:
                this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = new FrostHunterPaintFlagsDrawFilterPhantomRogue4543(0L);
                this.FrostHunterRemoteConfigSpeedSpeed8566 = -9223372036854775807L;
                this.FrostHunterCameraXPixelTurboCosmos9814 = -9223372036854775807L;
                this.FrostHunterFlowMaxDragonHero5809 = -9223372036854775807L;
                this.FrostHunterBundlePulseFusionHero2475 = new FrostHunterLicensingSpectraPulse8868();
                break;
            default:
                this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = new FrostHunterPaintFlagsDrawFilterPhantomRogue4543(0L);
                this.FrostHunterRemoteConfigSpeedSpeed8566 = -9223372036854775807L;
                this.FrostHunterCameraXPixelTurboCosmos9814 = -9223372036854775807L;
                this.FrostHunterFlowMaxDragonHero5809 = -9223372036854775807L;
                this.FrostHunterBundlePulseFusionHero2475 = new FrostHunterLicensingSpectraPulse8868();
                break;
        }
    }

    public static long FrostHunterBundlePulseFusionHero2475(FrostHunterLicensingSpectraPulse8868 frostHunterLicensingSpectraPulse8868) {
        int i = frostHunterLicensingSpectraPulse8868.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        if (frostHunterLicensingSpectraPulse8868.FrostHunterAlphaAnimationNeoCosmos5761() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        frostHunterLicensingSpectraPulse8868.FrostHunterKeyframeGammaGamma1197(bArr, 0, 9);
        frostHunterLicensingSpectraPulse8868.FrostHunterR8MasterNebulaSpark7247(i);
        byte b = bArr[0];
        if ((b & 196) == 68) {
            byte b2 = bArr[2];
            if ((b2 & 4) == 4) {
                byte b3 = bArr[4];
                if ((b3 & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
                    long j = b;
                    long j2 = b2;
                    return ((j2 & 3) << 13) | ((j & 3) << 28) | (((56 & j) >> 3) << 30) | ((bArr[1] & 255) << 20) | (((j2 & 248) >> 3) << 15) | ((bArr[3] & 255) << 5) | ((b3 & 248) >> 3);
                }
            }
        }
        return -9223372036854775807L;
    }

    public static int FrostHunterConstraintSetCloneMasterUltraRogue2633(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    public final void FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterPreviewNeoBeta3393 frostHunterPreviewNeoBeta3393) {
        int i = this.FrostHunterAlphaAnimationNeoCosmos5761;
        FrostHunterLicensingSpectraPulse8868 frostHunterLicensingSpectraPulse8868 = this.FrostHunterBundlePulseFusionHero2475;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                byte[] bArr = FrostHunterGyroscopeHeroAlpha1995.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                frostHunterLicensingSpectraPulse8868.getClass();
                frostHunterLicensingSpectraPulse8868.FrostHunterMagnetometerFusionTitanium8202(bArr, bArr.length);
                this.FrostHunterServiceEliteCelestialThunder1757 = true;
                frostHunterPreviewNeoBeta3393.FrostHunterFlowMaxDragonHero5809();
                break;
            default:
                byte[] bArr2 = FrostHunterGyroscopeHeroAlpha1995.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                frostHunterLicensingSpectraPulse8868.getClass();
                frostHunterLicensingSpectraPulse8868.FrostHunterMagnetometerFusionTitanium8202(bArr2, bArr2.length);
                this.FrostHunterServiceEliteCelestialThunder1757 = true;
                frostHunterPreviewNeoBeta3393.FrostHunterFlowMaxDragonHero5809();
                break;
        }
    }
}
