package android.content.Context;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterMotionSceneSparkNebula4815 {
    public int FrostHunterAlphaAnimationNeoCosmos5761;
    public final int[] FrostHunterConstraintSetCloneMasterUltraRogue2633 = new int[10];

    public final int FrostHunterAlphaAnimationNeoCosmos5761() {
        if ((this.FrostHunterAlphaAnimationNeoCosmos5761 & 16) != 0) {
            return this.FrostHunterConstraintSetCloneMasterUltraRogue2633[4];
        }
        return 65535;
    }

    public final void FrostHunterConstraintSetCloneMasterUltraRogue2633(int i, int i2) {
        if (i >= 0) {
            int[] iArr = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
            if (i >= iArr.length) {
                return;
            }
            this.FrostHunterAlphaAnimationNeoCosmos5761 = (1 << i) | this.FrostHunterAlphaAnimationNeoCosmos5761;
            iArr[i] = i2;
        }
    }
}
