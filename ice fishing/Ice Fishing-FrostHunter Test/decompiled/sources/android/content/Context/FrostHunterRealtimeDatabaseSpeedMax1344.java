package android.content.Context;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterRealtimeDatabaseSpeedMax1344 {
    public final long FrostHunterAlphaAnimationNeoCosmos5761;

    public static final int FrostHunterAlertDialogAuroraDelta3200(long j) {
        int i = (int) (3 & j);
        return ((int) (j >> 2)) & ((1 << (((((i & 2) >> 1) * 3) + ((i & 1) << 1)) + 13)) - 1);
    }

    public static long FrostHunterAlphaAnimationNeoCosmos5761(int i, int i2, int i3, int i4, int i5, long j) {
        if ((i5 & 1) != 0) {
            i = FrostHunterAlertDialogAuroraDelta3200(j);
        }
        if ((i5 & 2) != 0) {
            i2 = FrostHunterCameraXPixelTurboCosmos9814(j);
        }
        if ((i5 & 4) != 0) {
            i3 = FrostHunterFlowMaxDragonHero5809(j);
        }
        if ((i5 & 8) != 0) {
            i4 = FrostHunterRemoteConfigSpeedSpeed8566(j);
        }
        if (i2 < i || i4 < i3 || i < 0 || i3 < 0) {
            FrostHunterMagnetometerCosmosFusion9100.FrostHunterAlphaAnimationNeoCosmos5761("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return FrostHunterActivityGammaForce8909.FrostHunterRemoteConfigSpeedSpeed8566(i, i2, i3, i4);
    }

    public static final boolean FrostHunterBundlePulseFusionHero2475(long j) {
        int i = (int) (3 & j);
        int i2 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
        return (((int) (j >> (i2 + 46))) & ((1 << (18 - i2)) - 1)) != 0;
    }

    public static final int FrostHunterCameraXPixelTurboCosmos9814(long j) {
        int i = (int) (3 & j);
        int i2 = (int) (j >> 33);
        int i3 = i2 & ((1 << (((((i & 2) >> 1) * 3) + ((i & 1) << 1)) + 13)) - 1);
        if (i3 == 0) {
            return Integer.MAX_VALUE;
        }
        return i3 - 1;
    }

    public static final boolean FrostHunterConstraintSetCloneMasterUltraRogue2633(long j, long j2) {
        return j == j2;
    }

    public static final int FrostHunterFlowMaxDragonHero5809(long j) {
        int i = (int) (3 & j);
        int i2 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
        return ((int) (j >> (i2 + 15))) & ((1 << (18 - i2)) - 1);
    }

    public static String FrostHunterFragmentBetaMegaVortex6025(long j) {
        int FrostHunterCameraXPixelTurboCosmos9814 = FrostHunterCameraXPixelTurboCosmos9814(j);
        String valueOf = FrostHunterCameraXPixelTurboCosmos9814 == Integer.MAX_VALUE ? "Infinity" : String.valueOf(FrostHunterCameraXPixelTurboCosmos9814);
        int FrostHunterRemoteConfigSpeedSpeed8566 = FrostHunterRemoteConfigSpeedSpeed8566(j);
        return "Constraints(minWidth = " + FrostHunterAlertDialogAuroraDelta3200(j) + ", maxWidth = " + valueOf + ", minHeight = " + FrostHunterFlowMaxDragonHero5809(j) + ", maxHeight = " + (FrostHunterRemoteConfigSpeedSpeed8566 != Integer.MAX_VALUE ? String.valueOf(FrostHunterRemoteConfigSpeedSpeed8566) : "Infinity") + ')';
    }

    public static final boolean FrostHunterKeyframeGammaGamma1197(long j) {
        int i = (int) (3 & j);
        int i2 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
        return ((((int) (j >> 33)) & ((1 << (i2 + 13)) - 1)) - 1 == 0) | ((((int) (j >> (i2 + 46))) & ((1 << (18 - i2)) - 1)) - 1 == 0);
    }

    public static final boolean FrostHunterLevelListDrawableFusionDragonHero2232(long j) {
        int i = (int) (3 & j);
        int i2 = (1 << (((((i & 2) >> 1) * 3) + ((i & 1) << 1)) + 13)) - 1;
        int i3 = ((int) (j >> 2)) & i2;
        int i4 = ((int) (j >> 33)) & i2;
        return i3 == (i4 == 0 ? Integer.MAX_VALUE : i4 - 1);
    }

    public static final boolean FrostHunterLifecycleBlazeGammaElite2889(long j) {
        int i = (int) (3 & j);
        int i2 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
        int i3 = (1 << (18 - i2)) - 1;
        int i4 = ((int) (j >> (i2 + 15))) & i3;
        int i5 = ((int) (j >> (i2 + 46))) & i3;
        return i4 == (i5 == 0 ? Integer.MAX_VALUE : i5 - 1);
    }

    public static final int FrostHunterRemoteConfigSpeedSpeed8566(long j) {
        int i = (int) (3 & j);
        int i2 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
        int i3 = ((int) (j >> (i2 + 46))) & ((1 << (18 - i2)) - 1);
        if (i3 == 0) {
            return Integer.MAX_VALUE;
        }
        return i3 - 1;
    }

    public static final boolean FrostHunterServiceEliteCelestialThunder1757(long j) {
        int i = (int) (3 & j);
        return (((int) (j >> 33)) & ((1 << (((((i & 2) >> 1) * 3) + ((i & 1) << 1)) + 13)) - 1)) != 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof FrostHunterRealtimeDatabaseSpeedMax1344) {
            return this.FrostHunterAlphaAnimationNeoCosmos5761 == ((FrostHunterRealtimeDatabaseSpeedMax1344) obj).FrostHunterAlphaAnimationNeoCosmos5761;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.FrostHunterAlphaAnimationNeoCosmos5761);
    }

    public final String toString() {
        return FrostHunterFragmentBetaMegaVortex6025(this.FrostHunterAlphaAnimationNeoCosmos5761);
    }
}
