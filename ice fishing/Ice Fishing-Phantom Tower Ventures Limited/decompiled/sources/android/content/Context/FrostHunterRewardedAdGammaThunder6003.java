package android.content.Context;

import android.app.Application;
import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterRewardedAdGammaThunder6003 implements FrostHunterAdapterDelegatePhantomTitanium6932 {
    public final Application FrostHunterAlphaAnimationNeoCosmos5761;
    public final Bundle FrostHunterBundlePulseFusionHero2475;
    public final FrostHunterFlowCollectorGammaGammaVortex5201 FrostHunterConstraintSetCloneMasterUltraRogue2633;
    public final FrostHunterKotlinQuantumRogue5892 FrostHunterLifecycleBlazeGammaElite2889;
    public final FrostHunterDrawerLayoutEpicFusionShadow4742 FrostHunterServiceEliteCelestialThunder1757;

    public FrostHunterRewardedAdGammaThunder6003(Application application, FrostHunterTimerPixelAurora2235 frostHunterTimerPixelAurora2235, Bundle bundle) {
        FrostHunterFlowCollectorGammaGammaVortex5201 frostHunterFlowCollectorGammaGammaVortex5201;
        this.FrostHunterLifecycleBlazeGammaElite2889 = frostHunterTimerPixelAurora2235.FrostHunterConstraintSetCloneMasterUltraRogue2633();
        this.FrostHunterServiceEliteCelestialThunder1757 = frostHunterTimerPixelAurora2235.FrostHunterRemoteConfigSpeedSpeed8566();
        this.FrostHunterBundlePulseFusionHero2475 = bundle;
        this.FrostHunterAlphaAnimationNeoCosmos5761 = application;
        if (application != null) {
            if (FrostHunterFlowCollectorGammaGammaVortex5201.FrostHunterBundlePulseFusionHero2475 == null) {
                FrostHunterFlowCollectorGammaGammaVortex5201.FrostHunterBundlePulseFusionHero2475 = new FrostHunterFlowCollectorGammaGammaVortex5201(application);
            }
            frostHunterFlowCollectorGammaGammaVortex5201 = FrostHunterFlowCollectorGammaGammaVortex5201.FrostHunterBundlePulseFusionHero2475;
            frostHunterFlowCollectorGammaGammaVortex5201.getClass();
        } else {
            frostHunterFlowCollectorGammaGammaVortex5201 = new FrostHunterFlowCollectorGammaGammaVortex5201(null);
        }
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = frostHunterFlowCollectorGammaGammaVortex5201;
    }

    @Override // android.content.Context.FrostHunterAdapterDelegatePhantomTitanium6932
    public final FrostHunterFragmentCosmosSolar3628 FrostHunterAlphaAnimationNeoCosmos5761(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return FrostHunterServiceEliteCelestialThunder1757(cls, canonicalName);
        }
        FrostHunterFlowHyperionVortexDelta5013.FrostHunterFlowMaxDragonHero5809("Local and anonymous classes can not be ViewModels");
        return null;
    }

    @Override // android.content.Context.FrostHunterAdapterDelegatePhantomTitanium6932
    public final FrostHunterFragmentCosmosSolar3628 FrostHunterBundlePulseFusionHero2475(FrostHunterRewardedAdAlphaPhoenixVortex4789 frostHunterRewardedAdAlphaPhoenixVortex4789, FrostHunterGraphNebulaHyperionOlympian8801 frostHunterGraphNebulaHyperionOlympian8801) {
        return FrostHunterConstraintSetCloneMasterUltraRogue2633(FrostHunterDrawerLayoutUltraStrike3303.FrostHunterBillingClientFusionVortex9008(frostHunterRewardedAdAlphaPhoenixVortex4789), frostHunterGraphNebulaHyperionOlympian8801);
    }

    @Override // android.content.Context.FrostHunterAdapterDelegatePhantomTitanium6932
    public final FrostHunterFragmentCosmosSolar3628 FrostHunterConstraintSetCloneMasterUltraRogue2633(Class cls, FrostHunterGraphNebulaHyperionOlympian8801 frostHunterGraphNebulaHyperionOlympian8801) {
        FrostHunterBundleMasterVision3644 frostHunterBundleMasterVision3644 = FrostHunterLayoutInflaterTurboHyperion3832.FrostHunterScaleAnimationStrikeSpark5059;
        LinkedHashMap linkedHashMap = frostHunterGraphNebulaHyperionOlympian8801.FrostHunterAlphaAnimationNeoCosmos5761;
        String str = (String) linkedHashMap.get(frostHunterBundleMasterVision3644);
        if (str == null) {
            FrostHunterFlowHyperionVortexDelta5013.FrostHunterServiceConnectionTurboPhoenixOmega6719("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
            return null;
        }
        if (linkedHashMap.get(FrostHunterExecutorSolarPhoenix3849.FrostHunterLevelListDrawableFusionDragonHero2232) == null || linkedHashMap.get(FrostHunterExecutorSolarPhoenix3849.FrostHunterRemoteConfigSpeedSpeed8566) == null) {
            if (this.FrostHunterServiceEliteCelestialThunder1757 != null) {
                return FrostHunterServiceEliteCelestialThunder1757(cls, str);
            }
            FrostHunterFlowHyperionVortexDelta5013.FrostHunterServiceConnectionTurboPhoenixOmega6719("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
            return null;
        }
        Application application = (Application) linkedHashMap.get(FrostHunterFlowCollectorGammaGammaVortex5201.FrostHunterServiceEliteCelestialThunder1757);
        boolean isAssignableFrom = FrostHunterObjectAnimatorTurboEclipseElite8943.class.isAssignableFrom(cls);
        Constructor FrostHunterAlphaAnimationNeoCosmos5761 = (!isAssignableFrom || application == null) ? FrostHunterVideoCapturePulseElite1207.FrostHunterAlphaAnimationNeoCosmos5761(cls, FrostHunterVideoCapturePulseElite1207.FrostHunterConstraintSetCloneMasterUltraRogue2633) : FrostHunterVideoCapturePulseElite1207.FrostHunterAlphaAnimationNeoCosmos5761(cls, FrostHunterVideoCapturePulseElite1207.FrostHunterAlphaAnimationNeoCosmos5761);
        return FrostHunterAlphaAnimationNeoCosmos5761 == null ? this.FrostHunterConstraintSetCloneMasterUltraRogue2633.FrostHunterConstraintSetCloneMasterUltraRogue2633(cls, frostHunterGraphNebulaHyperionOlympian8801) : (!isAssignableFrom || application == null) ? FrostHunterVideoCapturePulseElite1207.FrostHunterConstraintSetCloneMasterUltraRogue2633(cls, FrostHunterAlphaAnimationNeoCosmos5761, FrostHunterExecutorSolarPhoenix3849.FrostHunterResourcesTitanHyperVision5823(frostHunterGraphNebulaHyperionOlympian8801)) : FrostHunterVideoCapturePulseElite1207.FrostHunterConstraintSetCloneMasterUltraRogue2633(cls, FrostHunterAlphaAnimationNeoCosmos5761, application, FrostHunterExecutorSolarPhoenix3849.FrostHunterResourcesTitanHyperVision5823(frostHunterGraphNebulaHyperionOlympian8801));
    }

    public final FrostHunterFragmentCosmosSolar3628 FrostHunterServiceEliteCelestialThunder1757(Class cls, String str) {
        FrostHunterDrawerLayoutEpicFusionShadow4742 frostHunterDrawerLayoutEpicFusionShadow4742 = this.FrostHunterServiceEliteCelestialThunder1757;
        if (frostHunterDrawerLayoutEpicFusionShadow4742 == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean isAssignableFrom = FrostHunterObjectAnimatorTurboEclipseElite8943.class.isAssignableFrom(cls);
        Application application = this.FrostHunterAlphaAnimationNeoCosmos5761;
        Constructor FrostHunterAlphaAnimationNeoCosmos5761 = (!isAssignableFrom || application == null) ? FrostHunterVideoCapturePulseElite1207.FrostHunterAlphaAnimationNeoCosmos5761(cls, FrostHunterVideoCapturePulseElite1207.FrostHunterConstraintSetCloneMasterUltraRogue2633) : FrostHunterVideoCapturePulseElite1207.FrostHunterAlphaAnimationNeoCosmos5761(cls, FrostHunterVideoCapturePulseElite1207.FrostHunterAlphaAnimationNeoCosmos5761);
        if (FrostHunterAlphaAnimationNeoCosmos5761 == null) {
            if (application != null) {
                return this.FrostHunterConstraintSetCloneMasterUltraRogue2633.FrostHunterAlphaAnimationNeoCosmos5761(cls);
            }
            if (FrostHunterFirebaseVortexTurboAlpha3998.FrostHunterAlphaAnimationNeoCosmos5761 == null) {
                FrostHunterFirebaseVortexTurboAlpha3998.FrostHunterAlphaAnimationNeoCosmos5761 = new FrostHunterFirebaseVortexTurboAlpha3998();
            }
            FrostHunterFirebaseVortexTurboAlpha3998.FrostHunterAlphaAnimationNeoCosmos5761.getClass();
            return FrostHunterCardViewHyperionAurora3829.FrostHunterTextViewDragonStormMega4297(cls);
        }
        FrostHunterKotlinQuantumRogue5892 frostHunterKotlinQuantumRogue5892 = this.FrostHunterLifecycleBlazeGammaElite2889;
        frostHunterKotlinQuantumRogue5892.getClass();
        FrostHunterStateFlowCosmosTurboPhantom3869 FrostHunterResourcesTitanHyperVision5823 = FrostHunterPaintCyberPulse5979.FrostHunterResourcesTitanHyperVision5823(frostHunterKotlinQuantumRogue5892.FrostHunterFlowMaxDragonHero5809(str), this.FrostHunterBundlePulseFusionHero2475);
        FrostHunterScaleGestureDetectorInfernoFusion1697 frostHunterScaleGestureDetectorInfernoFusion1697 = new FrostHunterScaleGestureDetectorInfernoFusion1697(str, FrostHunterResourcesTitanHyperVision5823);
        frostHunterScaleGestureDetectorInfernoFusion1697.FrostHunterAlphaAnimationNeoCosmos5761(frostHunterKotlinQuantumRogue5892, frostHunterDrawerLayoutEpicFusionShadow4742);
        FrostHunterLicensingBlazeNebula6214 frostHunterLicensingBlazeNebula6214 = frostHunterDrawerLayoutEpicFusionShadow4742.FrostHunterServiceEliteCelestialThunder1757;
        if (frostHunterLicensingBlazeNebula6214 == FrostHunterLicensingBlazeNebula6214.FrostHunterFlowMaxDragonHero5809 || frostHunterLicensingBlazeNebula6214.compareTo(FrostHunterLicensingBlazeNebula6214.FrostHunterKeyframeGammaGamma1197) >= 0) {
            frostHunterKotlinQuantumRogue5892.FrostHunterMotionSceneAuroraMega2271();
        } else {
            frostHunterDrawerLayoutEpicFusionShadow4742.FrostHunterAlphaAnimationNeoCosmos5761(new FrostHunterTimerAuroraNovaSolar9721(frostHunterKotlinQuantumRogue5892, frostHunterDrawerLayoutEpicFusionShadow4742));
        }
        FrostHunterFragmentCosmosSolar3628 FrostHunterConstraintSetCloneMasterUltraRogue2633 = (!isAssignableFrom || application == null) ? FrostHunterVideoCapturePulseElite1207.FrostHunterConstraintSetCloneMasterUltraRogue2633(cls, FrostHunterAlphaAnimationNeoCosmos5761, FrostHunterResourcesTitanHyperVision5823) : FrostHunterVideoCapturePulseElite1207.FrostHunterConstraintSetCloneMasterUltraRogue2633(cls, FrostHunterAlphaAnimationNeoCosmos5761, application, FrostHunterResourcesTitanHyperVision5823);
        FrostHunterConstraintSetCloneMasterUltraRogue2633.FrostHunterAlphaAnimationNeoCosmos5761("androidx.lifecycle.savedstate.vm.tag", frostHunterScaleGestureDetectorInfernoFusion1697);
        return FrostHunterConstraintSetCloneMasterUltraRogue2633;
    }
}
