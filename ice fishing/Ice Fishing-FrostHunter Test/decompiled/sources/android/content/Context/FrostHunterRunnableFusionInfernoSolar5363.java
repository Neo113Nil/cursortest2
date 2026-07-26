package android.content.Context;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public class FrostHunterRunnableFusionInfernoSolar5363 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater FrostHunterConstraintSetCloneMasterUltraRogue2633 = AtomicIntegerFieldUpdater.newUpdater(FrostHunterRunnableFusionInfernoSolar5363.class, "_size$volatile");
    public FrostHunterGradientDrawableBetaVortex4296[] FrostHunterAlphaAnimationNeoCosmos5761;
    private volatile /* synthetic */ int _size$volatile;

    public final void FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterGradientDrawableBetaVortex4296 frostHunterGradientDrawableBetaVortex4296) {
        frostHunterGradientDrawableBetaVortex4296.FrostHunterServiceEliteCelestialThunder1757((FrostHunterVectorDrawableNovaAurora3363) this);
        FrostHunterGradientDrawableBetaVortex4296[] frostHunterGradientDrawableBetaVortex4296Arr = this.FrostHunterAlphaAnimationNeoCosmos5761;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = FrostHunterConstraintSetCloneMasterUltraRogue2633;
        if (frostHunterGradientDrawableBetaVortex4296Arr == null) {
            frostHunterGradientDrawableBetaVortex4296Arr = new FrostHunterGradientDrawableBetaVortex4296[4];
            this.FrostHunterAlphaAnimationNeoCosmos5761 = frostHunterGradientDrawableBetaVortex4296Arr;
        } else if (atomicIntegerFieldUpdater.get(this) >= frostHunterGradientDrawableBetaVortex4296Arr.length) {
            frostHunterGradientDrawableBetaVortex4296Arr = (FrostHunterGradientDrawableBetaVortex4296[]) Arrays.copyOf(frostHunterGradientDrawableBetaVortex4296Arr, atomicIntegerFieldUpdater.get(this) * 2);
            this.FrostHunterAlphaAnimationNeoCosmos5761 = frostHunterGradientDrawableBetaVortex4296Arr;
        }
        int i = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i + 1);
        frostHunterGradientDrawableBetaVortex4296Arr[i] = frostHunterGradientDrawableBetaVortex4296;
        frostHunterGradientDrawableBetaVortex4296.FrostHunterFlowMaxDragonHero5809 = i;
        FrostHunterBundlePulseFusionHero2475(i);
    }

    public final void FrostHunterBundlePulseFusionHero2475(int i) {
        while (i > 0) {
            FrostHunterGradientDrawableBetaVortex4296[] frostHunterGradientDrawableBetaVortex4296Arr = this.FrostHunterAlphaAnimationNeoCosmos5761;
            frostHunterGradientDrawableBetaVortex4296Arr.getClass();
            int i2 = (i - 1) / 2;
            FrostHunterGradientDrawableBetaVortex4296 frostHunterGradientDrawableBetaVortex4296 = frostHunterGradientDrawableBetaVortex4296Arr[i2];
            frostHunterGradientDrawableBetaVortex4296.getClass();
            FrostHunterGradientDrawableBetaVortex4296 frostHunterGradientDrawableBetaVortex42962 = frostHunterGradientDrawableBetaVortex4296Arr[i];
            frostHunterGradientDrawableBetaVortex42962.getClass();
            if (frostHunterGradientDrawableBetaVortex4296.compareTo(frostHunterGradientDrawableBetaVortex42962) <= 0) {
                return;
            }
            FrostHunterServiceEliteCelestialThunder1757(i, i2);
            i = i2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0060, code lost:
    
        if (r6.compareTo(r7) < 0) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final FrostHunterGradientDrawableBetaVortex4296 FrostHunterConstraintSetCloneMasterUltraRogue2633(int i) {
        Object[] objArr = this.FrostHunterAlphaAnimationNeoCosmos5761;
        objArr.getClass();
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = FrostHunterConstraintSetCloneMasterUltraRogue2633;
        atomicIntegerFieldUpdater.set(this, atomicIntegerFieldUpdater.get(this) - 1);
        if (i < atomicIntegerFieldUpdater.get(this)) {
            FrostHunterServiceEliteCelestialThunder1757(i, atomicIntegerFieldUpdater.get(this));
            int i2 = (i - 1) / 2;
            if (i > 0) {
                FrostHunterGradientDrawableBetaVortex4296 frostHunterGradientDrawableBetaVortex4296 = objArr[i];
                frostHunterGradientDrawableBetaVortex4296.getClass();
                Object obj = objArr[i2];
                obj.getClass();
                if (frostHunterGradientDrawableBetaVortex4296.compareTo(obj) < 0) {
                    FrostHunterServiceEliteCelestialThunder1757(i, i2);
                    FrostHunterBundlePulseFusionHero2475(i2);
                }
            }
            while (true) {
                int i3 = i * 2;
                int i4 = i3 + 1;
                if (i4 >= atomicIntegerFieldUpdater.get(this)) {
                    break;
                }
                Object[] objArr2 = this.FrostHunterAlphaAnimationNeoCosmos5761;
                objArr2.getClass();
                int i5 = i3 + 2;
                if (i5 < atomicIntegerFieldUpdater.get(this)) {
                    Comparable comparable = objArr2[i5];
                    comparable.getClass();
                    Object obj2 = objArr2[i4];
                    obj2.getClass();
                }
                i5 = i4;
                Comparable comparable2 = objArr2[i];
                comparable2.getClass();
                Comparable comparable3 = objArr2[i5];
                comparable3.getClass();
                if (comparable2.compareTo(comparable3) <= 0) {
                    break;
                }
                FrostHunterServiceEliteCelestialThunder1757(i, i5);
                i = i5;
            }
        }
        FrostHunterGradientDrawableBetaVortex4296 frostHunterGradientDrawableBetaVortex42962 = objArr[atomicIntegerFieldUpdater.get(this)];
        frostHunterGradientDrawableBetaVortex42962.getClass();
        frostHunterGradientDrawableBetaVortex42962.FrostHunterServiceEliteCelestialThunder1757(null);
        frostHunterGradientDrawableBetaVortex42962.FrostHunterFlowMaxDragonHero5809 = -1;
        objArr[atomicIntegerFieldUpdater.get(this)] = null;
        return frostHunterGradientDrawableBetaVortex42962;
    }

    public final void FrostHunterServiceEliteCelestialThunder1757(int i, int i2) {
        FrostHunterGradientDrawableBetaVortex4296[] frostHunterGradientDrawableBetaVortex4296Arr = this.FrostHunterAlphaAnimationNeoCosmos5761;
        frostHunterGradientDrawableBetaVortex4296Arr.getClass();
        FrostHunterGradientDrawableBetaVortex4296 frostHunterGradientDrawableBetaVortex4296 = frostHunterGradientDrawableBetaVortex4296Arr[i2];
        frostHunterGradientDrawableBetaVortex4296.getClass();
        FrostHunterGradientDrawableBetaVortex4296 frostHunterGradientDrawableBetaVortex42962 = frostHunterGradientDrawableBetaVortex4296Arr[i];
        frostHunterGradientDrawableBetaVortex42962.getClass();
        frostHunterGradientDrawableBetaVortex4296Arr[i] = frostHunterGradientDrawableBetaVortex4296;
        frostHunterGradientDrawableBetaVortex4296Arr[i2] = frostHunterGradientDrawableBetaVortex42962;
        frostHunterGradientDrawableBetaVortex4296.FrostHunterFlowMaxDragonHero5809 = i;
        frostHunterGradientDrawableBetaVortex42962.FrostHunterFlowMaxDragonHero5809 = i2;
    }
}
