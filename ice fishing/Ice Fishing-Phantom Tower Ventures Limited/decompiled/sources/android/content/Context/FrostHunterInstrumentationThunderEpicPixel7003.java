package android.content.Context;

import java.util.Arrays;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterInstrumentationThunderEpicPixel7003 {
    public int FrostHunterAlphaAnimationNeoCosmos5761;
    public int FrostHunterConstraintSetCloneMasterUltraRogue2633;
    public Object FrostHunterBundlePulseFusionHero2475 = new long[10];
    public Object FrostHunterServiceEliteCelestialThunder1757 = new Object[10];

    public synchronized void FrostHunterAlphaAnimationNeoCosmos5761(long j, Object obj) {
        if (this.FrostHunterConstraintSetCloneMasterUltraRogue2633 > 0) {
            if (j <= ((long[]) this.FrostHunterBundlePulseFusionHero2475)[((this.FrostHunterAlphaAnimationNeoCosmos5761 + r0) - 1) % ((Object[]) this.FrostHunterServiceEliteCelestialThunder1757).length]) {
                synchronized (this) {
                    this.FrostHunterAlphaAnimationNeoCosmos5761 = 0;
                    this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = 0;
                    Arrays.fill((Object[]) this.FrostHunterServiceEliteCelestialThunder1757, (Object) null);
                }
            }
        }
        FrostHunterConstraintSetCloneMasterUltraRogue2633();
        int i = this.FrostHunterAlphaAnimationNeoCosmos5761;
        int i2 = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        Object[] objArr = (Object[]) this.FrostHunterServiceEliteCelestialThunder1757;
        int length = (i + i2) % objArr.length;
        ((long[]) this.FrostHunterBundlePulseFusionHero2475)[length] = j;
        objArr[length] = obj;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = i2 + 1;
    }

    public synchronized Object FrostHunterBundlePulseFusionHero2475() {
        return this.FrostHunterConstraintSetCloneMasterUltraRogue2633 == 0 ? null : FrostHunterLifecycleBlazeGammaElite2889();
    }

    public void FrostHunterConstraintSetCloneMasterUltraRogue2633() {
        int length = ((Object[]) this.FrostHunterServiceEliteCelestialThunder1757).length;
        if (this.FrostHunterConstraintSetCloneMasterUltraRogue2633 < length) {
            return;
        }
        int i = length * 2;
        long[] jArr = new long[i];
        Object[] objArr = new Object[i];
        int i2 = this.FrostHunterAlphaAnimationNeoCosmos5761;
        int i3 = length - i2;
        System.arraycopy((long[]) this.FrostHunterBundlePulseFusionHero2475, i2, jArr, 0, i3);
        System.arraycopy((Object[]) this.FrostHunterServiceEliteCelestialThunder1757, this.FrostHunterAlphaAnimationNeoCosmos5761, objArr, 0, i3);
        int i4 = this.FrostHunterAlphaAnimationNeoCosmos5761;
        if (i4 > 0) {
            System.arraycopy((long[]) this.FrostHunterBundlePulseFusionHero2475, 0, jArr, i3, i4);
            System.arraycopy((Object[]) this.FrostHunterServiceEliteCelestialThunder1757, 0, objArr, i3, this.FrostHunterAlphaAnimationNeoCosmos5761);
        }
        this.FrostHunterBundlePulseFusionHero2475 = jArr;
        this.FrostHunterServiceEliteCelestialThunder1757 = objArr;
        this.FrostHunterAlphaAnimationNeoCosmos5761 = 0;
    }

    public synchronized int FrostHunterLevelListDrawableFusionDragonHero2232() {
        return this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
    }

    public Object FrostHunterLifecycleBlazeGammaElite2889() {
        FrostHunterCanvasInfernoVortex4700.FrostHunterMeteringPointMegaCyber7955(this.FrostHunterConstraintSetCloneMasterUltraRogue2633 > 0);
        Object[] objArr = (Object[]) this.FrostHunterServiceEliteCelestialThunder1757;
        int i = this.FrostHunterAlphaAnimationNeoCosmos5761;
        Object obj = objArr[i];
        objArr[i] = null;
        this.FrostHunterAlphaAnimationNeoCosmos5761 = (i + 1) % objArr.length;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633--;
        return obj;
    }

    public synchronized Object FrostHunterServiceEliteCelestialThunder1757(long j) {
        Object obj;
        obj = null;
        while (this.FrostHunterConstraintSetCloneMasterUltraRogue2633 > 0 && j - ((long[]) this.FrostHunterBundlePulseFusionHero2475)[this.FrostHunterAlphaAnimationNeoCosmos5761] >= 0) {
            obj = FrostHunterLifecycleBlazeGammaElite2889();
        }
        return obj;
    }
}
