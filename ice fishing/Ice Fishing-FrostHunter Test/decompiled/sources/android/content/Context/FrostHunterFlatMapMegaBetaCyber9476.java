package android.content.Context;

import android.graphics.Point;
import com.frosthunter.arcticwildlands.frozenexpedition.adventure.GlassNewActivity;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterFlatMapMegaBetaCyber9476 extends FrostHunterContentProviderHyperMega3194 {
    public final GlassNewActivity FrostHunterLightSensorForceFusion4241;
    public final int FrostHunterScaleAnimationStrikeSpark5059;

    public FrostHunterFlatMapMegaBetaCyber9476(GlassNewActivity glassNewActivity) {
        super(new FrostHunterAsyncTaskPrimeGammaTitan9007[1], new FrostHunterVibratorTitaniumInferno8201[1]);
        this.FrostHunterLightSensorForceFusion4241 = glassNewActivity;
        this.FrostHunterScaleAnimationStrikeSpark5059 = -1;
    }

    @Override // android.content.Context.FrostHunterContentProviderHyperMega3194
    public final FrostHunterCrashlyticsNebulaQuantumCelestial2147 FrostHunterAlertDialogAuroraDelta3200(FrostHunterAsyncTaskPrimeGammaTitan9007 frostHunterAsyncTaskPrimeGammaTitan9007, FrostHunterBannerAdDeltaQuantum3481 frostHunterBannerAdDeltaQuantum3481, boolean z) {
        FrostHunterVibratorTitaniumInferno8201 frostHunterVibratorTitaniumInferno8201 = (FrostHunterVibratorTitaniumInferno8201) frostHunterBannerAdDeltaQuantum3481;
        ByteBuffer byteBuffer = frostHunterAsyncTaskPrimeGammaTitan9007.FrostHunterFragmentBetaMegaVortex6025;
        byteBuffer.getClass();
        FrostHunterCanvasInfernoVortex4700.FrostHunterMeteringPointMegaCyber7955(byteBuffer.hasArray());
        FrostHunterCanvasInfernoVortex4700.FrostHunterResourcesTitanHyperVision5823(byteBuffer.arrayOffset() == 0);
        try {
            int i = this.FrostHunterScaleAnimationStrikeSpark5059;
            if (i == -1) {
                GlassNewActivity glassNewActivity = this.FrostHunterLightSensorForceFusion4241;
                if (glassNewActivity != null) {
                    Point FrostHunterScaleAnimationStrikeSpark5059 = FrostHunterGyroscopeHeroAlpha1995.FrostHunterScaleAnimationStrikeSpark5059(glassNewActivity);
                    int i2 = FrostHunterScaleAnimationStrikeSpark5059.x;
                    int i3 = FrostHunterScaleAnimationStrikeSpark5059.y;
                    FrostHunterFirebaseOlympianMax4818 frostHunterFirebaseOlympianMax4818 = frostHunterAsyncTaskPrimeGammaTitan9007.FrostHunterAlertDialogAuroraDelta3200;
                    if (frostHunterFirebaseOlympianMax4818 != null) {
                        int i4 = frostHunterFirebaseOlympianMax4818.FrostHunterFCMDeltaQuantumHero8364;
                        if (i4 != -1) {
                            i2 *= i4;
                        }
                        int i5 = frostHunterFirebaseOlympianMax4818.FrostHunterRewardedAdMasterStrike9463;
                        if (i5 != -1) {
                            i3 *= i5;
                        }
                    }
                    i = (Math.max(i2, i3) * 2) - 1;
                } else {
                    i = 4096;
                }
            }
            frostHunterVibratorTitaniumInferno8201.FrostHunterFragmentBetaMegaVortex6025 = FrostHunterCardViewHyperionAurora3829.FrostHunterMotionSceneAuroraMega2271(byteBuffer.array(), byteBuffer.remaining(), i);
            frostHunterVibratorTitaniumInferno8201.FrostHunterAlertDialogAuroraDelta3200 = frostHunterAsyncTaskPrimeGammaTitan9007.FrostHunterLightSensorForceFusion4241;
            return null;
        } catch (FrostHunterDiffUtilTurboSpark8131 e) {
            return new FrostHunterInstrumentationMaxPhoenix9560("Could not decode image data with BitmapFactory.", e);
        } catch (IOException e2) {
            return new FrostHunterInstrumentationMaxPhoenix9560(e2);
        }
    }

    @Override // android.content.Context.FrostHunterContentProviderHyperMega3194
    public final FrostHunterBannerAdDeltaQuantum3481 FrostHunterCameraXPixelTurboCosmos9814() {
        return new FrostHunterVibratorTitaniumInferno8201(this);
    }

    @Override // android.content.Context.FrostHunterContentProviderHyperMega3194
    public final FrostHunterCrashlyticsNebulaQuantumCelestial2147 FrostHunterFlowMaxDragonHero5809(Throwable th) {
        return new FrostHunterInstrumentationMaxPhoenix9560("Unexpected decode error", th);
    }

    @Override // android.content.Context.FrostHunterContentProviderHyperMega3194
    public final FrostHunterAsyncTaskPrimeGammaTitan9007 FrostHunterRemoteConfigSpeedSpeed8566() {
        return new FrostHunterAsyncTaskPrimeGammaTitan9007(1);
    }
}
