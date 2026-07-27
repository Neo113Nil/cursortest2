package android.content.Context;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterCoordinatorLayoutSpectraQuantum6405 {
    public int FrostHunterAlphaAnimationNeoCosmos5761;
    public int FrostHunterBundlePulseFusionHero2475;
    public int FrostHunterConstraintSetCloneMasterUltraRogue2633;
    public byte[] FrostHunterLifecycleBlazeGammaElite2889;
    public int FrostHunterServiceEliteCelestialThunder1757 = 0;

    public FrostHunterCoordinatorLayoutSpectraQuantum6405(byte[] bArr, int i, int i2) {
        this.FrostHunterLifecycleBlazeGammaElite2889 = bArr;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = i;
        this.FrostHunterBundlePulseFusionHero2475 = i;
        this.FrostHunterAlphaAnimationNeoCosmos5761 = i2;
        FrostHunterAlphaAnimationNeoCosmos5761();
    }

    public void FrostHunterAlertDialogAuroraDelta3200(int i) {
        int i2 = this.FrostHunterBundlePulseFusionHero2475;
        int i3 = i / 8;
        int i4 = i2 + i3;
        this.FrostHunterBundlePulseFusionHero2475 = i4;
        int i5 = (i - (i3 * 8)) + this.FrostHunterServiceEliteCelestialThunder1757;
        this.FrostHunterServiceEliteCelestialThunder1757 = i5;
        if (i5 > 7) {
            this.FrostHunterBundlePulseFusionHero2475 = i4 + 1;
            this.FrostHunterServiceEliteCelestialThunder1757 = i5 - 8;
        }
        while (true) {
            i2++;
            if (i2 > this.FrostHunterBundlePulseFusionHero2475) {
                FrostHunterAlphaAnimationNeoCosmos5761();
                return;
            } else if (FrostHunterCameraXPixelTurboCosmos9814(i2)) {
                this.FrostHunterBundlePulseFusionHero2475++;
                i2 += 2;
            }
        }
    }

    public void FrostHunterAlphaAnimationNeoCosmos5761() {
        int i;
        int i2 = this.FrostHunterBundlePulseFusionHero2475;
        FrostHunterCanvasInfernoVortex4700.FrostHunterMeteringPointMegaCyber7955(i2 >= 0 && (i2 < (i = this.FrostHunterAlphaAnimationNeoCosmos5761) || (i2 == i && this.FrostHunterServiceEliteCelestialThunder1757 == 0)));
    }

    public boolean FrostHunterBundlePulseFusionHero2475() {
        int i = this.FrostHunterBundlePulseFusionHero2475;
        int i2 = this.FrostHunterServiceEliteCelestialThunder1757;
        int i3 = 0;
        while (this.FrostHunterBundlePulseFusionHero2475 < this.FrostHunterAlphaAnimationNeoCosmos5761 && !FrostHunterServiceEliteCelestialThunder1757()) {
            i3++;
        }
        boolean z = this.FrostHunterBundlePulseFusionHero2475 == this.FrostHunterAlphaAnimationNeoCosmos5761;
        this.FrostHunterBundlePulseFusionHero2475 = i;
        this.FrostHunterServiceEliteCelestialThunder1757 = i2;
        return !z && FrostHunterConstraintSetCloneMasterUltraRogue2633((i3 * 2) + 1);
    }

    public boolean FrostHunterCameraXPixelTurboCosmos9814(int i) {
        int i2 = i - 2;
        if (this.FrostHunterConstraintSetCloneMasterUltraRogue2633 > i2 || i >= this.FrostHunterAlphaAnimationNeoCosmos5761) {
            return false;
        }
        byte[] bArr = this.FrostHunterLifecycleBlazeGammaElite2889;
        return bArr[i] == 3 && bArr[i2] == 0 && bArr[i - 1] == 0;
    }

    public boolean FrostHunterConstraintSetCloneMasterUltraRogue2633(int i) {
        int i2 = this.FrostHunterBundlePulseFusionHero2475;
        int i3 = i / 8;
        int i4 = i2 + i3;
        int i5 = (this.FrostHunterServiceEliteCelestialThunder1757 + i) - (i3 * 8);
        if (i5 > 7) {
            i4++;
            i5 -= 8;
        }
        while (true) {
            i2++;
            if (i2 > i4 || i4 > this.FrostHunterAlphaAnimationNeoCosmos5761) {
                break;
            }
            if (FrostHunterCameraXPixelTurboCosmos9814(i2)) {
                i4++;
                i2 += 2;
            }
        }
        int i6 = this.FrostHunterAlphaAnimationNeoCosmos5761;
        return i4 < i6 || (i4 == i6 && i5 == 0);
    }

    public void FrostHunterFlowMaxDragonHero5809() {
        int i = this.FrostHunterServiceEliteCelestialThunder1757 + 1;
        this.FrostHunterServiceEliteCelestialThunder1757 = i;
        if (i == 8) {
            this.FrostHunterServiceEliteCelestialThunder1757 = 0;
            int i2 = this.FrostHunterBundlePulseFusionHero2475;
            this.FrostHunterBundlePulseFusionHero2475 = i2 + (FrostHunterCameraXPixelTurboCosmos9814(i2 + 1) ? 2 : 1);
        }
        FrostHunterAlphaAnimationNeoCosmos5761();
    }

    public int FrostHunterLevelListDrawableFusionDragonHero2232() {
        int i = 0;
        while (!FrostHunterServiceEliteCelestialThunder1757()) {
            i++;
        }
        return ((1 << i) - 1) + (i > 0 ? FrostHunterLifecycleBlazeGammaElite2889(i) : 0);
    }

    public int FrostHunterLifecycleBlazeGammaElite2889(int i) {
        int i2;
        this.FrostHunterServiceEliteCelestialThunder1757 += i;
        int i3 = 0;
        while (true) {
            i2 = this.FrostHunterServiceEliteCelestialThunder1757;
            if (i2 <= 8) {
                break;
            }
            int i4 = i2 - 8;
            this.FrostHunterServiceEliteCelestialThunder1757 = i4;
            byte[] bArr = this.FrostHunterLifecycleBlazeGammaElite2889;
            int i5 = this.FrostHunterBundlePulseFusionHero2475;
            i3 |= (bArr[i5] & 255) << i4;
            if (!FrostHunterCameraXPixelTurboCosmos9814(i5 + 1)) {
                r3 = 1;
            }
            this.FrostHunterBundlePulseFusionHero2475 = i5 + r3;
        }
        byte[] bArr2 = this.FrostHunterLifecycleBlazeGammaElite2889;
        int i6 = this.FrostHunterBundlePulseFusionHero2475;
        int i7 = ((-1) >>> (32 - i)) & (i3 | ((bArr2[i6] & 255) >> (8 - i2)));
        if (i2 == 8) {
            this.FrostHunterServiceEliteCelestialThunder1757 = 0;
            this.FrostHunterBundlePulseFusionHero2475 = i6 + (FrostHunterCameraXPixelTurboCosmos9814(i6 + 1) ? 2 : 1);
        }
        FrostHunterAlphaAnimationNeoCosmos5761();
        return i7;
    }

    public int FrostHunterRemoteConfigSpeedSpeed8566() {
        int FrostHunterLevelListDrawableFusionDragonHero2232 = FrostHunterLevelListDrawableFusionDragonHero2232();
        return ((FrostHunterLevelListDrawableFusionDragonHero2232 + 1) / 2) * (FrostHunterLevelListDrawableFusionDragonHero2232 % 2 == 0 ? -1 : 1);
    }

    public boolean FrostHunterServiceEliteCelestialThunder1757() {
        boolean z = (this.FrostHunterLifecycleBlazeGammaElite2889[this.FrostHunterBundlePulseFusionHero2475] & (128 >> this.FrostHunterServiceEliteCelestialThunder1757)) != 0;
        FrostHunterFlowMaxDragonHero5809();
        return z;
    }
}
