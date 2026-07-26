package android.content.Context;

import android.content.Intent;
import com.android.installreferrer.api.InstallReferrerClient;
import com.frosthunter.arcticwildlands.frozenexpedition.adventure.FrostReceiverActivity;
import com.frosthunter.arcticwildlands.frozenexpedition.adventure.GeneratorStateActivity;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final /* synthetic */ class FrostHunterRewardedAdNeoSpeed8147 extends FrostHunterRippleDrawableNeoTitanium8154 implements FrostHunterCombineLegendMegaPrime5473 {
    public final /* synthetic */ int FrostHunterScaleAnimationStrikeSpark5059;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FrostHunterRewardedAdNeoSpeed8147(int i, Object obj, Class cls, String str, String str2, int i2, int i3, int i4) {
        super(i, obj, cls, str, str2, i2, i3);
        this.FrostHunterScaleAnimationStrikeSpark5059 = i4;
    }

    @Override // android.content.Context.FrostHunterCombineLegendMegaPrime5473
    public final Object FrostHunterAlphaAnimationNeoCosmos5761(Object obj) {
        Object[] objArr;
        Object[] objArr2;
        int i;
        Object value;
        FrostHunterContentProviderTurboPhantomForce4573 frostHunterContentProviderTurboPhantomForce4573;
        Object value2;
        FrostHunterContentProviderTurboPhantomForce4573 frostHunterContentProviderTurboPhantomForce45732;
        Object value3;
        FrostHunterContentProviderTurboPhantomForce4573 frostHunterContentProviderTurboPhantomForce45733;
        int i2 = this.FrostHunterScaleAnimationStrikeSpark5059;
        FrostHunterTraceCelestialVortexSpark6705 frostHunterTraceCelestialVortexSpark6705 = null;
        int i3 = 0;
        FrostHunterLinearLayoutSolarHero7990 frostHunterLinearLayoutSolarHero7990 = FrostHunterLinearLayoutSolarHero7990.FrostHunterAlphaAnimationNeoCosmos5761;
        Object obj2 = this.FrostHunterFlowMaxDragonHero5809;
        switch (i2) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                FrostHunterLiveDataScopePixelCosmos9053 frostHunterLiveDataScopePixelCosmos9053 = (FrostHunterLiveDataScopePixelCosmos9053) obj2;
                FrostHunterTranslateAnimationVisionShadow8082 frostHunterTranslateAnimationVisionShadow8082 = frostHunterLiveDataScopePixelCosmos9053.FrostHunterMediaPlayerCelestialBetaTitan3868;
                if (!booleanValue) {
                    if (frostHunterLiveDataScopePixelCosmos9053.FrostHunterDialogFragmentTurboPhoenixDragon7627 != null) {
                        Object[] objArr3 = frostHunterTranslateAnimationVisionShadow8082.FrostHunterBundlePulseFusionHero2475;
                        long[] jArr = frostHunterTranslateAnimationVisionShadow8082.FrostHunterAlphaAnimationNeoCosmos5761;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i4 = 0;
                            while (true) {
                                long j = jArr[i4];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i5 = 8;
                                    int i6 = 8 - ((~(i4 - length)) >>> 31);
                                    int i7 = 0;
                                    while (i7 < i6) {
                                        if ((255 & j) < 128) {
                                            i = i5;
                                            objArr2 = objArr3;
                                            FrostHunterPaintCyberPulse5979.FrostHunterTranslateAnimationCyberSolarUltra7101(frostHunterLiveDataScopePixelCosmos9053.FrostHunterSharedElementPixelTitan2806(), null, new FrostHunterPagingSourcePhantomPixel7368(frostHunterLiveDataScopePixelCosmos9053, (FrostHunterAssetManagerPhantomAlphaStrike7339) objArr3[(i4 << 3) + i7], frostHunterTraceCelestialVortexSpark6705, i3), 3);
                                        } else {
                                            objArr2 = objArr3;
                                            i = i5;
                                        }
                                        j >>= i;
                                        i7++;
                                        i5 = i;
                                        objArr3 = objArr2;
                                    }
                                    objArr = objArr3;
                                    if (i6 != i5) {
                                    }
                                } else {
                                    objArr = objArr3;
                                }
                                if (i4 != length) {
                                    i4++;
                                    objArr3 = objArr;
                                }
                            }
                        }
                    }
                    frostHunterTranslateAnimationVisionShadow8082.FrostHunterAlphaAnimationNeoCosmos5761();
                    break;
                } else {
                    frostHunterLiveDataScopePixelCosmos9053.FrostHunterRecyclerViewBetaNovaX7224();
                    break;
                }
            case 1:
                String str = (String) obj;
                str.getClass();
                GeneratorStateActivity generatorStateActivity = (GeneratorStateActivity) obj2;
                int i8 = GeneratorStateActivity.FrostHunterBillingClientFusionVortex9008;
                generatorStateActivity.getClass();
                generatorStateActivity.startActivity(new Intent(generatorStateActivity, (Class<?>) FrostReceiverActivity.class).putExtra("receiverGameInfoTag", str));
                generatorStateActivity.finish();
                break;
            case 2:
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                FrostHunterPreviewPixelBetaQuantum7840 frostHunterPreviewPixelBetaQuantum7840 = ((FrostHunterSurfaceViewPulseSpectraStorm4437) obj2).FrostHunterBundlePulseFusionHero2475;
                do {
                    value = frostHunterPreviewPixelBetaQuantum7840.getValue();
                    frostHunterContentProviderTurboPhantomForce4573 = (FrostHunterContentProviderTurboPhantomForce4573) value;
                } while (!frostHunterPreviewPixelBetaQuantum7840.FrostHunterRemoteConfigSpeedSpeed8566(value, FrostHunterContentProviderTurboPhantomForce4573.FrostHunterAlphaAnimationNeoCosmos5761(frostHunterContentProviderTurboPhantomForce4573, null, FrostHunterInputMethodManagerQuantumSpeedMaster8897.FrostHunterAlphaAnimationNeoCosmos5761(frostHunterContentProviderTurboPhantomForce4573.FrostHunterConstraintSetCloneMasterUltraRogue2633, booleanValue2, false, false, 6), 1)));
            case 3:
                boolean booleanValue3 = ((Boolean) obj).booleanValue();
                FrostHunterPreviewPixelBetaQuantum7840 frostHunterPreviewPixelBetaQuantum78402 = ((FrostHunterSurfaceViewPulseSpectraStorm4437) obj2).FrostHunterBundlePulseFusionHero2475;
                do {
                    value2 = frostHunterPreviewPixelBetaQuantum78402.getValue();
                    frostHunterContentProviderTurboPhantomForce45732 = (FrostHunterContentProviderTurboPhantomForce4573) value2;
                } while (!frostHunterPreviewPixelBetaQuantum78402.FrostHunterRemoteConfigSpeedSpeed8566(value2, FrostHunterContentProviderTurboPhantomForce4573.FrostHunterAlphaAnimationNeoCosmos5761(frostHunterContentProviderTurboPhantomForce45732, null, FrostHunterInputMethodManagerQuantumSpeedMaster8897.FrostHunterAlphaAnimationNeoCosmos5761(frostHunterContentProviderTurboPhantomForce45732.FrostHunterConstraintSetCloneMasterUltraRogue2633, false, booleanValue3, false, 5), 1)));
            case 4:
                boolean booleanValue4 = ((Boolean) obj).booleanValue();
                FrostHunterPreviewPixelBetaQuantum7840 frostHunterPreviewPixelBetaQuantum78403 = ((FrostHunterSurfaceViewPulseSpectraStorm4437) obj2).FrostHunterBundlePulseFusionHero2475;
                do {
                    value3 = frostHunterPreviewPixelBetaQuantum78403.getValue();
                    frostHunterContentProviderTurboPhantomForce45733 = (FrostHunterContentProviderTurboPhantomForce4573) value3;
                } while (!frostHunterPreviewPixelBetaQuantum78403.FrostHunterRemoteConfigSpeedSpeed8566(value3, FrostHunterContentProviderTurboPhantomForce4573.FrostHunterAlphaAnimationNeoCosmos5761(frostHunterContentProviderTurboPhantomForce45733, null, FrostHunterInputMethodManagerQuantumSpeedMaster8897.FrostHunterAlphaAnimationNeoCosmos5761(frostHunterContentProviderTurboPhantomForce45733.FrostHunterConstraintSetCloneMasterUltraRogue2633, false, false, booleanValue4, 3), 1)));
            case FrostHunterRemoteModelManagerCyberLegend2797.STRING_FIELD_NUMBER /* 5 */:
                FrostHunterDelayPixelGamma1840 frostHunterDelayPixelGamma1840 = (FrostHunterDelayPixelGamma1840) obj;
                frostHunterDelayPixelGamma1840.getClass();
                FrostHunterSurfaceViewPulseSpectraStorm4437 frostHunterSurfaceViewPulseSpectraStorm4437 = (FrostHunterSurfaceViewPulseSpectraStorm4437) obj2;
                frostHunterSurfaceViewPulseSpectraStorm4437.getClass();
                ((FrostHunterAccelerometerNeoAurora1913) frostHunterSurfaceViewPulseSpectraStorm4437.FrostHunterConstraintSetCloneMasterUltraRogue2633.FrostHunterFlowMaxDragonHero5809).addLast(new FrostHunterInputMethodManagerCosmosInferno9935(frostHunterDelayPixelGamma1840));
                frostHunterSurfaceViewPulseSpectraStorm4437.FrostHunterLifecycleBlazeGammaElite2889();
                break;
            default:
                ((FrostHunterCoroutineEclipseNovaShadow7878) obj2).FrostHunterFragmentBetaMegaVortex6025((Throwable) obj);
                break;
        }
        return frostHunterLinearLayoutSolarHero7990;
    }
}
