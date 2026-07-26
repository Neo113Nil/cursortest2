package android.content.Context;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterRoomDatabaseBetaAlpha4647 implements FrostHunterWithContextAlphaAuroraDelta1469 {
    public final float FrostHunterAlphaAnimationNeoCosmos5761;

    public FrostHunterRoomDatabaseBetaAlpha4647(float f) {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = f;
    }

    @Override // android.content.Context.FrostHunterWithContextAlphaAuroraDelta1469
    public final float FrostHunterAlphaAnimationNeoCosmos5761(float f) {
        return f / this.FrostHunterAlphaAnimationNeoCosmos5761;
    }

    @Override // android.content.Context.FrostHunterWithContextAlphaAuroraDelta1469
    public final float FrostHunterConstraintSetCloneMasterUltraRogue2633(float f) {
        return f * this.FrostHunterAlphaAnimationNeoCosmos5761;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FrostHunterRoomDatabaseBetaAlpha4647) && Float.compare(this.FrostHunterAlphaAnimationNeoCosmos5761, ((FrostHunterRoomDatabaseBetaAlpha4647) obj).FrostHunterAlphaAnimationNeoCosmos5761) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.FrostHunterAlphaAnimationNeoCosmos5761);
    }

    public final String toString() {
        return "LinearFontScaleConverter(fontScale=" + this.FrostHunterAlphaAnimationNeoCosmos5761 + ')';
    }
}
