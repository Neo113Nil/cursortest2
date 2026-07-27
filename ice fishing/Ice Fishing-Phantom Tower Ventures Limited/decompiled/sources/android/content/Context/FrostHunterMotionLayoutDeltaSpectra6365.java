package android.content.Context;

import java.math.RoundingMode;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public abstract class FrostHunterMotionLayoutDeltaSpectra6365 {
    public static final /* synthetic */ int FrostHunterAlphaAnimationNeoCosmos5761 = 0;

    static {
        Math.log(2.0d);
    }

    public static boolean FrostHunterAlphaAnimationNeoCosmos5761(double d) {
        if (FrostHunterExecutorSolarPhoenix3849.FrostHunterBillingClientFusionVortex9008(d)) {
            return d == 0.0d || 52 - Long.numberOfTrailingZeros(FrostHunterExecutorSolarPhoenix3849.FrostHunterViewPhantomNeo1634(d)) <= Math.getExponent(d);
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int FrostHunterBundlePulseFusionHero2475(double d) {
        boolean FrostHunterConstraintSetCloneMasterUltraRogue2633;
        RoundingMode roundingMode = RoundingMode.CEILING;
        FrostHunterCanvasInfernoVortex4700.FrostHunterCameraXTurboCelestialHero5430("x must be positive and finite", d > 0.0d && FrostHunterExecutorSolarPhoenix3849.FrostHunterBillingClientFusionVortex9008(d));
        int exponent = Math.getExponent(d);
        if (Math.getExponent(d) < -1022) {
            return FrostHunterBundlePulseFusionHero2475(d * 4.503599627370496E15d) - 52;
        }
        switch (FrostHunterFragmentManagerStormNeo8499.FrostHunterAlphaAnimationNeoCosmos5761[roundingMode.ordinal()]) {
            case 1:
                FrostHunterExecutorSolarPhoenix3849.FrostHunterFragmentBetaMegaVortex6025(FrostHunterConstraintSetCloneMasterUltraRogue2633(d));
                return !r2 ? exponent + 1 : exponent;
            case 2:
                if (!r2) {
                }
                break;
            case 3:
                r2 = !FrostHunterConstraintSetCloneMasterUltraRogue2633(d);
                if (!r2) {
                }
                break;
            case 4:
                r2 = exponent < 0;
                FrostHunterConstraintSetCloneMasterUltraRogue2633 = FrostHunterConstraintSetCloneMasterUltraRogue2633(d);
                r2 &= !FrostHunterConstraintSetCloneMasterUltraRogue2633;
                if (!r2) {
                }
                break;
            case FrostHunterRemoteModelManagerCyberLegend2797.STRING_FIELD_NUMBER /* 5 */:
                r2 = exponent >= 0;
                FrostHunterConstraintSetCloneMasterUltraRogue2633 = FrostHunterConstraintSetCloneMasterUltraRogue2633(d);
                r2 &= !FrostHunterConstraintSetCloneMasterUltraRogue2633;
                if (!r2) {
                }
                break;
            case FrostHunterRemoteModelManagerCyberLegend2797.STRING_SET_FIELD_NUMBER /* 6 */:
            case FrostHunterRemoteModelManagerCyberLegend2797.DOUBLE_FIELD_NUMBER /* 7 */:
            case FrostHunterRemoteModelManagerCyberLegend2797.BYTES_FIELD_NUMBER /* 8 */:
                double longBitsToDouble = Double.longBitsToDouble((Double.doubleToRawLongBits(d) & 4503599627370495L) | 4607182418800017408L);
                if (longBitsToDouble * longBitsToDouble > 2.0d) {
                    r2 = true;
                }
                if (!r2) {
                }
                break;
            default:
                throw new AssertionError();
        }
    }

    public static boolean FrostHunterConstraintSetCloneMasterUltraRogue2633(double d) {
        if (d > 0.0d && FrostHunterExecutorSolarPhoenix3849.FrostHunterBillingClientFusionVortex9008(d)) {
            long FrostHunterViewPhantomNeo1634 = FrostHunterExecutorSolarPhoenix3849.FrostHunterViewPhantomNeo1634(d);
            if ((FrostHunterViewPhantomNeo1634 & (FrostHunterViewPhantomNeo1634 - 1)) == 0) {
                return true;
            }
        }
        return false;
    }
}
