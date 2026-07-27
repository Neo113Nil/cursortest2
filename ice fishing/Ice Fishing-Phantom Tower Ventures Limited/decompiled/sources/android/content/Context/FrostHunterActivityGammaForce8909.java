package android.content.Context;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public abstract class FrostHunterActivityGammaForce8909 {
    public static final Void FrostHunterAlertDialogAuroraDelta3200(int i) {
        throw new IllegalArgumentException(FrostHunterKeyEventNovaXAlpha1220.FrostHunterFlowMaxDragonHero5809("Can't represent a size of ", i, " in Constraints"));
    }

    public static final long FrostHunterAlphaAnimationNeoCosmos5761(int i, int i2, int i3, int i4) {
        if (!((i3 >= 0) & (i2 >= i) & (i4 >= i3) & (i >= 0))) {
            FrostHunterMagnetometerCosmosFusion9100.FrostHunterAlphaAnimationNeoCosmos5761("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return FrostHunterRemoteConfigSpeedSpeed8566(i, i2, i3, i4);
    }

    public static final int FrostHunterBundlePulseFusionHero2475(int i) {
        if (i < 8191) {
            return 13;
        }
        if (i < 32767) {
            return 15;
        }
        if (i < 65535) {
            return 16;
        }
        return i < 262143 ? 18 : 255;
    }

    public static final long FrostHunterCameraXPixelTurboCosmos9814(int i, int i2, long j) {
        int FrostHunterAlertDialogAuroraDelta3200 = FrostHunterRealtimeDatabaseSpeedMax1344.FrostHunterAlertDialogAuroraDelta3200(j) + i;
        if (FrostHunterAlertDialogAuroraDelta3200 < 0) {
            FrostHunterAlertDialogAuroraDelta3200 = 0;
        }
        int FrostHunterCameraXPixelTurboCosmos9814 = FrostHunterRealtimeDatabaseSpeedMax1344.FrostHunterCameraXPixelTurboCosmos9814(j);
        if (FrostHunterCameraXPixelTurboCosmos9814 != Integer.MAX_VALUE && (FrostHunterCameraXPixelTurboCosmos9814 = FrostHunterCameraXPixelTurboCosmos9814 + i) < 0) {
            FrostHunterCameraXPixelTurboCosmos9814 = 0;
        }
        int FrostHunterFlowMaxDragonHero5809 = FrostHunterRealtimeDatabaseSpeedMax1344.FrostHunterFlowMaxDragonHero5809(j) + i2;
        if (FrostHunterFlowMaxDragonHero5809 < 0) {
            FrostHunterFlowMaxDragonHero5809 = 0;
        }
        int FrostHunterRemoteConfigSpeedSpeed8566 = FrostHunterRealtimeDatabaseSpeedMax1344.FrostHunterRemoteConfigSpeedSpeed8566(j);
        return FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterAlertDialogAuroraDelta3200, FrostHunterCameraXPixelTurboCosmos9814, FrostHunterFlowMaxDragonHero5809, (FrostHunterRemoteConfigSpeedSpeed8566 == Integer.MAX_VALUE || (FrostHunterRemoteConfigSpeedSpeed8566 = FrostHunterRemoteConfigSpeedSpeed8566 + i2) >= 0) ? FrostHunterRemoteConfigSpeedSpeed8566 : 0);
    }

    public static /* synthetic */ long FrostHunterConstraintSetCloneMasterUltraRogue2633(int i, int i2, int i3) {
        if ((i3 & 2) != 0) {
            i = Integer.MAX_VALUE;
        }
        if ((i3 & 8) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        return FrostHunterAlphaAnimationNeoCosmos5761(0, i, 0, i2);
    }

    public static final void FrostHunterFlowMaxDragonHero5809(int i, int i2) {
        throw new IllegalArgumentException("Can't represent a width of " + i + " and height of " + i2 + " in Constraints");
    }

    public static final int FrostHunterLevelListDrawableFusionDragonHero2232(int i, long j) {
        int FrostHunterAlertDialogAuroraDelta3200 = FrostHunterRealtimeDatabaseSpeedMax1344.FrostHunterAlertDialogAuroraDelta3200(j);
        int FrostHunterCameraXPixelTurboCosmos9814 = FrostHunterRealtimeDatabaseSpeedMax1344.FrostHunterCameraXPixelTurboCosmos9814(j);
        if (i < FrostHunterAlertDialogAuroraDelta3200) {
            i = FrostHunterAlertDialogAuroraDelta3200;
        }
        return i > FrostHunterCameraXPixelTurboCosmos9814 ? FrostHunterCameraXPixelTurboCosmos9814 : i;
    }

    public static final int FrostHunterLifecycleBlazeGammaElite2889(int i, long j) {
        int FrostHunterFlowMaxDragonHero5809 = FrostHunterRealtimeDatabaseSpeedMax1344.FrostHunterFlowMaxDragonHero5809(j);
        int FrostHunterRemoteConfigSpeedSpeed8566 = FrostHunterRealtimeDatabaseSpeedMax1344.FrostHunterRemoteConfigSpeedSpeed8566(j);
        if (i < FrostHunterFlowMaxDragonHero5809) {
            i = FrostHunterFlowMaxDragonHero5809;
        }
        return i > FrostHunterRemoteConfigSpeedSpeed8566 ? FrostHunterRemoteConfigSpeedSpeed8566 : i;
    }

    public static final long FrostHunterRemoteConfigSpeedSpeed8566(int i, int i2, int i3, int i4) {
        int i5 = i4 == Integer.MAX_VALUE ? i3 : i4;
        int FrostHunterBundlePulseFusionHero2475 = FrostHunterBundlePulseFusionHero2475(i5);
        int i6 = i2 == Integer.MAX_VALUE ? i : i2;
        int FrostHunterBundlePulseFusionHero24752 = FrostHunterBundlePulseFusionHero2475(i6);
        if (FrostHunterBundlePulseFusionHero2475 + FrostHunterBundlePulseFusionHero24752 > 31) {
            FrostHunterFlowMaxDragonHero5809(i6, i5);
        }
        int i7 = i2 + 1;
        int i8 = i4 + 1;
        int i9 = FrostHunterBundlePulseFusionHero24752 - 13;
        return ((i7 & (~(i7 >> 31))) << 33) | ((i9 >> 1) + (i9 & 1)) | (i << 2) | (i3 << (FrostHunterBundlePulseFusionHero24752 + 2)) | ((i8 & (~(i8 >> 31))) << (FrostHunterBundlePulseFusionHero24752 + 33));
    }

    public static final long FrostHunterServiceEliteCelestialThunder1757(long j, long j2) {
        int i = (int) (j2 >> 32);
        int FrostHunterAlertDialogAuroraDelta3200 = FrostHunterRealtimeDatabaseSpeedMax1344.FrostHunterAlertDialogAuroraDelta3200(j);
        int FrostHunterCameraXPixelTurboCosmos9814 = FrostHunterRealtimeDatabaseSpeedMax1344.FrostHunterCameraXPixelTurboCosmos9814(j);
        if (i < FrostHunterAlertDialogAuroraDelta3200) {
            i = FrostHunterAlertDialogAuroraDelta3200;
        }
        if (i <= FrostHunterCameraXPixelTurboCosmos9814) {
            FrostHunterCameraXPixelTurboCosmos9814 = i;
        }
        int i2 = (int) (j2 & 4294967295L);
        int FrostHunterFlowMaxDragonHero5809 = FrostHunterRealtimeDatabaseSpeedMax1344.FrostHunterFlowMaxDragonHero5809(j);
        int FrostHunterRemoteConfigSpeedSpeed8566 = FrostHunterRealtimeDatabaseSpeedMax1344.FrostHunterRemoteConfigSpeedSpeed8566(j);
        if (i2 < FrostHunterFlowMaxDragonHero5809) {
            i2 = FrostHunterFlowMaxDragonHero5809;
        }
        if (i2 <= FrostHunterRemoteConfigSpeedSpeed8566) {
            FrostHunterRemoteConfigSpeedSpeed8566 = i2;
        }
        return (FrostHunterCameraXPixelTurboCosmos9814 << 32) | (FrostHunterRemoteConfigSpeedSpeed8566 & 4294967295L);
    }
}
