package android.content.Context;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterFlowCollectorGammaGammaVortex5201 extends FrostHunterFirebaseVortexTurboAlpha3998 {
    public static FrostHunterFlowCollectorGammaGammaVortex5201 FrostHunterBundlePulseFusionHero2475;
    public static final FrostHunterAuthPixelSolar5465 FrostHunterServiceEliteCelestialThunder1757 = new FrostHunterAuthPixelSolar5465();
    public final Application FrostHunterConstraintSetCloneMasterUltraRogue2633;

    public FrostHunterFlowCollectorGammaGammaVortex5201(Application application) {
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = application;
    }

    @Override // android.content.Context.FrostHunterFirebaseVortexTurboAlpha3998, android.content.Context.FrostHunterAdapterDelegatePhantomTitanium6932
    public final FrostHunterFragmentCosmosSolar3628 FrostHunterAlphaAnimationNeoCosmos5761(Class cls) {
        Application application = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        if (application != null) {
            return FrostHunterServiceEliteCelestialThunder1757(cls, application);
        }
        throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
    }

    @Override // android.content.Context.FrostHunterFirebaseVortexTurboAlpha3998, android.content.Context.FrostHunterAdapterDelegatePhantomTitanium6932
    public final FrostHunterFragmentCosmosSolar3628 FrostHunterConstraintSetCloneMasterUltraRogue2633(Class cls, FrostHunterGraphNebulaHyperionOlympian8801 frostHunterGraphNebulaHyperionOlympian8801) {
        if (this.FrostHunterConstraintSetCloneMasterUltraRogue2633 != null) {
            return FrostHunterAlphaAnimationNeoCosmos5761(cls);
        }
        Application application = (Application) frostHunterGraphNebulaHyperionOlympian8801.FrostHunterAlphaAnimationNeoCosmos5761.get(FrostHunterServiceEliteCelestialThunder1757);
        if (application != null) {
            return FrostHunterServiceEliteCelestialThunder1757(cls, application);
        }
        if (!FrostHunterObjectAnimatorTurboEclipseElite8943.class.isAssignableFrom(cls)) {
            return FrostHunterCardViewHyperionAurora3829.FrostHunterTextViewDragonStormMega4297(cls);
        }
        FrostHunterFlowHyperionVortexDelta5013.FrostHunterFlowMaxDragonHero5809("CreationExtras must have an application by `APPLICATION_KEY`");
        return null;
    }

    public final FrostHunterFragmentCosmosSolar3628 FrostHunterServiceEliteCelestialThunder1757(Class cls, Application application) {
        if (!FrostHunterObjectAnimatorTurboEclipseElite8943.class.isAssignableFrom(cls)) {
            return FrostHunterCardViewHyperionAurora3829.FrostHunterTextViewDragonStormMega4297(cls);
        }
        try {
            FrostHunterFragmentCosmosSolar3628 frostHunterFragmentCosmosSolar3628 = (FrostHunterFragmentCosmosSolar3628) cls.getConstructor(Application.class).newInstance(application);
            frostHunterFragmentCosmosSolar3628.getClass();
            return frostHunterFragmentCosmosSolar3628;
        } catch (IllegalAccessException e) {
            FrostHunterMaterialCardViewShadowBlazeBlaze3823.FrostHunterKeyframeGammaGamma1197("Cannot create an instance of ", cls, e);
            return null;
        } catch (InstantiationException e2) {
            FrostHunterMaterialCardViewShadowBlazeBlaze3823.FrostHunterKeyframeGammaGamma1197("Cannot create an instance of ", cls, e2);
            return null;
        } catch (NoSuchMethodException e3) {
            FrostHunterMaterialCardViewShadowBlazeBlaze3823.FrostHunterKeyframeGammaGamma1197("Cannot create an instance of ", cls, e3);
            return null;
        } catch (InvocationTargetException e4) {
            FrostHunterMaterialCardViewShadowBlazeBlaze3823.FrostHunterKeyframeGammaGamma1197("Cannot create an instance of ", cls, e4);
            return null;
        }
    }
}
