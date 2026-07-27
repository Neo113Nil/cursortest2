package android.content.Context;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterGyroscopeGammaEclipseForce6837 implements Comparable {
    public final float FrostHunterCameraXPixelTurboCosmos9814;

    public static final boolean FrostHunterAlphaAnimationNeoCosmos5761(float f, float f2) {
        return Float.compare(f, f2) == 0;
    }

    public static String FrostHunterConstraintSetCloneMasterUltraRogue2633(float f) {
        if (Float.isNaN(f)) {
            return "Dp.Unspecified";
        }
        return f + ".dp";
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Float.compare(this.FrostHunterCameraXPixelTurboCosmos9814, ((FrostHunterGyroscopeGammaEclipseForce6837) obj).FrostHunterCameraXPixelTurboCosmos9814);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof FrostHunterGyroscopeGammaEclipseForce6837) {
            return Float.compare(this.FrostHunterCameraXPixelTurboCosmos9814, ((FrostHunterGyroscopeGammaEclipseForce6837) obj).FrostHunterCameraXPixelTurboCosmos9814) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.FrostHunterCameraXPixelTurboCosmos9814);
    }

    public final String toString() {
        return FrostHunterConstraintSetCloneMasterUltraRogue2633(this.FrostHunterCameraXPixelTurboCosmos9814);
    }
}
