package android.content.Context;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterAnalyticsHyperOmega3209 implements FrostHunterBitmapTurboStormHyperion1313 {
    public final float FrostHunterAlphaAnimationNeoCosmos5761;
    public final FrostHunterLightSensorStrikeSpark4316 FrostHunterConstraintSetCloneMasterUltraRogue2633;

    public FrostHunterAnalyticsHyperOmega3209(float f, float f2) {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = f2;
        FrostHunterLightSensorStrikeSpark4316 frostHunterLightSensorStrikeSpark4316 = new FrostHunterLightSensorStrikeSpark4316();
        frostHunterLightSensorStrikeSpark4316.FrostHunterAlphaAnimationNeoCosmos5761 = 1.0f;
        double sqrt = Math.sqrt(50.0d);
        frostHunterLightSensorStrikeSpark4316.FrostHunterConstraintSetCloneMasterUltraRogue2633 = sqrt;
        if (((float) (sqrt * sqrt)) <= 0.0f) {
            FrostHunterServiceInfoUltraPulseNova4663.FrostHunterAlphaAnimationNeoCosmos5761("Spring stiffness constant must be positive.");
        }
        frostHunterLightSensorStrikeSpark4316.FrostHunterConstraintSetCloneMasterUltraRogue2633 = Math.sqrt(f);
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = frostHunterLightSensorStrikeSpark4316;
    }

    @Override // android.content.Context.FrostHunterBitmapTurboStormHyperion1313
    public final float FrostHunterBundlePulseFusionHero2475(long j, float f, float f2, float f3) {
        FrostHunterLightSensorStrikeSpark4316 frostHunterLightSensorStrikeSpark4316 = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        frostHunterLightSensorStrikeSpark4316.FrostHunterAlphaAnimationNeoCosmos5761 = f2;
        return Float.intBitsToFloat((int) (frostHunterLightSensorStrikeSpark4316.FrostHunterAlphaAnimationNeoCosmos5761(f, f3, j / 1000000) & 4294967295L));
    }

    @Override // android.content.Context.FrostHunterBitmapTurboStormHyperion1313
    public final float FrostHunterConstraintSetCloneMasterUltraRogue2633(long j, float f, float f2, float f3) {
        FrostHunterLightSensorStrikeSpark4316 frostHunterLightSensorStrikeSpark4316 = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        frostHunterLightSensorStrikeSpark4316.FrostHunterAlphaAnimationNeoCosmos5761 = f2;
        return Float.intBitsToFloat((int) (frostHunterLightSensorStrikeSpark4316.FrostHunterAlphaAnimationNeoCosmos5761(f, f3, j / 1000000) >> 32));
    }

    @Override // android.content.Context.FrostHunterBitmapTurboStormHyperion1313
    public final float FrostHunterLifecycleBlazeGammaElite2889(float f, float f2, float f3) {
        return 0.0f;
    }

    @Override // android.content.Context.FrostHunterBitmapTurboStormHyperion1313
    public final long FrostHunterServiceEliteCelestialThunder1757(float f, float f2, float f3) {
        long j;
        double d = this.FrostHunterConstraintSetCloneMasterUltraRogue2633.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        float f4 = this.FrostHunterAlphaAnimationNeoCosmos5761;
        float f5 = (f - f2) / f4;
        double d2 = (float) (d * d);
        double d3 = f3 / f4;
        double d4 = f5;
        double sqrt = Math.sqrt(d2) * 2.0d;
        double d5 = (sqrt * sqrt) - (d2 * 4.0d);
        double sqrt2 = d5 < 0.0d ? 0.0d : Math.sqrt(d5);
        if (d5 < 0.0d) {
            Math.sqrt(Math.abs(d5));
        }
        double d6 = ((-sqrt) + sqrt2) * 0.5d;
        if (d4 == 0.0d && d3 == 0.0d) {
            j = 0;
        } else {
            if (d4 < 0.0d) {
                d3 = -d3;
            }
            double abs = Math.abs(d4);
            double d7 = d6 * abs;
            double d8 = d3 - d7;
            double log = Math.log(Math.abs(1.0d / abs)) / d6;
            double log2 = Math.log(Math.abs(1.0d / d8));
            double d9 = log2;
            for (int i = 0; i < 6; i++) {
                d9 = log2 - Math.log(Math.abs(d9 / d6));
            }
            double d10 = d9 / d6;
            if ((Double.doubleToRawLongBits(log) & Long.MAX_VALUE) >= 9218868437227405312L) {
                log = d10;
            } else if ((Double.doubleToRawLongBits(d10) & Long.MAX_VALUE) < 9218868437227405312L) {
                log = Math.max(log, d10);
            }
            double d11 = (-(d7 + d8)) / (d6 * d8);
            double d12 = d6 * d11;
            double exp = (Math.exp(d12) * d8 * d11) + (Math.exp(d12) * abs);
            double d13 = -1.0d;
            if (!Double.isNaN(d11) && d11 > 0.0d) {
                if (d11 <= 0.0d || (-exp) >= 1.0d) {
                    log = (-(2.0d / d6)) - (abs / d8);
                    d13 = 1.0d;
                } else if (d8 < 0.0d && abs > 0.0d) {
                    log = 0.0d;
                }
            }
            double d14 = Double.MAX_VALUE;
            int i2 = 0;
            while (d14 > 0.001d && i2 < 100) {
                i2++;
                double d15 = d6 * log;
                double exp2 = log - (((Math.exp(d15) * ((d8 * log) + abs)) + d13) / (Math.exp(d15) * (((d15 + 1.0d) * d8) + d7)));
                d14 = Math.abs(log - exp2);
                log = exp2;
            }
            j = (long) (log * 1000.0d);
        }
        return j * 1000000;
    }
}
