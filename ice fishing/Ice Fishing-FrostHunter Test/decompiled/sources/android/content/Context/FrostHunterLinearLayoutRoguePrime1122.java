package android.content.Context;

import java.util.Arrays;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterLinearLayoutRoguePrime1122 {
    public int FrostHunterAlphaAnimationNeoCosmos5761;
    public boolean FrostHunterBundlePulseFusionHero2475;
    public boolean FrostHunterConstraintSetCloneMasterUltraRogue2633;
    public Object FrostHunterLifecycleBlazeGammaElite2889;
    public int FrostHunterServiceEliteCelestialThunder1757;

    public FrostHunterLinearLayoutRoguePrime1122(int i) {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = i;
        byte[] bArr = new byte[131];
        this.FrostHunterLifecycleBlazeGammaElite2889 = bArr;
        bArr[2] = 1;
    }

    public void FrostHunterAlphaAnimationNeoCosmos5761(byte[] bArr, int i, int i2) {
        if (this.FrostHunterConstraintSetCloneMasterUltraRogue2633) {
            int i3 = i2 - i;
            byte[] bArr2 = (byte[]) this.FrostHunterLifecycleBlazeGammaElite2889;
            int length = bArr2.length;
            int i4 = this.FrostHunterServiceEliteCelestialThunder1757 + i3;
            if (length < i4) {
                this.FrostHunterLifecycleBlazeGammaElite2889 = Arrays.copyOf(bArr2, i4 * 2);
            }
            System.arraycopy(bArr, i, (byte[]) this.FrostHunterLifecycleBlazeGammaElite2889, this.FrostHunterServiceEliteCelestialThunder1757, i3);
            this.FrostHunterServiceEliteCelestialThunder1757 += i3;
        }
    }

    public void FrostHunterBundlePulseFusionHero2475(int i) {
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 |= i > 0;
        this.FrostHunterAlphaAnimationNeoCosmos5761 += i;
    }

    public boolean FrostHunterConstraintSetCloneMasterUltraRogue2633(int i) {
        if (!this.FrostHunterConstraintSetCloneMasterUltraRogue2633) {
            return false;
        }
        this.FrostHunterServiceEliteCelestialThunder1757 -= i;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = false;
        this.FrostHunterBundlePulseFusionHero2475 = true;
        return true;
    }

    public void FrostHunterLifecycleBlazeGammaElite2889(int i) {
        FrostHunterCanvasInfernoVortex4700.FrostHunterMeteringPointMegaCyber7955(!this.FrostHunterConstraintSetCloneMasterUltraRogue2633);
        boolean z = i == this.FrostHunterAlphaAnimationNeoCosmos5761;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = z;
        if (z) {
            this.FrostHunterServiceEliteCelestialThunder1757 = 3;
            this.FrostHunterBundlePulseFusionHero2475 = false;
        }
    }

    public void FrostHunterServiceEliteCelestialThunder1757() {
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = false;
        this.FrostHunterBundlePulseFusionHero2475 = false;
    }

    public FrostHunterLinearLayoutRoguePrime1122(FrostHunterVelocityTrackerPrimePulse4533 frostHunterVelocityTrackerPrimePulse4533) {
        this.FrostHunterLifecycleBlazeGammaElite2889 = frostHunterVelocityTrackerPrimePulse4533;
    }
}
