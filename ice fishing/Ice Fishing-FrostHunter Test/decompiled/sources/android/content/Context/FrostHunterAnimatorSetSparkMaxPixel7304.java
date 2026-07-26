package android.content.Context;

import java.util.List;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public abstract class FrostHunterAnimatorSetSparkMaxPixel7304 {
    public static final void FrostHunterAlphaAnimationNeoCosmos5761(int i, List list) {
        int size = list.size();
        if (i < 0 || i >= size) {
            FrostHunterBundlePulseFusionHero2475(i, size);
        }
    }

    private static final void FrostHunterBundlePulseFusionHero2475(int i, int i2) {
        throw new IndexOutOfBoundsException("Index " + i + " is out of bounds. The list has " + i2 + " elements.");
    }

    public static final void FrostHunterConstraintSetCloneMasterUltraRogue2633(int i, int i2, List list) {
        if (i > i2) {
            FrostHunterLevelListDrawableFusionDragonHero2232(i, i2);
        }
        if (i < 0) {
            FrostHunterServiceEliteCelestialThunder1757(i);
        }
        if (i2 > list.size()) {
            FrostHunterLifecycleBlazeGammaElite2889(i2, list.size());
        }
    }

    private static final void FrostHunterLevelListDrawableFusionDragonHero2232(int i, int i2) {
        throw new IllegalArgumentException("Indices are out of order. fromIndex (" + i + ") is greater than toIndex (" + i2 + ").");
    }

    private static final void FrostHunterLifecycleBlazeGammaElite2889(int i, int i2) {
        throw new IndexOutOfBoundsException("toIndex (" + i + ") is more than than the list size (" + i2 + ')');
    }

    private static final void FrostHunterServiceEliteCelestialThunder1757(int i) {
        throw new IndexOutOfBoundsException(FrostHunterKeyEventNovaXAlpha1220.FrostHunterFlowMaxDragonHero5809("fromIndex (", i, ") is less than 0."));
    }
}
