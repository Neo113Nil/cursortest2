package android.content.Context;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterCountDownTimerStormPulseFusion5949 {
    public final /* synthetic */ int FrostHunterAlphaAnimationNeoCosmos5761;
    public int FrostHunterBundlePulseFusionHero2475;
    public byte[] FrostHunterConstraintSetCloneMasterUltraRogue2633;
    public int FrostHunterLifecycleBlazeGammaElite2889;
    public int FrostHunterServiceEliteCelestialThunder1757;

    public FrostHunterCountDownTimerStormPulseFusion5949(int i, int i2) {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = 0;
        this.FrostHunterBundlePulseFusionHero2475 = i;
        this.FrostHunterServiceEliteCelestialThunder1757 = i2;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = new byte[(i2 * 2) - 1];
        this.FrostHunterLifecycleBlazeGammaElite2889 = 0;
    }

    public void FrostHunterAlertDialogAuroraDelta3200(byte[] bArr, int i) {
        FrostHunterCanvasInfernoVortex4700.FrostHunterMeteringPointMegaCyber7955(this.FrostHunterServiceEliteCelestialThunder1757 == 0);
        System.arraycopy(this.FrostHunterConstraintSetCloneMasterUltraRogue2633, this.FrostHunterBundlePulseFusionHero2475, bArr, 0, i);
        this.FrostHunterBundlePulseFusionHero2475 += i;
        FrostHunterAlphaAnimationNeoCosmos5761();
    }

    public void FrostHunterAlphaAnimationNeoCosmos5761() {
        int i;
        int i2 = this.FrostHunterBundlePulseFusionHero2475;
        FrostHunterCanvasInfernoVortex4700.FrostHunterMeteringPointMegaCyber7955(i2 >= 0 && (i2 < (i = this.FrostHunterLifecycleBlazeGammaElite2889) || (i2 == i && this.FrostHunterServiceEliteCelestialThunder1757 == 0)));
    }

    public void FrostHunterBundlePulseFusionHero2475() {
        if (this.FrostHunterServiceEliteCelestialThunder1757 == 0) {
            return;
        }
        this.FrostHunterServiceEliteCelestialThunder1757 = 0;
        this.FrostHunterBundlePulseFusionHero2475++;
        FrostHunterAlphaAnimationNeoCosmos5761();
    }

    public void FrostHunterCameraXPixelTurboCosmos9814(byte[] bArr, int i) {
        int i2 = i >> 3;
        for (int i3 = 0; i3 < i2; i3++) {
            byte[] bArr2 = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
            int i4 = this.FrostHunterBundlePulseFusionHero2475;
            int i5 = i4 + 1;
            this.FrostHunterBundlePulseFusionHero2475 = i5;
            byte b = bArr2[i4];
            int i6 = this.FrostHunterServiceEliteCelestialThunder1757;
            byte b2 = (byte) (b << i6);
            bArr[i3] = b2;
            bArr[i3] = (byte) (((255 & bArr2[i5]) >> (8 - i6)) | b2);
        }
        int i7 = i & 7;
        if (i7 == 0) {
            return;
        }
        byte b3 = (byte) (bArr[i2] & (255 >> i7));
        bArr[i2] = b3;
        int i8 = this.FrostHunterServiceEliteCelestialThunder1757;
        if (i8 + i7 > 8) {
            byte[] bArr3 = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
            int i9 = this.FrostHunterBundlePulseFusionHero2475;
            this.FrostHunterBundlePulseFusionHero2475 = i9 + 1;
            bArr[i2] = (byte) (b3 | ((bArr3[i9] & 255) << i8));
            this.FrostHunterServiceEliteCelestialThunder1757 = i8 - 8;
        }
        int i10 = this.FrostHunterServiceEliteCelestialThunder1757 + i7;
        this.FrostHunterServiceEliteCelestialThunder1757 = i10;
        byte[] bArr4 = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        int i11 = this.FrostHunterBundlePulseFusionHero2475;
        bArr[i2] = (byte) (((byte) (((255 & bArr4[i11]) >> (8 - i10)) << (8 - i7))) | bArr[i2]);
        if (i10 == 8) {
            this.FrostHunterServiceEliteCelestialThunder1757 = 0;
            this.FrostHunterBundlePulseFusionHero2475 = i11 + 1;
        }
        FrostHunterAlphaAnimationNeoCosmos5761();
    }

    public int FrostHunterConstraintSetCloneMasterUltraRogue2633() {
        return ((this.FrostHunterLifecycleBlazeGammaElite2889 - this.FrostHunterBundlePulseFusionHero2475) * 8) - this.FrostHunterServiceEliteCelestialThunder1757;
    }

    public void FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223(int i) {
        FrostHunterCanvasInfernoVortex4700.FrostHunterMeteringPointMegaCyber7955(this.FrostHunterServiceEliteCelestialThunder1757 == 0);
        this.FrostHunterBundlePulseFusionHero2475 += i;
        FrostHunterAlphaAnimationNeoCosmos5761();
    }

    public long FrostHunterFlowMaxDragonHero5809(int i) {
        if (i <= 32) {
            int FrostHunterRemoteConfigSpeedSpeed8566 = FrostHunterRemoteConfigSpeedSpeed8566(i);
            String str = FrostHunterGyroscopeHeroAlpha1995.FrostHunterAlphaAnimationNeoCosmos5761;
            return FrostHunterRemoteConfigSpeedSpeed8566 & 4294967295L;
        }
        int FrostHunterRemoteConfigSpeedSpeed85662 = FrostHunterRemoteConfigSpeedSpeed8566(i - 32);
        int FrostHunterRemoteConfigSpeedSpeed85663 = FrostHunterRemoteConfigSpeedSpeed8566(32);
        String str2 = FrostHunterGyroscopeHeroAlpha1995.FrostHunterAlphaAnimationNeoCosmos5761;
        return (FrostHunterRemoteConfigSpeedSpeed85663 & 4294967295L) | ((FrostHunterRemoteConfigSpeedSpeed85662 & 4294967295L) << 32);
    }

    public void FrostHunterFragmentBetaMegaVortex6025(byte[] bArr, int i) {
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = bArr;
        this.FrostHunterBundlePulseFusionHero2475 = 0;
        this.FrostHunterServiceEliteCelestialThunder1757 = 0;
        this.FrostHunterLifecycleBlazeGammaElite2889 = i;
    }

    public void FrostHunterKeyframeGammaGamma1197(FrostHunterLicensingSpectraPulse8868 frostHunterLicensingSpectraPulse8868) {
        FrostHunterFragmentBetaMegaVortex6025(frostHunterLicensingSpectraPulse8868.FrostHunterAlphaAnimationNeoCosmos5761, frostHunterLicensingSpectraPulse8868.FrostHunterBundlePulseFusionHero2475);
        FrostHunterServiceConnectionTurboPhoenixOmega6719(frostHunterLicensingSpectraPulse8868.FrostHunterConstraintSetCloneMasterUltraRogue2633 * 8);
    }

    public boolean FrostHunterLevelListDrawableFusionDragonHero2232() {
        switch (this.FrostHunterAlphaAnimationNeoCosmos5761) {
            case 1:
                boolean z = (this.FrostHunterConstraintSetCloneMasterUltraRogue2633[this.FrostHunterBundlePulseFusionHero2475] & (128 >> this.FrostHunterServiceEliteCelestialThunder1757)) != 0;
                FrostHunterLightSensorForceFusion4241();
                return z;
            default:
                boolean z2 = (((this.FrostHunterConstraintSetCloneMasterUltraRogue2633[this.FrostHunterServiceEliteCelestialThunder1757] & 255) >> this.FrostHunterLifecycleBlazeGammaElite2889) & 1) == 1;
                FrostHunterScaleAnimationStrikeSpark5059(1);
                return z2;
        }
    }

    public int FrostHunterLifecycleBlazeGammaElite2889() {
        return (this.FrostHunterBundlePulseFusionHero2475 * 8) + this.FrostHunterServiceEliteCelestialThunder1757;
    }

    public void FrostHunterLightSensorForceFusion4241() {
        int i = this.FrostHunterServiceEliteCelestialThunder1757 + 1;
        this.FrostHunterServiceEliteCelestialThunder1757 = i;
        if (i == 8) {
            this.FrostHunterServiceEliteCelestialThunder1757 = 0;
            this.FrostHunterBundlePulseFusionHero2475++;
        }
        FrostHunterAlphaAnimationNeoCosmos5761();
    }

    public int FrostHunterRemoteConfigSpeedSpeed8566(int i) {
        switch (this.FrostHunterAlphaAnimationNeoCosmos5761) {
            case 1:
                if (i == 0) {
                    return 0;
                }
                this.FrostHunterServiceEliteCelestialThunder1757 += i;
                int i2 = 0;
                while (true) {
                    int i3 = this.FrostHunterServiceEliteCelestialThunder1757;
                    if (i3 <= 8) {
                        byte[] bArr = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                        int i4 = this.FrostHunterBundlePulseFusionHero2475;
                        int i5 = ((-1) >>> (32 - i)) & (((255 & bArr[i4]) >> (8 - i3)) | i2);
                        if (i3 == 8) {
                            this.FrostHunterServiceEliteCelestialThunder1757 = 0;
                            this.FrostHunterBundlePulseFusionHero2475 = i4 + 1;
                        }
                        FrostHunterAlphaAnimationNeoCosmos5761();
                        return i5;
                    }
                    int i6 = i3 - 8;
                    this.FrostHunterServiceEliteCelestialThunder1757 = i6;
                    byte[] bArr2 = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                    int i7 = this.FrostHunterBundlePulseFusionHero2475;
                    this.FrostHunterBundlePulseFusionHero2475 = i7 + 1;
                    i2 |= (bArr2[i7] & 255) << i6;
                }
            default:
                int i8 = this.FrostHunterServiceEliteCelestialThunder1757;
                int min = Math.min(i, 8 - this.FrostHunterLifecycleBlazeGammaElite2889);
                byte[] bArr3 = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                int i9 = i8 + 1;
                int i10 = ((bArr3[i8] & 255) >> this.FrostHunterLifecycleBlazeGammaElite2889) & (255 >> (8 - min));
                while (min < i) {
                    i10 |= (bArr3[i9] & 255) << min;
                    min += 8;
                    i9++;
                }
                int i11 = i10 & ((-1) >>> (32 - i));
                FrostHunterScaleAnimationStrikeSpark5059(i);
                return i11;
        }
    }

    public void FrostHunterScaleAnimationStrikeSpark5059(int i) {
        int i2;
        switch (this.FrostHunterAlphaAnimationNeoCosmos5761) {
            case 1:
                int i3 = i / 8;
                int i4 = this.FrostHunterBundlePulseFusionHero2475 + i3;
                this.FrostHunterBundlePulseFusionHero2475 = i4;
                int i5 = (i - (i3 * 8)) + this.FrostHunterServiceEliteCelestialThunder1757;
                this.FrostHunterServiceEliteCelestialThunder1757 = i5;
                if (i5 > 7) {
                    this.FrostHunterBundlePulseFusionHero2475 = i4 + 1;
                    this.FrostHunterServiceEliteCelestialThunder1757 = i5 - 8;
                }
                FrostHunterAlphaAnimationNeoCosmos5761();
                break;
            default:
                int i6 = i / 8;
                int i7 = this.FrostHunterServiceEliteCelestialThunder1757 + i6;
                this.FrostHunterServiceEliteCelestialThunder1757 = i7;
                int i8 = (i - (i6 * 8)) + this.FrostHunterLifecycleBlazeGammaElite2889;
                this.FrostHunterLifecycleBlazeGammaElite2889 = i8;
                boolean z = true;
                if (i8 > 7) {
                    this.FrostHunterServiceEliteCelestialThunder1757 = i7 + 1;
                    this.FrostHunterLifecycleBlazeGammaElite2889 = i8 - 8;
                }
                int i9 = this.FrostHunterServiceEliteCelestialThunder1757;
                if (i9 < 0 || (i9 >= (i2 = this.FrostHunterBundlePulseFusionHero2475) && (i9 != i2 || this.FrostHunterLifecycleBlazeGammaElite2889 != 0))) {
                    z = false;
                }
                FrostHunterCanvasInfernoVortex4700.FrostHunterMeteringPointMegaCyber7955(z);
                break;
        }
    }

    public void FrostHunterServiceConnectionTurboPhoenixOmega6719(int i) {
        int i2 = i / 8;
        this.FrostHunterBundlePulseFusionHero2475 = i2;
        this.FrostHunterServiceEliteCelestialThunder1757 = i - (i2 * 8);
        FrostHunterAlphaAnimationNeoCosmos5761();
    }

    public int FrostHunterServiceEliteCelestialThunder1757() {
        FrostHunterCanvasInfernoVortex4700.FrostHunterMeteringPointMegaCyber7955(this.FrostHunterServiceEliteCelestialThunder1757 == 0);
        return this.FrostHunterBundlePulseFusionHero2475;
    }

    public FrostHunterCountDownTimerStormPulseFusion5949(byte[] bArr) {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = 2;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = bArr;
        this.FrostHunterBundlePulseFusionHero2475 = bArr.length;
    }

    public FrostHunterCountDownTimerStormPulseFusion5949(byte[] bArr, int i) {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = 1;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = bArr;
        this.FrostHunterLifecycleBlazeGammaElite2889 = i;
    }

    public FrostHunterCountDownTimerStormPulseFusion5949() {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = 1;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = FrostHunterGyroscopeHeroAlpha1995.FrostHunterConstraintSetCloneMasterUltraRogue2633;
    }
}
