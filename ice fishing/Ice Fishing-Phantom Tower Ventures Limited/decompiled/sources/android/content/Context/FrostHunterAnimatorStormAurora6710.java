package android.content.Context;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterAnimatorStormAurora6710 {
    public final String FrostHunterAlphaAnimationNeoCosmos5761;
    public final Set FrostHunterBundlePulseFusionHero2475;
    public final Set FrostHunterConstraintSetCloneMasterUltraRogue2633;
    public final FrostHunterServiceConnectionPrimeTurboPhoenix8976 FrostHunterLevelListDrawableFusionDragonHero2232;
    public final int FrostHunterLifecycleBlazeGammaElite2889;
    public final Set FrostHunterRemoteConfigSpeedSpeed8566;
    public final int FrostHunterServiceEliteCelestialThunder1757;

    public FrostHunterAnimatorStormAurora6710(String str, Set set, Set set2, int i, int i2, FrostHunterServiceConnectionPrimeTurboPhoenix8976 frostHunterServiceConnectionPrimeTurboPhoenix8976, Set set3) {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = str;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = Collections.unmodifiableSet(set);
        this.FrostHunterBundlePulseFusionHero2475 = Collections.unmodifiableSet(set2);
        this.FrostHunterServiceEliteCelestialThunder1757 = i;
        this.FrostHunterLifecycleBlazeGammaElite2889 = i2;
        this.FrostHunterLevelListDrawableFusionDragonHero2232 = frostHunterServiceConnectionPrimeTurboPhoenix8976;
        this.FrostHunterRemoteConfigSpeedSpeed8566 = Collections.unmodifiableSet(set3);
    }

    public static FrostHunterFaceDetectionBlazeDragonShadow9671 FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterObserverVisionSpeed8931 frostHunterObserverVisionSpeed8931) {
        return new FrostHunterFaceDetectionBlazeDragonShadow9671(frostHunterObserverVisionSpeed8931, new FrostHunterObserverVisionSpeed8931[0]);
    }

    public static FrostHunterAnimatorStormAurora6710 FrostHunterConstraintSetCloneMasterUltraRogue2633(Object obj, Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(FrostHunterObserverVisionSpeed8931.FrostHunterAlphaAnimationNeoCosmos5761(cls));
        for (Class cls2 : clsArr) {
            FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterKeyframeGammaGamma1197(cls2, "Null interface");
            hashSet.add(FrostHunterObserverVisionSpeed8931.FrostHunterAlphaAnimationNeoCosmos5761(cls2));
        }
        return new FrostHunterAnimatorStormAurora6710(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new FrostHunterMotionEventSparkNovaStorm4129(1, obj), hashSet3);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.FrostHunterConstraintSetCloneMasterUltraRogue2633.toArray()) + ">{" + this.FrostHunterServiceEliteCelestialThunder1757 + ", type=" + this.FrostHunterLifecycleBlazeGammaElite2889 + ", deps=" + Arrays.toString(this.FrostHunterBundlePulseFusionHero2475.toArray()) + "}";
    }
}
