package android.content.Context;

import android.os.Bundle;
import android.text.Spanned;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public abstract class FrostHunterBundleNovaThunderOlympian1724 {
    public static final String FrostHunterAlphaAnimationNeoCosmos5761;
    public static final String FrostHunterBundlePulseFusionHero2475;
    public static final String FrostHunterConstraintSetCloneMasterUltraRogue2633;
    public static final String FrostHunterLifecycleBlazeGammaElite2889;
    public static final String FrostHunterServiceEliteCelestialThunder1757;

    static {
        String str = FrostHunterGyroscopeHeroAlpha1995.FrostHunterAlphaAnimationNeoCosmos5761;
        FrostHunterAlphaAnimationNeoCosmos5761 = Integer.toString(0, 36);
        FrostHunterConstraintSetCloneMasterUltraRogue2633 = Integer.toString(1, 36);
        FrostHunterBundlePulseFusionHero2475 = Integer.toString(2, 36);
        FrostHunterServiceEliteCelestialThunder1757 = Integer.toString(3, 36);
        FrostHunterLifecycleBlazeGammaElite2889 = Integer.toString(4, 36);
    }

    public static Bundle FrostHunterAlphaAnimationNeoCosmos5761(Spanned spanned, Object obj, int i, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putInt(FrostHunterAlphaAnimationNeoCosmos5761, spanned.getSpanStart(obj));
        bundle2.putInt(FrostHunterConstraintSetCloneMasterUltraRogue2633, spanned.getSpanEnd(obj));
        bundle2.putInt(FrostHunterBundlePulseFusionHero2475, spanned.getSpanFlags(obj));
        bundle2.putInt(FrostHunterServiceEliteCelestialThunder1757, i);
        if (bundle != null) {
            bundle2.putBundle(FrostHunterLifecycleBlazeGammaElite2889, bundle);
        }
        return bundle2;
    }
}
