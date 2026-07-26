package android.content.Context;

import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterCoroutineScopeCelestialDeltaMax2495 {
    public static final /* synthetic */ int FrostHunterLightSensorForceFusion4241 = 0;
    public final boolean FrostHunterAlertDialogAuroraDelta3200;
    public final boolean FrostHunterAlphaAnimationNeoCosmos5761;
    public final int FrostHunterBundlePulseFusionHero2475;
    public final int FrostHunterCameraXPixelTurboCosmos9814;
    public final boolean FrostHunterConstraintSetCloneMasterUltraRogue2633;
    public final int FrostHunterFlowMaxDragonHero5809;
    public final boolean FrostHunterFragmentBetaMegaVortex6025;
    public final boolean FrostHunterKeyframeGammaGamma1197;
    public final boolean FrostHunterLevelListDrawableFusionDragonHero2232;
    public final boolean FrostHunterLifecycleBlazeGammaElite2889;
    public final boolean FrostHunterRemoteConfigSpeedSpeed8566;
    public String FrostHunterServiceConnectionTurboPhoenixOmega6719;
    public final int FrostHunterServiceEliteCelestialThunder1757;

    static {
        long FrostHunterRewardedAdMasterStrike9463;
        long convert;
        FrostHunterBottomSheetEclipseUltraShadow6009 frostHunterBottomSheetEclipseUltraShadow6009 = FrostHunterContextPhantomVortex1776.FrostHunterCameraXPixelTurboCosmos9814;
        FrostHunterPagingSourceSpeedNeo6157 frostHunterPagingSourceSpeedNeo6157 = FrostHunterPagingSourceSpeedNeo6157.SECONDS;
        if (frostHunterPagingSourceSpeedNeo6157.compareTo(frostHunterPagingSourceSpeedNeo6157) <= 0) {
            FrostHunterRewardedAdMasterStrike9463 = TimeUnit.NANOSECONDS.convert(2147483647L, TimeUnit.SECONDS) << 1;
            int i = FrostHunterJobIntentServiceForceBlazeForce7061.FrostHunterAlphaAnimationNeoCosmos5761;
        } else {
            FrostHunterRewardedAdMasterStrike9463 = FrostHunterBindingAdapterSpeedNeo6677.FrostHunterRewardedAdMasterStrike9463(2147483647L, frostHunterPagingSourceSpeedNeo6157);
        }
        if (FrostHunterRewardedAdMasterStrike9463 == FrostHunterContextPhantomVortex1776.FrostHunterFlowMaxDragonHero5809) {
            convert = Long.MAX_VALUE;
        } else if (FrostHunterRewardedAdMasterStrike9463 == FrostHunterContextPhantomVortex1776.FrostHunterAlertDialogAuroraDelta3200) {
            convert = Long.MIN_VALUE;
        } else {
            convert = frostHunterPagingSourceSpeedNeo6157.FrostHunterCameraXPixelTurboCosmos9814.convert(FrostHunterRewardedAdMasterStrike9463 >> 1, ((((int) FrostHunterRewardedAdMasterStrike9463) & 1) == 0 ? FrostHunterPagingSourceSpeedNeo6157.NANOSECONDS : FrostHunterPagingSourceSpeedNeo6157.MILLISECONDS).FrostHunterCameraXPixelTurboCosmos9814);
        }
        if (convert >= 0) {
            return;
        }
        FrostHunterFlowHyperionVortexDelta5013.FrostHunterRemoteConfigSpeedSpeed8566(FrostHunterKeyEventNovaXAlpha1220.FrostHunterAlertDialogAuroraDelta3200("maxStale < 0: ", convert));
    }

    public FrostHunterCoroutineScopeCelestialDeltaMax2495(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, String str) {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = z;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = z2;
        this.FrostHunterBundlePulseFusionHero2475 = i;
        this.FrostHunterServiceEliteCelestialThunder1757 = i2;
        this.FrostHunterLifecycleBlazeGammaElite2889 = z3;
        this.FrostHunterLevelListDrawableFusionDragonHero2232 = z4;
        this.FrostHunterRemoteConfigSpeedSpeed8566 = z5;
        this.FrostHunterCameraXPixelTurboCosmos9814 = i3;
        this.FrostHunterFlowMaxDragonHero5809 = i4;
        this.FrostHunterAlertDialogAuroraDelta3200 = z6;
        this.FrostHunterKeyframeGammaGamma1197 = z7;
        this.FrostHunterFragmentBetaMegaVortex6025 = z8;
        this.FrostHunterServiceConnectionTurboPhoenixOmega6719 = str;
    }

    public final String toString() {
        String str = this.FrostHunterServiceConnectionTurboPhoenixOmega6719;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        if (this.FrostHunterAlphaAnimationNeoCosmos5761) {
            sb.append("no-cache, ");
        }
        if (this.FrostHunterConstraintSetCloneMasterUltraRogue2633) {
            sb.append("no-store, ");
        }
        int i = this.FrostHunterBundlePulseFusionHero2475;
        if (i != -1) {
            sb.append("max-age=");
            sb.append(i);
            sb.append(", ");
        }
        int i2 = this.FrostHunterServiceEliteCelestialThunder1757;
        if (i2 != -1) {
            sb.append("s-maxage=");
            sb.append(i2);
            sb.append(", ");
        }
        if (this.FrostHunterLifecycleBlazeGammaElite2889) {
            sb.append("private, ");
        }
        if (this.FrostHunterLevelListDrawableFusionDragonHero2232) {
            sb.append("public, ");
        }
        if (this.FrostHunterRemoteConfigSpeedSpeed8566) {
            sb.append("must-revalidate, ");
        }
        int i3 = this.FrostHunterCameraXPixelTurboCosmos9814;
        if (i3 != -1) {
            sb.append("max-stale=");
            sb.append(i3);
            sb.append(", ");
        }
        int i4 = this.FrostHunterFlowMaxDragonHero5809;
        if (i4 != -1) {
            sb.append("min-fresh=");
            sb.append(i4);
            sb.append(", ");
        }
        if (this.FrostHunterAlertDialogAuroraDelta3200) {
            sb.append("only-if-cached, ");
        }
        if (this.FrostHunterKeyframeGammaGamma1197) {
            sb.append("no-transform, ");
        }
        if (this.FrostHunterFragmentBetaMegaVortex6025) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length()).getClass();
        String sb2 = sb.toString();
        this.FrostHunterServiceConnectionTurboPhoenixOmega6719 = sb2;
        return sb2;
    }
}
