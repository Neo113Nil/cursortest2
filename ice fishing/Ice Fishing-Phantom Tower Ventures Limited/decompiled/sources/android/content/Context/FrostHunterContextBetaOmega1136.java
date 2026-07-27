package android.content.Context;

import java.util.ArrayList;
import java.util.Map;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterContextBetaOmega1136 {
    public final boolean FrostHunterAlphaAnimationNeoCosmos5761;
    public final FrostHunterCoroutineScopePrimeSpark1417 FrostHunterBundlePulseFusionHero2475;
    public final Map FrostHunterCameraXPixelTurboCosmos9814;
    public final boolean FrostHunterConstraintSetCloneMasterUltraRogue2633;
    public final Long FrostHunterLevelListDrawableFusionDragonHero2232;
    public final Long FrostHunterLifecycleBlazeGammaElite2889;
    public final Long FrostHunterRemoteConfigSpeedSpeed8566;
    public final Long FrostHunterServiceEliteCelestialThunder1757;

    public FrostHunterContextBetaOmega1136(boolean z, boolean z2, FrostHunterCoroutineScopePrimeSpark1417 frostHunterCoroutineScopePrimeSpark1417, Long l, Long l2, Long l3, Long l4, Map map) {
        map.getClass();
        this.FrostHunterAlphaAnimationNeoCosmos5761 = z;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = z2;
        this.FrostHunterBundlePulseFusionHero2475 = frostHunterCoroutineScopePrimeSpark1417;
        this.FrostHunterServiceEliteCelestialThunder1757 = l;
        this.FrostHunterLifecycleBlazeGammaElite2889 = l2;
        this.FrostHunterLevelListDrawableFusionDragonHero2232 = l3;
        this.FrostHunterRemoteConfigSpeedSpeed8566 = l4;
        this.FrostHunterCameraXPixelTurboCosmos9814 = FrostHunterBroadcastHeroSpectra7879.FrostHunterNestedScrollViewPixelPhantom8605(map);
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.FrostHunterAlphaAnimationNeoCosmos5761) {
            arrayList.add("isRegularFile");
        }
        if (this.FrostHunterConstraintSetCloneMasterUltraRogue2633) {
            arrayList.add("isDirectory");
        }
        Long l = this.FrostHunterServiceEliteCelestialThunder1757;
        if (l != null) {
            arrayList.add("byteCount=" + l.longValue());
        }
        Long l2 = this.FrostHunterLifecycleBlazeGammaElite2889;
        if (l2 != null) {
            arrayList.add("createdAt=" + l2.longValue());
        }
        Long l3 = this.FrostHunterLevelListDrawableFusionDragonHero2232;
        if (l3 != null) {
            arrayList.add("lastModifiedAt=" + l3.longValue());
        }
        Long l4 = this.FrostHunterRemoteConfigSpeedSpeed8566;
        if (l4 != null) {
            arrayList.add("lastAccessedAt=" + l4.longValue());
        }
        Map map = this.FrostHunterCameraXPixelTurboCosmos9814;
        if (!map.isEmpty()) {
            arrayList.add("extras=" + map);
        }
        return FrostHunterStrictModeNebulaTitanPrime4338.FrostHunterTransformNovaBetaNovaX5251(arrayList, ", ", "FileMetadata(", ")", null, 56);
    }

    public /* synthetic */ FrostHunterContextBetaOmega1136(boolean z, boolean z2, FrostHunterCoroutineScopePrimeSpark1417 frostHunterCoroutineScopePrimeSpark1417, Long l, Long l2, Long l3, Long l4) {
        this(z, z2, frostHunterCoroutineScopePrimeSpark1417, l, l2, l3, l4, FrostHunterLayoutInfernoStrike4529.FrostHunterCameraXPixelTurboCosmos9814);
    }
}
