package android.content.Context;

import android.graphics.Point;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterOnItemClickListenerTitaniumSpectraStorm7629 {
    public final int FrostHunterAlphaAnimationNeoCosmos5761;
    public final Point FrostHunterBundlePulseFusionHero2475;
    public final int FrostHunterConstraintSetCloneMasterUltraRogue2633;

    public FrostHunterOnItemClickListenerTitaniumSpectraStorm7629(int i, int i2, Point point) {
        int i3 = point.x;
        int i4 = point.y;
        this.FrostHunterAlphaAnimationNeoCosmos5761 = i;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = i2;
        this.FrostHunterBundlePulseFusionHero2475 = new Point(i3, i4);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof FrostHunterOnItemClickListenerTitaniumSpectraStorm7629) {
            FrostHunterOnItemClickListenerTitaniumSpectraStorm7629 frostHunterOnItemClickListenerTitaniumSpectraStorm7629 = (FrostHunterOnItemClickListenerTitaniumSpectraStorm7629) obj;
            if (this.FrostHunterAlphaAnimationNeoCosmos5761 == frostHunterOnItemClickListenerTitaniumSpectraStorm7629.FrostHunterAlphaAnimationNeoCosmos5761 && this.FrostHunterConstraintSetCloneMasterUltraRogue2633 == frostHunterOnItemClickListenerTitaniumSpectraStorm7629.FrostHunterConstraintSetCloneMasterUltraRogue2633 && this.FrostHunterBundlePulseFusionHero2475.equals(frostHunterOnItemClickListenerTitaniumSpectraStorm7629.FrostHunterBundlePulseFusionHero2475)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.FrostHunterBundlePulseFusionHero2475.hashCode() + (((this.FrostHunterAlphaAnimationNeoCosmos5761 * 31) + this.FrostHunterConstraintSetCloneMasterUltraRogue2633) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RoundedCornerCompat{position=");
        int i = this.FrostHunterAlphaAnimationNeoCosmos5761;
        sb.append(i != 0 ? i != 1 ? i != 2 ? i != 3 ? "Invalid" : "BottomLeft" : "BottomRight" : "TopRight" : "TopLeft");
        sb.append(", radius=");
        sb.append(this.FrostHunterConstraintSetCloneMasterUltraRogue2633);
        sb.append(", center=");
        sb.append(this.FrostHunterBundlePulseFusionHero2475);
        sb.append('}');
        return sb.toString();
    }
}
