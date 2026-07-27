package android.content.Context;

import android.content.Context;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterHandlerHeroHyperion6983 extends FrostHunterMapPrimeTitan1651 {
    public final Context FrostHunterAlphaAnimationNeoCosmos5761;
    public final FrostHunterActivityInfoStrikeCelestial6878 FrostHunterBundlePulseFusionHero2475;
    public final FrostHunterActivityInfoStrikeCelestial6878 FrostHunterConstraintSetCloneMasterUltraRogue2633;
    public final String FrostHunterServiceEliteCelestialThunder1757;

    public FrostHunterHandlerHeroHyperion6983(Context context, FrostHunterActivityInfoStrikeCelestial6878 frostHunterActivityInfoStrikeCelestial6878, FrostHunterActivityInfoStrikeCelestial6878 frostHunterActivityInfoStrikeCelestial68782, String str) {
        if (context == null) {
            FrostHunterMaterialCardViewShadowBlazeBlaze3823.FrostHunterCameraXPixelTurboCosmos9814("Null applicationContext");
            throw null;
        }
        this.FrostHunterAlphaAnimationNeoCosmos5761 = context;
        if (frostHunterActivityInfoStrikeCelestial6878 == null) {
            FrostHunterMaterialCardViewShadowBlazeBlaze3823.FrostHunterCameraXPixelTurboCosmos9814("Null wallClock");
            throw null;
        }
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = frostHunterActivityInfoStrikeCelestial6878;
        if (frostHunterActivityInfoStrikeCelestial68782 == null) {
            FrostHunterMaterialCardViewShadowBlazeBlaze3823.FrostHunterCameraXPixelTurboCosmos9814("Null monotonicClock");
            throw null;
        }
        this.FrostHunterBundlePulseFusionHero2475 = frostHunterActivityInfoStrikeCelestial68782;
        if (str != null) {
            this.FrostHunterServiceEliteCelestialThunder1757 = str;
        } else {
            FrostHunterMaterialCardViewShadowBlazeBlaze3823.FrostHunterCameraXPixelTurboCosmos9814("Null backendName");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof FrostHunterMapPrimeTitan1651) {
            FrostHunterHandlerHeroHyperion6983 frostHunterHandlerHeroHyperion6983 = (FrostHunterHandlerHeroHyperion6983) ((FrostHunterMapPrimeTitan1651) obj);
            if (this.FrostHunterAlphaAnimationNeoCosmos5761.equals(frostHunterHandlerHeroHyperion6983.FrostHunterAlphaAnimationNeoCosmos5761) && this.FrostHunterConstraintSetCloneMasterUltraRogue2633.equals(frostHunterHandlerHeroHyperion6983.FrostHunterConstraintSetCloneMasterUltraRogue2633) && this.FrostHunterBundlePulseFusionHero2475.equals(frostHunterHandlerHeroHyperion6983.FrostHunterBundlePulseFusionHero2475) && this.FrostHunterServiceEliteCelestialThunder1757.equals(frostHunterHandlerHeroHyperion6983.FrostHunterServiceEliteCelestialThunder1757)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.FrostHunterServiceEliteCelestialThunder1757.hashCode() ^ ((((((this.FrostHunterAlphaAnimationNeoCosmos5761.hashCode() ^ 1000003) * 1000003) ^ this.FrostHunterConstraintSetCloneMasterUltraRogue2633.hashCode()) * 1000003) ^ this.FrostHunterBundlePulseFusionHero2475.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreationContext{applicationContext=");
        sb.append(this.FrostHunterAlphaAnimationNeoCosmos5761);
        sb.append(", wallClock=");
        sb.append(this.FrostHunterConstraintSetCloneMasterUltraRogue2633);
        sb.append(", monotonicClock=");
        sb.append(this.FrostHunterBundlePulseFusionHero2475);
        sb.append(", backendName=");
        return FrostHunterKeyEventNovaXAlpha1220.FrostHunterFragmentBetaMegaVortex6025(sb, this.FrostHunterServiceEliteCelestialThunder1757, "}");
    }
}
