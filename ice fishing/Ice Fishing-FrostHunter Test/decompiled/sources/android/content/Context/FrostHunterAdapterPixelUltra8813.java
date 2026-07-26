package android.content.Context;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterAdapterPixelUltra8813 {
    public final Object FrostHunterAlphaAnimationNeoCosmos5761;
    public final Object FrostHunterBundlePulseFusionHero2475;
    public final Object FrostHunterConstraintSetCloneMasterUltraRogue2633;

    public FrostHunterAdapterPixelUltra8813(Object obj, Object obj2, Object obj3) {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = obj;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = obj2;
        this.FrostHunterBundlePulseFusionHero2475 = obj3;
    }

    public final IllegalArgumentException FrostHunterAlphaAnimationNeoCosmos5761() {
        StringBuilder sb = new StringBuilder("Multiple entries with same key: ");
        Object obj = this.FrostHunterAlphaAnimationNeoCosmos5761;
        sb.append(obj);
        sb.append("=");
        sb.append(this.FrostHunterConstraintSetCloneMasterUltraRogue2633);
        sb.append(" and ");
        sb.append(obj);
        sb.append("=");
        sb.append(this.FrostHunterBundlePulseFusionHero2475);
        return new IllegalArgumentException(sb.toString());
    }
}
