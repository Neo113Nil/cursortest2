package android.content.Context;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public abstract class FrostHunterRoomEntityCyberVision9778 {
    public Object[] FrostHunterAlphaAnimationNeoCosmos5761;
    public boolean FrostHunterBundlePulseFusionHero2475;
    public int FrostHunterConstraintSetCloneMasterUltraRogue2633;

    public FrostHunterRoomEntityCyberVision9778(int i) {
        FrostHunterLiveDataNebulaVisionSpeed2164.FrostHunterKeyframeGammaGamma1197("initialCapacity", i);
        this.FrostHunterAlphaAnimationNeoCosmos5761 = new Object[i];
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = 0;
    }

    public static int FrostHunterLifecycleBlazeGammaElite2889(int i, int i2) {
        if (i2 < 0) {
            FrostHunterFlowHyperionVortexDelta5013.FrostHunterFlowMaxDragonHero5809("cannot store more than MAX_VALUE elements");
            return 0;
        }
        if (i2 <= i) {
            return i;
        }
        int i3 = i + (i >> 1) + 1;
        if (i3 < i2) {
            i3 = Integer.highestOneBit(i2 - 1) << 1;
        }
        if (i3 < 0) {
            return Integer.MAX_VALUE;
        }
        return i3;
    }

    public abstract FrostHunterRoomEntityCyberVision9778 FrostHunterAlphaAnimationNeoCosmos5761(Object obj);

    public final void FrostHunterBundlePulseFusionHero2475(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            FrostHunterServiceEliteCelestialThunder1757(collection.size());
            if (collection instanceof FrostHunterConstraintLayoutSpeedStorm2675) {
                this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = ((FrostHunterConstraintLayoutSpeedStorm2675) collection).FrostHunterBundlePulseFusionHero2475(this.FrostHunterConstraintSetCloneMasterUltraRogue2633, this.FrostHunterAlphaAnimationNeoCosmos5761);
                return;
            }
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            FrostHunterAlphaAnimationNeoCosmos5761(it.next());
        }
    }

    public final void FrostHunterConstraintSetCloneMasterUltraRogue2633(Object obj) {
        obj.getClass();
        FrostHunterServiceEliteCelestialThunder1757(1);
        Object[] objArr = this.FrostHunterAlphaAnimationNeoCosmos5761;
        int i = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = i + 1;
        objArr[i] = obj;
    }

    public final void FrostHunterServiceEliteCelestialThunder1757(int i) {
        Object[] objArr = this.FrostHunterAlphaAnimationNeoCosmos5761;
        int FrostHunterLifecycleBlazeGammaElite2889 = FrostHunterLifecycleBlazeGammaElite2889(objArr.length, this.FrostHunterConstraintSetCloneMasterUltraRogue2633 + i);
        if (FrostHunterLifecycleBlazeGammaElite2889 > objArr.length || this.FrostHunterBundlePulseFusionHero2475) {
            this.FrostHunterAlphaAnimationNeoCosmos5761 = Arrays.copyOf(this.FrostHunterAlphaAnimationNeoCosmos5761, FrostHunterLifecycleBlazeGammaElite2889);
            this.FrostHunterBundlePulseFusionHero2475 = false;
        }
    }
}
