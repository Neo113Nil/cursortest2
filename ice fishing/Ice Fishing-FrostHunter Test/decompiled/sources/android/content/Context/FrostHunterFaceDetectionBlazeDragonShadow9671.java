package android.content.Context;

import java.util.Collections;
import java.util.HashSet;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterFaceDetectionBlazeDragonShadow9671 {
    public String FrostHunterAlphaAnimationNeoCosmos5761 = null;
    public final HashSet FrostHunterBundlePulseFusionHero2475;
    public final HashSet FrostHunterConstraintSetCloneMasterUltraRogue2633;
    public FrostHunterServiceConnectionPrimeTurboPhoenix8976 FrostHunterLevelListDrawableFusionDragonHero2232;
    public final int FrostHunterLifecycleBlazeGammaElite2889;
    public final HashSet FrostHunterRemoteConfigSpeedSpeed8566;
    public int FrostHunterServiceEliteCelestialThunder1757;

    public FrostHunterFaceDetectionBlazeDragonShadow9671(Class cls, Class[] clsArr) {
        HashSet hashSet = new HashSet();
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = hashSet;
        this.FrostHunterBundlePulseFusionHero2475 = new HashSet();
        this.FrostHunterServiceEliteCelestialThunder1757 = 0;
        this.FrostHunterLifecycleBlazeGammaElite2889 = 0;
        this.FrostHunterRemoteConfigSpeedSpeed8566 = new HashSet();
        hashSet.add(FrostHunterObserverVisionSpeed8931.FrostHunterAlphaAnimationNeoCosmos5761(cls));
        for (Class cls2 : clsArr) {
            FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterKeyframeGammaGamma1197(cls2, "Null interface");
            this.FrostHunterConstraintSetCloneMasterUltraRogue2633.add(FrostHunterObserverVisionSpeed8931.FrostHunterAlphaAnimationNeoCosmos5761(cls2));
        }
    }

    public final void FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterStateFlowMasterShadow1577 frostHunterStateFlowMasterShadow1577) {
        if (this.FrostHunterConstraintSetCloneMasterUltraRogue2633.contains(frostHunterStateFlowMasterShadow1577.FrostHunterAlphaAnimationNeoCosmos5761)) {
            FrostHunterFlowHyperionVortexDelta5013.FrostHunterFlowMaxDragonHero5809("Components are not allowed to depend on interfaces they themselves provide.");
        } else {
            this.FrostHunterBundlePulseFusionHero2475.add(frostHunterStateFlowMasterShadow1577);
        }
    }

    public final FrostHunterAnimatorStormAurora6710 FrostHunterConstraintSetCloneMasterUltraRogue2633() {
        if (this.FrostHunterLevelListDrawableFusionDragonHero2232 != null) {
            return new FrostHunterAnimatorStormAurora6710(this.FrostHunterAlphaAnimationNeoCosmos5761, new HashSet(this.FrostHunterConstraintSetCloneMasterUltraRogue2633), new HashSet(this.FrostHunterBundlePulseFusionHero2475), this.FrostHunterServiceEliteCelestialThunder1757, this.FrostHunterLifecycleBlazeGammaElite2889, this.FrostHunterLevelListDrawableFusionDragonHero2232, this.FrostHunterRemoteConfigSpeedSpeed8566);
        }
        FrostHunterFlowHyperionVortexDelta5013.FrostHunterServiceConnectionTurboPhoenixOmega6719("Missing required property: factory.");
        return null;
    }

    public FrostHunterFaceDetectionBlazeDragonShadow9671(FrostHunterObserverVisionSpeed8931 frostHunterObserverVisionSpeed8931, FrostHunterObserverVisionSpeed8931[] frostHunterObserverVisionSpeed8931Arr) {
        HashSet hashSet = new HashSet();
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = hashSet;
        this.FrostHunterBundlePulseFusionHero2475 = new HashSet();
        this.FrostHunterServiceEliteCelestialThunder1757 = 0;
        this.FrostHunterLifecycleBlazeGammaElite2889 = 0;
        this.FrostHunterRemoteConfigSpeedSpeed8566 = new HashSet();
        hashSet.add(frostHunterObserverVisionSpeed8931);
        for (FrostHunterObserverVisionSpeed8931 frostHunterObserverVisionSpeed89312 : frostHunterObserverVisionSpeed8931Arr) {
            FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterKeyframeGammaGamma1197(frostHunterObserverVisionSpeed89312, "Null interface");
        }
        Collections.addAll(this.FrostHunterConstraintSetCloneMasterUltraRogue2633, frostHunterObserverVisionSpeed8931Arr);
    }
}
