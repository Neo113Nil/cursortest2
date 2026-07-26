package android.content.Context;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterConfigurationDeltaUltra2067 extends FrostHunterWindowManagerTitaniumSpectraOlympian5970 implements Serializable {
    public final Comparator[] FrostHunterCameraXPixelTurboCosmos9814;

    public FrostHunterConfigurationDeltaUltra2067(FrostHunterFlipAnimationOlympianInfernoHyper5815 frostHunterFlipAnimationOlympianInfernoHyper5815, FrostHunterFlipAnimationOlympianInfernoHyper5815 frostHunterFlipAnimationOlympianInfernoHyper58152) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = new Comparator[]{frostHunterFlipAnimationOlympianInfernoHyper5815, frostHunterFlipAnimationOlympianInfernoHyper58152};
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = 0;
        while (true) {
            Comparator[] comparatorArr = this.FrostHunterCameraXPixelTurboCosmos9814;
            if (i >= comparatorArr.length) {
                return 0;
            }
            int compare = comparatorArr[i].compare(obj, obj2);
            if (compare != 0) {
                return compare;
            }
            i++;
        }
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof FrostHunterConfigurationDeltaUltra2067) {
            return Arrays.equals(this.FrostHunterCameraXPixelTurboCosmos9814, ((FrostHunterConfigurationDeltaUltra2067) obj).FrostHunterCameraXPixelTurboCosmos9814);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.FrostHunterCameraXPixelTurboCosmos9814);
    }

    public final String toString() {
        return FrostHunterKeyEventNovaXAlpha1220.FrostHunterFragmentBetaMegaVortex6025(new StringBuilder("Ordering.compound("), Arrays.toString(this.FrostHunterCameraXPixelTurboCosmos9814), ")");
    }
}
