package android.content.Context;

import java.util.List;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterDragEventStrikeHero9564 {
    public final List FrostHunterAlphaAnimationNeoCosmos5761;
    public final int FrostHunterConstraintSetCloneMasterUltraRogue2633;

    public FrostHunterDragEventStrikeHero9564(int i, List list) {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = list;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = i;
        if (list.isEmpty() && i == -1) {
            return;
        }
        if (!list.isEmpty()) {
            int size = list.size();
            if (i >= 0 && i < size) {
                return;
            }
        }
        StringBuilder FrostHunterServiceConnectionTurboPhoenixOmega6719 = FrostHunterKeyEventNovaXAlpha1220.FrostHunterServiceConnectionTurboPhoenixOmega6719("Invalid 'NavigationEventHistory' state:  'currentIndex' must be within the bounds of 'mergedHistory' (or -1 if empty). Received: currentIndex = '", i, "', bounds = '");
        FrostHunterServiceConnectionTurboPhoenixOmega6719.append(new FrostHunterFirebaseModelInterpreterOlympianStorm9227(0, list.size() - 1, 1));
        FrostHunterServiceConnectionTurboPhoenixOmega6719.append("'.");
        throw new IllegalArgumentException(FrostHunterServiceConnectionTurboPhoenixOmega6719.toString().toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || FrostHunterDragEventStrikeHero9564.class != obj.getClass()) {
            return false;
        }
        FrostHunterDragEventStrikeHero9564 frostHunterDragEventStrikeHero9564 = (FrostHunterDragEventStrikeHero9564) obj;
        return this.FrostHunterConstraintSetCloneMasterUltraRogue2633 == frostHunterDragEventStrikeHero9564.FrostHunterConstraintSetCloneMasterUltraRogue2633 && FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(this.FrostHunterAlphaAnimationNeoCosmos5761, frostHunterDragEventStrikeHero9564.FrostHunterAlphaAnimationNeoCosmos5761);
    }

    public final int hashCode() {
        return this.FrostHunterAlphaAnimationNeoCosmos5761.hashCode() + (this.FrostHunterConstraintSetCloneMasterUltraRogue2633 * 31);
    }

    public final String toString() {
        return "NavigationEventHistory(currentIndex=" + this.FrostHunterConstraintSetCloneMasterUltraRogue2633 + ", mergedHistory=" + this.FrostHunterAlphaAnimationNeoCosmos5761 + ')';
    }

    public FrostHunterDragEventStrikeHero9564() {
        this(-1, FrostHunterAssetManagerForceNebulaNebula4990.FrostHunterCameraXPixelTurboCosmos9814);
    }
}
