package android.content.Context;

import java.util.ArrayList;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterKeyframeSparkVortex3717 {
    public final int FrostHunterAlphaAnimationNeoCosmos5761;
    public static final FrostHunterKeyframeSparkVortex3717 FrostHunterConstraintSetCloneMasterUltraRogue2633 = new FrostHunterKeyframeSparkVortex3717(0);
    public static final FrostHunterKeyframeSparkVortex3717 FrostHunterBundlePulseFusionHero2475 = new FrostHunterKeyframeSparkVortex3717(1);

    public FrostHunterKeyframeSparkVortex3717(int i) {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FrostHunterKeyframeSparkVortex3717) {
            return this.FrostHunterAlphaAnimationNeoCosmos5761 == ((FrostHunterKeyframeSparkVortex3717) obj).FrostHunterAlphaAnimationNeoCosmos5761;
        }
        return false;
    }

    public final int hashCode() {
        return this.FrostHunterAlphaAnimationNeoCosmos5761;
    }

    public final String toString() {
        int i = this.FrostHunterAlphaAnimationNeoCosmos5761;
        if (i == 0) {
            return "TextDecoration.None";
        }
        ArrayList arrayList = new ArrayList();
        if ((i & 1) != 0) {
            arrayList.add("Underline");
        }
        if ((i & 2) != 0) {
            arrayList.add("LineThrough");
        }
        if (arrayList.size() == 1) {
            return "TextDecoration." + ((String) arrayList.get(0));
        }
        return "TextDecoration[" + FrostHunterAnalyticsPixelSolarEpic8004.FrostHunterAlphaAnimationNeoCosmos5761(arrayList, ", ", null, 62) + ']';
    }
}
