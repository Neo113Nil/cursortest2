package android.content.Context;

import java.io.Serializable;
import java.util.List;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterFlipAnimationLegendQuantum9405 implements FrostHunterLintPhantomTurbo6249, Serializable {
    public final List FrostHunterCameraXPixelTurboCosmos9814;

    public FrostHunterFlipAnimationLegendQuantum9405(List list) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = list;
    }

    @Override // android.content.Context.FrostHunterLintPhantomTurbo6249
    public final boolean apply(Object obj) {
        int i = 0;
        while (true) {
            List list = this.FrostHunterCameraXPixelTurboCosmos9814;
            if (i >= list.size()) {
                return true;
            }
            if (!((FrostHunterLintPhantomTurbo6249) list.get(i)).apply(obj)) {
                return false;
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof FrostHunterFlipAnimationLegendQuantum9405) {
            return this.FrostHunterCameraXPixelTurboCosmos9814.equals(((FrostHunterFlipAnimationLegendQuantum9405) obj).FrostHunterCameraXPixelTurboCosmos9814);
        }
        return false;
    }

    public final int hashCode() {
        return this.FrostHunterCameraXPixelTurboCosmos9814.hashCode() + 306654252;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Predicates.and(");
        boolean z = true;
        for (Object obj : this.FrostHunterCameraXPixelTurboCosmos9814) {
            if (!z) {
                sb.append(',');
            }
            sb.append(obj);
            z = false;
        }
        sb.append(')');
        return sb.toString();
    }
}
